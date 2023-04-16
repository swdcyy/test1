package com.yxcorp.gifshow.hot.stagger.HomeHotFragment$a;
import qvb.q;
import com.yxcorp.gifshow.hot.stagger.HomeHotFragment;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import jb5.d;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import qvb.a;
import qvb.n0;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import rvb.k;
import rvb.k$a;
import rvb.b;
import rvb.n;
import com.kwai.component.homepage_interface.pagelist.prefetch.HomePrefetchConfigUtils;
import com.kwai.component.homepage_interface.pagelist.model.PhotoPage;
import rvb.c;

public class HomeHotFragment$a implements q	// class@001899
{
    public final HomeHotFragment b;

    public void HomeHotFragment$a(HomeHotFragment p0){
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
       HomeHotFragment$a uoa = HomeHotFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       this.b.Qh().f(this);
       k$a m = k.m;
       n.a(m).h("userHitPrefetch", String.valueOf(HomePrefetchConfigUtils.b.a(PhotoPage.FOUND)));
       b uob = n.a(m);
       boolean b = true;
       if (this.b.Qh().L0().mLocalRequestSource != b) {
          b = false;
       }
       uob.h("dataUsedPreFetch", String.valueOf(b));
       return;
    }
}
