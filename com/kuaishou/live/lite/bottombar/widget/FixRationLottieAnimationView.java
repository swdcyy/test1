package com.kuaishou.live.lite.bottombar.widget.FixRationLottieAnimationView;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import com.kuaishou.live.lite.bottombar.widget.FixRationLottieAnimationView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.ImageView;
import android.graphics.Paint;
import java.lang.StringBuilder;
import java.lang.Integer;
import android.view.View$MeasureSpec;

public final class FixRationLottieAnimationView extends LiveLottieAnimationView	// class@001ed7
{
    public Paint u;
    public static final FixRationLottieAnimationView$a v;

    static {
       FixRationLottieAnimationView.v = new FixRationLottieAnimationView$a(null);
    }
    public void FixRationLottieAnimationView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void FixRationLottieAnimationView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void FixRationLottieAnimationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void FixRationLottieAnimationView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FixRationLottieAnimationView.class, "2")) {
          return;
       }
       super.dispatchDraw(p0);
       FixRationLottieAnimationView tu = this.u;
       if (tu != null) {
          if (p0 != null) {
             p0.drawRect(0, 0, (float)this.getWidth(), (float)this.getHeight(), tu);
          }
          if (p0 != null) {
             p0.drawText("w: "+this.getWidth()+" , h: "+this.getHeight(), 10.00f, 40.00f, tu);
          }
          if (p0 != null) {
             p0.drawText("ration: "+((float)this.getHeight() / (float)this.getWidth())+", except: 0.6984127", 10.00f, 80.00f, tu);
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(FixRationLottieAnimationView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, FixRationLottieAnimationView.class, "1")) {
          return;
       }
       p0 = View$MeasureSpec.getSize(p0);
       super.onMeasure(View$MeasureSpec.makeMeasureSpec(p0, 0x40000000), View$MeasureSpec.makeMeasureSpec((int)((float)p0 * 0x3f32cb2d), 0x40000000));
       return;
    }
}
