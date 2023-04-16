package com.kuaishou.live.preview.item.winter.LivePreviewMultiColorGradientView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Paint$Style;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.RectF;
import java.lang.Integer;

public class LivePreviewMultiColorGradientView extends View	// class@000e5f
{
    public int b;
    public float c;
    public RectF d;
    public float e;
    public float f;
    public LinearGradient g;
    public final Paint h;
    public int[] i;
    public float[] j;

    public void LivePreviewMultiColorGradientView(Context p0){
       super(p0, null);
    }
    public void LivePreviewMultiColorGradientView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LivePreviewMultiColorGradientView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 4;
       this.c = 0;
       Paint paint = new Paint(1);
       this.h = paint;
       int[] ointArray = new int[]{a1.a(0x7f0606b3),a1.a(0x7f06202f)};
       this.i = ointArray;
       this.j = new float[2]{0,0x3f800000};
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePreviewMultiColorGradientView.class, "1")) {
       }else if(p1 != null){
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.C3);
          this.b = typedArray.getInteger(1, 4);
          this.c = (float)typedArray.getDimensionPixelSize(0, 0);
          typedArray.recycle();
       }
       paint.setAntiAlias(1);
       paint.setDither(1);
       paint.setStyle(Paint$Style.FILL);
       return;
    }
    public final void a(){
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, LivePreviewMultiColorGradientView.class, "4")) {
          return;
       }
       LivePreviewMultiColorGradientView b = obj.b;
       if (b != 1) {
          if (b != 2) {
             if (b != 3) {
                LinearGradient linearGradie = new LinearGradient(0, obj.f, 0, 0, obj.i, obj.j, Shader$TileMode.CLAMP);
                obj.g = b;
             }else {
                LinearGradient linearGradie1 = new LinearGradient(obj.e, 0, 0, 0, obj.i, obj.j, Shader$TileMode.CLAMP);
                obj.g = b;
             }
          }else {
             LinearGradient linearGradie2 = new LinearGradient(0, 0, 0, obj.f, obj.i, obj.j, Shader$TileMode.CLAMP);
             obj.g = b;
          }
       }else {
          LinearGradient linearGradie3 = new LinearGradient(0, 0, obj.e, 0, obj.i, obj.j, Shader$TileMode.CLAMP);
          obj.g = b;
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewMultiColorGradientView.class, "3")) {
          return;
       }
       super.onDraw(p0);
       this.h.setShader(this.g);
       LivePreviewMultiColorGradientView td = this.d;
       if (td != null) {
          p0.drawRoundRect(td, this.c, this.c, this.h);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LivePreviewMultiColorGradientView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LivePreviewMultiColorGradientView.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       float f = (float)p0;
       this.e = f;
       float f1 = (float)p1;
       this.f = f1;
       this.d = new RectF(0, 0, f, f1);
       this.a();
       return;
    }
}
