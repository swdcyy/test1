package com.yxcorp.gifshow.comment.utils.comboanim.ComboAnimView;
import java.lang.Runnable;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.utils.comboanim.ComboAnimView$a;
import android.view.GestureDetector;
import com.yxcorp.gifshow.comment.utils.comboanim.b;
import android.view.GestureDetector$OnGestureListener;
import io.reactivex.BackpressureStrategy;
import brd.h;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.comment.utils.comboanim.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import jl9.e;
import java.util.List;
import jl9.a;
import il9.d;
import java.util.Objects;
import java.lang.ref.WeakReference;
import il9.b$b;
import java.lang.Boolean;
import android.os.Handler;
import java.lang.Integer;
import java.util.Iterator;
import il9.a;
import il9.e;
import a2.i0;
import android.graphics.Canvas;
import android.view.animation.AnimationUtils;
import android.view.ViewGroup;

public class ComboAnimView extends View implements Runnable	// class@00110a
{
    public final int[] b;
    public final List c;
    public e d;
    public ComboAnimView$a e;
    public GestureDetector f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public ViewGroup k;
    public d l;
    public boolean m;
    public a n;
    public PublishSubject o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public static final int t;

    public void ComboAnimView(Context p0){
       super(p0, null);
    }
    public void ComboAnimView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ComboAnimView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int[] ointArray = new int[2];
       this.b = ointArray;
       ArrayList uArrayList = new ArrayList();
       this.c = uArrayList;
       this.o = PublishSubject.g();
       this.q = true;
       this.r = true;
       if (PatchProxy.applyVoid(null, this, ComboAnimView.class, "1")) {
       }else {
          this.e = new ComboAnimView$a(this);
          this.f = new GestureDetector(this.getContext(), new b(this));
          z c = d.c;
          h oh = this.o.toFlowable(BackpressureStrategy.DROP).E(c).t(c);
          oh.A(a.b, Functions.d());
          uArrayList.add(new e());
          a uoa = new a();
          this.n = uoa;
          uArrayList.add(uoa);
       }
       return;
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ComboAnimView.class, "9")) {
          return;
       }
       ComboAnimView tl = this.l;
       if (tl != null) {
          tl.b(0);
          tl = this.l;
          Objects.requireNonNull(tl);
          if (!PatchProxy.applyVoid(objArray, tl, d.class, "3")) {
             b$b uob = tl.b.get();
             if (uob != null) {
                uob.a();
             }
          }
       }
       return;
    }
    public void b(boolean p0){
       if (PatchProxy.isSupport(ComboAnimView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ComboAnimView.class, "11")) {
          return;
       }
       if (this.l == null) {
          return;
       }
       int i = 4;
       this.e.removeMessages(i);
       int i1 = 5;
       this.e.removeMessages(i1);
       ComboAnimView tl = this.l;
       int i2 = tl.c + 1;
       this.m = false;
       tl.b(i2);
       tl = this.l;
       Objects.requireNonNull(tl);
       d uod = d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i2), Boolean.valueOf(p0), tl, uod, "4")) {
          b$b uob = tl.b.get();
          if (uob != null) {
             uob.c(i2, p0);
          }
       }
       this.e.sendEmptyMessageDelayed(i, 300);
       if (!p0 && this.q != null) {
          this.e.sendEmptyMessageDelayed(i1, 300);
       }
       if (this.r == null && i2 == 1) {
          return;
       }else if(this.q == null && i2 > 1){
          return;
       }else if(i2 > 1){
          this.o.onNext(this.getContext());
       }
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          uoa.j(this.h, this.i);
          uoa.b(i2, this.d);
       }
       this.removeCallbacks(this);
       i0.k0(this, this);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, ComboAnimView.class, "3")) {
          return;
       }
       this.n.l();
       return;
    }
    public e getProvider(){
       return this.d;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, ComboAnimView.class, "15")) {
          return;
       }
       super.onAttachedToWindow();
       this.p = true;
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, ComboAnimView.class, "16")) {
          return;
       }
       super.onDetachedFromWindow();
       this.removeCallbacks(this);
       this.e.removeMessages(2);
       ComboAnimView td = this.d;
       if (td != null) {
          td.f();
       }
       this.p = false;
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ComboAnimView.class, "10")) {
          return;
       }
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (!uoa.e()) {
             continue ;
          }else {
             uoa.d(p0);
          }
       }
       return;
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ComboAnimView.class, "14")) {
          return;
       }
       if (this.p == null) {
          return;
       }
       Iterator iterator = this.c.iterator();
       int i = 0;
       String str = null;
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (!uoa.e()) {
             continue ;
          }
          uoa.i(AnimationUtils.currentAnimationTimeMillis());
          str = 1;
       }
       if (!str) {
          if (!PatchProxy.applyVoid(objArray, this, ComboAnimView.class, "7")) {
             for (; i < this.c.size(); i = i + 1) {
                this.c.get(i).g();
             }
             this.m = true;
             if (this.j != null) {
                this.e.sendEmptyMessageDelayed(3, 300);
             }
          }
          return;
       }else {
          i0.j0(this);
          i0.k0(this, this);
          return;
       }
    }
    public void setComboSession(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ComboAnimView.class, "5")) {
          return;
       }
       ComboAnimView tl = this.l;
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoidOneRefs(tl, p0, d.class, "1") && (tl != null && tl.a.get() == p0.a.get())) {
          p0.c = tl.c;
       }
    label_0031 :
       this.l = p0;
       return;
    }
    public void setDetachOnFinish(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ComboAnimView.class, "12")) {
          return;
       }
       this.j = true;
       this.k = p0;
       if (this.m != null) {
          this.e.sendEmptyMessageDelayed(3, 1000);
       }
       return;
    }
    public void setEnableCombo(boolean p0){
       this.q = p0;
    }
    public void setEnableSingleCombo(boolean p0){
       this.r = p0;
    }
    public void setProvider(e p0){
       this.d = p0;
    }
    public void setSelfAdaption(boolean p0){
       if (PatchProxy.isSupport(ComboAnimView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ComboAnimView.class, "6")) {
          return;
       }
       this.s = p0;
       ComboAnimView tn = this.n;
       if (tn != null) {
          tn.r = p0;
       }
       return;
    }
}
