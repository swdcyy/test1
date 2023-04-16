package com.yxcorp.gifshow.growth.refresh.GrowthDetailSlidePlayRefreshPresenter$a;
import qvb.q;
import com.yxcorp.gifshow.growth.refresh.GrowthDetailSlidePlayRefreshPresenter;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;

public final class GrowthDetailSlidePlayRefreshPresenter$a implements q	// class@0014bb
{
    public final GrowthDetailSlidePlayRefreshPresenter b;

    public void GrowthDetailSlidePlayRefreshPresenter$a(GrowthDetailSlidePlayRefreshPresenter p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       GrowthDetailSlidePlayRefreshPresenter$a uoa = GrowthDetailSlidePlayRefreshPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       GrowthDetailSlidePlayRefreshPresenter$a tb = this.b;
       GrowthDetailSlidePlayRefreshPresenter r = tb.r;
       int i = -1;
       if (r > i) {
          tb.r = i;
          Objects.requireNonNull(tb);
          GrowthDetailSlidePlayRefreshPresenter growthDetail = GrowthDetailSlidePlayRefreshPresenter.class;
          if (!PatchProxy.isSupport(growthDetail) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(r), tb, growthDetail, "6")) {
             growthDetail = tb.q;
             String str = "mSlidePlayViewModel";
             if (growthDetail == null) {
                a.S(str);
             }
             i = growthDetail.a0();
             if (r > i) {
                int i1 = r + 1;
                GrowthDetailSlidePlayRefreshPresenter q = tb.q;
                if (q == null) {
                   a.S(str);
                }
                List list = q.V0();
                a.m(list);
                if (i1 <= list.size()) {
                   q = tb.q;
                   if (q == null) {
                      a.S(str);
                   }
                   list = q.V0();
                   a.m(list);
                   List list1 = list.subList((i + 1), i1);
                   growthDetail = tb.q;
                   if (growthDetail == null) {
                      a.S(str);
                   }
                   q = tb.q;
                   if (q == null) {
                      a.S(str);
                   }
                   GrowthDetailSlidePlayRefreshPresenter q1 = tb.q;
                   if (q1 == null) {
                      a.S(str);
                   }
                   growthDetail.D1(list1, q.U0(q1.a0()), "NasaFeaturedAutoRefreshPresenter");
                }
             }
          }
       }
       if (p0) {
          p0.s = 0;
       }
       return;
    }
}
