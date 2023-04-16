package com.google.android.material.tabs.b;
import wq6.h;
import com.google.android.material.tabs.NasaTabView;
import com.google.android.material.tabs.a;
import java.lang.Object;
import crd.a;
import java.util.Set;
import java.util.Collections;
import java.util.ArrayList;
import android.view.View;
import android.app.Activity;
import e3a.a;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import brd.t;
import jk.d;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import ujc.e;
import java.lang.Class;
import t45.d;
import brd.z;
import jk.c;
import java.lang.Boolean;
import com.kwai.library.widget.popup.bubble.a$c;
import sn5.g;
import qrd.l1;
import com.kwai.library.widget.popup.bubble.a;
import com.kwai.library.widget.popup.common.c;
import k07.p;
import java.lang.ref.WeakReference;
import java.util.List;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c$b;
import com.google.android.material.tabs.b$b;
import jn5.c;
import jk.f;
import java.lang.String;
import msd.a;
import jn5.g;
import o07.a;
import lnc.b9;
import java.util.Iterator;
import android.animation.Animator$AnimatorListener;
import com.google.android.material.tabs.b$a;
import com.yxcorp.utility.Log;
import ekd.c;
import java.lang.StringBuilder;
import jk.e;
import wkd.b;
import tjc.c;
import java.lang.Runnable;
import java.util.HashSet;
import com.google.common.collect.o;

public class b	// class@0016d7
{
    public final h a;
    public final NasaTabView b;
    public final a c;
    public final a d;
    public Set e;
    public final List f;
    public final List g;
    public boolean h;

    public void b(h p0,NasaTabView p1,a p2){
       super();
       a uoa = new a();
       this.d = uoa;
       this.e = Collections.emptySet();
       this.f = new ArrayList();
       this.g = new ArrayList();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       q oq = q.p0(a.a(p1));
       this.h = oq.s0();
       uoa.c(oq.r0().subscribe(new d(this), Functions.d()));
       uoa.c(RxBus.f.f(e.class).observeOn(d.a).subscribe(new c(this)));
    }
    public static void a(b p0,Boolean p1){
       p0.k(p1);
    }
    public static void b(b p0,a$c p1,g p2,boolean p3){
       p0.m(p1, p2, p3);
    }
    public static void c(b p0,e p1){
       p0.i(p1);
    }
    public static l1 d(b p0,boolean p1,a$c p2){
       return p0.l(p1, p2);
    }
    private void k(Boolean p0){
       if (p0.booleanValue() != this.h && !p0.booleanValue()) {
          this.o();
       }
       if (p0.booleanValue()) {
          this.h();
       }
       this.h = p0.booleanValue();
       return;
    }
    private l1 l(boolean p0,a$c p1){
       a uoa;
       if (p0) {
          uoa = p1.e0();
          uoa.Z();
       }else {
          uoa = p.m(p1);
       }
       if (uoa != null) {
          this.f.add(new WeakReference(uoa));
       }
       return l1.a;
    }
    private void m(a$c p0,g p1,boolean p2){
       p0.o0(this.b);
       p0.M(new b$b(this, p0.t(), p1));
       g.h(new c(p1.f, p0, p1.g, new f(this, p2, p0)));
    }
    public void e(g p0){
       if (p0.a != null) {
          this.n(p0);
       }else {
          this.j();
       }
       return;
    }
    public void f(g p0){
       if (!a.b(this.b)) {
          p0.h = false;
       }
       return;
    }
    public void g(){
       b9.a(this.d);
       Iterator iterator = this.g.iterator();
       while (iterator.hasNext()) {
          this.c.o(iterator.next());
       }
       return;
    }
    public final void h(){
       Iterator iterator = this.f.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next().get();
          if (uoa != null && uoa.K()) {
             uoa.o();
          }
       }
       this.f.clear();
       return;
    }
    public final void i(e p0){
       if (p0.a != 4) {
          return;
       }
       this.o();
       return;
    }
    public final void j(){
       this.h();
       this.e.clear();
    }
    public void n(g p0){
       if (this.c.k()) {
          b$a uoa = new b$a(this, p0);
          this.g.add(uoa);
          this.c.c(uoa);
          return;
       }else {
          String str = "BottomBarTabViewBubbleHelper";
          if (!this.c.l()) {
             Log.g(str, "ignore bubble, bottom bar id hidden");
             return;
          }else {
             String str1 = c.b(this.b);
             if (str1 != null) {
                Log.g(str, "ignore bubble, bottom bar is covered : "+str1);
                return;
             }else {
                g b = p0.b;
                if (b == null) {
                   Log.g(str, "bubbleBuilder = null");
                   return;
                }else if(p0.f == null){
                   Log.g(str, "bubbleState.mRegionName = null");
                   return;
                }else {
                   e uoe = new e(this, b, p0, p0.e);
                   if (!b.a(-1608526086).S() && this.h == null) {
                      uoe.run();
                   }else if(this.e.isEmpty()){
                      Runnable[] runnableArra = new Runnable[]{uoe};
                      this.e = o.k(runnableArra);
                   }else {
                      this.e.add(uoe);
                   }
                   return;
                }
             }
          }
       }
    }
    public final void o(){
       if (this.e.isEmpty()) {
          return;
       }
       Iterator iterator = this.e.iterator();
       while (iterator.hasNext()) {
          iterator.next().run();
       }
       this.e = Collections.emptySet();
       return;
    }
}
