package com.kuaishou.live.common.core.component.multipk.model.LiveMultiPkLimitInfo;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveMultiPkLimitInfo implements Serializable	// class@00164b
{
    public final long beginUnixTime;
    public final long endUnixTime;
    public final boolean isLimitNow;
    public List liveMultiPkLimitUserInfoList;
    public final long serverTime;
    public final String subTitle;
    public final String title;

    public void LiveMultiPkLimitInfo(boolean p0,String p1,String p2,List p3,long p4,long p5,long p6){
       a.p(p1, "title");
       a.p(p2, "subTitle");
       super();
       this.isLimitNow = p0;
       this.title = p1;
       this.subTitle = p2;
       this.liveMultiPkLimitUserInfoList = p3;
       this.beginUnixTime = p4;
       this.endUnixTime = p5;
       this.serverTime = p6;
    }
    public static LiveMultiPkLimitInfo copy$default(LiveMultiPkLimitInfo p0,boolean p1,String p2,String p3,List p4,long p5,long p6,long p7,int p8,Object p9){
       LiveMultiPkLimitInfo liveMultiPkL = p0;
       LiveMultiPkLimitInfo isLimitNow = (p8 & 0x01)? liveMultiPkL.isLimitNow: p1;
       LiveMultiPkLimitInfo title = (p8 & 0x02)? liveMultiPkL.title: p2;
       LiveMultiPkLimitInfo subTitle = (p8 & 0x04)? liveMultiPkL.subTitle: p3;
       LiveMultiPkLimitInfo liveMultiPkL1 = (p8 & 0x08)? liveMultiPkL.liveMultiPkLimitUserInfoList: p4;
       LiveMultiPkLimitInfo beginUnixTim = (p8 & 0x10)? liveMultiPkL.beginUnixTime: p5;
       LiveMultiPkLimitInfo endUnixTime = (p8 & 0x20)? liveMultiPkL.endUnixTime: p6;
       LiveMultiPkLimitInfo serverTime = (p8 & 0x40)? liveMultiPkL.serverTime: p7;
       return p0.copy(isLimitNow, title, subTitle, liveMultiPkL1, beginUnixTim, endUnixTime, serverTime);
    }
    public final boolean component1(){
       return this.isLimitNow;
    }
    public final String component2(){
       return this.title;
    }
    public final String component3(){
       return this.subTitle;
    }
    public final List component4(){
       return this.liveMultiPkLimitUserInfoList;
    }
    public final long component5(){
       return this.beginUnixTime;
    }
    public final long component6(){
       return this.endUnixTime;
    }
    public final long component7(){
       return this.serverTime;
    }
    public final LiveMultiPkLimitInfo copy(boolean p0,String p1,String p2,List p3,long p4,long p5,long p6){
       LiveMultiPkLimitInfo obj;
       object oobject = p1;
       object oobject1 = p2;
       if (PatchProxy.isSupport(LiveMultiPkLimitInfo.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),oobject,oobject1,p3,Long.valueOf(p4),Long.valueOf(p5),Long.valueOf(p6)};
          obj = PatchProxy.apply(objArray, this, LiveMultiPkLimitInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p1, "title");
       a.p(oobject1, "subTitle");
       obj = new LiveMultiPkLimitInfo(p0, p1, p2, p3, p4, p5, p6);
       return v12;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkLimitInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveMultiPkLimitInfo && (this.isLimitNow == p0.isLimitNow && (a.g(this.title, p0.title) && (a.g(this.subTitle, p0.subTitle) && (a.g(this.liveMultiPkLimitUserInfoList, p0.liveMultiPkLimitUserInfoList) && (!this.beginUnixTime - p0.beginUnixTime && (!this.endUnixTime - p0.endUnixTime && !this.serverTime - p0.serverTime)))))))) {
          return true;
       }
       return false;
    }
    public final long getBeginUnixTime(){
       return this.beginUnixTime;
    }
    public final long getEndUnixTime(){
       return this.endUnixTime;
    }
    public final List getLiveMultiPkLimitUserInfoList(){
       return this.liveMultiPkLimitUserInfoList;
    }
    public final long getServerTime(){
       return this.serverTime;
    }
    public final String getSubTitle(){
       return this.subTitle;
    }
    public final String getTitle(){
       return this.title;
    }
    public int hashCode(){
       int i;
       LiveMultiPkLimitInfo obj = PatchProxy.apply(null, this, LiveMultiPkLimitInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.isLimitNow;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       LiveMultiPkLimitInfo ttitle = this.title;
       int i1 = 0;
       int i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i = (i + i2) * 31;
       ttitle = this.subTitle;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i = (i + i2) * 31;
       ttitle = this.liveMultiPkLimitUserInfoList;
       if (ttitle != null) {
          i1 = ttitle.hashCode();
       }
       ttitle = this.beginUnixTime;
       ttitle = this.endUnixTime;
       ttitle = this.serverTime;
       return (((((((i + i1) * 31) + (int)(ttitle ^ (ttitle >> 32))) * 31) + (int)(ttitle ^ (ttitle >> 32))) * 31) + (int)(ttitle ^ (ttitle >> 32)));
    }
    public final boolean isLimitNow(){
       return this.isLimitNow;
    }
    public final void setLiveMultiPkLimitUserInfoList(List p0){
       this.liveMultiPkLimitUserInfoList = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkLimitInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveMultiPkLimitInfo\(isLimitNow="+this.isLimitNow+", title="+this.title+", subTitle="+this.subTitle+", liveMultiPkLimitUserInfoList="+this.liveMultiPkLimitUserInfoList+", beginUnixTime="+this.beginUnixTime+", endUnixTime="+this.endUnixTime+", serverTime="+this.serverTime+"\)";
    }
}
