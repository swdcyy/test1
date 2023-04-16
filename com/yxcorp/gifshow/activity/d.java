package com.yxcorp.gifshow.activity.d;
import xn5.b$a;
import java.lang.String;
import java.util.HashSet;
import com.yxcorp.gifshow.activity.d$a;
import com.kwai.sdk.switchconfig.a;
import java.lang.Object;
import lnc.u1;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Set;
import java.util.ArrayList;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$ResourceConfig;
import java.util.List;
import java.util.Collection;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$ActivityTabConfig;
import ekd.q;
import java.util.Iterator;
import java.lang.Iterable;
import brd.t;
import t45.d;
import brd.z;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kwai.framework.model.kcube.TabViewInfo;
import com.kwai.framework.model.kcube.TabViewInfo$TabIcon;
import ekd.j;
import java.util.Arrays;
import com.yxcorp.gifshow.homepage.activity.e;
import com.kwai.framework.model.kcube.TabViewInfo$TabLottie;
import b66.k$a;
import lnc.b9;
import com.yxcorp.gifshow.activity.c;
import java.util.concurrent.Callable;
import fw8.e;

public class d extends b$a	// class@001341
{
    public final Set b;
    public final d$a c;
    public boolean d;
    public boolean e;
    public b f;

    public void d(){
       super("ato_operate");
       this.b = new HashSet();
       this.c = new d$a(this);
       this.d = a.t().d("activityEntranceGq-kuaishou", false);
       this.e = a.t().d("activityEntranceGq", false);
       u1.a(this);
    }
    public boolean a(DynamicTabConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c.a(p0);
    }
    public void c(DynamicTabConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       if (this.b.contains(p0.mId)) {
          return;
       }
       this.b.add(p0.mId);
       ArrayList uArrayList = new ArrayList();
       DynamicTabConfig mResourceCon = p0.mResourceConfig;
       if (mResourceCon != null) {
          uArrayList.addAll(this.d(mResourceCon));
       }
       mResourceCon = p0.mActivityTabConfig;
       if (mResourceCon != null && !q.f(mResourceCon.mResourceConfigTemplates)) {
          Iterator iterator = p0.mActivityTabConfig.mResourceConfigTemplates.iterator();
          while (iterator.hasNext()) {
             uArrayList.addAll(this.d(iterator.next()));
          }
       }
       t.concatDelayError(uArrayList).subscribeOn(d.c).observeOn(d.a).subscribe(Functions.d(), Functions.d());
       return;
    }
    public final List d(DynamicTabConfig$ResourceConfig p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       DynamicTabConfig$ResourceConfig mTabViewInfo = p0.mTabViewInfo;
       if (mTabViewInfo != null) {
          TabViewInfo mTabIcon = mTabViewInfo.mTabIcon;
          if (mTabIcon != null) {
             if (!j.h(mTabIcon.mSelectedTabIconUrl)) {
                obj.add(e.e(Arrays.asList(p0.mTabViewInfo.mTabIcon.mSelectedTabIconUrl)));
             }
             if (!j.h(p0.mTabViewInfo.mTabIcon.mDarkDefaultTabIconUrls)) {
                obj.add(e.e(Arrays.asList(p0.mTabViewInfo.mTabIcon.mDarkDefaultTabIconUrls)));
             }
             if (!j.h(p0.mTabViewInfo.mTabIcon.mLightDefaultTabIconUrls)) {
                obj.add(e.e(Arrays.asList(p0.mTabViewInfo.mTabIcon.mLightDefaultTabIconUrls)));
             }
          }
          mTabIcon = p0.mTabViewInfo.mXTabIcon;
          if (mTabIcon != null) {
             if (!j.h(mTabIcon.mSelectedTabIconUrl)) {
                obj.add(e.e(Arrays.asList(p0.mTabViewInfo.mXTabIcon.mSelectedTabIconUrl)));
             }
             if (!j.h(p0.mTabViewInfo.mXTabIcon.mDarkDefaultTabIconUrls)) {
                obj.add(e.e(Arrays.asList(p0.mTabViewInfo.mXTabIcon.mDarkDefaultTabIconUrls)));
             }
             if (!j.h(p0.mTabViewInfo.mXTabIcon.mLightDefaultTabIconUrls)) {
                obj.add(e.e(Arrays.asList(p0.mTabViewInfo.mXTabIcon.mLightDefaultTabIconUrls)));
             }
          }
          mTabIcon = p0.mTabViewInfo.mTabLottie;
          if (mTabIcon != null && !j.h(mTabIcon.mTabLottieUrl)) {
             obj.add(e.e(Arrays.asList(p0.mTabViewInfo.mTabLottie.mTabLottieUrl)));
          }
       }
    label_00e7 :
       return obj;
    }
    public void onEventMainThread(k$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       if (p0.a != 2) {
          return;
       }
       b9.a(this.f);
       this.f = t.fromCallable(c.b).subscribeOn(d.c).observeOn(d.a).subscribe(new e(this));
       return;
    }
}
