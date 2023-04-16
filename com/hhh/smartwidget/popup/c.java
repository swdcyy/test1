package com.hhh.smartwidget.popup.c;
import java.util.ArrayList;
import com.hhh.smartwidget.popup.c$a;
import java.lang.Object;
import android.view.View;
import android.app.Activity;
import android.view.ViewGroup;
import nm.d;
import com.hhh.smartwidget.popup.PopupRootLayout;
import android.content.Context;
import android.widget.FrameLayout;
import android.graphics.drawable.Drawable;
import nm.b;
import java.lang.Runnable;
import com.hhh.smartwidget.popup.PopupInterface$c;
import com.hhh.smartwidget.popup.PopupInterface$g;
import com.hhh.smartwidget.popup.PopupInterface$f;
import com.hhh.smartwidget.a;
import nm.f;
import android.animation.Animator$AnimatorListener;
import com.hhh.smartwidget.popup.PopupInterface$b;
import java.lang.RuntimeException;
import java.lang.String;
import com.hhh.smartwidget.popup.PopupInterface$Excluded;
import hm.a;
import android.os.Bundle;
import com.hhh.smartwidget.popup.PopupInterface$d;
import android.view.ViewParent;
import android.view.WindowManager;
import java.lang.Exception;
import java.util.List;
import android.view.View$OnKeyListener;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewTreeObserver;
import com.hhh.smartwidget.popup.b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import nm.c;
import android.view.View$OnTouchListener;
import nm.a;
import android.view.View$OnClickListener;
import nm.e;
import android.view.View$OnAttachStateChangeListener;
import java.lang.IllegalArgumentException;

public class c	// class@000598
{
    public final c$a b;
    public final Runnable c;
    public final PopupRootLayout d;
    public final View$OnKeyListener e;
    public ViewGroup f;
    public View g;
    public boolean h;
    public boolean i;
    public static final List j;

    static {
       c.j = new ArrayList();
    }
    public void c(c$a p0){
       super();
       this.b = p0;
       View view = p0.a.findViewById(p0.b);
       if (view instanceof ViewGroup) {
          this.f = view;
       }
       this.c = new d(this);
       PopupRootLayout popupRootLay = new PopupRootLayout(p0.a);
       this.d = popupRootLay;
       popupRootLay.b = p0.i;
       popupRootLay.c = p0.j;
       popupRootLay.setPadding(p0.m, p0.k, p0.n, p0.l);
       popupRootLay.setBackground(p0.o);
       this.e = new b(this);
       return;
    }
    public static boolean k(c p0){
       p0 = p0.b;
       boolean b = (p0.d == null && p0.f != null)? true: false;
       return b;
    }
    public void a(){
       c$a h = this.b.h;
       if (h - null > 0) {
          this.g.postDelayed(this.c, h);
       }
       return;
    }
    public final void b(int p0){
       this.d(p0);
       c$a v = this.b.v;
       if (v != null && this.i == null) {
          this.i = true;
          v.a(this, p0);
       }
       return;
    }
    public final void c(){
       if (this.l()) {
          return;
       }
       this.h().f(this.b.a, this);
       c$a u = this.b.u;
       if (u != null) {
          u.a(this);
       }
       return;
    }
    public final void d(int p0){
       if (!this.l()) {
          this.c();
          return;
       }else if(a.j()){
          this.h = false;
          this.h().b(this.b.a, this);
          this.g.removeCallbacks(this.c);
          c$a x = this.b.x;
          if (x != null && p0) {
             x.a(this.g, new f(this, p0));
          }else {
             this.o(p0);
          }
          return;
       }else {
          throw new RuntimeException("Must be called on the main thread!!!");
       }
    }
    public final View e(int p0){
       return this.g.findViewById(p0);
    }
    public Activity f(){
       return this.b.a;
    }
    public PopupInterface$Excluded g(){
       return this.b.s;
    }
    public final PopupInterface$g h(){
       return a.d();
    }
    public String i(){
       return this.b.r;
    }
    public View j(){
       return this.g;
    }
    public boolean l(){
       return this.h;
    }
    public void m(Bundle p0){
    }
    public void n(Bundle p0){
    }
    public void o(int p0){
       List j;
       c$a u = this.b.u;
       if (u != null) {
          u.d(this, p0);
       }
       this.m(this.b.p);
       this.b.t.b(this);
       c tb = this.b;
       if (tb.g == null) {
          ViewParent parent = this.d.getParent();
          if (parent instanceof ViewGroup) {
             parent.removeView(this.d);
          }
       }else {
          try{
             tb.a.getWindowManager().removeViewImmediate(this.d);
          }catch(java.lang.Exception e2){
             e2.printStackTrace();
          }
       }
    }
    public final void p(ViewGroup p0){
       p0.setOnKeyListener(this.e);
       int childCount = p0.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = p0.getChildAt(i);
          if (childAt instanceof ViewGroup) {
             this.p(childAt);
          }else {
             childAt.setOnKeyListener(this.e);
          }
          i = i + 1;
       }
       return;
    }
    public final c q(){
       c tb = this.b;
       if (tb.a == null || tb.t == null) {
          throw new IllegalArgumentException("mBuilder.mActivity and mBuilder.mOnViewStateCallback cannot be null!!!");
       }
       if (!a.j()) {
          throw new RuntimeException("Must be called on the main thread!!!");
       }
       if (this.b.a.isFinishing()) {
          this.c();
          return this;
       }else if(this.l()){
          return this;
       }else if(this.h().e(this.b.a, this)){
          boolean b = true;
          this.h = b;
          boolean b1 = false;
          this.i = b1;
          c tb1 = this.b;
          View view = tb1.t.a(this, LayoutInflater.from(tb1.a), this.d, this.b.p);
          this.g = view;
          c td = this.d;
          if (view == td) {
             if (td.getChildCount() == b) {
                this.g = this.d.getChildAt(b1);
             }else {
                throw new RuntimeException("mRootLayout has one and only one child View!!!");
             }
          }else {
             td.addView(view);
          }
          c tb2 = this.b;
          int i = -1;
          if (tb2.g == null) {
             if (this.f == null) {
                this.f = tb2.a.getWindow().getDecorView();
             }
             this.f.addView(this.d, i, i);
          }else {
             WindowManager$LayoutParams layoutParams = new WindowManager$LayoutParams();
             layoutParams.copyFrom(this.b.a.getWindow().getAttributes());
             layoutParams.width = i;
             layoutParams.height = i;
             layoutParams.type = 2;
             layoutParams.flags = layoutParams.flags | 0x0100;
             layoutParams.format = -3;
             layoutParams.gravity = 17;
             this.b.a.getWindowManager().addView(this.d, layoutParams);
          }
          c.j.add(this.d);
          this.h().d(this.b.a, this);
          this.n(this.b.p);
          c$a u = this.b.u;
          if (u != null) {
             u.b(this);
          }
          this.g.getViewTreeObserver().addOnGlobalLayoutListener(new b(this));
          this.d.setOnTouchListener(new c(this));
          this.g.setOnClickListener(new a(this));
          this.d.addOnAttachStateChangeListener(new e(this));
          this.d.setFocusable(b);
          this.d.setFocusableInTouchMode(b);
          this.d.requestFocus();
          this.p(this.d);
       }else {
          this.h().c(this.b.a, this);
          c$a u1 = this.b.u;
          if (u1 != null) {
             u1.c(this);
          }
       }
       return this;
    }
}
