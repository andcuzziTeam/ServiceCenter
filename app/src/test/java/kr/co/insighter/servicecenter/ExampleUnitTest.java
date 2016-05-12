package kr.co.insighter.servicecenter;

import com.andcuzzi.service.RequestHeader;
import com.andcuzzi.service.RequestMethod;
import com.andcuzzi.service.ResRequest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {


    @Test
    public void setandgetResRequest() {

        //Header 세팅
        RequestHeader header = new RequestHeader();
        header.setHost("this");
        header.setMethod(RequestMethod.GET);
        header.setUri("/activity/subActivity");

        assertEquals("this", header.getHost());
        assertEquals(RequestMethod.GET,header.getMethod());
        assertEquals("/activity/subActivity",header.getUri());

        //Header를 Request에 세팅
        ResRequest request = new ResRequest();
        request.setHeader(header);

        assertEquals("this", request.getHeader().getHost());
        assertEquals("/activity/subActivity", request.getHeader().getUri());
        assertEquals(RequestMethod.GET, request.getHeader().getMethod());

        //Body 세팅 -- JSONObject 오류


    }
}