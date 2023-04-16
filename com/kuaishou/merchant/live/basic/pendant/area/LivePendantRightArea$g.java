package com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$g;
import java.lang.Runnable;
import android.view.View;
import ms3.b;
import android.app.Activity;
import com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea;
import ms3.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.bubble.a$c;
import android.view.ViewGroup;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$g$a;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$g$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.bubble.a;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.s0;
import x14.b;

public final class LivePendantRightArea$g implements Runnable	// class@0018ac
{
    public final View b;
    public final b c;
    public final Activity d;
    public final LivePendantRightArea e;
    public final c f;

    public void LivePendantRightArea$g(View p0,b p1,Activity p2,LivePendantRightArea p3,c p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, LivePendantRightArea$g.class, "1")) {
          return;
       }
       a uoa = new a(this.d);
       uoa.K0(KwaiBubbleOption.e);
       uoa.F0(this.f.getContent());
       uoa.q0(true);
       uoa.C(this.e.C);
       uoa.P(true);
       uoa.A(false);
       uoa.T(this.f.getDuration());
       uoa.o0(this.b);
       uoa.D0(BubbleInterface$Position.LEFT);
       uoa.L(new LivePendantRightArea$g$a(this));
       this.e.y = uoa.Y(new LivePendantRightArea$g$b(this));
       this.e.f("real show bubble", s0.k(r0.a("materialId", this.f.a())));
       PatchProxy.onMethodExit(LivePendantRightArea$g.class, "1");
       return;
    }
}
