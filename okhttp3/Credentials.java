package okhttp3.Credentials;
import java.lang.Object;
import java.lang.String;
import okhttp3.internal.Util;
import java.nio.charset.Charset;
import java.lang.StringBuilder;
import okio.ByteString;

public final class Credentials	// class@001f42
{

    public void Credentials(){
       super();
    }
    public static String basic(String p0,String p1){
       return Credentials.basic(p0, p1, Util.ISO_8859_1);
    }
    public static String basic(String p0,String p1,Charset p2){
       return "Basic "+ByteString.encodeString(p0+":"+p1, p2).base64();
    }
}
