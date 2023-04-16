package com.kwai.feature.component.photofeatures.reward.widget.MessageShadowContainerView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kwai.feature.component.photofeatures.reward.widget.MessageShadowContainerView$a;
import nsd.u;
import lnc.a1;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.kwai.feature.component.photofeatures.reward.widget.ShadowRoundedHelper;
import com.kwai.feature.component.photofeatures.reward.widget.ShadowRoundedHelper$ArrowPosition;
import com.kwai.feature.component.photofeatures.reward.widget.MessageShadowContainerView$b;
import com.kwai.feature.component.photofeatures.reward.widget.ShadowRoundedHelper$a;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Boolean;
import java.util.Objects;

public final class MessageShadowContainerView extends ConstraintLayout	// class@001267
{
    public float B;
    public boolean C;
    public final ShadowRoundedHelper D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;
    public static final int J;
    public static final int K;
    public static final MessageShadowContainerView$a L;

    static {
       MessageShadowContainerView.L = new MessageShadowContainerView$a(null);
       MessageShadowContainerView.E = a1.a(0x7f0606da);
       MessageShadowContainerView.F = a1.a(0x7f0604cb);
       MessageShadowContainerView.G = a1.d(0x7f0702ab);
       MessageShadowContainerView.H = a1.d(0x7f070422);
       MessageShadowContainerView.I = a1.d(0x7f070429);
       MessageShadowContainerView.J = a1.d(0x7f070271);
       MessageShadowContainerView.K = a1.d(0x7f0702df);
    }
    public void MessageShadowContainerView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void MessageShadowContainerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void MessageShadowContainerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.B = 0xbf800000;
       this.C = true;
       this.setLayerType(true, null);
       ShadowRoundedHelper shadowRounde = new ShadowRoundedHelper(MessageShadowContainerView.E, (float)MessageShadowContainerView.H, MessageShadowContainerView.F, (float)MessageShadowContainerView.G, (float)MessageShadowContainerView.J, (float)MessageShadowContainerView.K, (float)MessageShadowContainerView.I, ShadowRoundedHelper$ArrowPosition.TOP, new MessageShadowContainerView$b(this));
       this.D = true;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MessageShadowContainerView.class, "3")) {
          return;
       }
       if (p0 != null) {
          this.D.a(p0);
       }
       super.dispatchDraw(p0);
       return;
    }
    public final float getArrowX(){
       return this.B;
    }
    public final ShadowRoundedHelper getMHelper(){
       return this.D;
    }
    public final boolean getShowArrow(){
       return this.C;
    }
    public final void setArrowX(float p0){
       if (PatchProxy.isSupport(MessageShadowContainerView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, MessageShadowContainerView.class, "1")) {
          return;
       }
       this.B = p0;
       this.D.b(p0);
       return;
    }
    public final void setShowArrow(boolean p0){
       String str = "2";
       if (PatchProxy.isSupport(MessageShadowContainerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MessageShadowContainerView.class, str)) {
          return;
       }
       this.C = p0;
       MessageShadowContainerView tD = this.D;
       Objects.requireNonNull(tD);
       if (!PatchProxy.isSupport(ShadowRoundedHelper.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), tD, ShadowRoundedHelper.class, str)) {
          tD.c = p0;
          tD.o.a();
       }
       return;
    }
}
