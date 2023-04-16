package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.NasaSidebarFeedPresenter$b;
import jta.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.NasaSidebarFeedPresenter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import lw6.a;
import joc.q;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.List;
import r7a.f;
import java.util.Iterator;
import jta.c;
import uw9.o;
import java.lang.StringBuilder;
import android.view.View;
import q87.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import me5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.util.Objects;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import android.view.ViewGroup;
import com.yxcorp.gifshow.util.rx.RxBus;
import va5.e;

public class NasaSidebarFeedPresenter$b extends a	// class@0017f4
{
    public final NasaSidebarFeedPresenter a;

    public void NasaSidebarFeedPresenter$b(NasaSidebarFeedPresenter p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       if (PatchProxy.isSupport2(NasaSidebarFeedPresenter$b.class, "3") && PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(p0), this, NasaSidebarFeedPresenter$b.class, "3")) {
          return;
       }
       a.b("NasaSidebarFeedPresenter", "onSwipeFinish...");
       NasaSidebarFeedPresenter$b ta = this.a;
       if (ta.k1 == null) {
          PatchProxy.onMethodExit(NasaSidebarFeedPresenter$b.class, "3");
          return;
       }else {
          boolean b = true;
          int i = 0x3f800000;
          if (!(v6 = p0 - i)) {
             ta.m1 = b;
          }
          NasaSidebarFeedPresenter q1 = ta.q1;
          if (q1 != null) {
             if (!v6) {
                q1.e(4);
             }else {
                q1.a(4);
             }
          }
          q1 = this.a.r1;
          if (q1 != null) {
             if (!v6) {
                q1.e(4);
             }else {
                q1.a(4);
             }
          }
          ta = this.a;
          ta.j1 = p0;
          ta.l9();
          ta = this.a;
          if (!ta.j1 - i) {
             ta.w1.s(b);
          }
          Iterator iterator = this.a.e1.b().iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0);
          }
          if (this.a.N != null) {
             Object[] objArray = new Object[0];
             o.C().w("NasaSidebarFeedPresenter", "mProfilePhotosLayout: "+p0+", "+this.a.N.getTranslationX()+", "+this.a.N.getVisibility()+", "+this.a.N.getAlpha()+", "+this.a.N.getLeft()+", "+this.a.N.getTop()+", "+this.a.N.getWidth()+", "+this.a.N.getHeight(), objArray);
          }
          PatchProxy.onMethodExit(NasaSidebarFeedPresenter$b.class, "3");
          return;
       }
    }
    public void c(float p0){
       NasaSidebarFeedPresenter w1;
       if (PatchProxy.isSupport2(NasaSidebarFeedPresenter$b.class, "2") && PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(p0), this, NasaSidebarFeedPresenter$b.class, "2")) {
          return;
       }
       NasaSidebarFeedPresenter$b ta = this.a;
       if (ta.k1 == null) {
          PatchProxy.onMethodExit(NasaSidebarFeedPresenter$b.class, "2");
          return;
       }else {
          ta.p1 = ta.M.getAdapter();
          ta = this.a;
          int i = 0;
          if (ta.p1 == null || !TextUtils.n(ta.w1.D0(), this.a.T.getUserId())) {
             Object[] objArray = new Object[i];
             o.C().w("NasaSidebarFeedPresenter", "refresh profile adapter", objArray);
             this.a.n9();
          }
          ta = this.a;
          ta.j1 = p0;
          if (!p0) {
             r1.R4(ta.T.mEntity, true);
          }
          ta = this.a;
          Objects.requireNonNull(ta);
          NasaSidebarFeedPresenter nasaSidebarF = NasaSidebarFeedPresenter.class;
          if (!PatchProxy.isSupport2(nasaSidebarF, "17") || !PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(p0), ta, nasaSidebarF, "17")) {
             w1 = ta.N;
             if (w1 != null) {
                w1.setTranslationX(((float)NasaSidebarFeedPresenter.D1 * p0));
             }
             PatchProxy.onMethodExit(nasaSidebarF, "17");
          }
          this.a.V8(p0);
          w1 = this.a.w1;
          if (!p0 - 0x3f800000) {
             i = true;
          }
          w1.U1(i);
          Iterator iterator = this.a.e1.b().iterator();
          while (iterator.hasNext()) {
             iterator.next().c(p0);
          }
          PatchProxy.onMethodExit(NasaSidebarFeedPresenter$b.class, "2");
          return;
       }
    }
    public void d(float p0){
       if (PatchProxy.isSupport2(NasaSidebarFeedPresenter$b.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(p0), this, NasaSidebarFeedPresenter$b.class, "1")) {
          return;
       }
       a.b("NasaSidebarFeedPresenter", "onStartSwipe...  "+this.a.w1.b1()+"  viewPager: visible = "+this.a.w1.s2().getVisibility()+" firstValid = "+this.a.w1.j0()+" lastValid = "+this.a.w1.Z());
       RxBus.f.b(new e(true));
       Iterator iterator = this.a.e1.b().iterator();
       while (iterator.hasNext()) {
          iterator.next().d(p0);
       }
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter$b.class, "1");
       return;
    }
    public boolean e(){
       return true;
    }
}
