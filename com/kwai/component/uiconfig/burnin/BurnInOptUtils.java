package com.kwai.component.uiconfig.burnin.BurnInOptUtils;
import com.kwai.component.uiconfig.burnin.BurnInOptUtils$BURN_IN_PHONE$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Number;
import ekd.r;

public final class BurnInOptUtils	// class@000bd6
{
    public static final p a;
    public static final BurnInOptUtils b;

    static {
       BurnInOptUtils.b = new BurnInOptUtils();
       BurnInOptUtils.a = s.c(BurnInOptUtils$BURN_IN_PHONE$2.INSTANCE);
    }
    public void BurnInOptUtils(){
       super();
    }
    public static final boolean a(){
       BurnInOptUtils obj = PatchProxy.apply(null, null, BurnInOptUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = BurnInOptUtils.b;
       boolean b = (obj.b() > 0 && obj.b() - 0x3f800000 <= 0)? true: false;
       return b;
    }
    public static final void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, BurnInOptUtils.class, "4")) {
          return;
       }
       if (!BurnInOptUtils.a()) {
          return;
       }
       if (p0 != null) {
          p0.setAlpha(BurnInOptUtils.b.b());
       }
       return;
    }
    public static final void d(View p0,float p1){
       BurnInOptUtils uBurnInOptUt = BurnInOptUtils.class;
       if (PatchProxy.isSupport(uBurnInOptUt) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), null, uBurnInOptUt, "5")) {
          return;
       }
       if (!BurnInOptUtils.a()) {
          if (p0 != null) {
             p0.setAlpha(p1);
          }
          return;
       }else if(p0 != null){
          p0.setAlpha((BurnInOptUtils.b.b() * p1));
       }
       return;
    }
    public static final int e(int p0){
       BurnInOptUtils uBurnInOptUt = BurnInOptUtils.class;
       if (PatchProxy.isSupport(uBurnInOptUt)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uBurnInOptUt, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!BurnInOptUtils.a()) {
          return p0;
       }else {
          return r.d((int)(BurnInOptUtils.b.b() * (float)255), p0);
       }
    }
    public final float b(){
       Object obj = PatchProxy.apply(null, this, BurnInOptUtils.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = BurnInOptUtils.a.getValue();
       }
       return obj.floatValue();
    }
}
