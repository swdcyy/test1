package nfd.g3;
import java.lang.Object;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.j;
import android.widget.ImageView;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import nfd.g3$a;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.plugin.search.http.a;
import qvb.n0;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.entity.ExtInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.CommonMeta;
import kp.r1;
import java.util.ArrayList;
import android.util.Base64;
import ar4.b;
import v00.c;
import com.google.protobuf.nano.MessageNano;
import java.lang.StringBuilder;
import uy5.b;
import ar4.b$a;
import com.kuaishou.android.model.mix.SearchSortFeature;
import java.lang.Float;
import com.kuaishou.android.model.mix.CoverCommonTagsModel;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel;
import zf6.k;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$LabelModeStyle;
import java.util.Map;
import sy5.a;
import com.google.gson.JsonObject;
import e7d.h;
import com.yxcorp.plugin.search.SearchPage;
import nfd.r3;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import e7d.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.plugin.search.result.fragment.SearchResultTabFragment;
import x6d.x;
import java.util.HashMap;
import com.yxcorp.plugin.search.b;
import nfd.n2;
import add.g;
import com.yxcorp.plugin.search.result.LayoutStyle;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import gbd.i;
import nfd.r0;
import nfd.a1;
import com.yxcorp.plugin.search.SearchSource;
import java.util.Objects;
import com.google.gson.JsonArray;
import java.util.List;
import com.yxcorp.plugin.search.result.SearchSecondFilter;
import com.google.gson.JsonElement;
import com.yxcorp.plugin.search.entity.SearchFilter;
import wkd.b;
import az5.k;
import az5.i;
import iy5.d;
import q87.c;
import java.util.Set;
import java.util.Iterator;
import java.lang.Long;
import java.lang.Exception;
import ar4.a;
import ekd.s;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import java.lang.Integer;
import nfd.y0;
import com.yxcorp.plugin.search.SearchPreferenceObject;
import java.lang.reflect.Type;
import x6d.a;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.plugin.search.result.CollectionCacheInfo;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserHeadIcon;
import com.kwai.framework.model.user.UserStatus;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import nfd.z0;
import com.kuaishou.android.model.feed.SearchParams;
import nfd.b3;
import com.yxcorp.plugin.search.response.SearchResultResponse;
import com.yxcorp.plugin.search.response.SearchResultExtParams;
import java.lang.System;
import java.util.Calendar;
import java.util.TimeZone;
import com.yxcorp.plugin.search.entity.SearchItem$SearchItemType;
import com.yxcorp.plugin.search.entity.kbox.KBoxRealLog;
import fbd.f;
import com.yxcorp.plugin.search.entity.result.SearchCollectionBase;
import java.lang.Number;
import com.kuaishou.android.model.mix.CoverMeta;
import android.content.Context;
import lnc.a1;
import android.content.res.Resources;
import nfd.g3$b;
import java.lang.Enum;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.mix.TagItem;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.plugin.search.entity.result.SearchCollectionItem;
import com.yxcorp.plugin.search.entity.SearchGroupInfo;
import com.kwai.feature.component.entry.SearchSceneSource;
import com.yxcorp.plugin.search.entity.kbox.KBoxExtParam;
import com.yxcorp.plugin.search.response.SearchCommodityItem;
import com.yxcorp.plugin.search.entity.CommodityLiveStatus;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import android.net.Uri;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import ecd.b;
import ecd.d;

public class g3	// class@001db0
{

    public void g3(){
       super();
    }
    public static void a(KwaiImageView p0,CDNUrl[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, g3.class, "15")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (!j.h(p1)) {
          p0.setVisibility(0);
          a$a uoa = a.d();
          uoa.b(":ks-features:ft-search:search-result");
          uoa.d(ImageSource.FEED_AVATAR);
          p0.Y(p1, uoa.a(), new g3$a(p0));
       }else {
          p0.setVisibility(8);
       }
       return;
    }
    public static boolean b(SearchResultFragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g3.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.Vh() != null && p0.Vh().L0() != null))? true: false;
       return b;
    }
    public static void c(SearchItem p0){
       b uob;
       b$a b;
       if (PatchProxy.applyVoidOneRefs(p0, null, g3.class, "30")) {
          return;
       }
       SearchItem mExtInfo = p0.mExtInfo;
       if (mExtInfo != null && (!TextUtils.x(mExtInfo.mSortFeaturesStr) && q.f(p0.mExtInfo.mSortFeatures))) {
          mExtInfo = p0.mPhoto;
          if (mExtInfo != null) {
             CommonMeta uCommonMeta = r1.w0(mExtInfo.getEntity());
             if (uCommonMeta.mSearchSortFeatures != null) {
                return;
             }else {
                ExtInfo mSortFeature = p0.mExtInfo.mSortFeaturesStr;
                ArrayList uArrayList = new ArrayList();
                try{
                   int i = 2;
                   uob = MessageNano.mergeFrom(new b(), c.a(Base64.decode(mSortFeature, i)));
                }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e2){
                   b.j("pb string convert error "+e2);
                }
                if (uob != null && !j.h(uob.a)) {
                   uob = uob.a;
                   int len = uob.length;
                   int i1 = 0;
                   while (i1 < len) {
                      object oobject = uob[i1];
                      if (oobject == null || (oobject.b != null && !TextUtils.x(oobject.a))) {
                         SearchSortFeature searchSortFe = new SearchSortFeature();
                         searchSortFe.mName = oobject.a;
                         ArrayList uArrayList1 = new ArrayList();
                         b = oobject.b;
                         int len1 = b.length;
                         for (int i2 = 0; i2 < len1; i2 = i2 + 1) {
                            uArrayList1.add(Float.valueOf(b[i2]));
                         }
                         searchSortFe.mValue = uArrayList1;
                         uArrayList.add(searchSortFe);
                      }
                   label_00b1 :
                      i1 = i1 + 1;
                   }
                   p0.mSortFeatures = uArrayList;
                   uCommonMeta.mSearchSortFeatures = uArrayList;
                }
             }
          }
       }
       return;
    }
    public static CDNUrl[] d(CommonMeta p0){
       CommonMeta obj = PatchProxy.applyOneRefs(p0, null, g3.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = p0.mCoverCommonTags;
          if (obj != null) {
             CoverCommonTagsModel mAuthorRelat = obj.mAuthorRelationTag;
             if (mAuthorRelat != null && mAuthorRelat.darkModeStyle != null) {
                CoverCommonTagLabelModel$LabelModeStyle bgImage = (k.d())? p0.mCoverCommonTags.mAuthorRelationTag.darkModeStyle.bgImage: p0.mCoverCommonTags.mAuthorRelationTag.bgImage;
                return bgImage;
             }
          }
       }
       return null;
    }
    public static String e(Map p0){
       a obj = PatchProxy.applyOneRefs(p0, null, g3.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.k();
       if (p0 != null) {
          if (p0.containsKey("params")) {
             Object obj1 = p0.get("params");
             if (obj1 instanceof JsonObject) {
                obj.h(obj1);
             }
             p0.remove("params");
          }
          obj.g(p0);
       }
       return obj.i();
    }
    public static Map f(h p0,boolean p1,SearchPage p2){
       SearchResultTabFragment o1;
       int i1;
       String str;
       int i2;
       int i3;
       r3 or3 = r3.class;
       if (PatchProxy.isSupport(g3.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, null, g3.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null || p0.d() == null) {
          return null;
       }else {
          int i = 0;
          if (p0.d().getParentFragment() instanceof SearchResultTabFragment) {
             SearchResultTabFragment parentFragme = p0.d().getParentFragment();
             o1 = parentFragme.o1;
             i1 = parentFragme.hi().get(p2).d();
          }else {
             o1 = null;
             str = null;
          }
          SearchPage mTabId = p2.mTabId;
          if (mTabId != null) {
             i1 = mTabId;
          }
          HashMap hashMap = new HashMap();
          a uoa = a.k();
          uoa.f("hasSelectedInterest", p1);
          if (o1 != null) {
             b t = o1.t;
             if (t != null) {
                hashMap.put("isShieldBackend", Boolean.valueOf(t));
             label_007d :
                if (!n2.n(p0.d()) && p2 == SearchPage.AGGREGATE) {
                   r3.a(uoa);
                   if (g.d(p0.d())) {
                      uoa.a("layoutStyle", g.a(p0.d()).getValue());
                   }
                }
                if (p0.d() != null && p0.d().getActivity() != null) {
                   JsonObject jsonObject = i.e(p0.d().getActivity());
                   if (jsonObject != null) {
                      uoa.h(jsonObject);
                   }
                }
                uoa.e("kwaiSource", i.f(p0.d().getActivity()));
                if (p0.I() && p0.p()) {
                   SearchPage cOMMODITY = SearchPage.COMMODITY;
                   str = (p2 == cOMMODITY)? p0.z().e(): p0.B().k(true);
                   hashMap.put("filterType", str);
                   if (p2 == cOMMODITY && (p0.m() == SearchSource.FILTER_SECOND || p0.m() == SearchSource.SEARCH_FILTER)) {
                      r0 or0 = p0.z();
                      Objects.requireNonNull(or0);
                      str = PatchProxy.apply(null, or0, r0.class, "17");
                      if (str != PatchProxyResult.class) {
                      }else if(!q.f(or0.c)){
                         JsonArray jsonArray = new JsonArray();
                         i2 = 0;
                         while (i2 < or0.c.size()) {
                            SearchSecondFilter searchSecond = or0.c.get(i2);
                            if (searchSecond != null && searchSecond.mIsSelect != null) {
                               jsonArray.G(searchSecond.deSerialize());
                            }
                            i2 = i2 + 1;
                         }
                         if (jsonArray.size() > 0) {
                            str = jsonArray.toString();
                         }
                      }
                      Map map1 = null;
                      hashMap.put("secondFilter", str);
                   }
                   str = "selectedCityName";
                   uoa.e(str, p0.B().i());
                   a1 l = p0.B().l;
                   String str1 = (l == null)? "": l.mName;
                   uoa.e(str, str1);
                }
                if (p2 == SearchPage.HISTORY_PAGE) {
                   Map map = PatchProxy.apply(null, null, or3, "48");
                   if (map != PatchProxyResult.class) {
                   }else {
                      map = b.a(-1691162587).c();
                      if (q.h(map)) {
                         Object[] objArray = new Object[i];
                         d.C().w("getHistoryPid", "historyData is null", objArray);
                         map = null;
                      }else {
                         long[] olongArray = new long[map.size()];
                         Iterator iterator = map.keySet().iterator();
                         i2 = 0;
                         while (iterator.hasNext()) {
                            String str2 = iterator.next();
                            try{
                               i3 = i2 + 1;
                               olongArray[i2] = Long.parseLong(str2);
                            }catch(java.lang.Exception e8){
                               Object[] objArray1 = new Object[i];
                               d.C().w("getHistoryPid", e8.getMessage(), objArray1);
                            }
                            i2 = i3;
                         }
                         a uoa1 = new a();
                         uoa1.a = olongArray;
                         map = Base64.encodeToString(s.b(MessageNano.toByteArray(uoa1)), 2);
                      }
                   }
                   uoa.e("historyParams", map);
                }
                hashMap.put("disableCorrection", Boolean.valueOf(p0.f().mDisableCorrection));
                if (p0.f().mSugType > null) {
                   hashMap.put("sugType", Integer.valueOf(p0.f().mSugType));
                }
                if (y0.a()) {
                   HashMap hashMap1 = PatchProxy.apply(null, null, or3, "46");
                   if (hashMap1 != PatchProxyResult.class) {
                   }else {
                      hashMap1 = new HashMap(y0.r());
                      HashMap hashMap2 = a.f(SearchPreferenceObject.I);
                      if (hashMap2 != null) {
                         List list = hashMap2.get(QCurrentUser.ME.getId());
                         if (list != null) {
                            for (; i < list.size(); i = i + 1) {
                               hashMap1.put(list.get(i).mCollectionId, list.get(i).mCollectionPhotoId);
                            }
                         }
                      }
                   }
                   hashMap.put("collContinuePlayInfo", hashMap1);
                }
                if (o1 != null && !TextUtils.x(o1.G)) {
                   hashMap.putAll(a.a.h(o1.G, HashMap.class));
                   o1.G = null;
                }
                hashMap.put("params", uoa.j());
                return hashMap;
             }
          }
          uoa.a("searchTabId", i1);
          goto label_007d ;
       }
    }
    public static String g(User p0){
       User obj = PatchProxy.applyOneRefs(p0, null, g3.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = p0.mHeadIcon;
       if (obj != null && !j.h(obj.mHeadIconUrls)) {
          return p0.mHeadIcon.mHeadIconUrls[0].mUrl;
       }
       obj = p0.mUserMood;
       if (obj != null && !q.f(obj.mStaticImageUrls)) {
          return p0.mUserMood.mStaticImageUrls.get(0).mUrl;
       }
       if (!j.h(p0.mPendants)) {
          return p0.mPendants[0].mUrl;
       }
       return null;
    }
    public static List h(SearchItem p0,boolean p1){
       SearchItem obj1;
       g3 og3 = g3.class;
       Object obj = null;
       if (PatchProxy.isSupport(og3)) {
          obj1 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), obj, og3, "4");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (p0 != null) {
          obj1 = p0.mKBoxItem;
          if (obj1 != null) {
             KBoxItem mKBoxFeeds = obj1.mKBoxFeeds;
             if (q.f(mKBoxFeeds)) {
                return obj;
             }else {
                ArrayList uArrayList = new ArrayList(mKBoxFeeds.size());
                int i = 0;
                while (i < mKBoxFeeds.size()) {
                   TemplateBaseFeed templateBase = mKBoxFeeds.get(i);
                   QPhoto qPhoto = z0.c(templateBase);
                   if (qPhoto != null) {
                      uArrayList.add(qPhoto);
                      if (p1) {
                         int i1 = i + 1;
                         SearchParams searchParams = b3.c(p0, g3.j(p0), i1, templateBase);
                         searchParams.mSourceType = z0.b(templateBase);
                         r3.A(qPhoto, searchParams);
                      }
                   }
                   i = i + 1;
                }
                return uArrayList;
             }
          }
       }
       return obj;
    }
    public static boolean i(long p0,SearchResultResponse p1){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g3 og3 = g3.class;
       Object obj = null;
       if (PatchProxy.isSupport(og3)) {
          Object obj1 = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, obj, og3, "28");
          if (obj1 != patchProxyRe) {
             return obj1.booleanValue();
          }
       }
       boolean b = false;
       if (p1 != null) {
          p1 = p1.mExtParams;
          if (p1 != null) {
             SearchResultExtParams mPhotoTimeSh = p1.mPhotoTimeShowType;
             if (mPhotoTimeSh != null) {
                if (mPhotoTimeSh == 1) {
                   SearchResultExtParams mThresholdTi = p1.mThresholdTimeDisplayDayConfig;
                   if (PatchProxy.isSupport(og3)) {
                      Object obj2 = PatchProxy.applyTwoRefs(Long.valueOf(p0), Integer.valueOf(mThresholdTi), obj, og3, "29");
                      if (obj2 != patchProxyRe) {
                         b1 = obj2.booleanValue();
                      }else if(p0 <= 0 || mThresholdTi == null){
                         long l = System.currentTimeMillis();
                         if (p0 - ((l - (((long)Calendar.getInstance().getTimeZone().getRawOffset() + l) % 0x5265c00)) - ((long)mThresholdTi * 0x5265c00)) > 0) {
                            b1 = true;
                         }
                      }
                      b1 = false;
                   }else {
                      goto label_004b ;
                   }
                   if (!b1) {
                   label_007f :
                      return b;
                   }
                }
                if (!y0.o()) {
                   b = true;
                   goto label_007f ;
                }else {
                   goto label_007f ;
                }
             }else {
                goto label_007f ;
             }
          }else {
             goto label_007f ;
          }
       }else {
          goto label_007f ;
       }
    }
    public static String j(SearchItem p0){
       SearchItem obj = PatchProxy.applyOneRefs(p0, null, g3.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.mItemType;
       if (obj == SearchItem$SearchItemType.KBOX) {
          p0 = p0.mRealLog;
          if (p0 != null) {
             return f.a(p0.mSearchItemType);
          }
       }else if(obj != SearchItem$SearchItemType.LIVE_STREAM && (obj == SearchItem$SearchItemType.TYPE_AD_USER_CARD || obj == SearchItem$SearchItemType.TYPE_AD_BRAND_LIVE)){
          return f.a(6);
       }else if(obj == SearchItem$SearchItemType.TYPE_AD_BRAND){
          return f.a(75);
       }
       return "";
    }
    public static int k(SearchCollectionBase p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g3.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 != null && (p0.getFirstPhoto() != null && p0.getFirstPhoto().getCoverMeta() != null)) {
          return p0.getFirstPhoto().getCoverMeta().getColor();
       }
       return a1.c().getResources().getColor(0x7f0619a3);
    }
    public static boolean l(SearchItem p0){
       boolean b;
       SearchItem obj = PatchProxy.applyOneRefs(p0, null, g3.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          obj = p0.mPhoto;
          if (obj != null && (obj.getCommonMeta() != null && (p0.mPhoto.getCommonMeta().mCoverCommonTags != null && (p0.mPhoto.getCommonMeta().mCoverCommonTags.mAuthorRelationTag != null && p0.mPhoto.getCommonMeta().mCoverCommonTags.mAuthorRelationTag.bgImage != null)))) {
             b = true;
          label_0047 :
             return b;
          }
       }
    label_0046 :
       b = false;
       goto label_0047 ;
    }
    public static boolean m(SearchItem p0,h p1){
       boolean b1;
       ExtInfo mRsLines;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g3 og3 = g3.class;
       Object obj = null;
       SearchItem obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, og3, "1");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       obj1 = PatchProxy.applyOneRefs(p0, obj, og3, "2");
       boolean b = false;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else if(p0.mItemType == SearchItem$SearchItemType.LIVE_STREAM && !q.f(p0.mPhotos)){
          b1 = true;
       }else {
          b1 = false;
       }
       if (b1) {
          return true;
       }else {
          obj1 = p0.mItemType;
          if (obj1 != null && obj1.isSearch()) {
             SearchItem obj2 = PatchProxy.applyTwoRefs(p0, p1, obj, og3, "12");
             if (obj2 != patchProxyRe) {
                b = obj2.booleanValue();
             }else {
                String str = "mixFeeds item is not valid";
                switch (g3$b.a[p0.mItemType.ordinal()]){
                    case 1:
                      obj2 = p0.mGroup;
                      if (obj2 == null || TextUtils.x(obj2.mGroupId)) {
                         g3.w(p1, str, p0.mItemType.getTypeValue());
                      }else {
                      label_016d :
                         b = true;
                      }
                      break;
                    case 2:
                    case 3:
                      if (p0.mTag == null) {
                         g3.w(p1, str, p0.mItemType.getTypeValue());
                      }else {
                         goto label_016d ;
                      }
                      break;
                    case 4:
                      if (q.f(p0.mRecoWords)) {
                         g3.w(p1, str, p0.mItemType.getTypeValue());
                      }else {
                         goto label_016d ;
                      }
                      break;
                    case 5:
                    case 6:
                      obj2 = p0.mSearchCollectionItem;
                      if (obj2 == null || q.f(obj2.mFeeds)) {
                         g3.w(p1, str, p0.mItemType.getTypeValue());
                      }else {
                         goto label_016d ;
                      }
                      break;
                    case 7:
                    case 8:
                      if (p0.mUser == null) {
                         g3.w(p1, str, p0.mItemType.getTypeValue());
                      }else {
                         goto label_016d ;
                      }
                      break;
                    case 9:
                    case 11:
                    case 12:
                    case 10:
                      if (p0.mPhoto == null) {
                         g3.w(p1, str, p0.mItemType.getTypeValue());
                      }else {
                         goto label_016d ;
                      }
                      break;
                    case 13:
                      obj2 = p0.mTag;
                      if (obj2 == null) {
                         g3.w(p1, str, p0.mItemType.getTypeValue());
                      }else {
                         TagItem mMusic = obj2.mMusic;
                         if (mMusic == null || TextUtils.x(mMusic.mId)) {
                            g3.w(p1, "mixFeeds item music is null", p0.mItemType.getTypeValue());
                         }else {
                            goto label_016d ;
                         }
                      }
                      break;
                    case 14:
                      g3.w(p1, "magicFace is not support", p0.mItemType.getTypeValue());
                      goto label_016d ;
                      break;
                    case 15:
                      obj2 = p0.mExtInfo;
                      obj2 = (obj2 == null)? 0: obj2.mRsLines;
                      if (q.f(p0.mRelatedSearchItems)) {
                         g3.w(p1, str, p0.mItemType.getTypeValue());
                      }else if(obj2 == null){
                         g3.w(p1, "mixFeeds item extInfo is null", p0.mItemType.getTypeValue());
                      }else {
                         goto label_016d ;
                      }
                      break;
                    case 16:
                      obj2 = p0.mLivePhoto;
                      if (obj2 == null) {
                         g3.w(p1, str, p0.mItemType.getTypeValue());
                      }else if(obj2.mEntity == null){
                         g3.w(p1, "mixFeeds item live is null", p0.mItemType.getTypeValue());
                      }else {
                         goto label_016d ;
                      }
                      break;
                    case 17:
                      obj2 = p0.mPhoto;
                      if (obj2 == null) {
                         g3.w(p1, str, p0.mItemType.getTypeValue());
                      }else if(k.B(obj2) == null){
                         g3.w(p1, "ad data is null", p0.mItemType.getTypeValue());
                      }else {
                         goto label_016d ;
                      }
                      break;
                    default:
                      goto label_016d ;
                }
             }
             return b;
          }else {
             return true;
          }
       }
    }
    public static boolean n(h p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g3.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!p0.I() || (p0.B().t() || p0.B().p()))? true: false;
       return b;
    }
    public static boolean o(SearchItem p0){
       boolean b = (p0 != null && p0.mItemType == SearchItem$SearchItemType.KBOX)? true: false;
       return b;
    }
    public static boolean p(SearchItem p0){
       if (p0 != null) {
          p0 = p0.mTag;
          if (p0 != null) {
             return p0.mIsKaraoke;
          }
       }
       return false;
    }
    public static boolean q(h p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g3.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.l() == SearchSceneSource.PROFILE || p0.l() == SearchSceneSource.MY_PROFILE))? true: false;
       return b;
    }
    public static boolean r(SearchItem p0,SearchItem p1){
       KBoxItem mExtParam;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, g3.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null && p1 != null) {
          SearchItem mKBoxItem = p1.mKBoxItem;
          if (mKBoxItem != null) {
             mExtParam = mKBoxItem.mExtParam;
             if (mExtParam != null && mExtParam.isEnableKboxSlide != null) {
             label_0033 :
                return true;
             }
          }
          mKBoxItem = p0.mKBoxItem;
          if (mKBoxItem != null) {
             mExtParam = mKBoxItem.mExtParam;
             if (mExtParam != null && mExtParam.isEnableKboxSlide != null) {
                goto label_0033 ;
             }
          }
          if (!g3.o(p1) || (g3.o(p0) || (!g3.o(p1) && !g3.o(p0)))) {
             b = true;
          }
       }
    label_004d :
       return b;
    }
    public static boolean s(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g3.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       User mHeadIcon = p0.mHeadIcon;
       mHeadIcon = (mHeadIcon == null || j.h(mHeadIcon.mHeadIconUrls))? 1: 0;
       p0 = p0.mUserMood;
       int i = (p0 == null || q.f(p0.mStaticImageUrls))? 1: 0;
       if (mHeadIcon && !i) {
          b = true;
       }
       return b;
    }
    public static boolean t(KBoxItem p0){
       p0 = p0.mType;
       boolean b = (p0 == 13 || p0 == 18)? true: false;
       return b;
    }
    public static boolean u(h p0,SearchItem p1){
       boolean b = false;
       if (p0 == null || (p1 != null && p1.mItemType == SearchItem$SearchItemType.COMMODITY)) {
          SearchItem mGoods = p1.mGoods;
          if (mGoods != null && (mGoods.mStatus == CommodityLiveStatus.ON_LIVE.mStatus && mGoods.mLivePhoto != null)) {
             b = true;
          }
       }
    label_001d :
       return b;
    }
    public static void v(String p0,KwaiImageView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, g3.class, "20")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       if (TextUtils.x(p0)) {
          p1.setVisibility(8);
       }else {
          d uod = Fresco.newDraweeControllerBuilder().D(Uri.parse(p0));
          uod.q(true);
          p1.setController(uod.e());
          p1.setVisibility(0);
       }
       return;
    }
    public static void w(h p0,String p1,int p2){
       if (PatchProxy.isSupport(g3.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, g3.class, "11")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("itemType", Integer.valueOf(p2));
       if (p0 != null && p0.d() instanceof b) {
          d.b(p0.d(), p1, jsonObject);
       }
       return;
    }
}
