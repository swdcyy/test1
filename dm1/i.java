package dm1.i;
import java.lang.Object;
import wkd.b;
import j80.c;
import java.lang.String;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.files.a;
import java.util.List;
import dm1.i$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import dm1.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.x0;
import java.net.URLEncoder;
import java.lang.StringBuilder;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import qkd.b;

public class i	// class@001fc9
{
    public static final String a;
    public static final String b;
    public static Boolean c;

    static {
       i.a = b.a(-1504323719).d("live_gift_store_icon").getAbsolutePath();
       i.b = b.a(-1504323719).d("live_gift_store_icon_directory").getAbsolutePath();
    }
    public void i(){
       super();
    }
    public static void a(){
       if (PatchProxy.applyVoid(null, null, i.class, "11")) {
          return;
       }
       File uFile = new File(i.b);
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       a.a(uFile);
       return;
    }
    public static i$a b(List p0,boolean p1){
       String obj;
       Object obj1;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, oi, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = a.c(p0);
       if (TextUtils.x(obj)) {
          return null;
       }else if(p1){
          obj1 = PatchProxy.applyOneRefs(obj, null, oi, "9");
          str = (obj1 != patchProxyRe)? obj1: URLEncoder.encode(x0.f(obj).getPath(), "UTF-8");
       }else {
          obj1 = PatchProxy.applyOneRefs(obj, null, oi, "8");
          str = (obj1 != patchProxyRe)? obj1: URLEncoder.encode(obj, "UTF-8");
       }
    label_0056 :
       if (TextUtils.x(str)) {
          return null;
       }else {
          return new i$a(p0, i.b, str+".jpg");
       }
    }
    public static boolean c(){
       Object obj = PatchProxy.apply(null, null, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (i.c == null) {
          i.c = Boolean.valueOf(a.t().u("SOURCE_LIVE").d("enableGiftIconCacheKeyNewStrengy", false));
       }
       return i.c.booleanValue();
    }
    public static boolean d(i$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       String[] stringArray = new String[]{p0.a()};
       File uFile = b.B(stringArray);
       if (uFile != null && uFile.exists()) {
          b = true;
       }
       return b;
    }
}
