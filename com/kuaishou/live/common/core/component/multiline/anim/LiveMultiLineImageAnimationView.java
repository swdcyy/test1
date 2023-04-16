package com.kuaishou.live.common.core.component.multiline.anim.LiveMultiLineImageAnimationView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kuaishou.live.common.core.component.multiline.anim.LiveMultiLineImageAnimationView$a;
import nsd.u;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import android.content.Context;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import android.widget.ImageView;
import iq1.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import android.util.Size;
import usd.q;
import android.view.View$MeasureSpec;

public final class LiveMultiLineImageAnimationView extends ConstraintLayout	// class@0014e6
{
    public final KwaiImageView B;
    public c C;
    public HashMap D;
    public static final List E;
    public static final LiveMultiLineImageAnimationView$a F;

    static {
       LiveMultiLineImageAnimationView.F = new LiveMultiLineImageAnimationView$a(null);
       LiveMultiLineImageAnimationView.E = LiveLogTag.LIVE_MULTI_LINE.appendTag("MultiLineAnimationView");
    }
    public void LiveMultiLineImageAnimationView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void LiveMultiLineImageAnimationView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void LiveMultiLineImageAnimationView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       KwaiImageView kwaiImageVie = new KwaiImageView(this.getContext());
       this.B = kwaiImageVie;
       this.addView(kwaiImageVie);
    }
    public final KwaiImageView getAnimationView(){
       return this.B;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = 2;
       if (PatchProxy.isSupport(LiveMultiLineImageAnimationView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveMultiLineImageAnimationView.class, "3")) {
             return;
          }
       }
       if (this.B.getVisibility() == 8) {
          return;
       }else {
          LiveMultiLineImageAnimationView tC = this.C;
          if (tC != null) {
             float f = (float)i;
             float f1 = (float)p1 + ((tC.a + (tC.c / f)) * (float)(p3 - p1));
             float f2 = (float)p2 + ((tC.b + (tC.d / f)) * (float)(p4 - p2));
             int i1 = (int)(f1 - (float)(this.B.getMeasuredWidth() / i));
             f1 = (int)(f1 + (float)(this.B.getMeasuredWidth() / i));
             p3 = (int)(f2 - (float)(this.B.getMeasuredHeight() / i));
             f2 = (int)(f2 + (float)(this.B.getMeasuredHeight() / i));
             b.P(LiveMultiLineImageAnimationView.E, "onLayout l: "+i1+", r: "+f1+", t: "+p3+", b: "+f2);
             this.B.layout(i1, p3, f1, f2);
          }
          return;
       }
    }
    public void onMeasure(int p0,int p1){
       Size size;
       if (PatchProxy.isSupport(LiveMultiLineImageAnimationView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveMultiLineImageAnimationView.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       if (this.B.getVisibility() == 8) {
          return;
       }
       LiveMultiLineImageAnimationView tC = this.C;
       if (tC != null) {
          p1 = this.getMeasuredWidth();
          if (PatchProxy.isSupport(LiveMultiLineImageAnimationView.class)) {
             size = PatchProxy.applyTwoRefs(Integer.valueOf(p1), tC, this, LiveMultiLineImageAnimationView.class, "4");
             if (size != PatchProxyResult.class) {
             }else if(tC.a() - (float)0 > 0){
                p1 = q.u((int)((float)p1 * tC.a()), tC.f);
                size = new Size(p1, ((int)tC.g * p1));
             }else {
                size = new Size(tC.h, tC.i);
             }
          }else {
             goto label_004c ;
          }
          this.B.measure(View$MeasureSpec.makeMeasureSpec(size.getWidth(), 0x40000000), View$MeasureSpec.makeMeasureSpec(size.getHeight(), 0x40000000));
          b.P(LiveMultiLineImageAnimationView.E, "onMeasure w: "+this.B.getMeasuredWidth()+", h: "+this.B.getMeasuredHeight());
       }
       return;
    }
    public final void setLayoutInfo(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineImageAnimationView.class, "1")) {
          return;
       }
       a.p(p0, "animationLayoutInfo");
       this.C = p0;
       this.requestLayout();
       return;
    }
}
