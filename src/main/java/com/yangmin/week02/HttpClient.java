package com.yangmin.week02;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpClient {


    public static void main(String[] args) {

        try(CloseableHttpClient defaultHttp = HttpClients.createDefault()){

            HttpGet get = new HttpGet("http://localhost:8801");

            try (final CloseableHttpResponse response = defaultHttp.execute(get)){
                final HttpEntity entity = response.getEntity();
                final int available = entity.getContent().available();

                byte[] bytes = new byte[available];

                entity.getContent().read(bytes,0,bytes.length);

                System.out.println(new String(bytes));

                EntityUtils.consume(entity);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
