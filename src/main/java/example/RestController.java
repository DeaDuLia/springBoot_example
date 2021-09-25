package example;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    public static class RestResponse {
        private String param1;
        private String param2;
        public String getParam1() {
            return param1;
        }
        public void setParam1(String param1) {
            this.param1 = param1;
        }
        public String getParam2() {
            return param2;
        }
        public void setParam2(String param2) {
            this.param2 = param2;
        }
    }
    @RequestMapping(value = "/get", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse restMethod_GET(String param1, String param2) {
        RestResponse result = new RestResponse();
        result.setParam1(param1);
        result.setParam2(param2);
        return result;
    }
    @RequestMapping(value = "/post", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse restMethod_POST(@RequestParam(value = "param1") String param1, @RequestParam(value = "param2") String param2) {
        RestResponse result = new RestResponse();
        result.setParam1(param1);
        result.setParam1(param1);
        return result;
    }

}
