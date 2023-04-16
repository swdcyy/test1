package com.kwai.slide.play.detail.rightactionbar.follow.element.AvatarWithFollow;
import com.yxcorp.gifshow.widget.CustomLayout;
import com.kwai.slide.play.detail.rightactionbar.follow.element.AvatarWithFollow$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.view.View;
import bt7.e;
import com.yxcorp.gifshow.widget.CustomLayout$a;
import android.view.ViewGroup$LayoutParams;
import qrd.l1;
import com.kwai.slide.play.detail.rightactionbar.follow.element.AvatarLiveTipCircle;
import com.yxcorp.gifshow.widget.AvatarWithPendantView;
import com.yxcorp.gifshow.image.KwaiImageView;
import yb.b;
import android.content.res.Resources;
import com.facebook.drawee.generic.RoundingParams;
import lnc.a1;
import xb.t$b;
import yb.a;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import com.kwai.slide.play.detail.rightactionbar.follow.element.FollowButtonView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Integer;
import android.widget.ImageView;
import wsd.m;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$a;
import java.util.Iterator;

public final class AvatarWithFollow extends CustomLayout	// class@00184e
{
    public boolean e;
    public final View f;
    public final AvatarLiveTipCircle g;
    public final AvatarWithPendantView h;
    public final FollowButtonView i;
    public HashMap j;
    public static final AvatarWithFollow$a k;

    static {
       AvatarWithFollow.k = new AvatarWithFollow$a(null);
    }
    public void AvatarWithFollow(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void AvatarWithFollow(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void AvatarWithFollow(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.setClipChildren(false);
       View view = new View(p0);
       view.setId(R.id.slide_play_avatar_click_area);
       int i = 60;
       p2 = (e.b.b())? this.getMATCH_PARENT(): this.f(i);
       view.setLayoutParams(new CustomLayout$a(p2, this.f(i)));
       this.b(view);
       this.f = view;
       AvatarLiveTipCircle uAvatarLiveT = new AvatarLiveTipCircle(p0, null, 0, 6, null);
       view.setId(R.id.slide_play_live_tip);
       view.setLayoutParams(new CustomLayout$a(this.getWRAP_CONTENT(), this.getWRAP_CONTENT()));
       view.setVisibility(8);
       this.b(view);
       this.g = view;
       AvatarWithPendantView uAvatarWithP = new AvatarWithPendantView(p0, null, 0, 6, null);
       view.setId(R.id.follow_avatar_view);
       view.setLayoutParams(new CustomLayout$a(this.getWRAP_CONTENT(), this.getWRAP_CONTENT()));
       view.q(true);
       b uob = new b(view.getResources());
       RoundingParams roundingPara = new RoundingParams();
       roundingPara.q(true);
       roundingPara.k(a1.a(R.color.arg_RES_7f061c32));
       roundingPara.l((float)this.f(true));
       roundingPara.p((float)this.f(true));
       uob.z(roundingPara);
       uob.j(t$b.a);
       view.getAvatar().setHierarchy(uob.a());
       view.setAvatarBorderWidth((float)this.f(5));
       this.b(view);
       this.h = view;
       FollowButtonView uFollowButto = new FollowButtonView(p0, null, 0, 6, null);
       view.setId(R.id.follow_button);
       view.setLayoutParams(new CustomLayout$a(this.getWRAP_CONTENT(), this.getWRAP_CONTENT()));
       this.b(view);
       this.i = view;
       return;
    }
    public void AvatarWithFollow(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final View getAvatarClickArea(){
       return this.f;
    }
    public final AvatarWithPendantView getAvatarView(){
       return this.h;
    }
    public final int getAvatarViewTop(){
       Object obj = PatchProxy.apply(null, this, AvatarWithFollow.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.f(60) - this.h.getMeasuredHeight()) / 2);
    }
    public final FollowButtonView getFollowButton(){
       return this.i;
    }
    public final AvatarLiveTipCircle getLiveTipCircle(){
       return this.g;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(AvatarWithFollow.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, AvatarWithFollow.class, "3")) {
             return;
          }
       }
       AvatarWithFollow tf = this.f;
       CustomLayout uCustomLayou = this;
       CustomLayout.i(uCustomLayou, tf, this.k(tf), 0, false, 4, null);
       tf = this.h;
       CustomLayout.i(uCustomLayou, tf, this.k(tf), this.getAvatarViewTop(), false, 4, null);
       tf = this.g;
       CustomLayout.i(this, tf, this.k(tf), (this.getAvatarViewTop() - ((tf.getMeasuredWidth() - this.h.getAvatar().getMeasuredWidth()) / 2)), false, 4, null);
       tf = this.i;
       Context context = this.getContext();
       a.o(context, "context");
       CustomLayout.i(this, tf, this.k(tf), ((this.getMeasuredHeight() - tf.getMeasuredHeight()) - this.e(e.b.c(context, this.e))), false, 4, null);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(AvatarWithFollow.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, AvatarWithFollow.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       Iterator iterator = ViewGroupKt.b(this).iterator();
       while (iterator.hasNext()) {
          this.c(iterator.next());
       }
       e b = e.b;
       Context context = this.getContext();
       a.o(context, "context");
       this.setMeasuredDimension(this.f.getMeasuredWidth(), ((this.f(70) + this.e(b.c(context, this.e))) + b.d()));
       return;
    }
    public final void setAdapt(boolean p0){
       if (PatchProxy.isSupport(AvatarWithFollow.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AvatarWithFollow.class, "1")) {
          return;
       }
       this.e = p0;
       this.requestLayout();
       return;
    }
}
