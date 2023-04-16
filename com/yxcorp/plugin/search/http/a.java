package com.yxcorp.plugin.search.http.a;
import w9d.b;
import e7d.h;
import com.yxcorp.plugin.search.SearchPage;
import java.lang.Object;
import java.util.Objects;
import e7d.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.ArrayList;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import androidx.collection.ArrayMap;
import qvb.n0$a;
import qvb.n0;
import com.yxcorp.plugin.search.response.SearchResultResponse;
import com.yxcorp.plugin.search.response.SearchResultExtParams;
import com.yxcorp.plugin.search.response.Layout;
import xf6.d;
import xf6.l;
import com.yxcorp.plugin.search.result.LayoutStyle;
import add.g;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import androidx.fragment.app.Fragment;
import java.lang.Boolean;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.entity.SearchItem$SearchItemType;
import java.util.List;
import com.yxcorp.plugin.search.response.BaseSearchResultResponse;
import java.util.Collection;
import ekd.q;
import com.yxcorp.plugin.search.result.SubTabItem;
import la6.b;
import nfd.z0;
import java.lang.Integer;
import com.yxcorp.plugin.search.entity.kbox.KBoxRealLog;
import nfd.q1;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import com.yxcorp.plugin.search.entity.kbox.KBoxObjectModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import s7d.d;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateCommodityFeed;
import ecd.b;
import ecd.d;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplatePhotoType;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import fg6.a;
import com.yxcorp.plugin.search.entity.kbox.SearchTKNative;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import com.yxcorp.gifshow.entity.QPhoto;
import nfd.y0;
import com.google.gson.JsonObject;
import com.yxcorp.plugin.search.entity.TemplateText;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateMeta;
import java.lang.StringBuilder;
import java.util.Iterator;
import com.yxcorp.plugin.search.entity.template.aggregate.CoverExtInfo;
import com.yxcorp.plugin.search.entity.template.aggregate.AuthorVerifyInfo;
import com.yxcorp.plugin.search.entity.kbox.KBoxExtParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PhotoMeta;
import kp.r1;
import jf5.k;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.decompose.api.ObservableAndSyncableContainer;
import nfd.b3;
import wkd.b;
import sed.i;
import com.yxcorp.plugin.search.kbox.atmosphere.SearchAtmosphereResource;
import brd.t;
import uy5.a;
import q87.c;
import java.util.Map;
import z6d.k;
import lyb.u;
import z6d.a;
import nfd.g3;
import z6d.l;
import cjd.e;
import erd.o;
import kcd.n;
import crd.b;
import lnc.b9;
import ekd.h1;
import ekd.g1;
import ekd.g1$a;
import io.reactivex.subjects.ReplaySubject;
import io.reactivex.subjects.PublishSubject;
import ekd.f1;
import erd.r;
import brd.z;
import io.reactivex.android.schedulers.a;
import ekd.e1;
import erd.g;
import ekd.b1;
import java.util.concurrent.TimeUnit;
import ekd.c1;
import ekd.d1;
import com.yxcorp.plugin.search.http.a$a;
import brd.y;
import java.lang.Throwable;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplatePhotoFeed;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateLiveFeed;
import com.kwai.feature.component.entry.SearchSceneSource;
import f7d.k;
import h7d.b;
import h7d.a;
import org.json.JSONArray;
import java.util.HashMap;
import t45.d;
import f7d.j;
import sfc.a;
import qvb.a;
import l66.c;
import dda.b;
import m66.a;
import q7d.d0;
import com.yxcorp.plugin.search.entity.result.SearchCollectionItem;
import com.search.common.entity.SearchBaseItem;
import nfd.n2;
import com.yxcorp.plugin.search.entity.SearchFilter;
import android.content.Context;
import lnc.w5;
import nfd.r0;
import gbd.u;
import com.yxcorp.plugin.search.SearchSource;
import nfd.a1;

public abstract class a extends b	// class@001e6d
{
    public SearchResultResponse A;
    public String B;
    public boolean C;
    public boolean D;
    public String E;
    public String F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public int M;
    public boolean N;
    public Map O;
    public SearchItem P;
    public String Q;
    public b R;
    public List t;
    public int u;
    public final SearchPage v;
    public SearchKeywordContext w;
    public h x;
    public boolean y;
    public boolean z;
    public static final int S;

    public void a(h p0,SearchPage p1){
       int i;
       Objects.requireNonNull(p0);
       a obj = PatchProxy.apply(null, p0, a.class, "4");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          obj = p0.c;
          if (obj == null) {
             obj = p0.b;
             i = (obj == null)? 0: obj.getPage();
          }else {
             i = obj.getPage();
          }
       }
       super(true, i);
       this.t = new ArrayList();
       this.u = -1;
       this.w = SearchKeywordContext.EMPTY_SEARCH_CONTEXT;
       this.F = "NORMAL";
       this.I = -1;
       this.J = -1;
       this.O = new ArrayMap();
       this.x = p0;
       this.v = p1;
       if (p1 == SearchPage.AGGREGATE) {
          b = true;
       }
       this.y = b;
       return;
    }
    public static void i2(a p0,n0$a p1){
       super.K1(p1);
    }
    public static void j2(a p0,n0$a p1){
       super.K1(p1);
    }
    public static void k2(a p0,n0$a p1){
       super.K1(p1);
    }
    public boolean A2(){
       return this.D;
    }
    public boolean B2(){
       return this.C;
    }
    public void C2(SearchResultResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "45")) {
          return;
       }
       if (this.K()) {
          p0 = p0.mExtParams;
          boolean b = false;
          SearchResultExtParams mLayoutLands = (p0 != null)? p0.mLayoutLandscape: null;
          Layout layout = new Layout();
          if (l.c("KEY_ENABLE_SEARCH_SINGLE_FEED_CARD", b)) {
             mLayoutLands = 1;
          }
          LayoutStyle fLOW = (mLayoutLands != null)? LayoutStyle.FLOW: LayoutStyle.DOUBLE;
          layout.mLayoutStyle = fLOW;
          BaseFragment uBaseFragmen = this.x.d();
          if (!PatchProxy.applyVoidTwoRefs(uBaseFragmen, layout, null, g.class, "4") && uBaseFragmen instanceof SearchResultFragment) {
             g.f(uBaseFragmen, layout);
             g.c(uBaseFragmen);
          }
       }
    label_0051 :
       return;
    }
    public boolean D2(){
       Object obj = PatchProxy.apply(null, this, a.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (g.a(this.x.d()) == LayoutStyle.DOUBLE)? true: false;
       return b;
    }
    public boolean E2(SearchItem p0){
       p0 = p0.mItemType;
       boolean b = (p0 != SearchItem$SearchItemType.PHOTO && (p0 == SearchItem$SearchItemType.LIVE_STREAM || p0 == SearchItem$SearchItemType.RELATION_SEARCH))? true: false;
       return b;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       this.z = true;
       this.load();
       return;
    }
    public void G2(SearchResultResponse p0,List p1){
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "6")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "12") && this.K()) {
          int i1 = q.f(p0.mSubTabItems) ^ 0x01;
          this.C = i1;
          if (i1) {
             i1 = 0;
             int i2 = 0;
             while (i2 < p0.mSubTabItems.size()) {
                SubTabItem subTabItem = p0.mSubTabItems.get(i2);
                i2 = i2 + 1;
                subTabItem.mPosition = i2;
                subTabItem.mSessionId = p0.mUssid;
                subTabItem.mRequestId = p0.mRequestId;
             }
             a tx = this.x;
             if (tx != null) {
                tx.U(p0.mSubTabItems.get(i1));
             }
          }
       }
       super.d2(p0, p1);
       if (this.K()) {
          this.E = p0.mUssid;
          String str = PatchProxy.applyOneRefs(p0, this, uoa, "13");
          if (str != PatchProxyResult.class) {
          }else {
             int i = this.s2(p0);
             if (!i) {
                str = "NONE";
             }else if(i <= 5){
                str = "LESS";
             }else {
                str = "NORMAL";
             }
          }
          this.F = str;
       }
       if (p0.getLastItem() != null) {
          this.P = p0.getLastItem();
       }
       z0.h(p0);
       return;
    }
    public boolean H2(SearchItem p0,int p1,List p2,int p3,SearchResultResponse p4){
       KBoxItem obj;
       ArrayList uArrayList1;
       int i12;
       KBoxItem kBoxItem1;
       PatchProxyResult patchProxyRe1;
       int b;
       SearchItem obj1;
       KBoxExtParam kBoxExtParam;
       int i13;
       int i14;
       String str1;
       KBoxExtParam kBoxExtParam1;
       KBoxItem kBoxItem2;
       int i15;
       KBoxItem kBoxItem3;
       SearchItem this;
       SearchItem searchItem1;
       ArrayList uArrayList2;
       int i16;
       ArrayList uArrayList3;
       d obj2;
       String str2;
       int i = this;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int i1 = 5;
       boolean i2 = 2;
       int i3 = 4;
       int i4 = 3;
       int i5 = 0;
       int i6 = 1;
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[i1];
          objArray[i5] = oobject;
          objArray[i6] = Integer.valueOf(p1);
          objArray[i2] = oobject1;
          objArray[i4] = Integer.valueOf(p3);
          objArray[i3] = oobject2;
          obj = PatchProxy.apply(objArray, i, a.class, "31");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       int i7 = -1;
       if (q.f(oobject.mKBoxBaseItems)) {
          q1.K(i.x, i.v, "mixKBox is empty", i7, oobject.mRealLog);
          return i5;
       }else if(oobject.mRealLog == null){
          oobject.mRealLog = new KBoxRealLog();
       }
       ArrayList uArrayList = new ArrayList();
       int i8 = 0;
       int i9 = 0;
       int i10 = 0;
       int i11 = 1;
       while (true) {
          if (i8 < oobject.mKBoxBaseItems.size()) {
             KBoxItem kBoxItem = oobject.mKBoxBaseItems.get(i8);
             if (kBoxItem != null && kBoxItem.mKboxModel != null) {
                a x = i.x;
                if (x != null && x.J()) {
                   kBoxItem.mKboxModel.mTKDataCount = i.x.D();
                }
                kBoxItem.mKboxModel.initTKObject();
             }
             KBoxItem mKboxModel = kBoxItem.mKboxModel;
             if (mKboxModel != null && !q.f(mKboxModel.mTKList)) {
                oobject.mRealLog.mTKNatives = kBoxItem.mKboxModel.mTKList;
             }
             i.M2(kBoxItem, oobject);
             uArrayList1 = 98;
             if (!PatchProxy.applyVoidOneRefs(kBoxItem, i, a.class, "35") && (kBoxItem.mType == uArrayList1 && (TextUtils.n(kBoxItem.mKboxModel.mTachikomaKey, "slideGoods") && !q.f(kBoxItem.mKboxModel.mTKDatas)))) {
                kBoxItem.mDisableShowNoMoreText = i6;
                kBoxItem.mType = 18;
                kBoxItem.mKBoxFeeds = new ArrayList();
                i7 = 0;
                while (true) {
                   if (i7 < kBoxItem.mKboxModel.mTKDatas.size()) {
                      d uod = kBoxItem.mKboxModel.mTKDatas.get(i7);
                      TemplateCommodityFeed templateComm = new TemplateCommodityFeed();
                      obj2 = uod.mTKNative;
                      if (obj2 == null) {
                         d.a(i.x.d(), "search tkData.mTKNative is null");
                      }else {
                         templateComm.mType = TemplatePhotoType.COMMODITY;
                         templateComm.mId = uod.mId;
                         templateComm.mFeedLogCtx = a.a.c(obj2.mFeedLogCtx, FeedLogCtx.class);
                         templateComm.mCommodityItem = uod.mTKNative.b;
                         templateComm.mQPhoto = templateComm.getQphoto();
                         kBoxItem.mKBoxFeeds.add(templateComm);
                         if (y0.j() && i7 == i4) {
                         label_0143 :
                            KBoxObjectModel mTKExtParams = kBoxItem.mKboxModel.mTKExtParams;
                            if (mTKExtParams instanceof JsonObject) {
                               if (mTKExtParams.e0("supportLeftSlideLink").d()) {
                                  str2 = "leftSlideLinkUrl";
                                  if (mTKExtParams.e0(str2) != null) {
                                     kBoxItem.mSlideLinkUrl = mTKExtParams.e0(str2).w();
                                     kBoxItem.mSupportLeftSlideLink = true;
                                  }
                               }
                               str2 = "bottomJumpInfo";
                               if (mTKExtParams.e0(str2) instanceof JsonObject) {
                                  kBoxItem.mBottomJumpInfo = a.a.c(mTKExtParams.e0(str2), TemplateText.class);
                                  break ;
                               }
                            }
                         }
                      }
                      i7 = i7 + 1;
                      obj2 = 4;
                   }else {
                      goto label_0143 ;
                   }
                }
             }
          label_0188 :
             if (!kBoxItem.isValid(i.x, i.v, oobject)) {
                uArrayList.clear();
                return false;
             }else {
                mKboxModel = kBoxItem.mType;
                String str = "kboxFeed is null";
                if (mKboxModel != i4 && (mKboxModel != 4 && (mKboxModel != 5 && (mKboxModel == 12 || mKboxModel == 7)))) {
                   i12 = i8;
                   kBoxItem1 = kBoxItem;
                   uArrayList1 = uArrayList;
                   if (q.f(kBoxItem1.mKBoxFeeds)) {
                   label_05fc :
                      patchProxyRe1 = patchProxyRe;
                      if (!q.f(uArrayList1) && (uArrayList1.get((uArrayList1.size() - 1)).mKBoxItem != null && (this.K() && p4.isAtmosphereTheme()))) {
                         if (uArrayList1.get(0).mKBoxItem.mType == 14 || oobject.mAtmosphereType == 4) {
                            i5 = false;
                         label_0638 :
                            oobject1.addAll(uArrayList1);
                            if (i5) {
                               SearchItem searchItem = this.p2();
                               searchItem.mHasMixDataAfter = oobject.mHasMixDataAfter;
                               b = true;
                               if (i9) {
                                  searchItem.mPreItemIsVerticalKbox = b;
                               }
                               if (oobject.mAtmosphereType == b) {
                                  if (p4.isAtmosphereTheme() && !oobject2.mExtParams.getAtmosphere().isTopAtmosphere()) {
                                     searchItem.mAtmosphereType = b;
                                     searchItem.mBgColor = oobject.mBgColor;
                                  }
                               }else {
                                  i7 = p1 + 1;
                                  if (PatchProxy.isSupport(a.class)) {
                                     obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(i7), oobject2, i, a.class, "38");
                                     if (obj1 != patchProxyRe1) {
                                        i5 = obj1.booleanValue();
                                        i7 = 3;
                                     }else if(oobject2.mNormalItems.size() <= i7){
                                        i7 = 3;
                                     }else {
                                        i7 = 3;
                                        if (oobject2.mNormalItems.get(i7).mAtmosphereType == i7) {
                                           i5 = true;
                                        }
                                     }
                                     i5 = false;
                                  }else {
                                     goto label_0685 ;
                                  }
                                  if (i5) {
                                     searchItem.mAtmosphereType = i7;
                                  }
                               }
                            label_06a3 :
                               oobject1.add(searchItem);
                               break ;
                            }
                            break ;
                         }
                      }else {
                         i8 = false;
                      }
                      i5 = true;
                      goto label_0638 ;
                   }else if(i.v == SearchPage.COMMODITY){
                      if (kBoxItem1.mType == 3) {
                         obj = kBoxItem1.mExtParam;
                         if (obj != null) {
                            kBoxExtParam = obj.mKboxFoldIndex;
                         label_0446 :
                            i8 = 0;
                            b = 0;
                            i7 = 0;
                            while (i7 < kBoxItem1.mKBoxFeeds.size()) {
                               if (kBoxItem1.mKBoxFeeds.get(i7) == null) {
                                  b = b + 1;
                                  i13 = b;
                                  q1.K(i.x, i.v, str, kBoxItem1.mType, oobject.mRealLog);
                                  i14 = i7;
                                  patchProxyRe1 = patchProxyRe;
                                  str1 = str;
                                  b = i13;
                                  kBoxExtParam1 = kBoxExtParam;
                               }else if(!TextUtils.x(kBoxItem1.mKBoxFeeds.get(i7).errorMsg())){
                                  b = b + 1;
                                  i13 = b;
                                  q1.K(i.x, i.v, kBoxItem1.mKBoxFeeds.get(i7).errorMsg(), kBoxItem1.mType, oobject.mRealLog);
                                  i14 = i7;
                                  patchProxyRe1 = patchProxyRe;
                                  str1 = str;
                                  b = i13;
                                  kBoxExtParam1 = kBoxExtParam;
                               }else {
                                  KBoxExtParam kBoxExtParam2 = kBoxExtParam;
                                  i3 = i8 + 1;
                                  i15 = i7 + 1;
                                  kBoxItem1.mKBoxFeeds.get(i7).setPosition(i15);
                                  kBoxItem3 = new KBoxItem();
                                  kBoxItem3.mType = kBoxItem1.mType;
                                  kBoxItem3.mBaseFeed = kBoxItem1.mKBoxFeeds.get(i7);
                                  kBoxItem3.mExtParam = kBoxItem1.mExtParam;
                                  kBoxItem3.mFeedsSize = kBoxItem1.mKBoxFeeds.size();
                                  i8 = kBoxItem1.mKBoxFeeds.size() - 1;
                                  i13 = (i7 == i8)? 1: 0;
                                  str1 = str;
                                  i1 = b;
                                  i14 = i7;
                                  patchProxyRe1 = patchProxyRe;
                                  kBoxExtParam1 = kBoxExtParam2;
                                  this = this.n2(p4, p0, kBoxItem3, p3, i13);
                                  if (i3 > kBoxExtParam1 && kBoxExtParam1 > null) {
                                     i.t.add(this);
                                  }else {
                                     i.l2(oobject1, oobject2, uArrayList1, this);
                                  }
                                  if (i3 == kBoxExtParam1 && kBoxExtParam1 < kBoxItem1.mKBoxFeeds.size()) {
                                     i15 = p2.size() + uArrayList1.size();
                                     i.u = i15;
                                     a w = i.w;
                                     obj1 = this.mRealLog;
                                     if (!PatchProxy.applyVoidFourRefs(this, uArrayList1, w, obj1, null, b3.class, "16")) {
                                        searchItem1 = new SearchItem();
                                        searchItem1.mItemType = SearchItem$SearchItemType.KBOX_COMMON_EXPAND_VIEW;
                                        searchItem1.mRealLog = obj1;
                                        searchItem1.mRank = this.mRank;
                                        searchItem1.mPosition = this.mPosition;
                                        searchItem1.mIsEmptyRecommended = false;
                                        searchItem1.mKeywordContext = w;
                                        uArrayList1.add(searchItem1);
                                     }
                                  }
                                  b = i1;
                                  i8 = i3;
                               }
                               i7 = i14 + 1;
                               kBoxExtParam = kBoxExtParam1;
                               str = str1;
                               patchProxyRe = patchProxyRe1;
                               kBoxItem2 = null;
                            }
                            patchProxyRe1 = patchProxyRe;
                            if (b == kBoxItem1.mKBoxFeeds.size()) {
                               uArrayList1.clear();
                               return false;
                            }
                         }
                      }
                   }else {
                      a uoa = 3;
                   }
                   kBoxExtParam = -1;
                   goto label_0446 ;
                }else {
                   kBoxItem3 = 1;
                   if (mKboxModel == kBoxItem3) {
                      searchItem1 = oobject.mAtmosphereType;
                      kBoxItem2 = 2;
                      if (searchItem1 == kBoxItem3 || searchItem1 == kBoxItem2) {
                         kBoxItem.mKBoxTitleMeta.updateAtmosphere();
                      }
                      mKboxModel = kBoxItem;
                   }else {
                      mKboxModel = i10;
                   }
                   if (kBoxItem.mType == 98) {
                      kBoxItem3 = kBoxItem.mKboxModel;
                      if (kBoxItem3 != null) {
                         if (kBoxItem3.mTKContent instanceof JsonObject && ("base").equals(kBoxItem3.mTachikomaKey)) {
                            kBoxItem.mKboxModel.mTKContent.a0("item_pos", Integer.valueOf(i11));
                            i11 = i11 + 1;
                         }
                         KBoxItem kBoxItem4 = kBoxItem;
                         uArrayList2 = uArrayList;
                         kBoxItem2 = mKboxModel;
                         i16 = i8;
                         i2 = false;
                         if (!PatchProxy.applyVoidFourRefs(p0, uArrayList, p4, kBoxItem4, this, a.class, "33")) {
                            a x1 = i.x;
                            if (x1 != null && x1.J()) {
                               i.R1(i2);
                               kBoxItem1 = kBoxItem4;
                               JsonObject jsonObject = kBoxItem1.mKboxModel.initTKExtParams();
                               if (("title").equals(kBoxItem1.mKboxModel.mTachikomaKey) && !q.f(kBoxItem1.mKboxModel.mTKDatas)) {
                                  d mTKContent = kBoxItem1.mKboxModel.mTKDatas.get(i2).mTKContent;
                                  if (mTKContent instanceof JsonObject) {
                                     oobject.mRealLog.mTKTitle = mTKContent;
                                  }
                               }
                               if (("eventLine").equals(kBoxItem1.mKboxModel.mTachikomaKey)) {
                                  kBoxItem = kBoxItem1.mKboxModel;
                                  if (kBoxItem.mTKExtParams == null) {
                                     kBoxItem.mTKExtParams = new JsonObject();
                                  }
                                  KBoxRealLog mTKTitle = oobject.mRealLog.mTKTitle;
                                  if (mTKTitle != null) {
                                     jsonObject.G("titleModel", mTKTitle);
                                     oobject.mRealLog.mTKTitle = null;
                                     if (uArrayList2.size() > 0) {
                                        i15 = uArrayList2.size() - 1;
                                        uArrayList3 = uArrayList2;
                                        uArrayList3.remove(i15);
                                     label_028d :
                                        jsonObject.H("isLandingPage", Boolean.TRUE);
                                        jsonObject.c0("pcursor", oobject2.mCursor);
                                        jsonObject.c0("pageSize", i.x.D()+"");
                                        jsonObject.c0("pageType", i.x.E());
                                        jsonObject.c0("subTabId", i.x.G());
                                     }
                                  }
                               }
                            label_028b :
                               uArrayList3 = uArrayList2;
                               goto label_028d ;
                            }
                         }
                         kBoxItem1 = kBoxItem4;
                         uArrayList3 = uArrayList2;
                      }else {
                      label_02d3 :
                         i16 = i8;
                         kBoxItem1 = kBoxItem;
                         uArrayList3 = uArrayList;
                         kBoxItem2 = mKboxModel;
                         i2 = false;
                         int i17 = -1;
                      }
                   }else {
                      goto label_02d3 ;
                   }
                   i6 = i16;
                   i7 = 1;
                   if (i6 > i7) {
                      kBoxItem1.mIsAllCard = i2;
                   }
                   i8 = oobject.mKBoxBaseItems.size() - i7;
                   KBoxItem kBoxItem5 = (i6 == i8)? 1: null;
                   i12 = i6;
                   uArrayList2 = uArrayList3;
                   this = this.n2(p4, p0, kBoxItem1, p3, kBoxItem5);
                   if (!q.f(kBoxItem1.mKBoxFeeds)) {
                      if (kBoxItem1.mType == 6 && kBoxItem2 != null) {
                         kBoxItem2.mBaseFeed = kBoxItem1.mKBoxFeeds.get(i2);
                      }
                      if (kBoxItem2 != null) {
                         kBoxItem = kBoxItem2.mKBoxTitleMeta;
                         if (kBoxItem != null && kBoxItem.isOpenDetail()) {
                            kBoxItem2.mKBoxFeeds = kBoxItem1.mKBoxFeeds;
                         }
                      }
                      Iterator iterator = kBoxItem1.mKBoxFeeds.iterator();
                      i5 = 0;
                      while (iterator.hasNext()) {
                         i5 = i5 + 1;
                         TemplateBaseFeed templateBase = iterator.next();
                         if (templateBase == null) {
                            q1.K(i.x, i.v, str, kBoxItem1.mType, oobject.mRealLog);
                            iterator.remove();
                            i2 = i5;
                            kBoxItem5 = kBoxItem2;
                         }else if(!TextUtils.x(templateBase.errorMsg())){
                            kBoxItem5 = kBoxItem2;
                            q1.K(i.x, i.v, templateBase.errorMsg(), kBoxItem1.mType, oobject.mRealLog);
                            iterator.remove();
                         }else {
                            kBoxItem5 = kBoxItem2;
                            templateBase.setPosition(i5);
                            TemplateBaseFeed mCoverExtInf = templateBase.mCoverExtInfo;
                            if (mCoverExtInf != null) {
                               CoverExtInfo mAuthorVerif = mCoverExtInf.mAuthorVerifyInfo;
                               if (mAuthorVerif != null && (!TextUtils.x(mAuthorVerif.mVerifySecondText) || !TextUtils.x(templateBase.mCoverExtInfo.mAuthorVerifyInfo.mVerifySecondSubText))) {
                                  kBoxItem1.mHasVerifyInfo = true;
                               }
                            }
                            if (templateBase.getQphoto() != null) {
                               mKboxModel = kBoxItem1.mExtParam;
                               if (mKboxModel != null && (mKboxModel.mEnableHotResume != null && mKboxModel.isEnableKboxSlide == null)) {
                                  PhotoMeta photoMeta = r1.u1(templateBase.getQphoto().mEntity);
                                  if (photoMeta != null) {
                                     obj2 = null;
                                     if (!PatchProxy.applyVoidTwoRefs(photoMeta, obj2, obj2, k.class, "2")) {
                                        a.p(photoMeta, "$this$generalBottomBarInfo");
                                        photoMeta.setPartData("generalBottomBarInfo", obj2);
                                     }
                                     photoMeta.mBottomEntryInfo = obj2;
                                  label_03d3 :
                                     if (kBoxItem1.mType == 13) {
                                        i2 = i5;
                                        templateBase.getQphoto().setExtraSaveProgressTime(0xea60);
                                     }else {
                                        i2 = i5;
                                     }
                                     templateBase.getQphoto().setListLoadSequenceID(p4.getResponseLlsid());
                                     templateBase.getQphoto().setSource(20);
                                  label_03fa :
                                     i5 = i2;
                                     kBoxItem2 = kBoxItem5;
                                     KBoxItem kBoxItem6 = null;
                                  }
                               }
                               kBoxItem2 = null;
                               goto label_03d3 ;
                            }
                         }
                         i2 = i5;
                         kBoxItem2 = null;
                         goto label_03fa ;
                      }
                      kBoxItem5 = kBoxItem2;
                      if (!kBoxItem1.isValid(i.x, i.v, oobject)) {
                         uArrayList2.clear();
                         return false;
                      }
                   }else {
                      kBoxItem5 = kBoxItem2;
                      obj2 = 0;
                   }
                   uArrayList1 = uArrayList2;
                   i.l2(oobject1, oobject2, uArrayList1, this);
                   patchProxyRe1 = patchProxyRe;
                   i10 = kBoxItem5;
                }
                i15 = 0x55ed04a8;
                if (kBoxItem1.mType == 98 && (b.a(i15).e() != null && b.a(i15).e().contains(kBoxItem1.mKboxModel.mTachikomaKey))) {
                   i9 = 1;
                }
             label_05a5 :
                if (kBoxItem1.mType == 98 && (b.a(i15).f() != null && (b.a(i15).f().contains(kBoxItem1.mKboxModel.mTachikomaKey) && !q.f(p2)))) {
                   i15 = true;
                   if (p2.size() == i15) {
                      i8 = 0;
                      if (oobject1.get(i8).mItemType == SearchItem$SearchItemType.TOP_SPACE) {
                         oobject1.get(i8).mHasNoTopSpace = i15;
                      }
                   }
                }
                i8 = i12 + 1;
                uArrayList = uArrayList1;
                patchProxyRe = patchProxyRe1;
                i6 = 1;
                i4 = 3;
                kBoxItem2 = 4;
             }
          }else {
             uArrayList1 = uArrayList;
             goto label_05fc ;
          }
       }
       return true;
    }
    public t I1(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       Object[] obj = PatchProxy.apply(objArray, this, uoa, "14");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.K()) {
          this.Q = objArray;
       }
       String str = "SearchResultPageList";
       int i = 0;
       if (this.A != null && this.K()) {
          obj = new Object[i];
          a.C().t(str, "create request from preResponse for path "+this.v.mTabType, obj);
          return t.just(this.A);
       }else {
          Object[] objArray1 = new Object[i];
          a.C().t(str, "create request from network for path "+this.v.mTabType, objArray1);
          t ot = PatchProxy.apply(objArray, this, uoa, "15");
          if (ot != patchProxyRe) {
          }else if(this.v.isHashTagDetailPath()){
             ot = k.d(this.o2());
          }else if(this.t2() != null && this.t2().mSearchKeywordParams != null){
             SearchKeywordContext mSearchKeywo = this.t2().mSearchKeywordParams;
             u obj1 = PatchProxy.applyOneRefs(mSearchKeywo, this, uoa, "16");
             if (obj1 != patchProxyRe) {
                ot = obj1;
             }else {
                obj1 = mSearchKeywo.c;
                u f = mSearchKeywo.f;
                Object obj2 = PatchProxy.applyOneRefs(f, this, uoa, "5");
                if (obj2 != patchProxyRe) {
                   f = obj2;
                }else {
                   uoa = a.j();
                   String str1 = (this.K())? "": this.L0().getCursor();
                   uoa.d(str1);
                   uoa.m(this.w2());
                   uoa.f(this.z2(this.N));
                   uoa.k(this.v2());
                   uoa.l(this.q2());
                   boolean b = (!this.K() && !q.f(this.L0().mRecoItems))? true: false;
                   uoa.h(b);
                   if (!TextUtils.n(this.v.mTabType, "tag")) {
                      i = -1;
                   }
                   uoa.n(i);
                   uoa.e(g3.e(g3.f(this.x, this.w.mFirstPageHasSelectedInterest, this.v)));
                   f.putAll(uoa.c());
                }
                obj2 = PatchProxy.applyTwoRefs(obj1, f, objArray, k.class, "5");
                if (obj2 != patchProxyRe) {
                   ot = obj2;
                }else {
                   ot = k.b().t(obj1, f).map(new e());
                }
             }
          }else {
             String requestPath = this.v.getRequestPath();
             if (this.v == SearchPage.ACTIVITY) {
                requestPath = SearchPage.AGGREGATE.getRequestPath();
             }
             if (this.v == SearchPage.NEWEST) {
                requestPath = SearchPage.PHOTO.getRequestPath();
             }
             ot = k.c(requestPath, this.o2());
          }
          return ot;
       }
    }
    public void I2(SearchResultResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "9")) {
          return;
       }
       if (this.K()) {
          SearchResultResponse mExtParams = p0.mExtParams;
          if (mExtParams != null && !TextUtils.x(mExtParams.mCorrectKeyword)) {
             a tx = this.x;
             if (tx != null && !tx.J()) {
                this.K2(true);
                SearchItem searchItem = new SearchItem();
                searchItem.mItemType = SearchItem$SearchItemType.SEARCH_CORRECT;
                searchItem.mResultExtParams = p0.mExtParams;
                p1.add(searchItem);
             label_0040 :
                return;
             }
          }
       }
       this.K2(false);
       goto label_0040 ;
    }
    public void J2(String p0){
       this.B = p0;
    }
    public void K1(n0$a p0){
       g1 a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "23")) {
          return;
       }
       if (this.y == null) {
          n.a().e(this.u2(), this.r, false);
       }
       if (this.v == SearchPage.AGGREGATE && this.K()) {
          b9.a(this.R);
          h1 oh1 = b.a(-724931776);
          SearchKeywordContext mMajorKeywor = this.t2().mMajorKeyword;
          int i = 50;
          g1 og1 = oh1.a.get(mMajorKeywor);
          if (og1 == null) {
             g1$a uoa = new g1$a();
             uoa.a = mMajorKeywor;
             uoa.c = ReplaySubject.h(1);
             PublishSubject publishSubje = PublishSubject.g();
             uoa.d = publishSubje;
             uoa.b = i;
             g1 og11 = new g1();
             og11.a = uoa.a;
             og11.b = i;
             og11.c = uoa.c;
             og11.d = publishSubje;
             oh1.a.put(mMajorKeywor, og11);
             og1 = og11;
          }
          a = og1.a;
          Objects.requireNonNull(a);
          og1.e = t.timer((long)og1.b, TimeUnit.MILLISECONDS).observeOn(a.c()).subscribe(new c1(og1), new d1(og1));
          og1.c.filter(new f1(a)).observeOn(a.c()).doOnNext(new e1(og1)).doAfterNext(new b1(og1)).subscribe(new a$a(this, p0));
       }else {
          super.K1(p0);
       }
       this.y = false;
       return;
    }
    public void K2(boolean p0){
       this.D = p0;
    }
    public void L1(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "24")) {
          return;
       }
       if (this.y == null) {
          n.a().e(this.u2(), this.r, true);
       }
       return;
    }
    public void L2(SearchResultResponse p0){
       this.A = p0;
    }
    public void M1(Object p0,List p1){
       this.G2(p0, p1);
    }
    public final void M2(KBoxItem p0,SearchItem p1){
       String str;
       Gson a;
       String str1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "37")) {
          return;
       }
       if (p0.mType == 98 && (TextUtils.n(p0.mKboxModel.mTachikomaKey, "horizontalSlideBigCard") && !q.f(p0.mKboxModel.mTKDatas))) {
          if (p0.mExtParam == null) {
             p0.mExtParam = new KBoxExtParam();
          }
          KBoxObjectModel mTKExtParams = p0.mKboxModel.mTKExtParams;
          if (mTKExtParams instanceof JsonObject) {
             str = "enableScrollToSearchResultFeed";
             if (mTKExtParams.e0(str) != null) {
                p0.mExtParam.isEnableKboxSlide = p0.mKboxModel.mTKExtParams.e0(str).d();
             }
          }
          mTKExtParams = p0.mKboxModel.mTKExtParams;
          if (mTKExtParams instanceof JsonObject) {
             str = "enableHotResume";
             if (mTKExtParams.e0(str) != null) {
                p0.mExtParam.mEnableHotResume = p0.mKboxModel.mTKExtParams.e0(str).d();
             }
          }
          p0.mType = 13;
          p0.mKBoxFeeds = new ArrayList();
          int i = 0;
          while (i < p0.mKboxModel.mTKDatas.size()) {
             d uod = p0.mKboxModel.mTKDatas.get(i);
             if (uod.mTKNative == null) {
                d.a(this.x.d(), "search tkData.mTKNative is null");
             }else {
                TemplateBaseFeed templateBase = TemplatePhotoType.fromInt(uod.mType).createFeed();
                if (templateBase instanceof TemplateCommodityFeed) {
                   templateBase.mCommodityItem = uod.mTKNative.b;
                   templateBase.mType = TemplatePhotoType.COMMODITY;
                }else if(templateBase instanceof TemplatePhotoFeed){
                   templateBase.mQphoto = uod.mTKNative.c;
                   templateBase.mType = TemplatePhotoType.VIDEO;
                }else if(templateBase instanceof TemplateLiveFeed){
                   templateBase.mQphoto = uod.mTKNative.c;
                   templateBase.mType = TemplatePhotoType.LIVESTREAM;
                }
                templateBase.mId = uod.mId;
                a = a.a;
                templateBase.mFeedLogCtx = a.c(uod.mTKNative.mFeedLogCtx, FeedLogCtx.class);
                uod = uod.extParams;
                if (uod != null && uod instanceof JsonObject) {
                   templateBase.mCoverExtInfo = a.c(uod.e0("coverInfo"), CoverExtInfo.class);
                }
                p0.mKBoxFeeds.add(templateBase);
             }
             i = i + 1;
          }
          p1.mCommentFeeds = p0.mKBoxFeeds;
          KBoxObjectModel mTKExtParams1 = p0.mKboxModel.mTKExtParams;
          if (mTKExtParams1 instanceof JsonObject) {
             str1 = "leftSlideLinkUrl";
             if (mTKExtParams1.e0(str1) != null) {
                p0.mSlideLinkUrl = p0.mKboxModel.mTKExtParams.e0(str1).w();
                p0.mSupportLeftSlideLink = true;
             }
          }
          mTKExtParams1 = p0.mKboxModel.mTKExtParams;
          if (mTKExtParams1 instanceof JsonObject) {
             str1 = "isShowUserInfo";
             if (mTKExtParams1.e0(str1) != null) {
                p0.mShowUserInfo = p0.mKboxModel.mTKExtParams.e0(str1).d();
             }
          }
          mTKExtParams1 = p0.mKboxModel.mTKExtParams;
          if (mTKExtParams1 instanceof JsonObject && mTKExtParams1.e0("moreToast") != null) {
             p0.mSlideNoMoreText = p0.mKboxModel.mTKExtParams.e0("moreToast").w();
          }
       }
    label_0191 :
       return;
    }
    public void N2(SearchResultResponse p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "41")) {
          return;
       }
       if (this.y2() != SearchPage.AGGREGATE && this.y2() != SearchPage.PHOTO) {
          return;
       }
       if (this.x.l().mPageSource != SearchSceneSource.UNKNOWN.mPageSource) {
          return;
       }
       if (!q.f(p0.mNormalItems)) {
          k ok = b.a(-1285358087);
          String str = (this.t2() == null)? "": this.t2().mMajorKeyword;
          String str1 = str;
          SearchSceneSource mPageSource = (this.y2() == SearchPage.PHOTO)? SearchSceneSource.FEED_PAGE.mPageSource: this.x.l().mPageSource;
          SearchSceneSource searchSceneS = mPageSource;
          BaseSearchResultResponse mUssid = p0.mUssid;
          ArrayList uArrayList = PatchProxy.applyOneRefs(p0, null, b3.class, "19");
          if (uArrayList != patchProxyRe) {
          }else {
             BaseSearchResultResponse mNormalItems = p0.mNormalItems;
             uArrayList = new ArrayList();
             int i = 0;
             while (i < mNormalItems.size()) {
                SearchItem mPhoto = mNormalItems.get(i).mPhoto;
                if (mPhoto != null && mPhoto.isVideoType()) {
                   uArrayList.add(mPhoto);
                }
                i = i + 1;
             }
          }
          p0 = uArrayList;
          Objects.requireNonNull(ok);
          if (!PatchProxy.isSupport(k.class) || (!PatchProxy.applyVoidFourRefs(str1, Integer.valueOf(searchSceneS), mUssid, p0, ok, k.class, "14") && !q.f(p0))) {
             k c = ok.c;
             if (c != null) {
                c.dispose();
             }
             b uob = a.a();
             JSONArray jSONArray = PatchProxy.applyOneRefs(p0, ok, k.class, "16");
             if (jSONArray != patchProxyRe) {
             }else {
                jSONArray = new JSONArray();
                Iterator iterator = p0.iterator();
                while (iterator.hasNext()) {
                   QPhoto qPhoto = iterator.next();
                   Object obj = PatchProxy.applyOneRefs(qPhoto, ok, k.class, "13");
                   if (obj != patchProxyRe) {
                      b = obj.booleanValue();
                   }else if(qPhoto == null){
                      b = false;
                   }else {
                      b = ok.d.containsKey(qPhoto.getPhotoId());
                   }
                   if (b) {
                      continue ;
                   }
                   jSONArray.put(qPhoto.getPhotoId());
                }
             }
             ok.c = uob.c(str1, searchSceneS, mUssid, jSONArray).map(new e()).subscribeOn(d.b).observeOn(d.c).subscribe(new j(ok), new a());
          }
       }
    label_013e :
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, a.class, "42")) {
          return;
       }
       SearchResultResponse searchResult = this.L0();
       if (searchResult instanceof SearchResultResponse) {
          searchResult.mRecoPymkFlag = false;
       }
       super.clear();
       return;
    }
    public void d2(b p0,List p1){
       this.G2(p0, p1);
    }
    public void h2(boolean p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "25")) {
          return;
       }
       if (this.y == null) {
          n.a().d(this.u2(), this.r);
       }
       return;
    }
    public final void l2(List p0,SearchResultResponse p1,List p2,SearchItem p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "39")) {
          return;
       }
       if (p0.isEmpty() && (p2.isEmpty() && q.f(p1.mSubTabItems))) {
          p3.mIsFirstKBoxAddTopSpace = true;
       }
    label_0027 :
       p2.add(p3);
       return;
    }
    public void load(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       super.load();
       this.z = false;
       return;
    }
    public boolean m2(SearchResultResponse p0,List p1,SearchItem p2){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SearchItem obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "28");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = p2.mItemType;
       if (obj != SearchItem$SearchItemType.RELATION_SEARCH && (obj == SearchItem$SearchItemType.MUSIC_TAG || p2.weakStyleKbox())) {
          p1.add(p2);
          return true;
       }else {
          String str = b3.g(p2);
          if (this.O.containsKey(str) && p2.mIsEmptyRecommended == this.O.get(str).booleanValue()) {
             SearchItem mPhoto = p2.mPhoto;
             if (mPhoto != null && mPhoto.isAd()) {
                p2.mPhoto.setListLoadSequenceID(p0.mLlsid);
                c.a().b(new b(p2.mPhoto.mEntity, 3));
             }
             return false;
          }else if(PatchProxy.applyVoidOneRefs(p2, this, a.class, "29")){
             p0 = PatchProxy.applyOneRefs(p2, null, d0.class, "23");
             if (p0 != patchProxyRe) {
                b = p0.booleanValue();
             }else {
                a.p(p2, "$this$isCollectionType");
                b = p2.isCollectionType();
             }
             if (b) {
                this.O.put(b3.d(p2.getFirstPhoto().getBizId(), SearchItem$SearchItemType.PHOTO.getTypeValue()), Boolean.valueOf(p2.mIsEmptyRecommended));
             }
          }
          this.O.put(b3.g(p2), Boolean.valueOf(p2.mIsEmptyRecommended));
          p1.add(p2);
          return true;
       }
    }
    public final SearchItem n2(SearchResultResponse p0,SearchItem p1,KBoxItem p2,int p3,boolean p4){
       SearchItem obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Boolean.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, uoa, "40");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new SearchItem();
       obj.mDisableShowNoMoreText = p2.mDisableShowNoMoreText;
       obj.mKeywordContext = this.w;
       SearchItem mSearchColle = p1.mSearchCollectionItem;
       if (mSearchColle != null) {
          obj.mSearchCollectionItem = mSearchColle;
          mSearchColle.bindPhotoInfo();
       }
       if (p0.isAtmosphereTheme() && (p0.mExtParams.getAtmosphere().isTopAtmosphere() && p0.mExtParams.getAtmosphere().mLevel == 5)) {
          if (p3 == 1) {
             if (p4) {
                obj.mAtmosphereResource = p0.mExtParams.getAtmosphere();
             }
             p1.mBgColor = 0;
          }else {
             p1.mAtmosphereType = 0;
          }
       }
       obj.mKBoxItem = p2;
       obj.mItemType = SearchItem$SearchItemType.KBOX;
       obj.mRealLog = p1.mRealLog;
       obj.mPosition = p3;
       obj.mRank = p1.mRank;
       obj.mKsOrderId = p1.mKsOrderId;
       obj.mBgColor = p1.mBgColor;
       obj.mFeedLogCtx = p1.mFeedLogCtx;
       obj.mExtInfo = p1.mExtInfo;
       obj.mHasMixDataBefore = p1.mHasMixDataBefore;
       obj.mFeedRpcSource = p1.mFeedRpcSource;
       obj.mLocationParams = p1.mLocationParams;
       if (p2.mType == 98 && TextUtils.n(p2.mKboxModel.mTachikomaKey, "comment")) {
          KBoxRealLog mCommentFeed = p1.mRealLog.mCommentFeeds;
          if (mCommentFeed != null) {
             p2.mKBoxFeeds = mCommentFeed;
          }
       }
       if (!p4) {
          SearchItem mAtmosphereT = p1.mAtmosphereType;
          if (mAtmosphereT == 2 || mAtmosphereT == 4) {
             obj.mAtmosphereType = 1;
          label_00c9 :
             return obj;
          }
       }
       obj.mAtmosphereType = p1.mAtmosphereType;
       goto label_00c9 ;
    }
    public Map o2(){
       Map map;
       a obj1;
       boolean b1;
       a tx;
       String str2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, uoa, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, this, uoa, "2");
       if (obj != patchProxyRe) {
       }else if(TextUtils.x(this.Q)){
          map = this.r2();
          this.Q = g3.e(map);
       }else {
          map = objArray;
       }
       a uoa1 = a.j();
       uoa1.i(this.t2().mMajorKeyword);
       String str = "";
       String str1 = (this.K())? str: this.L0().getCursor();
       uoa1.d(str1);
       uoa1.b = n2.j(this.x);
       uoa1.m(this.w2());
       uoa1.f(this.z2(this.N));
       str1 = PatchProxy.apply(objArray, this, uoa, "18");
       if (str1 != patchProxyRe) {
       }else {
          obj1 = this.x;
          str1 = (obj1 != null)? obj1.e(): str;
       }
       uoa1.g(str1);
       uoa1.k(this.v2());
       uoa1.l(this.q2());
       boolean b = true;
       int i = 0;
       if (!this.K() && (this.z != null || q.f(this.L0().mRecoItems))) {
          obj1 = PatchProxy.applyOneRefs(map, this, uoa, "4");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(map == null || !map.containsKey("filterType")){
             a tx1 = this.x;
             if (tx1 == null || (tx1.d() != null && (SearchFilter.isLocationLive(String.valueOf(map.get("filterType"))) && !w5.a(this.x.d().getContext())))) {
                b1 = true;
             }
          }
       label_00f2 :
          b1 = false;
          if (!b1) {
             b1 = false;
          label_00f8 :
             uoa1.h(b1);
             uoa = PatchProxy.apply(objArray, this, uoa, "21");
             if (uoa != patchProxyRe) {
             }else {
                tx = this.x;
                if (tx != null) {
                   if (tx.z().f()) {
                      if (this.x.z().h() && (!this.x.F().b() && this.x.m() != SearchSource.SEARCH_FILTER)) {
                         if (this.x.m() == SearchSource.SEARCH_RELATED_TAB) {
                            str2 = this.x.s;
                         }
                      }
                   }
                   if (this.x.B().m()) {
                      if (!n2.o(this.v) || (!this.x.B().o() || !this.x.F().b())) {
                         b = 0;
                      }
                   }else {
                      b = this.x.F().b();
                   }
                   if (!this.K() || !b) {
                      str2 = this.t2().getRequestId();
                   }
                }
             label_018a :
                str2 = str;
             }
             uoa1.j = uoa;
             tx = this.x;
             SearchSceneSource mPageSource = (tx == null)? SearchSceneSource.UNKNOWN.mPageSource: tx.l().mPageSource;
             uoa1.m = mPageSource;
             tx = this.x;
             if (tx != null) {
                str = tx.E();
             }
             uoa1.n = str;
             tx = this.x;
             int i1 = (tx == null)? -1: tx.D();
             uoa1.o = i1;
             tx = this.x;
             if (tx != null) {
                objArray = tx.G();
             }
             uoa1.p = objArray;
             if (!TextUtils.n(this.v.mTabType, "tag")) {
                i = -1;
             }
             uoa1.n(i);
             uoa1.e(this.Q);
             obj = uoa1;
          }
       }
       b1 = true;
       goto label_00f8 ;
       return obj.c();
    }
    public void p0(){
       if (PatchProxy.applyVoid(null, this, a.class, "43")) {
          return;
       }
       super.p0();
       b9.a(this.R);
       return;
    }
    public SearchItem p2(){
       SearchItem obj = PatchProxy.apply(null, this, a.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SearchItem();
       obj.mItemType = SearchItem$SearchItemType.KBOX_SPACE;
       if (this.I != -1) {
          obj.mBigSpace = true;
       }
       return obj;
    }
    public String q2(){
       return this.B;
    }
    public Map r2(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return g3.f(this.x, this.w.mFirstPageHasSelectedInterest, this.v);
    }
    public int s2(SearchResultResponse p0){
       return 0;
    }
    public final SearchKeywordContext t2(){
       a obj = PatchProxy.apply(null, this, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.x;
       if (obj != null) {
          this.w = obj.f();
       }
       return this.w;
    }
    public String u2(){
       return this.v.mLogName;
    }
    public String v2(){
       a obj = PatchProxy.apply(null, this, a.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.x;
       if (obj != null) {
          return obj.i();
       }
       return "";
    }
    public final String w2(){
       Object obj = PatchProxy.apply(null, this, a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.K()) {
          return null;
       }
       if (!TextUtils.x(this.E)) {
          return this.E;
       }
       return this.L0().mUssid;
    }
    public SearchItem x2(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 < this.b.size() && p0 >= 0) {
          return this.b.get(p0);
       }else {
          return null;
       }
    }
    public SearchPage y2(){
       return this.v;
    }
    public int z2(boolean p0){
       a obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "20");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       obj = this.x;
       SearchSource searchSource = null;
       if (obj != null && obj.m() != SearchSource.UNKNOWN) {
          obj = this.x;
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(null, obj, a.class, "9");
          if (obj1 != patchProxyRe) {
             searchSource = obj1.intValue();
          }else if(obj.m() != null){
             searchSource = obj.m().mSearchFrom;
          }
       }
       return searchSource;
    }
}
