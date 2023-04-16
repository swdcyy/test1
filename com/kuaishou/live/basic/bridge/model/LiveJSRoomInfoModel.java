package com.kuaishou.live.basic.bridge.model.LiveJSRoomInfoModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Integer;
import com.yxcorp.gifshow.log.model.FeedLogCtx;

public final class LiveJSRoomInfoModel implements Serializable	// class@000cb3
{
    public String adCallbackParam;
    public String anchorUserId;
    public Integer enterAction;
    public String expTag;
    public String fansTopAttributeParams;
    public FeedLogCtx feedLogCtx;
    public int gameStyle;
    public Boolean isEscrow;
    public Boolean isNormalPlay;
    public String liveStreamId;
    public int multiTab;
    public final int result;
    public int subType;

    public void LiveJSRoomInfoModel(){
       super();
       this.result = 1;
       this.isEscrow = Boolean.FALSE;
    }
    public final String getAdCallbackParam(){
       return this.adCallbackParam;
    }
    public final String getAnchorUserId(){
       return this.anchorUserId;
    }
    public final Integer getEnterAction(){
       return this.enterAction;
    }
    public final String getExpTag(){
       return this.expTag;
    }
    public final String getFansTopAttributeParams(){
       return this.fansTopAttributeParams;
    }
    public final FeedLogCtx getFeedLogCtx(){
       return this.feedLogCtx;
    }
    public final int getGameStyle(){
       return this.gameStyle;
    }
    public final String getLiveStreamId(){
       return this.liveStreamId;
    }
    public final int getMultiTab(){
       return this.multiTab;
    }
    public final int getResult(){
       return this.result;
    }
    public final int getSubType(){
       return this.subType;
    }
    public final Boolean isEscrow(){
       return this.isEscrow;
    }
    public final Boolean isNormalPlay(){
       return this.isNormalPlay;
    }
    public final void setAdCallbackParam(String p0){
       this.adCallbackParam = p0;
    }
    public final void setAnchorUserId(String p0){
       this.anchorUserId = p0;
    }
    public final void setEnterAction(Integer p0){
       this.enterAction = p0;
    }
    public final void setEscrow(Boolean p0){
       this.isEscrow = p0;
    }
    public final void setExpTag(String p0){
       this.expTag = p0;
    }
    public final void setFansTopAttributeParams(String p0){
       this.fansTopAttributeParams = p0;
    }
    public final void setFeedLogCtx(FeedLogCtx p0){
       this.feedLogCtx = p0;
    }
    public final void setGameStyle(int p0){
       this.gameStyle = p0;
    }
    public final void setLiveStreamId(String p0){
       this.liveStreamId = p0;
    }
    public final void setMultiTab(int p0){
       this.multiTab = p0;
    }
    public final void setNormalPlay(Boolean p0){
       this.isNormalPlay = p0;
    }
    public final void setSubType(int p0){
       this.subType = p0;
    }
}
