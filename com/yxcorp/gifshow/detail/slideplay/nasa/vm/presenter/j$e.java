package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j$e;
import bf5.d$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Boolean;
import brd.y;
import bf5.d;
import java.util.Objects;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import io.reactivex.subjects.PublishSubject;
import android.view.View;
import androidx.fragment.app.Fragment;
import android.view.ViewGroup;
import com.yxcorp.gifshow.detail.util.ViewAbortClickUtils;
import kotlin.jvm.internal.a;
import uw9.o;
import q87.c;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup$LayoutParams;
import m9a.f0;
import android.view.View$OnClickListener;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import android.widget.TextView;
import wsd.m;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$a;
import java.util.Iterator;
import androidx.core.view.ViewGroupKt$b;
import zsd.u;
import rd5.i;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import m9a.y;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import xx9.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;

public class j$e implements d$a	// class@00181e
{
    public final j a;

    public void j$e(j p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoidWithListener(null, this, j$e.class, "1")) {
          return;
       }
       j$e ta = this.a;
       ta.V = ta.w.getPlayer().getCurrentPosition();
       PatchProxy.onMethodExit(j$e.class, "1");
       return;
    }
    public void b(float p0,int p1,boolean p2){
       ViewAbortClickUtils a;
       Object[] objArray1;
       if (PatchProxy.isSupport2(j$e.class, "3") && PatchProxy.applyVoidThreeRefsWithListener(Float.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, j$e.class, "3")) {
          return;
       }
       this.a.A.onNext(Float.valueOf(p0));
       j$e ta = this.a;
       if (ta.N == null) {
          p1.c = ta.w.getPlayer().getDuration();
          ta = this.a;
          Objects.requireNonNull(ta);
          j oj = j.class;
          String str = "22";
          Object[] objArray = null;
          if (!PatchProxy.applyVoidWithListener(objArray, ta, oj, str)) {
             if (!ta.P - null) {
                ta.P = ta.w.getPlayer().getDuration();
             }
             PatchProxy.onMethodExit(oj, str);
          }
          Boolean tRUE = Boolean.TRUE;
          this.a.K.r.onNext(tRUE);
          this.a.G.onNext(tRUE);
          if (this.a.s.getView() instanceof ViewGroup) {
             ViewGroup view = this.a.s.getView();
             String str1 = "NasaProgressV3VMPresenter";
             ViewAbortClickUtils viewAbortCli = ViewAbortClickUtils.class;
             if (!PatchProxy.applyVoidTwoRefs(view, str1, objArray, viewAbortCli, "1")) {
                a.p(view, "viewGroup");
                a.p(str1, "invoker");
                a = ViewAbortClickUtils.a;
                if (a.a(view)) {
                   objArray1 = new Object[0];
                   o.C().w("ViewAbortClickUtils", "此 ViewGroup 已经被添加了 AbortClickView", objArray1);
                }else {
                   Context context = view.getContext();
                   a.o(context, "viewGroup.context");
                   View view1 = PatchProxy.applyTwoRefs(context, str1, a, viewAbortCli, "4");
                   if (view1 != PatchProxyResult.class) {
                   }else {
                      view1 = new View(context);
                      view1.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
                      view1.setTag("VIEW_ABORT_CLICK#NasaProgressV3VMPresenter");
                      view1.setOnClickListener(f0.b);
                   }
                   view.addView(view1);
                   objArray1 = new Object[0];
                   o.C().w("ViewAbortClickUtils", "添加 AbortClickView，ViewGroup："+view+"\nTag: "+view1.getTag()+9+"Invoker: "+str1, objArray1);
                }
             }
          }
          ta = this.a;
          boolean b = true;
          ta.N = b;
          j u0 = ta.U0;
          if (u0 != null) {
             u0.setVisibility(4);
          }
          this.a.P8(b);
       }
       if (r1.l3(this.a.q.mEntity) && p2) {
          this.a.T.setVisibility(8);
       }
       PatchProxy.onMethodExit(j$e.class, "3");
       return;
    }
    public void c(){
       if (PatchProxy.applyVoidWithListener(null, this, j$e.class, "2")) {
          return;
       }
       j e = this.a.E;
       if (e != null) {
          e.onNext(Boolean.TRUE);
       }
       PatchProxy.onMethodExit(j$e.class, "2");
       return;
    }
    public void d(){
       if (PatchProxy.applyVoidWithListener(null, this, j$e.class, "4")) {
          return;
       }
       j e = this.a.E;
       if (e != null) {
          e.onNext(Boolean.FALSE);
       }
       PatchProxy.onMethodExit(j$e.class, "4");
       return;
    }
    public void e(float p0,int p1){
       String str;
       ViewAbortClickUtils a;
       Object[] objArray;
       Object obj;
       boolean b;
       if (PatchProxy.isSupport2(j$e.class, "5") && PatchProxy.applyVoidTwoRefsWithListener(Float.valueOf(p0), Integer.valueOf(p1), this, j$e.class, "5")) {
          return;
       }
       if (this.a.s.getView() instanceof ViewGroup) {
          ViewGroup view = this.a.s.getView();
          str = "NasaProgressV3VMPresenter";
          ViewAbortClickUtils viewAbortCli = ViewAbortClickUtils.class;
          if (!PatchProxy.applyVoidTwoRefs(view, str, null, viewAbortCli, "2")) {
             a.p(view, "viewGroup");
             a.p(str, "flag");
             a = ViewAbortClickUtils.a;
             String str2 = "ViewAbortClickUtils";
             if (!a.a(view)) {
                objArray = new Object[false];
                o.C().w(str2, "此 ViewGroup 还没有添加 AbortClickView", objArray);
             }else if(PatchProxy.applyVoidTwoRefs(view, str, a, viewAbortCli, "5")){
                Iterator iterator = ViewGroupKt.b(view).iterator();
                while (true) {
                   Iterator iterator1 = iterator;
                   if (iterator1.hasNext()) {
                      obj = iterator1.next();
                      Object obj1 = obj;
                      if (obj1.getTag() instanceof String) {
                         obj1 = obj1.getTag();
                         Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.String");
                         b = u.q2(obj1, "VIEW_ABORT_CLICK", false, 2, null);
                      }else {
                         b = false;
                      }
                      if (!b) {
                         continue ;
                      }
                   }else {
                      obj = null;
                   }
                   if (obj != null) {
                      view.removeView(obj);
                      objArray = new Object[false];
                      o.C().w(str2, "移除 AbortClickView，ViewGroup："+view+"\nTag: "+obj.getTag()+9+"Invoker: "+str, objArray);
                   }
                }
             }
          }
       }
       j$e ta = this.a;
       if (ta.N != null) {
          ta.K.r.onNext(Boolean.FALSE);
          ta = this.a;
          Objects.requireNonNull(ta);
          str = "11";
          if (!PatchProxy.isSupport2(j.class, str) || !PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p1), ta, j.class, str)) {
             ta.y.onNext(i.e);
             ta.w.getPlayer().seekTo((long)((((float)p1 * 0x3f800000) * (float)ta.P) / 10000.00f));
             PatchProxy.onMethodExit(j.class, str);
          }
          ta = this.a;
          long l = (long)p1;
          Objects.requireNonNull(ta);
          if (!PatchProxy.isSupport2(j.class, "17") || !PatchProxy.applyVoidOneRefsWithListener(Long.valueOf(l), ta, j.class, "17")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PROGRESS_BUTTON";
             i3 oi3 = i3.f();
             String str1 = "progress_type";
             if (n.I(ta.getActivity())) {
                oi3.d(str1, "LANDSCAPE_SCREE");
             }else {
                oi3.d(str1, "VERTICAL_SCREE");
             }
             if (ta.Y0 != null) {
                oi3.c("is_highlight_point", Integer.valueOf(TextUtils.n(ta.V8(ta.w.getPlayer().getCurrentPosition()), ta.V8(y.c(ta.q)))));
             }
             oi3.c("time_start", Long.valueOf(ta.V));
             oi3.c("time_end", Long.valueOf(ta.w.getPlayer().getCurrentPosition()));
             oi3.c("is_simplify_screen", Integer.valueOf(ta.z.c()));
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(ta.q.getEntity());
             u1.M("", ta.s, 0, uElementPack, uContentPack, null);
             PatchProxy.onMethodExit(j.class, "17");
          }
          this.a.P8(false);
       }
       ta = this.a;
       ta.N = false;
       ta.Y8(false, null);
       if (r1.l3(this.a.q.mEntity) && !NasaSlidePlayExperimentUtil.j()) {
          this.a.T.setVisibility(false);
       }
       j u0 = this.a.U0;
       if (u0 != null) {
          u0.setVisibility(false);
       }
       PatchProxy.onMethodExit(j$e.class, "5");
       return;
    }
}
