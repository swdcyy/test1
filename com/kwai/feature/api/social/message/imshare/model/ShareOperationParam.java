package com.kwai.feature.api.social.message.imshare.model.ShareOperationParam;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.entity.GameInfo;
import com.yxcorp.gifshow.entity.LinkInfo;
import com.yxcorp.gifshow.entity.MultiImageLinkInfo;
import com.kwai.framework.model.user.User;
import com.kwai.feature.api.social.message.imshare.model.ShareGroupInfo;

public class ShareOperationParam implements Serializable	// class@001164
{
    public String mActionUri;
    public String mComment;
    public EmotionInfo mEmotion;
    public BaseFeed mEntity;
    public String mExtraInfo;
    public GameInfo mGameInfo;
    public LinkInfo mLinkInfo;
    public MultiImageLinkInfo mMultiImageLinkInfo;
    public User mQUser;
    public ShareGroupInfo mShareGroupInfo;
    public String mShareId;
    public String mShareUrl;
    public int mSourceType;
    public boolean mStartEventReported;
    public static final long serialVersionUID = 0x10e7d074d929f6e6;

    public void ShareOperationParam(){
       super();
       this.mStartEventReported = true;
    }
    public String getActionUri(){
       return this.mActionUri;
    }
    public BaseFeed getBaseFeed(){
       return this.mEntity;
    }
    public String getComment(){
       return this.mComment;
    }
    public EmotionInfo getEmotion(){
       return this.mEmotion;
    }
    public String getExtraInfo(){
       return this.mExtraInfo;
    }
    public GameInfo getGameInfo(){
       return this.mGameInfo;
    }
    public LinkInfo getLinkInfo(){
       return this.mLinkInfo;
    }
    public MultiImageLinkInfo getMultiImageLinkInfo(){
       return this.mMultiImageLinkInfo;
    }
    public User getQUser(){
       return this.mQUser;
    }
    public ShareGroupInfo getShareGroupInfo(){
       return this.mShareGroupInfo;
    }
    public String getShareId(){
       return this.mShareId;
    }
    public String getShareUrl(){
       return this.mShareUrl;
    }
    public int getSourceType(){
       return this.mSourceType;
    }
    public boolean isStartEventReported(){
       return this.mStartEventReported;
    }
    public void setActionUri(String p0){
       this.mActionUri = p0;
    }
    public void setBaseFeed(BaseFeed p0){
       this.mEntity = p0;
    }
    public void setComment(String p0){
       this.mComment = p0;
    }
    public void setEmotion(EmotionInfo p0){
       this.mEmotion = p0;
    }
    public void setExtraInfo(String p0){
       this.mExtraInfo = p0;
    }
    public void setGameInfo(GameInfo p0){
       this.mGameInfo = p0;
    }
    public void setLinkInfo(LinkInfo p0){
       this.mLinkInfo = p0;
    }
    public void setMultiImageLinkInfo(MultiImageLinkInfo p0){
       this.mMultiImageLinkInfo = p0;
    }
    public void setQUser(User p0){
       this.mQUser = p0;
    }
    public void setShareId(String p0){
       this.mShareId = p0;
    }
    public void setShareUrl(String p0){
       this.mShareUrl = p0;
    }
    public void setSourceType(int p0){
       this.mSourceType = p0;
    }
    public void setStartEventReported(boolean p0){
       this.mStartEventReported = p0;
    }
}
