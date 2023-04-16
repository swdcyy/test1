package com.kuaishou.live.audience.component.like.highfluencymessage.view.HighFluencyLocalLikeView;
import androidx.lifecycle.LifecycleOwner;
import i11.h;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.LifecycleRegistry;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import com.yxcorp.widget.selector.view.SelectShapeConstraintLayout;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.HighFluencyLikeFinishView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.graphics.Typeface;
import d61.f0;
import j11.b;
import androidx.lifecycle.Lifecycle$State;
import java.lang.Integer;
import df1.a;
import z1.a;
import androidx.lifecycle.Lifecycle;
import com.kwai.framework.model.user.User;

public class HighFluencyLocalLikeView extends FrameLayout implements LifecycleOwner, h	// class@000b87
{
    public SelectShapeConstraintLayout b;
    public HighFluencyLikeFinishView c;
    public KwaiImageView d;
    public TextView e;
    public TextView f;
    public TextView g;
    public TextView h;
    public b i;
    public boolean j;
    public final LifecycleRegistry k;
    public a l;
    public a m;
    public static final int n;

    public void HighFluencyLocalLikeView(Context p0){
       super(p0, null);
    }
    public void HighFluencyLocalLikeView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void HighFluencyLocalLikeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       LifecycleRegistry lifecycleReg = new LifecycleRegistry(this);
       this.k = lifecycleReg;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HighFluencyLocalLikeView.class, "6")) {
       }else {
          View view = a.c(this.getContext(), R.layout.arg_RES_7f0d0c0e, this);
          if (!PatchProxy.applyVoidOneRefs(view, this, HighFluencyLocalLikeView.class, "7")) {
             this.b = m1.f(view, 0x7f0a1787);
             this.c = m1.f(view, 0x7f0a1781);
             this.d = m1.f(view, 0x7f0a130c);
             this.e = m1.f(view, 0x7f0a1789);
             this.f = m1.f(view, 0x7f0a45c0);
             this.g = m1.f(view, 0x7f0a3f2c);
             this.h = m1.f(view, 0x7f0a3bf5);
             if (!PatchProxy.applyVoid(objArray, this, HighFluencyLocalLikeView.class, "8")) {
                f0.j(this.e, Typeface.SANS_SERIF, 1);
                f0.j(this.f, Typeface.SANS_SERIF, 1);
             }
          }
          this.i = new b(this.e);
          lifecycleReg.setCurrentState(Lifecycle$State.STARTED);
       }
       return;
    }
    public final void a(TextView p0,int p1){
       if (PatchProxy.isSupport(HighFluencyLocalLikeView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, HighFluencyLocalLikeView.class, "4")) {
          return;
       }
       p0.setShadowLayer(3.00f, 0, 3.00f, p1);
       return;
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, HighFluencyLocalLikeView.class, "2")) {
          return;
       }
       this.k.setCurrentState(Lifecycle$State.DESTROYED);
       this.m.m();
       HighFluencyLocalLikeView tl = this.l;
       if (tl != null) {
          tl.accept(this.m);
       }
       return;
    }
    public Lifecycle getLifecycle(){
       return this.k;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, HighFluencyLocalLikeView.class, "1")) {
          return;
       }
       super.onDetachedFromWindow();
       this.k.setCurrentState(Lifecycle$State.DESTROYED);
       this.j = false;
       return;
    }
    public void setAnchorUser(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HighFluencyLocalLikeView.class, "5")) {
          return;
       }
       this.c.setAnchorUser(p0);
       return;
    }
    public void setIsEnableShadow(boolean p0){
       this.j = p0;
    }
}
