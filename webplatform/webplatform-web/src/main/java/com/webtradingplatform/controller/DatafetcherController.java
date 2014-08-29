//package com.webtradingplatform.controller;
//
//import com.webtradingplatform.util.log.AutowiredLogger;
//import org.apache.http.HttpEntity;
//import org.apache.http.HttpResponse;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.client.methods.HttpUriRequest;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.apache.http.message.BasicHeader;
//import org.apache.http.util.EntityUtils;
//import org.slf4j.Logger;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//
///**
// * Created by Tomasz Mr Phi Waszczyk on 2014-08-27.
// */
////TODO przeniesc odpowiedzialnosc do serwisu oraz refactoring kodu.
//@Controller
//public class DatafetcherController {
//
//    @AutowiredLogger
//    private Logger logger;
//
//    @Value("${datafetcher.url}")
//    private String url;
//
//    @Value("${datafetcher.authHeader}")
//    private String authHeader;
//
//    private int counter;
//
//    private DefaultHttpClient httpClient = new DefaultHttpClient();
//
//    @RequestMapping("/datafetcher")
//    public ModelAndView getCandlesData(ModelAndView data) {
//
//        while(counter < 1){
//
//            HttpUriRequest httpGet = new HttpGet(url);
//            httpGet.setHeader(new BasicHeader("Authorization", authHeader));
//            logger.info("Initialization", httpGet.getRequestLine());
//
//            try {
//                HttpResponse resp = httpClient.execute(httpGet);
//                HttpEntity entity = resp.getEntity();
//
//                if(resp.getStatusLine().getStatusCode() == 200 && entity != null){
//                    InputStream stream = entity.getContent();
//                    String line;
//                    BufferedReader br = new BufferedReader(new InputStreamReader(stream));
//                    logger.info("CONNECTED!");
//                    while((line = br.readLine()) != null){
//                        logger.info(line);
//                    }
//                }else{
//                    String responseString = EntityUtils.toString(entity, "UTF-8");
//                    logger.info(responseString);
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }finally {
//                httpClient.getConnectionManager().shutdown();
//                counter++;
//            }
//        }
//
//        data.addObject(counter);
//        return data;
//    }
//}
