package com.kwai.library.push.model.InAppNotification;
import java.io.Serializable;
import com.kwai.library.push.model.InAppNotification$b;
import java.lang.Object;
import android.os.SystemClock;
import com.kwai.library.push.model.InAppNotification$a;
import com.google.gson.JsonObject;
import java.lang.String;
import com.kwai.library.push.channel.bean.DataConf;
import java.lang.CharSequence;
import java.util.Map;
import java.util.List;
import com.kwai.library.push.channel.bean.PRIORITY;
import java.lang.Integer;
import com.kwai.library.push.channel.bean.Shake;
import com.kwai.library.push.channel.bean.Sound;
import com.kwai.library.push.model.PushViewStyle;
import com.kwai.library.push.channel.bean.ViewStyle;
import java.util.Collection;
import ekd.q;
import java.lang.StringBuilder;

public class InAppNotification implements Serializable	// class@0008d4
{
    public JsonObject attach;
    public String back;
    public String bizType;
    public String btnTxt;
    public DataConf conf;
    public CharSequence content;
    public long createTime;
    public int duration;
    public Map extraInfo;
    public String mBtnTargetUrl;
    public boolean mForceShow;
    public boolean mIsFromKlink;
    public List mLeftIcon;
    public List mLivings;
    public String mOnlineStatus;
    public String mSchema;
    public Shake mShake;
    public Sound mSound;
    public ViewStyle mViewStyle;
    public String msgId;
    public String photo;
    public PRIORITY priorityType;
    public PushViewStyle style;
    public String tagTxt;
    public CharSequence title;
    public static final long serialVersionUID = 0x4d1877865558c520;

    public void InAppNotification(InAppNotification$b p0){
       super();
       this.priorityType = p0.a;
       this.style = p0.b;
       this.btnTxt = p0.c;
       this.tagTxt = p0.d;
       this.photo = p0.e;
       this.title = p0.g;
       this.content = p0.h;
       this.mSchema = p0.i;
       this.bizType = p0.j;
       this.mLeftIcon = p0.k;
       this.mLivings = p0.l;
       this.extraInfo = p0.m;
       this.createTime = SystemClock.elapsedRealtimeNanos();
       this.msgId = p0.n;
       this.back = p0.o;
       this.conf = p0.p;
       this.attach = p0.q;
       this.mShake = p0.r;
       this.mSound = p0.s;
       this.mViewStyle = p0.t;
       this.mIsFromKlink = p0.u;
       this.mBtnTargetUrl = p0.f;
       this.mOnlineStatus = p0.v;
       this.mForceShow = p0.w;
    }
    public void InAppNotification(InAppNotification$b p0,InAppNotification$a p1){
       super(p0);
    }
    public JsonObject getAttach(){
       return this.attach;
    }
    public String getBack(){
       return this.back;
    }
    public String getBizType(){
       return this.bizType;
    }
    public String getBtnTargetUrl(){
       return this.mBtnTargetUrl;
    }
    public String getBtnTxt(){
       return this.btnTxt;
    }
    public DataConf getConf(){
       return this.conf;
    }
    public CharSequence getContent(){
       return this.content;
    }
    public long getCreateTime(){
       return this.createTime;
    }
    public int getDuration(){
       return this.duration;
    }
    public Map getExtraInfo(){
       return this.extraInfo;
    }
    public boolean getIsFromKlink(){
       return this.mIsFromKlink;
    }
    public List getLeftIcon(){
       return this.mLeftIcon;
    }
    public List getLivings(){
       return this.mLivings;
    }
    public String getMsgId(){
       return this.msgId;
    }
    public String getOnlineStatus(){
       return this.mOnlineStatus;
    }
    public String getPhoto(){
       return this.photo;
    }
    public PRIORITY getPriorityType(){
       InAppNotification tconf = this.conf;
       if (tconf != null) {
          DataConf priority = tconf.priority;
          if (priority != null) {
             return PRIORITY.getValue(priority.intValue());
          }
       }
       return this.priorityType;
    }
    public Shake getShake(){
       return this.mShake;
    }
    public Sound getSound(){
       return this.mSound;
    }
    public PushViewStyle getStyle(){
       return this.style;
    }
    public String getTagTxt(){
       return this.tagTxt;
    }
    public CharSequence getTitle(){
       return this.title;
    }
    public ViewStyle getViewStyle(){
       return this.mViewStyle;
    }
    public int getViewStyleDefault(){
       InAppNotification tmViewStyle = this.mViewStyle;
       int i = (tmViewStyle == null)? 1: tmViewStyle.mStyle;
       return i;
    }
    public String getmLeftIcon(){
       if (q.f(this.mLeftIcon)) {
          return null;
       }
       return this.mLeftIcon.get(0);
    }
    public String getmSchema(){
       return this.mSchema;
    }
    public boolean isForceShow(){
       return this.mForceShow;
    }
    public void setBtnTxt(String p0){
       this.btnTxt = p0;
    }
    public void setDuration(int p0){
       this.duration = p0;
    }
    public void setPhoto(String p0){
       this.photo = p0;
    }
    public void setPriorityType(PRIORITY p0){
       this.priorityType = p0;
    }
    public void setStyle(PushViewStyle p0){
       this.style = p0;
    }
    public void setTagTxt(String p0){
       this.tagTxt = p0;
    }
    public String toString(){
       return "InAppNotification{priorityType="+this.priorityType+", style="+this.style+", btnTxt=\'"+this.btnTxt+'''+", tagTxt=\'"+this.tagTxt+'''+", photo=\'"+this.photo+'''+", title="+this.title+", content="+this.content+", mSchema=\'"+this.mSchema+'''+", bizType=\'"+this.bizType+'''+", mLeftIcon="+this.mLeftIcon+", extraInfo="+this.extraInfo+", duration="+this.duration+", createTime="+this.createTime+", msgId=\'"+this.msgId+'''+", back=\'"+this.back+'''+", conf="+this.conf+", attach="+this.attach+", mShake="+this.mShake+", mSound="+this.mSound+", mViewStyle="+this.mViewStyle+", mIsFromKlink="+this.mIsFromKlink+", mOnlineStatus="+this.mOnlineStatus+", mForceShow="+this.mForceShow+", mBtnTargetUrl="+this.mBtnTargetUrl+'}';
    }
}
