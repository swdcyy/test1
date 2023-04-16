package com.yxcorp.gifshow.widget.TextWithEndTagView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.TextWithEndTagView$f;
import com.yxcorp.gifshow.widget.TextWithEndTagView$e;
import com.yxcorp.gifshow.widget.TextWithEndTagView$d;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.yxcorp.gifshow.widget.TextWithEndTagView$c;
import com.yxcorp.gifshow.widget.TextWithEndTagView$b;
import android.text.TextPaint;
import android.graphics.Paint$Align;
import android.graphics.Paint;
import android.graphics.Canvas;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Boolean;
import android.text.StaticLayout;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import android.view.View$MeasureSpec;
import java.lang.Math;
import android.os.Build$VERSION;
import android.text.StaticLayout$Builder;
import android.text.Layout$Alignment;
import android.text.TextUtils$TruncateAt;
import java.lang.reflect.Field;
import android.text.Spannable;
import android.view.MotionEvent;
import com.yxcorp.gifshow.widget.TextWithEndTagView$a;
import android.view.ViewConfiguration;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.text.TextUtils;
import android.graphics.drawable.BitmapDrawable;
import androidx.core.graphics.drawable.a;
import android.graphics.Paint$FontMetricsInt;
import android.text.style.ClickableSpan;
import android.text.Selection;
import tyc.m5;
import lnc.c3$a;
import lnc.c3;
import tyc.l5;
import tyc.i5;
import tyc.k5;
import tyc.j5;
import android.graphics.Typeface;
import tyc.n5;

public class TextWithEndTagView extends View	// class@0018db
{
    public TextWithEndTagView$f b;
    public TextWithEndTagView$e c;
    public TextWithEndTagView$d d;
    public TextWithEndTagView$c e;
    public final TextWithEndTagView$b f;
    public TextPaint g;
    public TextPaint h;
    public Paint i;
    public Paint j;
    public StaticLayout k;
    public boolean l;
    public boolean m;
    public static final int n;

    public void TextWithEndTagView(Context p0){
       super(p0, null);
    }
    public void TextWithEndTagView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void TextWithEndTagView(Context p0,AttributeSet p1,int p2){
       TextWithEndTagView e;
       int color;
       int resourceId;
       TextWithEndTagView$f uof = this;
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.H5);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uof, TextWithEndTagView.class, "24")) {
       }else {
          uof.b = new TextWithEndTagView$f(this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
       }
       TextWithEndTagView$c uoc = 0xff000000;
       TextWithEndTagView$c uoc1 = 10;
       int i = 0;
       String str = 1;
       if (!PatchProxy.applyVoidOneRefs(typedArray, uof, TextWithEndTagView.class, "25")) {
          TextWithEndTagView$e uoe = v11;
          TextWithEndTagView$e uoe1 = v11;
          uoe = new TextWithEndTagView$e(typedArray.getInt(i, i), typedArray.getInt(2, str), (float)typedArray.getDimensionPixelSize(str, i), typedArray.getString(24), typedArray.getDimensionPixelSize(30, uoc1), typedArray.getColor(25, uoc), typedArray.getColor(26, i), typedArray.getFloat(27, 0), typedArray.getFloat(28, 0), typedArray.getFloat(29, 0));
          uof.c = uoe1;
       }
       if (!PatchProxy.applyVoidOneRefs(typedArray, uof, TextWithEndTagView.class, "26")) {
          resourceId = typedArray.getDimensionPixelOffset(11, i);
          color = typedArray.getDimensionPixelOffset(13, resourceId);
          int dimensionPix = typedArray.getDimensionPixelOffset(15, resourceId);
          int dimensionPix1 = typedArray.getDimensionPixelOffset(14, resourceId);
          int dimensionPix2 = typedArray.getDimensionPixelOffset(12, resourceId);
          resourceId = typedArray.getDimensionPixelOffset(8, i);
          int dimensionPix3 = typedArray.getDimensionPixelOffset(9, resourceId);
          int dimensionPix4 = typedArray.getDimensionPixelOffset(uoc1, resourceId);
          TextWithEndTagView$d uod = new TextWithEndTagView$d(color, dimensionPix, dimensionPix1, dimensionPix2, typedArray.getDimensionPixelOffset(6, i), dimensionPix3, dimensionPix4, (float)typedArray.getDimensionPixelSize(16, i));
          uof.d = str;
       }
       if (!PatchProxy.applyVoidOneRefs(typedArray, uof, TextWithEndTagView.class, "27")) {
          color = typedArray.getColor(3, i);
          int i1 = -1;
          resourceId = typedArray.getResourceId(4, i1);
          Bitmap uBitmap = (resourceId != i1)? BitmapFactory.decodeResource(this.getResources(), resourceId): objArray;
          TextWithEndTagView$c uoc2 = v14;
          TextWithEndTagView$c uoc3 = v14;
          uoc2 = new TextWithEndTagView$c(color, uBitmap, typedArray.getDimensionPixelSize(7, i), typedArray.getDimensionPixelSize(5, i), typedArray.getString(17), (float)typedArray.getDimensionPixelSize(23, uoc1), typedArray.getColor(18, uoc), typedArray.getColor(19, i), (float)typedArray.getDimensionPixelSize(20, i), (float)typedArray.getDimensionPixelSize(21, i), (float)typedArray.getDimensionPixelSize(22, i));
          uof.e = uoc3;
       }
       typedArray.recycle();
       uof.f = new TextWithEndTagView$b(5);
       if (!PatchProxy.applyVoid(null, uof, TextWithEndTagView.class, "38")) {
          if (uof.g == null) {
             uof.g = new TextPaint(1);
          }
          uof.g.setTextSize((float)uof.c.e);
          uof.g.setColor(uof.c.f);
          uof.g.setTextAlign(Paint$Align.LEFT);
          e = uof.c;
          TextWithEndTagView$e g = e.g;
          if (g > null) {
             uof.g.setShadowLayer(e.j, e.h, e.i, g);
          }
       }
       if (!PatchProxy.applyVoid(null, uof, TextWithEndTagView.class, "39")) {
          if (uof.h == null) {
             uof.h = new TextPaint(1);
          }
          uof.h.setColor(uof.e.i);
          uof.h.setTextSize(uof.e.h);
          e = uof.e;
          TextWithEndTagView$c j = e.j;
          if (j > null) {
             uof.h.setShadowLayer(e.m, e.k, e.l, j);
          }
       }
       if (!PatchProxy.applyVoid(null, uof, TextWithEndTagView.class, "40")) {
          if (uof.j == null) {
             uof.j = new Paint(1);
          }
          uof.j.setColor(uof.e.a);
       }
       if (!PatchProxy.applyVoid(null, uof, TextWithEndTagView.class, "41") && uof.i == null) {
          uof.i = new Paint(1);
       }
       return;
    }
    public final boolean a(){
       boolean b = (this.c != null && (this.b != null && (this.d == null || this.e == null)))? true: false;
       return b;
    }
    public final void b(Canvas p0,int p1,float p2,boolean p3){
       int this;
       if (PatchProxy.isSupport(TextWithEndTagView.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), Boolean.valueOf(p3), this, TextWithEndTagView.class, "34")) {
          return;
       }
       p0.save();
       float f = this.g.measureText("бн");
       int lineStart = this.k.getLineStart(p1);
       int lineEnd = this.k.getLineEnd(p1);
       float lineWidth = this.k.getLineWidth(p1);
       this = lineEnd;
       while (this >= lineStart) {
          try{
             float f1 = this.g.measureText(this.c.d, this, lineEnd);
             float f2 = lineWidth + f;
             f2 = f2 + p2;
             f2 = f2 - f1;
             if (f2 - (float)this.k.getWidth() <= 0) {
                lineWidth = lineWidth - f1;
                break ;
             }else {
                this--;
             }
          }catch(java.lang.Exception e0){
          }
       }
       if (p3 && !p2) {
          p0.translate(((((float)this.k.getWidth() - lineWidth) - f) / 2.00f), 0);
       }
       p0.drawText("бн", lineWidth, (float)this.k.getLineBaseline(p1), this.g);
       p0.clipRect(0, (float)this.k.getLineTop(p1), lineWidth, (float)this.k.getLineBottom(p1));
       this.k.draw(p0);
       p0.restore();
       return;
    }
    public final void c(Canvas p0,int p1,int p2){
       if (PatchProxy.isSupport(TextWithEndTagView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TextWithEndTagView.class, "33")) {
          return;
       }
       for (; p1 <= p2; p1++) {
          p0.save();
          float f = (float)this.k.getWidth() - this.k.getLineWidth(p1);
          f = f / 2.00f;
          p0.clipRect(0, this.k.getLineTop(p1), this.k.getWidth(), this.k.getLineBottom(p1));
          p0.translate(f, 0);
          this.k.draw(p0);
          p0.restore();
       }
       return;
    }
    public final StaticLayout d(int p0){
       TextWithEndTagView obj;
       StaticLayout staticLayout;
       boolean b = this;
       if (PatchProxy.isSupport(TextWithEndTagView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), b, TextWithEndTagView.class, "30");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       boolean i = 0;
       int i1 = Math.max(i, (View$MeasureSpec.getSize(p0) - b.b.a()));
       obj = b.d;
       int b1 = (((i1 - obj.i) - obj.a()) <= 0)? true: false;
       b.m = b1;
       b1 = (b1)? b.c.b - 1: b.c.b;
       try{
          int i2 = b1;
          if (Build$VERSION.SDK_INT >= 23) {
             TextWithEndTagView$e d = b.c.d;
             staticLayout = StaticLayout$Builder.obtain(d, i, d.length(), b.g, i1).setMaxLines(i2).setAlignment(Layout$Alignment.ALIGN_NORMAL).setLineSpacing(b.c.c, 0x3f800000).setEllipsize(TextUtils$TruncateAt.END).setEllipsizedWidth(Integer.MAX_VALUE).build();
          }else {
             TextWithEndTagView$e d1 = b.c.d;
             int i3 = d1.length();
             TextWithEndTagView g = b.g;
             Layout$Alignment aLIGN_NORMAL = Layout$Alignment.ALIGN_NORMAL;
             TextWithEndTagView$e c = b.c.c;
             TextUtils$TruncateAt eND = TextUtils$TruncateAt.END;
             staticLayout = v14;
             StaticLayout staticLayout1 = v14;
             int i4 = Integer.MAX_VALUE;
             staticLayout = new StaticLayout(d1, 0, i3, g, i1, aLIGN_NORMAL, 0x3f800000, c, true, eND, i4);
             Field declaredFiel = Class.forName("android.text.StaticLayout").getDeclaredField("mMaximumVisibleLineCount");
             declaredFiel.setAccessible(1);
             declaredFiel.setInt(staticLayout1, i2);
             staticLayout = staticLayout1;
          }
       }catch(java.lang.Exception e0){
       }
       i = (staticLayout.getLineCount() > 1)? true: false;
       b.l = i;
       return staticLayout;
    }
    public boolean e(Spannable p0,MotionEvent p1){
       TextWithEndTagView$a[] obj = PatchProxy.applyTwoRefs(p0, p1, this, TextWithEndTagView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int actionMasked = p1.getActionMasked();
       boolean b = true;
       if (actionMasked) {
          if (actionMasked != b) {
             if (actionMasked == 2) {
                TextWithEndTagView$a[] spans = p0.getSpans(false, p0.length(), TextWithEndTagView$a.class);
                if (spans.length > 0) {
                   if (spans[0].f == null) {
                      float f = (float)ViewConfiguration.get(this.getContext()).getScaledTouchSlop();
                      if (Math.abs((p1.getX() - spans[0].b)) - f >= 0 || Math.abs((p1.getY() - spans[0].c)) - f >= 0) {
                         spans[0].f = b;
                      }
                   }
                   if (spans[0].f != null) {
                      spans[0].g = b;
                      spans[0].b = p1.getX();
                      spans.c = p1.getY();
                      int scrollY = this.getScrollY();
                      if (this.getScrollX() != this.getScrollX() || scrollY != this.getScrollY()) {
                         this.cancelLongPress();
                      }
                      return b;
                   }
                }
             }
             return false;
          }else {
             TextWithEndTagView$a[] spans1 = p0.getSpans(false, p0.length(), TextWithEndTagView$a.class);
             for (actionMasked = 0; actionMasked < spans1.length; actionMasked = actionMasked + 1) {
                p0.removeSpan(spans1[actionMasked]);
             }
             if (spans1.length <= 0 || spans1[0].g == null) {
                b = false;
             }
             return b;
          }
       }else {
          obj = p0.getSpans(false, p0.length(), TextWithEndTagView$a.class);
          for (int i = 0; i < obj.length; i = i + 1) {
             p0.removeSpan(obj[i]);
          }
          p0.setSpan(new TextWithEndTagView$a(p1.getX(), p1.getY(), this.getScrollX(), this.getScrollY()), false, false, 17);
          return b;
       }
    }
    public void onDraw(Canvas p0){
       TextWithEndTagView td;
       Rect rect;
       TextWithEndTagView te;
       TextWithEndTagView$d a;
       TextWithEndTagView td1;
       int i2;
       int i3;
       TextWithEndTagView tk1;
       float f1;
       TextWithEndTagView$d g;
       float f2;
       TextWithEndTagView td2;
       float f4;
       if (PatchProxy.applyVoidOneRefs(p0, this, TextWithEndTagView.class, "2")) {
          return;
       }
       super.onDraw(p0);
       if (this.a()) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, TextWithEndTagView.class, "31") && this.getBackground() != null) {
          this.getBackground().draw(p0);
       }
       String str = 1;
       float f = 2.00f;
       TextWithEndTagView$d uod = null;
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(p0, this, TextWithEndTagView.class, "32")) {
          td = this.k;
          if (td != null) {
             if (this.m == null) {
                TextWithEndTagView$d j1 = this.d.j;
                if (td.getHeight() < j1) {
                   f1 = (float)(j1 - this.k.getHeight()) / f;
                label_005d :
                   int i4 = (this.m != null)? this.c.b - str: this.c.b;
                   i2 = this.k.getLineCount() - str;
                   float lineWidth = this.k.getLineWidth(i2);
                   tk1 = this.d;
                   TextWithEndTagView$d i5 = tk1.i;
                   f4 = (i5 == null)? 0: (float)(i5 + tk1.f);
                   if (this.c.a == str) {
                      if (i2 > 0) {
                         p0.save();
                         td2 = this.b;
                         p0.translate((float)td2.a, ((float)td2.b + f1));
                         this.c(p0, i, (i2 - 1));
                         p0.restore();
                      }
                      p0.save();
                      td2 = this.b;
                      p0.translate((float)td2.a, ((float)td2.b + f1));
                      rect = this.f.c();
                      rect.set(i, this.k.getLineTop(i2), this.k.getWidth(), this.k.getLineBottom(i2));
                      p0.clipRect(rect);
                      this.f.d(rect);
                      if (this.m != null) {
                         if (this.k.getLineCount() == i4 && (float)this.k.getWidth() - lineWidth < 0) {
                            this.b(p0, i2, uod, str);
                         }else {
                            this.c(p0, i2, i2);
                         }
                      }else if((float)this.k.getWidth() - (lineWidth + f4) >= 0){
                         p0.translate(((((float)this.k.getWidth() - lineWidth) - f4) / f), uod);
                         this.k.draw(p0);
                      }else if(this.k.getLineCount() < i4){
                         this.c(p0, i2, i2);
                      }else {
                         this.b(p0, i2, f4, str);
                      }
                      p0.restore();
                   }else {
                      p0.save();
                      td2 = this.b;
                      p0.translate((float)td2.a, ((float)td2.b + f1));
                      if (this.m != null) {
                         if (this.k.getLineCount() == i4 && (float)this.k.getWidth() - lineWidth < 0) {
                            this.b(p0, i2, uod, i);
                         }else {
                            this.k.draw(p0);
                         }
                      }else if((float)this.k.getWidth() - (lineWidth + f4) >= 0){
                         this.k.draw(p0);
                      }else if(this.k.getLineCount() < i4){
                         this.k.draw(p0);
                      }else {
                         this.b(p0, i2, f4, i);
                         p0.clipRect(i, i, this.k.getWidth(), this.k.getLineBottom((i2 - str)));
                         this.k.draw(p0);
                      }
                      p0.restore();
                   }
                }
             }
             f1 = 0;
             goto label_005d ;
          }
       }
       td = this.d;
       if (td.i != null && td.j != null) {
          if (!PatchProxy.applyVoid(null, this, TextWithEndTagView.class, "35")) {
             td = this.d;
             td.k = uod;
             td.l = uod;
             int i1 = (this.c.a == str)? 1: 0;
             TextWithEndTagView tk = this.k;
             if (tk != null) {
                i2 = tk.getLineCount() - str;
                i3 = this.k.getLineBottom(i2) - this.k.getLineTop(i2);
             }else {
                f2 = 0;
                i3 = 0;
             }
             if (this.m == null) {
                tk1 = this.k;
                if (tk1 == null) {
                label_023c :
                   if (i1) {
                      te = this.d;
                      f1 = ((float)(this.getWidth() - te.i) / f) + (float)te.f;
                      g = te.g;
                   label_024f :
                      f2 = f1 - (float)g;
                   }else {
                      f2 = (float)this.d.f;
                   }
                }else {
                   td2 = this.d;
                   f4 = (tk1.getLineWidth(i2) + (float)td2.f) + (float)td2.i;
                   f2 = (i1)? (((float)this.getWidth() + f4) / f) - (float)this.d.i: this.k.getLineWidth(i2) + (float)this.d.f;
                   if ((float)this.k.getWidth() - f4 < 0) {
                      if (this.k.getLineCount() == this.c.b) {
                         f1 = (float)(this.getWidth() + this.k.getWidth()) / f;
                         g = this.d.i;
                         goto label_024f ;
                      }else if(i1){
                         float f3 = (float)(this.getWidth() - this.d.i) / f;
                      label_025a :
                         tk = this.d;
                         f1 = Math.min(uod, (float)((((this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight()) - tk.i) - tk.g));
                         if (this.l != null) {
                            td1 = this.k;
                            if (td1 != null) {
                               f3 = (float)td1.getHeight() + ((float)(this.d.j - i3) / f);
                               if (str != null) {
                               label_02b7 :
                                  f3 = f3 + (float)i3;
                               }
                            }else if(!TextUtils.isEmpty(this.c.d)){
                               td1 = this.k;
                               if (td1 != null) {
                                  TextWithEndTagView$d j = this.d.j;
                                  f3 = (td1.getHeight() >= j)? (float)(this.k.getHeight() + this.d.j) / f: (float)j;
                                  if (str != null) {
                                     goto label_02b7 ;
                                  }
                               }
                            }
                            f3 = (float)this.d.j;
                         }else {
                            goto label_028d ;
                         }
                         te = this.d;
                         te.k = f1;
                         te.l = f3;
                      }else {
                         goto label_025a ;
                      }
                   }
                }
             }else {
                goto label_023c ;
             }
             uod = f2;
             str = null;
             goto label_025a ;
          }
          if (!PatchProxy.applyVoidOneRefs(p0, this, TextWithEndTagView.class, "36")) {
             p0.save();
             p0.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
             td = this.d;
             TextWithEndTagView$d k = td.k;
             TextWithEndTagView$d l = td.l;
             TextWithEndTagView$d h = td.h;
             p0.drawRoundRect(k, (l - (float)td.j), (k + (float)td.i), l, h, h, this.j);
             p0.restore();
          }
          if (!PatchProxy.applyVoidOneRefs(p0, this, TextWithEndTagView.class, "37")) {
             p0.save();
             p0.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
             td = this.d;
             p0.translate(td.k, ((td.l - (float)td.j) + (float)td.b));
             if (this.e.c != null) {
                rect = this.f.c();
                rect.set(this.d.a, i, (this.e.c.getWidth() + this.d.a), this.e.c.getHeight());
                te = this.e;
                if (te.d != null) {
                   BitmapDrawable uBitmapDrawa = new BitmapDrawable(this.getResources(), this.e.c);
                   uBitmapDrawa.setBounds(rect);
                   Drawable uDrawable = a.r(uBitmapDrawa).mutate();
                   a.n(uDrawable, this.e.d);
                   uDrawable.draw(p0);
                }else {
                   p0.drawBitmap(te.c, null, rect, this.i);
                }
                this.f.d(rect);
             }
             if (!TextUtils.isEmpty(this.e.g)) {
                a = this.d.a;
                TextWithEndTagView$c c = this.e.c;
                if (c != null) {
                   a = a + (c.getWidth() + this.d.e);
                }
                Paint$FontMetricsInt fontMetricsI = this.h.getFontMetricsInt();
                Paint$FontMetricsInt bottom = fontMetricsI.bottom;
                td1 = this.d;
                p0.drawText(this.e.g, (float)a, (((float)(td1.j - td1.c()) / f) + (((float)(bottom - fontMetricsI.top) / f) - (float)bottom)), this.h);
             }
             p0.restore();
          }
       }
    label_03cd :
       return;
    }
    public void onMeasure(int p0,int p1){
       TextWithEndTagView tb;
       TextWithEndTagView td;
       boolean i1;
       TextWithEndTagView tb1;
       TextWithEndTagView td1;
       TextWithEndTagView td2;
       if (PatchProxy.isSupport(TextWithEndTagView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TextWithEndTagView.class, "1")) {
          return;
       }
       int i = 0;
       if (this.a()) {
          super.onMeasure(View$MeasureSpec.makeMeasureSpec(i, 0x40000000), View$MeasureSpec.makeMeasureSpec(i, 0x40000000));
          return;
       }else {
          Object[] objArray = null;
          boolean b = true;
          if (!PatchProxy.applyVoid(objArray, this, TextWithEndTagView.class, "28")) {
             i1 = TextUtils.isEmpty(this.e.g);
             String str = (i1)? "Ag": this.e.g;
             Rect rect = this.f.c();
             this.h.getTextBounds(str, i, str.length(), rect);
             int i2 = rect.width();
             int i3 = rect.height();
             this.f.d(rect);
             TextWithEndTagView$c b1 = this.e.b;
             if (b1 != null) {
                float f1 = (float)b1.getWidth() / (float)b1.getHeight();
                TextWithEndTagView te = this.e;
                TextWithEndTagView$c e = te.e;
                if (e == null && te.f == null) {
                   int i4 = (int)(f1 * (float)i3);
                   te.c = Bitmap.createScaledBitmap(b1, i4, i3, b);
                   td1 = this.d;
                   td1.i = td1.b() + i4;
                   td1 = this.d;
                   td1.j = td1.c() + i3;
                }else {
                   te.c = Bitmap.createScaledBitmap(b1, e, te.f, b);
                   td1 = this.d;
                   td1.i = td1.b() + this.e.e;
                   td1 = this.d;
                   td1.j = td1.c() + this.e.f;
                }
                if (!i1) {
                   td2 = this.d;
                   td2.i = td2.i + i2;
                }
             }else if(!i1){
                td2 = this.d;
                td2.i = td2.b() + i2;
                td2 = this.d;
                td2.j = td2.c() + i3;
             }else {
                td2 = this.d;
                td2.i = i;
                td2.j = i;
             }
          }
          if (!PatchProxy.isSupport(TextWithEndTagView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TextWithEndTagView.class, "29")) {
             if (TextUtils.isEmpty(this.c.d)) {
                this.m = b;
                if (View$MeasureSpec.getMode(p0) == 0x40000000) {
                   this.b.e = View$MeasureSpec.getSize(p0);
                }else {
                   td = this.d;
                   this.b.e = Math.min(View$MeasureSpec.getSize(p0), ((td.i + td.a()) + this.b.a()));
                }
                p0.f = (View$MeasureSpec.getMode(p1) == 0x40000000)? View$MeasureSpec.getSize(p1): Math.min(View$MeasureSpec.getSize(p1), (this.d.j + this.b.b()));
                this.k = objArray;
             }else if(View$MeasureSpec.getMode(p0) == 0x40000000 || this.l != null){
                this.k = this.d(p0);
                this.b.e = View$MeasureSpec.getSize(p0);
             }else {
                this.k = this.d(View$MeasureSpec.makeMeasureSpec(this.b.e, 0x40000000));
                tb1 = this.d;
                this.b.e = Math.min(View$MeasureSpec.getSize(p0), ((((int)Math.ceil((double)this.k.getLineWidth(i)) + this.b.a()) + tb1.i) + tb1.a()));
             }
             if (View$MeasureSpec.getMode(p1) == 0x40000000) {
                p0.f = View$MeasureSpec.getSize(p1);
             }else {
                p0 = this.k.getLineCount() - b;
                i1 = this.k.getLineBottom(p0) - this.k.getLineTop(p0);
                td = this.d;
                float f = (this.k.getLineWidth(p0) + (float)td.f) + (float)td.i;
                if (this.l != null) {
                   this.b.f = this.k.getHeight() + this.b.b();
                   if (this.m != null) {
                      tb = this.b;
                      tb.f = tb.f + this.d.j;
                   }else {
                      TextWithEndTagView$d j = this.d.j;
                      if (j > i1) {
                         tb1 = this.b;
                         tb1.f = tb1.f + (int)((float)(j - i1) / 2.00f);
                      }
                      if (this.k.getLineCount() < this.c.b && (float)this.k.getWidth() - f < 0) {
                         tb = this.b;
                         tb.f = tb.f + i1;
                      }
                   }
                }else {
                   this.b.f = Math.max(this.k.getHeight(), this.d.j) + this.b.b();
                   if (this.k.getLineCount() < this.c.b && (float)this.k.getWidth() - f < 0) {
                      tb = this.b;
                      tb.f = tb.f + i1;
                   }
                }
             }
          label_027a :
             tb = this.b;
             tb.g = tb.e;
             tb.h = Math.min(tb.f, View$MeasureSpec.getSize(p1));
          }
          super.onMeasure(View$MeasureSpec.makeMeasureSpec(this.b.g, 0x40000000), View$MeasureSpec.makeMeasureSpec(this.b.h, 0x40000000));
          return;
       }
    }
    public boolean onTouchEvent(MotionEvent p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, TextWithEndTagView.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = super.onTouchEvent(p0);
       if (this.a()) {
          return b;
       }
       if (!TextUtils.isEmpty(this.c.d)) {
          TextWithEndTagView$e d = this.c.d;
          if (d instanceof Spannable && this.k != null) {
             ClickableSpan[] obj1 = PatchProxy.applyTwoRefs(d, p0, this, TextWithEndTagView.class, "4");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(this.k == null){
                b1 = this.e(d, p0);
             }else {
                int action = p0.getAction();
                if (action == 1 || !action) {
                   obj1 = d.getSpans(this.k.getOffsetForHorizontal(this.k.getLineForVertical((int)p0.getY()), p0.getX()), this.k.getOffsetForHorizontal(this.k.getLineForVertical((int)p0.getY()), p0.getX()), ClickableSpan.class);
                   if (obj1.length) {
                      object oobject = obj1[0];
                      if (action == 1) {
                         oobject.onClick(this);
                      }else {
                         Selection.setSelection(d, d.getSpanStart(oobject), d.getSpanEnd(oobject));
                      }
                      b1 = true;
                   }else {
                      Selection.removeSelection(d);
                   }
                }
                b1 = this.e(d, p0);
             }
             if (b1) {
                return true;
             }
          }
       }
       return b;
    }
    public void setAlignCenter(boolean p0){
       if (PatchProxy.isSupport(TextWithEndTagView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TextWithEndTagView.class, "12")) {
          return;
       }
       if (this.a()) {
          return;
       }
       this.c.a = p0;
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void setLineSpace(int p0){
       if (PatchProxy.isSupport(TextWithEndTagView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextWithEndTagView.class, "10")) {
          return;
       }
       if (this.a()) {
          return;
       }
       this.c.c = (float)p0;
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void setMaxLine(int p0){
       if (PatchProxy.isSupport(TextWithEndTagView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextWithEndTagView.class, "11")) {
          return;
       }
       if (this.a()) {
          return;
       }
       this.c.b = p0;
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void setTagBackground(int p0){
       if (PatchProxy.isSupport(TextWithEndTagView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextWithEndTagView.class, "16")) {
          return;
       }
       if (this.a()) {
          return;
       }
       this.e.a = p0;
       c3.c(this.j, new m5(p0));
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void setTagBorderRadius(float p0){
       if (PatchProxy.isSupport(TextWithEndTagView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, TextWithEndTagView.class, "17")) {
          return;
       }
       if (this.a()) {
          return;
       }
       this.d.h = p0;
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void setTagIcon(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextWithEndTagView.class, "20")) {
          return;
       }
       if (this.a()) {
          return;
       }
       this.e.b = p0;
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void setTagIconColor(int p0){
       if (PatchProxy.isSupport(TextWithEndTagView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextWithEndTagView.class, "22")) {
          return;
       }
       if (this.a()) {
          return;
       }
       this.e.d = p0;
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void setTagIconPadding(int p0){
       if (PatchProxy.isSupport(TextWithEndTagView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextWithEndTagView.class, "21")) {
          return;
       }
       if (this.a()) {
          return;
       }
       this.d.e = p0;
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void setTagText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextWithEndTagView.class, "13")) {
          return;
       }
       if (this.a()) {
          return;
       }
       this.e.g = p0;
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void setTagTextColor(int p0){
       if (PatchProxy.isSupport(TextWithEndTagView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextWithEndTagView.class, "15")) {
          return;
       }
       if (this.a()) {
          return;
       }
       this.e.i = p0;
       c3.c(this.h, new l5(p0));
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void setTagTextSize(float p0){
       if (PatchProxy.isSupport(TextWithEndTagView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, TextWithEndTagView.class, "14")) {
          return;
       }
       if (this.a()) {
          return;
       }
       this.e.h = p0;
       c3.c(this.h, new i5(p0));
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void setText(CharSequence p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, TextWithEndTagView.class, "6")) {
          return;
       }
       if (this.a()) {
          return;
       }
       TextWithEndTagView tc = this.c;
       if (p0 == null) {
          str = "";
       }
       tc.d = str;
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void setTextColor(int p0){
       if (PatchProxy.isSupport(TextWithEndTagView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextWithEndTagView.class, "9")) {
          return;
       }
       if (this.a()) {
          return;
       }
       this.c.f = p0;
       c3.c(this.g, new k5(p0));
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void setTextSize(int p0){
       if (PatchProxy.isSupport(TextWithEndTagView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextWithEndTagView.class, "7")) {
          return;
       }
       if (this.a()) {
          return;
       }
       this.c.e = p0;
       c3.c(this.g, new j5(p0));
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void setTextStyle(Typeface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextWithEndTagView.class, "8")) {
          return;
       }
       if (this.a()) {
          return;
       }
       c3.c(this.g, new n5(p0));
       this.requestLayout();
       this.invalidate();
       return;
    }
}
