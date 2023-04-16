package aegon.chrome.base.PiiElider;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.lang.StringBuilder;
import android.content.Context;
import a0.f;
import java.lang.ClassLoader;
import java.lang.Class;
import android.text.TextUtils;

public class PiiElider	// class@00014d
{
    public static final Pattern a;
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;
    public static final String[] e;
    public static final String[] f;

    static {
       PiiElider.a = Pattern.compile("\(\\b|^\)\(\(\(\(\(http|https|Http|Https|rtsp|Rtsp\)://\(\([a-zA-Z0-9$_.+!*\'\(\),;?&=-]|\(%[a-fA-F0-9]{2}\)\){1,64}\(:\([a-zA-Z0-9$_.+!*\'\(\),;?&=-]|\(%[a-fA-F0-9]{2}\)\){1,25}\)?@\)?\)?\(\([a-zA-Z0-9\xa0-\xd7\x02\xf9\x02-\xfd\x02\xfd\x02-\xff\x02]\([a-zA-Z0-9\xa0-\xd7\x02\xf9\x02-\xfd\x02\xfd\x02-\xff\x02-]{0,61}[a-zA-Z0-9\xa0-\xd7\x02\xf9\x02-\xfd\x02\xfd\x02-\xff\x02]\){0,1}\\.\)+[a-zA-Z\xa0-\xd7\x02\xf9\x02-\xfd\x02\xfd\x02-\xff\x02]{2,63}|\(\(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]\)\\.\(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0\)\\.\(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0\)\\.\(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]\)\)\)\(:\\d{1,5}\)?\)|\([a-zA-Z][a-zA-Z0-9+.-]+://\(\(\([a-zA-Z0-9\xa0-\xd7\x02\xf9\x02-\xfd\x02\xfd\x02-\xff\x02;/?:@&=#~.+!*\'\(\),_-]\)|\(%[a-fA-F0-9]{2}\)\)+\)\)\)\)\(/\(\([a-zA-Z0-9\xa0-\xd7\x02\xf9\x02-\xfd\x02\xfd\x02-\xff\x02;/?:@&=#~.+!*\'\(\),_-]\)|\(%[a-fA-F0-9]{2}\)\)*\)?\(\\b|$\)\x00");
       PiiElider.b = Pattern.compile("\\sat\\sorg\\.chromium\\.[^ ]+.");
       PiiElider.c = Pattern.compile("\([0-9a-fA-F]{2}[-:]+\){5}[0-9a-fA-F]{2}");
       PiiElider.d = Pattern.compile("\\[\\w*:CONSOLE.*\\].*");
       String[] stringArray = new String[]{"aegon.chrome.","com.google."};
       PiiElider.e = stringArray;
       stringArray = new String[]{"android.accessibilityservice","android.accounts","android.animation","android.annotation","android.app","android.appwidget","android.bluetooth","android.content","android.database","android.databinding","android.drm","android.gesture","android.graphics","android.hardware","android.inputmethodservice","android.location","android.media","android.mtp","android.net","android.nfc","android.opengl","android.os","android.preference","android.print","android.printservice","android.provider","android.renderscript","android.sax","android.security","android.service","android.speech","android.support","android.system","android.telecom","android.telephony","android.test","android.text","android.transition","android.util","android.view","android.webkit","android.widget","com.android.","dalvik.","java.","javax.","org.apache.","org.json.","org.w3c.dom.","org.xml.","org.xmlpull."};
       PiiElider.f = stringArray;
    }
    public void PiiElider(){
       super();
    }
    public static String a(String p0){
       int b1;
       if (PiiElider.b.matcher(p0).find()) {
          return p0;
       }
       String str = p0;
       Matcher matcher = PiiElider.a.matcher(str);
       int i = 0;
       while (matcher.find(i)) {
          i = matcher.start();
          int i1 = matcher.end();
          String str1 = str.substring(i, i1);
          String[] e = PiiElider.e;
          int len = e.length;
          int i2 = 0;
          while (true) {
             boolean b = true;
             if (i2 < len) {
                if (str1.startsWith(e[i2])) {
                   e = 1;
                label_0041 :
                   if (!e) {
                      e = PiiElider.f;
                      len = e.length;
                      i2 = 0;
                      while (true) {
                         if (i2 < len) {
                            if (str1.startsWith(e[i2])) {
                               b1 = true;
                            label_0057 :
                               if (!b1) {
                                  if (!PiiElider.b(str1)) {
                                     b1 = str1.lastIndexOf(".");
                                     b = (b1 == -1)? false: PiiElider.b(str1.substring(0, b1));
                                  }
                               label_0073 :
                                  if (!b) {
                                     str.replace(i, i1, "HTTP://WEBADDRESS.ELIDED");
                                     i = i + 24;
                                     matcher = PiiElider.a.matcher(str);
                                  }
                               }
                            }else {
                               i2 = i2 + 1;
                            }
                         }else {
                            b1 = false;
                            goto label_0057 ;
                         }
                      }
                   }
                   i = i1;
                   continue ;
                }else {
                   i2 = i2 + 1;
                }
             }else {
                e = null;
                goto label_0041 ;
             }
          }
       }
       return str;
    }
    public static boolean b(String p0){
       Class.forName(p0, false, f.a().getClassLoader());
       return true;
    }
    public static String sanitizeStacktrace(String p0){
       String[] stringArray = p0.split("\\n");
       stringArray[0] = PiiElider.a(stringArray[0]);
       int i = 1;
       while (i < stringArray.length) {
          if ((stringArray[i]).startsWith("Caused by:")) {
             stringArray[i] = PiiElider.a(stringArray[i]);
          }
          i = i + 1;
       }
       return TextUtils.join("\n", stringArray);
    }
}
