package aegon.chrome.base.JNIUtils;
import java.lang.Object;
import java.lang.String;
import java.lang.ClassLoader;
import android.content.Context;
import a0.f;
import java.lang.CharSequence;
import android.text.TextUtils;
import aegon.chrome.base.BundleUtils;
import java.lang.Class;
import java.lang.Boolean;

public class JNIUtils	// class@00005c
{
    public static Boolean a;
    public static ClassLoader b;
    public static final boolean c;

    public void JNIUtils(){
       super();
    }
    public static ClassLoader getSplitClassLoader(String p0){
       Context uContext = f.a();
       if (!TextUtils.isEmpty(p0) && BundleUtils.e(uContext, p0)) {
          return BundleUtils.a(uContext, p0).getClassLoader();
       }
       ClassLoader b = JNIUtils.b;
       if (b == null) {
          b = JNIUtils.class.getClassLoader();
       }
       return b;
    }
    public static boolean isSelectiveJniRegistrationEnabled(){
       if (JNIUtils.a == null) {
          JNIUtils.a = Boolean.FALSE;
       }
       return JNIUtils.a.booleanValue();
    }
}
