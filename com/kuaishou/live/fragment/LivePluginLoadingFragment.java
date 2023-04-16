package com.kuaishou.live.fragment.LivePluginLoadingFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import crd.b;
import lnc.b9;
import brd.t;
import qs5.d;
import t45.d;
import brd.z;
import c43.a;
import erd.g;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.fragment.LivePluginLoadingFragment$a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import ag6.a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import c43.b;
import android.view.View$OnClickListener;

public class LivePluginLoadingFragment extends BaseFragment	// class@001bca
{
    public KwaiLoadingView j;
    public KwaiEmptyStateView k;
    public BaseFragment l;
    public LivePluginLoadingFragment$a m;
    public b n;
    public static final int o;

    public void LivePluginLoadingFragment(){
       super();
    }
    public int ch(){
       return 40;
    }
    public BaseFragment dh(){
       return this.l;
    }
    public void eh(){
       if (PatchProxy.applyVoid(null, this, LivePluginLoadingFragment.class, "5")) {
          return;
       }
       if (this.getActivity() == null || this.getActivity().isFinishing()) {
          b.P(LiveLogTag.LIVE_PLUGIN.appendTag("LivePluginLoadingFragment"), "getActivity is null or isFinishing");
          return;
       }else {
          this.j.setVisibility(0);
          b9.a(this.n);
          this.n = d.a("live_audience_plugin", this.ch()).observeOn(d.a).subscribe(new a(this));
          return;
       }
    }
    public void fh(LivePluginLoadingFragment$a p0){
       this.m = p0;
    }
    public void gh(BaseFragment p0){
       this.l = p0;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePluginLoadingFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LivePluginLoadingFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.c(p0, 0x7f0d0d35, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LivePluginLoadingFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       b.P(LiveLogTag.LIVE_PLUGIN.appendTag("LivePluginLoadingFragment"), "onDestroyView");
       b9.a(this.n);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePluginLoadingFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, LivePluginLoadingFragment.class, "4")) {
          this.j = p0.findViewById(0x7f0a232e);
          KwaiEmptyStateView kwaiEmptySta = p0.findViewById(R.id.live_plugin_error);
          this.k = kwaiEmptySta;
          kwaiEmptySta.q(3);
          KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
          uoa.h(R.string.arg_RES_7f100a3e);
          uoa.p(new b(this));
          uoa.a(this.k);
       }
       this.eh();
       return;
    }
}
