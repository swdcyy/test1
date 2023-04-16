package com.kwai.plugin.dva.install.remote.download.a;
import com.kwai.plugin.dva.install.remote.download.c;
import java.lang.Object;
import java.lang.String;
import com.kwai.plugin.dva.install.remote.download.c$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.io.File;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.Exception;
import com.kwai.plugin.dva.util.a;

public class a implements c	// class@001371
{

    public void a(){
       super();
    }
    public void c(String p0,int p1,String p2,String p3,String p4,c$a p5){
       object oobject = p2;
       object oobject1 = p3;
       object oobject2 = p4;
       object oobject3 = p5;
       a uoa = a.class;
       int i = 2;
       int i1 = 1;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),oobject,oobject1,oobject2,oobject3};
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }else {
          int i2 = this;
       }
       HttpURLConnection httpURLConne = new URL(oobject).openConnection();
       int responseCode = httpURLConne.getResponseCode();
       if (responseCode >= 200 && responseCode < 300) {
          long l = (long)httpURLConne.getContentLength();
          File uFile = new File(oobject1);
          if (!uFile.getParentFile().exists()) {
             uFile.getParentFile().mkdirs();
          }
          InputStream inputStream = httpURLConne.getInputStream();
          FileOutputStream uFileOutputS = new FileOutputStream(uFile);
          byte[] uobyteArray = new byte[4096];
          long l1 = 0;
          i = inputStream.read(uobyteArray);
          while (i != -1) {
             uFileOutputS.write(uobyteArray, 0, i);
             l1 = l1 + (long)i;
             if (l > 0 && oobject3 != null) {
                long l2 = 100 * l1;
                l2 = l2 / l;
                oobject3.onProgress((int)l2);
             }
             i1 = 1;
          }
          try{
             inputStream.close();
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
          try{
             uFileOutputS.flush();
             uFileOutputS.close();
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
          if (oobject2 != null) {
             String str = a.h(uFile);
             if (!oobject2.equals(str)) {
                Object[] objArray1 = new Object[]{oobject,oobject2,str};
                throw new Exception(String.format("Download %s, except md5 %s, but %s", objArray1));
             }
          }
          try{
             httpURLConne.disconnect();
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
          return;
       }else {
          Object[] objArray2 = new Object[]{Integer.valueOf(responseCode),httpURLConne.getResponseMessage()};
          throw new Exception(String.format("%d: %s", objArray2));
       }
    }
    public void d(String p0,int p1,String p2,String p3,String p4,c$a p5){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
             return;
          }
       }
       this.c(p0, p1, p2, p3, p4, p5);
       return;
    }
}
