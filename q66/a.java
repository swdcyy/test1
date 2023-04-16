package q66.a;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.SharedPreferences;
import km8.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import qe6.b;
import com.kwai.framework.deviceid.i;
import o56.a;

public class a	// class@002237
{
    public String a;
    public SharedPreferences b;
    public static final List c;
    public static final List d;

    static {
       String[] stringArray = new String[]{"ulogjs.gifshow.com","ulog.ksapisrv.com"};
       a.c = Lists.e(stringArray);
       stringArray = new String[]{"apijs.ksapisrv.com","apijs.gifshow.com"};
       a.d = Lists.e(stringArray);
    }
    public void a(){
       super();
       this.a = null;
       this.b = null;
    }
    public String a(){
       a obj = PatchProxy.apply(null, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.b = this.d();
       }
       obj = this.b;
       String str = "";
       if (obj != null) {
          str = obj.getString("gifshow_api_service_token", str);
       }
       return str;
    }
    public String b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoa, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       String str = PatchProxy.apply(objArray, objArray, uoa, "3");
       if (str != patchProxyRe) {
       }else {
          str = b.c("gifshow", 0).getString("android_c_id_10560", "");
       }
       if (TextUtils.isEmpty(str) && b.a()) {
          str = i.f();
       }else if(TextUtils.isEmpty(str)){
          str = a.a;
       }
       return str;
    }
    public String c(){
       a obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.b = this.d();
       }
       obj = this.b;
       String str = "0";
       if (obj != null) {
          str = obj.getString("gifshow_userid", str);
       }
       return str;
    }
    public final SharedPreferences d(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.c(a.w, 4);
    }
}
