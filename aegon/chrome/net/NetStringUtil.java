package aegon.chrome.net.NetStringUtil;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.lang.String;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.CharBuffer;
import java.text.Normalizer$Form;
import java.lang.CharSequence;
import java.text.Normalizer;
import java.nio.charset.CodingErrorAction;
import java.util.Locale;

public class NetStringUtil	// class@00018c
{

    public void NetStringUtil(){
       super();
    }
    public static String convertToUnicode(ByteBuffer p0,String p1){
       try{
          return Charset.forName(p1).newDecoder().decode(p0).toString();
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public static String convertToUnicodeAndNormalize(ByteBuffer p0,String p1){
       String str = NetStringUtil.convertToUnicode(p0, p1);
       if (str == null) {
          return null;
       }
       return Normalizer.normalize(str, Normalizer$Form.NFC);
    }
    public static String convertToUnicodeWithSubstitutions(ByteBuffer p0,String p1){
       try{
          CharsetDecoder uCharsetDeco = Charset.forName(p1).newDecoder();
          uCharsetDeco.onMalformedInput(CodingErrorAction.REPLACE);
          uCharsetDeco.onUnmappableCharacter(CodingErrorAction.REPLACE);
          uCharsetDeco.replaceWith("\xff\x02\x00");
          return uCharsetDeco.decode(p0).toString();
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public static String toUpperCase(String p0){
       try{
          return p0.toUpperCase(Locale.getDefault());
       }catch(java.lang.Exception e0){
          return null;
       }
    }
}
