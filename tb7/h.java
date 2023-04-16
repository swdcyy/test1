package tb7.h;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Class;
import kotlin.jvm.internal.a;
import java.lang.reflect.Method;
import java.lang.Runtime;
import java.lang.StringBuilder;
import java.lang.Process;
import java.io.InputStream;
import zsd.d;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.Reader;
import qrd.l1;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import android.os.Build;

public final class h	// class@0024a6
{
    public static String a = "";
    public static List b;

    static {
       String[] stringArray = new String[]{"MIUI","EMUI","OPPO","SMARTISAN","VIVO","FLYME","MEITU","SAMSUNG","ONEPLUS"};
       h.b = CollectionsKt__CollectionsKt.P(stringArray);
    }
    public static final boolean a(String p0){
       int i = 0;
       String str = ((h.a).length() > 0)? 1: null;
       if (str) {
          return StringsKt__StringsKt.L2(h.a, p0, true);
       }else {
          switch (p0.hashCode()){
              case 0x20893c:
                if (p0.equals("EMUI")) {
                   str = "ro.build.version.emui";
                }else {
                label_0055 :
                   str = "";
                }
                break;
              case 0x241d30:
                if (p0.equals("MIUI")) {
                   str = "ro.miui.ui.version.name";
                }else {
                   goto label_0055 ;
                }
                break;
              case 0x251fa0:
                if (p0.equals("OPPO")) {
                   str = "ro.build.version.opporom";
                }else {
                   goto label_0055 ;
                }
                break;
              case 0x2834ac:
                if (p0.equals("VIVO")) {
                   str = "ro.vivo.os.version";
                }else {
                   goto label_0055 ;
                }
                break;
              case 0x500f1000:
                if (p0.equals("SMARTISAN")) {
                   str = "ro.smartisan.version";
                }else {
                   goto label_0055 ;
                }
                break;
              default:
                goto label_0055 ;
          }
          String str1 = (str.length() > 0)? 1: null;
          if (str1) {
             Throwable throwable = null;
             Class uClass = Class.forName("android.os.SystemProperties");
             a.h(uClass, "Class.forName\(\"android.os.SystemProperties\"\)");
             Class[] uClassArray = new Class[true];
             uClassArray[i] = String.class;
             Method declaredMeth = uClass.getDeclaredMethod("get", uClassArray);
             a.h(declaredMeth, "clazz.getDeclaredMethod\(\"get\", String::class.java\)");
             Object[] objArray = new Object[true];
             objArray[i] = str;
             str1 = declaredMeth.invoke(uClass, objArray);
             StringBuilder str2 = (str1 == null || !str1.length())? 1: null;
             if (str2) {
                Process process = Runtime.getRuntime().exec("getprop "+str);
                a.h(process, "process");
                InputStream inputStream = process.getInputStream();
                a.h(inputStream, "process.inputStream");
                InputStreamReader inputStreamR = new InputStreamReader(inputStream, d.a);
                str = 8192;
                if (inputStreamR instanceof BufferedReader) {
                }else {
                   inputStreamR = new BufferedReader(inputStreamR, str);
                }
                b.a(inputStreamR, throwable);
                throwable = inputStreamR.readLine();
             }else {
                throwable = str1;
             }
             if (throwable == null || !throwable.length()) {
                i = 1;
             }
             return (i ^ 0x01);
          }else {
             switch (p0.hashCode()){
                 case 0x99f44bda:
                   if (p0.equals("SAMSUNG")) {
                      str = Build.MANUFACTURER;
                      a.h(str, "Build.MANUFACTURER");
                      i = StringsKt__StringsKt.L2(str, p0, true);
                   }
                   break;
                 case 0xdc1824e0:
                   if (p0.equals("ONEPLUS")) {
                      str = Build.MANUFACTURER;
                      a.h(str, "Build.MANUFACTURER");
                      i = StringsKt__StringsKt.L2(str, p0, true);
                   }
                   break;
                 case 0x3fe512b:
                   if (p0.equals("FLYME")) {
                      str = Build.DISPLAY;
                      a.h(str, "Build.DISPLAY");
                      i = StringsKt__StringsKt.L2(str, p0, true);
                   }
                   break;
                 case 0x45d8bf2:
                   if (p0.equals("MEITU")) {
                      str = Build.MANUFACTURER;
                      a.h(str, "Build.MANUFACTURER");
                      i = StringsKt__StringsKt.L2(str, p0, true);
                   }
                   break;
                 default:
             }
          label_0148 :
             return i;
          }
       }
    }
    public static final boolean b(){
       boolean b;
       String str = "MIUI";
       if (h.a(str)) {
          h.a = str;
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public static final boolean c(){
       boolean b;
       String str = "SAMSUNG";
       if (h.a(str)) {
          h.a = str;
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
