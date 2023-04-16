package com.kwaishou.merchant.daccore.data.context.PendantLiveContext;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Integer;
import com.kwaishou.merchant.daccore.data.context.PendantLiveContext$User;
import java.lang.String;

public final class PendantLiveContext implements Serializable	// class@001315
{
    public PendantLiveContext$User author;
    public String cashierParam;
    public String expTag;
    public boolean isAnchor;
    public boolean isAnchorMerchantLive;
    public boolean isProfessionalMerchant;
    public boolean isSlidePlay;
    public String kwaiLinkInfo;
    public String liveCoverUrl;
    public String liveId;
    public String liveStreamId;
    public int liveType;
    public String llsid;
    public String merchantData;
    public String pageId;
    public String pagePath;
    public Integer patternType;
    public String routerSessionId;
    public String serverExpTag;

    public void PendantLiveContext(){
       super();
       this.liveType = -1;
       this.patternType = Integer.valueOf(-1);
    }
    public final PendantLiveContext$User getAuthor(){
       return this.author;
    }
    public final String getCashierParam(){
       return this.cashierParam;
    }
    public final String getExpTag(){
       return this.expTag;
    }
    public final String getKwaiLinkInfo(){
       return this.kwaiLinkInfo;
    }
    public final String getLiveCoverUrl(){
       return this.liveCoverUrl;
    }
    public final String getLiveId(){
       return this.liveId;
    }
    public final String getLiveStreamId(){
       return this.liveStreamId;
    }
    public final int getLiveType(){
       return this.liveType;
    }
    public final String getLlsid(){
       return this.llsid;
    }
    public final String getMerchantData(){
       return this.merchantData;
    }
    public final String getPageId(){
       return this.pageId;
    }
    public final String getPagePath(){
       return this.pagePath;
    }
    public final Integer getPatternType(){
       return this.patternType;
    }
    public final String getRouterSessionId(){
       return this.routerSessionId;
    }
    public final String getServerExpTag(){
       return this.serverExpTag;
    }
    public final boolean isAnchor(){
       return this.isAnchor;
    }
    public final boolean isAnchorMerchantLive(){
       return this.isAnchorMerchantLive;
    }
    public final boolean isProfessionalMerchant(){
       return this.isProfessionalMerchant;
    }
    public final boolean isSlidePlay(){
       return this.isSlidePlay;
    }
    public final void setAnchor(boolean p0){
       this.isAnchor = p0;
    }
    public final void setAnchorMerchantLive(boolean p0){
       this.isAnchorMerchantLive = p0;
    }
    public final void setAuthor(PendantLiveContext$User p0){
       this.author = p0;
    }
    public final void setCashierParam(String p0){
       this.cashierParam = p0;
    }
    public final void setExpTag(String p0){
       this.expTag = p0;
    }
    public final void setKwaiLinkInfo(String p0){
       this.kwaiLinkInfo = p0;
    }
    public final void setLiveCoverUrl(String p0){
       this.liveCoverUrl = p0;
    }
    public final void setLiveId(String p0){
       this.liveId = p0;
    }
    public final void setLiveStreamId(String p0){
       this.liveStreamId = p0;
    }
    public final void setLiveType(int p0){
       this.liveType = p0;
    }
    public final void setLlsid(String p0){
       this.llsid = p0;
    }
    public final void setMerchantData(String p0){
       this.merchantData = p0;
    }
    public final void setPageId(String p0){
       this.pageId = p0;
    }
    public final void setPagePath(String p0){
       this.pagePath = p0;
    }
    public final void setPatternType(Integer p0){
       this.patternType = p0;
    }
    public final void setProfessionalMerchant(boolean p0){
       this.isProfessionalMerchant = p0;
    }
    public final void setRouterSessionId(String p0){
       this.routerSessionId = p0;
    }
    public final void setServerExpTag(String p0){
       this.serverExpTag = p0;
    }
    public final void setSlidePlay(boolean p0){
       this.isSlidePlay = p0;
    }
}
