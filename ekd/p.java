package ekd.p;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.zip.ZipFile;

public class p	// class@001564
{

    public static void a(URLConnection p0){
       if (p0 instanceof HttpURLConnection) {
          p0.disconnect();
       }
       return;
    }
    public static void b(Closeable p0){
       try{
          if (p0 != null) {
             p0.close();
          }
          return;
       }catch(java.io.IOException e0){
       }
    }
    public static void c(InputStream p0){
       p.b(p0);
    }
    public static void d(OutputStream p0){
       p.b(p0);
    }
    public static void e(Reader p0){
       p.b(p0);
    }
    public static void f(Writer p0){
       p.b(p0);
    }
    public static void g(ZipFile p0){
       if (p0 == null) {
          return;
       }
       try{
          p0.close();
          return;
       }catch(java.io.IOException e0){
       }
    }
}
