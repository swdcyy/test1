package okhttp3.internal.ws.WebSocketProtocol;
import java.lang.Object;
import java.lang.AssertionError;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;
import okio.b$b;
import kotlin.jvm.internal.a;
import okio.b;
import java.lang.IllegalStateException;
import java.lang.IllegalArgumentException;

public final class WebSocketProtocol	// class@001fdd
{

    public void WebSocketProtocol(){
       super();
       throw new AssertionError("No instances.");
    }
    public static String acceptHeader(String p0){
       return ByteString.encodeUtf8(p0+"258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
    }
    public static String closeCodeExceptionMessage(int p0){
       if (p0 < 1000 || p0 >= 5000) {
          return "Code must be in range [1000,5000\): "+p0;
       }
       if (p0 < 1004 || (p0 <= 1006 || (p0 >= 1012 && p0 <= 2999))) {
          return "Code "+p0+" is reserved and may not be used.";
       }
       return null;
    }
    public static void toggleMask(b$b p0,byte[] p1){
       long l;
       int len = p1.length;
       int i = 0;
       while (true) {
          b$b f = p0.f;
          b$b g = p0.g;
          b$b h = p0.h;
          int i1 = 1;
          while (g < h) {
             i = i % len;
             int i2 = f[g] ^ p1[i];
             f[g] = (byte)i2;
             g = g + 1;
             i = i + i1;
          }
          f = p0.e;
          h = p0.b;
          if (h == null) {
             a.L();
          }
          if (!f - h.p()) {
             i1 = 0;
          }
          if (i1) {
             f = p0.e;
             if (!f - -1) {
                l = 0;
             }else {
                int i3 = p0.h - p0.g;
                l = f + (long)i3;
             }
             if (p0.a(l) == -1) {
                return;
             }
             continue ;
          }else {
          }
       }
       throw new IllegalStateException("no more bytes".toString());
    }
    public static void validateCloseCode(int p0){
       String str = WebSocketProtocol.closeCodeExceptionMessage(p0);
       if (str == null) {
          return;
       }
       throw new IllegalArgumentException(str);
    }
}
