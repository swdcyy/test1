package com.kuaishou.live.gzone.widget.LiveGzoneLandscapeGradientMaskView;
import android.view.View;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Canvas;
import java.lang.Integer;

public class LiveGzoneLandscapeGradientMaskView extends View	// class@001cf7
{
    public LinearGradient b;
    public int[] c;
    public float[] d;
    public int e;
    public int f;
    public Paint g;

    public void LiveGzoneLandscapeGradientMaskView(Context p0){
       super(p0);
       this.g = new Paint(1);
    }
    public void LiveGzoneLandscapeGradientMaskView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.g = new Paint(1);
    }
    public void LiveGzoneLandscapeGradientMaskView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = new Paint(1);
    }
    public void a(int[] p0,float[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneLandscapeGradientMaskView.class, "2")) {
          return;
       }
       this.c = p0;
       this.d = p1;
       this.b();
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneLandscapeGradientMaskView.class, "3")) {
          return;
       }
       if (this.getWidth() && this.getHeight()) {
          LiveGzoneLandscapeGradientMaskView tc = this.c;
          if (tc != null) {
             LiveGzoneLandscapeGradientMaskView td = this.d;
             if (td == null || (!tc.length || (td.length && (this.b == null || (this.e != this.getWidth() || this.f != this.getHeight()))))) {
                this.e = this.getWidth();
                this.f = this.getHeight();
                LinearGradient linearGradie = new LinearGradient(0, 0, 0, (float)this.getHeight(), this.c, this.d, Shader$TileMode.CLAMP);
                this.b = tc;
                this.g.setShader(tc);
                this.invalidate();
             }
          }
       }
    label_0065 :
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneLandscapeGradientMaskView.class, "4")) {
          return;
       }
       super.onDraw(p0);
       if (this.b != null) {
          p0.drawRect(0, 0, (float)this.getWidth(), (float)this.getHeight(), this.g);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveGzoneLandscapeGradientMaskView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveGzoneLandscapeGradientMaskView.class, "1")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.b();
       return;
    }
}
