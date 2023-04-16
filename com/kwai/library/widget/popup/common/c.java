package com.kwai.library.widget.popup.common.c;
import java.util.ArrayList;
import com.kwai.library.widget.popup.common.c$b;
import java.lang.Object;
import o07.h;
import o07.i;
import android.content.Context;
import zf6.l;
import com.kwai.library.widget.popup.common.PopupRootLayout;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import o07.e;
import android.view.View;
import java.util.List;
import java.lang.ref.WeakReference;
import android.view.ViewParent;
import com.kwai.library.widget.popup.common.config.PopupOrientation;
import com.kwai.library.widget.popup.common.f;
import r64.i;
import android.os.Bundle;
import java.lang.String;
import com.yxcorp.utility.Log;
import java.lang.StackTraceElement;
import java.lang.Integer;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import android.app.Activity;
import android.view.ViewGroup;
import java.lang.Exception;
import java.lang.Throwable;
import android.view.View$OnKeyListener;
import java.lang.Thread;
import java.lang.StringBuilder;
import android.os.SystemClock;
import java.lang.System;
import com.kwai.library.widget.popup.common.PopupInterface$i;
import com.kwai.library.widget.popup.common.PopupInterface$e;
import com.kwai.library.widget.popup.common.exception.KwaiPopupShowException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.RuntimeException;
import java.lang.IllegalArgumentException;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import android.view.LayoutInflater;
import android.view.View$OnClickListener;
import o07.g;
import com.kwai.library.widget.popup.common.f$c;
import android.view.Window;
import o07.b;
import o07.j;
import o07.f;
import android.view.View$OnTouchListener;
import o07.k;
import android.view.View$OnAttachStateChangeListener;
import com.kwai.library.widget.popup.common.c$a;
import android.animation.Animator$AnimatorListener;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import com.kwai.library.widget.popup.common.e;

public class c	// class@000990
{
    public final c$b b;
    public final Runnable c;
    public final PopupRootLayout d;
    public final View$OnKeyListener e;
    public View f;
    public boolean g;
    public boolean h;
    public long i;
    public long j;
    public boolean k;
    public boolean l;
    public final Runnable m;
    public StackTraceElement[] n;
    public static final List o;

    static {
       c.o = new ArrayList();
    }
    public void c(c$b p0){
       Context uContext;
       super();
       this.l = false;
       this.m = new h(this);
       this.b = p0;
       this.c = new i(this);
       c$b e = p0.E;
       e = (e == null)? p0.a: l.h(p0.a, e);
       PopupRootLayout popupRootLay = new PopupRootLayout(e);
       this.d = popupRootLay;
       popupRootLay.setBackground(p0.l);
       popupRootLay.b = p0.h;
       popupRootLay.c = p0.i;
       this.e = new e(this);
       return;
    }
    public static boolean E(c p0){
       p0 = p0.b;
       boolean b = (p0.c == null && p0.d != null)? true: false;
       return b;
    }
    public static boolean F(c p0){
       boolean b = (p0.b.e != null && c.E(p0))? true: false;
       return b;
    }
    public static void Q(View p0){
       int i = c.o.size();
       if (i <= 0) {
          return;
       }
       i = i - 1;
       while (true) {
          if (i >= 0) {
             WeakReference weakReferenc = c.o.get(i);
             if (weakReferenc != null && weakReferenc.get() == p0) {
             label_0023 :
                if (i != -1) {
                   c.o.remove(i);
                   break ;
                }
                break ;
             }else {
                i = i - 1;
             }
          }else {
             i = -1;
             goto label_0023 ;
          }
       }
       return;
    }
    public long A(){
       return this.i;
    }
    public Object C(){
       return this.b.n;
    }
    public boolean D(){
       boolean b = (this.d.getParent() != null)? true: false;
       return b;
    }
    public boolean G(){
       return this.b.o;
    }
    public boolean I(){
       c$b c = this.b.C;
       boolean b = true;
       if (c == PopupOrientation.ORIENTATION_UNDEFINED) {
          return b;
       }
       if (f.A()) {
          if (c != PopupOrientation.ORIENTATION_LANDSCAPE) {
             b = false;
          }
          return b;
       }else if(c == PopupOrientation.ORIENTATION_PORTRAIT){
          b = false;
       }
       return b;
    }
    public boolean K(){
       return this.g;
    }
    public boolean L(){
       return (this instanceof i ^ 0x01);
    }
    public void N(Bundle p0){
    }
    public void O(Bundle p0){
    }
    public final void P(){
       c tn = this.n;
       if (tn != null && tn.length > 0) {
          Log.d("Popup#Popup", "Popup 调用方信息如下：");
          c tn1 = this.n;
          int len = tn1.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = tn1[i];
             Object[] objArray = new Object[]{oobject.getClassName(),oobject.getMethodName(),Integer.valueOf(oobject.getLineNumber())};
             Log.d("Popup#Popup", String.format("%s#%s:%d", objArray));
          }
       }
       return;
    }
    public void T(int p0){
       List o;
       View view;
       WeakReference weakReferenc;
       c$b w = this.b.w;
       if (w != null) {
          w.H(this, p0);
       }
       this.N(this.b.m);
       this.b.v.b(this);
       c tb = this.b;
       if (tb.e == null || !f.C(tb.a, this.d)) {
          try{
             ViewParent parent = this.d.getParent();
             if (parent instanceof ViewGroup) {
                parent.removeView(this.d);
             }
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
             Log.e("Popup#Popup", "removeViewFromParent fail", e4);
             this.P();
          }
       }
    }
    public void V(boolean p0){
       this.b.b = p0;
    }
    public void X(boolean p0){
       if (p0) {
          c tb = this.b;
          if (tb.b == null) {
             tb.b = true;
          }
       }
       this.b.c = p0;
       return;
    }
    public final void Y(ViewGroup p0){
       p0.setOnKeyListener(this.e);
       int childCount = p0.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = p0.getChildAt(i);
          if (childAt instanceof ViewGroup) {
             this.Y(childAt);
          }else {
             childAt.setOnKeyListener(this.e);
          }
          i = i + 1;
       }
       return;
    }
    public c Z(){
       StringBuilder str;
       c tb = this.b;
       if (tb.a == null || tb.v == null) {
          throw new IllegalArgumentException("mBuilder.mActivity and mBuilder.mOnViewStateCallback cannot be null!!!");
       }
       if (!f.B()) {
          throw new RuntimeException("Must be called on the main thread!!!");
       }
       this.n = Thread.currentThread().getStackTrace();
       tb = this.n;
       if (tb == null || tb.length <= 0) {
          str = "";
       }else {
          str = "Popup 调用方信息如下：\n";
          c tn = this.n;
          int len = tn.length;
          int i = 0;
          for (int i1 = 0; i1 < len; i1 = i1 + 1) {
             object oobject = tn[i1];
             Object[] objArray = new Object[3];
             objArray[i] = oobject.getClassName();
             objArray[1] = oobject.getMethodName();
             objArray[2] = Integer.valueOf(oobject.getLineNumber());
             str = str+String.format("%s#%s:%d\n", objArray);
          }
          str = str;
       }
       Log.g("Popup#Popup", "show start "+this.b.a+"source: "+str);
       if (this.b.a.isFinishing()) {
          Log.n("Popup#Popup", "show fail because: activity "+this.b.a+" is finishing!");
          return this;
       }else if(this.K()){
          Log.n("Popup#Popup", "show fail because: popup "+this+" is showing!");
          return this;
       }else if(this.k != null){
          Log.n("Popup#Popup", "show fail because: popup "+this+" is performing out anim!");
          return this;
       }else {
          this.i = SystemClock.elapsedRealtime();
          this.j = System.currentTimeMillis();
          String str1 = " with builder: ";
          if (this.x().f(this.b.a, this)) {
             c$b a = this.b.A;
             if (a == null || a.a()) {
                this.m();
                Log.g("Popup#Popup", "show success "+this+str1+this.b);
             }else {
                Log.g("Popup#Popup", "shouldShow：return false "+this+str1+this.b);
                this.n();
             }
          }else {
             this.x().g(this.b.a, this);
             c$b w = this.b.w;
             if (w != null) {
                w.p(this);
             }
             Log.g("Popup#Popup", "show pending "+this+str1+this.b);
          }
          return this;
       }
    }
    public void a0(boolean p0){
       if (p0) {
          this.l = true;
          this.f.postDelayed(this.m, 500);
       }else {
          this.f.removeCallbacks(this.m);
          this.l = false;
       }
       return;
    }
    public void k(){
       c$b g = this.b.g;
       if (g - null > 0) {
          this.f.postDelayed(this.c, g);
       }
       return;
    }
    public final void l(int p0){
       this.q(p0);
       c$b x = this.b.x;
       if (x != null && this.h == null) {
          this.h = true;
          x.a(this, p0);
       }
       return;
    }
    public final void m(){
       c tb1;
       ViewGroup decorView;
       boolean b = true;
       this.g = b;
       boolean b1 = false;
       this.h = b1;
       c$b a = this.b.a;
       LayoutInflater layoutInflat = LayoutInflater.from(a);
       c$b e = this.b.E;
       if (e != null) {
          layoutInflat = l.b(layoutInflat, e);
       }
       if (!c.F(this)) {
          c tb = this.b;
          this.d.setPadding(b1, tb.j, b1, tb.k);
          tb1 = this.b;
          if (tb1.s != null) {
             this.d.setAutoFitSystemBarChange(tb1.j);
          }else if(this.L()){
             this.d.setAutoFitSystemBarChange(-1);
          }
       }else {
          tb1 = this.b;
          if (tb1.s != null) {
             this.d.setPadding(b1, tb1.j, b1, tb1.k);
             this.d.setAutoFitSystemBarChange(this.b.j);
          }
       }
       tb1 = this.b;
       View view = tb1.v.a(this, layoutInflat, this.d, tb1.m);
       this.f = view;
       tb1 = this.d;
       if (view == tb1) {
          int childCount = tb1.getChildCount();
          if (childCount != b) {
             Object[] objArray = new Object[]{this,Integer.valueOf(childCount)};
             Log.d("Popup#Popup", String.format("%s mRootLayout has %d child，there only allow one child!!!", objArray));
             this.P();
             this.r(-1);
             return;
          }else {
             this.f = this.d.getChildAt(b1);
          }
       }else {
          ViewParent parent = view.getParent();
          if (parent == null || parent != this.d) {
             this.d.addView(this.f);
          }
       }
       c$b b2 = this.b.B;
       if (b2 != null) {
          this.f.setOnClickListener(b2);
       }
       c tb2 = this.b;
       if (tb2.e != null) {
          if (!f.a(a, this.d, 256, new g(this))) {
             this.r(-1);
             return;
          }
       }else {
          b2 = tb2.f;
          if (b2 == null) {
             decorView = a.getWindow().getDecorView();
          }
          if (!decorView.hasWindowFocus()) {
             Log.d("Popup#Popup", "Current window does\'t have window focus,you can set setAddToWindow to Avoid being blocked!");
             this.P();
          }
          decorView.addView(this.d, -1, -1);
       }
       c.o.add(new WeakReference(this.d));
       this.x().h(a, this);
       this.O(this.b.m);
       b2 = this.b.w;
       if (b2 != null) {
          b2.B(this);
       }
       f.F(this.f, new j(this));
       this.d.setOnTouchListener(new f(this));
       this.d.addOnAttachStateChangeListener(new k(this));
       if (this.b.u()) {
          this.d.setFocusable(b);
          this.d.setFocusableInTouchMode(b);
          this.d.requestFocus();
       }
       if (this.b.r == null) {
          this.Y(this.d);
       }
       return;
    }
    public final void n(){
       String str = "Popup#Popup";
       if (this.K()) {
          Log.n(str, "discard fail because "+this+" is showing!");
          return;
       }else {
          Log.g(str, "discard success "+this);
          this.x().e(this.b.a, this);
          c$b w = this.b.w;
          if (w != null) {
             w.J(this);
          }
          return;
       }
    }
    public final void o(){
       this.q(4);
    }
    public final void q(int p0){
       this.n = null;
       if (!this.K()) {
          String str = "dismiss popup fail because ";
          if (this.k != null) {
             Log.n("Popup#Popup", str+this+" when is performing out anim!");
             return;
          }else {
             Log.n("Popup#Popup", str+this+"is not showing!");
             this.n();
             return;
          }
       }else if(f.B()){
          this.r(p0);
          return;
       }else {
          throw new RuntimeException("Must be called on the main thread!!!");
       }
    }
    public final void r(int p0){
       boolean b = false;
       this.g = b;
       this.x().c(this.b.a, this);
       c$b w = this.b.w;
       if (w != null) {
          w.S(this, p0);
       }
       c tf = this.f;
       if (tf != null) {
          tf.removeCallbacks(this.c);
       }
       String str = "Popup#Popup";
       if (this.f != null && this.b.z != null) {
          int i = -1;
          if (p0 != i) {
             this.k = true;
             String str1 = this.toString();
             Log.g(str, "dismiss success with anim start "+str1);
             View view = null;
             c$b f = this.b.F;
             if (f != i) {
                view = this.t(f);
             }
             if (view == null) {
                view = this.f;
             }
             this.b.z.a(view, new c$a(this, p0, str1));
          label_007f :
             return;
          }
       }
       this.k = b;
       this.T(p0);
       Log.g(str, "dismiss success "+this);
       goto label_007f ;
    }
    public final View t(int p0){
       return this.f.findViewById(p0);
    }
    public Activity u(){
       return this.b.a;
    }
    public PopupInterface$Excluded v(){
       return this.b.u;
    }
    public Drawable w(){
       return this.b.l;
    }
    public final PopupInterface$i x(){
       return e.d();
    }
    public String y(){
       return this.b.t;
    }
    public View z(){
       return this.f;
    }
}
