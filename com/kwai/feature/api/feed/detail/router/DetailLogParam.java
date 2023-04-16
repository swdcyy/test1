package com.kwai.feature.api.feed.detail.router.DetailLogParam;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.lang.IllegalArgumentException;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Boolean;
import java.util.UUID;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CloneNotSupportedException;
import java.util.Collections;
import com.kuaishou.android.model.feed.SearchParams;
import com.yxcorp.utility.TextUtils;

public final class DetailLogParam implements Serializable, Cloneable	// class@000e9c
{
    public Map mBizParams;
    public Map mPageUrlParamMap;
    public Map mRealShowExtraParamMap;
    public SearchParams mSearchParams;
    public Map mVideoStatUrlParamMap;
    public int recoTabId;
    public static final long serialVersionUID = 0x6d4223805f78ec05;

    public void DetailLogParam(){
       super();
       this.mVideoStatUrlParamMap = new HashMap();
       this.mPageUrlParamMap = new HashMap();
       this.mRealShowExtraParamMap = new HashMap();
       this.recoTabId = -1;
       this.mBizParams = new HashMap();
    }
    public DetailLogParam addBizParam(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DetailLogParam.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          throw new IllegalArgumentException("key can not by null");
       }
       this.mBizParams.put(p0, p1);
       return this;
    }
    public DetailLogParam addBizParams(Map p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailLogParam.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mBizParams.putAll(p0);
       return this;
    }
    public DetailLogParam addPageUrlParam(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DetailLogParam.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          throw new IllegalArgumentException("page url key can not by null");
       }
       this.mPageUrlParamMap.put(p0, p1);
       return this;
    }
    public DetailLogParam addPageUrlParams(Map p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailLogParam.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          this.mPageUrlParamMap.putAll(p0);
       }
       return this;
    }
    public DetailLogParam addRealShowExtraParam(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DetailLogParam.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          throw new IllegalArgumentException("page url key can not by null");
       }
       this.mRealShowExtraParamMap.put(p0, p1);
       return this;
    }
    public DetailLogParam addRealShowExtraParam(Map p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailLogParam.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          this.mRealShowExtraParamMap.putAll(p0);
       }
       return this;
    }
    public DetailLogParam addShowPositionPortrait(){
       Object obj = PatchProxy.apply(null, this, DetailLogParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.addBizParam("show_pos", "PORTRAIT");
       return this;
    }
    public DetailLogParam addSimilarSlideSessionParams(BaseFeed p0,BaseFeed p1,boolean p2){
       String obj;
       if (PatchProxy.isSupport(DetailLogParam.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, DetailLogParam.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = UUID.randomUUID().toString();
       String str = "slide_session_id";
       this.addPageUrlParam(str, obj).addBizParam(str, obj);
       if (p0 != null) {
          str = "slide_first_photo_id";
          this.addPageUrlParam(str, p0.getId()).addBizParam(str, p0.getId());
       }
       if (p1 != null) {
          obj = "upper_recommend_photo_id";
          this.addPageUrlParam(obj, p1.getId()).addBizParam(obj, p1.getId());
       }
       String str1 = "POPUP";
       obj = (p2)? str1: "DETAIL";
       DetailLogParam uDetailLogPa = this.addPageUrlParam("related_recommend_photo_position", obj);
       if (!p2) {
          str1 = "DETAIL";
       }
       uDetailLogPa.addBizParam("related_recommend_photo_position", str1);
       return this;
    }
    public DetailLogParam addSlideSessionParams(BaseFeed p0){
       String obj = PatchProxy.applyOneRefs(p0, this, DetailLogParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = UUID.randomUUID().toString();
       String str = "slide_session_id";
       this.addPageUrlParam(str, obj).addBizParam(str, obj);
       if (p0 != null) {
          this.addPageUrlParam("slide_first_photo_id", p0.getId()).addBizParam("slide_first_photo_id", p0.getId());
       }
       return this;
    }
    public DetailLogParam addVideoStatUrlParam(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DetailLogParam.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          throw new IllegalArgumentException("vse url key can not by null");
       }
       this.mVideoStatUrlParamMap.put(p0, p1);
       return this;
    }
    public void addVideoStatUrlParams(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailLogParam.class, "7")) {
          return;
       }
       if (p0 != null) {
          this.mVideoStatUrlParamMap.putAll(p0);
       }
       return;
    }
    public void buildPageUrlMapStringParam(StringBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailLogParam.class, "8")) {
          return;
       }
       DetailLogParam tmPageUrlPar = this.mPageUrlParamMap;
       if (tmPageUrlPar != null && !tmPageUrlPar.isEmpty()) {
          Iterator iterator = tmPageUrlPar.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             p0+"&"+uEntry.getKey()+"="+uEntry.getValue();
          }
       }
       return;
    }
    public DetailLogParam clone(){
       DetailLogParam obj = PatchProxy.apply(null, this, DetailLogParam.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = super.clone();
          obj.mPageUrlParamMap = this.mPageUrlParamMap.clone();
          obj.mVideoStatUrlParamMap = this.mVideoStatUrlParamMap.clone();
          return obj;
       }catch(java.lang.CloneNotSupportedException e0){
          e0.printStackTrace();
          return v1;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public Map getImmutableBizParams(){
       Object obj = PatchProxy.apply(null, this, DetailLogParam.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableMap(this.mBizParams);
    }
    public Map getImmutablePageUrlParamMap(){
       Object obj = PatchProxy.apply(null, this, DetailLogParam.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableMap(this.mPageUrlParamMap);
    }
    public Map getImmutableRealShowExtraParamMap(){
       Object obj = PatchProxy.apply(null, this, DetailLogParam.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableMap(this.mRealShowExtraParamMap);
    }
    public Map getImmutableVideoStatUrlParamMap(){
       Object obj = PatchProxy.apply(null, this, DetailLogParam.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableMap(this.mVideoStatUrlParamMap);
    }
    public String getPageUrlParam(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailLogParam.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mPageUrlParamMap.get(p0);
    }
    public Map getPageUrlParamMap(){
       return this.mPageUrlParamMap;
    }
    public int getRecoTabId(){
       return this.recoTabId;
    }
    public SearchParams getSearchParams(){
       return this.mSearchParams;
    }
    public String getSlideSessionId(){
       Object obj = PatchProxy.apply(null, this, DetailLogParam.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.k(this.mPageUrlParamMap.get("slide_session_id"));
    }
    public void setRecoTabId(int p0){
       this.recoTabId = p0;
    }
    public DetailLogParam setSchemaInfo(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DetailLogParam.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mPageUrlParamMap.put("h5_page", p0);
       this.mVideoStatUrlParamMap.put("h5_page", p0);
       this.mPageUrlParamMap.put("utm_source", p1);
       this.mVideoStatUrlParamMap.put("utm_source", p1);
       return this;
    }
    public void setSearchParams(SearchParams p0){
       this.mSearchParams = p0;
    }
}
