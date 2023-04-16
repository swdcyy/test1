package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.NasaSidebarFeedPresenter$c;
import d6a.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.NasaSidebarFeedPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import kp.r1;
import rf5.u;
import jta.c;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import y8c.g;
import qvb.q;
import com.kwai.library.slide.base.pagelist.a;
import qvb.n0;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewConfiguration;
import im8.f;
import java.lang.Integer;
import java.lang.StringBuilder;
import lw6.a;
import qvb.i;
import g3a.a;
import wvb.e;
import yw6.g;
import bw6.a;
import uw9.o;
import q87.c;
import k2b.u1;
import me5.a;
import y6a.o0;
import android.view.View$OnClickListener;
import y6a.p0;
import java.lang.Runnable;
import android.view.ViewGroup;

public class NasaSidebarFeedPresenter$c extends a	// class@0017f5
{
    public final NasaSidebarFeedPresenter b;

    public void NasaSidebarFeedPresenter$c(NasaSidebarFeedPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, NasaSidebarFeedPresenter$c.class, "2")) {
          return;
       }
       NasaSidebarFeedPresenter$c tb = this.b;
       tb.k1 = false;
       if (r1.A2(tb.T)) {
          this.b.X.F(true, 20);
       }
       tb = this.b;
       tb.X.B(tb.A1);
       if (this.b.w1.C()) {
          tb = this.b;
          if (tb.b1.mNeedReplaceFeed != null) {
             if (tb.M.getAdapter() != null) {
                this.b.M.setAdapter(objArray);
             }
             NasaSidebarFeedPresenter p1 = this.b.p1;
             if (p1 != null) {
                p1.Z0();
                this.b.p1 = objArray;
             }
          }
       }
       NasaSidebarFeedPresenter$c tb1 = this.b;
       tb1.w1.X1(tb1);
       if (this.b.w1.C()) {
          this.b.w1.M1(false);
          if (this.b.w1.H0() != null) {
             this.b.w1.H0().release();
          }
       }
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter$c.class, "2");
       return;
    }
    public void i2(){
       NasaSidebarFeedPresenter$c b5;
       Object obj = this;
       if (PatchProxy.applyVoidWithListener(null, obj, NasaSidebarFeedPresenter$c.class, "1")) {
          return;
       }
       NasaSidebarFeedPresenter$c b = obj.b;
       boolean b1 = true;
       b.k1 = b1;
       b.m1 = b1;
       int i = 20;
       boolean b2 = false;
       if (r1.A2(b.T)) {
          obj.b.X.F(b2, i);
       }
       b = obj.b;
       b.X.D(ViewConfiguration.get(b.getContext()).getScaledTouchSlop());
       b = obj.b;
       b.X.j(b.A1);
       boolean b3 = obj.b.w1.r();
       if (b3) {
          Integer integer = obj.b.V.get();
          a.b("NasaSidebarFeedPresenter", "becomesAttachedOnPageSelected originIndexInFeed = "+integer);
          if (integer.intValue() >= 0) {
             NasaSidebarFeedPresenter$c b4 = obj.b;
             if (b4.b1.mNeedReplaceFeed != null) {
                i oi = b4.w1.J0();
                int i1 = obj.b.w1.Y0();
                String str = "becomesAttachedOnPageSelected originDataSource Size = ";
                a.b("NasaSidebarFeedPresenter", str+i1);
                if (v13 = oi instanceof a) {
                   i1 = oi.m().getCount();
                   a.b("NasaSidebarFeedPresenter", "becomesAttachedOnPageSelected pageList instanceof IsolatedDataPageListWrapper, originSize = "+i1);
                }
                String str1 = str+i1+" pageList.getCount\(\) = ";
                int i2 = (oi == null)? 0: oi.getCount();
                a.b("NasaSidebarFeedPresenter", str1+i2+" originIndexInFeed = "+integer);
                if (oi != null && (oi.getCount() > integer.intValue() && i1 > integer.intValue())) {
                   a.b("NasaSidebarFeedPresenter", "becomesAttachedOnPageSelected index 条件满足 ");
                   if (integer.intValue() > -1) {
                      a.b("NasaSidebarFeedPresenter", "becomesAttachedOnPageSelected groot 条件满足 ");
                      if (obj.b.w1.P0() != null) {
                         a.b("NasaSidebarFeedPresenter", "becomesAttachedOnPageSelected mSlidePlayViewModel.getGrootOriginDataSource\(\) != null, do replace originIndexInFeed = "+integer+" mPhoto = "+obj.b.T.toString());
                         obj.b.w1.P0().R0(integer.intValue(), obj.b.T, b1);
                      }else {
                         a.b("NasaSidebarFeedPresenter", "becomesAttachedOnPageSelected mSlidePlayViewModel.getGrootOriginDataSource\(\) == null, 无法 replace");
                      }
                   }else {
                      a.b("NasaSidebarFeedPresenter", "becomesAttachedOnPageSelected groot 条件不满足 ");
                      oi.set(integer.intValue(), obj.b.T);
                   }
                }else if(v13 && (oi.getCount() <= i && i1 <= i)){
                   str1 = obj.b.W8(oi, "PageList: ")+"; "+obj.b.W8(oi.m(), "OriginPageList: ");
                   Object[] objArray = new Object[b2];
                   String str2 = "NasaSideFeedInconsistentPageList";
                   o.C().w(str2, str1, objArray);
                   u1.R(str2, str1, 5);
                }
                b5 = obj.b;
                b5.w1.I1(b5.T, integer.intValue(), "NasaSidebarFeedPresenter");
             }
          }
       }
       b5 = obj.b;
       b5.p1 = b5.M.getAdapter();
       b5 = obj.b;
       NasaSidebarFeedPresenter p1 = b5.p1;
       if (p1 != null) {
          QPhoto qPhoto = p1.r1();
          NasaSidebarFeedPresenter$c b6 = obj.b;
          NasaSidebarFeedPresenter p11 = b6.p1;
          p11.w1(b6.T);
          p11.u1(new o0(obj));
          if (qPhoto != null) {
             obj.b.p1.v1(null);
             obj.b.p1.m0(obj.b.p1.s1(qPhoto), "");
          }
          b5 = obj.b;
          int i3 = b5.p1.s1(b5.T);
          obj.b.p1.v1(null);
          obj.b.p1.m0(i3, "");
          if (i3 > -1) {
             obj.b.M.post(new p0(obj, i3, b3));
          }
       }else if(b5.b1.mNeedReplaceFeed == null){
          b5.n9();
       }
       b5 = obj.b;
       b5.w1.C1(b5);
       if (b3) {
          b5 = obj.b;
          b5.a1.set(b5.T.getKsOrderId());
       }else {
          b5 = obj.b;
          b5.Z0.set(b5.T.getKsOrderId());
          obj.b.a1.set("");
       }
       obj.b.m9();
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter$c.class, "1");
       return;
    }
}
