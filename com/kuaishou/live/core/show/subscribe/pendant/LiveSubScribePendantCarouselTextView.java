package com.kuaishou.live.core.show.subscribe.pendant.LiveSubScribePendantCarouselTextView;
import android.widget.TextView;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
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
import com.yxcorp.utility.TextUtils;
import android.text.TextPaint;
import android.graphics.Paint;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import ekd.y0;
import yk2.m;
import java.lang.Runnable;

public class LiveSubScribePendantCarouselTextView extends TextView	// class@001149
{
    public final float b;
    public float c;
    public int d;
    public String e;
    public float f;
    public float g;
    public boolean h;
    public y0 i;
    public static final int j;

    static {
       LiveSubScribePendantCarouselTextView.j = n.c(a.b(), 8.00f);
    }
    public void LiveSubScribePendantCarouselTextView(Context p0){
       super(p0, null);
    }
    public void LiveSubScribePendantCarouselTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.h = true;
       this.b = ((c.c(p0.getResources()).density * 12.00f) * 48.00f) / 1000.00f;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubScribePendantCarouselTextView.class, "2")) {
          return;
       }
       super.onDraw(p0);
       if (!TextUtils.x(this.e)) {
          LiveSubScribePendantCarouselTextView tf = this.f;
          float f = 0;
          if (tf - f > 0) {
             LiveSubScribePendantCarouselTextView td = this.d;
             if (td > null) {
                float f1 = - this.g;
                if (tf - (float)td <= 0) {
                   p0.drawText(this.e, f, this.c, this.getPaint());
                   return;
                }else {
                   p0.drawText(this.e, f1, this.c, this.getPaint());
                }
             }
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveSubScribePendantCarouselTextView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveSubScribePendantCarouselTextView.class, "1")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.c = (float)(int)((float)(this.getHeight() / 2) - ((this.getPaint().descent() + this.getPaint().ascent()) / 2.00f));
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubScribePendantCarouselTextView.class, "5")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       LiveSubScribePendantCarouselTextView te = this.e;
       if (te == null || !te.equals(p0)) {
          this.e = p0;
          this.f = this.getPaint().measureText(this.e);
       }
       this.d = this.getLayoutParams().width;
       if (!PatchProxy.applyVoid(null, this, LiveSubScribePendantCarouselTextView.class, "6") && this.i == null) {
          this.i = new y0(48, new m(this));
       }
       this.postInvalidate();
       return;
    }
}
