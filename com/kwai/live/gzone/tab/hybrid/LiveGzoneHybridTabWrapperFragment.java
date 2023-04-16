package com.kwai.live.gzone.tab.hybrid.LiveGzoneHybridTabWrapperFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabServerInfo;
import j47.c;
import i63.b;
import fq5.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import com.kwai.live.gzone.tab.hybrid.LiveGzoneHybridTabWrapperFragment$mLifecycleObserver$1;
import com.kwai.live.gzone.tab.hybrid.LiveGzoneHybridTabWrapperFragment$a;
import android.widget.FrameLayout;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.tab.hybrid.TabType;
import com.kuaishou.webkit.URLUtil;
import android.net.Uri;
import xkd.b;
import f77.k;
import java.lang.Enum;
import java.lang.CharSequence;
import android.text.TextUtils;
import ekd.x0;
import java.lang.Number;
import android.graphics.Color;
import lnc.a1;
import java.lang.Exception;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.kwai.yoda.model.LaunchModel$a;
import com.kwai.yoda.model.LaunchModel;
import android.content.Intent;
import f37.o0;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import java.util.Objects;
import f77.l;
import uxc.b;
import f77.m;
import uxc.a;
import kotlin.NoWhenBranchMatchedException;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map;
import lnc.i3;
import com.kwai.live.gzone.tab.bean.LiveGzoneTab;
import com.kwai.live.gzone.tab.page.a;
import java.lang.Integer;
import com.kwai.live.gzone.tab.bean.LiveGzoneTab$TabType;
import java.util.Map$Entry;
import qrd.l1;
import o63.c;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.trello.rxlifecycle3.components.support.RxFragment;
import java.util.HashMap;

public final class LiveGzoneHybridTabWrapperFragment extends BaseFragment	// class@000e12
{
    public FrameLayout j;
    public View k;
    public final LiveGzoneHybridTabWrapperFragment$mLifecycleObserver$1 l;
    public final LiveGzoneHybridTabWrapperFragment$a m;
    public final LiveGzoneTabServerInfo n;
    public final c o;
    public final b p;
    public final b q;
    public final int r;
    public HashMap s;

    public void LiveGzoneHybridTabWrapperFragment(LiveGzoneTabServerInfo p0,c p1,b p2,b p3,int p4){
       a.p(p0, "mTabInfo");
       a.p(p1, "mComponentBridgeService");
       a.p(p2, "mParentTab");
       a.p(p3, "mILiveBasicContext");
       super(null, null, null, null, 15, null);
       this.n = p0;
       this.o = p1;
       this.p = p2;
       this.q = p3;
       this.r = p4;
       this.l = new LiveGzoneHybridTabWrapperFragment$mLifecycleObserver$1(this);
       this.m = new LiveGzoneHybridTabWrapperFragment$a(this);
    }
    public static final FrameLayout ch(LiveGzoneHybridTabWrapperFragment p0){
       p0 = p0.j;
       if (p0 == null) {
          a.S("mContainer");
       }
       return p0;
    }
    public void onCreate(Bundle p0){
       boolean b;
       Uri uri;
       String queryParamet;
       String obj1;
       int i1;
       LiveGzoneHybridTabWrapperFragment to;
       KwaiRnFragment key;
       TabType h5;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneHybridTabWrapperFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.getLifecycle().addObserver(this.l);
       e uoe = this.getChildFragmentManager().beginTransaction();
       LiveGzoneHybridTabWrapperFragment tn = this.n;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveGzoneTabServerInfo obj = PatchProxy.applyOneRefs(tn, this, LiveGzoneHybridTabWrapperFragment.class, "5");
       if (obj != patchProxyRe) {
       }else {
          obj = tn.mLink;
          a.o(obj, "tabInfo.mLink");
          TabType tabType = PatchProxy.applyOneRefs(obj, this, LiveGzoneHybridTabWrapperFragment.class, "4");
          Object[] objArray = null;
          if (tabType != patchProxyRe) {
          }else if(URLUtil.isHttpUrl(obj) || URLUtil.isHttpsUrl(obj)){
             h5 = TabType.H5;
          }else {
             Uri uri2 = b.g(obj);
             String host = (uri2 != null)? uri2.getHost(): objArray;
             tabType = TabType.KRN;
             if (!a.g(host, tabType.getHost())) {
                h5 = TabType.H5;
             }
          }
          tabType = h5;
          int i = k.a[tabType.ordinal()];
          b = true;
          if (i != b) {
             if (i == 2) {
                obj = PatchProxy.applyOneRefs(tn, this, LiveGzoneHybridTabWrapperFragment.class, "8");
                if (obj != patchProxyRe) {
                }else {
                   i = -1;
                   if (!TextUtils.isEmpty(tn.mLink) && (URLUtil.isHttpUrl(tn.mLink) || URLUtil.isHttpsUrl(tn.mLink))) {
                      uri = x0.f(tn.mLink);
                      try{
                         queryParamet = uri.getQueryParameter("bgcolor");
                         obj1 = PatchProxy.applyOneRefs(queryParamet, this, LiveGzoneHybridTabWrapperFragment.class, "9");
                         i1 = (obj1 != patchProxyRe)? obj1.intValue(): Color.parseColor(queryParamet);
                      label_00cc :
                         i = i1;
                         i1 = uri.getBooleanQueryParameter("disablepullrefresh", false);
                      label_00e2 :
                         FragmentActivity activity = this.getActivity();
                         a.m(activity);
                         KwaiWebViewActivity$a uoa = KwaiWebViewActivity.N3(activity, tn.mLink).l("KEY_THEME", "3").m("KEY_IS_SELECTABLE_PAGE", b).l("KEY_WEB_TYPE", "Live_GzoneTab_1");
                         uoa.j("");
                         uoa.h(new LaunchModel$a(tn.mLink).f(false).m(i).g((i1 ^ b)).a());
                         uoa.i("none");
                         Intent intent = uoa.a();
                         o0.q(intent, 2);
                         KwaiYodaWebViewFragment kwaiYodaWebV = this.o.k3();
                         Objects.requireNonNull(kwaiYodaWebV, "null cannot be cast to non-null type com.yxcorp.gifshow.webview.api.WebViewFragment");
                         a.o(intent, "intent");
                         kwaiYodaWebV.setArguments(intent.getExtras());
                         kwaiYodaWebV.kh(l.a);
                         kwaiYodaWebV.gh(m.a);
                         obj = kwaiYodaWebV;
                      }catch(java.lang.Exception e2){
                         e2.printStackTrace();
                      }
                   label_00e1 :
                      i1 = 0;
                      goto label_00e2 ;
                   }else {
                      goto label_00e1 ;
                   }
                }
             }else {
                throw new NoWhenBranchMatchedException();
             }
          }else {
             obj = PatchProxy.applyOneRefs(tn, this, LiveGzoneHybridTabWrapperFragment.class, "6");
             if (obj != patchProxyRe) {
             }else {
                Uri uri1 = x0.f(tn.mLink);
                String str = x0.a(uri1, "bundleId");
                queryParamet = x0.a(uri1, "componentName");
                LinkedHashMap linkedHashMa = new LinkedHashMap();
                a.o(uri1, "uri");
                Set queryParamet1 = uri1.getQueryParameterNames();
                a.o(queryParamet1, "uri.queryParameterNames");
                Iterator iterator = queryParamet1.iterator();
                while (iterator.hasNext()) {
                   String str1 = iterator.next();
                   a.o(str1, "it");
                   obj1 = x0.a(uri1, str1);
                   a.o(obj1, "SafetyUriUtil.getQueryParameterFromUri\(uri, it\)");
                   linkedHashMa.put(str1, obj1);
                }
                to = this.o;
                LiveGzoneHybridTabWrapperFragment tm = this.m;
                LinkedHashMap linkedHashMa1 = new LinkedHashMap();
                String str2 = PatchProxy.apply(objArray, this, LiveGzoneHybridTabWrapperFragment.class, "7");
                if (str2 != patchProxyRe) {
                }else {
                   i3 oi3 = i3.f();
                   LiveGzoneTab liveGzoneTab = this.p.t();
                   a.o(liveGzoneTab, "mParentTab.liveGzoneTab");
                   oi3.d("tab_name", liveGzoneTab.d());
                   oi3.c("tab_index", Integer.valueOf(this.p.n()));
                   liveGzoneTab = this.p.t();
                   a.o(liveGzoneTab, "mParentTab.liveGzoneTab");
                   oi3.d("tab_id", liveGzoneTab.e());
                   oi3.d("tab_type", LiveGzoneTab$TabType.HYBRID.mTypeValue);
                   oi3.d("sub_tab_name", this.n.mName);
                   oi3.c("sub_tab_index", Integer.valueOf(this.r));
                   oi3.d("sub_tab_id", this.n.mTabId);
                   str2 = oi3.e();
                   a.o(str2, "JsonStringBuilder.newIns¡­Info.mTabId\)\n    .build\(\)");
                }
                linkedHashMa1.put("tabData", str2);
                Iterator iterator1 = linkedHashMa.entrySet().iterator();
                while (iterator1.hasNext()) {
                   Map$Entry uEntry = iterator1.next();
                   key = uEntry.getKey();
                   linkedHashMa1.put(key, uEntry.getValue());
                }
                KwaiRnFragment kwaiRnFragme = to.n3(str, queryParamet, tm, linkedHashMa1, false);
                a.o(kwaiRnFragme, "mComponentBridgeService.¡­     },\n      false\n    \)");
                key = kwaiRnFragme;
             }
          }
       }
       uoe.f(R.id.live_gzone_hybrid_tab_fragment_container, obj);
       uoe.m();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveGzoneHybridTabWrapperFragment.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "inflater");
       View view = p0.inflate(R.layout.arg_RES_7f0d0bca, null);
       View view1 = view.findViewById(R.id.live_gzone_hybrid_tab_fragment_container);
       a.o(view1, "contentView.findViewById¡­d_tab_fragment_container\)");
       this.j = view1;
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneHybridTabWrapperFragment.class, "3")) {
          return;
       }
       super.onDestroy();
       this.getLifecycle().removeObserver(this.l);
       return;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, LiveGzoneHybridTabWrapperFragment.class, "13")) {
       }else {
          LiveGzoneHybridTabWrapperFragment ts = this.s;
          if (ts != null) {
             ts.clear();
          }
       }
       return;
    }
}
