package psb.q;
import ta6.j;
import java.lang.Object;
import java.util.Map;
import psb.r;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.activitycontext.ActivityContext;
import wh5.c;
import y95.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import oe6.c;
import wkd.b;
import kka.h;
import o56.a;
import of6.f;
import o56.c;
import ez6.a;
import com.yxcorp.retrofit.e;
import android.content.Context;
import com.kwai.component.uiconfig.browsestyle.model.BrowseStyle;
import uh5.e;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import zf6.k;

public final class q implements j	// class@0021f5
{
    public static final q a;

    static {
       q.a = new q();
    }
    public void q(){
       super();
    }
    public final void a(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, r.class, "2")) {
       }else {
          boolean b = false;
          String str = (ActivityContext.g().h() && r.a())? 1: null;
          if (c.b()) {
             p0.put("cl", "1");
          }
          String str1 = a.a();
          if (!TextUtils.isEmpty(str1)) {
             p0.put("deviceBit", str1);
          }
          p0.put("userRecoBit", String.valueOf(a.b()));
          if (c.b() - null) {
             p0.put("did_gt", String.valueOf(c.b()));
          }
          p0.put("ftt", b.a(-1592356291).b());
          p0.put("iuid", a.u);
          str1 = f.a();
          if (!TextUtils.isEmpty(str1)) {
             String str2 = "pm_tag";
             if (TextUtils.isEmpty(p0.get(str2))) {
                p0.put(str2, str1);
             }
          }
          p0.put("max_memory", a.a().t());
          str1 = (!ActivityContext.g().h())? a.a: a.a(e.h().f());
          p0.put("isp", str1);
          p0.put("browseType", String.valueOf(e.d().getParamType()));
          p0.put("grant_browse_type", VisitorModeManager.e());
          if (!str) {
             p0.remove("lat");
             p0.remove("lon");
          }
          p0.put("darkMode", String.valueOf(k.d()));
          p0.put("bottom_navigation", String.valueOf(b));
       }
       return;
    }
}
