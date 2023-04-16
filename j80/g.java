package j80.g;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.a0;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import android.net.Uri;
import java.io.File;
import xkd.b;
import wkd.b;
import j80.c;
import java.io.InputStreamReader;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import qkd.c;

public abstract class g	// class@00223f
{

    public void g(){
       super();
    }
    public static String a(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, og, "4");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       String str = PatchProxy.applyOneRefs(p0, obj, og, "5");
       if (str != patchProxyRe) {
       }else {
          int i = p0.lastIndexOf(46);
          int i1 = p0.lastIndexOf(47);
          String str1 = (i != -1 && (i > i1 && ((i + 2) + 4) > p0.length()))? p0.substring((i + 1), p0.length()): "";
          str = str1;
       }
       p0 = a0.c(p0);
       if (!TextUtils.isEmpty(str)) {
          p0 = p0+"."+str;
       }
       return p0;
    }
    public static File b(Uri p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (b.e(p0)) {
          return new File(p0.getPath());
       }
       return null;
    }
    public static File c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(b.a(-1504323719).c(".video_cache"), g.a(p0));
    }
    public static String d(File p0){
       String str = "";
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          String str1 = c.k(new InputStreamReader(new BufferedInputStream(new FileInputStream(p0)), "UTF-8"));
          if (str1.length() < 0x100000) {
             str = str1;
          }
          return e0;
       }catch(java.io.IOException e0){
       }
    }
}
