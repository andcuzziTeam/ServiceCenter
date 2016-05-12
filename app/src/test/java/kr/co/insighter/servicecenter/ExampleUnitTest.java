package kr.co.insighter.servicecenter;

import com.andcuzzi.service.RequestBody;
import com.andcuzzi.service.RequestHeader;
import com.andcuzzi.service.RequestMethod;
import com.andcuzzi.service.ResRequest;
import com.andcuzzi.service.ResponseBody;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {


    @Test
    public void setandgetResRequest() {

        //setter를 활용한 Header 세팅
        RequestHeader header = new RequestHeader();
        header.setHost("this");
        header.setMethod(RequestMethod.GET);
        header.setUri("/activity/subActivity");

        assertEquals("this", header.getHost());
        assertEquals(RequestMethod.GET,header.getMethod());
        assertEquals("/activity/subActivity",header.getUri());

        //생성자를 활용한 Header 세팅
        RequestHeader newHeader = new RequestHeader("this","/notification/this",RequestMethod.PUT);


        //Header를 Request에 세팅
        ResRequest request = new ResRequest();
        request.setHeader(header);

        assertEquals("this", request.getHeader().getHost());
        assertEquals("/activity/subActivity", request.getHeader().getUri());
        assertEquals(RequestMethod.GET, request.getHeader().getMethod());

        //newHeader를 newRequest에 세팅
        ResRequest newRequest = new ResRequest();
        newRequest.setHeader(newHeader);

        assertEquals("this", newRequest.getHeader().getHost());
        assertEquals("/notification/this", newRequest.getHeader().getUri());
        assertEquals(RequestMethod.PUT, newRequest.getHeader().getMethod());


        //Body 세팅 -- JSONObject 오류 --> string으로 바꿈
        //Request Body set and get
        RequestBody reqbody = new RequestBody();
        reqbody.setContext("{\"name\" : \"this is name\" }");
        assertEquals("{\"name\" : \"this is name\" }",reqbody.getContext());

        //Response Body set and get
        ResponseBody repbody = new ResponseBody();
        repbody.setContext("{\"result\":\"this is result\"}");
        assertEquals("{\"result\":\"this is result\"}",repbody.getContext());


    }
}