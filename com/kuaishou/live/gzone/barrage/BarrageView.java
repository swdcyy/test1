package com.kuaishou.live.gzone.barrage.BarrageView;
import android.widget.FrameLayout;
import java.util.Random;
import lnc.a1;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import android.text.TextPaint;
import com.kuaishou.live.gzone.barrage.BarrageView$a;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.gzone.barrage.BarrageView$e;
import com.lsjwzh.widget.text.FastTextView;
import java.lang.Math;
import com.kuaishou.live.gzone.barrage.BarrageTextView;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.kuaishou.live.gzone.barrage.BarrageView$b;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.animation.TimeInterpolator;
import com.kuaishou.live.gzone.barrage.BarrageView$c;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.gzone.barrage.BarrageView$d;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.text.Spanned;
import android.text.Layout;
import com.kuaishou.live.gzone.barrage.BarrageView$f;
import com.kuaishou.live.common.core.component.comments.combo.ComboCommentMessage;
import android.view.MotionEvent;
import java.lang.System;
import android.view.View$OnLongClickListener;
import android.view.ViewGroup;
import ekd.b;
import java.lang.Integer;
import com.kuaishou.live.gzone.barrage.BarrageView$g;
import android.os.SystemClock;
import pp.a;
import java.lang.Long;
import java.lang.Float;
import q87.c;
import ne1.k$a;
import b53.a;
import erd.g;
import crd.b;
import eoc.f;
import android.content.res.Configuration;
import android.animation.ValueAnimator;
import ukd.a;
import lnc.b9;
import android.widget.FrameLayout$LayoutParams;

public class BarrageView extends FrameLayout	// class@001c2b
{
    public b A;
    public final float b;
    public final List c;
    public Queue d;
    public Queue e;
    public SparseArray f;
    public BarrageView$e[] g;
    public BarrageView$d[] h;
    public FrameLayout$LayoutParams i;
    public int j;
    public int k;
    public int l;
    public short[] m;
    public int[] n;
    public int o;
    public int p;
    public int q;
    public float r;
    public int s;
    public BarrageView$d t;
    public long u;
    public View v;
    public TextPaint w;
    public b x;
    public a y;
    public boolean z;
    public static final Random B;
    public static final int C;

    static {
       BarrageView.B = new Random();
       BarrageView.C = a1.e(750.00f);
    }
    public void BarrageView(Context p0){
       super(p0);
       this.b = c.c(this.getResources()).density;
       this.c = Collections.synchronizedList(new LinkedList());
       this.k = 6;
       int[] ointArray = new int[2];
       this.n = ointArray;
       this.o = this.c(2.00f);
       this.p = this.c(50.00f);
       this.q = this.c(24.00f);
       this.r = 15.00f;
       this.s = 16;
       this.w = new TextPaint(1);
       this.z = false;
       this.A = new BarrageView$a(this, 50);
    }
    public void BarrageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void BarrageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = c.c(this.getResources()).density;
       this.c = Collections.synchronizedList(new LinkedList());
       this.k = 6;
       int[] ointArray = new int[2];
       this.n = ointArray;
       this.o = this.c(2.00f);
       this.p = this.c(50.00f);
       this.q = this.c(24.00f);
       this.r = 15.00f;
       this.s = 16;
       this.w = new TextPaint(1);
       this.z = false;
       this.A = new BarrageView$a(this, 50);
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, BarrageView.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       int i = 0;
       while (true) {
          BarrageView tg = this.g;
          if (i >= tg.length) {
             return b;
          }
          object oobject = tg[i];
          if (oobject != null) {
             BarrageView$e c = oobject.c;
             if (c != null) {
                float f = c.getTextSize() - this.w.getTextSize();
                if (Math.abs(f) - 0x3f800000 > 0) {
                   break ;
                }
             }
          }
          i = i + 1;
       }
       return true;
    }
    public final BarrageView$e b(){
       Object[] objArray = null;
       BarrageView$e obj = PatchProxy.apply(objArray, this, BarrageView.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new BarrageView$e();
       BarrageTextView uBarrageText = new BarrageTextView(this.getContext());
       obj.c = uBarrageText;
       uBarrageText.setGravity(16);
       obj.c.j(this.r, 1);
       obj.c.setMaxLines(1);
       obj.c.setLayoutParams(this.i);
       obj.c.getPaint().setFakeBoldText(1);
       obj.c.setVisibility(0);
       obj.f = new BarrageView$b(this, obj);
       ObjectAnimator objectAnimat = new ObjectAnimator();
       obj.e = objectAnimat;
       objectAnimat.setTarget(obj.c);
       obj.e.setProperty(View.TRANSLATION_X);
       obj.e.setInterpolator(objArray);
       obj.e.addListener(new BarrageView$c(this, obj));
       this.addView(obj.c);
       return obj;
    }
    public final int c(float p0){
       return (int)((p0 * this.b) + 0x3f000000);
    }
    public int d(BarrageView$d p0){
       BarrageView$d obj = PatchProxy.applyOneRefs(p0, this, BarrageView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = p0.a;
       if (TextUtils.isEmpty(obj)) {
          return 0;
       }
       double d = (obj instanceof Spanned)? Math.ceil((double)Layout.getDesiredWidth(obj, this.w)): Math.ceil((double)this.w.measureText(obj, 0, obj.length()));
       int i = (int)d;
       if (p0 instanceof BarrageView$f) {
          BarrageView$f f = p0.f;
          if (f != null) {
             String str = String.valueOf(f.mComboCount);
             if (!TextUtils.isEmpty(str)) {
                i = i + (int)Math.ceil((double)this.w.measureText(str, 0, str.length()));
             }
          }
       }
       return i;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       BarrageView obj = PatchProxy.applyOneRefs(p0, this, BarrageView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0.getAction()) {
          this.u = System.currentTimeMillis();
       }else if(p0.getAction() == 1 || p0.getAction() == 3){
          obj = this.t;
          if (obj != null && (obj.d != null && (this.u > 0 && (System.currentTimeMillis() - this.u) - 200 > 0))) {
             this.t.d.onLongClick(this.v);
          }
       label_0086 :
          this.v = null;
          this.t = null;
          this.u = 0;
       }else if(p0.getAction() == 2){
          obj = this.t;
          if (obj != null && (obj.d != null && (this.u > 0 && (System.currentTimeMillis() - this.u) - 200 > 0))) {
             this.t.d.onLongClick(this.v);
             this.v = null;
             this.t = null;
             this.u = 0;
          }
       }
       return super.dispatchTouchEvent(p0);
    }
    public float e(int p0){
       return (((float)this.j + (float)p0) / (float)this.l);
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, BarrageView.class, "15")) {
          return;
       }
       this.c.clear();
       this.setVisibility(4);
       this.A.stop();
       return;
    }
    public boolean g(int p0,BarrageView$d p1,boolean p2){
       BarrageView$g g;
       if (PatchProxy.isSupport(BarrageView.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, BarrageView.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 2;
       boolean b = true;
       if (p2) {
          int i1 = 0;
          while (true) {
             if (i1 >= this.g.length) {
                return b;
             }
             int i2 = p0 * 2;
             if (i1 <= i2 && !this.g(i1, p1, false)) {
                break ;
             }else {
                i1++;
             }
          }
          return false;
       }else {
          object oobject = this.g[p0];
          if (oobject == null) {
             return b;
          }else if(oobject.b != null){
             return false;
          }else if(oobject instanceof BarrageView$g){
             g = oobject.g;
          }else {
             g = oobject.c;
          }
          float translationX = g.getTranslationX();
          long l = SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime();
          if (l - 10 > 0) {
             Object[] objArray = new Object[]{"cost",Long.valueOf(l),"traslationX",Float.valueOf(translationX)};
             a.C().s("ks://BarrageView", "getTranslationX", objArray);
          }
          if (((translationX + (float)g.getWidth()) - (float)this.j) > 0) {
             return false;
          }else if((((g.getTranslationX() + (float)g.getWidth()) + (float)(this.p / i)) / this.e(g.getWidth())) - ((float)this.j / this.e(p1.c)) < 0){
             b = false;
          }
          return b;
       }
    }
    public int getLineHeight(){
       return this.q;
    }
    public int getLineVerticalSpacing(){
       return this.o;
    }
    public int h(BarrageView$d p0,int p1){
       BarrageView obj;
       int s;
       BarrageView th;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(BarrageView.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, BarrageView.class, "20");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       int i = 0;
       if (PatchProxy.isSupport(BarrageView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p1), this, BarrageView.class, "27");
          if (obj != patchProxyRe) {
             while (true) {
                if (i >= p1) {
                   return -1;
                }
                s = obj[i];
                th = this.h;
                if (th[s] == null) {
                   break ;
                }else {
                   i = i + 1;
                }
             }
             th[s] = p0;
             return s;
          }
       }
       s = 0;
       while (s < p1) {
          this.m[s] = s;
          s = s + 1;
          s = (short)s;
       }
       for (s = p1 - 1; s >= 0; s = s - 1) {
          int i1 = s + 1;
          int i2 = BarrageView.B.nextInt(i1);
          th = this.m;
          short s1 = th[s];
          th[s] = th[i2];
          th[i2] = (short)s1;
       }
       obj = this.m;
       goto label_0060 ;
    }
    public BarrageView i(int p0){
       this.k = p0;
       if (this.k > 15) {
          this.k = 15;
       }
       return this;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, BarrageView.class, "3")) {
          return;
       }
       super.onAttachedToWindow();
       this.x = f.a(k$a.class, new a(this));
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BarrageView.class, "5")) {
          return;
       }
       super.onConfigurationChanged(p0);
       a.p(ValueAnimator.class, "sDurationScale", Float.valueOf(0x3f800000));
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, BarrageView.class, "4")) {
          return;
       }
       super.onDetachedFromWindow();
       b9.a(this.x);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(BarrageView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, BarrageView.class, "2")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.getLocationInWindow(this.n);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(BarrageView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, BarrageView.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       if (this.getWidth() > 0) {
          p0 = this.getWidth();
          this.j = p0;
          this.l = (int)(((float)p0 / (float)BarrageView.C) * 0x45fa0000);
       }
       return;
    }
    public void setLineHeight(int p0){
       if (PatchProxy.isSupport(BarrageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BarrageView.class, "25")) {
          return;
       }
       this.q = p0;
       BarrageView ti = this.i;
       if (ti == null || ti.height != p0) {
          this.i = new FrameLayout$LayoutParams(-2, this.q);
       }
       return;
    }
}
