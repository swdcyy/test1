package com.kwai.library.widget.specific.sidebar.SideBar;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.util.List;
import java.util.Collections;
import android.graphics.Paint;
import java.util.HashMap;
import java.lang.String;
import java.lang.Character;
import android.graphics.Canvas;
import java.lang.Object;
import java.util.Map;
import c27.a;
import java.lang.Integer;
import android.graphics.Bitmap;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kwai.library.widget.specific.sidebar.a;
import com.kwai.library.widget.specific.sidebar.a$a;
import j17.a;
import android.graphics.Paint$FontMetricsInt;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import com.kwai.library.widget.specific.sidebar.SideBar$a;

public class SideBar extends View	// class@000a24
{
    public Paint b;
    public Paint c;
    public List d;
    public boolean e;
    public int f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public SideBar$a m;
    public int n;
    public float o;
    public Map p;
    public Map q;

    public void SideBar(Context p0){
       super(p0, null);
    }
    public void SideBar(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = true;
       this.f = -1;
       this.g = true;
       this.l = -1;
       this.n = 0;
       this.c(p0, p1);
       if (this.d == null) {
          this.d = Collections.emptyList();
       }
       Paint paint = new Paint();
       this.b = paint;
       paint.setAntiAlias(true);
       paint = new Paint();
       this.c = paint;
       paint.setAntiAlias(true);
       this.q = new HashMap();
       this.p = new HashMap();
       return;
    }
    public final boolean a(String p0){
       int i = p0.length();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return false;
          }
          if ((Character.toString(p0.charAt(i1))).matches("[\\u4E00-\\u9FA5]+")) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return true;
    }
    public final void b(Canvas p0,int p1,String p2,boolean p3){
       a uoa = this.p.get(p2);
       if (uoa == null) {
          return;
       }
       uoa = (p3)? uoa.b: uoa.a;
       Bitmap uBitmap = this.q.get(Integer.valueOf(uoa));
       if (uBitmap == null) {
          uBitmap = BitmapFactory.decodeResource(this.getResources(), uoa);
          this.q.put(Integer.valueOf(uoa), uBitmap);
       }
       p0.drawBitmap(uBitmap, (float)((this.getWidth() - uBitmap.getWidth()) / 2), (float)((this.n + p1) + ((this.f - uBitmap.getHeight()) / 2)), this.b);
       return;
    }
    public void c(Context p0,AttributeSet p1){
       if (p1 == null) {
          return;
       }
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.c5);
       a$a j = a.j;
       this.e = typedArray.getBoolean(6, j.a().b);
       this.f = typedArray.getDimensionPixelSize(1, a.d(p0, j.a().c));
       this.h = typedArray.getDimensionPixelSize(5, a.d(p0, j.a().d));
       this.i = typedArray.getColor(0, a.a(p0, j.a().e));
       this.j = typedArray.getColor(4, a.a(p0, j.a().f));
       this.k = typedArray.getColor(2, a.a(p0, j.a().g));
       this.o = (float)typedArray.getDimensionPixelSize(3, a.d(p0, j.a().h));
       typedArray.recycle();
       return;
    }
    public void onDraw(Canvas p0){
       int i2;
       int i4;
       int i7;
       String str1;
       if (!this.d.size()) {
          return;
       }
       int i = this.d.size();
       if (this.g != null) {
          int i1 = (this.getHeight() - this.getPaddingBottom()) - this.getPaddingTop();
          i2 = i1 / i;
          if (this.f > i2) {
             this.f = i2;
          }
          this.g = false;
          this.n = this.getPaddingTop() + ((i1 - (this.f * i)) / 2);
       }
       this.b.setTextSize((float)this.h);
       Paint$FontMetricsInt fontMetricsI = this.b.getFontMetricsInt();
       i2 = 0;
       while (i2 < i) {
          int i3 = this.f * i2;
          String str = this.d.get(i2);
          if (i2 == this.l) {
             this.b.setColor(this.j);
             i4 = this.getWidth() / 2;
             int i5 = this.n + i3;
             int i6 = this.f / 2;
             i5 = i5 + i6;
             this.c.setColor(this.k);
             p0.drawCircle((float)i4, (float)i5, this.o, this.c);
             Paint$FontMetricsInt fontMetricsI1 = this.b.getFontMetricsInt();
             if (this.a(str) && this.p.get(str) != null) {
                this.b(p0, i3, str, true);
             }else {
                i7 = this.getWidth() / 2;
                i5 = (int)this.b.measureText(this.d.get(i2)) / 2;
                i7 = i7 - i5;
                i5 = this.n + i3;
                i3 = this.f - fontMetricsI1.bottom;
                i3 = i3 - fontMetricsI1.top;
                i3 = i3 / 2;
                i5 = i5 + i3;
                str1 = (this.e != null)? (this.d.get(i2)).toUpperCase(): (this.d.get(i2)).toLowerCase();
                p0.drawText(str1, (float)i7, (float)i5, this.b);
             }
          }else {
             this.b.setColor(this.i);
             if (this.a(str) && this.p.get(str) != null) {
                this.b(p0, i3, str, false);
             }else {
                i7 = this.getWidth() / 2;
                i4 = (int)this.b.measureText(this.d.get(i2)) / 2;
                i7 = i7 - i4;
                i4 = this.n + i3;
                i3 = this.f - fontMetricsI.bottom;
                i3 = i3 - fontMetricsI.top;
                i3 = i3 / 2;
                i4 = i4 + i3;
                str1 = (this.e != null)? (this.d.get(i2)).toUpperCase(): (this.d.get(i2)).toLowerCase();
                p0.drawText(str1, (float)i7, (float)i4, this.b);
             }
          }
          i2 = i2 + 1;
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       int mode = View$MeasureSpec.getMode(p0);
       int mode1 = View$MeasureSpec.getMode(p1);
       int i = 0;
       if (mode == 0x40000000) {
          p0 = View$MeasureSpec.getSize(p0);
       }else if(mode == Integer.MIN_VALUE){
          float f = (this.d.size() > 0)? this.b.measureText(this.d.get(i)): 0;
          f = ((int)f + this.getPaddingLeft()) + this.getPaddingRight();
       }else {
          p0 = 0;
       }
       if (mode1 == 0x40000000) {
          i = View$MeasureSpec.getSize(p1);
       }else if(mode1 == Integer.MIN_VALUE){
          i = ((this.f * this.d.size()) + this.getPaddingBottom()) + this.getPaddingTop();
       }
       this.setMeasuredDimension(p0, i);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       SideBar tm;
       SideBar td = this.d;
       boolean b = false;
       if (td == null || td.isEmpty()) {
          return b;
       }
       float y = p0.getY();
       int i = (int)((y - (float)this.n) / (float)this.f);
       int action = p0.getAction();
       if (action) {
          if (action != 1) {
             if (action != 2) {
                if (action != 3) {
                   return true;
                }
             }
          }
          tm = this.m;
          if (tm != null) {
             tm.a();
          }
          return true;
       }
       if (i >= this.d.size()) {
          b = this.d.size() - 1;
       }else if(i < 0){
          b = i;
       }
       if (this.l != b) {
          this.l = b;
          this.invalidate();
          tm = this.m;
          if (tm != null) {
             tm.b(this.d.get(b), y);
          }
       }
       return true;
    }
    public void setAttributeSet(AttributeSet p0){
       this.c(this.getContext(), p0);
       this.postInvalidate();
    }
    public void setCurrentLetter(String p0){
       int i = this.d.indexOf(p0);
       if (this.l != i) {
          this.l = i;
          this.invalidate();
       }
       return;
    }
    public void setOnCurrentLetterListener(SideBar$a p0){
       this.m = p0;
    }
}
