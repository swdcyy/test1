package com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment$a;
import c34.a;
import qvb.n0;
import com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment;
import mrd.a;
import java.lang.Object;
import com.kuaishou.merchant.live.cart.salemanager.model.CommodityListAuthorResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import brd.t;
import w24.a;
import q87.c;
import fs3.g;
import fs3.f;
import d34.c;
import d34.b;
import com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment$b;
import b34.b;
import lnc.c3$b;
import lnc.c3;
import java.lang.Number;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import ot3.y0;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import lnc.a1;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.Paint$FontMetrics;
import android.app.Activity;
import com.yxcorp.utility.n;
import java.lang.Math;
import com.kuaishou.merchant.live.cart.salemanager.model.ExcellentCommodityInfo;
import r54.b;
import brd.x;
import com.kuaishou.merchant.basic.fragment.MerchantRecycleFragment;
import o54.f;
import erd.g;
import o54.o;
import o54.p;
import o54.g;
import erd.o;
import o54.n;
import erd.a;
import java.util.concurrent.TimeUnit;
import cjd.e;
import o54.e;
import o54.m;
import java.util.List;
import com.kuaishou.merchant.live.cart.salemanager.model.TabBarInfo;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.merchant.live.cart.salemanager.model.LiveAnchorToolsInfo;
import com.kuaishou.merchant.live.cart.salemanager.model.LiveAnchorToolsInfo$LiveAnchorTool;
import r54.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tkd.b;
import tkd.d;
import ss3.a;
import ts3.b;
import java.lang.Integer;
import java.util.HashMap;
import aa0.a;
import o54.a;
import com.kuaishou.merchant.live.cart.salemanager.model.LiveAnchorConfig;
import android.os.Bundle;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import o74.a;
import ot3.u0;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import com.kuaishou.merchant.router.RouterConfig;
import com.kuaishou.merchant.live.cart.salemanager.c;
import z1.a;
import o54.l;
import us3.f;
import com.kuaishou.merchant.router.b;
import java.util.ArrayList;
import com.kuaishou.merchant.live.cart.basic.model.ItemCard;
import is3.b;
import js3.a;
import is3.a;
import com.kuaishou.merchant.live.cart.salemanager.model.CommodityListAuthorResponse$AuthorExtraInfo;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import oe6.g;
import o54.h;
import java.lang.Runnable;
import ekd.k1;
import crd.b;
import lnc.b9;
import com.kuaishou.merchant.live.cart.salemanager.e;
import com.kuaishou.merchant.live.cart.salemanager.f;

public class LiveAnchorShopFragment$a extends n0 implements a	// class@0019cd
{
    public String m;
    public long n;
    public final c o;
    public boolean p;
    public int q;
    public final LiveAnchorShopFragment r;
    public static final int s;

    public void LiveAnchorShopFragment$a(LiveAnchorShopFragment p0){
       this.r = p0;
       super();
       this.n = 300;
       this.o = a.g();
       this.p = true;
    }
    public boolean B1(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAnchorShopFragment$a.class, "5");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): p0.hasMore();
       return b;
    }
    public t I1(){
       int i1;
       int i2;
       b a;
       int i3;
       int i = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveAnchorShopFragment$a uoa = LiveAnchorShopFragment$a.class;
       Object[] objArray = null;
       g obj = PatchProxy.apply(objArray, i, uoa, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object[] objArray1 = new Object[0];
       a.C().w("LiveAnchorShopFragment", "onCreateRequest", objArray1);
       obj = f.a();
       c uoc = b.a();
       String str = c3.a(i.r.M.e, b.a);
       String str1 = "";
       CommodityListAuthorResponse mCursor = (!this.K())? this.L0().mCursor: str1;
       LiveAnchorShopFragment$a m = i.m;
       LiveAnchorShopFragment$b obj1 = PatchProxy.apply(objArray, i, uoa, "4");
       if (obj1 != patchProxyRe) {
          i1 = obj1.intValue();
       }else {
          uoa = i.r;
          if (uoa.K != null && i.p != null) {
             FragmentActivity obj2 = PatchProxy.apply(objArray, uoa, LiveAnchorShopFragment.class, "22");
             if (obj2 != patchProxyRe) {
                i1 = obj2.intValue();
             }else {
                obj2 = uoa.getActivity();
                if (obj2 != null) {
                   TypedValue obj3 = PatchProxy.applyOneRefs(obj2, objArray, y0.class, "1");
                   String str4 = 1;
                   if (obj3 != patchProxyRe) {
                      i3 = obj3.intValue();
                   }else {
                      obj3 = new TypedValue();
                      i3 = (obj2.getTheme().resolveAttribute(0x7f0400f6, obj3, str4))? TypedValue.complexToDimensionPixelSize(obj3.data, c.c(obj2.getResources())): 0;
                   }
                   i2 = a1.d(R.dimen.arg_RES_7f070e2a);
                   int i4 = a1.d(R.dimen.arg_RES_7f07026a);
                   Object obj4 = PatchProxy.apply(objArray, uoa, LiveAnchorShopFragment.class, "23");
                   if (obj4 != patchProxyRe) {
                      i1 = obj4.intValue();
                   }else {
                      Paint paint = new Paint();
                      paint.setTextSize((float)a1.d(R.dimen.arg_RES_7f070283));
                      paint.setTypeface(Typeface.defaultFromStyle(1));
                      Paint$FontMetrics fontMetrics = paint.getFontMetrics();
                      i1 = (int)(fontMetrics.bottom - fontMetrics.top) + a1.d(0x7f0702b8);
                   }
                   i1 = (int)Math.ceil((((double)(((n.j(obj2) - i3) - i2) - i1) * 0x3ff0000000000000) / (double)i4));
                   if (i1 > 0) {
                      i1 = i1 + 1;
                   }
                }
                i1 = 0;
             }
             i.q = i1;
             if (i1 <= 0) {
             label_0119 :
                i1 = 10;
             }
          }else {
             goto label_0119 ;
          }
       }
       String str2 = String.valueOf(i1);
       CommodityListAuthorResponse uCommodityLi = (!this.K())? this.L0().mGroupCursor: str1;
       obj1 = i.r.M.m;
       ExcellentCommodityInfo mBrandUserId = obj1.mBrandUserId;
       ExcellentCommodityInfo mModuleType = obj1.mModuleType;
       i2 = obj.i1();
       String str3 = obj.p3();
       b uob = (i.r.M.c())? i.r.M.v.b: 0;
       a = (i.r.M.c())? i.r.M.v.a: null;
       t ot = uoc.i1(str, mCursor, m, str2, uCommodityLi, mBrandUserId, mModuleType, i2, str3, uob, a, i.r.M.t).compose(i.r.Hh());
       if (i.p != null) {
          i.p = false;
          ot = ot.doOnSubscribe(new f(i)).doOnNext(new o(i)).doOnError(new p(i)).delay(new g(i)).doFinally(new n(i));
       }else {
          ot = ot.delaySubscription(i.n, TimeUnit.MILLISECONDS);
       }
       return ot.map(new e()).doOnNext(new e(i)).doFinally(new m(i));
    }
    public void M1(Object p0,List p1){
       CommodityListAuthorResponse mPermanentTo;
       LiveAnchorShopFragment$b c1;
       Iterator iterator;
       LiveAnchorToolsInfo liveAnchorTo;
       Iterator iterator1;
       LiveAnchorToolsInfo$LiveAnchorTool liveAnchorTo1;
       LiveAnchorShopFragment$a uoa = LiveAnchorShopFragment$a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "6")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          String str = "LiveAnchorShopFragment";
          a.C().w(str, "onLoadItemFromResponse", objArray);
          TabBarInfo tabBarInfo = new TabBarInfo();
          if (this.K()) {
             p1.clear();
             this.r.M.b.clear();
             this.V1(p0);
             if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "8") || (p0 != null && !q.f(p0.mAllTools))) {
                c1 = this.r.M.h;
                iterator = p0.mAllTools.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      liveAnchorTo = iterator.next();
                      if (liveAnchorTo != null && !q.f(liveAnchorTo.mLiveAnchorToolList)) {
                         iterator1 = liveAnchorTo.mLiveAnchorToolList.iterator();
                         while (true) {
                            if (iterator1.hasNext()) {
                               liveAnchorTo1 = iterator1.next();
                               if (liveAnchorTo1.mType == 12) {
                                  c1.a = true;
                                  c1.c = liveAnchorTo1.mForbidReason;
                                  c1.b = liveAnchorTo1.mIsForbidden ^ true;
                                  if (!TextUtils.x(this.r.M.b())) {
                                     c1.d = d.a(0x50a4ea96).no().d(this.r.M.b());
                                  }
                               }else {
                                  continue ;
                               }
                            }else {
                               continue ;
                            }
                         }
                      }
                   }else {
                      c1.a = i;
                   }
                }
             }
             if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "7") && (p0 != null && !q.f(p0.mAllTools))) {
                mPermanentTo = p0.mPermanentTools;
                if (mPermanentTo != null && !q.f(mPermanentTo.mLiveAnchorToolList)) {
                   c1 = this.r.M.o;
                   iterator = p0.mAllTools.iterator();
                   while (iterator.hasNext()) {
                      liveAnchorTo = iterator.next();
                      if (liveAnchorTo != null && !q.f(liveAnchorTo.mLiveAnchorToolList)) {
                         iterator1 = liveAnchorTo.mLiveAnchorToolList.iterator();
                         while (iterator1.hasNext()) {
                            liveAnchorTo1 = iterator1.next();
                            if (liveAnchorTo1.mCallBackend != null && c1.get(Integer.valueOf(liveAnchorTo1.mType)) == null) {
                               c1.put(Integer.valueOf(liveAnchorTo1.mType), liveAnchorTo1);
                            }else {
                               continue ;
                            }
                         }
                      }else {
                         continue ;
                      }
                   }
                   iterator = p0.mPermanentTools.mLiveAnchorToolList.iterator();
                   while (iterator.hasNext()) {
                      LiveAnchorToolsInfo$LiveAnchorTool liveAnchorTo2 = iterator.next();
                      if (liveAnchorTo2.mCallBackend != null && c1.get(Integer.valueOf(liveAnchorTo2.mType)) == null) {
                         c1.put(Integer.valueOf(liveAnchorTo2.mType), liveAnchorTo2);
                      }else {
                         continue ;
                      }
                   }
                }
             }
             LiveAnchorShopFragment m = this.r.M;
             m.q = p0.mTopNoticeBarInfo;
             m.p = p0.mTopToolBar;
             CommodityListAuthorResponse mTabBarInfo = p0.mTabBarInfo;
             if (mTabBarInfo != null) {
                tabBarInfo = mTabBarInfo;
             }
             m.r = tabBarInfo;
             mPermanentTo = p0.mPermanentTools;
             if (mPermanentTo != null) {
                mPermanentTo.mIsPermanent = true;
                p1.add(mPermanentTo);
             }
             if (!q.f(p0.mAllTools)) {
                this.r.M.i.clear();
                this.r.M.i.addAll(p0.mAllTools);
                if (a.a()) {
                   p1.add(a1.p(R.string.arg_RES_7f1001d9));
                   p1.addAll(q.i(p0.mAllTools));
                }
             }
             p1.add(tabBarInfo);
             m = this.r.M;
             LiveAnchorShopFragment$b c = m.c;
             CommodityListAuthorResponse mMaxCommodit = p0.mMaxCommodityQuantity;
             if (mMaxCommodit <= null) {
                mMaxCommodit = 10;
             }
             c.c = mMaxCommodit;
             mMaxCommodit = p0.mAnchorConfig;
             if (mMaxCommodit != null) {
                LiveAnchorConfig mMaxWelfareN = mMaxCommodit.mMaxWelfareNum;
                if (mMaxWelfareN <= null) {
                   mMaxWelfareN = 5;
                }
                c.d = mMaxWelfareN;
             }
             if (!m.c()) {
                c1 = this.r.M.c;
                if (c1.e == null) {
                   c1.i(p0.generateChosenList());
                }
             }
             if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "9")) {
                if (this.r.getArguments() != null) {
                   String str1 = "DEST_PAGE";
                   if (this.r.getArguments().containsKey(str1)) {
                      int intx = this.r.getArguments().getInt(str1);
                      if (intx == 4 || intx == 3) {
                         a.t(MerchantCartLogBiz.LIVE_SALE_MANAGER, str, "open sale manager first: ", "page", Integer.valueOf(intx));
                      }
                   }
                }
                if (TextUtils.x(p0.mModulePageUrl)) {
                   a.s(MerchantCartLogBiz.LIVE_SALE_MANAGER, str, "no module page url");
                }else {
                   Object obj = PatchProxy.apply(null, this, uoa, "11");
                   if (obj != PatchProxyResult.class) {
                      i = obj.booleanValue();
                   }else if((u0.b() - a.a.getLong(b.d("user")+"live_excellent_commodity_remind_millis", 0)) - 0x5265c00 > 0){
                      i = true;
                   }
                   if (!i) {
                      a.s(MerchantCartLogBiz.LIVE_SALE_MANAGER, str, "not remind within one day!");
                   }else {
                      uoa = this.r;
                      if (uoa.O != null) {
                         a.s(MerchantCartLogBiz.LIVE_SALE_MANAGER, str, "module page already showed!");
                      }else if(!TextUtils.x(uoa.M.m.mType)){
                         a.s(MerchantCartLogBiz.LIVE_SALE_MANAGER, str, "module is already chosen!");
                      }else {
                         RouterConfig routerConfig = new RouterConfig();
                         routerConfig.i(new c(this));
                         b.m(this.r.getActivity(), p0.mModulePageUrl, routerConfig, new l(this));
                      }
                   }
                }
             }
          }
          ArrayList uArrayList = new ArrayList();
          CommodityListAuthorResponse mItemCardLis = p0.mItemCardList;
          if (mItemCardLis != null) {
             p1.addAll(mItemCardLis);
             p0 = p0.mItemCardList.iterator();
             while (p0.hasNext()) {
                ItemCard itemCard = p0.next();
                if (itemCard.mType == true) {
                   itemCard = itemCard.mCommodity;
                   if (itemCard != null) {
                      uArrayList.add(itemCard);
                   }else {
                      continue ;
                   }
                }else {
                   continue ;
                }
             }
          }
          this.r.M.b.addAll(q.i(uArrayList));
          if (!q.f(this.r.M.b)) {
             tabBarInfo.mTabTitle = a1.p(0x7f1001da);
          }else {
             p1.remove(tabBarInfo);
             p0.r = new TabBarInfo();
          }
       }
       return;
    }
    public void V1(CommodityListAuthorResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorShopFragment$a.class, "13")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       b uob = f.a().x30();
       uob.e(this.r.M.b(), this.r.M.g, p0.getSandeagoInfo());
       uob.A(p0.getExtraInfo().mCategoryList);
       p0 = p0.mAnchorConfig;
       if (p0 != null) {
          uob.v(p0.mMaxSandeagoNum);
       }
       return;
    }
    public final void W1(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveAnchorShopFragment$a.class, "10")) {
          return;
       }
       if (TextUtils.n(p0, "2")) {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putLong(b.d("user")+"live_excellent_commodity_remind_millis", System.currentTimeMillis());
          g.a(uEditor);
       }
       LiveAnchorShopFragment m = this.r.M;
       LiveAnchorShopFragment$b m1 = m.m;
       m1.mType = p0;
       m1.mModuleType = p1;
       m1.mBrandUserId = p2;
       if (m.c()) {
          k1.p(new h(this.r), this);
       }
       a.s(MerchantCartLogBiz.LIVE_SALE_MANAGER, "LiveAnchorShopFragment", "choose moduleType: "+m1.mModuleType+" ,brandUserId: "+m1.mBrandUserId+" ,type: "+m1.mType);
       if (!this.r.M.c()) {
          b9.a(this.r.P);
          p0.P = b.a().X0(this.r.M.b(), m1.mModuleType, m1.mBrandUserId, m1.mType).subscribe(new e(this), new f(this));
       }
       p0.O = true;
       return;
    }
}
