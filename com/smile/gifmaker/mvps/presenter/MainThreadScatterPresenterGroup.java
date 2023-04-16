package com.smile.gifmaker.mvps.presenter.MainThreadScatterPresenterGroup;
import ih5.c0;
import jh5.a;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.smile.gifmaker.mvps.presenter.MainThreadScatterPresenterGroup$mSlideDispatchPresenterGroup$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup;
import fh5.a;
import java.util.List;
import vl8.b;
import ih5.c0$a;
import java.lang.Runnable;
import eh5.l;
import java.util.Arrays;
import java.util.LinkedList;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.lang.Iterable;
import ih5.m;
import java.lang.Class;
import com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup$bind$$inlined$forEach$lambda$1;
import eh5.j;
import com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup$bind$1;
import android.view.View;
import ih5.o;
import com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup$create$$inlined$forEach$lambda$1;
import com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup$create$1;
import ih5.r;
import com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup$destroy$2$presenterDispatchSuccess$1;
import com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup$destroy$1;
import xf6.d;
import ih5.d0;
import com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup$unbind$3$presenterDispatchSuccess$1;
import com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup$unbind$1;

public final class MainThreadScatterPresenterGroup implements c0	// class@000c18
{
    public final PresenterV2 b;
    public boolean c;
    public final p d;
    public final a e;

    public void MainThreadScatterPresenterGroup(){
       super(null);
    }
    public void MainThreadScatterPresenterGroup(a p0){
       super();
       this.e = p0;
       this.b = new PresenterV2();
       this.d = s.c(new MainThreadScatterPresenterGroup$mSlideDispatchPresenterGroup$2(this));
    }
    public final void a(PresenterV2 p0){
       String str = "presenter";
       a.p(p0, str);
       if (!this.l()) {
          this.b.U7(p0);
       }else {
          DispatchPresenterGroup uDispatchPre = this.m();
          if (uDispatchPre != null) {
             a.p(p0, str);
             boolean b = (p0 instanceof a)? p0.G(): true;
             if (!b) {
                PresenterV2 presenterV2 = uDispatchPre.i();
                a.m(presenterV2);
                presenterV2.U7(p0);
             }else {
                uDispatchPre.d.add(p0);
                uDispatchPre.b.x(p0);
             }
          }
       }
       return;
    }
    public boolean b(int p0,int p1,boolean p2){
       return c0$a.b(this, p0, p1, p2);
    }
    public final void c(Runnable p0){
       String str = "runable";
       a.p(p0, str);
       if (!this.l()) {
          p0.run();
       }else {
          DispatchPresenterGroup uDispatchPre = this.m();
          if (uDispatchPre != null) {
             a.p(p0, str);
             if (uDispatchPre.i.d() && (uDispatchPre.i.e() || uDispatchPre.i.f())) {
                uDispatchPre.f = p0;
             }else {
                p0.run();
             }
          }
       }
       return;
    }
    public void d(long p0,l p1,boolean p2){
       a.p(p1, "type");
       DispatchPresenterGroup uDispatchPre = this.m();
       if (uDispatchPre != null) {
          uDispatchPre.d(p0, p1, p2);
       }
       return;
    }
    public final void e(Runnable p0){
       a.p(p0, "runable");
       if (!this.l()) {
          p0.run();
       }else if(this.m() != null){
          a.p(p0, "runable");
          p0.run();
       }
       return;
    }
    public void f(long p0){
       DispatchPresenterGroup uDispatchPre = this.m();
       if (uDispatchPre != null) {
          uDispatchPre.f(p0);
       }
       return;
    }
    public void g(long p0,l p1,boolean p2,boolean p3){
       a.p(p1, "type");
       DispatchPresenterGroup uDispatchPre = this.m();
       if (uDispatchPre != null) {
          uDispatchPre.g(p0, p1, p2, p3);
       }
       return;
    }
    public void h(long p0,l p1,boolean p2){
       a.p(p1, "type");
       c0$a.a(this, p0, p1, p2);
    }
    public final void i(Object[] p0){
       String str = "callerContext";
       a.p(p0, str);
       if (!this.l()) {
          this.b.i(Arrays.copyOf(p0, p0.length));
       }else {
          DispatchPresenterGroup uDispatchPre = this.m();
          if (uDispatchPre != null) {
             p0 = Arrays.copyOf(p0, p0.length);
             a.p(p0, str);
             uDispatchPre.e.clear();
             PresenterV2 presenterV2 = uDispatchPre.i();
             if (presenterV2 != null) {
                presenterV2.i(Arrays.copyOf(p0, p0.length));
             }
             a uoa = uDispatchPre.b.a(Arrays.copyOf(p0, p0.length));
             if (uDispatchPre.i.e() || uDispatchPre.i.f()) {
                uDispatchPre.a(m.a, "groupDispatchHelper_bind", new DispatchPresenterGroup$bind$1(uDispatchPre, uoa));
             }else {
                DispatchLogger.d.j("DispatchPresenterGroup", uDispatchPre.i.a()+" [BindMain]bind count="+uDispatchPre.d.size()+", hashcode="+uDispatchPre.hashCode());
                Iterator iterator = uDispatchPre.d.iterator();
                while (iterator.hasNext()) {
                   PresenterV2 presenterV21 = iterator.next();
                   char c = '_';
                   if (!uDispatchPre.c(m.a, "presenter_"+presenterV21.getClass().getSimpleName()+c+presenterV21.hashCode(), "presenter_"+presenterV21.getClass().getSimpleName()+c+presenterV21.hashCode()+"_BindMain", new DispatchPresenterGroup$bind$$inlined$forEach$lambda$1(presenterV21, uDispatchPre, uoa))) {
                      DispatchLogger.d.j("DispatchPresenterGroup", uDispatchPre.i.a()+" [presenter dispatch "+"fail], "+presenterV21.getClass().getSimpleName()+c+presenterV21.hashCode()+"_BindMain");
                      Object[] objArray = new Object[]{uoa};
                      presenterV21.i(objArray);
                      if (uDispatchPre.i.b()) {
                         uDispatchPre.e.add(presenterV21);
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public final void j(View p0){
       String str = "view";
       a.p(p0, str);
       this.c = true;
       if (!this.l()) {
          this.b.f(p0);
       }else {
          DispatchPresenterGroup uDispatchPre = this.m();
          if (uDispatchPre != null) {
             a.p(p0, str);
             PresenterV2 presenterV2 = uDispatchPre.i();
             if (presenterV2 != null) {
                presenterV2.f(p0);
             }
             if (uDispatchPre.i.e() || uDispatchPre.i.f()) {
                uDispatchPre.a(o.a, "groupDispatchHelper_create", new DispatchPresenterGroup$create$1(uDispatchPre, p0));
             }else {
                DispatchLogger.d.j("DispatchPresenterGroup", uDispatchPre.i.a()+" [CreateMain]create count="+uDispatchPre.d.size()+", hashcode="+uDispatchPre.hashCode());
                Iterator iterator = uDispatchPre.d.iterator();
                while (iterator.hasNext()) {
                   PresenterV2 presenterV21 = iterator.next();
                   char c = '_';
                   if (!uDispatchPre.c(o.a, "presenter_"+presenterV21.getClass().getSimpleName()+c+presenterV21.hashCode(), "presenter_"+presenterV21.getClass().getSimpleName()+c+presenterV21.hashCode()+"_CreateMain", new DispatchPresenterGroup$create$$inlined$forEach$lambda$1(presenterV21, uDispatchPre, p0))) {
                      DispatchLogger.d.j("DispatchPresenterGroup", uDispatchPre.i.a()+" [presenter dispatch "+"fail], "+presenterV21.getClass().getSimpleName()+c+presenterV21.hashCode()+"_CreateMain");
                      presenterV21.f(p0);
                   }
                }
             }
          }
       }
       return;
    }
    public final void k(){
       this.c = false;
       if (!this.l()) {
          this.b.destroy();
       }else {
          DispatchPresenterGroup uDispatchPre = this.m();
          if (uDispatchPre != null) {
             PresenterV2 presenterV2 = uDispatchPre.i();
             if (presenterV2 != null) {
                presenterV2.destroy();
             }
             if (uDispatchPre.i.e() || uDispatchPre.i.f()) {
                uDispatchPre.a(r.a, "groupDispatchHelper_destroy", new DispatchPresenterGroup$destroy$1(uDispatchPre));
             }else {
                DispatchLogger.d.j("DispatchPresenterGroup", uDispatchPre.i.a()+" [DestroyMain]destroy count="+uDispatchPre.d.size()+", hashcode="+uDispatchPre.hashCode());
                Iterator iterator = uDispatchPre.d.iterator();
                while (iterator.hasNext()) {
                   PresenterV2 presenterV21 = iterator.next();
                   char c = '_';
                   if (!uDispatchPre.c(r.a, "presenter_"+presenterV21.getClass().getSimpleName()+c+presenterV21.hashCode(), "presenter_"+presenterV21.getClass().getSimpleName()+c+presenterV21.hashCode()+"_DestroyMain", new DispatchPresenterGroup$destroy$2$presenterDispatchSuccess$1(presenterV21))) {
                      DispatchLogger.d.j("DispatchPresenterGroup", uDispatchPre.i.a()+" [presenter dispatch fail], "+presenterV21.getClass().getSimpleName()+c+presenterV21.hashCode()+"_DestroyMain");
                      presenterV21.destroy();
                   }
                }
             }
          }
       }
       return;
    }
    public final boolean l(){
       boolean b = (this.e != null && !d.b())? true: false;
       return b;
    }
    public final DispatchPresenterGroup m(){
       return this.d.getValue();
    }
    public final void n(){
       if (!this.l()) {
          this.b.unbind();
       }else {
          DispatchPresenterGroup uDispatchPre = this.m();
          if (uDispatchPre != null) {
             PresenterV2 presenterV2 = uDispatchPre.i();
             if (presenterV2 != null) {
                presenterV2.unbind();
             }
             if (uDispatchPre.i.e() || uDispatchPre.i.f()) {
                uDispatchPre.a(d0.a, "groupDispatchHelper_unbind", new DispatchPresenterGroup$unbind$1(uDispatchPre));
             }else {
                DispatchLogger.d.j("DispatchPresenterGroup", uDispatchPre.i.a()+" [UnBindMain]bind count="+uDispatchPre.d.size()+", hashcode="+uDispatchPre.hashCode());
                if (uDispatchPre.i.b()) {
                   Iterator iterator = uDispatchPre.e.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().unbind();
                   }
                }else {
                   Iterator iterator1 = uDispatchPre.d.iterator();
                   while (iterator1.hasNext()) {
                      PresenterV2 presenterV21 = iterator1.next();
                      char c = '_';
                      if (!uDispatchPre.c(d0.a, "presenter_"+presenterV21.getClass().getSimpleName()+c+presenterV21.hashCode(), "presenter_"+presenterV21.getClass().getSimpleName()+c+presenterV21.hashCode()+"_UnBindMain", new DispatchPresenterGroup$unbind$3$presenterDispatchSuccess$1(presenterV21))) {
                         DispatchLogger.d.j("DispatchPresenterGroup", uDispatchPre.i.a()+" [presenter dispatch "+"fail], "+presenterV21.getClass().getSimpleName()+c+presenterV21.hashCode()+"_UnBindMain");
                         presenterV21.unbind();
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
