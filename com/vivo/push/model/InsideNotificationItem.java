package com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.UPSNotificationMessage;
import java.lang.String;

public class InsideNotificationItem extends UPSNotificationMessage	// class@001088
{
    public int mAppType;
    public int mDisplayStyle;
    public int mInnerPriority;
    public boolean mIsShowBigPicOnMobileNet;
    public int mMessageType;
    public int mNotifyDisplayStatus;
    public String mReactPackage;
    public String mSuitReactVersion;

    public void InsideNotificationItem(){
       super();
    }
    public int getAppType(){
       return this.mAppType;
    }
    public int getDisplayStyle(){
       return this.mDisplayStyle;
    }
    public int getInnerPriority(){
       return this.mInnerPriority;
    }
    public int getMessageType(){
       return this.mMessageType;
    }
    public int getNotifyDisplayStatus(){
       return this.mNotifyDisplayStatus;
    }
    public String getReactPackage(){
       return this.mReactPackage;
    }
    public String getSuitReactVersion(){
       return this.mSuitReactVersion;
    }
    public boolean isShowBigPicOnMobileNet(){
       return this.mIsShowBigPicOnMobileNet;
    }
    public final int parsingNotifyStyle(){
       InsideNotificationItem tmDisplaySty = this.mDisplayStyle;
       if (tmDisplaySty & 0x20) {
          return 0;
       }
       if (tmDisplaySty & 0x10) {
          return 1;
       }
       return 0;
    }
    public void setAppType(int p0){
       this.mAppType = p0;
    }
    public void setDisplayStyle(int p0){
       this.mDisplayStyle = p0;
       this.mNotifyDisplayStatus = this.parsingNotifyStyle();
    }
    public void setInnerPriority(int p0){
       this.mInnerPriority = p0;
    }
    public void setIsShowBigPicOnMobileNet(boolean p0){
       this.mIsShowBigPicOnMobileNet = p0;
    }
    public void setMessageType(int p0){
       this.mMessageType = p0;
    }
    public void setReactPackage(String p0){
       this.mReactPackage = p0;
    }
    public void setSuitReactVersion(String p0){
       this.mSuitReactVersion = p0;
    }
}
