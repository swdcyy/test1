package mwd.c;
import java.nio.charset.CodingErrorAction;
import java.lang.String;
import org.java_websocket.exceptions.InvalidEncodingException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.Buffer;
import java.nio.CharBuffer;
import org.java_websocket.exceptions.InvalidDataException;
import java.lang.Throwable;

public class c	// class@001d60
{
    public static final CodingErrorAction a;
    public static final int[] b;

    static {
       c.a = CodingErrorAction.REPORT;
       c.b = new int[400]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,8,8,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,10,3,3,3,3,3,3,3,3,3,3,3,3,4,3,3,11,6,6,6,5,8,8,8,8,8,8,8,8,8,8,8,0,1,2,3,5,8,7,1,1,1,4,6,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,2,1,1,1,1,1,2,1,2,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,3,1,1,1,1,1,1,1,3,1,1,1,1,1,3,1,3,1,1,1,1,1,1,1,3,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
    }
    public static byte[] a(String p0){
       try{
          return p0.getBytes("ASCII");
       }catch(java.io.UnsupportedEncodingException e1){
          throw new InvalidEncodingException(e1);
       }
    }
    public static boolean b(ByteBuffer p0){
       int i = p0.remaining();
       boolean b = true;
       if (i >= 0) {
          int i1 = 0;
          int i2 = 0;
          while (i1 < i) {
             int[] b1 = c.b;
             i2 = i2 << 4;
             i2 = i2 + 256;
             int i3 = p0.get(i1) & 0x00ff;
             i2 = i2 + b1[i3];
             if (b1[i2] != b) {
                i1 = i1 + 1;
             }
          }
          return b;
       }
       b = false;
       goto label_0025 ;
    }
    public static String c(ByteBuffer p0){
       CharsetDecoder uCharsetDeco = Charset.forName("UTF8").newDecoder();
       CodingErrorAction a = c.a;
       uCharsetDeco.onMalformedInput(a);
       try{
          uCharsetDeco.onUnmappableCharacter(a);
          p0.mark();
          p0.reset();
          return uCharsetDeco.decode(p0).toString();
       }catch(java.nio.charset.CharacterCodingException e2){
          throw new InvalidDataException(1007, e2);
       }
    }
    public static byte[] d(String p0){
       try{
          return p0.getBytes("UTF8");
       }catch(java.io.UnsupportedEncodingException e1){
          throw new InvalidEncodingException(e1);
       }
    }
}
