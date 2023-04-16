package com.kuaishou.live.common.core.component.hotspot.fixedEntrance.LiveMarqueeTextFlipper$updateFlipperContainer$task$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.hotspot.fixedEntrance.LiveMarqueeTextFlipper;
import wn1.f;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.widget.ShootMarqueeView;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;
import wn1.a;
import wn1.e;
import android.view.View$OnClickListener;
import wn1.b;
import com.kuaishou.live.widget.ShootMarqueeView$c;
import android.widget.ViewFlipper;

public final class LiveMarqueeTextFlipper$updateFlipperContainer$task$1 extends Lambda implements a	// class@001426
{
    public final f $info;
    public final Ref$BooleanRef $isFirstMarqueeView;
    public final LiveMarqueeTextFlipper this$0;

    public void LiveMarqueeTextFlipper$updateFlipperContainer$task$1(LiveMarqueeTextFlipper p0,f p1,Ref$BooleanRef p2){
       this.this$0 = p0;
       this.$info = p1;
       this.$isFirstMarqueeView = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveMarqueeTextFlipper$updateFlipperContainer$task$1.class, "1")) {
          return;
       }
       LiveMarqueeTextFlipper$updateFlipperContainer$task$1 tthis$0 = this.this$0;
       LiveMarqueeTextFlipper$updateFlipperContainer$task$1 t$info = this.$info;
       LiveMarqueeTextFlipper g = tthis$0.g;
       Objects.requireNonNull(tthis$0);
       ShootMarqueeView shootMarquee = PatchProxy.applyTwoRefs(t$info, g, tthis$0, LiveMarqueeTextFlipper.class, "11");
       if (shootMarquee != PatchProxyResult.class) {
       }else {
          shootMarquee = a.i(tthis$0, R.layout.arg_RES_7f0d0c26);
          a.o(shootMarquee, "marqueeView");
          shootMarquee.setText(t$info.a());
          shootMarquee.setMarqueeDpPerSecond(tthis$0.n);
          shootMarquee.setOnClickListener(new a(g, t$info));
          shootMarquee.setMarqueeListener(new b(tthis$0));
       }
       this.this$0.addView(shootMarquee);
       tthis$0 = this.$isFirstMarqueeView;
       if (tthis$0.element != null) {
          tthis$0.element = false;
          this.this$0.j = shootMarquee;
       }
       return;
    }
}
