package ekd.w0;
import android.net.Uri;
import java.lang.String;
import java.lang.RuntimeException;
import java.util.Set;
import java.io.File;

public class w0	// class@001570
{

    public static String a(Uri p0,String p1){
       int i = 0;
       try{
          return p0.getQueryParameter(p1);
       }catch(java.lang.NullPointerException e1){
          w0.e(e1);
          throw i;
       }catch(java.lang.UnsupportedOperationException e1){
          w0.e(e1);
          throw i;
       }
    }
    public static Set b(Uri p0){
       try{
          return p0.getQueryParameterNames();
       }catch(java.lang.UnsupportedOperationException e0){
          w0.e(e0);
          throw null;
       }
    }
    public static Uri c(File p0){
       try{
          return Uri.fromFile(p0);
       }catch(java.lang.NullPointerException e0){
          w0.e(e0);
          throw null;
       }
    }
    public static Uri d(String p0,String p1,String p2){
       p2 = null;
       try{
          return Uri.fromParts(p0, p1, p2);
       }catch(java.lang.NullPointerException e0){
          w0.e(e0);
          throw p2;
       }
    }
    public static void e(RuntimeException p0){
       throw p0;
    }
    public static Uri f(String p0){
       try{
          return Uri.parse(p0);
       }catch(java.lang.NullPointerException e0){
          w0.e(e0);
          throw null;
       }
    }
}
