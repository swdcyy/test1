package cp8.b;
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
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import cp8.b$a;
import iq8.x;
import java.io.InputStream;
import java.io.BufferedInputStream;
import cp8.b$b;
import cp8.b$d;
import java.io.IOException;
import cp8.b$c;
import java.net.MalformedURLException;

public class b implements Runnable	// class@001fec
{
    public final String b;
    public final int c;
    public final HashMap d;
    public final i e;
    public final c f;

    public void b(c p0,String p1,int p2,HashMap p3,i p4){
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
       if (PatchProxy.applyVoid(objArray, this, b.class, "1")) {
          return;
       }
       try{
          httpURLConne = new URL(this.b).openConnection();
          try{
             httpURLConne.setRequestMethod("POST");
             httpURLConne.setConnectTimeout(this.c);
             httpURLConne.setReadTimeout(8000);
             this.f.k(httpURLConne, this.d);
             httpURLConne.setDoInput(true);
             httpURLConne.setDoInput(true);
             OutputStream outputStream = httpURLConne.getOutputStream();
             BufferedOutputStream uBufferedOut = new BufferedOutputStream(outputStream);
             uBufferedOut.write(("").getBytes());
             uBufferedOut.flush();
             uBufferedOut.close();
             outputStream.close();
             if (httpURLConne.getResponseCode() != 200) {
                httpURLConne.getResponseCode();
                if (this.e != null) {
                   x.f(new b$a(this));
                   httpURLConne.disconnect();
                   return;
                }else {
                label_006c :
                   InputStream inputStream = httpURLConne.getInputStream();
                   BufferedInputStream uBufferedInp = new BufferedInputStream(inputStream);
                   uBufferedInp.close();
                   inputStream.close();
                   x.f(new b$b(this, this.f.l(uBufferedInp)));
                }
             }else {
                goto label_006c ;
             }
             httpURLConne.disconnect();
          label_00b3 :
             return;
          }catch(java.net.MalformedURLException e1){
          }catch(java.io.IOException e1){
          }
          x.f(new b$d(this, iOException));
          if (httpURLConne != null) {
             goto label_00b0 ;
          }else {
             goto label_00b3 ;
          }
       }catch(java.net.MalformedURLException e0){
          MalformedURLException malformedURL = e0;
          httpURLConne = objArray;
       }catch(java.io.IOException e0){
          iOException = e0;
          httpURLConne = objArray;
          goto label_0097 ;
       }
    }
}
