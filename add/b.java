package add.b;
import com.yxcorp.plugin.search.http.a;
import e7d.h;
import com.yxcorp.plugin.search.SearchPage;
import com.yxcorp.plugin.search.response.SearchResultResponse;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uy5.a;
import java.lang.StringBuilder;
import java.lang.Enum;
import q87.c;
import qvb.n0;
import java.util.Map;
import com.yxcorp.plugin.search.entity.SearchItem;
import nfd.b3;
import java.util.ArrayList;
import com.yxcorp.plugin.search.response.BaseSearchResultResponse;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.search.kbox.atmosphere.SearchAtmosphereResource;
import com.yxcorp.plugin.search.response.SearchResultExtParams;
import com.yxcorp.plugin.search.entity.SearchItem$SearchItemType;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import e7d.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import nfd.g0;
import com.yxcorp.utility.SystemUtil;
import ekd.j;
import java.lang.IllegalArgumentException;
import com.google.gson.JsonObject;
import com.kwai.feature.component.entry.SearchEntryParams;
import com.google.gson.JsonElement;
import wx5.a;
import nfd.g3;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.plugin.search.entity.kbox.KBoxRealLog;
import nfd.q1;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import com.yxcorp.plugin.search.entity.kbox.KBoxObjectModel;
import s7d.d;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateMeta;
import com.yxcorp.plugin.search.entity.TemplateText;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateIcon;
import java.util.Iterator;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import com.yxcorp.plugin.search.entity.SearchItem$SearchLabel;
import lnc.a1;
import w9d.b;
import la6.a;
import yx.j0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverActionBarInfo;
import com.yxcorp.plugin.search.entity.ExtInfo;
import com.yxcorp.plugin.search.entity.kbox.KBoxExtParam;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplatePhotoFeed;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplatePhotoType;
import com.yxcorp.plugin.search.entity.template.aggregate.CoverExtInfo;
import tkd.b;
import tkd.d;
import nl9.v;
import com.kwai.framework.model.user.User;
import com.yxcorp.plugin.search.entity.result.SearchCollectionItem;
import ddd.i;
import com.search.common.entity.SearchBaseItem;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import fbd.i;
import fbd.c;
import qvb.a;
import la6.b;
import java.lang.Number;

public class b extends a	// class@0000dc
{
    public boolean T;
    public boolean U;

    public void b(h p0,SearchPage p1){
       super(p0, p1);
       this.N = true;
    }
    public void G2(SearchResultResponse p0,List p1){
       SearchItem searchItem2;
       int i3;
       SearchItem searchItem4;
       int i5;
       a uoa1;
       h d;
       SearchItem searchItem5;
       a uoa2;
       int i6;
       String obj;
       boolean b;
       Object[] obj1;
       boolean b1;
       a uoa3;
       int i8;
       KBoxItem kBoxItem1;
       QPhoto qPhoto1;
       ArrayList uArrayList2;
       KBoxItem kBoxItem2;
       TemplateText templateText;
       int i9;
       SearchItem obj2;
       int b2;
       a uoa4;
       boolean b3;
       SearchResultResponse mExtParams;
       int i = this;
       List list = p0;
       if (PatchProxy.applyVoidTwoRefs(list, p1, i, b.class, "1")) {
          return;
       }
       int i1 = 0;
       Object[] objArray = new Object[i1];
       a.C().t("search_perf", "onLoadItemFromResponse "+i.v.name(), objArray);
       this.P2(p0);
       int i2 = -1;
       if (this.K()) {
          i.G = i1;
          i.H = i1;
          i.M = i1;
          i.I = i2;
          i.J = i2;
          i.L = i1;
          i.O.clear();
          i.T = i1;
          this.clear();
       }
       SearchItem searchItem = b3.f(this);
       SearchItem searchItem1 = (searchItem != null)? searchItem.mPosition: null;
       ArrayList uArrayList = new ArrayList();
       list.mItems = uArrayList;
       if (PatchProxy.applyVoidOneRefs(list, i, b.class, "5") || (!TextUtils.x(list.mRecoPcursor) && !q.f(list.mRecoItems))) {
          list.mCursor = list.mRecoPcursor;
       }
    label_0084 :
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(list, uArrayList, i, b.class, "6") || (q.f(list.mNormalItems) && q.f(list.mRecoItems))) {
          searchItem2 = searchItem1;
       }else {
          this.N2(p0);
          SearchItem searchItem3 = 5;
          if (this.K()) {
             if (!PatchProxy.applyVoidTwoRefs(list, uArrayList, i, b.class, "8") && (q.f(uArrayList) && !p0.isAtmosphereTheme())) {
                mExtParams = list.mExtParams;
                if (mExtParams == null || mExtParams.getKGAtmosphere() == null) {
                   searchItem = new SearchItem();
                   searchItem.mItemType = SearchItem$SearchItemType.TOP_SPACE;
                   uArrayList.add(searchItem);
                }
             }
             i.I2(list, uArrayList);
             if (!PatchProxy.applyVoidOneRefs(uArrayList, i, uoa, "10")) {
                a x1 = i.x;
                if (x1 == null || x1.d() == null) {
                   if (SystemUtil.I()) {
                      throw new IllegalArgumentException("PageList delegate or fragment is null");
                   }
                }else {
                   String str3 = g0.s0(i.x.d().getActivity()).r0();
                   obj = g0.s0(i.x.d().getActivity()).q0();
                   if (i.v == SearchPage.AGGREGATE && (!TextUtils.n(str3, "701") && (TextUtils.n(str3, "702") || !TextUtils.x(obj)))) {
                      searchItem = new SearchItem();
                      searchItem.mItemType = SearchItem$SearchItemType.HEAD_SELECT_CLEAR_FILTER;
                      uArrayList.add(searchItem);
                   }
                }
             }
             if (!PatchProxy.applyVoidTwoRefs(uArrayList, list, i, uoa, "11") && this.K()) {
                mExtParams = list.mExtParams;
                if (mExtParams != null && (mExtParams.mExposedFilter != null && TextUtils.x(mExtParams.mCorrectKeyword))) {
                   searchItem = new SearchItem();
                   searchItem.mItemType = SearchItem$SearchItemType.FILTER_EXPOSED_TIPS;
                   searchItem.mResultExtParams = list.mExtParams;
                   uArrayList.add(searchItem);
                }
             }
          label_0173 :
             if (p0.isAtmosphereTheme()) {
                int colorLight = list.mExtParams.getAtmosphere().getColorLight();
                if (list.mExtParams.getAtmosphere().mLevel != searchItem3 && (TextUtils.x(list.mExtParams.getAtmosphere().mResource) && (list.mExtParams.getAtmosphere().mHasTopColor != null || !j.h(list.mExtParams.getAtmosphere().mTopImgUrls)))) {
                   i.J = i1;
                   searchItem4 = new SearchItem();
                   searchItem4.mItemType = SearchItem$SearchItemType.ATMOSPHERE_VIEW;
                   searchItem4.mAtmosphereResource = list.mExtParams.getAtmosphere();
                   searchItem4.mBgColor = colorLight;
                   uArrayList.add(searchItem4);
                }
                i3 = colorLight;
             label_0204 :
                colorLight = false;
                boolean i4 = 0;
                while (i4 < list.mNormalItems.size()) {
                   searchItem4 = list.mNormalItems.get(i4);
                   String str = "searchItem is not valid";
                   if (searchItem4 == null || searchItem4.mItemType == null) {
                      i2 = i4;
                      i5 = i3;
                      uoa1 = uoa;
                      searchItem2 = searchItem1;
                      g3.w(i.x, str, SearchItem$SearchItemType.UNKNOWN.getTypeValue());
                   }else {
                      searchItem4.mCurPageNum = list.mCursor;
                      a x = i.x;
                      if (x != null) {
                         d = x.D;
                         if (d != null && d.getExtParams() != null) {
                            searchItem4.mLocationParams = a.a(i.x.D.getExtParams().toString());
                         }
                      }
                      if (searchItem4.mItemType != SearchItem$SearchItemType.KBOX || searchItem4.weakStyleKbox()) {
                         searchItem3 = searchItem4.mItemType;
                         if (searchItem3 == SearchItem$SearchItemType.TYPE_AD_BRAND || (searchItem3 == SearchItem$SearchItemType.TYPE_AD_USER_CARD || (searchItem3 == SearchItem$SearchItemType.TYPE_AD_BRAND_LIVE || (searchItem3 != SearchItem$SearchItemType.TYPE_AD_DOWNLOAD_CARD && searchItem3 != SearchItem$SearchItemType.TYPE_COLLECTION_PUZZLE)))) {
                            if (!g3.m(searchItem4, i.x)) {
                               i2 = i4;
                               i5 = i3;
                               uoa1 = uoa;
                               searchItem2 = searchItem1;
                               i8 = 5;
                            }else if(searchItem4.weakStyleKbox()){
                               if (PatchProxy.isSupport(uoa)) {
                                  obj2 = PatchProxy.applyTwoRefs(searchItem4, Integer.valueOf(i4), i, uoa, "30");
                                  if (obj2 != PatchProxyResult.class) {
                                     b2 = obj2.booleanValue();
                                     i9 = i3;
                                     uoa4 = uoa;
                                     searchItem2 = searchItem1;
                                  }else if(q.f(searchItem4.mKBoxBaseItems)){
                                     i9 = i3;
                                     q1.K(i.x, i.v, "mixKBox is empty", i2, searchItem4.mRealLog);
                                  label_02d4 :
                                     uoa4 = uoa;
                                  }else {
                                     i9 = i3;
                                     b2 = 0;
                                     while (true) {
                                        if (b2 < searchItem4.mKBoxBaseItems.size()) {
                                           kBoxItem1 = searchItem4.mKBoxBaseItems.get(b2);
                                           if (!kBoxItem1.isValid(i.x, i.v, searchItem4)) {
                                              goto label_02d4 ;
                                           }else {
                                              KBoxItem mKboxModel = kBoxItem1.mKboxModel;
                                              if (mKboxModel != null) {
                                                 mKboxModel.initTKObject();
                                              }
                                              i.M2(kBoxItem1, searchItem4);
                                              uoa3 = 98;
                                              if (!PatchProxy.applyVoidOneRefs(kBoxItem1, i, uoa, "36") && kBoxItem1.mType == uoa3) {
                                                 String str1 = "title";
                                                 if (TextUtils.n(kBoxItem1.mKboxModel.mTachikomaKey, str1) && !q.f(kBoxItem1.mKboxModel.mTKDatas)) {
                                                    i1 = 0;
                                                    if (kBoxItem1.mKboxModel.mTKDatas.get(i1).mTKContent instanceof JsonObject) {
                                                       String str2 = "imageTitleUrls";
                                                       if (kBoxItem1.mKboxModel.mTKDatas.get(i1).mTKContent.e0(str2) != null) {
                                                          kBoxItem1.mType = 1;
                                                          TemplateMeta templateMeta1 = new TemplateMeta();
                                                          kBoxItem1.mKBoxTitleMeta = templateMeta1;
                                                          uoa4 = uoa;
                                                          templateMeta1.mTitleContentName = new TemplateText();
                                                          kBoxItem1.mKBoxTitleMeta.mTitleContentName.mText = kBoxItem1.mKboxModel.mTKDatas.get(0).mTKContent.e0(str1).w();
                                                          kBoxItem1.mKBoxTitleMeta.mTitleContentTypeIcons = new Gson().c(kBoxItem1.mKboxModel.mTKDatas.get(0).mTKContent.e0(str2), CDNUrl[].class);
                                                          kBoxItem1.mKBoxTitleMeta.mButton = new TemplateIcon();
                                                          kBoxItem1.mKBoxTitleMeta.mButton.mAladdinText = new TemplateText();
                                                          kBoxItem1.mKBoxTitleMeta.mButton.mAladdinText.mText = kBoxItem1.mKboxModel.mTKDatas.get(0).mTKContent.e0("moreText").w();
                                                          kBoxItem1.mKBoxTitleMeta.mButton.mLinkUrl = kBoxItem1.mKboxModel.mTKDatas.get(0).mTKContent.e0("moreLink").w();
                                                       label_03da :
                                                          mKboxModel = kBoxItem1.mType;
                                                          if (mKboxModel == 98) {
                                                             searchItem4.mKBoxItem = kBoxItem1;
                                                          }else if(mKboxModel == 1){
                                                             kBoxItem1 = kBoxItem1.mKBoxTitleMeta;
                                                             if (kBoxItem1 != null) {
                                                                TemplateMeta mButton = kBoxItem1.mButton;
                                                                if (mButton != null && !TextUtils.x(mButton.mLinkUrl)) {
                                                                label_0403 :
                                                                   searchItem2 = searchItem1;
                                                                label_0452 :
                                                                   b2 = b2 + 1;
                                                                   searchItem1 = searchItem2;
                                                                   uoa = uoa4;
                                                                   i2 = -1;
                                                                }
                                                             }
                                                          }else if(q.f(kBoxItem1.mKBoxFeeds)){
                                                             goto label_0403 ;
                                                          }else {
                                                             Iterator iterator = kBoxItem1.mKBoxFeeds.iterator();
                                                             while (iterator.hasNext()) {
                                                                TemplateBaseFeed templateBase = iterator.next();
                                                                if (templateBase == null) {
                                                                   searchItem2 = searchItem1;
                                                                   q1.K(i.x, i.v, "kboxFeed is null", kBoxItem1.mType, searchItem4.mRealLog);
                                                                   iterator.remove();
                                                                }else {
                                                                   searchItem2 = searchItem1;
                                                                   if (!TextUtils.x(templateBase.errorMsg())) {
                                                                      q1.K(i.x, i.v, templateBase.errorMsg(), kBoxItem1.mType, searchItem4.mRealLog);
                                                                      iterator.remove();
                                                                   }
                                                                }
                                                                searchItem1 = searchItem2;
                                                             }
                                                             searchItem2 = searchItem1;
                                                             searchItem4.mKBoxItem = kBoxItem1;
                                                             goto label_0452 ;
                                                          }
                                                       }
                                                    }
                                                 }
                                              }
                                              uoa4 = uoa;
                                              goto label_03da ;
                                           }
                                        }else {
                                           uoa4 = uoa;
                                           searchItem2 = searchItem1;
                                           searchItem4.mPosition = i4;
                                           b2 = true;
                                        }
                                     }
                                  }
                                  searchItem2 = searchItem1;
                                  b2 = false;
                               }else {
                                  goto label_02a1 ;
                               }
                               if (!b2) {
                               label_0576 :
                                  i2 = i4;
                                  i6 = i9;
                                  uoa2 = uoa4;
                               label_0574 :
                                  uoa = -1;
                               label_05b6 :
                                  uoa1 = uoa2;
                                  i5 = i6;
                               }
                            }else {
                               i9 = i3;
                               uoa4 = uoa;
                               searchItem2 = searchItem1;
                            }
                            if (i.O2(searchItem4)) {
                               if (PatchProxy.isSupport(b.class)) {
                                  searchItem5 = searchItem4;
                                  i1 = 2;
                                  i2 = i4;
                                  i6 = i9;
                                  uoa2 = uoa4;
                                  if (!PatchProxy.applyVoidFourRefs(Integer.valueOf(i4), p0, searchItem5, uArrayList, this, b.class, "10")) {
                                  label_049e :
                                     if (i.I < null) {
                                        i.I = i2;
                                        if (!PatchProxy.applyVoidThreeRefs(uArrayList, searchItem5, p0, this, b.class, "12") && (i.J != -1 || i.U != null)) {
                                           i.U = false;
                                           if (uArrayList.size() > 0) {
                                              b = 1;
                                              colorLight = uArrayList.size() - b;
                                              uArrayList.get(colorLight).mBigSpace = b;
                                           }
                                           if (this.D2()) {
                                              SearchItem$SearchLabel searchLabel = new SearchItem$SearchLabel(a1.p(0x7f103bfd), SearchItem$SearchItemType.TAG, false);
                                              searchItem4 = SearchItem.fromLabel(searchLabel);
                                              searchItem4.mKeywordContext = i.w;
                                              searchLabel.setFirstItem(searchItem5);
                                              uArrayList.add(searchItem4);
                                           }
                                        }
                                     }
                                     if (i.m2(list, uArrayList, searchItem5)) {
                                        b = 1;
                                        colorLight = i.H + b;
                                        i.H = colorLight;
                                        searchItem5.setPosition(colorLight);
                                        searchItem5.mKeywordContext = i.w;
                                        searchItem5.mIsRecommendResult = list.mIsRecommendResult;
                                        searchItem5.mPageIndex = i.r;
                                        searchItem5.setIsFeedItem(b);
                                        if (i.H == i1 && searchItem5.isLiveOrPhotoOrADOrCollection()) {
                                           colorLight = uArrayList.size() - i1;
                                           if (uArrayList.get(colorLight).isLiveOrPhotoOrADOrCollection()) {
                                              colorLight = uArrayList.size() - i1;
                                              b = true;
                                              uArrayList.get(colorLight).mIsFirstSecondAllPhoto = b;
                                           label_0541 :
                                              if (!this.D2()) {
                                                 colorLight = list.mNormalItems.size() - b;
                                                 if (i2 != colorLight || a.a(list.mCursor)) {
                                                    uArrayList.add(this.p2());
                                                 }
                                              }
                                           }
                                        }
                                        b = 1;
                                        goto label_0541 ;
                                     }
                                  }
                               }else {
                                  searchItem5 = searchItem4;
                                  i2 = i4;
                                  i6 = i9;
                                  uoa2 = uoa4;
                                  i1 = 2;
                                  goto label_049e ;
                               }
                               if (uArrayList.size() >= i1) {
                                  colorLight = uArrayList.size() - i1;
                                  uArrayList.get(colorLight).mHasMixDataAfter = true;
                               }
                               colorLight = true;
                               goto label_0574 ;
                            }else {
                               goto label_0576 ;
                            }
                         }
                      }
                      searchItem5 = searchItem4;
                      i2 = i4;
                      uoa2 = uoa;
                      searchItem2 = searchItem1;
                      i1 = 2;
                      i6 = i3;
                      if (this.D2()) {
                         if (PatchProxy.isSupport(b.class)) {
                            obj = PatchProxy.applyOneRefs(Integer.valueOf(i2), i, b.class, "9");
                            if (obj != PatchProxyResult.class) {
                               b = obj.booleanValue();
                               uoa = -1;
                            }else {
                            label_05a4 :
                               a i10 = i.I;
                               b = (i10 == -1 || (i2 > i10 || !this.K()))? true: false;
                            }
                         }else {
                            goto label_05a4 ;
                         }
                         if (b) {
                            goto label_05b6 ;
                         }
                      }else {
                         uoa = -1;
                      }
                      int i7 = i.G + 1;
                      i.G = i7;
                      searchItem5.mHasMixDataBefore = colorLight;
                      if (!i6) {
                         searchItem5.mAtmosphereType = 0;
                      }
                      if (searchItem5.mAtmosphereType != null) {
                         searchItem5.mBgColor = i6;
                      }
                      if (i.J < null && i7 > 0) {
                         i.J = i2;
                      }
                      searchItem4 = searchItem5.mItemType;
                      SearchItem$SearchItemType tYPE_AD_BRAN = SearchItem$SearchItemType.TYPE_AD_BRAND;
                      if (searchItem4 != tYPE_AD_BRAN && (searchItem4 == SearchItem$SearchItemType.TYPE_AD_USER_CARD || searchItem4 == SearchItem$SearchItemType.TYPE_AD_BRAND_LIVE)) {
                         uoa1 = uoa2;
                         i5 = i6;
                         if (uArrayList.isEmpty() && q.f(list.mSubTabItems)) {
                            searchItem5.mIsFirstKBoxAddTopSpace = true;
                         }
                         searchItem5.mPosition = i.G;
                         uArrayList.add(searchItem5);
                         obj1 = PatchProxy.applyTwoRefs(uArrayList, searchItem5, i, b.class, "7");
                         if (obj1 != PatchProxyResult.class) {
                            b1 = obj1.booleanValue();
                            colorLight = true;
                         }else {
                            obj1 = PatchProxy.applyOneRefs(searchItem5, null, i.class, "24");
                            if (obj1 != PatchProxyResult.class) {
                               colorLight = obj1.booleanValue();
                            }else {
                               searchItem = searchItem5.mItemType;
                               b = d.a(0x53db42e7).aK(searchItem5.mPhoto);
                               colorLight = (searchItem == tYPE_AD_BRAN || (searchItem == SearchItem$SearchItemType.TYPE_AD_BRAND_LIVE && (b == 7 || b == 8)))? true: false;
                            }
                            if (colorLight) {
                               colorLight = true;
                               searchItem5.mIsBrandSuper = colorLight;
                               searchItem4 = searchItem5.clone();
                               searchItem4.mIsBrandSuperAppendedContent = colorLight;
                               uArrayList.add(searchItem4);
                               b1 = true;
                            }else {
                               colorLight = true;
                               b1 = false;
                            }
                         }
                         searchItem4 = new SearchItem();
                         searchItem4.mItemType = SearchItem$SearchItemType.KBOX_SPACE;
                         searchItem4.mHasMixDataAfter = searchItem5.mHasMixDataAfter;
                         if (b1) {
                            searchItem4.mIsFollowingBrandSuper = colorLight;
                         }
                         uArrayList.add(searchItem4);
                      }else {
                         i3 = 3;
                         if (searchItem4 == SearchItem$SearchItemType.TYPE_AD_DOWNLOAD_CARD) {
                            i4 = 4;
                            if (PatchProxy.isSupport(uoa2)) {
                               obj1 = new Object[5];
                               obj1[0] = searchItem5;
                               obj1[1] = Integer.valueOf(i2);
                               obj1[i1] = uArrayList;
                               obj1[i3] = Integer.valueOf(i7);
                               obj1[i4] = list;
                               uoa3 = uoa2;
                               if (!PatchProxy.applyVoid(obj1, i, uoa3, "34")) {
                               label_0620 :
                                  obj = "SearchResultPageList";
                                  if (q.f(searchItem5.mFeeds)) {
                                     Object[] objArray1 = new Object[0];
                                     j0.c(obj, "addAdDownloadCardInfo empty feeds", objArray1);
                                  }else {
                                     QPhoto qPhoto = searchItem5.mFeeds.get(0);
                                     PhotoAdvertisement photoAdverti = k.B(qPhoto);
                                     if (photoAdverti != null && (photoAdverti.getAdData() != null && (photoAdverti.getAdData().mCoverActionbarInfo == null || (TextUtils.x(photoAdverti.getAdData().mCoverActionbarInfo.mTemplateId) && searchItem5.mFeeds.size() < i3)))) {
                                        obj1 = new Object[0];
                                        j0.c(obj, "addAdDownloadCardInfo data error", obj1);
                                     }else {
                                        ArrayList uArrayList1 = new ArrayList();
                                        if (searchItem5.mRealLog == null) {
                                           searchItem5.mRealLog = new KBoxRealLog();
                                        }
                                        if (photoAdverti != null) {
                                           photoAdverti.mSearchKBoxAdFeedSize = searchItem5.mFeeds.size();
                                        }
                                        searchItem = searchItem5.mExtInfo;
                                        if (searchItem != null && !TextUtils.x(searchItem.mAdText)) {
                                           KBoxItem kBoxItem = new KBoxItem();
                                           kBoxItem.mType = 1;
                                           TemplateMeta templateMeta = new TemplateMeta();
                                           kBoxItem.mKBoxTitleMeta = templateMeta;
                                           templateMeta.mTitleContentName = new TemplateText();
                                           kBoxItem.mKBoxTitleMeta.mTitleContentName.mText = searchItem5.mExtInfo.mAdText;
                                           kBoxItem1 = kBoxItem;
                                           qPhoto1 = qPhoto;
                                           uoa1 = uoa3;
                                           i5 = i6;
                                           uArrayList2 = uArrayList1;
                                           kBoxItem2 = kBoxItem1;
                                           templateText = 3;
                                           i9 = i7;
                                           i.l2(uArrayList, list, uArrayList2, this.n2(p0, searchItem5, kBoxItem2, i7, 0));
                                        }else {
                                           qPhoto1 = qPhoto;
                                           i9 = i7;
                                           uoa1 = uoa3;
                                           i5 = i6;
                                           templateText = 3;
                                           uArrayList2 = uArrayList1;
                                        }
                                        kBoxItem2 = new KBoxItem();
                                        kBoxItem2.mType = 0x2711;
                                        searchItem = this.n2(p0, searchItem5, kBoxItem2, i9, false);
                                        searchItem.mPhoto = qPhoto1;
                                        i.l2(uArrayList, list, uArrayList2, searchItem);
                                        if (searchItem5.mFeeds.size() >= templateText) {
                                           kBoxItem2 = new KBoxItem();
                                           kBoxItem2.mType = 13;
                                           kBoxItem2.mKBoxFeeds = new ArrayList();
                                           kBoxItem2.mSupportLeftSlideLink = false;
                                           kBoxItem2.mCoverRatio = 0x3f400000;
                                           KBoxExtParam searchItem6 = new KBoxExtParam();
                                           kBoxItem2.mExtParam = searchItem6;
                                           searchItem6.mKboxStyle = 4;
                                           for (colorLight = 0; colorLight < searchItem5.mFeeds.size(); colorLight++) {
                                              QPhoto qPhoto2 = searchItem5.mFeeds.get(colorLight);
                                              PhotoAdvertisement photoAdverti1 = k.B(qPhoto2);
                                              if (photoAdverti1 != null) {
                                                 photoAdverti1.mIsSearchKBoxAd = true;
                                                 i3 = colorLight + 1;
                                                 photoAdverti1.mSearchKBoxAdIndex = i3;
                                                 if (!TextUtils.x(photoAdverti1.mAdLabelDescription)) {
                                                    qPhoto2.setCaption(photoAdverti1.mAdLabelDescription);
                                                 }
                                              }
                                              TemplatePhotoFeed templatePhot = new TemplatePhotoFeed();
                                              templatePhot.mType = TemplatePhotoType.VIDEO;
                                              templatePhot.mQphoto = qPhoto2;
                                              templatePhot.mFeedLogCtx = searchItem5.mFeedLogCtx;
                                              CoverExtInfo uCoverExtInf = new CoverExtInfo();
                                              templatePhot.mCoverExtInfo = uCoverExtInf;
                                              uCoverExtInf.mBottomLeftIcon = new TemplateIcon();
                                              if (d.a(0x53db42e7).pQ(qPhoto2)) {
                                                 uCoverExtInf = templatePhot.mCoverExtInfo.mBottomLeftIcon;
                                                 uCoverExtInf.mType = 4;
                                                 uCoverExtInf.mAladdinText = new TemplateText();
                                                 templatePhot.mCoverExtInfo.mBottomLeftIcon.mAladdinText.mText = qPhoto2.getUser().getName();
                                                 templatePhot.mCoverExtInfo.mBottomLeftIcon.mIconUrl = qPhoto2.getUser().mAvatar;
                                                 templatePhot.mCoverExtInfo.mBottomLeftIcon.mIconUrls = qPhoto2.getUser().mAvatars;
                                              }else {
                                                 templatePhot.mCoverExtInfo.mBottomLeftIcon.mAladdinText = new TemplateText();
                                                 templatePhot.mCoverExtInfo.mBottomLeftIcon.mAladdinText.mText = qPhoto2.getCaption();
                                              }
                                              kBoxItem2.mKBoxFeeds.add(templatePhot);
                                           }
                                           i.l2(uArrayList, list, uArrayList2, this.n2(p0, searchItem5, kBoxItem2, i9, false));
                                        }
                                        kBoxItem2 = new KBoxItem();
                                        kBoxItem2.mType = 0x2712;
                                        searchItem = this.n2(p0, searchItem5, kBoxItem2, 0, true);
                                        searchItem.mPhoto = qPhoto1;
                                        i.l2(uArrayList, list, uArrayList2, searchItem);
                                        uArrayList.addAll(uArrayList2);
                                        searchItem = new SearchItem();
                                        searchItem.mItemType = SearchItem$SearchItemType.KBOX_SPACE;
                                        searchItem.mHasMixDataAfter = searchItem5.mHasMixDataAfter;
                                        uArrayList.add(searchItem);
                                     }
                                  }
                               }
                            }else {
                               uoa3 = uoa2;
                               str = 5;
                               goto label_0620 ;
                            }
                            uoa1 = uoa3;
                            i5 = i6;
                            i8 = 5;
                         }else {
                            uoa1 = uoa2;
                            i5 = i6;
                            searchItem1 = 3;
                            if (searchItem5.isCollectionPuzzleType()) {
                               searchItem4 = searchItem5.mSearchCollectionItem;
                               if (searchItem4 != null && (q.f(searchItem4.mFeeds) || (searchItem5.mSearchCollectionItem.mFeeds.size() != searchItem1 && searchItem5.mSearchCollectionItem.mFeeds.size() != 6))) {
                                  g3.w(i.x, str, searchItem5.mItemType.getTypeValue());
                               }else {
                                  searchItem5.mPosition = i.G;
                                  i.U = true;
                                  uArrayList.add(searchItem5);
                                  searchItem = new SearchItem();
                                  searchItem.mItemType = SearchItem$SearchItemType.KBOX_SPACE;
                                  uArrayList.add(searchItem);
                               }
                            }else if(!this.H2(searchItem5, i2, uArrayList, i.G, p0)){
                               colorLight = i.G - 1;
                               i.G = colorLight;
                            }
                         }
                      }
                      colorLight = false;
                   }
                   i4 = i2 + 1;
                   i3 = i5;
                   searchItem1 = searchItem2;
                   uoa = uoa1;
                   i2 = -1;
                }
                searchItem2 = searchItem1;
                if (!q.f(list.mRecoItems)) {
                   if (this.K() && !q.f(uArrayList)) {
                      b = 1;
                      colorLight = uArrayList.size() - b;
                      uArrayList.get(colorLight).mIsLastNormalFeed = b;
                   }
                   b3 = (i.H == null)? true: false;
                   if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(uArrayList, p0, Boolean.valueOf(b3), this, b.class, "14")) {
                      if (PatchProxy.isSupport(b.class) && (!PatchProxy.applyVoidThreeRefs(uArrayList, p0, Boolean.valueOf(b3), this, b.class, "13") && this.K())) {
                         searchItem = new SearchItem();
                         searchItem.setIsFeedItem(true);
                         SearchItem$SearchItemType eMPTY_FEED = (b3)? SearchItem$SearchItemType.EMPTY_FEED: SearchItem$SearchItemType.LESS_FEEDS;
                         searchItem.mItemType = eMPTY_FEED;
                         uArrayList.add(searchItem);
                      }
                      if (PatchProxy.isSupport(b.class) && (!PatchProxy.applyVoidThreeRefs(uArrayList, p0, Boolean.valueOf(b3), this, b.class, "15") && (this.K() && (!b3 && (i.T == null && !q.f(list.mRecoItems)))))) {
                         i.T = true;
                         i4 = false;
                         searchItem = SearchItem.fromLabel(new SearchItem$SearchLabel(a1.p(R.string.arg_RES_7f1000fe), SearchItem$SearchItemType.MMU_TAG, i4));
                         searchItem.mKeywordContext = i.w;
                         uArrayList.add(searchItem);
                      }else {
                         i4 = false;
                      }
                      while (i4 < list.mRecoItems.size()) {
                         searchItem = list.mRecoItems.get(i4);
                         if (i.O2(searchItem)) {
                            b = true;
                            searchItem.setIsFeedItem(b);
                            searchItem.mKeywordContext = i.w;
                            searchItem.mIsRecommendResult = list.mIsRecommendResult;
                            searchItem.mIsEmptyRecommended = b;
                            searchItem.mRecommendType = b;
                            searchItem.mFeedRpcSource = "RECOMMEND_RESULT";
                            searchItem.mSessionId = list.mUssid;
                            if (i.m2(list, uArrayList, searchItem)) {
                               b2 = i.M + b;
                               i.M = b2;
                               searchItem.mPosition = b2;
                            }
                         }else {
                            b = true;
                         }
                         i4++;
                      }
                      Iterator iterator1 = uArrayList.iterator();
                      while (iterator1.hasNext()) {
                         obj2 = iterator1.next();
                         i4 = (b3)? 1: 2;
                         obj2.mResultCountType = i4;
                      }
                   }
                }
             }else {
                mExtParams = list.mExtParams;
                if (mExtParams != null && mExtParams.getKGAtmosphere() != null) {
                   i.J = i1;
                   searchItem = new SearchItem();
                   searchItem.mItemType = SearchItem$SearchItemType.ATMOSPHERE_VIEW;
                   searchItem.mAtmosphereResource = list.mExtParams.getKGAtmosphere();
                   searchItem.mBgColor = list.mExtParams.getKGAtmosphere().getBgColor();
                   uArrayList.add(searchItem);
                }
             }
          }
       label_0203 :
          i3 = null;
          goto label_0204 ;
       }
       b3.i(list, i.w);
       i oi = i.b();
       oi.e(list);
       oi.c(i.r);
       oi.d(this.u2());
       oi.a(i.b.size());
       oi.e = i.G;
       b3.e(searchItem2, uArrayList, oi);
       super.G2(p0, p1);
       return;
    }
    public void M1(Object p0,List p1){
       this.G2(p0, p1);
    }
    public final boolean O2(SearchItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.D2()) {
          return true;
       }
       return this.E2(p0);
    }
    public void P2(SearchResultResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.C2(p0);
       this.x.x(p0.mUssid);
       this.x.w(p0.mRequestId);
       return;
    }
    public void d2(b p0,List p1){
       this.G2(p0, p1);
    }
    public int s2(SearchResultResponse p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.K()) {
          BaseSearchResultResponse mNormalItems = p0.mNormalItems;
          if (mNormalItems != null) {
             i = mNormalItems.size();
          label_0023 :
             return i;
          }
       }
       i = 0;
       goto label_0023 ;
    }
}
