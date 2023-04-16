package com.kwai.slide.play.detail.rightactionbar.follow.element.AvatarLiveTipCircle;
import com.yxcorp.gifshow.widget.CustomLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.CustomLayout$a;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.GradientDrawable;
import lnc.a1;
import android.graphics.Color;
import qrd.l1;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.kwai.slide.play.detail.rightactionbar.follow.element.AvatarLiveCircleView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import wsd.m;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$a;
import java.util.Iterator;

public final class AvatarLiveTipCircle extends CustomLayout	// class@00184c
{
    public final AppCompatImageView e;
    public final AvatarLiveCircleView f;
    public HashMap g;

    public void AvatarLiveTipCircle(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void AvatarLiveTipCircle(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void AvatarLiveTipCircle(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.setClipChildren(false);
       AppCompatImageView uAppCompatIm = new AppCompatImageView(p0);
       uAppCompatIm.setId(R.id.live_tip_ring);
       uAppCompatIm.setLayoutParams(new CustomLayout$a(this.f(51), this.f(51)));
       GradientDrawable gradientDraw = new GradientDrawable();
       gradientDraw.setStroke(this.e(0x3fc00000), a1.a(R.color.arg_RES_7f060751));
       gradientDraw.setColor(Color.parseColor("#00FFFFFF"));
       gradientDraw.setShape(1);
       uAppCompatIm.setImageDrawable(gradientDraw);
       this.b(uAppCompatIm);
       this.e = uAppCompatIm;
       AvatarLiveCircleView uAvatarLiveC = new AvatarLiveCircleView(p0);
       uAvatarLiveC.setId(R.id.live_anim_ring_lottieview);
       uAvatarLiveC.setLayoutParams(new CustomLayout$a(this.f(70), this.f(70)));
       uAvatarLiveC.setStrokeColor(a1.a(R.color.arg_RES_7f060751));
       uAvatarLiveC.setStrokeWidth((float)this.f(2));
       this.b(uAvatarLiveC);
       this.f = uAvatarLiveC;
    }
    public void AvatarLiveTipCircle(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final AvatarLiveCircleView getLiveAnimation(){
       return this.f;
    }
    public final AppCompatImageView getLiveInnerCircle(){
       return this.e;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(AvatarLiveTipCircle.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, AvatarLiveTipCircle.class, "2")) {
             return;
          }
       }
       CustomLayout.i(this, this.e, this.k(this), this.j(this), false, 4, null);
       AvatarLiveTipCircle tf = this.f;
       CustomLayout.i(this, tf, ((this.e.getMeasuredWidth() - tf.getMeasuredWidth()) / 2), ((this.e.getMeasuredHeight() - tf.getMeasuredHeight()) / 2), false, 4, null);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(AvatarLiveTipCircle.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, AvatarLiveTipCircle.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       Iterator iterator = ViewGroupKt.b(this).iterator();
       while (iterator.hasNext()) {
          this.c(iterator.next());
       }
       this.setMeasuredDimension(this.e.getMeasuredWidth(), this.e.getMeasuredHeight());
       return;
    }
}
