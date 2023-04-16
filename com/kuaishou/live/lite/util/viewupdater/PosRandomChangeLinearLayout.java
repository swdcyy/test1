package com.kuaishou.live.lite.util.viewupdater.PosRandomChangeLinearLayout;
import com.kuaishou.live.lite.util.viewupdater.d;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.util.ArrayList;
import com.kuaishou.live.lite.util.viewupdater.PosRandomChangeLinearLayout$a;
import android.view.ViewGroup$OnHierarchyChangeListener;
import com.kuaishou.live.lite.util.viewupdater.d$b;
import com.kuaishou.live.lite.util.viewupdater.d$b$a;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.widget.LinearLayout$LayoutParams;
import java.lang.Number;
import z1.a;
import java.util.Collection;
import wsd.m;
import androidx.core.view.ViewGroupKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import java.util.Iterator;
import java.lang.Iterable;
import android.view.ViewParent;

public final class PosRandomChangeLinearLayout extends LinearLayout implements d	// class@000ba2
{
    public List b;
    public final d$b c;
    public final Object d;
    public a e;
    public a f;

    public void PosRandomChangeLinearLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void PosRandomChangeLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void PosRandomChangeLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new ArrayList();
       this.setOnHierarchyChangeListener(new PosRandomChangeLinearLayout$a(this));
       this.c = d$b.a.a();
       this.d = new Object();
    }
    public void PosRandomChangeLinearLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PosRandomChangeLinearLayout.class, "15")) {
          return;
       }
       a.p(p0, "targetViews");
       this.setViewList(p0);
       return;
    }
    public final View b(int p0){
       if (PatchProxy.isSupport(PosRandomChangeLinearLayout.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PosRandomChangeLinearLayout.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.b.get(p0);
    }
    public final boolean c(int p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(PosRandomChangeLinearLayout.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PosRandomChangeLinearLayout.class, "11");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       int showDividers = this.getShowDividers();
       boolean b = false;
       if (p0 == this.getChildCount()) {
          if (showDividers & 0x04) {
             b = true;
          }
          return b;
       }else if(PatchProxy.isSupport(PosRandomChangeLinearLayout.class)){
          Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PosRandomChangeLinearLayout.class, "12");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
          label_004e :
             p0 = p0 - 1;
             while (true) {
                if (p0 >= 0) {
                   View childAt = this.getChildAt(p0);
                   if (childAt != null && childAt.getVisibility() != 8) {
                      b1 = false;
                   }else {
                      p0--;
                   }
                }else {
                   b1 = true;
                }
             }
          }
       }else {
          goto label_004e ;
       }
       if (b1) {
          if (showDividers & 0x01) {
          label_0070 :
             b = true;
          }
       }else if(showDividers & 0x02){
          goto label_0070 ;
       }
       return b;
    }
    public final void d(View p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(PosRandomChangeLinearLayout.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, PosRandomChangeLinearLayout.class, "10")) {
             return;
          }
       }
       p0.layout(p1, p2, (p3 + p1), (p4 + p2));
       return;
    }
    public ViewGroup getContainer(){
       return this;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       Drawable dividerDrawa;
       int paddingLeft;
       int measuredWidt;
       ViewGroup$LayoutParams layoutParams;
       ViewGroup$LayoutParams layoutParams1;
       int i5;
       ViewGroup$LayoutParams layoutParams2;
       LinearLayout$LayoutParams obj1;
       int i7;
       ViewGroup$LayoutParams layoutParams3;
       int i9;
       int i10;
       Object obj = this;
       int i = 3;
       int i1 = 2;
       int i2 = 5;
       int i3 = 1;
       int i4 = 0;
       if (PatchProxy.isSupport(PosRandomChangeLinearLayout.class)) {
          Object[] objArray = new Object[i2];
          objArray[i4] = Boolean.valueOf(p0);
          objArray[i3] = Integer.valueOf(p1);
          objArray[i1] = Integer.valueOf(p2);
          objArray[i] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          if (PatchProxy.applyVoid(objArray, obj, PosRandomChangeLinearLayout.class, "4")) {
             return;
          }
       }
       if (!this.getOrientation()) {
          if (!PatchProxy.isSupport(PosRandomChangeLinearLayout.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), Integer.valueOf(p4), this, PosRandomChangeLinearLayout.class, "5")) {
             dividerDrawa = this.getDividerDrawable();
             i = (dividerDrawa != null)? dividerDrawa.getIntrinsicWidth(): 0;
             paddingLeft = this.getPaddingLeft();
             i2 = this.getChildCount();
             while (i4 < i2) {
                View view = obj.b(i4);
                measuredWidt = view.getMeasuredWidth();
                int measuredHeig = view.getMeasuredHeight();
                layoutParams = view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                layoutParams1 = layoutParams;
                if (obj.c(i4)) {
                   paddingLeft = paddingLeft + i;
                }
                i5 = paddingLeft + layoutParams1.leftMargin;
                if (PatchProxy.isSupport(PosRandomChangeLinearLayout.class)) {
                   layoutParams2 = layoutParams1;
                   obj1 = PatchProxy.applyFourRefs(layoutParams1, Integer.valueOf(p2), Integer.valueOf(p4), Integer.valueOf(measuredHeig), this, PosRandomChangeLinearLayout.class, "7");
                   if (obj1 != PatchProxyResult.class) {
                      paddingLeft = obj1.intValue();
                   }else {
                   label_00d0 :
                      obj1 = layoutParams2.gravity;
                      i7 = obj1 & 0x30;
                      if (i7 == 48) {
                         paddingLeft = this.getPaddingTop();
                      }else {
                         i7 = obj1 & 0x50;
                         if (i7 == 80) {
                            paddingLeft = p4 - this.getPaddingBottom();
                            paddingLeft = paddingLeft - measuredHeig;
                         }else {
                            paddingLeft = obj1 & 0x10;
                            if (paddingLeft == 16) {
                               paddingLeft = p4 - p2;
                               paddingLeft = paddingLeft - this.getPaddingTop();
                               paddingLeft = paddingLeft - this.getPaddingBottom();
                               paddingLeft = paddingLeft - measuredHeig;
                               paddingLeft = paddingLeft / 2;
                            }else {
                               paddingLeft = this.getPaddingTop();
                            }
                         }
                      }
                      paddingLeft = p2 + paddingLeft;
                   }
                }else {
                   layoutParams2 = layoutParams1;
                   goto label_00d0 ;
                }
                int i6 = paddingLeft;
                this.d(view, i5, i6, measuredWidt, measuredHeig);
                i5 = i5 + measuredWidt;
                paddingLeft = layoutParams2.rightMargin + i5;
                i4 = i4 + 1;
                layoutParams2 = 2;
             }
          }
       }else if(PatchProxy.isSupport(PosRandomChangeLinearLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), Integer.valueOf(p4), this, PosRandomChangeLinearLayout.class, "6")){
          dividerDrawa = this.getDividerDrawable();
          i1 = (dividerDrawa != null)? dividerDrawa.getIntrinsicWidth(): 0;
          paddingLeft = this.getPaddingTop();
          measuredWidt = this.getChildCount();
          while (i4 < measuredWidt) {
             View view1 = obj.b(i4);
             i5 = view1.getMeasuredWidth();
             int measuredHeig1 = view1.getMeasuredHeight();
             layoutParams = view1.getLayoutParams();
             Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
             layoutParams1 = layoutParams;
             if (obj.c(i4)) {
                paddingLeft = paddingLeft + i1;
             }
             int i8 = paddingLeft + layoutParams1.topMargin;
             if (PatchProxy.isSupport(PosRandomChangeLinearLayout.class)) {
                layoutParams3 = layoutParams1;
                Object obj2 = PatchProxy.applyFourRefs(layoutParams1, Integer.valueOf(p1), Integer.valueOf(p3), Integer.valueOf(i5), this, PosRandomChangeLinearLayout.class, "8");
                if (obj2 != PatchProxyResult.class) {
                   paddingLeft = obj2.intValue();
                label_01a8 :
                   i9 = paddingLeft;
                   i10 = 2;
                label_01e6 :
                   this.d(view1, i9, i8, i5, measuredHeig1);
                   i8 = i8 + i5;
                   paddingLeft = layoutParams3.rightMargin + i8;
                   i4 = i4 + 1;
                   layoutParams3 = 1;
                }
             }else {
                layoutParams3 = layoutParams1;
             }
             obj1 = layoutParams3.gravity;
             i7 = obj1 & 0x03;
             if (i7 == i) {
                paddingLeft = this.getPaddingLeft();
                i10 = 2;
             }else {
                i7 = obj1 & 0x05;
                if (i7 == i2) {
                   paddingLeft = p3 - p1;
                   paddingLeft = paddingLeft - i5;
                   goto label_01a8 ;
                }else {
                   paddingLeft = obj1 & 0x01;
                   if (paddingLeft == 1) {
                      paddingLeft = p3 - p1;
                      paddingLeft = paddingLeft - this.getPaddingLeft();
                      paddingLeft = paddingLeft - this.getPaddingRight();
                      paddingLeft = paddingLeft - i5;
                      paddingLeft = paddingLeft / 2;
                   label_01e5 :
                      i9 = paddingLeft;
                      goto label_01e6 ;
                   }else {
                      paddingLeft = this.getPaddingTop();
                   }
                }
             }
             paddingLeft = p1 + paddingLeft;
             goto label_01e5 ;
          }
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, PosRandomChangeLinearLayout.class, "16")) {
          return;
       }
       this.c.a(this.d);
       this.e = null;
       this.f = null;
       return;
    }
    public void setAddViewCallback(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PosRandomChangeLinearLayout.class, "13")) {
          return;
       }
       a.p(p0, "addViewCallback");
       this.e = p0;
       return;
    }
    public void setRemoveViewCallback(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PosRandomChangeLinearLayout.class, "14")) {
          return;
       }
       a.p(p0, "removeViewCallback");
       this.f = p0;
       return;
    }
    public final void setViewList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PosRandomChangeLinearLayout.class, "1")) {
          return;
       }
       a.p(p0, "views");
       this.b.clear();
       this.b.addAll(p0);
       Iterator iterator = SequencesKt___SequencesKt.V2(ViewGroupKt.b(this)).iterator();
       while (iterator.hasNext()) {
          View view = iterator.next();
          if (!this.b.contains(view)) {
             this.removeView(view);
          }
       }
       iterator = SequencesKt___SequencesKt.V2(ViewGroupKt.b(this));
       Iterator iterator1 = this.b.iterator();
       while (iterator1.hasNext()) {
          View view1 = iterator1.next();
          if (iterator.contains(view1) || PatchProxy.applyVoidOneRefs(view1, this, PosRandomChangeLinearLayout.class, "2")) {
             continue ;
          }else if(view1.getParent() != null){
             ViewParent parent = view1.getParent();
             if (!parent instanceof ViewGroup) {
                parent = null;
             }
             if (parent != null) {
                parent.removeView(view1);
             }
          }
          this.addView(view1);
       }
       return;
    }
}
