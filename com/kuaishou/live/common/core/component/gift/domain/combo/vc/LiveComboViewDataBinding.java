package com.kuaishou.live.common.core.component.gift.domain.combo.vc.LiveComboViewDataBinding;
import com.kuaishou.live.common.core.component.gift.base.LifecycleDataBinding;
import androidx.lifecycle.LifecycleOwner;
import android.view.View;
import com.yxcorp.gifshow.models.Gift;
import z1.k;
import sh1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import d61.h;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftComboAnimationView;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftBoxComboTextAnimationView;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftBoxGiftParticleAnimationView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import ekd.y0;

public final class LiveComboViewDataBinding extends LifecycleDataBinding	// class@00118d
{
    public final LiveGiftComboAnimationView c;
    public LiveGiftBoxComboTextAnimationView d;
    public LiveGiftBoxGiftParticleAnimationView e;
    public y0 f;
    public final View g;
    public final Gift h;
    public final k i;
    public final k j;
    public final a k;

    public void LiveComboViewDataBinding(LifecycleOwner p0,View p1,Gift p2,k p3,k p4,a p5){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "comboContainerView");
       a.p(p3, "slotView");
       a.p(p4, "isLandscapeSupplier");
       a.p(p5, "comboConfig");
       super(p0);
       this.g = p1;
       this.h = p2;
       this.i = p3;
       this.j = p4;
       this.k = p5;
       View view = h.f(p1, R.id.live_gift_right_bottom_combo_animation_view_stub, 0x7f0a1d11);
       a.o(view, "LiveBasicViewUtils.getVi¡­gift_box_combo_button\n  \)");
       this.c = view;
       View view1 = h.f(p1, R.id.live_gift_box_combo_text_animation_view_stub, 0x7f0a1d20);
       a.o(view1, "LiveBasicViewUtils.getVi¡­box_combo_text_view\n    \)");
       this.d = view1;
       p1 = p1.findViewById(R.id.live_gift_box_gift_particle_animation_view);
       a.o(p1, "comboContainerView.findV¡­_particle_animation_view\)");
       this.e = p1;
       view.setComboCountDownDuration(p5.b);
       view.setComboAnimViewNewStyleEnabled(p5.a());
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LiveComboViewDataBinding.class, "4")) {
          return;
       }
       this.c.setVisibility(8);
       this.c.l();
       this.c.n();
       this.c.b();
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LiveComboViewDataBinding.class, "3")) {
          return;
       }
       b.Z(LiveGiftTag.COMBO, "[LiveComboViewDataBinding][stopHoldingComboSendGift]");
       LiveComboViewDataBinding tf = this.f;
       if (tf != null) {
          tf.e();
       }
       this.f = null;
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveComboViewDataBinding.class, "5")) {
          return;
       }
       a.p(p0, "owner");
       this.b();
       this.c();
       return;
    }
}
