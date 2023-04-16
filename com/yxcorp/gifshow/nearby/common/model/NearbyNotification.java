package com.yxcorp.gifshow.nearby.common.model.NearbyNotification;
import java.io.Serializable;
import com.yxcorp.gifshow.nearby.common.model.NearbyNotification$a;
import nsd.u;
import java.lang.String;
import com.kwai.social.startup.local.model.DarkLightModel;
import java.util.List;
import com.yxcorp.gifshow.nearby.common.model.NearbyNotification$RoamLocationResponse;
import java.lang.Long;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class NearbyNotification implements Serializable	// class@00212b
{
    public String action;
    public boolean b;
    public boolean c;
    public final String mActionUrl;
    public final String mButtonText;
    public final DarkLightModel mButtonTextColor;
    public final String mCloseAction;
    public final String mContent;
    public DarkLightModel mContentImage;
    public final List mFilterBoxParams;
    public final Long mHideTime;
    public final String mId;
    public final DarkLightModel mLeftIconUrl;
    public final String mName;
    public final NearbyNotification$RoamLocationResponse mRoamingLocation;
    public final Long mSwitchIntervalMs;
    public final int mType;
    public final List mUsers;
    public static final NearbyNotification$a Companion;
    public static final long serialVersionUID;

    static {
       NearbyNotification.Companion = new NearbyNotification$a(null);
    }
    public void NearbyNotification(String p0,int p1,String p2,String p3,DarkLightModel p4,String p5,DarkLightModel p6,String p7,String p8,List p9,NearbyNotification$RoamLocationResponse p10,Long p11,DarkLightModel p12,List p13,Long p14){
       int i = this;
       a.p(p0, "mId");
       a.p(p2, "mContent");
       a.p(p3, "mName");
       a.p(p4, "mLeftIconUrl");
       super();
       i.mId = p0;
       i.mType = p1;
       i.mContent = p2;
       i.mName = p3;
       i.mLeftIconUrl = p4;
       i.mButtonText = p5;
       i.mButtonTextColor = p6;
       i.mCloseAction = p7;
       i.mActionUrl = p8;
       i.mFilterBoxParams = p9;
       i.mRoamingLocation = p10;
       i.mHideTime = p11;
       i.mContentImage = p12;
       i.mUsers = p13;
       i.mSwitchIntervalMs = p14;
       i.action = "0";
    }
    public void NearbyNotification(String p0,int p1,String p2,String p3,DarkLightModel p4,String p5,DarkLightModel p6,String p7,String p8,List p9,NearbyNotification$RoamLocationResponse p10,Long p11,DarkLightModel p12,List p13,Long p14,int p15,u p16){
       int i = p15;
       List list = (i & 0x2000)? null: p13;
       Long longx = (i & 0x4000)? null: p14;
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, list, longx);
       return;
    }
    public static NearbyNotification copy$default(NearbyNotification p0,String p1,int p2,String p3,String p4,DarkLightModel p5,String p6,DarkLightModel p7,String p8,String p9,List p10,NearbyNotification$RoamLocationResponse p11,Long p12,DarkLightModel p13,List p14,Long p15,int p16,Object p17){
       NearbyNotification nearbyNotifi = p0;
       int i = p16;
       NearbyNotification mId = (i & 0x01)? nearbyNotifi.mId: p1;
       NearbyNotification mType = (i & 0x02)? nearbyNotifi.mType: p2;
       NearbyNotification mContent = (i & 0x04)? nearbyNotifi.mContent: p3;
       NearbyNotification mName = (i & 0x08)? nearbyNotifi.mName: p4;
       NearbyNotification mLeftIconUrl = (i & 0x10)? nearbyNotifi.mLeftIconUrl: p5;
       NearbyNotification mButtonText = (i & 0x20)? nearbyNotifi.mButtonText: p6;
       NearbyNotification mButtonTextC = (i & 0x40)? nearbyNotifi.mButtonTextColor: p7;
       NearbyNotification mCloseAction = (i & 0x0080)? nearbyNotifi.mCloseAction: p8;
       NearbyNotification mActionUrl = (i & 0x0100)? nearbyNotifi.mActionUrl: p9;
       NearbyNotification mFilterBoxPa = (i & 0x0200)? nearbyNotifi.mFilterBoxParams: p10;
       NearbyNotification mRoamingLoca = (i & 0x0400)? nearbyNotifi.mRoamingLocation: p11;
       NearbyNotification mHideTime = (i & 0x0800)? nearbyNotifi.mHideTime: p12;
       NearbyNotification mContentImag = (i & 0x1000)? nearbyNotifi.mContentImage: p13;
       NearbyNotification mUsers = (i & 0x2000)? nearbyNotifi.mUsers: p14;
       NearbyNotification mSwitchInter = (i & 0x4000)? nearbyNotifi.mSwitchIntervalMs: p15;
       return p0.copy(mId, mType, mContent, mName, mLeftIconUrl, mButtonText, mButtonTextC, mCloseAction, mActionUrl, mFilterBoxPa, mRoamingLoca, mHideTime, mContentImag, mUsers, mSwitchInter);
    }
    public static void getAction$annotations(){
    }
    public final String component1(){
       return this.mId;
    }
    public final List component10(){
       return this.mFilterBoxParams;
    }
    public final NearbyNotification$RoamLocationResponse component11(){
       return this.mRoamingLocation;
    }
    public final Long component12(){
       return this.mHideTime;
    }
    public final DarkLightModel component13(){
       return this.mContentImage;
    }
    public final List component14(){
       return this.mUsers;
    }
    public final Long component15(){
       return this.mSwitchIntervalMs;
    }
    public final int component2(){
       return this.mType;
    }
    public final String component3(){
       return this.mContent;
    }
    public final String component4(){
       return this.mName;
    }
    public final String component6(){
       return this.mButtonText;
    }
    public final String component8(){
       return this.mCloseAction;
    }
    public final String component9(){
       return this.mActionUrl;
    }
    public final NearbyNotification copy(String p0,int p1,String p2,String p3,DarkLightModel p4,String p5,DarkLightModel p6,String p7,String p8,List p9,NearbyNotification$RoamLocationResponse p10,Long p11,DarkLightModel p12,List p13,Long p14){
       NearbyNotification obj;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       if (PatchProxy.isSupport(NearbyNotification.class)) {
          Object[] objArray = new Object[15];
          objArray[0] = oobject;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = oobject1;
          objArray[3] = oobject2;
          objArray[4] = oobject3;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          objArray[11] = p11;
          objArray[12] = p12;
          objArray[13] = p13;
          objArray[14] = p14;
          obj = PatchProxy.apply(objArray, this, NearbyNotification.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "mId");
       a.p(oobject1, "mContent");
       a.p(oobject2, "mName");
       a.p(oobject3, "mLeftIconUrl");
       obj = new NearbyNotification(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14);
       return v16;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NearbyNotification.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof NearbyNotification && (a.g(this.mId, p0.mId) && (this.mType == p0.mType && (a.g(this.mContent, p0.mContent) && (a.g(this.mName, p0.mName) && (a.g(this.mLeftIconUrl, p0.mLeftIconUrl) && (a.g(this.mButtonText, p0.mButtonText) && (a.g(this.mButtonTextColor, p0.mButtonTextColor) && (a.g(this.mCloseAction, p0.mCloseAction) && (a.g(this.mActionUrl, p0.mActionUrl) && (a.g(this.mFilterBoxParams, p0.mFilterBoxParams) && (a.g(this.mRoamingLocation, p0.mRoamingLocation) && (a.g(this.mHideTime, p0.mHideTime) && (a.g(this.mContentImage, p0.mContentImage) && (a.g(this.mUsers, p0.mUsers) && a.g(this.mSwitchIntervalMs, p0.mSwitchIntervalMs))))))))))))))))) {
          return true;
       }
       return false;
    }
    public final String getAction(){
       return this.action;
    }
    public final String getContentImageUrl(){
       Object[] objArray = null;
       NearbyNotification obj = PatchProxy.apply(objArray, this, NearbyNotification.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mContentImage;
       if (obj != null) {
          objArray = obj.getMUrl();
       }
       return objArray;
    }
    public final String getLeftIconUrl(){
       Object obj = PatchProxy.apply(null, this, NearbyNotification.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mLeftIconUrl.getMUrl();
    }
    public final boolean getLogShowed(){
       return this.c;
    }
    public final String getMActionUrl(){
       return this.mActionUrl;
    }
    public final String getMButtonText(){
       return this.mButtonText;
    }
    public final String getMCloseAction(){
       return this.mCloseAction;
    }
    public final String getMContent(){
       return this.mContent;
    }
    public final DarkLightModel getMContentImage(){
       return this.mContentImage;
    }
    public final List getMFilterBoxParams(){
       return this.mFilterBoxParams;
    }
    public final Long getMHideTime(){
       return this.mHideTime;
    }
    public final String getMId(){
       return this.mId;
    }
    public final String getMName(){
       return this.mName;
    }
    public final NearbyNotification$RoamLocationResponse getMRoamingLocation(){
       return this.mRoamingLocation;
    }
    public final Long getMSwitchIntervalMs(){
       return this.mSwitchIntervalMs;
    }
    public final String getMTextBtnColor(){
       Object[] objArray = null;
       NearbyNotification obj = PatchProxy.apply(objArray, this, NearbyNotification.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mButtonTextColor;
       if (obj != null) {
          objArray = obj.getMUrl();
       }
       return objArray;
    }
    public final int getMType(){
       return this.mType;
    }
    public final List getMUsers(){
       return this.mUsers;
    }
    public int hashCode(){
       NearbyNotification obj = PatchProxy.apply(null, this, NearbyNotification.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.mType) * 31;
       NearbyNotification tmContent = this.mContent;
       int i2 = (tmContent != null)? tmContent.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmContent = this.mName;
       i2 = (tmContent != null)? tmContent.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmContent = this.mLeftIconUrl;
       i2 = (tmContent != null)? tmContent.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmContent = this.mButtonText;
       i2 = (tmContent != null)? tmContent.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmContent = this.mButtonTextColor;
       i2 = (tmContent != null)? tmContent.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmContent = this.mCloseAction;
       i2 = (tmContent != null)? tmContent.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmContent = this.mActionUrl;
       i2 = (tmContent != null)? tmContent.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmContent = this.mFilterBoxParams;
       i2 = (tmContent != null)? tmContent.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmContent = this.mRoamingLocation;
       i2 = (tmContent != null)? tmContent.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmContent = this.mHideTime;
       i2 = (tmContent != null)? tmContent.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmContent = this.mContentImage;
       i2 = (tmContent != null)? tmContent.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmContent = this.mUsers;
       i2 = (tmContent != null)? tmContent.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmContent = this.mSwitchIntervalMs;
       if (tmContent != null) {
          i = tmContent.hashCode();
       }
       return (i1 + i);
    }
    public final boolean isLocalCreate(){
       Object obj = PatchProxy.apply(null, this, NearbyNotification.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.g("-1", this.mId);
    }
    public final boolean isShowed(){
       return this.b;
    }
    public final void setAction(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyNotification.class, "5")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.action = p0;
       return;
    }
    public final void setLogShowed(boolean p0){
       this.c = p0;
    }
    public final void setMContentImage(DarkLightModel p0){
       this.mContentImage = p0;
    }
    public final void setShowed(boolean p0){
       this.b = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NearbyNotification.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NearbyNotification\(mId="+this.mId+", mType="+this.mType+", mContent="+this.mContent+", mName="+this.mName+", mLeftIconUrl="+this.mLeftIconUrl+", mButtonText="+this.mButtonText+", mButtonTextColor="+this.mButtonTextColor+", mCloseAction="+this.mCloseAction+", mActionUrl="+this.mActionUrl+", mFilterBoxParams="+this.mFilterBoxParams+", mRoamingLocation="+this.mRoamingLocation+", mHideTime="+this.mHideTime+", mContentImage="+this.mContentImage+", mUsers="+this.mUsers+", mSwitchIntervalMs="+this.mSwitchIntervalMs+"\)";
    }
}
