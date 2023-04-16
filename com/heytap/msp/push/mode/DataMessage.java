package com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.mode.BaseMode;
import java.lang.String;
import java.lang.StringBuilder;

public class DataMessage extends BaseMode	// class@000554
{
    public String mAppId;
    public String mAppPackage;
    public String mBalanceTime;
    public String mContent;
    public String mDataExtra;
    public String mDescription;
    public String mDistinctContent;
    public String mEndDate;
    public String mEventId;
    public String mForcedDelivery;
    public String mGlobalId;
    public String mMessageID;
    public int mMessageType;
    public String mMiniProgramPkg;
    public int mMsgCommand;
    public int mNotifyID;
    public String mRule;
    public String mStartDate;
    public String mStatisticsExtra;
    public String mTaskID;
    public String mTimeRanges;
    public String mTitle;

    public void DataMessage(){
       super();
       this.mTaskID = "";
       this.mMiniProgramPkg = "";
    }
    public String getAppId(){
       return this.mAppId;
    }
    public String getAppPackage(){
       return this.mAppPackage;
    }
    public String getBalanceTime(){
       return this.mBalanceTime;
    }
    public String getContent(){
       return this.mContent;
    }
    public String getDataExtra(){
       return this.mDataExtra;
    }
    public String getDescription(){
       return this.mDescription;
    }
    public String getDistinctContent(){
       return this.mDistinctContent;
    }
    public String getEndDate(){
       return this.mEndDate;
    }
    public String getEventId(){
       return this.mEventId;
    }
    public String getForcedDelivery(){
       return this.mForcedDelivery;
    }
    public String getGlobalId(){
       return this.mGlobalId;
    }
    public String getMessageID(){
       return this.mMessageID;
    }
    public int getMessageType(){
       return this.mMessageType;
    }
    public String getMiniProgramPkg(){
       return this.mMiniProgramPkg;
    }
    public int getMsgCommand(){
       return this.mMsgCommand;
    }
    public int getNotifyID(){
       return this.mNotifyID;
    }
    public String getRule(){
       return this.mRule;
    }
    public String getStartDate(){
       return this.mStartDate;
    }
    public String getStatisticsExtra(){
       return this.mStatisticsExtra;
    }
    public String getTaskID(){
       return this.mTaskID;
    }
    public String getTimeRanges(){
       return this.mTimeRanges;
    }
    public String getTitle(){
       return this.mTitle;
    }
    public int getType(){
       return 4103;
    }
    public void setAppId(String p0){
       this.mAppId = p0;
    }
    public void setAppPackage(String p0){
       this.mAppPackage = p0;
    }
    public void setBalanceTime(String p0){
       this.mBalanceTime = p0;
    }
    public void setContent(String p0){
       this.mContent = p0;
    }
    public void setDataExtra(String p0){
       this.mDataExtra = p0;
    }
    public void setDescription(String p0){
       this.mDescription = p0;
    }
    public void setDistinctContent(String p0){
       this.mDistinctContent = p0;
    }
    public void setEndDate(String p0){
       this.mEndDate = p0;
    }
    public void setEventId(String p0){
       this.mEventId = p0;
    }
    public void setForcedDelivery(String p0){
       this.mForcedDelivery = p0;
    }
    public void setGlobalId(String p0){
       this.mGlobalId = p0;
    }
    public void setMessageID(String p0){
       this.mMessageID = p0;
    }
    public void setMessageType(int p0){
       this.mMessageType = p0;
    }
    public void setMiniProgramPkg(String p0){
       this.mMiniProgramPkg = p0;
    }
    public void setMsgCommand(int p0){
       this.mMsgCommand = p0;
    }
    public void setNotifyID(int p0){
       this.mNotifyID = p0;
    }
    public void setRule(String p0){
       this.mRule = p0;
    }
    public void setStartDate(String p0){
       this.mStartDate = p0;
    }
    public void setStatisticsExtra(String p0){
       this.mStatisticsExtra = p0;
    }
    public void setTaskID(int p0){
       this.mTaskID = p0+"";
    }
    public void setTaskID(String p0){
       this.mTaskID = p0;
    }
    public void setTimeRanges(String p0){
       this.mTimeRanges = p0;
    }
    public void setTitle(String p0){
       this.mTitle = p0;
    }
    public String toString(){
       return "DataMessage{mMessageID=\'"+this.mMessageID+'''+"mMessageType=\'"+this.mMessageType+'''+"mAppPackage=\'"+this.mAppPackage+'''+", mTaskID=\'"+this.mTaskID+'''+"mTitle=\'"+this.mTitle+'''+"mNotifyID=\'"+this.mNotifyID+'''+", mContent=\'"+this.mContent+'''+", mGlobalId=\'"+this.mGlobalId+'''+", mBalanceTime=\'"+this.mBalanceTime+'''+", mStartDate=\'"+this.mStartDate+'''+", mEndDate=\'"+this.mEndDate+'''+", mTimeRanges=\'"+this.mTimeRanges+'''+", mRule=\'"+this.mRule+'''+", mForcedDelivery=\'"+this.mForcedDelivery+'''+", mDistinctContent=\'"+this.mDistinctContent+'''+", mAppId=\'"+this.mAppId+'''+'}';
    }
}
