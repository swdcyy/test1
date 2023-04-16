package com.vivo.push.model.UPSNotificationMessage;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.util.Map;
import java.lang.StringBuilder;

public class UPSNotificationMessage	// class@00108a
{
    public String mAdClickCheckUrl;
    public int mCompatibleType;
    public String mContent;
    public String mCoverUrl;
    public String mIconUrl;
    public int mIsMacroReplace;
    public long mMsgId;
    public int mNotifyType;
    public Map mParams;
    public String mPurePicUrl;
    public boolean mShowTime;
    public String mSkipContent;
    public int mSkipType;
    public int mTargetType;
    public String mTitle;
    public String mTragetContent;

    public void UPSNotificationMessage(){
       super();
       this.mParams = new HashMap();
    }
    public void clearCoverUrl(){
       this.mIconUrl = "";
    }
    public void clearPurePicUrl(){
       this.mPurePicUrl = "";
    }
    public String getAdClickCheckUrl(){
       return this.mAdClickCheckUrl;
    }
    public int getCompatibleType(){
       return this.mCompatibleType;
    }
    public String getContent(){
       return this.mContent;
    }
    public String getCoverUrl(){
       return this.mCoverUrl;
    }
    public String getIconUrl(){
       return this.mIconUrl;
    }
    public int getIsMacroReplace(){
       return this.mIsMacroReplace;
    }
    public long getMsgId(){
       return this.mMsgId;
    }
    public int getNotifyType(){
       return this.mNotifyType;
    }
    public Map getParams(){
       return this.mParams;
    }
    public String getPurePicUrl(){
       return this.mPurePicUrl;
    }
    public String getSkipContent(){
       return this.mSkipContent;
    }
    public int getSkipType(){
       return this.mSkipType;
    }
    public int getTargetType(){
       return this.mTargetType;
    }
    public String getTitle(){
       return this.mTitle;
    }
    public String getTragetContent(){
       return this.mTragetContent;
    }
    public boolean isMacroReplace(){
       if (this.mIsMacroReplace == true) {
          return true;
       }
       return false;
    }
    public boolean isShowTime(){
       return this.mShowTime;
    }
    public void setAdClickCheckUrl(String p0){
       this.mAdClickCheckUrl = p0;
    }
    public void setCompatibleType(int p0){
       this.mCompatibleType = p0;
    }
    public void setContent(String p0){
       this.mContent = p0;
    }
    public void setCoverUrl(String p0){
       this.mCoverUrl = p0;
    }
    public void setIconUrl(String p0){
       this.mIconUrl = p0;
    }
    public void setIsMacroReplace(int p0){
       this.mIsMacroReplace = p0;
    }
    public void setMsgId(long p0){
       this.mMsgId = p0;
    }
    public void setNotifyType(int p0){
       this.mNotifyType = p0;
    }
    public void setParams(Map p0){
       this.mParams = p0;
    }
    public void setPurePicUrl(String p0){
       this.mPurePicUrl = p0;
    }
    public void setShowTime(boolean p0){
       this.mShowTime = p0;
    }
    public void setSkipContent(String p0){
       this.mSkipContent = p0;
    }
    public void setSkipType(int p0){
       this.mSkipType = p0;
    }
    public void setTargetType(int p0){
       this.mTargetType = p0;
    }
    public void setTitle(String p0){
       this.mTitle = p0;
    }
    public void setTragetContext(String p0){
       this.mTragetContent = p0;
    }
    public String toString(){
       return "UPSNotificationMessage{mTargetType="+this.mTargetType+", mTragetContent=\'"+this.mTragetContent+'''+", mTitle=\'"+this.mTitle+'''+", mContent=\'"+this.mContent+'''+", mNotifyType="+this.mNotifyType+", mPurePicUrl=\'"+this.mPurePicUrl+'''+", mIconUrl=\'"+this.mIconUrl+'''+", mCoverUrl=\'"+this.mCoverUrl+'''+", mSkipContent=\'"+this.mSkipContent+'''+", mSkipType="+this.mSkipType+", mShowTime="+this.mShowTime+", mMsgId="+this.mMsgId+", mParams="+this.mParams+'}';
    }
}
