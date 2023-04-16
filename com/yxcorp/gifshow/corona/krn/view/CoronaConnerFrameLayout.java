package com.yxcorp.gifshow.corona.krn.view.CoronaConnerFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import lnc.a1;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.Choreographer;
import com.yxcorp.gifshow.corona.krn.view.CoronaConnerFrameLayout$b;
import android.view.Choreographer$FrameCallback;
import java.lang.Integer;
import com.yxcorp.gifshow.corona.krn.view.CoronaConnerFrameLayout$a;
import android.view.ViewOutlineProvider;

public class CoronaConnerFrameLayout extends FrameLayout	// class@001289
{
    public int b;

    public void CoronaConnerFrameLayout(Context p0){
       super(p0);
       this.b = a1.d(0x7f07034b);
       this.a(p0, null);
    }
    public void CoronaConnerFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = a1.d(0x7f07034b);
       this.a(p0, p1);
    }
    public void CoronaConnerFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = a1.d(0x7f07034b);
       this.a(p0, p1);
    }
    public final void a(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoronaConnerFrameLayout.class, "2")) {
          return;
       }
       Choreographer.getInstance().postFrameCallback(new CoronaConnerFrameLayout$b(this));
       return;
    }
    public void setConnerSize(int p0){
       if (PatchProxy.isSupport(CoronaConnerFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CoronaConnerFrameLayout.class, "1")) {
          return;
       }
       this.b = p0;
       this.setOutlineProvider(new CoronaConnerFrameLayout$a(this));
       this.setClipToOutline(true);
       this.setClipChildren(true);
       this.invalidate();
       return;
    }
}
