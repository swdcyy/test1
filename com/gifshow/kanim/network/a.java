package com.gifshow.kanim.network.a;
import com.gifshow.kanim.network.c;
import java.net.HttpURLConnection;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.Reader;
import java.lang.StringBuilder;
import java.lang.Boolean;
import java.net.URL;
import java.lang.Throwable;
import ih.b;
import java.io.IOException;

public class a implements c	// class@0015be
{
    public final HttpURLConnection b;

    public void a(HttpURLConnection p0){
       super();
       this.b = p0;
    }
    public final String a(HttpURLConnection p0){
       BufferedReader obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new BufferedReader(new InputStreamReader(p0.getErrorStream()));
       StringBuilder str = "";
       try{
          String str1 = obj.readLine();
          while (str1 != null) {
             str = str+str1+10;
          }
          try{
             obj.close();
             return str;
          }catch(java.lang.Exception e0){
          }
       }catch(java.lang.Exception e3){
          throw e3;
       }
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       this.b.disconnect();
       return;
    }
    public boolean isSuccessful(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          if ((this.b.getResponseCode() / 100) == 2) {
             b = true;
          }
          return e0;
       }catch(java.io.IOException e0){
       }
    }
    public String s1(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getContentType();
    }
    public InputStream v1(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getInputStream();
    }
    public String w(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (!this.isSuccessful()) {
             objArray = "Unable to fetch "+this.b.getURL()+". Failed with "+this.b.getResponseCode()+"\n"+this.a(this.b);
          }
          return objArray;
       }catch(java.io.IOException e0){
          b.d("get error failed ", e0);
          return e0.getMessage();
       }
    }
}
