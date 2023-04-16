package com.kuaishou.merchant.marketing.base.animate.BaseTopRightPendantView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.FrameLayout;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import z1.a;

public abstract class BaseTopRightPendantView extends ConstraintLayout	// class@001aef
{
    public FrameLayout B;
    public FrameLayout C;
    public Animator D;
    public a E;
    public Context F;
    public String G;

    public void BaseTopRightPendantView(Context p0){
       super(p0, null);
    }
    public void BaseTopRightPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void BaseTopRightPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.G = "";
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseTopRightPendantView.class, "1")) {
       }else {
          this.F = p0;
          this.G = this.getLogTag();
          LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d0867, this);
          this.setClipChildren(false);
          this.setClipToPadding(false);
          this.B = this.findViewById(0x7f0a0eee);
          FrameLayout uFrameLayout = this.findViewById(R.id.fl_animate_container);
          this.C = uFrameLayout;
          uFrameLayout.setVisibility(8);
       }
       return;
    }
    public abstract View L();
    public abstract View M();
    public final String getLogTag(){
       Object obj = PatchProxy.apply(null, this, BaseTopRightPendantView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AnimateDelegate-"+this.getClass().getSimpleName();
    }
    public void setEnterAnimatorQueueConsumer(a p0){
       this.E = p0;
    }
}
