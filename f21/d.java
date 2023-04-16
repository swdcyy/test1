package f21.d;
import f21.a;
import com.kuaishou.live.bottombar.component.widget.d;
import z1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import f21.d$a;
import android.view.View$OnClickListener;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveGuideGiftAnimationView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import android.graphics.drawable.Drawable;
import lnc.a1;
import z61.b;
import java.lang.Boolean;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveGuideGiftAnimationView$b;
import java.lang.Integer;

public final class d extends d implements a	// class@0022a1
{
    public View k;
    public View l;
    public ViewGroup m;
    public KwaiImageView n;
    public LiveGuideGiftAnimationView o;
    public SelectShapeTextView p;
    public final a q;

    public void d(a p0){
       a.p(p0, "viewCreateCallback");
       super();
       this.q = p0;
    }
    public View C(Context p0,ViewGroup p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = a.d(p0, R.layout.arg_RES_7f0d0a24, p1, false);
       this.q.accept(view);
       view.setOnClickListener(new d$a(this));
       return view;
    }
    public void D(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       a.p(p0, "rootView");
       this.k = p0;
       View view = m1.f(p0, R.id.live_gift_battle_bottom_bar_background_view);
       a.o(view, "ViewBindUtils.bindWidget¡­ttom_bar_background_view\)");
       this.l = view;
       view = m1.f(p0, R.id.live_gift_battle_bottom_bar_container);
       a.o(view, "ViewBindUtils.bindWidget¡­tle_bottom_bar_container\)");
       this.m = view;
       view = m1.f(p0, R.id.live_gift_battle_bottom_bar_view);
       a.o(view, "ViewBindUtils.bindWidget¡­t_battle_bottom_bar_view\)");
       this.n = view;
       view = m1.f(p0, R.id.live_gift_battle_bottom_bar_combo);
       a.o(view, "ViewBindUtils.bindWidget¡­_battle_bottom_bar_combo\)");
       this.o = view;
       p0 = m1.f(p0, R.id.live_bottom_bar_guide_gift_label);
       a.o(p0, "ViewBindUtils.bindWidget¡­tom_bar_guide_gift_label\)");
       this.p = p0;
       d tl = this.l;
       if (tl == null) {
          a.S("giftBackgroundView");
       }
       tl.setBackground(a1.f(R.drawable.arg_RES_7f0810dd));
       return;
    }
    public void F(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "5")) {
          return;
       }
       a.p(p0, "iLiveBottomBarItem");
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, d.class, "11")) {
          return;
       }
       d to = this.o;
       if (to == null) {
          a.S("giftAnimationView");
       }
       to.b();
       return;
    }
    public void d(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "10")) {
          return;
       }
       uod = this.o;
       if (uod == null) {
          a.S("giftAnimationView");
       }
       int i = (p0)? 0: 8;
       uod.setVisibility(i);
       return;
    }
    public void e(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "7")) {
          return;
       }
       a.p(p0, "cdnUrls");
       d tn = this.n;
       if (tn == null) {
          a.S("giftImageView");
       }
       tn.P(p0);
       return;
    }
    public void g(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "8")) {
          return;
       }
       d tl = this.l;
       if (tl == null) {
          a.S("giftBackgroundView");
       }
       tl.setBackground(p0);
       return;
    }
    public View getView(){
       d obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj == null) {
          a.S("giftBattleSelfView");
       }
       return obj;
    }
    public void h(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "14")) {
          return;
       }
       d to = this.o;
       if (to == null) {
          a.S("giftAnimationView");
       }
       to.setOnClickListener(p0);
       return;
    }
    public void i(LiveGuideGiftAnimationView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "13")) {
          return;
       }
       d to = this.o;
       if (to == null) {
          a.S("giftAnimationView");
       }
       to.setAnimationFinishListener(p0);
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, d.class, "12")) {
          return;
       }
       d to = this.o;
       if (to == null) {
          a.S("giftAnimationView");
       }
       to.a();
       return;
    }
    public void k(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "9")) {
          return;
       }
       uod = this.m;
       if (uod == null) {
          a.S("giftContainer");
       }
       int i = (p0)? 0: 8;
       uod.setVisibility(i);
       return;
    }
    public void q(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "4")) {
          return;
       }
       uod = this.l;
       if (uod == null) {
          a.S("giftBackgroundView");
       }
       uod.setBackgroundResource(p0);
       return;
    }
}
