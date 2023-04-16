package com.airbnb.lottie.ex.network.b;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import com.airbnb.lottie.ex.network.a;
import a5.k;
import a5.d;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.io.InputStream;
import com.airbnb.lottie.ex.network.FileExtension;
import java.io.File;
import java.io.FileInputStream;
import com.airbnb.lottie.ex.a;
import java.util.zip.ZipInputStream;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;

public class b	// class@000dc0
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
    public final k a(){
       FileExtension jSON;
       k ok;
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
          return new k(new IllegalArgumentException("Unable to fetch "+this.b+". Failed with "+httpURLConne.getResponseCode()+"\n"+str));
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
             ok = a.b(new FileInputStream(new File(this.c.b(httpURLConne.getInputStream(), jSON).getAbsolutePath())), this.b);
          }else {
             jSON = FileExtension.ZIP;
             ok = a.e(new ZipInputStream(new FileInputStream(this.c.b(httpURLConne.getInputStream(), jSON))), this.b);
          }
          if (ok.b() != null) {
             uob = this.c;
             File uFile = new File(uob.a.getCacheDir(), a.a(uob.b, jSON, true));
             File uFile1 = new File((uFile.getAbsolutePath()).replace(".temp", ""));
             uFile1.toString();
             if (!uFile.renameTo(uFile1)) {
                d.c("Unable to rename cache file "+uFile.getAbsolutePath()+" to "+uFile1.getAbsolutePath()+".");
             }
          }
          return ok;
       }
    }
}
