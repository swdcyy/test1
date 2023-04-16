package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveClipBoundTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextPaint;
import android.widget.TextView;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Path$Direction;
import android.view.View;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Float;
import rm1.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Objects;
import rm1.c$a;
import p1.a;

public class LiveClipBoundTextView extends AppCompatTextView	// class@00120e
{
    public TextPaint f;
    public Path g;
    public RectF h;
    public float[] i;
    public float j;

    public void LiveClipBoundTextView(Context p0){
       super(p0, null);
    }
    public void LiveClipBoundTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.g = new Path();
       this.h = new RectF();
       this.j = 0;
       this.f = this.getPaint();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.N2);
       float f = (float)typedArray.getDimensionPixelOffset(2, 0);
       float f1 = (float)typedArray.getDimensionPixelOffset(3, 0);
       float f2 = (float)typedArray.getDimensionPixelOffset(0, 0);
       float f3 = (float)typedArray.getDimensionPixelOffset(1, 0);
       float[] uofloatArray = new float[]{f,f,f1,f1,f3,f3,f2,f2};
       this.i = uofloatArray;
       typedArray.recycle();
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveClipBoundTextView.class, "4")) {
          return;
       }
       this.g.reset();
       this.h.set(0, 0, this.j, (float)this.getHeight());
       this.g.addRoundRect(this.h, this.i, Path$Direction.CCW);
       p0.clipPath(this.g);
       super.draw(p0);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveClipBoundTextView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveClipBoundTextView.class, "3")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (!this.j - null) {
          this.j = (this.f.measureText(TextUtils.j(this.getText()).toString()) + (float)this.getPaddingLeft()) + (float)this.getPaddingRight();
       }
       return;
    }
    public void setClipWidth(float p0){
       if (PatchProxy.isSupport(LiveClipBoundTextView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveClipBoundTextView.class, "1")) {
          return;
       }
       this.j = p0;
       this.invalidate();
       return;
    }
    public void setTextAlpha(float p0){
       int i;
       String str = "2";
       if (PatchProxy.isSupport(LiveClipBoundTextView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveClipBoundTextView.class, str)) {
          return;
       }
       int currentTextC = this.getCurrentTextColor();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          c$a obj = PatchProxy.applyTwoRefs(Integer.valueOf(currentTextC), Float.valueOf(p0), null, uoc, str);
          if (obj != patchProxyRe) {
             i = obj.intValue();
          }else {
          label_003d :
             obj = c.a;
             Objects.requireNonNull(obj);
             if (PatchProxy.isSupport(c$a.class)) {
                Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(currentTextC), Float.valueOf(p0), obj, c$a.class, str);
                if (obj1 != patchProxyRe) {
                   i = obj1.intValue();
                }
             }
             if (p0 < 0 || p0 - 0x3f800000 > 0) {
                p0 = 0x3f800000;
             }
             i = a.d(currentTextC, (int)((float)255 * p0));
          }
       }else {
          goto label_003d ;
       }
       this.setTextColor(i);
       return;
    }
}
