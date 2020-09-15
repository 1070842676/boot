package com.example.util.httputil;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;

public class HttpUtils {

    /**
     * https get请求
     * @param url
     * @return
     */
    public static String httpsGet(String url){
        String str_return = "";
        HttpsURLConnection conn = null;
        try {
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, new TrustManager[] { new TrustAnyTrustManager() },
                    new java.security.SecureRandom());
            URL console = new URL(url);
            conn = (HttpsURLConnection) console.openConnection();
            conn.setSSLSocketFactory(sc.getSocketFactory());
            conn.setHostnameVerifier((String arg0, SSLSession arg1)->{return  true;});
            conn.connect();
            InputStream is = conn.getInputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(is,
                    ("ISO-8859-1")));
            String ret = "";
            while (ret != null) {
                ret = br.readLine();
                if (ret != null && !ret.trim().equals("")) {
                    str_return = str_return
                            + new String(ret.getBytes("ISO-8859-1"), "utf-8");
                }
            }
        } catch (ConnectException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.disconnect();
        }
        return str_return;
    }
    /**
     * https Post请求
     * @param url
     * @return
     */
    public static String httpsPost(String url,Map parameters){
        String str_return = "";
        HttpsURLConnection conn = null;
        try {
            StringBuffer params = new StringBuffer();
            for (Iterator iter = parameters.entrySet().iterator(); iter.hasNext();){
                Entry element = (Entry) iter.next();
                params.append(element.getKey().toString());
                params.append("=");
                params.append(URLEncoder.encode(element.getValue().toString(),"utf-8"));
                params.append("&");
            }

            if (params.length() > 0) {
                params = params.deleteCharAt(params.length() - 1);
            }

            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, new TrustManager[] { new TrustAnyTrustManager() },
                    new java.security.SecureRandom());
            URL console = new URL(url);

            conn = (HttpsURLConnection) console.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");//设定 请求格式 json，也可以设定xml格式的
            conn.setRequestProperty("Accept", "application/json");  //设置编码语言
            conn.setRequestProperty("X-Auth-Token", "token");  //设置请求的token
            conn.setRequestProperty("Connection", "keep-alive");  //设置连接的状态
            conn.setSSLSocketFactory(sc.getSocketFactory());
            conn.setHostnameVerifier((String arg0, SSLSession arg1)->{return  true;});
            conn.setDoOutput(true);
            byte[] b = params.toString().getBytes();
            conn.getOutputStream().write(b, 0, b.length);
            conn.getOutputStream().flush();
            conn.getOutputStream().close();

            conn.connect();
            InputStream is = conn.getInputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(is,
                    ("ISO-8859-1")));
            String ret = "";
            while (ret != null) {
                ret = br.readLine();
                if (ret != null && !ret.trim().equals("")) {
                    str_return = str_return
                            + new String(ret.getBytes("ISO-8859-1"), "utf-8");
                }
            }
        } catch (ConnectException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } finally {
            conn.disconnect();
        }
        return str_return;
    }



    public static String doPostJson(String url, String json) {
        // 创建Httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String resultString = "";
        try {
            // 创建Http Post请求
            HttpPost httpPost = new HttpPost(url);
            // 创建请求内容
            StringEntity entity = new StringEntity(json, ContentType.APPLICATION_JSON);
            httpPost.setEntity(entity);
            // 执行http请求
            response = httpClient.execute(httpPost);
            resultString = EntityUtils.toString(response.getEntity(), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return resultString;
    }
}