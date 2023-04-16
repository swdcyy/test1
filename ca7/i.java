package ca7.i;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import java.util.Locale;
import com.middleware.security.MXSec;
import t38.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.middleware.security.wrapper.IKSecurityBase;
import ca7.u;
import java.nio.charset.Charset;
import java.lang.IllegalStateException;
import java.util.Objects;
import android.util.Base64;
import java.lang.RuntimeException;
import java.lang.Throwable;

public class i	// class@00051b
{
    public final byte[] a;
    public static byte[] b;
    public static i c;

    public void i(byte[] p0){
       super();
       if (p0 == null || !p0.length) {
          throw new NullPointerException("key cannot be null or empty");
       }
       this.a = p0;
       return;
    }
    public static String b(String p0){
       Locale uS = Locale.US;
       int i = 1;
       Object[] objArray = new Object[i];
       String str = "";
       if (i.c == null) {
          if (i.b == null) {
             a mXWrapper = MXSec.get().getMXWrapper();
             int i1 = 7;
             mXWrapper.g(i1);
             if (TextUtils.isEmpty("azeroth") || TextUtils.isEmpty("010a11c6-f2cb-4016-887d-0d958aef1534")) {
                mXWrapper.f(i1, 3);
             }
             String securityValu = (mXWrapper.e(i1))? mXWrapper.d().getSecurityValue("azeroth", "010a11c6-f2cb-4016-887d-0d958aef1534", 0, i): str;
             if (!u.c(securityValu)) {
                i.b = securityValu.getBytes(Charset.forName("UTF-8"));
             }else {
                throw new IllegalStateException("请联系安全组张艳生，接入安全SDK：KWSecuritySDK！\nkey cannot be null or empty");
             }
          }
          i.c = new i(i.b);
       }
       i c = i.c;
       Objects.requireNonNull(c);
       if (p0 != null && p0.length() > 0) {
          str = Base64.encodeToString(c.a(p0.getBytes("UTF-8")), 11);
       }
       objArray[0] = str;
       return String.format(uS, "ZTSP__%s__ZTSP", objArray);
    }
    public byte[] a(byte[] p0){
       byte[] uobyteArray;
       if (p0 == null || !p0.length) {
          uobyteArray = null;
       }else {
          uobyteArray = new byte[p0.length];
          int i = 256;
          byte[] uobyteArray1 = new byte[i];
          int i1 = 0;
          for (int i2 = 0; i2 < i; i2 = i2 + 1) {
             uobyteArray1[i2] = (byte)i2;
          }
          int i3 = 0;
          int i4 = 0;
          for (i2 = 0; i2 < i; i2 = i2 + 1) {
             i ta = this.a;
             byte i5 = ta[i3] & 0x00ff;
             int i6 = uobyteArray1[i2] & 0x00ff;
             i5 = i5 + i6;
             i5 = i5 + i4;
             i4 = i5 & 0x00ff;
             i5 = uobyteArray1[i2];
             uobyteArray1[i2] = uobyteArray1[i4];
             uobyteArray1[i4] = i5;
             i3 = i3 + 1;
             i3 = i3 % ta.length;
          }
          i = 0;
          i2 = 0;
          for (; i1 < p0.length; i1 = i1 + 1) {
             i = i + 1;
             i = i & 0x00ff;
             i3 = uobyteArray1[i] & 0x00ff;
             i3 = i3 + i2;
             i2 = i3 & 0x00ff;
             i3 = uobyteArray1[i];
             uobyteArray1[i] = uobyteArray1[i2];
             uobyteArray1[i2] = i3;
             i3 = uobyteArray1[i] & 0x00ff;
             i4 = uobyteArray1[i2] & 0x00ff;
             i3 = i3 + i4;
             i3 = i3 & 0x00ff;
             i3 = uobyteArray1[i3] ^ p0[i1];
             uobyteArray[i1] = (byte)i3;
          }
       }
       return uobyteArray;
    }
}
