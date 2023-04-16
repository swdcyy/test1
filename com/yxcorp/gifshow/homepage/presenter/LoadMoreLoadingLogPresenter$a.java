package com.yxcorp.gifshow.homepage.presenter.LoadMoreLoadingLogPresenter$a;
import qvb.q;
import com.yxcorp.gifshow.homepage.presenter.LoadMoreLoadingLogPresenter;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.p;
import android.os.SystemClock;
import java.util.Objects;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import p1b.b;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class LoadMoreLoadingLogPresenter$a implements q	// class@001794
{
    public final LoadMoreLoadingLogPresenter b;

    public void LoadMoreLoadingLogPresenter$a(LoadMoreLoadingLogPresenter p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       LoadMoreLoadingLogPresenter$a uoa = LoadMoreLoadingLogPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       p.a(this, p0, p1);
       this.b(false);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public final void b(boolean p0){
       LoadMoreLoadingLogPresenter$a uoa = LoadMoreLoadingLogPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       uoa = this.b;
       if (uoa.t != null) {
          long l = SystemClock.elapsedRealtime() - this.b.u;
          Objects.requireNonNull(uoa);
          LoadMoreLoadingLogPresenter loadMoreLoad = LoadMoreLoadingLogPresenter.class;
          if (!PatchProxy.isSupport(loadMoreLoad) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(l), Boolean.valueOf(p0), uoa, loadMoreLoad, "10")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LOADING";
             LoadMoreLoadingLogPresenter p = uoa.p;
             if (p == null) {
                a.S("mFragment");
             }
             b uob = b.o0(p);
             a.o(uob, "LoadMoreDecisionHelper.get\(mFragment\)");
             String str = uob.p0();
             i3 oi3 = i3.f();
             oi3.c("duration", Long.valueOf(l));
             String str1 = (p0)? "SUCCESS": "FAIL";
             oi3.d("status", str1);
             oi3.d("loadMoreDecision", str);
             uElementPack.params = oi3.e();
             u1.u0(false, uElementPack, null);
          }
          p0.t = false;
       }
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       LoadMoreLoadingLogPresenter$a uoa = LoadMoreLoadingLogPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       p.b(this, p0, p1);
       this.b(true);
       return;
    }
}
