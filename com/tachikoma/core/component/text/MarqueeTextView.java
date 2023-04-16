package com.tachikoma.core.component.text.MarqueeTextView;
import android.widget.TextView;
import iq8.n;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.text.TextPaint;
import android.graphics.Paint;
import java.lang.Boolean;
import java.lang.Integer;
import iq8.m;
import hp8.f;
import java.lang.Runnable;
import android.os.Handler;

public class MarqueeTextView extends TextView	// class@000d8b
{
    public final float b;
    public float c;
    public int d;
    public String e;
    public float f;
    public float g;
    public float h;
    public boolean i;
    public m j;
    public static final int k;

    static {
       MarqueeTextView.k = n.b(20);
    }
    public void MarqueeTextView(Context p0){
       super(p0, null);
    }
    public void MarqueeTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.i = true;
       this.b = ((c.c(p0.getResources()).density * 12.00f) * 48.00f) / 1000.00f;
    }
    public final float getScrollInitialValue(){
       return (- this.h);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MarqueeTextView.class, "2")) {
          return;
       }
       super.onDraw(p0);
       this.d = this.getWidth();
       if (!TextUtils.isEmpty(this.e) && (this.f - null > 0 && this.d > null)) {
          float f = - this.g;
          while (f - (float)this.d < 0) {
             p0.drawText(this.e, f, this.c, this.getPaint());
             float f1 = this.f + (float)MarqueeTextView.k;
             f = f + f1;
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(MarqueeTextView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, MarqueeTextView.class, "1")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.c = (float)(int)((float)(this.getHeight() / 2) - ((this.getPaint().descent() + this.getPaint().ascent()) / 2.00f));
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MarqueeTextView.class, "3")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       MarqueeTextView te = this.e;
       if (te == null || !te.equals(p0)) {
          this.e = p0;
          this.f = this.getPaint().measureText(this.e);
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, MarqueeTextView.class, "9") && this.j == null) {
          this.j = new m(48, new f(this));
       }
       this.postInvalidate();
       if (!PatchProxy.applyVoid(objArray, this, MarqueeTextView.class, "5")) {
          MarqueeTextView tj = this.j;
          if (tj != null && !(tj.c ^ 0x01)) {
             if (!PatchProxy.applyVoid(objArray, tj, m.class, "2") && tj.c != null) {
                tj.c = false;
                tj.sendEmptyMessage(false);
             }
             this.i = false;
          }
       }
       return;
    }
}
