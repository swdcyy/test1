package com.sina.weibo.sdk.net.b;
import com.sina.weibo.sdk.net.a;
import java.lang.Object;
import java.io.OutputStream;
import com.sina.weibo.sdk.net.d;
import android.os.Bundle;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.Iterator;
import java.lang.String;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import com.sina.weibo.sdk.net.f;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import android.net.Uri$Builder;
import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;
import com.sina.weibo.sdk.net.g;
import java.lang.Throwable;
import java.lang.Exception;

public final class b implements a	// class@000bc0
{

    public void b(){
       super();
    }
    public static void a(OutputStream p0,d p1){
       Bundle uBundle = p1.d();
       StringBuilder str = "";
       Iterator iterator = uBundle.keySet().iterator();
       int i = 1;
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          if (i) {
             i = 0;
          }else {
             str = str+"&";
          }
          String str2 = String.valueOf(uBundle.get(str1));
          try{
             str = str+URLEncoder.encode(str1, "UTF-8")+"="+URLEncoder.encode(str2, "UTF-8");
          }catch(java.io.UnsupportedEncodingException e3){
             e3.printStackTrace();
             goto label_0012 ;
          }
       }
       try{
          DataOutputStream uDataOutputS = new DataOutputStream(p0);
          uDataOutputS.write((str).getBytes("UTF-8"));
          uDataOutputS.close();
          return;
       }catch(java.io.IOException e6){
          e6.printStackTrace();
          return;
       }
    }
    public static void a(HttpURLConnection p0,Bundle p1){
       Iterator iterator = p1.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          p0.addRequestProperty(str, String.valueOf(p1.get(str)));
       }
       return;
    }
    public final f a(d p0){
       String url = p0.getUrl();
       Bundle params = p0.getParams();
       if (params != null && (params.size() && !TextUtils.isEmpty(url))) {
          Uri uri = Uri.parse(url);
          if (!params.isEmpty()) {
             Uri$Builder uBuilder = uri.buildUpon();
             Iterator iterator = params.keySet().iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                uBuilder.appendQueryParameter(str, String.valueOf(params.get(str)));
             }
             uri = uBuilder.build();
          }
          if (uri != null) {
             url = uri.toString();
          }
       }
    label_004f :
       HttpURLConnection httpURLConne = new URL(url).openConnection();
       try{
          httpURLConne.setRequestMethod("POST");
          httpURLConne.setRequestProperty("Connection", "Keep-Alive");
          httpURLConne.setRequestProperty("Charset", "UTF-8");
          params = new Bundle();
          params.putString("Content-Type", "application/x-www-form-urlencoded");
          b.a(httpURLConne, params);
          httpURLConne.setDoInput(true);
          httpURLConne.setDoOutput(true);
          httpURLConne.setUseCaches(false);
          httpURLConne.setReadTimeout(p0.getReadTimeout());
          httpURLConne.setConnectTimeout(p0.getConnectTimeout());
          httpURLConne.connect();
          b.a(httpURLConne.getOutputStream(), p0);
          int responseCode = httpURLConne.getResponseCode();
          InputStream inputStream = (responseCode == 200)? httpURLConne.getInputStream(): httpURLConne.getErrorStream();
          httpURLConne.disconnect();
          return new g(responseCode, inputStream);
       }catch(java.lang.Exception e7){
          throw new Throwable(e7.getMessage());
       }
    }
}
