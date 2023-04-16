package com.airbnb.lottie.network.b;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import com.airbnb.lottie.network.a;
import w4.m;
import java.util.Objects;
import java.io.File;
import com.airbnb.lottie.network.FileExtension;
import java.io.FileInputStream;
import w4.d;
import z1.e;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import com.airbnb.lottie.a;
import w4.e;
import java.lang.Throwable;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.IllegalArgumentException;

public class b	// class@000dda
{
    public final Context a;
    public final String b;
    public final a c;

    public void b(Context p0,String p1){
       super();
       p0 = p0.getApplicationContext();
       this.a = p0;
       this.b = p1;
       this.c = new a(p0, p1);
    }
    public static m b(Context p0,String p1){
       int i;
       e uoe;
       m om;
       b uob = new b(p0, p1);
       b c = uob.c;
       Objects.requireNonNull(c);
       try{
          i = 0;
          a a = c.a;
          a b = c.b;
          FileExtension jSON = FileExtension.JSON;
          File uFile = new File(a.getCacheDir(), a.a(b, jSON, false));
          if (!uFile.exists()) {
             uFile = new File(a.getCacheDir(), a.a(b, FileExtension.ZIP, false));
             if (!uFile.exists()) {
                uFile = i;
             }
          }
          if (uFile == null) {
             uoe = i;
          }else {
             FileInputStream uFileInputSt = new FileInputStream(uFile);
             if ((uFile.getAbsolutePath()).endsWith(".zip")) {
                jSON = FileExtension.ZIP;
             }
             uFile.getAbsolutePath();
             uoe = new e(jSON, uFileInputSt);
          }
       }catch(java.io.FileNotFoundException e0){
       }
       if (uoe != null) {
          uoe = uoe.b;
          om = (uoe.a == FileExtension.ZIP)? a.k(new ZipInputStream(uoe), e0.b): a.e(uoe, e0.b);
          if (om.b() != null) {
             i = om.b();
          }
       }
       if (i != null) {
          om = new m(i);
       }else {
          boolean a1 = d.a;
          try{
             om = e0.a();
          }catch(java.io.IOException e7){
             om = new m(e7);
          }
       }
    }
    public final m a(){
       FileExtension jSON;
       m om;
       HttpURLConnection httpURLConne = new URL(this.b).openConnection();
       httpURLConne.setRequestMethod("GET");
       httpURLConne.connect();
       if (httpURLConne.getErrorStream() != null || httpURLConne.getResponseCode() != 200) {
          BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(httpURLConne.getErrorStream()));
          StringBuilder str = "";
          String str1 = uBufferedRea.readLine();
          while (str1 != null) {
             str = str+str1+10;
          }
          return new m(new IllegalArgumentException("Unable to fetch "+this.b+". Failed with "+httpURLConne.getResponseCode()+"\n"+str));
       }else {
          String contentType = httpURLConne.getContentType();
          b uob = -1;
          int i = contentType.hashCode();
          if (i != -1248325150) {
             if (i == -43840953 && contentType.equals("application/json")) {
                uob = 1;
             }
          }else if(contentType.equals("application/zip")){
             uob = null;
          }
          if (uob) {
             jSON = FileExtension.JSON;
             om = a.e(new FileInputStream(new File(this.c.b(httpURLConne.getInputStream(), jSON).getAbsolutePath())), this.b);
          }else {
             jSON = FileExtension.ZIP;
             om = a.k(new ZipInputStream(new FileInputStream(this.c.b(httpURLConne.getInputStream(), jSON))), this.b);
          }
          if (om.b() != null) {
             uob = this.c;
             File uFile = new File(uob.a.getCacheDir(), a.a(uob.b, jSON, true));
             File uFile1 = new File((uFile.getAbsolutePath()).replace(".temp", ""));
             uFile1.toString();
             if (!uFile.renameTo(uFile1)) {
                d.c("Unable to rename cache file "+uFile.getAbsolutePath()+" to "+uFile1.getAbsolutePath()+".");
             }
          }
          return om;
       }
    }
}
