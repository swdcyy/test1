package com.yxcorp.gifshow.growth.home.pymk.widget.RecommendAvatarWithLiving;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.growth.home.pymk.widget.RecommendAvatarWithLiving$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.library.widget.specific.misc.CircleWithStrokeView;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import lnc.a1;
import android.animation.AnimatorSet;

public final class RecommendAvatarWithLiving extends FrameLayout	// class@0013a9
{
    public CircleWithStrokeView b;
    public AnimatorSet c;
    public AnimatorSet d;
    public View e;
    public View f;
    public KwaiImageView g;
    public View h;
    public static final RecommendAvatarWithLiving$a i;

    static {
       RecommendAvatarWithLiving.i = new RecommendAvatarWithLiving$a(null);
    }
    public void RecommendAvatarWithLiving(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void RecommendAvatarWithLiving(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void RecommendAvatarWithLiving(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.setClipChildren(false);
       FrameLayout.inflate(p0, R.layout.arg_RES_7f0d12c3, this);
       View view = this.findViewById(R.id.slide_play_live_tip);
       a.o(view, "findViewById\(R.id.slide_play_live_tip\)");
       this.e = view;
       view = this.findViewById(R.id.live_tip_ring);
       a.o(view, "findViewById\(R.id.live_tip_ring\)");
       this.f = view;
       this.b = this.findViewById(0x7f0a18dc);
       view = this.findViewById(R.id.user_avatar);
       a.o(view, "findViewById\(R.id.user_avatar\)");
       this.g = view;
       view = this.findViewById(R.id.living_text);
       a.o(view, "findViewById\(R.id.living_text\)");
       this.h = view;
    }
    public void RecommendAvatarWithLiving(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(boolean p0){
       if (PatchProxy.isSupport(RecommendAvatarWithLiving.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RecommendAvatarWithLiving.class, "5")) {
          return;
       }
       int i = (p0)? 0: 8;
       this.e.setVisibility(i);
       RecommendAvatarWithLiving tb = this.b;
       if (tb != null) {
          tb.setVisibility(i);
       }
       this.f.setVisibility(i);
       this.h.setVisibility(i);
       return;
    }
    public final void b(boolean p0){
       if (PatchProxy.isSupport(RecommendAvatarWithLiving.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RecommendAvatarWithLiving.class, "2")) {
          return;
       }
       a hierarchy = this.g.getHierarchy();
       RoundingParams roundingPara = (hierarchy != null)? hierarchy.n(): null;
       if (roundingPara == null) {
          roundingPara = new RoundingParams();
       }
       if (p0) {
          roundingPara.j(a1.a(R.color.arg_RES_7f061be0), (float)a1.d(R.dimen.arg_RES_7f0702e3));
          a.o(roundingPara, "roundingParams.setBorder¡­en_2dp\).toFloat\(\)\n      \)");
       }else {
          roundingPara.k(a1.a(R.color.arg_RES_7f061c31));
       }
       a hierarchy1 = this.g.getHierarchy();
       a.o(hierarchy1, "mAvatarView.hierarchy");
       hierarchy1.L(roundingPara);
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, RecommendAvatarWithLiving.class, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, RecommendAvatarWithLiving.class, "6")) {
          RecommendAvatarWithLiving tc = this.c;
          if (tc != null) {
             tc.cancel();
          }
          tc = this.c;
          if (tc != null) {
             tc.removeAllListeners();
          }
          tc = this.d;
          if (tc != null) {
             tc.cancel();
          }
          tc = this.d;
          if (tc != null) {
             tc.removeAllListeners();
          }
          this.c = null;
          this.d = null;
          tc = this.b;
          if (tc != null) {
             tc.clearAnimation();
          }
       }
       this.a(false);
       return;
    }
    public final KwaiImageView getMAvatarView(){
       return this.g;
    }
    public final void setMAvatarView(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecommendAvatarWithLiving.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.g = p0;
       return;
    }
}
