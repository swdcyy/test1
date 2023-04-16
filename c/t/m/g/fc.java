package c.t.m.g.fc;
import java.lang.Object;
import java.lang.String;
import java.net.URL;
import java.net.URLConnection;
import c.t.m.g.fk;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import c.t.m.g.ex;
import java.lang.Throwable;
import java.net.HttpURLConnection;
import java.lang.StringBuilder;
import java.io.OutputStream;

public class fc	// class@000c89
{
    public static final String a = "fc";

    public void fc(){
       super();
    }
    public static byte[] a(String p0){
       try{
          URLConnection uRLConnectio = new URL(p0).openConnection();
          uRLConnectio.setConnectTimeout(fk.c);
          uRLConnectio.setReadTimeout(fk.c);
          uRLConnectio.connect();
          ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
          byte[] uobyteArray = new byte[1024];
          int i = uRLConnectio.getInputStream().read(uobyteArray);
          while (i != -1) {
             uByteArrayOu.write(uobyteArray, 0, i);
          }
          uByteArrayOu.close();
          return uByteArrayOu.toByteArray();
       }catch(java.lang.Exception e4){
          if (ex.a) {
             ex.a(fc.a, e4);
          }
          return null;
       }
    }
    public static byte[] a(String p0,byte[] p1){
       HttpURLConnection httpURLConne;
       byte[] uobyteArray = null;
       try{
          httpURLConne = new URL(p0).openConnection();
          try{
             httpURLConne.setConnectTimeout(fk.c);
             httpURLConne.setReadTimeout(fk.c);
             if (ex.a) {
                ex.a(fc.a, "time out :"+fk.c);
             }
             httpURLConne.setDoInput(true);
             httpURLConne.setDoOutput(true);
             httpURLConne.setRequestMethod("POST");
             boolean b = false;
             httpURLConne.setUseCaches(b);
             httpURLConne.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
             httpURLConne.setRequestProperty("Content-Length", String.valueOf(p1.length));
             OutputStream outputStream = httpURLConne.getOutputStream();
             outputStream.write(p1);
             outputStream.close();
             if (httpURLConne.getResponseCode() == 200) {
                InputStream inputStream = httpURLConne.getInputStream();
                ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
                byte[] uobyteArray1 = new byte[128];
                int i = inputStream.read(uobyteArray1);
                while (i != -1) {
                   uByteArrayOu.write(uobyteArray1, b, i);
                }
                uByteArrayOu.close();
                inputStream.close();
                httpURLConne.disconnect();
                return uByteArrayOu.toByteArray();
             }else {
                httpURLConne.disconnect();
                fk.c = 0x4e20;
                return uobyteArray;
             }
          }catch(java.io.IOException e8){
          }
          fk.c = 0x4e20;
          if (ex.a) {
             ex.a(fc.a, e8);
          }
          if (httpURLConne) {
             httpURLConne.disconnect();
          }
          return uobyteArray;
       }catch(java.io.IOException e8){
          httpURLConne = uobyteArray;
          goto label_0099 ;
       }
    }
}
