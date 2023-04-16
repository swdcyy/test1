package com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowRefreshPresenter$b;
import gka.o;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowRefreshPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import androidx.fragment.app.Fragment;
import gha.p;
import iia.u1;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import g9c.a;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import wkd.b;
import nga.g;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kwai.component.homepage_interface.homeitemfragment.a;
import rja.c;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Runnable;
import android.view.ViewGroup;
import java.util.Objects;
import oa5.a;
import android.content.SharedPreferences;

public class HomeFollowRefreshPresenter$b implements o	// class@0011f9
{
    public final HomeFollowRefreshPresenter b;

    public void HomeFollowRefreshPresenter$b(HomeFollowRefreshPresenter p0){
       this.b = p0;
       super();
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, HomeFollowRefreshPresenter$b.class, "2")) {
          return;
       }
       HomeFollowRefreshPresenter$b tb = this.b;
       tb.E = false;
       tb.F = true;
       tb.D = System.currentTimeMillis();
       return;
    }
    public void u(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HomeFollowRefreshPresenter$b.class, "1")) {
          return;
       }
       KsLogFollowTag sTAGGER_REFR = KsLogFollowTag.STAGGER_REFRESH;
       sTAGGER_REFR.appendTag("HomeFollowRefreshPresenter");
       c.i(sTAGGER_REFR, "onPageSelect");
       if (p.g(this.b.p)) {
          c.i(sTAGGER_REFR.appendTag("HomeFollowRefreshPresenter"), "follow has notify. return");
          return;
       }else {
          this.b.I.a();
          HomeFollowRefreshPresenter$b uob = (this.b.p.g7().R0() && !this.b.p.mi())? 1: null;
          boolean b = b.a(0x5327bbd7).b();
          if (uob) {
             this.b.s.f(RefreshType.INIT);
          }else if(b){
             this.b.t.m(RefreshType.INIT);
          }
          this.b.p.h0().removeCallbacks(this.b.P);
          uob = this.b;
          Objects.requireNonNull(uob);
          if (!PatchProxy.applyVoid(objArray, uob, HomeFollowRefreshPresenter.class, "11")) {
             int intx = a.a.getInt("AppRefreshFeedListInSecond", 0);
             if (uob.x != null || (intx > 0 && (System.currentTimeMillis() - uob.w) - (long)(intx * 1000) >= 0)) {
                c.i(sTAGGER_REFR.appendTag("HomeFollowRefreshPresenter"), "refreshFeed");
                if (uob.p.g7() != null && uob.p.g7().getItemCount() > 0) {
                   uob.w = System.currentTimeMillis();
                   uob.x = false;
                   uob.s.g(RefreshType.FOLLOW_RETURN_REFRESH, true);
                }
             }
          }
          return;
       }
    }
}
