package com.kuaishou.live.audience.component.like.highfluencymessage.view.HighFluencyMultiLikeView;
import androidx.lifecycle.LifecycleOwner;
import i11.h;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.a;
import androidx.lifecycle.LifecycleRegistry;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.HighFluencyLikeFinishView;
import com.yxcorp.widget.selector.view.SelectShapeConstraintLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import com.kuaishou.live.common.core.component.highfrequency.widget.HighFluencyIncreaseNumberView;
import androidx.appcompat.widget.AppCompatTextView;
import com.kuaishou.live.common.core.component.highfrequency.widget.HighFluencyDecreaseNumberView;
import d61.c0;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.ImageView;
import i11.g;
import android.animation.Animator$AnimatorListener;
import i11.d;
import android.view.View$OnTouchListener;
import i11.b;
import android.view.View$OnClickListener;
import bn1.a;
import androidx.lifecycle.Lifecycle$State;
import java.util.Objects;
import df1.e;
import df1.a;
import z1.a;
import androidx.lifecycle.Lifecycle;
import e93.f;
import com.kwai.framework.model.user.User;
import java.lang.Boolean;
import lq5.a;

public class HighFluencyMultiLikeView extends FrameLayout implements LifecycleOwner, h	// class@000b88
{
    public SelectShapeConstraintLayout b;
    public HighFluencyLikeFinishView c;
    public KwaiImageView d;
    public KwaiImageView e;
    public TextView f;
    public LiveLottieAnimationView g;
    public HighFluencyIncreaseNumberView h;
    public AppCompatTextView i;
    public HighFluencyDecreaseNumberView j;
    public AppCompatTextView k;
    public a l;
    public boolean m;
    public final a n;
    public final a o;
    public final LifecycleRegistry p;
    public a q;
    public e r;
    public boolean s;
    public int t;
    public final float[] u;
    public View$OnClickListener v;
    public static final int w;

    public void HighFluencyMultiLikeView(Context p0){
       super(p0, null);
    }
    public void HighFluencyMultiLikeView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void HighFluencyMultiLikeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a uoa = new a();
       this.n = uoa;
       a uoa1 = new a();
       this.o = uoa1;
       LifecycleRegistry lifecycleReg = new LifecycleRegistry(this);
       this.p = lifecycleReg;
       float[] uofloatArray = new float[2];
       this.u = uofloatArray;
       this.v = e.b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HighFluencyMultiLikeView.class, "6")) {
       }else {
          View view = a.c(this.getContext(), R.layout.arg_RES_7f0d0c0f, this);
          if (!PatchProxy.applyVoidOneRefs(view, this, HighFluencyMultiLikeView.class, "7")) {
             this.c = m1.f(view, 0x7f0a1781);
             this.b = m1.f(view, 0x7f0a1787);
             this.d = m1.f(view, 0x7f0a130c);
             this.f = m1.f(view, 0x7f0a0093);
             this.e = m1.f(view, 0x7f0a0094);
             this.g = m1.f(view, 0x7f0a007e);
             this.h = m1.f(view, 0x7f0a1789);
             this.i = m1.f(view, 0x7f0a3f2c);
             this.j = m1.f(view, 0x7f0a3c01);
             this.k = m1.f(view, 0x7f0a3bf5);
             if (!PatchProxy.applyVoid(objArray, this, HighFluencyMultiLikeView.class, "10")) {
                this.g.setAnimationFromUrl(c0.a.b("/udata/pkg/kwai-client-image/live_like/live_high_fluency_message_like_action_animation.json"));
                this.g.setVisibility(8);
                this.g.a(new g(this));
             }
             if (!PatchProxy.applyVoid(objArray, this, HighFluencyMultiLikeView.class, "9")) {
                this.f.setOnTouchListener(new d(this));
                this.f.setOnClickListener(new b(this));
             }
             if (!PatchProxy.applyVoid(objArray, this, HighFluencyMultiLikeView.class, "8")) {
                uoa.h(this.h, this.i);
                uoa1.h(this.j, this.k);
             }
          }
          lifecycleReg.setCurrentState(Lifecycle$State.STARTED);
       }
       return;
    }
    public void dismiss(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HighFluencyMultiLikeView.class, "2")) {
          return;
       }
       this.p.setCurrentState(Lifecycle$State.DESTROYED);
       HighFluencyMultiLikeView tr = this.r;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoid(objArray, tr, e.class, "2")) {
          e c = tr.c;
          if (c != null) {
             c.m();
          }
       }
       tr = this.q;
       if (tr != null) {
          tr.accept(this.r);
       }
       return;
    }
    public Lifecycle getLifecycle(){
       return this.p;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, HighFluencyMultiLikeView.class, "1")) {
          return;
       }
       super.onDetachedFromWindow();
       this.o.f();
       this.n.f();
       this.p.setCurrentState(Lifecycle$State.DESTROYED);
       f.g(this);
       return;
    }
    public void setAnchorUser(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HighFluencyMultiLikeView.class, "4")) {
          return;
       }
       this.c.setAnchorUser(p0);
       return;
    }
    public void setIsEnableShadow(boolean p0){
       if (PatchProxy.isSupport(HighFluencyMultiLikeView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HighFluencyMultiLikeView.class, "5")) {
          return;
       }
       this.m = p0;
       this.c.setIsEnableShadow(p0);
       return;
    }
    public void setLiveLikeService(a p0){
       this.l = p0;
    }
    public void setOnActionButtonClickListener(View$OnClickListener p0){
       this.v = p0;
    }
}
