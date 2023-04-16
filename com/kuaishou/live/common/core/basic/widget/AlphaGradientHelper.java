package com.kuaishou.live.common.core.basic.widget.AlphaGradientHelper;
import ya1.a;
import com.kuaishou.live.common.core.basic.widget.AlphaGradientHelper$a;
import nsd.u;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.basic.widget.AlphaGradientHelper$paint$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;

public final class AlphaGradientHelper implements a	// class@000f03
{
    public final View b;
    public float c;
    public float d;
    public float e;
    public float f;
    public final p g;
    public static final AlphaGradientHelper$a h;

    static {
       AlphaGradientHelper.h = new AlphaGradientHelper$a(null);
    }
    public void AlphaGradientHelper(View p0){
       a.p(p0, "thisView");
       super();
       this.b = p0;
       this.d = 0x3f800000;
       this.g = s.c(new AlphaGradientHelper$paint$2(this));
    }
    public void a(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(AlphaGradientHelper.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, AlphaGradientHelper.class, "2")) {
          return;
       }
       int i = 0;
       i = (p0 - i >= 0 && (p0 - 0x3f800000 <= 0 && (p1 - i >= 0 && p1 - 0x3f800000 <= 0)))? 1: 0;
       if (i) {
          this.c = p0;
          this.d = p1;
          this.e = p2;
          this.f = p3;
          this.b.invalidate();
          return;
       }else {
          throw new IllegalStateException("startAlpha:"+p0+" endAlpha:"+p1.toString());
       }
    }
}
