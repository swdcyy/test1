package com.kwai.feature.component.entry.SearchEntryParams;
import java.lang.Object;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Integer;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import java.util.Set;
import java.util.Iterator;
import java.lang.Number;
import java.lang.Character;
import yr4.d$a;
import wkd.b;
import oy5.j;
import android.net.Uri;
import oy5.h;
import ekd.x0;
import com.kwai.feature.component.entry.SearchVerticalParams;
import ekd.w0;
import com.kwai.feature.component.entry.SearchSceneSource;
import com.kwai.feature.component.entry.SearchLandingParams;
import com.yxcorp.gifshow.action.RealActionBizType;
import com.yxcorp.gifshow.action.i;
import yv8.c;
import yv8.a;

public class SearchEntryParams	// class@001206
{
    public Uri mCollectionUri;
    public boolean mEnableSearchHome;
    public boolean mEnableSearchPlaceholder;
    public String mEntrySource;
    public String mExtParamStr;
    public final Bundle mExtParams;
    public int mFromPage;
    public boolean mHasSelectedInterest;
    public boolean mHideTag;
    public String mHomeBaseSessionId;
    public boolean mIsFromUrl;
    public boolean mIsGroupResult;
    public boolean mIsUserResult;
    public SearchLandingParams mLandingParams;
    public String mPhotoId;
    public String mPlaceHolder;
    public String mPlaceHolderKeyWord;
    public String mPlaceHolderSession;
    public String mQuery;
    public String mReferPlayDuration;
    public Uri mSearchKwaiUri;
    public String mSelectTabType;
    public String mSessionId;
    public String mSourceTraces;
    public int mTransition;
    public String mTransitionName;
    public SearchVerticalParams mVerticalParams;

    public void SearchEntryParams(){
       super();
       this.mHideTag = true;
       this.mEnableSearchPlaceholder = true;
       this.mExtParams = new Bundle();
    }
    public static SearchEntryParams Instance(){
       Object obj = PatchProxy.apply(null, null, SearchEntryParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SearchEntryParams();
    }
    public SearchEntryParams authorId(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchEntryParams.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          this.mExtParams.putString("authorId", p0);
       }
       return this;
    }
    public SearchEntryParams clearQuery(){
       this.mQuery = "";
       return this;
    }
    public boolean enableCreateClientTraces(){
       SearchEntryParams obj = PatchProxy.apply(null, this, SearchEntryParams.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mEntrySource;
       if (obj == null) {
          return false;
       }
       if (obj.contains("search_entrance_detail_placeholderKeywordV1") || (!(this.mEntrySource).contains("search_entrance_detail_placeholderBarV1") && !(this.mEntrySource).contains("search_entrance_detail_barV1"))) {
          obj = this.mEntrySource;
          Objects.requireNonNull(obj);
          int i = -1;
          switch (obj.hashCode()){
              case 0xb607f0bf:
                if (obj.equals("search_entrance_nearby_detail")) {
                   i = 0;
                }
                break;
              case 0xe7285eb9:
                if (obj.equals("search_entrance_profile_detail")) {
                   i = 1;
                }
                break;
              case 0xf2b2834d:
                if (obj.equals("search_entrance_follow_detail")) {
                   i = 2;
                }
                break;
              case 0xce78576:
                if (obj.equals("search_entrance_search_detail")) {
                   i = 3;
                }
                break;
              case 0xfa0c3c5:
                if (obj.equals("search_entrance_find_detail")) {
                   i = 4;
                }
                break;
              case 0x1cabef23:
                if (obj.equals("search_entrance_searchbox_bottom_v3")) {
                   i = 5;
                }
                break;
              case 0x2eccd0a1:
                if (obj.equals("search_entrance_thanos_find")) {
                   i = 6;
                }
                break;
              case 0x3a100f36:
                if (obj.equals("search_entrance_hashtag_detail")) {
                   i = 7;
                }
                break;
              case 0x46e19d63:
                if (obj.equals("search_entrance_detail")) {
                   i = 8;
                }
                break;
              case 0x4ad4c0c3:
                if (obj.equals("search_entrance_follow")) {
                   i = 9;
                }
                break;
              case 0x7fdfcaf0:
                if (obj.equals("search_entrance_bottom_featured")) {
                   i = 10;
                }
                break;
              default:
          }
          switch (i){
              case 0:
              case 2:
              case 3:
              case 4:
              case 5:
              case 6:
              case 7:
              case 8:
              case 9:
              case 10:
              case 1:
              default:
                return false;
          }
       }
       return true;
    }
    public SearchEntryParams enableSearchHome(boolean p0){
       this.mEnableSearchHome = p0;
       return this;
    }
    public SearchEntryParams enableSearchPlaceholder(boolean p0){
       this.mEnableSearchPlaceholder = p0;
       return this;
    }
    public SearchEntryParams entrySource(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchEntryParams.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          this.mEntrySource = p0;
       }
       return this;
    }
    public SearchEntryParams extParams(String p0,int p1){
       SearchEntryParams searchEntryP = SearchEntryParams.class;
       if (PatchProxy.isSupport(searchEntryP)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, searchEntryP, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!TextUtils.x(p0)) {
          this.mExtParams.putInt(p0, p1);
       }
       return this;
    }
    public SearchEntryParams extParams(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, SearchEntryParams.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0) && !TextUtils.x(p1)) {
          this.mExtParams.putString(p0, p1);
       }
       return this;
    }
    public String getEntryStyle(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchEntryParams.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return "";
       }
       Objects.requireNonNull(p0);
       if (!p0.equals("search_entrance_searchbox_bottom_v3")) {
          return "";
       }
       return "v3";
    }
    public JsonObject getExtParams(){
       Iterator iterator;
       String str;
       Object obj1;
       Object[] objArray = null;
       SearchEntryParams obj = PatchProxy.apply(objArray, this, SearchEntryParams.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(this.mExtParamStr)) {
          try{
             objArray = new Gson().h(this.mExtParamStr, JsonObject.class);
          }catch(java.lang.Exception e0){
          }
       }
    }
    public d$a getSourceTrace(){
       Object obj = PatchProxy.apply(null, this, SearchEntryParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1585478370).c();
    }
    public boolean isGroupResult(){
       return this.mIsGroupResult;
    }
    public boolean isUserResult(){
       return this.mIsUserResult;
    }
    public boolean isVerticalScene(){
       boolean b = (this.mVerticalParams != null)? true: false;
       return b;
    }
    public SearchEntryParams linkUri(Uri p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, SearchEntryParams.class, "19");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyTwoRefs(this, p0, null, h.class, "1");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          b = false;
          if (p0 != null && !p0.isOpaque()) {
             this.mQuery = h.d(p0);
             this.mFromPage = h.c(p0);
             this.mSessionId = h.f(p0);
             this.mSourceTraces = x0.a(p0, "sourceTraces");
             if (TextUtils.x(this.mEntrySource)) {
                this.mEntrySource = h.a(p0);
             }
             this.mEnableSearchHome = p0.getBooleanQueryParameter("backRecommend", b);
             this.mPlaceHolder = x0.a(p0, "placeholder");
             this.mPlaceHolderKeyWord = x0.a(p0, "placeholderSearchKeyword");
             this.mPlaceHolderSession = x0.a(p0, "placeholderUssid");
             this.mSelectTabType = h.e(p0);
             this.mHasSelectedInterest = p0.getBooleanQueryParameter("hasSelectedInterest", b);
             this.realActionBizType(x0.a(p0, "actionSubType"));
             this.mHideTag = p0.getBooleanQueryParameter("hideTag", true);
             this.mExtParamStr = h.b(p0);
             obj = "taskId";
             String str = x0.a(p0, obj);
             if (!TextUtils.x(str)) {
                this.extParams(obj, str);
             }
             obj = "taskquery";
             str = x0.a(p0, obj);
             if (!TextUtils.x(str)) {
                this.extParams(obj, str);
             }
             if (TextUtils.n(p0.getEncodedPath(), "/vertical")) {
                SearchVerticalParams searchVertic = new SearchVerticalParams();
                searchVertic.mSearchSceneSource = SearchSceneSource.fromString(w0.a(p0, "type"));
                searchVertic.mNeedRequestPreset = p0.getBooleanQueryParameter("needRequestPreset", b);
                searchVertic.mDisableSugPage = p0.getBooleanQueryParameter("disableSug", b);
                if (p0.getBooleanQueryParameter("disableSearchPlaceholder", b)) {
                   this.mEnableSearchPlaceholder = b;
                }
                if (p0.getBooleanQueryParameter("disableHomeReco", b)) {
                   searchVertic.mEnableGuessModule = b;
                }
                this.mVerticalParams = searchVertic;
             }else if(TextUtils.n(p0.getEncodedPath(), "/group")){
                this.mIsGroupResult = true;
             }else if(TextUtils.n(p0.getEncodedPath(), "/user")){
                this.mIsUserResult = true;
             }else if(TextUtils.n(p0.getEncodedPath(), "/playlist") || TextUtils.n(p0.getEncodedPath(), "/billboard")){
                this.mCollectionUri = p0;
             }else if(TextUtils.n(p0.getEncodedPath(), "/landingPage")){
                this.mLandingParams = SearchLandingParams.parserUri(p0);
             }
             b = true;
          }
       }
       if (b) {
          this.mSearchKwaiUri = p0;
          this.mIsFromUrl = true;
       }
       return this;
    }
    public SearchEntryParams linkUrl(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchEntryParams.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          this.linkUri(Uri.parse(p0));
       }
       return this;
    }
    public String overrideEntrySource(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchEntryParams.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return "";
       }
       Objects.requireNonNull(p0);
       if (!p0.equals("search_entrance_searchbox_bottom_v3")) {
          return p0;
       }
       return "search_entrance_searchbox_bottom";
    }
    public SearchEntryParams placeHolder(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchEntryParams.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          this.mPlaceHolder = p0;
          if (TextUtils.x(this.mPlaceHolderKeyWord)) {
             this.mPlaceHolderKeyWord = this.mPlaceHolder;
          }
       }
       return this;
    }
    public SearchEntryParams placeHolderKeyword(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchEntryParams.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          this.mPlaceHolderKeyWord = p0;
       }
       return this;
    }
    public SearchEntryParams placeHolderSession(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchEntryParams.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          this.mPlaceHolderSession = p0;
       }
       return this;
    }
    public SearchEntryParams query(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchEntryParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          this.mQuery = p0;
       }
       return this;
    }
    public SearchEntryParams realActionBizType(String p0){
       object oobject;
       RealActionBizType[] obj = PatchProxy.applyOneRefs(p0, this, SearchEntryParams.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          obj = RealActionBizType.values();
          int len = obj.length;
          int i = 0;
          while (true) {
             if (i < len) {
                oobject = obj[i];
                if ((oobject.bizType()).equals(p0)) {
                label_0030 :
                   if (oobject != null) {
                      this.mExtParams.putString("referLog", b.a(-129117978).g(oobject, null, false));
                      break ;
                   }
                }else {
                   i = i + 1;
                }
             }else {
                oobject = null;
                goto label_0030 ;
             }
          }
       }
       return this;
    }
    public SearchEntryParams referAuthorId(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchEntryParams.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          this.mExtParams.putString("referAuthorId", p0);
       }
       return this;
    }
    public SearchEntryParams referHotWord(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchEntryParams.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          this.mExtParams.putString("referHotWord", p0);
       }
       return this;
    }
    public SearchEntryParams referIsAd(boolean p0){
       SearchEntryParams searchEntryP = SearchEntryParams.class;
       if (PatchProxy.isSupport(searchEntryP)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, searchEntryP, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mExtParams.putBoolean("isAd", p0);
       return this;
    }
    public SearchEntryParams referLiveId(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchEntryParams.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          this.mExtParams.putString("referLiveId", p0);
       }
       return this;
    }
    public SearchEntryParams referPhotoList(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchEntryParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          this.mExtParams.putString("refer_photo_list", p0);
       }
       return this;
    }
    public SearchEntryParams referPlayDuration(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchEntryParams.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          this.mReferPlayDuration = p0;
          this.mExtParams.putString("referPlayDuration", p0);
       }
       return this;
    }
    public SearchEntryParams referVideoId(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchEntryParams.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          this.mExtParams.putString("referVideoId", p0);
       }
       return this;
    }
    public SearchEntryParams selectTabType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchEntryParams.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          this.mSelectTabType = p0;
       }
       return this;
    }
    public SearchEntryParams setSearchFromPage(int p0){
       this.mFromPage = p0;
       return this;
    }
    public SearchEntryParams setSessionId(String p0){
       this.mSessionId = p0;
       return this;
    }
    public SearchEntryParams setVerticalParams(SearchVerticalParams p0){
       this.mVerticalParams = p0;
       return this;
    }
    public SearchEntryParams transition(int p0){
       this.mTransition = p0;
       return this;
    }
    public SearchEntryParams transitionName(String p0){
       this.mTransitionName = p0;
       return this;
    }
}
