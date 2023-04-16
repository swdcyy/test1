package com.yxcorp.gifshow.activity.share.presenter.f1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import jq.a;
import com.yxcorp.gifshow.activity.share.presenter.e1;
import java.util.concurrent.Callable;
import brd.a0;
import t45.d;
import brd.z;
import zw8.k2;
import com.yxcorp.gifshow.activity.share.presenter.d1;
import erd.g;
import crd.b;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import android.net.NetworkInfo;
import com.yxcorp.utility.SystemUtil;
import u07.t$a;
import android.app.Activity;
import zw8.j2;
import u07.u;
import u07.t;
import u07.j;
import com.yxcorp.gifshow.activity.GifshowActivity;
import xw8.p0;
import java.lang.Integer;

public class f1 extends PresenterV2	// class@0013df
{
    public GifshowActivity p;
    public p0 q;
    public int r;

    public void f1(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f1.class, "2")) {
          return;
       }
       if (PostExperimentUtils.L()) {
          Object[] objArray = new Object[0];
          a.c("ShareNetworkPromptPresenter", "enablePostEditAnrGovernance, get NetworkInfo in an asynchronous thread", objArray);
          this.X7(a0.y(e1.b).T(d.c).G(d.a).R(new k2(this), d1.b));
       }else {
          this.P8(SystemUtil.c(a.a().a()));
       }
       return;
    }
    public final void P8(NetworkInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f1.class, "3")) {
          return;
       }
       if (p0 == null || !p0.isConnectedOrConnecting()) {
          t$a uoa = new t$a(this.p);
          uoa.W0(R.string.arg_RES_7f103ffc);
          uoa.y0(R.string.arg_RES_7f103986);
          uoa.S0(R.string.arg_RES_7f10525d);
          uoa.Q0(R.string.arg_RES_7f103944);
          uoa.t0(new j2(this));
          j.d(uoa);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f1.class, "1")) {
          return;
       }
       this.p = this.r8("SHARE_ACTIVITY");
       this.q = this.r8("SHARE_PAGE_PRESENTER_MODEL");
       this.r = this.r8("WorkspaceEditingAction").intValue();
       return;
    }
}
