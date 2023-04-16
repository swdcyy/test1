package com.yxcorp.gifshow.corona.common.plugin.fragment.CoronaTVBiFeedsProxyFragment;
import com.yxcorp.gifshow.corona.common.plugin.fragment.CoronaBasePluginProxyFragment;
import com.kwai.framework.model.channel.HotChannel;
import java.lang.String;
import ul5.e;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.corona.util.CoronaLiveStyle;
import com.kwai.feature.api.corona.util.CoronaAllExperimentUtil;
import oq9.a;
import androidx.fragment.app.Fragment;
import tkd.b;
import tkd.d;
import cm5.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import im8.c;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import brd.t;
import com.yxcorp.gifshow.corona.common.plugin.fragment.CoronaTVBiFeedsProxyFragment$a;
import erd.g;
import crd.b;
import vl5.b;
import java.util.HashMap;
import android.view.View;
import wq6.d;
import wq6.k;

public final class CoronaTVBiFeedsProxyFragment extends CoronaBasePluginProxyFragment	// class@001262
{
    public final HotChannel k;
    public final String l;
    public final boolean m;
    public final e n;
    public HashMap o;

    public void CoronaTVBiFeedsProxyFragment(HotChannel p0,String p1,boolean p2,e p3){
       a.p(p3, "param");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, CoronaTVBiFeedsProxyFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       a.o(obj, "super.onCreatePresenter\(\)");
       if (CoronaAllExperimentUtil.a() == CoronaLiveStyle.EXPERIMENT_V1 || CoronaAllExperimentUtil.a() == CoronaLiveStyle.EXPERIMENT_V2) {
          obj.U7(new a(this.m));
       }
       PatchProxy.onMethodExit(CoronaTVBiFeedsProxyFragment.class, "3");
       return obj;
    }
    public Fragment ch(){
       BaseFragment obj = PatchProxy.apply(null, this, CoronaTVBiFeedsProxyFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a(-241623919).XR(this.k, this.l, this.m, this.n);
       a.o(obj, "PluginManager.get\(Corona¡­tabName, isBottom, param\)");
       return obj;
    }
    public Object dh(){
       Object obj = PatchProxy.apply(null, this, CoronaTVBiFeedsProxyFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c("SESSION_ID", this.n.a());
    }
    public String fh(){
       return "CoronaTVFeedsFragment";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoronaTVBiFeedsProxyFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (!this.Vg().c()) {
          this.Vg().j().subscribe(new CoronaTVBiFeedsProxyFragment$a(this));
       }
       b.c(this.n.a(), "PROXY_FRAGMENT_ON_CREATE");
       return;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, CoronaTVBiFeedsProxyFragment.class, "7")) {
       }else {
          CoronaTVBiFeedsProxyFragment to = this.o;
          if (to != null) {
             to.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoronaTVBiFeedsProxyFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.z5();
       return;
    }
}
