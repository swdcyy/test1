package com.yxcorp.gifshow.corona.common.plugin.presenter.CoronaLoadPluginPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.corona.common.plugin.presenter.CoronaLoadPluginPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.corona.common.plugin.presenter.CoronaLoadPluginPresenter$enableLazyTab$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.corona.common.plugin.fragment.CoronaBasePluginProxyFragment;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import on5.b;
import androidx.fragment.app.Fragment;
import com.kwai.kcube.TabIdentifier;
import as6.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import mq9.h;
import oq9.e;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import brd.t;
import oq9.d;
import erd.g;
import crd.b;
import oq9.c;
import com.yxcorp.gifshow.corona.common.plugin.presenter.CoronaLoadPluginPresenter$c;
import android.view.View$OnClickListener;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import vl5.b;
import android.os.SystemClock;
import jd6.g;
import com.kwai.plugin.dva.Dva;
import android.view.View;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.corona.common.plugin.presenter.CoronaLoadPluginPresenter$b;
import cm5.d;
import ekd.m1;

public final class CoronaLoadPluginPresenter extends PresenterV2	// class@001267
{
    public final p p;
    public CoronaBasePluginProxyFragment q;
    public View r;
    public KwaiEmptyStateView s;
    public String t;
    public long u;
    public boolean v;
    public static final CoronaLoadPluginPresenter$a w;

    static {
       CoronaLoadPluginPresenter.w = new CoronaLoadPluginPresenter$a(null);
    }
    public void CoronaLoadPluginPresenter(){
       super();
       this.p = s.c(CoronaLoadPluginPresenter$enableLazyTab$2.INSTANCE);
    }
    public static final CoronaBasePluginProxyFragment P8(CoronaLoadPluginPresenter p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("proxyFragment");
       }
       return p0;
    }
    public void E8(){
       boolean b;
       PluginDownloadExtension k;
       CoronaLoadPluginPresenter uCoronaLoadP = CoronaLoadPluginPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uCoronaLoadP, "4")) {
          return;
       }
       CoronaLoadPluginPresenter tq = this.q;
       if (tq == null) {
          a.S("proxyFragment");
       }
       TabIdentifier g = b.G;
       a.o(g, "HomeTabIdentifier.X_BLOCK");
       b = a.c(tq, g);
       if (b) {
          Boolean uBoolean = PatchProxy.apply(objArray, this, uCoronaLoadP, "1");
          if (uBoolean == PatchProxyResult.class) {
             uBoolean = this.p.getValue();
          }
          if (uBoolean.booleanValue()) {
             if (!PatchProxy.applyVoid(objArray, this, uCoronaLoadP, "6")) {
                tq = this.q;
                if (tq == null) {
                   a.S("proxyFragment");
                }
                if (tq.Vg().c()) {
                   k = PluginDownloadExtension.k;
                   k.s("corona_core_plugin", 40);
                   k.a("corona_core_plugin");
                   this.R8();
                }else if(!PatchProxy.applyVoid(objArray, this, uCoronaLoadP, "7") && !h.a()){
                   c.k(e.b);
                }
                uCoronaLoadP = this.q;
                if (uCoronaLoadP == null) {
                   a.S("proxyFragment");
                }
                this.X7(uCoronaLoadP.Vg().j().subscribe(new d(this)));
             }
          }else if(PatchProxy.applyVoid(objArray, this, uCoronaLoadP, "5")){
             uCoronaLoadP = this.q;
             if (uCoronaLoadP == null) {
                a.S("proxyFragment");
             }
             if (uCoronaLoadP.Vg().c()) {
                k = PluginDownloadExtension.k;
                k.s("corona_core_plugin", 40);
                k.a("corona_core_plugin");
             }else {
                uCoronaLoadP = this.q;
                if (uCoronaLoadP == null) {
                   a.S("proxyFragment");
                }
                this.X7(uCoronaLoadP.Vg().j().subscribe(new c(this)));
             }
             this.R8();
          }
       }else {
          goto label_0097 ;
       }
       uCoronaLoadP = this.s;
       if (uCoronaLoadP == null) {
          a.S("mHintEmptyView");
       }
       uCoronaLoadP.p(new CoronaLoadPluginPresenter$c(this));
       return;
    }
    public final void R8(){
       CoronaLoadPluginPresenter uCoronaLoadP = CoronaLoadPluginPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uCoronaLoadP, "12")) {
          return;
       }
       boolean b = true;
       this.v = b;
       if (!PatchProxy.applyVoid(objArray, this, uCoronaLoadP, "16")) {
          CoronaLoadPluginPresenter tt = this.t;
          if (tt != null) {
             b.c(tt, "TV_TAB_PLUGIN_START");
          }
       }
       this.u = SystemClock.elapsedRealtime();
       String str = "landscape";
       String str1 = null;
       if (!g.e(str) && !Dva.instance().isLoaded(str)) {
          b = false;
       }
       boolean b1 = Dva.instance().isLoaded("corona_core_plugin");
       if (!PatchProxy.applyVoid(objArray, this, uCoronaLoadP, "9")) {
          CoronaLoadPluginPresenter tr = this.r;
          String str2 = "mLoadingAnimation";
          if (tr == null) {
             a.S(str2);
          }
          if (tr.getVisibility()) {
             tr = this.r;
             if (tr == null) {
                a.S(str2);
             }
             tr.setVisibility(str1);
          }
          CoronaLoadPluginPresenter ts = this.s;
          if (ts == null) {
             a.S("mHintEmptyView");
          }
          if (ts.getVisibility() != 8) {
             ts = this.s;
             if (ts == null) {
                a.S("mHintEmptyView");
             }
             ts.setVisibility(8);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uCoronaLoadP, "13")) {
          PluginDownloadExtension.k.s("corona_core_plugin", 40);
       }
       this.X7(h.b(new CoronaLoadPluginPresenter$b(this, b1, b)));
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, CoronaLoadPluginPresenter.class, "10")) {
          return;
       }
       CoronaLoadPluginPresenter tr = this.r;
       if (tr == null) {
          a.S("mLoadingAnimation");
       }
       tr.setVisibility(8);
       return;
    }
    public final void V8(boolean p0){
       CoronaLoadPluginPresenter uCoronaLoadP = CoronaLoadPluginPresenter.class;
       if (PatchProxy.isSupport(uCoronaLoadP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uCoronaLoadP, "17")) {
          return;
       }
       uCoronaLoadP = this.t;
       if (uCoronaLoadP != null) {
          b.c(uCoronaLoadP, "TV_TAB_PLUGIN_END");
          if (!p0) {
             b.d(uCoronaLoadP, "PLUGIN_LOAD_ERROR");
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoronaLoadPluginPresenter.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.loading_circle);
       a.o(view, "bindWidget\(rootView, R.id.loading_circle\)");
       this.r = view;
       p0 = m1.f(p0, R.id.hint_empty_view);
       a.o(p0, "bindWidget\(rootView, R.id.hint_empty_view\)");
       this.s = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, CoronaLoadPluginPresenter.class, "3")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(PageAccessIds.FRAGMENT\)");
       this.q = obj;
       this.t = this.t8("SESSION_ID");
       return;
    }
}
