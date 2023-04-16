package com.yxcorp.gifshow.corona.common.plugin.presenter.CoronaLoadPluginPresenter$b;
import cm5.d;
import com.yxcorp.gifshow.corona.common.plugin.presenter.CoronaLoadPluginPresenter;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.corona.monitor.CoronaMonitorUtils;
import android.os.SystemClock;
import com.yxcorp.gifshow.corona.common.plugin.fragment.CoronaBasePluginProxyFragment;
import kotlin.jvm.internal.a;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.t0;
import com.kwai.feature.api.corona.monitor.CoronaMonitorUtils$a;
import java.util.Objects;
import android.view.View;
import android.widget.FrameLayout;
import com.yxcorp.retrofit.model.KwaiException;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.c;
import oq9.b;
import androidx.fragment.app.c$b;
import androidx.fragment.app.e;

public final class CoronaLoadPluginPresenter$b implements d	// class@001264
{
    public final CoronaLoadPluginPresenter a;
    public final boolean b;
    public final boolean c;

    public void CoronaLoadPluginPresenter$b(CoronaLoadPluginPresenter p0,boolean p1,boolean p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoronaLoadPluginPresenter$b.class, "2")) {
          return;
       }
       boolean b = false;
       this.a.V8(b);
       String str = CoronaLoadPluginPresenter.P8(this.a).fh();
       a.o(str, "proxyFragment.realFragmentTag");
       Pair[] pairArray = new Pair[]{r0.a("installLandscape", String.valueOf(this.c))};
       CoronaMonitorUtils.c.e("corona_core_plugin", this.b, this.a.u, SystemClock.elapsedRealtime(), 0, str, PluginDownloadExtension.k.e("corona_core_plugin"), t0.j0(pairArray));
       CoronaLoadPluginPresenter$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, CoronaLoadPluginPresenter.class, "8")) {
          ta.S8();
          CoronaLoadPluginPresenter r = ta.r;
          String str1 = "mLoadingAnimation";
          if (r == null) {
             a.S(str1);
          }
          if (r.getVisibility() != 8) {
             r = ta.r;
             if (r == null) {
                a.S(str1);
             }
             r.setVisibility(8);
          }
          r = ta.s;
          if (r == null) {
             a.S("mHintEmptyView");
          }
          if (r.getVisibility()) {
             r = ta.s;
             if (r == null) {
                a.S("mHintEmptyView");
             }
             r.setVisibility(b);
             KwaiException mErrorMessag = (p0 instanceof KwaiException)? p0.mErrorMessage: a1.p(R.string.arg_RES_7f100891);
             CoronaLoadPluginPresenter s = ta.s;
             if (s == null) {
                a.S("mHintEmptyView");
             }
             s.h(mErrorMessag);
          }
       }
       return;
    }
    public void onSuccess(){
       CoronaLoadPluginPresenter$b a;
       Object obj = this;
       CoronaLoadPluginPresenter uCoronaLoadP = CoronaLoadPluginPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, CoronaLoadPluginPresenter$b.class, "1")) {
          return;
       }
       obj.a.V8(true);
       String str = CoronaLoadPluginPresenter.P8(obj.a).fh();
       a.o(str, "proxyFragment.realFragmentTag");
       Pair[] pairArray = new Pair[true];
       pairArray[0] = r0.a("installLandscape", String.valueOf(obj.c));
       String str1 = null;
       CoronaMonitorUtils.c.e("corona_core_plugin", obj.b, obj.a.u, SystemClock.elapsedRealtime(), 1, str, PluginDownloadExtension.k.e("corona_core_plugin"), t0.j0(pairArray));
       a = obj.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoid(objArray, a, uCoronaLoadP, "14")) {
          CoronaLoadPluginPresenter q = a.q;
          if (q == null) {
             a.S("proxyFragment");
          }
          if (q.eh() == null) {
             q = a.q;
             if (q == null) {
                a.S("proxyFragment");
             }
             if (q.isAdded()) {
                q = a.q;
                if (q == null) {
                   a.S("proxyFragment");
                }
                Fragment uFragment = q.ch();
                if (uFragment != null) {
                   Bundle uBundle = new Bundle();
                   CoronaLoadPluginPresenter q1 = a.q;
                   if (q1 == null) {
                      a.S("proxyFragment");
                   }
                   if (q1.getArguments() != null) {
                      q1 = a.q;
                      if (q1 == null) {
                         a.S("proxyFragment");
                      }
                      uBundle.putAll(q1.getArguments());
                   }
                   if (uFragment.getArguments() != null) {
                      uBundle.putAll(uFragment.getArguments());
                   }
                   uFragment.setArguments(uBundle);
                   Object[] objArray1 = PatchProxy.apply(objArray, a, uCoronaLoadP, "15");
                   if (objArray1 != PatchProxyResult.class) {
                   }else {
                      CoronaLoadPluginPresenter q3 = a.q;
                      if (q3 == null) {
                         a.S("proxyFragment");
                      }
                      if (!q3.isAdded()) {
                         objArray1 = objArray;
                      }else {
                         q3 = a.q;
                         if (q3 == null) {
                            a.S("proxyFragment");
                         }
                         objArray1 = q3.getChildFragmentManager();
                      }
                   }
                   if (objArray1 != null) {
                      objArray1.registerFragmentLifecycleCallbacks(new b(a), str1);
                      e uoe = objArray1.beginTransaction();
                      CoronaLoadPluginPresenter q2 = a.q;
                      if (q2 == null) {
                         a.S("proxyFragment");
                      }
                      uoe.w(R.id.corona_plugin_content_container, uFragment, q2.fh());
                      uoe.m();
                   }
                }
             }
          }
       }
    label_010b :
       a = obj.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoid(objArray, a, uCoronaLoadP, "11")) {
          a.S8();
          uCoronaLoadP = a.r;
          if (uCoronaLoadP == null) {
             a.S("mLoadingAnimation");
          }
          uCoronaLoadP.setVisibility(8);
          uCoronaLoadP = a.s;
          if (uCoronaLoadP == null) {
             a.S("mHintEmptyView");
          }
          uCoronaLoadP.setVisibility(8);
       }
       return;
    }
}
