package a30.d;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.cover.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import c30.b;
import a30.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.sdk.switchconfig.a;
import io7.f;
import com.google.gson.JsonElement;
import java.util.Map;
import yz7.e;
import java.lang.StringBuilder;
import d30.c;
import java.lang.Exception;
import a30.f;
import com.kwai.robust.PatchProxyResult;
import c30.c;
import com.kuaishou.cover.container.loader.a;
import com.kuaishou.cover.container.loader.ArkLoader;
import c30.a;
import com.kuaishou.cover.Link;
import com.kuaishou.cover.b;

public class d	// class@00001e
{
    public FragmentActivity a;
    public c b;
    public b c;
    public String d;

    public void d(FragmentActivity p0,c p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "10")) {
          return;
       }
       uod = this.c;
       if (uod != null) {
          uod.D2(p0);
       }
       this.a = null;
       return;
    }
    public b b(){
       return this.c;
    }
    public void c(b p0){
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "3")) {
          return;
       }
       if (this.a == null) {
          if (this.b.b() != null) {
             this.b.b().onFailed();
          }
          return;
       }else {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, uod, "4")) {
             uod = this.b;
             if (uod != null && !TextUtils.isEmpty(uod.e())) {
                String str = this.b.e();
                f uof = a.t().f("CoverKitDialogABSwitch");
                if (uof != null && uof.c() != null) {
                   try{
                      String obj = String.valueOf(uof.c());
                      if (!TextUtils.isEmpty(obj)) {
                         Map map = e.a(obj, Map.class);
                         if (map.containsKey(str)) {
                            obj = map.get(str);
                            if (!TextUtils.isEmpty(obj)) {
                               this.b.c = obj;
                               c.d("LinkContainer replaceUrl success, origin url: "+str+" replaceUrl: "+obj);
                            }
                         }
                      }
                   }catch(java.lang.Exception e0){
                      c.e(e0.getMessage());
                   }
                }
             }
          }
       }
    }
    public void d(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.b.f = p0;
       return;
    }
}
