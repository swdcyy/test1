package com.kuaishou.merchant.transaction.detail.self.uitimer.UiTimerInfo;
import java.io.Serializable;
import com.kuaishou.merchant.transaction.detail.self.uitimer.UiTimerInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class UiTimerInfo implements Serializable	// class@00076b
{
    public final String mContent;
    public final long mEndTime;
    public final String mLinkDesc;
    public final String mLinkUrl;
    public final long mStartTime;
    public final int mType;
    public static final UiTimerInfo$a Companion;
    public static final long serialVersionUID;

    static {
       UiTimerInfo.Companion = new UiTimerInfo$a(null);
    }
    public void UiTimerInfo(long p0,long p1,int p2,String p3,String p4,String p5){
       super();
       this.mStartTime = p0;
       this.mEndTime = p1;
       this.mType = p2;
       this.mContent = p3;
       this.mLinkDesc = p4;
       this.mLinkUrl = p5;
    }
    public void UiTimerInfo(long p0,long p1,int p2,String p3,String p4,String p5,int p6,u p7){
       String str = (p6 & 0x08)? "": p3;
       String str1 = (p6 & 0x10)? "": p4;
       String str2 = (p6 & 0x20)? "": p5;
       super(p0, p1, p2, str, str1, str2);
       return;
    }
    public static UiTimerInfo copy$default(UiTimerInfo p0,long p1,long p2,int p3,String p4,String p5,String p6,int p7,Object p8){
       UiTimerInfo uiTimerInfo = p0;
       UiTimerInfo mStartTime = (p7 & 0x01)? uiTimerInfo.mStartTime: p1;
       UiTimerInfo mEndTime = (p7 & 0x02)? uiTimerInfo.mEndTime: p2;
       UiTimerInfo mType = (p7 & 0x04)? uiTimerInfo.mType: p3;
       UiTimerInfo mContent = (p7 & 0x08)? uiTimerInfo.mContent: p4;
       UiTimerInfo mLinkDesc = (p7 & 0x10)? uiTimerInfo.mLinkDesc: p5;
       UiTimerInfo mLinkUrl = (p7 & 0x20)? uiTimerInfo.mLinkUrl: p6;
       return p0.copy(mStartTime, mEndTime, mType, mContent, mLinkDesc, mLinkUrl);
    }
    public final long component1(){
       return this.mStartTime;
    }
    public final long component2(){
       return this.mEndTime;
    }
    public final int component3(){
       return this.mType;
    }
    public final String component4(){
       return this.mContent;
    }
    public final String component5(){
       return this.mLinkDesc;
    }
    public final String component6(){
       return this.mLinkUrl;
    }
    public final UiTimerInfo copy(long p0,long p1,int p2,String p3,String p4,String p5){
       Object obj;
       if (PatchProxy.isSupport(UiTimerInfo.class)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),Long.valueOf(p1),Integer.valueOf(p2),p3,p4,p5};
          obj = PatchProxy.apply(objArray, this, UiTimerInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       UiTimerInfo uiTimerInfo = new UiTimerInfo(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UiTimerInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UiTimerInfo && (!this.mStartTime - p0.mStartTime && (!this.mEndTime - p0.mEndTime && (this.mType == p0.mType && (a.g(this.mContent, p0.mContent) && (a.g(this.mLinkDesc, p0.mLinkDesc) && a.g(this.mLinkUrl, p0.mLinkUrl)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       UiTimerInfo obj = PatchProxy.apply(null, this, UiTimerInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mStartTime;
       UiTimerInfo tmEndTime = this.mEndTime;
       int i = (((((int)(obj ^ (obj >> 32)) * 31) + (int)(tmEndTime ^ (tmEndTime >> 32))) * 31) + this.mType) * 31;
       obj = this.mContent;
       int i1 = 0;
       int i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.mLinkDesc;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.mLinkUrl;
       if (obj != null) {
          i1 = obj.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UiTimerInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UiTimerInfo\(mStartTime="+this.mStartTime+", mEndTime="+this.mEndTime+", mType="+this.mType+", mContent="+this.mContent+", mLinkDesc="+this.mLinkDesc+", mLinkUrl="+this.mLinkUrl+"\)";
    }
}
