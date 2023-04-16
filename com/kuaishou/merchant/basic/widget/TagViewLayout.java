package com.kuaishou.merchant.basic.widget.TagViewLayout;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import java.util.List;
import java.lang.Integer;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import android.widget.TextView;
import android.view.View;
import com.kuaishou.merchant.api.core.model.Commodity$IconLabel;
import java.lang.CharSequence;
import com.kuaishou.merchant.basic.util.d;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup$LayoutParams;
import java.lang.Boolean;
import java.lang.Math;
import android.view.View$MeasureSpec;
import java.lang.Number;
import com.lsjwzh.widget.text.FastTextView;
import android.text.TextUtils;
import android.text.TextPaint;

public class TagViewLayout extends ViewGroup	// class@0015fb
{
    public List A;
    public int b;
    public int c;
    public final int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public View w;
    public int x;
    public Object y;
    public List z;

    public void TagViewLayout(Context p0){
       super(p0, null);
    }
    public void TagViewLayout(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void TagViewLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = 1;
       this.x = 1;
       this.z = new ArrayList();
       this.A = new ArrayList();
       if (PatchProxy.applyVoid(null, this, TagViewLayout.class, "8")) {
       }else {
          this.b = a1.d(0x7f07031b);
          this.c = a1.d(0x7f070334);
       }
       return;
    }
    public void a(int p0,List p1){
       Commodity$IconLabel[] iconLabelArr;
       if (PatchProxy.isSupport(TagViewLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, TagViewLayout.class, "4")) {
          return;
       }
       if (q.f(p1)) {
          return;
       }
       Iterator iterator = this.z.iterator();
       while (iterator.hasNext()) {
          TextView textView = iterator.next();
          this.removeView(textView);
          this.A.add(textView);
       }
       this.z.clear();
       int i = 0;
       while (i < p1.size()) {
          Commodity$IconLabel iconLabel = p1.get(i);
          int i1 = p0 + i;
          if (!PatchProxy.isSupport(TagViewLayout.class) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(i1), iconLabel, this, TagViewLayout.class, "5") && iconLabel != null)) {
             TextView textView1 = (q.f(this.A))? null: this.A.remove(0);
             int i2 = 1;
             if (textView1 != null) {
                iconLabelArr = new Commodity$IconLabel[i2];
                iconLabelArr[0] = iconLabel;
                textView1.setText(d.m(iconLabelArr));
             }else {
                textView1 = PatchProxy.applyOneRefs(iconLabel, this, TagViewLayout.class, "7");
                if (textView1 != PatchProxyResult.class) {
                }else {
                   textView1 = new TextView(this.getContext());
                   SpannableStringBuilder spannableStr = new SpannableStringBuilder();
                   textView1.setTextSize((float)a1.d(R.dimen.arg_RES_7f070334));
                   textView1.setGravity(17);
                   iconLabelArr = new Commodity$IconLabel[i2];
                   iconLabelArr[0] = iconLabel;
                   spannableStr.append(d.m(iconLabelArr));
                   textView1.setText(spannableStr);
                }
             }
             this.addView(textView1, i1, new ViewGroup$LayoutParams(-2, -1));
             this.z.add(textView1);
          }
          i = i + 1;
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int measuredHeig;
       if (PatchProxy.isSupport(TagViewLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, TagViewLayout.class, "1")) {
             return;
          }
       }
       this.h = this.getChildCount();
       this.l = p3 - p1;
       this.e = this.getPaddingStart();
       this.f = this.getPaddingTop();
       this.m = 0;
       this.q = 0;
       this.i = 0;
       TagViewLayout ti = this.i;
       while (ti < this.h) {
          View childAt = this.getChildAt(ti);
          this.w = childAt;
          if (childAt.getVisibility() != 8) {
             this.j = this.w.getMeasuredWidth();
             measuredHeig = this.w.getMeasuredHeight();
             this.k = measuredHeig;
             TagViewLayout tj = this.j;
             p1 = this.e + tj;
             this.e = p1;
             p1 = p1 + this.b;
             if (p1 < this.l) {
                this.q = Math.max(this.q, measuredHeig);
             }else {
                p1 = this.f + this.q;
                this.f = p1;
                this.q = 0;
                p1 = this.m + 1;
                this.m = p1;
                p1 = this.g - tj;
                this.p = p1;
                this.q = Math.max(0, measuredHeig);
                measuredHeig = this.f + this.c;
                this.f = measuredHeig;
                measuredHeig = this.j + this.getPaddingStart();
                this.e = measuredHeig;
             }
             TagViewLayout te = this.e;
             tj = te - this.j;
             TagViewLayout tf = this.f;
             TagViewLayout tq = this.q;
             int i = tf + tq;
             i = i - this.k;
             tf = tf + tq;
             this.w.layout(tj, i, te, tf);
             measuredHeig = this.e + this.b;
             this.e = measuredHeig;
          }
          measuredHeig = this.i + 1;
          this.i = measuredHeig;
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       int i;
       if (PatchProxy.isSupport(TagViewLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TagViewLayout.class, "2")) {
          return;
       }
       this.measureChildren(p0, p1);
       this.n = View$MeasureSpec.getMode(p1);
       this.o = View$MeasureSpec.getSize(p1);
       p1 = 0;
       this.e = p1;
       this.q = p1;
       this.v = p1;
       this.f = this.getPaddingTop() + this.getPaddingBottom();
       this.g = (View$MeasureSpec.getSize(p0) - this.getPaddingStart()) - this.getPaddingEnd();
       if (this.n == 0x40000000) {
          this.f = this.f + this.o;
       }else {
          p0 = this.getChildCount();
          this.h = p0;
          if (p0 <= 0) {
             this.f = p1;
          }else {
             p0 = 1;
             this.m = p0;
             this.p = this.g;
             this.i = p1;
             TagViewLayout ti = this.i;
             while (ti < this.h) {
                View childAt = this.getChildAt(ti);
                this.w = childAt;
                TagViewLayout tagViewLayou = 8;
                if (childAt.getVisibility() != tagViewLayou) {
                   this.w.setPadding(this.r, this.s, this.t, this.u);
                   ti = this.w;
                   TagViewLayout obj = PatchProxy.applyOneRefs(ti, this, TagViewLayout.class, "6");
                   if (obj != PatchProxyResult.class) {
                      i = obj.intValue();
                   }else if(ti == null){
                      Object tag = this.w.getTag();
                      this.y = tag;
                      if (!tag instanceof Boolean) {
                         i = this.w.getMeasuredWidth();
                      }else if(tag != Boolean.TRUE){
                         i = this.w.getMeasuredWidth();
                      }else {
                         ti = this.w;
                         if (ti instanceof FastTextView) {
                            if (!TextUtils.isEmpty(ti.getText())) {
                               i = (int)this.w.getPaint().measureText(this.w.getText().toString());
                               this.j = i;
                            }
                         }else if(ti instanceof TextView){
                            if (!TextUtils.isEmpty(ti.getText())) {
                               i = (int)this.w.getPaint().measureText(this.w.getText().toString());
                               this.j = i;
                            }
                         }else {
                            i = ti.getMeasuredWidth();
                         }
                      }
                   }
                   i = 0;
                   this.j = i;
                   i = this.w.getMeasuredHeight();
                   this.k = i;
                   if (!i && this.j > null) {
                      this.k = this.getMeasuredHeight();
                   }
                   ti = this.p;
                   obj = this.j;
                   TagViewLayout tb = this.b;
                   int i1 = obj + tb;
                   if (ti >= i1) {
                      i = ti - obj;
                      this.p = i;
                      i = i - tb;
                      this.p = i;
                      if (this.v != null) {
                         this.w.setVisibility(tagViewLayou);
                      }else {
                         this.q = Math.max(this.q, this.k);
                      }
                   }else {
                      i = this.m + p0;
                      this.m = i;
                      i1 = this.g - obj;
                      i1 = i1 - tb;
                      this.p = i1;
                      if (i > this.x) {
                         this.w.setVisibility(tagViewLayou);
                         this.v = p0;
                      }else {
                         i = this.f + this.q;
                         this.f = i;
                         this.q = p1;
                         this.q = Math.max(p1, this.k);
                         i = this.f + this.c;
                         this.f = i;
                      }
                   }
                }
                i = this.i + p0;
                this.i = i;
             }
             this.f = this.f + this.q;
          }
       }
       this.setMeasuredDimension(this.g, this.f);
       return;
    }
    public void setHorizontalSpace(int p0){
       this.b = p0;
    }
    public void setMaxLines(int p0){
       this.x = p0;
    }
    public void setVerticalSpace(int p0){
       this.c = p0;
    }
}
