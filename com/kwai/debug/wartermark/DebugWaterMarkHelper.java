package com.kwai.debug.wartermark.DebugWaterMarkHelper;
import ri5.b;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import android.graphics.Color;
import com.kwai.debug.wartermark.DebugWaterMarkHelper$contentView$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.View;
import ri5.b$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Context;
import qrd.l1;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import androidx.fragment.app.Fragment;
import androidx.activity.ComponentActivity;
import android.view.Window;
import android.app.Activity;
import com.kwai.debug.wartermark.DebugWaterMarkHelper$init$1;
import androidx.lifecycle.LifecycleObserver;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import java.lang.RuntimeException;
import java.lang.StringBuilder;

public final class DebugWaterMarkHelper extends b	// class@000cfd
{
    public final int a;
    public final int b;
    public int c;
    public final float d;
    public boolean e;
    public View f;
    public final p g;
    public final LifecycleOwner h;

    public void DebugWaterMarkHelper(LifecycleOwner p0){
       a.p(p0, "lifecycleOwner");
       super();
       this.h = p0;
       this.a = a1.e(100.00f);
       this.b = a1.e(5.00f);
       this.c = Color.parseColor("#66EDEDED");
       this.d = 12.00f;
       this.g = s.c(new DebugWaterMarkHelper$contentView$2(this));
    }
    public void a(View p0,String p1,b$a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DebugWaterMarkHelper.class, "6")) {
          return;
       }
       a.p(p0, "view");
       if (this.e == null) {
          this.g();
       }
       int i = 0;
       LinearLayout linearLayout = (p1 == null || !p1.length())? 1: null;
       if (!linearLayout) {
          int childCount = this.f().getChildCount();
          while (true) {
             if (i < childCount) {
                View childAt = this.f().getChildAt(i);
                Object obj = null;
                Object childAt1 = (childAt != null)? childAt.getTag(R.id.debug_water_mark_tag_id): obj;
                if (childAt1 instanceof String) {
                   obj = childAt1;
                }
                if (a.g(obj, p1)) {
                   return;
                }else {
                   i = i + 1;
                }
             }
          }
       }
       p0.setTag(R.id.debug_water_mark_tag_id, p1);
       p0.setTag(R.id.debug_water_mark_tag_show_listener_id, p2);
       if (p2 != null && !p2.a()) {
          p0.setVisibility(8);
       }
       this.f().addView(p0);
       return;
    }
    public void d(String p0,String p1,b$a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DebugWaterMarkHelper.class, "5")) {
          return;
       }
       a.p(p0, "msg");
       if (this.e == null) {
          this.g();
       }
       int i = 0;
       LinearLayout linearLayout = (p1 == null || !p1.length())? 1: null;
       if (!linearLayout) {
          int childCount = this.f().getChildCount();
          while (true) {
             if (i < childCount) {
                View childAt = this.f().getChildAt(i);
                Object obj = null;
                Object childAt1 = (childAt != null)? childAt.getTag(R.id.debug_water_mark_tag_id): obj;
                if (childAt1 instanceof String) {
                   obj = childAt1;
                }
                if (a.g(obj, p1)) {
                   return;
                }else {
                   i = i + 1;
                }
             }
          }
       }
       LinearLayout linearLayout1 = this.f();
       TextView textView = new TextView(this.f().getContext());
       textView.setText(p0);
       textView.setTextSize(this.d);
       textView.setTextColor(this.c);
       textView.setTag(R.id.debug_water_mark_tag_id, p1);
       textView.setTag(R.id.debug_water_mark_tag_show_listener_id, p2);
       if (p2 != null && !p2.a()) {
          textView.setVisibility(8);
       }
       linearLayout1.addView(textView);
       return;
    }
    public b e(int p0){
       this.c = p0;
       return this;
    }
    public final LinearLayout f(){
       Object obj = PatchProxy.apply(null, this, DebugWaterMarkHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
    public final void g(){
       View view;
       DebugWaterMarkHelper uDebugWaterM = DebugWaterMarkHelper.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uDebugWaterM, "2")) {
          return;
       }
       Lifecycle lifecycle = this.h.getLifecycle();
       String str = "lifecycleOwner.lifecycle";
       a.o(lifecycle, str);
       if (lifecycle.getCurrentState().isAtLeast(Lifecycle$State.CREATED)) {
          if (this.e != null) {
             throw new RuntimeException("Already init");
          }
          this.e = true;
          DebugWaterMarkHelper th = this.h;
          if (th instanceof Fragment) {
             view = th.getView();
          }else if(th instanceof ComponentActivity){
             Window window = th.getWindow();
             a.o(window, "lifecycleOwner.window");
             view = window.getDecorView();
          }else {
             throw new RuntimeException("not support "+this.h.getClass().getName());
          }
          if (view != null) {
             this.f = view;
             this.h.getLifecycle().addObserver(new DebugWaterMarkHelper$init$1(this));
             if (!PatchProxy.applyVoid(objArray, this, uDebugWaterM, "3")) {
                int i = 0;
                if (this.f().getParent() == null) {
                   uDebugWaterM = this.f;
                   if (uDebugWaterM == null) {
                      a.S("rootView");
                   }
                   int i1 = -2;
                   if (uDebugWaterM instanceof FrameLayout) {
                      FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(i1, i1);
                      layoutParams.topMargin = this.a;
                      layoutParams.leftMargin = this.b;
                      uDebugWaterM.addView(this.f(), layoutParams);
                   }else if(uDebugWaterM instanceof RelativeLayout){
                      RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams(i1, i1);
                      layoutParams1.topMargin = this.a;
                      layoutParams1.leftMargin = this.b;
                      uDebugWaterM.addView(this.f(), layoutParams1);
                   }else if(uDebugWaterM instanceof ConstraintLayout){
                      ConstraintLayout$LayoutParams layoutParams2 = new ConstraintLayout$LayoutParams(i1, i1);
                      layoutParams2.d = i;
                      layoutParams2.h = i;
                      layoutParams2.topMargin = this.a;
                      layoutParams2.leftMargin = this.b;
                      uDebugWaterM.addView(this.f(), layoutParams2);
                   }else {
                      throw new RuntimeException("not support root view type");
                   }
                }
                this.f().setVisibility(i);
             }
             return;
          }else {
             throw new RuntimeException("no root view find");
          }
       }else {
          lifecycle = this.h.getLifecycle();
          a.o(lifecycle, str);
          throw new RuntimeException("current state is "+lifecycle.getCurrentState()+", "+"not allowed to init");
       }
    }
}
