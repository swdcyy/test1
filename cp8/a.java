package cp8.a;
import java.lang.Runnable;
import cp8.c;
import java.lang.String;
import java.util.HashMap;
import tx4.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import cp8.a$a;
import iq8.x;
import java.io.InputStream;
import java.io.BufferedInputStream;
import cp8.a$b;
import cp8.a$d;
import java.io.IOException;
import cp8.a$c;
import java.net.MalformedURLException;

public class a implements Runnable	// class@001fe7
{
    public final String b;
    public final int c;
    public final HashMap d;
    public final i e;
    public final c f;

    public void a(c p0,String p1,int p2,HashMap p3,i p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void run(){
       HttpURLConnection httpURLConne;
       IOException iOException;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "1")) {
          return;
       }
       try{
          httpURLConne = new URL(this.b).openConnection();
          try{
             httpURLConne.setRequestMethod("GET");
             httpURLConne.setConnectTimeout(this.c);
             httpURLConne.setReadTimeout(8000);
             httpURLConne.setRequestProperty("Content-Type", "application/json");
             this.f.k(httpURLConne, this.d);
             if (httpURLConne.getResponseCode() != 200) {
                httpURLConne.getResponseCode();
                if (this.e != null) {
                   x.f(new a$a(this));
                   httpURLConne.disconnect();
                   return;
                }else {
                label_0051 :
                   InputStream inputStream = httpURLConne.getInputStream();
                   BufferedInputStream uBufferedInp = new BufferedInputStream(inputStream);
                   uBufferedInp.close();
                   inputStream.close();
                   x.f(new a$b(this, this.f.l(uBufferedInp)));
                }
             }else {
                goto label_0051 ;
             }
             httpURLConne.disconnect();
          label_0098 :
             return;
          }catch(java.net.MalformedURLException e1){
          }catch(java.io.IOException e1){
          }
          x.f(new a$d(this, iOException));
          if (httpURLConne != null) {
             goto label_0095 ;
          }else {
             goto label_0098 ;
          }
       }catch(java.net.MalformedURLException e0){
          MalformedURLException malformedURL = e0;
          httpURLConne = objArray;
       }catch(java.io.IOException e0){
          iOException = e0;
          httpURLConne = objArray;
          goto label_007c ;
       }
    }
}
