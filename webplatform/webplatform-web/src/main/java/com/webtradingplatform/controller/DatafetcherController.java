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
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//
//
///**
//* Created by Tomasz Mr Phi Waszczyk on 2014-08-27.
//*/
//
//@Controller
//
//public class DatafetcherController {
//
//    private int counter;
//    DefaultHttpClient httpClient = new DefaultHttpClient();
//    @AutowiredLogger
//    private Logger logger;
//
//    @RequestMapping("/datafetcher")
//    public ModelAndView getCandlesData(){
//
//        ModelAndView data = new ModelAndView();
//
//        while(counter < 1){
//
//            HttpUriRequest httpGet = new HttpGet("https://api-fxpractice.oanda.com/v1/candles?instrument=EUR_USD&count=10&candleFormat=midpoint&granularity=M15");
//            httpGet.setHeader(new BasicHeader("Authorization", "Bearer 861521481e615b0c0af6e2163eb011c5-0844fb72267293a47c3031d50ca527ac"));
//            logger.info("Initialization", httpGet.getRequestLine());
//
//            try {
//                HttpResponse resp = httpClient.execute(httpGet);
//                HttpEntity entity = resp.getEntity();
//
//                if(resp.getStatusLine().getStatusCode() == 200 && entity != null){
//
//                    InputStream stream = entity.getContent();
//                    String line;
//                    BufferedReader br = new BufferedReader(new InputStreamReader(stream));
//                    logger.info("CONNECTED ! ! ! ! ! ! ");
//                    while((line = br.readLine()) != null){
//
//                        logger.info(line);
//                    }
//
//
//
//
//
//                }else{
//                    String responseString = EntityUtils.toString(entity, "UTF-8");
//                    logger.info(responseString);
//
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }finally {
//                httpClient.getConnectionManager().shutdown();
//                counter++;
//            }
//        }
//
//
//
//        data.addObject(counter);
//
//
//        return data;
//    }
//}
