package com.kwai.feature.api.feed.home.kcubehome.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.kwai.feature.api.feed.home.kcubehome.a;
import ok.x;
import java.lang.Object;
import com.kwai.component.kcube.model.startup.StartupPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.kcube.model.model.HomeTabStruct;
import java.lang.reflect.Type;
import xb5.d;
import java.util.ArrayList;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.component.kcube.model.model.TabModel;
import java.util.List;
import on5.h;
import com.kwai.feature.api.feed.home.a;
import on5.c;
import java.lang.Runnable;
import t45.c;
import java.lang.StringBuilder;
import on5.d;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import com.kwai.component.kcube.model.model.TabConfig;
import com.kwai.component.kcube.model.model.TabBizParams;
import com.kwai.component.kcube.model.model.CommonInfo;
import com.kwai.framework.model.kcube.TabViewInfo;
import com.kwai.framework.model.kcube.TabViewInfo$TabIcon;
import ekd.j;
import tkd.b;
import tkd.d;
import hn5.p;
import java.util.Arrays;
import brd.t;
import com.kwai.framework.model.kcube.TabViewInfo$TabLottie;
import java.util.Collection;
import ekd.q;

public class b extends ConfigAutoParseJsonConsumer	// class@000efe
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       boolean b;
       boolean b1;
       TabModel tabModel;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "2")) {
       }else {
          HomeTabStruct homeTabStruc = d.a(HomeTabStruct.class);
          StartupPojo mHomeTabStru = p0.mHomeTabStruct;
          if (mHomeTabStru != null) {
             if (!PatchProxy.applyVoidTwoRefs(mHomeTabStru, homeTabStruc, this, uob, "3")) {
                ArrayList uArrayList = new ArrayList();
                HomeTabStruct mBottomNavMo = mHomeTabStru.mBottomNavMode;
                Object obj = PatchProxy.applyTwoRefs(mBottomNavMo, uArrayList, this, uob, "6");
                b = true;
                if (obj != PatchProxyResult.class) {
                   b1 = obj.booleanValue();
                }else if(mBottomNavMo != null && !h.b(mBottomNavMo, uArrayList)){
                   b1 = true;
                }else {
                   b1 = false;
                }
                if (!b1) {
                   a.D().C("bottomNavMode is legal, data = ", mHomeTabStru.mBottomNavMode);
                   c.a(new c(this, mHomeTabStru));
                }else {
                   a.D().C("bottomNavMode is not legal, data = ", mHomeTabStru.mBottomNavMode);
                   a.D().C("errorInfo = ", uArrayList);
                   h.d(uArrayList, "KCUBE_CONFIG_STARTUP_ERROR");
                   homeTabStruc = (homeTabStruc != null)? homeTabStruc.mBottomNavMode: null;
                   mHomeTabStru.mBottomNavMode = homeTabStruc;
                   a uoa = a.D();
                   StringBuilder str = "bottomNavMode use cache = ";
                   if (mHomeTabStru.mBottomNavMode == null) {
                      b = false;
                   }
                   uoa.B(str+b);
                   homeTabStruc = mHomeTabStru.mBottomNavMode;
                   if (!PatchProxy.applyVoidTwoRefs(uArrayList, homeTabStruc, this, uob, "7") && homeTabStruc != null) {
                      c.a(new d(uArrayList, homeTabStruc));
                   }
                }
             }
          }else {
             a.D().B("homeTabStruct is null");
          }
          SharedPreferences$Editor uEditor = d.a.edit();
          uEditor.putString("homeTabStruct", b.e(p0.mHomeTabStruct));
          g.a(uEditor);
       }
       return;
    }
    public final void d(List p0,TabConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "5")) {
          return;
       }
       if (p1 != null) {
          TabConfig mBizParams = p1.mBizParams;
          if (mBizParams != null) {
             TabBizParams mCommonInfo = mBizParams.mCommonInfo;
             if (mCommonInfo != null) {
                CommonInfo mTabViewInfo = mCommonInfo.mTabViewInfo;
                if (mTabViewInfo != null) {
                   TabViewInfo mTabIcon = mTabViewInfo.mTabIcon;
                   if (mTabIcon != null) {
                      if (!j.h(mTabIcon.mSelectedTabIconUrl)) {
                         p0.add(d.a(0x5a5de9ac).UX(Arrays.asList(mCommonInfo.mTabViewInfo.mTabIcon.mSelectedTabIconUrl)));
                      }
                      if (!j.h(mCommonInfo.mTabViewInfo.mTabIcon.mDarkDefaultTabIconUrls)) {
                         p0.add(d.a(0x5a5de9ac).UX(Arrays.asList(mCommonInfo.mTabViewInfo.mTabIcon.mDarkDefaultTabIconUrls)));
                      }
                      if (!j.h(mCommonInfo.mTabViewInfo.mTabIcon.mLightDefaultTabIconUrls)) {
                         p0.add(d.a(0x5a5de9ac).UX(Arrays.asList(mCommonInfo.mTabViewInfo.mTabIcon.mLightDefaultTabIconUrls)));
                      }
                   }
                   mTabIcon = mCommonInfo.mTabViewInfo.mXTabIcon;
                   if (mTabIcon != null) {
                      if (!j.h(mTabIcon.mSelectedTabIconUrl)) {
                         p0.add(d.a(0x5a5de9ac).UX(Arrays.asList(mCommonInfo.mTabViewInfo.mXTabIcon.mSelectedTabIconUrl)));
                      }
                      if (!j.h(mCommonInfo.mTabViewInfo.mXTabIcon.mDarkDefaultTabIconUrls)) {
                         p0.add(d.a(0x5a5de9ac).UX(Arrays.asList(mCommonInfo.mTabViewInfo.mXTabIcon.mDarkDefaultTabIconUrls)));
                      }
                      if (!j.h(mCommonInfo.mTabViewInfo.mXTabIcon.mLightDefaultTabIconUrls)) {
                         p0.add(d.a(0x5a5de9ac).UX(Arrays.asList(mCommonInfo.mTabViewInfo.mXTabIcon.mLightDefaultTabIconUrls)));
                      }
                   }
                   mTabIcon = mCommonInfo.mTabViewInfo.mTabLottie;
                   if (mTabIcon != null && !j.h(mTabIcon.mTabLottieUrl)) {
                      p0.add(d.a(0x5a5de9ac).UX(Arrays.asList(mCommonInfo.mTabViewInfo.mTabLottie.mTabLottieUrl)));
                   }
                }
             }
          }
       }
       if (p1 != null && !q.f(p1.mSubTabList)) {
          for (int i = 0; i < p1.mSubTabList.size(); i = i + 1) {
             this.d(p0, p1.mSubTabList.get(i));
          }
       }
       return;
    }
}
