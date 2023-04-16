package com.kuaishou.tuna.plc.dynamic_container.view.DynamicAutoTranslator;
import com.kuaishou.tuna.plc.dynamic_container.view.PlcDynamicContainerLayout;
import hy4.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna.plc.dynamic_container.view.DynamicAutoTranslator$mMinimumVelocity$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.tuna.plc.dynamic_container.view.DynamicAutoTranslator$mMinSlop$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import android.widget.RelativeLayout;
import com.kuaishou.tuna.plc.dynamic_container.util.PlcDynamicUtils;
import qy4.a;
import usd.q;

public final class DynamicAutoTranslator	// class@001005
{
    public final p a;
    public final p b;
    public final PlcDynamicContainerLayout c;
    public final a d;

    public void DynamicAutoTranslator(PlcDynamicContainerLayout p0,a p1){
       a.p(p0, "containerView");
       a.p(p1, "container");
       super();
       this.c = p0;
       this.d = p1;
       this.a = s.c(DynamicAutoTranslator$mMinimumVelocity$2.INSTANCE);
       this.b = s.c(DynamicAutoTranslator$mMinSlop$2.INSTANCE);
    }
    public final int a(){
       Object obj = PatchProxy.apply(null, this, DynamicAutoTranslator.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.a.getValue();
       }
       return obj.intValue();
    }
    public final boolean b(boolean p0){
       float f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DynamicAutoTranslator uDynamicAuto = DynamicAutoTranslator.class;
       if (PatchProxy.isSupport(uDynamicAuto)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uDynamicAuto, "6");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       float translationY = this.c.getTranslationY();
       DynamicAutoTranslator tc = this.c;
       DynamicAutoTranslator td = this.d;
       Object obj1 = PatchProxy.applyTwoRefs(tc, td, null, PlcDynamicUtils.class, "32");
       if (obj1 != patchProxyRe) {
          f = obj1.floatValue();
       }else {
          a.p(tc, "containerView");
          a.p(td, "container");
          f = q.t(((((float)td.sa() - tc.getAnchorTranslationY()) * 0.40f) + tc.getAnchorTranslationY()), (tc.getAnchorTranslationY() + (float)a.b));
       }
       p0 = (translationY - f >= 0 || (this.c.getTranslationY() - this.c.getAnchorTranslationY() > 0 && p0))? true: false;
       return p0;
    }
}
