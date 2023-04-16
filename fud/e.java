package fud.e;
import java.lang.String;
import iud.a;
import java.nio.charset.Charset;

public class e	// class@001693
{

    public static byte[] a(String p0){
       Charset f = a.f;
       byte[] uobyteArray = (p0 == null)? null: p0.getBytes(f);
       return uobyteArray;
    }
    public static String b(byte[] p0){
       Charset f = a.f;
       String str = (p0 == null)? null: new String(p0, f);
       return str;
    }
}
