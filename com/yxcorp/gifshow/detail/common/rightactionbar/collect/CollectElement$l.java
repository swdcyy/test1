package com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$l;
import erd.g;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wh5.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import kotlin.jvm.internal.a;
import v6a.m0;
import im8.f;
import tkd.b;
import tkd.d;
import ap5.a;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import hn5.n;
import hn5.m;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Context;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import com.kwai.feature.api.feed.home.common.SlideGuideManager$a;
import android.app.Activity;
import qp7.x0;
import js7.o;
import pp7.b;

public final class CollectElement$l implements g	// class@00149f
{
    public final CollectElement b;
    public final String c;

    public void CollectElement$l(CollectElement p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void accept(Boolean p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectElement$l.class, "1")) {
          return;
       }
       p0.K = a.f();
       if (!TextUtils.x(this.c) && (!CollectElement.n0(this.b).isCollected() && !this.b.H().A())) {
          CollectElement t = this.b.t;
          if (t == null) {
             a.S("mCallerContext");
          }
          m0 x = t.x;
          x = (x != null)? x.get(): null;
          if (!a.g(x, Boolean.TRUE) && (this.b.J == null && (!d.a(-2061018968).AT() || (!NasaSlidePlayExperimentUtil.d() && !a.f())))) {
             t = this.b.y;
             if (t == null || t.r() != true) {
                if (m.a().U3(this.b.q0())) {
                   GifshowActivity gifshowActiv = this.b.q0();
                   String str = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity";
                   Objects.requireNonNull(gifshowActiv, str);
                   q oq = q.p0(gifshowActiv);
                   String str1 = "MenuViewModel.get\(\(mActivity as FragmentActivity\)\)";
                   a.o(oq, str1);
                   if (!oq.s0()) {
                      gifshowActiv = this.b.q0();
                      Objects.requireNonNull(gifshowActiv, str);
                      oq = q.p0(gifshowActiv);
                      a.o(oq, str1);
                      if (oq.t0()) {
                      label_00f6 :
                         return;
                      }
                   }else {
                      goto label_00f6 ;
                   }
                }
                if (!SlideGuideManager.m.a().b(this.b.q0())) {
                   o oo = this.b.E();
                   CollectElement$l tc = this.c;
                   Objects.requireNonNull(oo);
                   if (PatchProxy.applyVoidOneRefs(tc, oo, o.class, "9")) {
                      goto label_00f6 ;
                   }else {
                      a.p(tc, "text");
                      oo.h.f(tc);
                      goto label_00f6 ;
                   }
                }else {
                   goto label_00f6 ;
                }
             }else {
                goto label_00f6 ;
             }
          }else {
             goto label_00f6 ;
          }
       }else {
          goto label_00f6 ;
       }
    }
    public void accept(Object p0){
       this.accept(p0);
    }
}
