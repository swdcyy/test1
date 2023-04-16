package com.yxcorp.gifshow.growth.share.ShareBackNasaRefreshPresenter$a;
import qvb.q;
import com.yxcorp.gifshow.growth.share.ShareBackNasaRefreshPresenter;
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
import qqa.b;
import java.lang.Runnable;
import ekd.k1;

public final class ShareBackNasaRefreshPresenter$a implements q	// class@0014be
{
    public final ShareBackNasaRefreshPresenter b;

    public void ShareBackNasaRefreshPresenter$a(ShareBackNasaRefreshPresenter p0){
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
       return false;
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       ShareBackNasaRefreshPresenter$a uoa = ShareBackNasaRefreshPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       ShareBackNasaRefreshPresenter$a tb = this.b;
       ShareBackNasaRefreshPresenter q = tb.q;
       int i = -1;
       if (q > i) {
          tb.q = i;
          Objects.requireNonNull(tb);
          ShareBackNasaRefreshPresenter shareBackNas = ShareBackNasaRefreshPresenter.class;
          if (!PatchProxy.isSupport(shareBackNas) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(q), tb, shareBackNas, "9")) {
             shareBackNas = tb.p;
             String str = "mSlidePlayViewModel";
             if (shareBackNas == null) {
                a.S(str);
             }
             i = shareBackNas.a0();
             ShareBackNasaRefreshPresenter p = tb.p;
             if (p == null) {
                a.S(str);
             }
             if (p.V0() != null && q > i) {
                int i1 = q + 1;
                p = tb.p;
                if (p == null) {
                   a.S(str);
                }
                List list = p.V0();
                a.m(list);
                if (i1 <= list.size()) {
                   p = tb.p;
                   if (p == null) {
                      a.S(str);
                   }
                   List list1 = p.V0();
                   a.m(list1);
                   k1.o(new b(tb, list1.subList((i + 1), i1)));
                }
             }
          }
       }
    label_0088 :
       if (p0) {
          p0.r = 0;
       }
       return;
    }
}
