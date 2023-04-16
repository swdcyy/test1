package bfc.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wkd.b;
import ncc.g;
import com.kwai.social.startup.reminder.model.NewsSlidePlayConfig;
import hm8.a;
import com.yxcorp.gifshow.util.DateUtils;
import j9c.b;
import crd.b;
import lnc.b9;

public class i	// class@000473
{
    public b a;
    public b b;

    public void i(){
       super();
    }
    public static boolean a(){
       boolean b;
       NewsSlidePlayConfig obj = PatchProxy.apply(null, null, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = b.a(-83154551).f();
       b = false;
       if (obj.mEnable != null && (obj.mEnableVipUserRedDot == null || obj.mVipUserReddotCount <= null)) {
          return b;
       }
       if (DateUtils.H(a.e())) {
          return b;
       }
       if (!DateUtils.H(a.f())) {
          return true;
       }
       if (a.d() < obj.mVipUserReddotCount) {
          b = true;
       }
       return b;
    }
    public static boolean b(){
       boolean b;
       Boolean obj = PatchProxy.apply(null, null, i.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = b.c(-8, Boolean.class);
       b = (obj != null && obj.booleanValue())? true: false;
       return b;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       b9.a(this.b);
       this.b = null;
       return;
    }
}
