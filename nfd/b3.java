package nfd.b3;
import java.lang.Object;
import com.yxcorp.plugin.search.entity.SearchItem;
import java.lang.String;
import com.kuaishou.android.model.feed.SearchParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import com.yxcorp.plugin.search.entity.SearchItem$SearchItemType;
import q7d.d0;
import com.kuaishou.android.model.feed.SearchParams$a;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.search.common.entity.SearchBaseItem;
import java.lang.StringBuilder;
import java.util.List;
import fbd.i;
import fbd.c;
import com.yxcorp.utility.TextUtils;
import java.util.Iterator;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.plugin.search.entity.RelatedSearchItem;
import com.kuaishou.android.model.mix.TagItem;
import com.kwai.framework.model.user.User;
import com.yxcorp.plugin.search.entity.SearchGroupInfo;
import com.yxcorp.plugin.search.entity.SearchItemGroup;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import da6.c;
import com.kuaishou.android.model.feed.VideoFeed;
import com.kuaishou.android.model.feed.ImageFeed;
import nfd.z0;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import com.yxcorp.plugin.search.entity.result.SearchCollectionItem;
import nfd.p1;
import com.yxcorp.plugin.search.entity.ExtInfo;
import com.yxcorp.plugin.search.entity.template.aggregate.CollectionPendant;
import com.kuaishou.android.model.mix.CommonMeta;
import tl8.d;
import qvb.n0;
import qvb.a;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.plugin.search.response.SearchResultResponse;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import com.yxcorp.plugin.search.response.SearchResultExtParams;
import com.yxcorp.plugin.search.entity.SearchFilter;
import com.yxcorp.plugin.search.response.BaseSearchResultResponse;

public final class b3	// class@001d91
{

    public void b3(){
       super();
    }
    public static SearchParams a(SearchItem p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b3.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b3.b(p0, p1, -1);
    }
    public static SearchParams b(SearchItem p0,String p1,int p2){
       if (PatchProxy.isSupport(b3.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, b3.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b3.c(p0, p1, p2, null);
    }
    public static SearchParams c(SearchItem p0,String p1,int p2,TemplateBaseFeed p3){
       SearchItem obj;
       if (PatchProxy.isSupport(b3.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, null, b3.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = "NUM_COLLECTION";
       String str1 = "COLLECTION";
       if (p1.equals("LIVE_STREAM")) {
          obj = p0.mItemType;
          if (obj == SearchItem$SearchItemType.USER) {
             p1 = "ALADDIN_USER_LIVE";
          }else if(obj == SearchItem$SearchItemType.PHOTO){
             p1 = (d0.m(p0))? "IMAGE_ATLAS_LIVE": "PHOTO_LIVE";
          }else if(obj == SearchItem$SearchItemType.TYPE_COLLECTION){
          label_0074 :
             p1 = str1;
          }else if(obj == SearchItem$SearchItemType.TYPE_COLLECTION_PUZZLE){
          label_007a :
             p1 = str;
          }else if(!d0.n(p0)){
             obj = p0.mItemType;
             if (obj != SearchItem$SearchItemType.TYPE_AD_BRAND_LIVE && (obj == SearchItem$SearchItemType.TYPE_AD_USER_CARD || obj == SearchItem$SearchItemType.TYPE_AD_COMMODITY)) {
             label_0091 :
                p1 = "ADVERT";
             }
          }else {
             goto label_0091 ;
          }
       }else if(p1.equals("PHOTO")){
          obj = p0.mItemType;
          if (obj == SearchItem$SearchItemType.TYPE_COLLECTION) {
             goto label_0074 ;
          }else if(obj == SearchItem$SearchItemType.TYPE_COLLECTION_PUZZLE){
             goto label_007a ;
          }else if(obj != SearchItem$SearchItemType.AD_PHOTO && (obj == SearchItem$SearchItemType.TYPE_AD_BRAND || obj == SearchItem$SearchItemType.TYPE_AD_COMMODITY)){
             goto label_0091 ;
          }
       }else if(p1.equals("BRAND_ADVERT")){
          goto label_0091 ;
       }
       SearchParams$a uoa = new SearchParams$a();
       uoa.e(p0.mRank);
       uoa.g(p1);
       uoa.b(p0.mFeedLogCtx);
       TemplateBaseFeed mFeedLogCtx = (p3 != null)? p3.mFeedLogCtx: null;
       uoa.d(mFeedLogCtx);
       uoa.c(p0.getKBoxTemplateName());
       uoa.f(p0.mSessionId);
       return uoa.a();
    }
    public static String d(String p0,int p1){
       b3 uob3 = b3.class;
       if (PatchProxy.isSupport(uob3)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uob3, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return p0+p1;
    }
    public static void e(int p0,List p1,i p2){
       int i;
       int i2;
       QPhoto qPhoto;
       b3 uob3 = b3.class;
       if (PatchProxy.isSupport(uob3) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, b3.class, "1")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       if (!PatchProxy.isSupport(uob3) || (!PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, b3.class, "2") && p1 != null)) {
          Object[] objArray = null;
          String str = PatchProxy.apply(objArray, p2, oi, "3");
          String str1 = "";
          if (str != patchProxyRe) {
          }else {
             i a2 = p2.a;
             str = (a2 == null)? str1: TextUtils.k(a2.getResponseLlsid());
          }
          String str2 = PatchProxy.apply(objArray, p2, oi, "4");
          if (str2 != patchProxyRe) {
          }else {
             i a1 = p2.a;
             str2 = (a1 == null)? str1: TextUtils.k(a1.getResponsePrsid());
          }
          String str3 = PatchProxy.apply(objArray, p2, oi, "5");
          if (str3 != patchProxyRe) {
          }else {
             i a = p2.a;
             if (a != null) {
                str1 = TextUtils.k(a.getResponseUssid());
             }
             str3 = str1;
          }
          String str4 = PatchProxy.apply(objArray, p2, oi, "2");
          if (str4 != patchProxyRe) {
          }else {
             str4 = TextUtils.k(p2.b);
          }
          i c = p2.c;
          p2 = p2.d;
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             SearchItem searchItem = iterator.next();
             searchItem.mSessionId = str3;
             searchItem.mPageName = str4;
             searchItem.mPageIndex = c;
             searchItem.mLLsid = str;
             i = p1.size() + p2;
             searchItem.mLoadedCount = i;
             i = 20;
             int i1 = 0;
             if (!q.f(searchItem.mPhotos)) {
                i2 = 0;
                while (i2 < searchItem.mPhotos.size()) {
                   qPhoto = searchItem.mPhotos.get(i2);
                   i2 = i2 + 1;
                   qPhoto.setPosition(i2);
                   qPhoto.setSource(i);
                   qPhoto.setSearchSessionId(str3);
                   qPhoto.setListLoadSequenceID(str);
                   qPhoto.setSearchUssid(str3);
                }
             }
             if (!q.f(searchItem.mFeeds)) {
                i2 = 0;
                while (i2 < searchItem.mFeeds.size()) {
                   qPhoto = searchItem.mFeeds.get(i2);
                   i2 = i2 + 1;
                   qPhoto.setPosition(i2);
                   qPhoto.setSource(i);
                   qPhoto.setSearchSessionId(str3);
                   qPhoto.setListLoadSequenceID(str);
                   qPhoto.setSearchUssid(str3);
                }
             }
             if (!q.f(searchItem.mRelatedSearchItems)) {
                i2 = 0;
                while (i2 < searchItem.mRelatedSearchItems.size()) {
                   RelatedSearchItem relatedSearc = searchItem.mRelatedSearchItems.get(i2);
                   i2 = i2 + 1;
                   relatedSearc.mPosition = i2;
                   relatedSearc.mSessionId = str3;
                }
             }
             SearchItem mPhoto = searchItem.mPhoto;
             if (mPhoto != null) {
                mPhoto.setPosition(searchItem.mPosition);
                searchItem.mPhoto.setSource(i);
                searchItem.mPhoto.setSearchSessionId(str3);
                searchItem.mPhoto.setListLoadSequenceID(str);
                searchItem.mPhoto.setSearchUssid(str3);
             }
             SearchItem mTag = searchItem.mTag;
             if (mTag != null) {
                mTag.mViewAdapterPosition = searchItem.mPosition;
                mTag.setPhotoLlsid(str);
                searchItem.mTag.setSearchUssid(str3);
             }
             mTag = searchItem.mUser;
             if (mTag != null) {
                mTag.mPosition = searchItem.mPosition;
                mTag.mLlsid = str;
                mTag.mSearchUssid = str3;
                mTag.mPrsid = str2;
             }
             mTag = searchItem.mGroup;
             if (mTag != null) {
                mTag.mPosition = searchItem.mPosition;
                mTag.mLlsid = str;
                mTag.mPrsid = str2;
             }
             if (searchItem instanceof SearchItemGroup) {
                mTag = searchItem;
                if (!q.f(mTag.mSearchGroup)) {
                   i2 = 0;
                   while (i2 < mTag.mSearchGroup.size()) {
                      SearchItem searchItem1 = mTag.mSearchGroup.get(i2);
                      searchItem1.mSessionId = searchItem.mSessionId;
                      searchItem1.mKeywordContext = searchItem.mKeywordContext;
                      i2 = i2 + 1;
                      searchItem1.mPosition = i2;
                   }
                }
             }
             mTag = searchItem.mPhoto;
             if (mTag != null) {
                String str5 = "SEARCH_PARAMS";
                if (mTag.isLiveStream()) {
                   searchItem.mPhoto.mEntity.putExtra(str5, b3.a(searchItem, "LIVE_STREAM"));
                }else if(searchItem.mPhoto.isVideoType()){
                   searchItem.mPhoto.mEntity.putExtra(str5, b3.a(searchItem, "PHOTO"));
                }else if(searchItem.mPhoto.isImageType()){
                   searchItem.mPhoto.mEntity.putExtra(str5, b3.a(searchItem, "IMAGE_ATLAS"));
                }
             }
             if (!q.f(searchItem.mTemplateFeeds)) {
                i = searchItem.mTemplateFeeds.size();
                i2 = 0;
                while (i2 < i) {
                   qPhoto = z0.c(searchItem.mTemplateFeeds.get(i2));
                   if (qPhoto != null) {
                      qPhoto.setSearchSessionId(str3);
                      qPhoto.setListLoadSequenceID(str);
                      qPhoto.setSearchUssid(str3);
                   }
                   i2 = i2 + 1;
                }
             }
             mTag = searchItem.mKBoxItem;
             if (mTag != null && !q.f(mTag.mKBoxFeeds)) {
                i = searchItem.mKBoxItem.mKBoxFeeds.size();
                while (i1 < i) {
                   QPhoto qPhoto1 = z0.c(searchItem.mKBoxItem.mKBoxFeeds.get(i1));
                   if (qPhoto1 != null) {
                      qPhoto1.setSearchSessionId(str3);
                      qPhoto1.setListLoadSequenceID(str);
                      qPhoto1.setSearchUssid(str3);
                      qPhoto1.setPosition(i1);
                   }
                   i1 = i1 + 1;
                }
             }
             mTag = searchItem.mSearchCollectionItem;
             if (mTag != null) {
                mTag.bindItemPosition(searchItem.mPosition);
                searchItem.mSearchCollectionItem.bindPhotoInfo();
             }
             if (p1.a(searchItem)) {
                searchItem.mExtInfo.mCollectionPendant.mSearchCollectionItem.bindItemPosition(searchItem.mPosition);
             }
             if (searchItem.mPhoto != null && searchItem.isAd()) {
                searchItem.mPhoto.mEntity.a(CommonMeta.class).mFeedLogCtx = searchItem.mFeedLogCtx;
             }
          }
       }
       return;
    }
    public static SearchItem f(n0 p0){
       SearchItem searchItem;
       Object obj = PatchProxy.applyOneRefs(p0, null, b3.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.K()) {
          return null;
       }
       List items = p0.getItems();
       if (q.f(items)) {
          return null;
       }
       int i = items.size();
       while (true) {
          i = i - 1;
          if (i < 0) {
             return null;
          }
          searchItem = items.get(i);
          if (searchItem.mPosition > null) {
             break ;
          }
       }
       return searchItem;
    }
    public static String g(SearchItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b3.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b3.d(p0.getId(), p0.mItemType.getTypeValue());
    }
    public static String h(SearchItem p0,boolean p1){
       SearchItem obj;
       String str;
       b3 uob3 = b3.class;
       if (PatchProxy.isSupport(uob3)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uob3, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = p0.mPhoto;
       if (obj != null && obj.isLiveStream()) {
          obj = p0.mPhoto;
          if (obj != null && !q.f(obj.getLiveDisplayDistrictRank())) {
             str = p0.mPhoto.getLiveDisplayDistrictRank().get(0);
          label_0042 :
             if (TextUtils.x(str) || p1) {
                SearchItem mExtInfo = p0.mExtInfo;
                if (mExtInfo != null && !TextUtils.x(mExtInfo.mSearchRecoReason)) {
                   str = p0.mExtInfo.mSearchRecoReason;
                }
             }
             return str;
          }
       }
       str = "";
       goto label_0042 ;
    }
    public static void i(SearchResultResponse p0,SearchKeywordContext p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b3.class, "18")) {
          return;
       }
       SearchResultResponse mExtParams = p0.mExtParams;
       if (mExtParams != null && !q.f(mExtParams.mFilterConfigList)) {
          SearchResultExtParams mFilterConfi = p0.mExtParams.mFilterConfigList;
          int i = 0;
          while (i < mFilterConfi.size()) {
             if (!q.f(mFilterConfi.get(i))) {
                int i1 = 0;
                while (i1 < mFilterConfi.get(i).size()) {
                   SearchFilter searchFilter = mFilterConfi.get(i).get(i1);
                   int i2 = i1 + 1;
                   searchFilter.mPosition = i2;
                   searchFilter.mSessionId = p0.mUssid;
                   searchFilter.mKeywordContext = p1;
                   searchFilter.mRequestId = p0.mRequestId;
                   if (!i1) {
                      searchFilter.mIsSelect = true;
                   }
                   i1 = i2;
                }
             }
             i = i + 1;
          }
       }
       return;
    }
}
