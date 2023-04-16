package com.kuaishou.commercial.home.StickerViewStyleTwoLines;
import com.kuaishou.commercial.home.StickerView;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.View;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.widget.FrameLayout;
import android.graphics.RectF;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import android.graphics.Paint$Style;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout$LayoutParams;

public class StickerViewStyleTwoLines extends StickerView	// class@0014d5
{
    public float[] A;
    public RectF B;
    public Paint x;
    public int y;
    public String[] z;
    public static final int C;

    static {
       StickerViewStyleTwoLines.C = n.c(a.a().a(), 0x3f800000);
    }
    public void StickerViewStyleTwoLines(Context p0,View p1){
       int i;
       super(p0, p1);
       this.y = 31;
       this.o.setTypeface(Typeface.DEFAULT_BOLD);
       StickerView tp = this.p;
       if (tp != null && tp.length > 0) {
          this.e = n.c(this.getContext(), (float)this.p[0]);
       }
       tp = this.p;
       if (tp != null) {
          i = 1;
          if (tp.length > i) {
             this.c = n.c(this.getContext(), (float)this.p[i]);
          }
       }
       tp = this.p;
       if (tp != null) {
          i = 2;
          if (tp.length > i) {
             this.f = n.c(this.getContext(), (float)this.p[i]);
          }
       }
       tp = this.p;
       if (tp != null) {
          i = 3;
          if (tp.length > i) {
             this.d = n.c(this.getContext(), (float)this.p[i]);
          }
       }
       this.setWillNotDraw(0);
       this.B = new RectF();
       return;
    }
    public void draw(Canvas p0){
       StickerViewStyleTwoLines tB;
       float f2;
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerViewStyleTwoLines.class, "6")) {
          return;
       }
       super.draw(p0);
       p0.save();
       this.B.left = (float)this.getLeft();
       this.B.top = (float)this.getTop();
       this.B.right = (float)this.getRight();
       this.B.bottom = (float)this.getBottom();
       StickerViewStyleTwoLines tz = this.z;
       if (tz != null && (tz.length > 0 && this.A != null)) {
          int i = 0;
          while (i < this.z.length) {
             StickerViewStyleTwoLines tA = this.A;
             if (i < tA.length) {
                if (!i) {
                   this.B.top = 0;
                }else {
                   tB = this.B;
                   f2 = tB.bottom + (float)StickerViewStyleTwoLines.C;
                   tB.top = f2;
                }
                tB = this.B;
                tB.right = tA[i];
                float f = tB.top + (float)this.y;
                tB.bottom = f;
                p0.drawRect(tB, this.x);
                float f1 = (float)this.e + this.k;
                f2 = this.B.bottom - (float)this.d;
                f2 = f2 - this.o.descent();
                p0.drawText(this.z[i], f1, f2, this.o);
             }
             i = i + 1;
          }
       }
       p0.restore();
       return;
    }
    public int getBottomMargin(){
       Object obj = PatchProxy.apply(null, this, StickerViewStyleTwoLines.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)((double)this.n.getHeight() * 0x3fb47ae147ae147b);
    }
    public int getLayoutId(){
       return 0x7f0d0045;
    }
    public int getTopMargin(){
       Object obj = PatchProxy.apply(null, this, StickerViewStyleTwoLines.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)((double)this.n.getHeight() * 0x3fb47ae147ae147b);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(StickerViewStyleTwoLines.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, StickerViewStyleTwoLines.class, "7")) {
          return;
       }
       super.onMeasure(p0, p1);
       StickerViewStyleTwoLines tz = this.z;
       if (tz != null && tz.length > 0) {
          p1 = 0;
          StickerViewStyleTwoLines tz1 = this.z;
          while (p1 < tz1.length) {
             StickerViewStyleTwoLines tA = this.A;
             if (tA != null && p1 < tA.length) {
                object oobject = tz1[p1];
                Object obj = PatchProxy.applyOneRefs(oobject, this, StickerViewStyleTwoLines.class, "8");
                float f = (obj != PatchProxyResult.class)? obj.floatValue(): this.o.measureText(oobject, 0, oobject.length());
                f = f + (float)this.e;
                f = f + (float)this.f;
                f = f + this.k;
                tA[p1] = f;
             }
             p1++;
          }
       }
       return;
    }
    public void setBackgroundColor(int p0){
       if (PatchProxy.isSupport(StickerViewStyleTwoLines.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StickerViewStyleTwoLines.class, "3")) {
          return;
       }
       super.setBackgroundColor(p0);
       Paint paint = new Paint();
       this.x = paint;
       paint.setColor(this.s);
       this.x.setStyle(Paint$Style.FILL);
       this.x.setAntiAlias(true);
       this.y = n.c(this.getContext(), (float)this.y);
       return;
    }
    public void setStickerTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerViewStyleTwoLines.class, "5")) {
          return;
       }
       this.b = p0;
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       int i = 0;
       int i1 = 14;
       if ((this.b).length() > i1) {
          this.b = (this.b).substring(i, i1);
       }
       StickerView tb = this.b;
       ArrayList uArrayList = Lists.b();
       Object obj = PatchProxy.applyTwoRefs(tb, uArrayList, this, StickerViewStyleTwoLines.class, "4");
       if (obj != PatchProxyResult.class) {
          uArrayList = obj;
       }else if(TextUtils.isEmpty(tb)){
          StickerView tu = this.u;
          int i2 = ((tb.length() + tu) - 1) / tu;
          while (true) {
             int i3 = i2 - 1;
             if (i < i3) {
                tu = this.u;
                int i4 = i * tu;
                int i5 = i + 1;
                i5 = i5 * tu;
                uArrayList.add(tb.substring(i4, i5));
             }else {
                i3 = this.u * i;
                uArrayList.add(tb.substring(i3));
             }
             i = i + 1;
             if (i < i2) {
                continue ;
             }
          }
       }
       if (!uArrayList.isEmpty()) {
          String[] stringArray = new String[uArrayList.size()];
          stringArray = uArrayList.toArray(stringArray);
          this.z = stringArray;
          float[] uofloatArray = new float[stringArray.length];
          this.A = uofloatArray;
       }
       ViewGroup$MarginLayoutParams layoutParams = this.getLayoutParams();
       if (layoutParams == null) {
          layoutParams = new FrameLayout$LayoutParams(-1, -2);
       }
       StickerViewStyleTwoLines tz = this.z;
       layoutParams.height = (this.y * tz.length) + (StickerViewStyleTwoLines.C * (tz.length - 1));
       layoutParams.leftMargin = (int)((float)this.n.getWidth() * this.i);
       layoutParams.rightMargin = (int)((float)this.n.getWidth() * this.j);
       this.setLayoutParams(layoutParams);
       return;
    }
}
