package com.kwai.library.slide.base.widget.SlidePlayVerticalRelativeLayout;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import com.kwai.library.slide.base.widget.SlidePlayVerticalRelativeLayout$b;
import com.kwai.library.slide.base.widget.SlidePlayVerticalRelativeLayout$a;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.View;
import com.kwai.library.slide.base.widget.SlidePlayVerticalRelativeLayout$LayoutParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.RelativeLayout$LayoutParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;
import java.lang.Boolean;
import com.kwai.library.slide.base.widget.b;
import msd.q;
import com.yxcorp.gifshow.util.l;
import a2.i;
import a2.j;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.CharSequence;
import java.lang.Math;
import android.view.View$MeasureSpec;
import android.util.SparseArray;
import com.kwai.library.slide.base.widget.SlidePlayVerticalRelativeLayout$b$a;
import java.util.Objects;
import java.util.ArrayList;
import android.util.ArrayMap;
import z1.g;
import java.util.ArrayDeque;
import java.lang.IllegalStateException;
import android.os.Build$VERSION;
import android.content.pm.ApplicationInfo;
import android.view.Gravity;

public class SlidePlayVerticalRelativeLayout extends RelativeLayout	// class@0008f6
{
    public View b;
    public final Rect c;
    public final Rect d;
    public boolean e;
    public View[] f;
    public final SlidePlayVerticalRelativeLayout$b g;
    public boolean h;
    public static final int[] i;
    public static final int[] j;

    static {
       SlidePlayVerticalRelativeLayout.i = new int[5]{2,3,4,6,8};
       SlidePlayVerticalRelativeLayout.j = new int[8]{0,1,5,7,16,17,18,19};
    }
    public void SlidePlayVerticalRelativeLayout(Context p0){
       super(p0, null);
    }
    public void SlidePlayVerticalRelativeLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SlidePlayVerticalRelativeLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2, 0);
       this.b = null;
       this.c = new Rect();
       this.d = new Rect();
       this.g = new SlidePlayVerticalRelativeLayout$b(null);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.h5, p2, 0);
       this.f(typedArray.getBoolean(0, 0));
       typedArray.recycle();
    }
    public static void c(View p0,SlidePlayVerticalRelativeLayout$LayoutParams p1,int p2){
       if (PatchProxy.isSupport(SlidePlayVerticalRelativeLayout.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, SlidePlayVerticalRelativeLayout.class, "17")) {
          return;
       }
       int measuredWidt = p0.getMeasuredWidth();
       p2 = (p2 - measuredWidt) / 2;
       p1.a = p2;
       p1.c = p2 + measuredWidt;
       return;
    }
    public static void d(View p0,SlidePlayVerticalRelativeLayout$LayoutParams p1,int p2){
       if (PatchProxy.isSupport(SlidePlayVerticalRelativeLayout.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, SlidePlayVerticalRelativeLayout.class, "18")) {
          return;
       }
       int measuredHeig = p0.getMeasuredHeight();
       p2 = (p2 - measuredHeig) / 2;
       p1.b = p2;
       p1.d = p2 + measuredHeig;
       return;
    }
    public final void a(SlidePlayVerticalRelativeLayout$LayoutParams p0,int p1,int[] p2){
       if (PatchProxy.isSupport(SlidePlayVerticalRelativeLayout.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, SlidePlayVerticalRelativeLayout.class, "12")) {
          return;
       }
       p0.a = Integer.MIN_VALUE;
       p0.c = Integer.MIN_VALUE;
       int i = 0;
       SlidePlayVerticalRelativeLayout$LayoutParams layoutParams = this.j(p2, i);
       if (layoutParams != null) {
          p0.c = layoutParams.a - (layoutParams.leftMargin + p0.rightMargin);
       }else if(p0.alignWithParent != null && (p2[i] && p1 >= 0)){
          p0.c = (p1 - this.getPaddingRight()) - p0.rightMargin;
       }
       i = 1;
       layoutParams = this.j(p2, i);
       if (layoutParams != null) {
          p0.a = layoutParams.c + (layoutParams.rightMargin + p0.leftMargin);
       }else if(p0.alignWithParent != null && p2[i]){
          p0.a = this.getPaddingLeft() + p0.leftMargin;
       }
       i = 5;
       layoutParams = this.j(p2, i);
       if (layoutParams != null) {
          p0.a = layoutParams.a + p0.leftMargin;
       }else if(p0.alignWithParent != null && p2[i]){
          p0.a = this.getPaddingLeft() + p0.leftMargin;
       }
       i = 7;
       layoutParams = this.j(p2, i);
       if (layoutParams != null) {
          p0.c = layoutParams.c - p0.rightMargin;
       }else if(p0.alignWithParent != null && (p2[i] && p1 >= 0)){
          p0.c = (p1 - this.getPaddingRight()) - p0.rightMargin;
       }
       if (p2[9]) {
          p0.a = this.getPaddingLeft() + p0.leftMargin;
       }
       if (p2[11] && p1 >= 0) {
          p0.c = (p1 - this.getPaddingRight()) - p0.rightMargin;
       }
       return;
    }
    public final void b(SlidePlayVerticalRelativeLayout$LayoutParams p0,int p1,int p2){
       int i;
       int i1;
       if (PatchProxy.isSupport(SlidePlayVerticalRelativeLayout.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, SlidePlayVerticalRelativeLayout.class, "13")) {
          return;
       }
       int[] rules = p0.getRules();
       SlidePlayVerticalRelativeLayout$LayoutParams obj = PatchProxy.applyOneRefs(rules, this, SlidePlayVerticalRelativeLayout.class, "16");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          View view = this.i(rules, 4);
          if (view != null) {
             i1 = view.getBaseline();
             if (i1 != -1 && view.getLayoutParams() instanceof SlidePlayVerticalRelativeLayout$LayoutParams) {
                i = view.getLayoutParams().b + i1;
             }
          }
          i = -1;
       }
       i1 = Integer.MIN_VALUE;
       if (i != -1) {
          if (p2 != -1) {
             i = i - p2;
          }
          p0.b = i;
          p0.d = i1;
          return;
       }else {
          p0.b = i1;
          p0.d = i1;
          p2 = 2;
          obj = this.j(rules, p2);
          if (obj != null) {
             p0.d = obj.b - (obj.topMargin + p0.bottomMargin);
          }else if(p0.alignWithParent != null && (rules[p2] && p1 >= 0)){
             p0.d = (p1 - this.getPaddingBottom()) - p0.bottomMargin;
          }
          p2 = 3;
          obj = this.j(rules, p2);
          if (obj != null) {
             p0.b = obj.d + (obj.bottomMargin + p0.topMargin);
          }else if(p0.alignWithParent != null && rules[p2]){
             p0.b = this.getPaddingTop() + p0.topMargin;
          }
          p2 = 6;
          obj = this.j(rules, p2);
          if (obj != null) {
             p0.b = obj.b + p0.topMargin;
          }else if(p0.alignWithParent != null && rules[p2]){
             p0.b = this.getPaddingTop() + p0.topMargin;
          }
          p2 = 8;
          obj = this.j(rules, p2);
          if (obj != null) {
             p0.d = obj.d - p0.bottomMargin;
          }else if(p0.alignWithParent != null && (rules[p2] && p1 >= 0)){
             p0.d = (p1 - this.getPaddingBottom()) - p0.bottomMargin;
          }
          if (rules[10]) {
             p0.b = this.getPaddingTop() + p0.topMargin;
          }
          if (rules[12] && p1 >= 0) {
             p0.d = (p1 - this.getPaddingBottom()) - p0.bottomMargin;
          }
          return;
       }
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       return p0 instanceof SlidePlayVerticalRelativeLayout$LayoutParams;
    }
    public final int e(SlidePlayVerticalRelativeLayout$LayoutParams p0,SlidePlayVerticalRelativeLayout$LayoutParams p1){
       int i = p0.b - p1.b;
       if (i) {
          return i;
       }
       return (p0.a - p1.a);
    }
    public void f(boolean p0){
       if (PatchProxy.isSupport(SlidePlayVerticalRelativeLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SlidePlayVerticalRelativeLayout.class, "1")) {
          return;
       }
       if (p0) {
          l.b(this, b.b);
       }else {
          j.c(this, null);
       }
       return;
    }
    public SlidePlayVerticalRelativeLayout$LayoutParams g(AttributeSet p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlidePlayVerticalRelativeLayout.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SlidePlayVerticalRelativeLayout$LayoutParams(this.getContext(), p0);
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       Object obj = PatchProxy.apply(null, this, SlidePlayVerticalRelativeLayout.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SlidePlayVerticalRelativeLayout$LayoutParams(-2, -2);
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return this.g(p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlidePlayVerticalRelativeLayout.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof SlidePlayVerticalRelativeLayout$LayoutParams) {
          return new SlidePlayVerticalRelativeLayout$LayoutParams(p0);
       }
       if (p0 instanceof RelativeLayout$LayoutParams) {
          return new SlidePlayVerticalRelativeLayout$LayoutParams(p0);
       }
       if (p0 instanceof ViewGroup$MarginLayoutParams) {
          return new SlidePlayVerticalRelativeLayout$LayoutParams(p0);
       }
       return new SlidePlayVerticalRelativeLayout$LayoutParams(p0);
    }
    public RelativeLayout$LayoutParams generateLayoutParams(AttributeSet p0){
       return this.g(p0);
    }
    public CharSequence getAccessibilityClassName(){
       Object obj = PatchProxy.apply(null, this, SlidePlayVerticalRelativeLayout.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SlidePlayVerticalRelativeLayout.class.getName();
    }
    public int getBaseline(){
       SlidePlayVerticalRelativeLayout obj = PatchProxy.apply(null, this, SlidePlayVerticalRelativeLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.h != null) {
          return super.getBaseline();
       }
       obj = this.b;
       int baseline = (obj != null)? obj.getBaseline(): super.getBaseline();
       return baseline;
    }
    public final int h(int p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7){
       Object obj;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(SlidePlayVerticalRelativeLayout.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6),Integer.valueOf(p7)};
          obj = PatchProxy.apply(objArray, this, SlidePlayVerticalRelativeLayout.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p7 >= 0) {
          i = 0;
       }
       obj = 0x40000000;
       if (i) {
          if (p0 != Integer.MIN_VALUE && p1 != Integer.MIN_VALUE) {
             p2 = Math.max(i1, (p1 - p0));
          }else if(p2 >= 0){
             p2 = 0;
          label_0071 :
             return View$MeasureSpec.makeMeasureSpec(p2, i1);
          }
          i1 = 0x40000000;
          goto label_0071 ;
       }else if(p0 == Integer.MIN_VALUE){
          p5 = p5 + p3;
       }else {
          p5 = p0;
       }
       p7 = (p1 == Integer.MIN_VALUE)? (p7 - p6) - p4: p1;
       p7 = p7 - p5;
       if (p0 != Integer.MIN_VALUE && p1 != Integer.MIN_VALUE) {
          if (i) {
             obj = 0;
          }
          p2 = Math.max(i1, p7);
       label_008d :
          i1 = obj;
       }else if(p2 >= 0){
          if (p7 >= 0) {
             p2 = Math.min(p7, p2);
          }
          i1 = 0x40000000;
       }else if(p2 == -1){
          if (i) {
             obj = 0;
          }
          p2 = Math.max(i1, p7);
          goto label_008d ;
       }else if(p2 == -2 && p7 >= 0){
          p2 = p7;
          i1 = Integer.MIN_VALUE;
       }else {
          p2 = 0;
       }
       return View$MeasureSpec.makeMeasureSpec(p2, i1);
    }
    public final View i(int[] p0,int p1){
       if (PatchProxy.isSupport(SlidePlayVerticalRelativeLayout.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, SlidePlayVerticalRelativeLayout.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = p0[p1];
       if (i) {
          SlidePlayVerticalRelativeLayout$b$a uob$a = this.g.b.get(i);
          if (uob$a == null) {
             return null;
          }else {
             uob$a = uob$a.a;
             while (true) {
                if (uob$a.getVisibility() != 8) {
                   return uob$a;
                }
                SlidePlayVerticalRelativeLayout$b$a uob$a1 = this.g.b.get(uob$a.getLayoutParams().e(uob$a.getLayoutDirection())[p1]);
                if (uob$a1 != null) {
                   uob$a1 = uob$a1.a;
                   if (uob$a != uob$a1) {
                      uob$a = uob$a1;
                   }
                }
                break ;
             }
             return null;
          }
       }else {
          return null;
       }
    }
    public final SlidePlayVerticalRelativeLayout$LayoutParams j(int[] p0,int p1){
       if (PatchProxy.isSupport(SlidePlayVerticalRelativeLayout.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, SlidePlayVerticalRelativeLayout.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View view = this.i(p0, p1);
       if (view != null && view.getLayoutParams() instanceof SlidePlayVerticalRelativeLayout$LayoutParams) {
          return view.getLayoutParams();
       }else {
          return null;
       }
    }
    public final void k(View p0,SlidePlayVerticalRelativeLayout$LayoutParams p1,int p2,int p3){
       if (PatchProxy.isSupport(SlidePlayVerticalRelativeLayout.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, SlidePlayVerticalRelativeLayout.class, "7")) {
          return;
       }
       p0.measure(this.h(p1.a, p1.c, p1.width, p1.leftMargin, p1.rightMargin, this.getPaddingLeft(), this.getPaddingRight(), p2), this.h(p1.b, p1.d, p1.height, p1.topMargin, p1.bottomMargin, this.getPaddingTop(), this.getPaddingBottom(), p3));
       return;
    }
    public final void l(View p0,SlidePlayVerticalRelativeLayout$LayoutParams p1,int p2){
       if (PatchProxy.isSupport(SlidePlayVerticalRelativeLayout.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, SlidePlayVerticalRelativeLayout.class, "10")) {
          return;
       }
       p2 = this.getPaddingLeft() + p1.leftMargin;
       p1.a = p2;
       p1.c = p2 + p0.getMeasuredWidth();
       return;
    }
    public final boolean m(View p0,SlidePlayVerticalRelativeLayout$LayoutParams p1,int p2,boolean p3){
       int[] obj;
       if (PatchProxy.isSupport(SlidePlayVerticalRelativeLayout.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, SlidePlayVerticalRelativeLayout.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = p1.e(this.getLayoutDirection());
       SlidePlayVerticalRelativeLayout$LayoutParams a = p1.a;
       boolean b = true;
       if (a == Integer.MIN_VALUE) {
          SlidePlayVerticalRelativeLayout$LayoutParams c = p1.c;
          if (c != Integer.MIN_VALUE) {
             p1.a = c - p0.getMeasuredWidth();
          }else if(a != Integer.MIN_VALUE && p1.c == Integer.MIN_VALUE){
             p1.c = a + p0.getMeasuredWidth();
          }else if(a == Integer.MIN_VALUE && p1.c == Integer.MIN_VALUE){
             if (obj[13] || obj[14]) {
                if (!p3) {
                   SlidePlayVerticalRelativeLayout.c(p0, p1, p2);
                }else {
                   this.l(p0, p1, p2);
                }
                return b;
             }else {
                this.l(p0, p1, p2);
             }
          }
       }else {
          goto label_0041 ;
       }
       if (!obj[21]) {
          b = false;
       }
       return b;
    }
    public final boolean n(View p0,SlidePlayVerticalRelativeLayout$LayoutParams p1,int p2,boolean p3){
       int[] obj;
       if (PatchProxy.isSupport(SlidePlayVerticalRelativeLayout.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, SlidePlayVerticalRelativeLayout.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = p1.getRules();
       SlidePlayVerticalRelativeLayout$LayoutParams b = p1.b;
       boolean b1 = true;
       if (b == Integer.MIN_VALUE) {
          SlidePlayVerticalRelativeLayout$LayoutParams d = p1.d;
          if (d != Integer.MIN_VALUE) {
             p1.b = d - p0.getMeasuredHeight();
          }else if(b != Integer.MIN_VALUE && p1.d == Integer.MIN_VALUE){
             p1.d = b + p0.getMeasuredHeight();
          }else if(b == Integer.MIN_VALUE && p1.d == Integer.MIN_VALUE){
             if (obj[13] || obj[15]) {
                if (!p3) {
                   SlidePlayVerticalRelativeLayout.d(p0, p1, p2);
                }else {
                   p2 = this.getPaddingTop() + p1.topMargin;
                   p1.b = p2;
                   p1.d = p2 + p0.getMeasuredHeight();
                }
                return b1;
             }else {
                p2 = this.getPaddingTop() + p1.topMargin;
                p1.b = p2;
                p1.d = p2 + p0.getMeasuredHeight();
             }
          }
       }else {
          goto label_003d ;
       }
       if (!obj[12]) {
          b1 = false;
       }
       return b1;
    }
    public final void o(){
       int id;
       SlidePlayVerticalRelativeLayout$b$a uob$a1;
       int i3;
       int id1;
       SlidePlayVerticalRelativeLayout$b$a uob$a3;
       int i6;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SlidePlayVerticalRelativeLayout$b$a uob$a = SlidePlayVerticalRelativeLayout$b$a.class;
       SlidePlayVerticalRelativeLayout$b uob = SlidePlayVerticalRelativeLayout$b.class;
       Object[] objArray = null;
       String str = "4";
       if (PatchProxy.applyVoid(objArray, this, SlidePlayVerticalRelativeLayout.class, str)) {
          return;
       }
       int childCount = this.getChildCount();
       SlidePlayVerticalRelativeLayout tf = this.f;
       if (tf == null || tf.length != childCount) {
          View[] viewArray = new View[childCount];
          this.f = viewArray;
       }
       tf = this.g;
       Objects.requireNonNull(tf);
       String str1 = "1";
       String str2 = "2";
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, tf, uob, str1)) {
          SlidePlayVerticalRelativeLayout$b a1 = tf.a;
          i6 = a1.size();
          id = 0;
          while (id < i6) {
             uob$a1 = a1.get(id);
             Objects.requireNonNull(uob$a1);
             if (!PatchProxy.applyVoid(objArray, uob$a1, uob$a, str2)) {
                uob$a1.a = objArray;
                uob$a1.b.clear();
                uob$a1.c.clear();
                SlidePlayVerticalRelativeLayout$b$a.d.a(uob$a1);
             }
             id = id + 1;
          }
          a1.clear();
          tf.b.clear();
          tf.c.clear();
       }
       int i1 = 0;
       while (i1 < childCount) {
          View childAt = this.getChildAt(i1);
          if (!PatchProxy.applyVoidOneRefs(childAt, tf, uob, str2)) {
             id = childAt.getId();
             uob$a1 = PatchProxy.applyOneRefs(childAt, objArray, uob$a, str1);
             if (uob$a1 != patchProxyRe) {
             }else {
                uob$a1 = SlidePlayVerticalRelativeLayout$b$a.d.q();
                if (uob$a1 == null) {
                   uob$a1 = new SlidePlayVerticalRelativeLayout$b$a();
                }
                uob$a1.a = childAt;
             }
             if (id != -1) {
                tf.b.put(id, uob$a1);
             }
             tf.a.add(uob$a1);
          }
          i1 = i1 + 1;
       }
       SlidePlayVerticalRelativeLayout tf1 = this.f;
       int[] i2 = SlidePlayVerticalRelativeLayout.i;
       if (!PatchProxy.applyVoidTwoRefs(tf1, i2, tf, uob, "3")) {
          uob = PatchProxy.applyOneRefs(i2, tf, uob, str);
          if (uob != patchProxyRe) {
          }else {
             SlidePlayVerticalRelativeLayout$b b1 = tf.b;
             uob = tf.a;
             i3 = uob.size();
             for (id1 = 0; id1 < i3; id1 = id1 + 1) {
                uob$a3 = uob.get(id1);
                uob$a3.b.clear();
                uob$a3.c.clear();
             }
             id1 = 0;
             while (id1 < i3) {
                uob$a3 = uob.get(id1);
                int[] rules = uob$a3.a.getLayoutParams().getRules();
                int len = i2.length;
                i6 = 0;
                while (i6 < len) {
                   id = rules[i2[i6]];
                   if (id > 0) {
                      uob$a1 = b1.get(id);
                      if (uob$a1 != null && uob$a1 != uob$a3) {
                         uob$a1.b.put(uob$a3, tf);
                         uob$a3.c.put(id, uob$a1);
                      }
                   }
                   i6 = i6 + 1;
                }
                id1 = id1 + 1;
             }
             b1 = tf.c;
             b1.clear();
             childCount = 0;
             while (childCount < i3) {
                SlidePlayVerticalRelativeLayout$b$a uob$a4 = uob.get(childCount);
                if (!uob$a4.c.size()) {
                   b1.addLast(uob$a4);
                }
                childCount = childCount + 1;
             }
             uob = b1;
          }
          int i4 = 0;
          SlidePlayVerticalRelativeLayout$b$a uob$a2 = uob.pollLast();
          while (uob$a2 != null) {
             SlidePlayVerticalRelativeLayout$b$a a = uob$a2.a;
             id1 = a.getId();
             int i5 = i4 + 1;
             tf1[i4] = a;
             SlidePlayVerticalRelativeLayout$b$a b = uob$a2.b;
             childCount = b.size();
             i3 = 0;
             while (i3 < childCount) {
                uob$a3 = b.keyAt(i3);
                SlidePlayVerticalRelativeLayout$b$a c = uob$a3.c;
                c.remove(id1);
                if (!c.size()) {
                   uob.add(uob$a3);
                }
                i3 = i3 + 1;
             }
             i4 = i5;
          }
          if (i4 < tf1.length) {
             throw new IllegalStateException("Circular dependencies cannot exist in RelativeLayout");
          }
       }
       SlidePlayVerticalRelativeLayout tf2 = this.f;
       if (!PatchProxy.applyVoidOneRefs(tf2, this, SlidePlayVerticalRelativeLayout.class, "5")) {
          ArrayList uArrayList = new ArrayList();
          ArrayList uArrayList1 = new ArrayList();
          childCount = tf2.length;
          i3 = 0;
          while (i3 < childCount) {
             object oobject = tf2[i3];
             if (oobject.getLayoutParams().e != null) {
                uArrayList.add(oobject);
             }else {
                uArrayList1.add(oobject);
             }
             i3 = i3 + 1;
          }
          for (; i < uArrayList.size(); i = i + 1) {
             tf2[i] = uArrayList.get(i);
          }
          childCount = uArrayList.size() + uArrayList1.size();
          while (i < childCount) {
             childCount = i - uArrayList.size();
             tf2[i] = uArrayList1.get(childCount);
             i = i + 1;
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = 0;
       if (PatchProxy.isSupport(SlidePlayVerticalRelativeLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, SlidePlayVerticalRelativeLayout.class, "19")) {
             return;
          }
       }
       if (this.h != null) {
          super.onLayout(p0, p1, p2, p3, p4);
          return;
       }else {
          int childCount = this.getChildCount();
          while (i < childCount) {
             View childAt = this.getChildAt(i);
             if (childAt.getVisibility() != 8) {
                SlidePlayVerticalRelativeLayout$LayoutParams layoutParams = childAt.getLayoutParams();
                childAt.layout(layoutParams.a, layoutParams.b, layoutParams.c, layoutParams.d);
             }
             i = i + 1;
          }
          return;
       }
    }
    public void onMeasure(int p0,int p1){
       int i13;
       SlidePlayVerticalRelativeLayout slidePlayVer;
       SlidePlayVerticalRelativeLayout$LayoutParams layoutParams1;
       int i14;
       int i15;
       View view1;
       object oobject1;
       int i16;
       object oobject2;
       SlidePlayVerticalRelativeLayout$LayoutParams layoutParams5;
       boolean b = this;
       if (PatchProxy.isSupport(SlidePlayVerticalRelativeLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), b, SlidePlayVerticalRelativeLayout.class, "6")) {
          return;
       }
       if (b.h != null) {
          super.onMeasure(p0, p1);
          return;
       }else {
          int b1 = false;
          if (b.e != null) {
             b.e = b1;
             this.o();
          }
          boolean mode = View$MeasureSpec.getMode(p0);
          boolean mode1 = View$MeasureSpec.getMode(p1);
          int size = View$MeasureSpec.getSize(p0);
          int size1 = View$MeasureSpec.getSize(p1);
          int i = -1;
          if (!mode) {
             size = -1;
          }
          if (!mode1) {
             size1 = -1;
          }
          int i1 = 0x40000000;
          int i2 = (mode == i1)? size: 0;
          int i3 = (mode1 == i1)? size1: 0;
          int i4 = this.getGravity() & 0x800007;
          i4 = (i4 != 0x800003 && i4)? 1: 0;
          int i5 = this.getGravity() & 0x70;
          i5 = (i5 != 48 && i5)? 1: 0;
          View view = (Build$VERSION.SDK_INT >= 29 && (i4 || (i5 && this.getIgnoreGravity() != i)))? b.findViewById(this.getIgnoreGravity()): null;
          mode = (mode != i1)? true: false;
          mode1 = (mode1 != i1)? true: false;
          SlidePlayVerticalRelativeLayout f = b.f;
          int len = f.length;
          ApplicationInfo targetSdkVer = this.getContext().getApplicationInfo().targetSdkVersion;
          int i6 = this.getLayoutDirection();
          int i7 = 0;
          int i8 = Integer.MAX_VALUE;
          int i9 = 0;
          int i10 = Integer.MIN_VALUE;
          int i11 = Integer.MAX_VALUE;
          int i12 = Integer.MIN_VALUE;
          SlidePlayVerticalRelativeLayout$LayoutParams layoutParams = 8;
          while (i7 < len) {
             i13 = len;
             object oobject = f[i7];
             slidePlayVer = f;
             if (oobject.getVisibility() != layoutParams) {
                layoutParams = oobject.getLayoutParams();
                layoutParams.a = Integer.MIN_VALUE;
                layoutParams.c = Integer.MIN_VALUE;
                b.b(layoutParams, size1, oobject.getBaseline());
                b.k(oobject, layoutParams, size, size1);
                if (b.n(oobject, layoutParams, size1, mode1)) {
                   i9 = 1;
                }
                layoutParams1 = 19;
                if (mode) {
                   if (targetSdkVer < layoutParams1) {
                      i2 = Math.max(i2, layoutParams.c);
                   }else {
                      i14 = size1;
                      i15 = layoutParams.c + layoutParams.rightMargin;
                      i2 = Math.max(i2, i15);
                   label_0105 :
                      if (mode1) {
                         if (targetSdkVer < 19) {
                            i3 = Math.max(i3, layoutParams.d);
                         }else {
                            size1 = layoutParams.d + layoutParams.bottomMargin;
                            i3 = Math.max(i3, size1);
                         }
                      }
                      if (oobject != view || i5) {
                         size1 = layoutParams.a - layoutParams.leftMargin;
                         i11 = Math.min(i11, size1);
                         size1 = layoutParams.b - layoutParams.topMargin;
                         i8 = Math.min(i8, size1);
                      }
                      if (oobject != view || i4) {
                         size1 = layoutParams.c + layoutParams.rightMargin;
                         i15 = layoutParams.d + layoutParams.bottomMargin;
                         i12 = Math.max(i12, i15);
                         i10 = Math.max(i10, size1);
                      }
                   }
                }
                i14 = size1;
                goto label_0105 ;
             }else {
                i14 = size1;
                i1 = i12;
             }
             i7 = i7 + 1;
             len = i13;
             f = slidePlayVer;
             size1 = i14;
          }
          slidePlayVer = f;
          len = i10;
          i15 = i11;
          b1 = len;
          size1 = 0;
          i7 = 0;
          while (size1 < b1) {
             view1 = view;
             oobject1 = slidePlayVer[size1];
             i13 = i8;
             if (oobject1.getVisibility() != layoutParams) {
                SlidePlayVerticalRelativeLayout$LayoutParams layoutParams2 = oobject1.getLayoutParams();
                i14 = i15;
                i1 = i6;
                b.a(layoutParams2, size, layoutParams2.e(i1));
                if (b.m(oobject1, layoutParams2, size, mode)) {
                   i7 = 1;
                }
             }else {
                i14 = i15;
                i1 = i6;
             }
             size1 = size1 + 1;
             i6 = i1;
             view = view1;
             i8 = i13;
             i15 = i14;
             layoutParams = 8;
          }
          view1 = view;
          i14 = i15;
          i13 = i8;
          i1 = i6;
          SlidePlayVerticalRelativeLayout$LayoutParams layoutParams3 = null;
          size1 = 0;
          View view2 = null;
          while (size1 < b1) {
             oobject1 = slidePlayVer[size1];
             i16 = len;
             if (oobject1.getVisibility() != 8) {
                layoutParams1 = oobject1.getLayoutParams();
                if (view2 != null && (layoutParams3 == null || b.e(layoutParams1, layoutParams3) < 0)) {
                   view2 = oobject1;
                   layoutParams3 = layoutParams1;
                }
             }
             size1 = size1 + 1;
             len = i16;
          }
          i16 = len;
          b.b = view2;
          size = 13;
          if (mode) {
             i2 = i2 + this.getPaddingRight();
             if (this.getLayoutParams() != null && this.getLayoutParams().width >= null) {
                i2 = Math.max(i2, this.getLayoutParams().width);
             }
             i2 = RelativeLayout.resolveSize(Math.max(i2, this.getSuggestedMinimumWidth()), p0);
             if (i7) {
                mode = 0;
                while (mode < b1) {
                   oobject2 = slidePlayVer[mode];
                   if (oobject2.getVisibility() != 8) {
                      SlidePlayVerticalRelativeLayout$LayoutParams layoutParams4 = oobject2.getLayoutParams();
                      int[] ointArray = layoutParams4.e(i1);
                      if (ointArray[size] || ointArray[14]) {
                         SlidePlayVerticalRelativeLayout.c(oobject2, layoutParams4, i2);
                      }else if(ointArray[11]){
                         size1 = oobject2.getMeasuredWidth();
                         i7 = i2 - this.getPaddingRight();
                         i7 = i7 - size1;
                         layoutParams4.a = i7;
                         i7 = i7 + size1;
                         layoutParams4.c = i7;
                      }
                   }
                   mode = mode + 1;
                }
             }
          }
          if (mode1) {
             i3 = i3 + this.getPaddingRight();
             if (this.getLayoutParams() != null && this.getLayoutParams().height >= null) {
                i3 = Math.max(i3, this.getLayoutParams().height);
             }
             i3 = RelativeLayout.resolveSize(Math.max(i3, this.getSuggestedMinimumHeight()), p1);
             if (i9) {
                mode = 0;
                while (mode < b1) {
                   object oobject3 = slidePlayVer[mode];
                   if (oobject3.getVisibility() != 8) {
                      layoutParams5 = oobject3.getLayoutParams();
                      int[] ointArray1 = layoutParams5.e(i1);
                      if (ointArray1[size] || ointArray1[15]) {
                         SlidePlayVerticalRelativeLayout.d(oobject3, layoutParams5, i3);
                      }else if(ointArray1[12]){
                         mode1 = oobject3.getMeasuredHeight();
                         i = i3 - this.getPaddingBottom();
                         i = i - mode1;
                         layoutParams5.b = i;
                         i = i + mode1;
                         layoutParams5.d = i;
                      }
                   }
                   mode = mode + 1;
                }
             }
          }
          if (i4 || i5) {
             SlidePlayVerticalRelativeLayout d = b.d;
             d.set(this.getPaddingLeft(), this.getPaddingTop(), (i2 - this.getPaddingRight()), (i3 - this.getPaddingBottom()));
             SlidePlayVerticalRelativeLayout c = b.c;
             Gravity.apply(this.getGravity(), (i16 - i14), (i12 - i13), d, c, i1);
             mode = c.left - i14;
             mode1 = c.top - i13;
             if (mode || mode1) {
                size = 0;
                while (size < b1) {
                   oobject2 = slidePlayVer[size];
                   view2 = view1;
                   if (oobject2.getVisibility() != 8 && oobject2 != view2) {
                      layoutParams5 = oobject2.getLayoutParams();
                      if (i4) {
                         SlidePlayVerticalRelativeLayout$LayoutParams.a(layoutParams5, mode);
                         SlidePlayVerticalRelativeLayout$LayoutParams.b(layoutParams5, mode);
                      }
                      if (i5) {
                         SlidePlayVerticalRelativeLayout$LayoutParams.d(layoutParams5, mode1);
                         SlidePlayVerticalRelativeLayout$LayoutParams.c(layoutParams5, mode1);
                      }
                   }
                label_031d :
                   size = size + 1;
                   view1 = view2;
                }
             }
          }
          b.setMeasuredDimension(i2, i3);
          return;
       }
    }
    public void requestLayout(){
       if (PatchProxy.applyVoid(null, this, SlidePlayVerticalRelativeLayout.class, "3")) {
          return;
       }
       super.requestLayout();
       this.e = true;
       return;
    }
    public void setNormalRelativeMode(boolean p0){
       this.h = p0;
    }
}
