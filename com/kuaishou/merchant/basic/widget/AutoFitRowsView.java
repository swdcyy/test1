package com.kuaishou.merchant.basic.widget.AutoFitRowsView;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kuaishou.merchant.basic.widget.AutoFitRowsView$b;
import java.util.ArrayList;
import java.util.List;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import com.lsjwzh.widget.text.FastTextView;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.text.TextPaint;
import android.widget.TextView;
import java.lang.Integer;
import com.kuaishou.merchant.basic.widget.AutoFitRowsView$a;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import android.view.View$MeasureSpec;
import java.lang.Math;

public class AutoFitRowsView extends ViewGroup	// class@0015ee
{
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final SparseIntArray i;
    public final HashMap j;
    public int k;
    public int l;
    public List m;
    public static final int n = 2131370346;

    public void AutoFitRowsView(Context p0){
       super(p0, null);
    }
    public void AutoFitRowsView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void AutoFitRowsView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int i = 1;
       this.d = i;
       this.i = new SparseIntArray(this.d);
       this.j = new HashMap();
       this.k = Integer.MAX_VALUE;
       if (PatchProxy.applyVoidOneRefs(p1, this, AutoFitRowsView.class, "4")) {
       }else if(p1 == null){
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p1, c$b.w);
          this.l = typedArray.getInteger(i, 0);
          this.b = typedArray.getDimensionPixelSize(0, 0);
          this.c = typedArray.getDimensionPixelSize(2, 0);
          typedArray.recycle();
       }
       return;
    }
    public void a(AutoFitRowsView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AutoFitRowsView.class, "1")) {
          return;
       }
       if (this.m == null) {
          this.m = new ArrayList();
       }
       if (!this.m.contains(p0)) {
          this.m.add(p0);
       }
       return;
    }
    public int b(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AutoFitRowsView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int measuredHeig = p0.getMeasuredHeight();
       if (!measuredHeig) {
          measuredHeig = this.getMeasuredHeight();
       }
       return measuredHeig;
    }
    public int c(View p0){
       TextPaint obj = PatchProxy.applyOneRefs(p0, this, AutoFitRowsView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = null;
       Object tag = p0.getTag();
       if (!tag instanceof Boolean) {
          return p0.getMeasuredWidth();
       }
       if (tag != Boolean.TRUE) {
          return p0.getMeasuredWidth();
       }
       if (p0 instanceof FastTextView) {
          if (!TextUtils.isEmpty(p0.getText())) {
             return (int)p0.getPaint().measureText(p0.getText().toString());
          }
          return obj;
       }else if(p0 instanceof TextView){
          if (!TextUtils.isEmpty(p0.getText())) {
             return (int)p0.getPaint().measureText(p0.getText().toString());
          }
          return obj;
       }else {
          return p0.getMeasuredWidth();
       }
    }
    public void d(int p0){
       if (PatchProxy.isSupport(AutoFitRowsView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AutoFitRowsView.class, "7")) {
          return;
       }
       if (p0 >= this.getChildCount()) {
          return;
       }
       for (; p0 < this.getChildCount(); p0++) {
          this.getChildAt(p0).setVisibility(8);
       }
       return;
    }
    public void e(View p0,int p1,int p2,int p3,int p4,int p5,int p6){
       int i = 2;
       if (PatchProxy.isSupport(AutoFitRowsView.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, AutoFitRowsView.class, "8")) {
             return;
          }
       }
       if (p0 == null) {
          return;
       }else if(p5 > p4){
          p6 = ((p5 - p4) / i) + p2;
       }else {
          p6 = p2;
       }
       int n = AutoFitRowsView.n;
       if (p0.getTag(n) instanceof AutoFitRowsView$a) {
          AutoFitRowsView$a e = p0.getTag(n).e;
          if (e != 48) {
             if (e != 80) {
             label_006c :
                p2 = p6;
             }else {
                p2 = (p2 + p5) - p4;
             }
          }
       }else {
          goto label_006c ;
       }
       p0.layout(p1, p2, (p3 + p1), (p4 + p2));
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int paddingEnd;
       View childAt;
       int i2;
       int i3;
       int i = 0;
       int i1 = 1;
       if (PatchProxy.isSupport(AutoFitRowsView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, AutoFitRowsView.class, "3")) {
             return;
          }
       }
       if (this.l == i1) {
          if (!PatchProxy.isSupport(AutoFitRowsView.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), Integer.valueOf(p4), this, AutoFitRowsView.class, "5")) {
             p3 = p3 - p1;
             paddingEnd = this.getPaddingEnd();
             p1 = this.getPaddingTop();
             p2 = 0;
             while (i < this.getChildCount()) {
                childAt = this.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                   p4 = this.c(childAt);
                   i2 = this.b(childAt);
                   i3 = this.i.get(p2);
                   i1 = paddingEnd + p4;
                   if (i1 > p3) {
                      p2++;
                      paddingEnd = this.getPaddingEnd();
                      i1 = this.c + i3;
                      p1 = p1 + i1;
                   }
                   i1 = p3 - paddingEnd;
                   int i4 = i1 - p4;
                   this.e(childAt, i4, p1, p4, i2, i3, p2);
                   paddingEnd = paddingEnd + p4;
                   paddingEnd = paddingEnd + this.b;
                }
                i = i + 1;
             }
          }
       }else if(PatchProxy.isSupport(AutoFitRowsView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), Integer.valueOf(p4), this, AutoFitRowsView.class, "6")){
          p3 = p3 - p1;
          paddingEnd = this.getPaddingStart();
          p1 = this.getPaddingTop();
          p2 = 0;
          while (i < this.getChildCount()) {
             childAt = this.getChildAt(i);
             if (childAt.getVisibility() != 8) {
                p4 = this.c(childAt);
                i2 = this.b(childAt);
                i3 = this.i.get(p2);
                i1 = paddingEnd + p4;
                if (i1 > p3) {
                   p2++;
                   paddingEnd = this.getPaddingStart();
                   i1 = this.c + i3;
                   p1 = p1 + i1;
                }
                this.e(childAt, paddingEnd, p1, p4, i2, i3, p2);
                paddingEnd = paddingEnd + p4;
                paddingEnd = paddingEnd + this.b;
             }
             i = i + 1;
          }
       }
       if (!q.f(this.m)) {
          Iterator iterator = this.m.iterator();
          while (iterator.hasNext()) {
             iterator.next().a();
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(AutoFitRowsView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, AutoFitRowsView.class, "2")) {
          return;
       }
       this.measureChildren(p0, p1);
       int mode = View$MeasureSpec.getMode(p1);
       p1 = View$MeasureSpec.getSize(p1);
       p0 = Math.min(((View$MeasureSpec.getSize(p0) - this.getPaddingStart()) - this.getPaddingEnd()), this.k);
       int i = this.getPaddingTop() + this.getPaddingBottom();
       this.i.clear();
       this.j.clear();
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       while (true) {
          if (i1 < this.getChildCount()) {
             View childAt = this.getChildAt(i1);
             if (childAt.getVisibility() != 8) {
                this.setChildPadding(childAt);
                int i5 = this.b(childAt);
                i2 = i2 + this.c(childAt);
                if (i2 > p0) {
                   i4 = i4 + 1;
                   if (i4 >= this.d) {
                      if (!q.f(this.m)) {
                         Iterator iterator = this.m.iterator();
                         while (iterator.hasNext()) {
                            iterator.next().b(i1, childAt);
                         }
                      }
                      this.d(i1);
                   label_00c0 :
                      AutoFitRowsView ti = this.i;
                      i = i + ti.get((ti.size() - 1));
                      if (mode != 0x40000000) {
                         p1 = i;
                         break ;
                      }
                      break ;
                   }else {
                      i = i + i3;
                      i = i + this.c;
                      i3 = i5;
                      i2 = 0;
                   }
                }else {
                   i3 = Math.max(i3, i5);
                   if (i3 > i5) {
                      childAt = null;
                   }
                   i2 = i2 + this.b;
                }
                if (childAt != null) {
                   this.j.put(Integer.valueOf(i4), childAt);
                }
                this.i.put(i4, i3);
             }
             i1 = i1 + 1;
          }else {
             goto label_00c0 ;
          }
       }
       this.setMeasuredDimension(p0, p1);
       return;
    }
    public void setChildPadding(View p0){
       AutoFitRowsView$a tag;
       AutoFitRowsView$a a;
       AutoFitRowsView$a b;
       AutoFitRowsView$a c;
       if (PatchProxy.applyVoidOneRefs(p0, this, AutoFitRowsView.class, "9")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       int n = AutoFitRowsView.n;
       if (p0.getTag(n) instanceof AutoFitRowsView$a) {
          tag = p0.getTag(n);
          a = tag.a;
          b = tag.b;
          c = tag.c;
          tag = tag.d;
       }else {
          a = this.e;
          b = this.f;
          c = this.g;
          AutoFitRowsView th = this.h;
       }
       if (p0.getPaddingLeft()) {
          a = p0.getPaddingLeft();
       }
       if (p0.getPaddingTop()) {
          b = p0.getPaddingTop();
       }
       if (p0.getPaddingRight()) {
          c = p0.getPaddingRight();
       }
       if (p0.getPaddingBottom()) {
          n = p0.getPaddingBottom();
       }
       p0.setPadding(a, b, c, tag);
       return;
    }
    public void setHorizontalSpace(int p0){
       this.b = p0;
    }
    public void setMaxLines(int p0){
       this.d = p0;
    }
    public void setMaxWidth(int p0){
       this.k = p0;
    }
    public void setVerticalSpace(int p0){
       this.c = p0;
    }
}
