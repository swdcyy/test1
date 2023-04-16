package ie0.o;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.pendant.model.PendantStartupResponse$KemResourcePendantSkinConfig;
import pc0.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import crd.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.growth.pendant.core.demotion.PendantAnimPlan;

public final class o	// class@0028b0
{
    public final Map a;
    public PendantStartupResponse$KemResourcePendantSkinConfig b;
    public String c;
    public final String d;

    public void o(String p0){
       super();
       this.a = new HashMap();
       this.d = p0;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o.class, "1")) {
       }else {
          PendantStartupResponse$KemResourcePendantSkinConfig kemResourceP = PendantStartupResponse$KemResourcePendantSkinConfig.class;
          String str = a.a.getString(b.d("user")+"kemResourcePendantSkinConfig", "");
          if (str != null && str != "") {
             objArray = b.a(str, kemResourceP);
          }
          this.b = objArray;
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, o.class, "8")) {
          return;
       }
       Iterator iterator = this.a.keySet().iterator();
       while (iterator.hasNext()) {
          b9.a(this.a.get(iterator.next()));
       }
       this.a.clear();
       return;
    }
    public final String b(String p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o oo = o.class;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, oo, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       PendantStartupResponse$KemResourcePendantSkinConfig kemResourceP = PatchProxy.applyOneRefs(p1, this, oo, "7");
       obj = "";
       if (kemResourceP != patchProxyRe) {
       }else {
          o tb = this.b;
          kemResourceP = (tb == null || !TextUtils.n(p1, tb.mActivityId))? obj: this.b.mSkinId;
       }
       this.c = kemResourceP;
       if (PendantAnimPlan.a()) {
          obj = "demotion_";
       }
       if (!TextUtils.x(this.c)) {
          p0 = this.c+"_"+p0;
       }
       return obj+p0;
    }
}
