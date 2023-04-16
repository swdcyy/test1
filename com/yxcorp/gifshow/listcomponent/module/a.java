package com.yxcorp.gifshow.listcomponent.module.a;
import com.yxcorp.gifshow.listcomponent.module.KsModuleStateMachine$a;
import com.yxcorp.gifshow.listcomponent.module.b;
import java.lang.Object;
import com.yxcorp.gifshow.listcomponent.module.KsModuleStateMachine$State;
import java.util.Objects;
import com.yxcorp.gifshow.listcomponent.module.b$a;
import java.lang.Enum;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Iterator;
import java.util.List;
import java.lang.ref.WeakReference;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.lang.System;
import y0b.g;
import i1b.h$a;
import i1b.h;
import t0b.c;
import t0b.d;
import java.util.Arrays;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.listcomponent.dynamic.service.PresenterSets;
import y0b.h;
import java.util.Collection;
import ekd.q;
import java.util.LinkedHashSet;
import t0b.e;
import java.util.Set;
import android.util.Pair;
import r0b.a;
import r0b.a$a;
import android.view.View;

public final class a implements KsModuleStateMachine$a	// class@001a87
{
    public final b a;

    public void a(b p0){
       this.a = p0;
    }
    public final void a(KsModuleStateMachine$State p0){
       boolean b;
       b g;
       a ta = this.a;
       Objects.requireNonNull(ta);
       b uob = b.class;
       int i = b$a.a[p0.ordinal()];
       int i1 = 1;
       if (i != i1) {
          b = false;
          Pair pair = 3;
          String str = 2;
          if (i != str) {
             if (i != pair) {
                if (i != 4) {
                   if (i == 5) {
                      if (!PatchProxy.applyVoid(null, ta, uob, "15")) {
                         g = ta.g;
                         if (g != null) {
                            g.destroy();
                            ta.g = null;
                         }
                         Iterator iterator = ta.h.iterator();
                         while (iterator.hasNext()) {
                            iterator.next().destroy();
                         }
                         ta.f = null;
                         ta.b = KsModuleStateMachine$State.DESTROY;
                      }
                      ta.x();
                   }
                }else if(PatchProxy.applyVoid(null, ta, uob, "13")){
                   if (!PatchProxy.applyVoid(null, ta, uob, "20") && ta.d.get() != null) {
                      ta.d.get().getLifecycle().removeObserver(ta.m);
                   }
                   g = ta.g;
                   if (g != null) {
                      g.unbind();
                   }
                   if (ta.c == null) {
                      ta.e = null;
                   }
                   ta.b = KsModuleStateMachine$State.UNBIND;
                }
                ta.y();
             }else if(PatchProxy.applyVoid(null, ta, uob, "11")){
                ta.c = b;
                if (!PatchProxy.applyVoid(null, ta, uob, "19")) {
                   g = ta.d;
                   if (g != null) {
                      g.get().getLifecycle().addObserver(ta.m);
                   }
                }
                g = ta.g;
                if (g != null) {
                   uob = ta.e;
                   if (uob == null) {
                      Object[] objArray = new Object[b];
                      g.i(objArray);
                   }else {
                      Object[] objArray1 = new Object[uob.length];
                      System.arraycopy(uob, b, objArray1, b, uob.length);
                      ta.g.i(objArray1);
                   }
                }
                ta.b = KsModuleStateMachine$State.BIND;
             }
             ta.r();
          }else if(PatchProxy.applyVoid(null, ta, uob, "6")){
             PresenterV2 presenterV2 = ta.w();
             ta.g = presenterV2;
             if (presenterV2 == null) {
                ta.g = new PresenterV2();
             }
             h.b(ta.g, new g(ta));
             g = ta.p;
             if (g == null) {
                ta.p = d.b(null);
             }else {
                c[] uocArray = new c[i1];
                uocArray[b] = null;
                ta.p = d.a(g, Arrays.asList(uocArray));
             }
             if (ta.p != null) {
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                if (!PatchProxy.applyVoid(null, ta, uob, "4")) {
                   b p = ta.p;
                   PresenterSets presenterSet = PatchProxy.applyOneRefs(p, ta, uob, "5");
                   if (presenterSet != patchProxyRe) {
                   }else if(ta.n().h() == pair){
                      presenterSet = p.d();
                   }else if(ta.n().h() == str){
                      presenterSet = p.e();
                   }else {
                      presenterSet = p.b();
                   }
                   if (!q.f(presenterSet)) {
                      Iterator iterator1 = presenterSet.iterator();
                      while (iterator1.hasNext()) {
                         e uoe = iterator1.next();
                         if (!ta.i.contains(uoe)) {
                            ta.i.add(uoe.first);
                            b g1 = ta.g;
                            PresenterV2 presenterV21 = PatchProxy.applyOneRefsWithListener(uoe, null, a.class, "1");
                            if (presenterV21 != patchProxyRe) {
                            }else {
                               presenterV21 = uoe.second.a();
                               PatchProxy.onMethodExit(a.class, "1");
                            }
                            g1.U7(presenterV21);
                         }
                      }
                   }
                }
             }
             h.a(ta.g, ta.n(), ta);
             ta.g.f(ta.j);
             ta.b = KsModuleStateMachine$State.CREATE;
          }
          ta.s();
       }else {
          ta.b = KsModuleStateMachine$State.INIT;
       }
       return;
    }
}
