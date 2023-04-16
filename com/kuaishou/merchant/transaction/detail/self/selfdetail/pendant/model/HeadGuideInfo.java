package com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.HeadGuideInfo;
import java.io.Serializable;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.HeadGuideInfo$a;
import nsd.u;
import java.lang.String;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.BackgroundBoxStyleInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class HeadGuideInfo implements Serializable	// class@000750
{
    public BackgroundBoxStyleInfo mBackgroundBoxStyleInfo;
    public String mEffectUrl;
    public int mHeadInfoType;
    public String mJumpUrl;
    public String mTips;
    public static final HeadGuideInfo$a Companion;
    public static final long serialVersionUID;

    static {
       HeadGuideInfo.Companion = new HeadGuideInfo$a(null);
    }
    public void HeadGuideInfo(){
       super(0, null, null, null, null, 31, null);
    }
    public void HeadGuideInfo(int p0,String p1,String p2,String p3,BackgroundBoxStyleInfo p4){
       super();
       this.mHeadInfoType = p0;
       this.mJumpUrl = p1;
       this.mEffectUrl = p2;
       this.mTips = p3;
       this.mBackgroundBoxStyleInfo = p4;
    }
    public void HeadGuideInfo(int p0,String p1,String p2,String p3,BackgroundBoxStyleInfo p4,int p5,u p6){
       if (p5 & 0x01) {
          p0 = 0;
       }
       String str = "";
       String str1 = (p5 & 0x02)? str: p1;
       String str2 = (p5 & 0x04)? str: p2;
       if (!(p5 & 0x08)) {
          str = p3;
       }
       if (p5 & 0x10) {
          p4 = null;
       }
       super(p0, str1, str2, str, p4);
       return;
    }
    public static HeadGuideInfo copy$default(HeadGuideInfo p0,int p1,String p2,String p3,String p4,BackgroundBoxStyleInfo p5,int p6,Object p7){
       HeadGuideInfo mHeadInfoTyp;
       HeadGuideInfo mJumpUrl;
       HeadGuideInfo mEffectUrl;
       HeadGuideInfo mTips;
       HeadGuideInfo mBackgroundB;
       if (p6 & 0x01) {
          mHeadInfoTyp = p0.mHeadInfoType;
       }
       if (p6 & 0x02) {
          mJumpUrl = p0.mJumpUrl;
       }
       p7 = mJumpUrl;
       if (p6 & 0x04) {
          mEffectUrl = p0.mEffectUrl;
       }
       HeadGuideInfo headGuideInf = mEffectUrl;
       if (p6 & 0x08) {
          mTips = p0.mTips;
       }
       HeadGuideInfo headGuideInf1 = mTips;
       if (p6 & 0x10) {
          mBackgroundB = p0.mBackgroundBoxStyleInfo;
       }
       return p0.copy(mHeadInfoTyp, p7, headGuideInf, headGuideInf1, mBackgroundB);
    }
    public final int component1(){
       return this.mHeadInfoType;
    }
    public final String component2(){
       return this.mJumpUrl;
    }
    public final String component3(){
       return this.mEffectUrl;
    }
    public final String component4(){
       return this.mTips;
    }
    public final BackgroundBoxStyleInfo component5(){
       return this.mBackgroundBoxStyleInfo;
    }
    public final HeadGuideInfo copy(int p0,String p1,String p2,String p3,BackgroundBoxStyleInfo p4){
       Object obj;
       if (PatchProxy.isSupport(HeadGuideInfo.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, HeadGuideInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       HeadGuideInfo headGuideInf = new HeadGuideInfo(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HeadGuideInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof HeadGuideInfo && (this.mHeadInfoType == p0.mHeadInfoType && (a.g(this.mJumpUrl, p0.mJumpUrl) && (a.g(this.mEffectUrl, p0.mEffectUrl) && (a.g(this.mTips, p0.mTips) && a.g(this.mBackgroundBoxStyleInfo, p0.mBackgroundBoxStyleInfo))))))) {
          return true;
       }
       return false;
    }
    public final BackgroundBoxStyleInfo getMBackgroundBoxStyleInfo(){
       return this.mBackgroundBoxStyleInfo;
    }
    public final String getMEffectUrl(){
       return this.mEffectUrl;
    }
    public final int getMHeadInfoType(){
       return this.mHeadInfoType;
    }
    public final String getMJumpUrl(){
       return this.mJumpUrl;
    }
    public final String getMTips(){
       return this.mTips;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, HeadGuideInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.mHeadInfoType * 31;
       HeadGuideInfo tmJumpUrl = this.mJumpUrl;
       int i1 = 0;
       int i2 = (tmJumpUrl != null)? tmJumpUrl.hashCode(): 0;
       i = (i + i2) * 31;
       tmJumpUrl = this.mEffectUrl;
       i2 = (tmJumpUrl != null)? tmJumpUrl.hashCode(): 0;
       i = (i + i2) * 31;
       tmJumpUrl = this.mTips;
       i2 = (tmJumpUrl != null)? tmJumpUrl.hashCode(): 0;
       i = (i + i2) * 31;
       tmJumpUrl = this.mBackgroundBoxStyleInfo;
       if (tmJumpUrl != null) {
          i1 = tmJumpUrl.hashCode();
       }
       return (i + i1);
    }
    public final void setMBackgroundBoxStyleInfo(BackgroundBoxStyleInfo p0){
       this.mBackgroundBoxStyleInfo = p0;
    }
    public final void setMEffectUrl(String p0){
       this.mEffectUrl = p0;
    }
    public final void setMHeadInfoType(int p0){
       this.mHeadInfoType = p0;
    }
    public final void setMJumpUrl(String p0){
       this.mJumpUrl = p0;
    }
    public final void setMTips(String p0){
       this.mTips = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, HeadGuideInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "HeadGuideInfo\(mHeadInfoType="+this.mHeadInfoType+", mJumpUrl="+this.mJumpUrl+", mEffectUrl="+this.mEffectUrl+", mTips="+this.mTips+", mBackgroundBoxStyleInfo="+this.mBackgroundBoxStyleInfo+"\)";
    }
}
