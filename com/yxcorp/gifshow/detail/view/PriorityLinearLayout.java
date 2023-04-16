package com.yxcorp.gifshow.detail.view.PriorityLinearLayout;
import android.widget.LinearLayout;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import com.yxcorp.gifshow.detail.view.d;
import com.yxcorp.gifshow.detail.view.PriorityLinearLayout$LayoutParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.View;
import java.lang.Integer;
import java.util.List;
import com.yxcorp.gifshow.detail.view.PriorityLinearLayout$a;
import android.view.ViewGroup;
import java.util.Collection;
import java.util.Comparator;
import java.util.Collections;

public class PriorityLinearLayout extends LinearLayout	// class@001a4f
{
    public final List b;
    public final List c;
    public boolean d;
    public final Comparator e;
    public static final boolean f;

    static {
       PriorityLinearLayout.f = a.t().d("enableUserNameMeasureOpt", false);
    }
    public void PriorityLinearLayout(Context p0){
       super(p0, null, 0);
    }
    public void PriorityLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void PriorityLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.d = false;
       this.e = d.b;
    }
    public PriorityLinearLayout$LayoutParams a(AttributeSet p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PriorityLinearLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PriorityLinearLayout$LayoutParams(this.getContext(), p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return this.a(p0);
    }
    public LinearLayout$LayoutParams generateLayoutParams(AttributeSet p0){
       return this.a(p0);
    }
    public View getChildAt(int p0){
       View obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(PriorityLinearLayout.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PriorityLinearLayout.class, "5");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (this.d != null) {
          if (PatchProxy.isSupport(PriorityLinearLayout.class)) {
             obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PriorityLinearLayout.class, "6");
             if (obj != patchProxyRe) {
             }else if(PriorityLinearLayout.f){
                obj = (p0 < this.b.size())? super.getChildAt(this.b.get(p0).a): super.getChildAt(p0);
             }else {
                try{
                   obj = super.getChildAt(this.b.get(p0).a);
                }catch(java.lang.Exception e0){
                   obj = super.getChildAt(p0);
                }
             }
          }else {
             goto label_0038 ;
          }
       }else {
          return super.getChildAt(p0);
       }
    }
    public void onMeasure(int p0,int p1){
       int i;
       ViewGroup$LayoutParams layoutParams;
       PriorityLinearLayout$LayoutParams a;
       PriorityLinearLayout$a uoa;
       int i1;
       if (PatchProxy.isSupport(PriorityLinearLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, PriorityLinearLayout.class, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, PriorityLinearLayout.class, "3")) {
          if (PriorityLinearLayout.f) {
             this.c.addAll(this.b);
             this.b.clear();
             for (i = 0; i < this.getChildCount(); i = i + 1) {
                layoutParams = super.getChildAt(i).getLayoutParams();
                a = (layoutParams instanceof PriorityLinearLayout$LayoutParams)? layoutParams.a: null;
                if (a <= null) {
                   a = 0;
                }
                PriorityLinearLayout tb = this.b;
                if (PatchProxy.isSupport(PriorityLinearLayout.class)) {
                   uoa = PatchProxy.applyTwoRefs(Integer.valueOf(i), Integer.valueOf(a), this, PriorityLinearLayout.class, "4");
                   if (uoa != PatchProxyResult.class) {
                   }else if(this.c.isEmpty()){
                      uoa = new PriorityLinearLayout$a(i, a);
                   }else {
                      uoa = this.c.remove(false);
                      uoa.a = i;
                      uoa.b = a;
                   }
                }else {
                   goto label_0076 ;
                }
                tb.add(uoa);
             }
          }else {
             this.b.clear();
             for (i = 0; i < this.getChildCount(); i = i + 1) {
                layoutParams = super.getChildAt(i).getLayoutParams();
                a = (layoutParams instanceof PriorityLinearLayout$LayoutParams)? layoutParams.a: null;
                if (a <= null) {
                   i1 = 0;
                }
                this.b.add(new PriorityLinearLayout$a(i, i1));
             }
          }
          Collections.sort(this.b, this.e);
       }
       this.d = true;
       super.onMeasure(p0, p1);
       this.d = false;
       return;
    }
}
