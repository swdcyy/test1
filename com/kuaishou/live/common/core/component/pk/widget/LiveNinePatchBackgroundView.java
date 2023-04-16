package com.kuaishou.live.common.core.component.pk.widget.LiveNinePatchBackgroundView;
import com.kuaishou.live.common.core.component.pk.widget.RoundedRadiusConstraintLayout;
import com.kuaishou.live.common.core.component.pk.widget.LiveNinePatchBackgroundView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import lw1.a;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.model.CDNUrl;
import uc.d;
import brd.t;
import com.kuaishou.live.common.core.basic.tools.l;
import com.kuaishou.live.common.core.component.pk.widget.LiveNinePatchBackgroundView$b;
import erd.o;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.kuaishou.live.common.core.component.pk.widget.LiveNinePatchBackgroundView$c;
import com.kuaishou.live.common.core.component.pk.widget.LiveNinePatchBackgroundView$d;
import erd.g;
import android.view.ViewGroup;

public final class LiveNinePatchBackgroundView extends RoundedRadiusConstraintLayout	// class@001741
{
    public b E;
    public HashMap F;
    public static final LiveNinePatchBackgroundView$a G;

    static {
       LiveNinePatchBackgroundView.G = new LiveNinePatchBackgroundView$a(null);
    }
    public void LiveNinePatchBackgroundView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void LiveNinePatchBackgroundView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void LiveNinePatchBackgroundView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public final void L(a p0,Drawable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, null, this, LiveNinePatchBackgroundView.class, "1")) {
          return;
       }
       a.p(p0, "liveNinePatchBackgroundViewInfo");
       b9.a(this.E);
       this.E = l.e(p0.a, null).map(new LiveNinePatchBackgroundView$b(this, p0)).timeout((long)0x2710, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new LiveNinePatchBackgroundView$c(this), new LiveNinePatchBackgroundView$d(this, null));
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveNinePatchBackgroundView.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       b9.a(this.E);
       return;
    }
}
