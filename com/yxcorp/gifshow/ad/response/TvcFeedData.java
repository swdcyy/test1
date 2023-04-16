package com.yxcorp.gifshow.ad.response.TvcFeedData;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.response.TvcFeedData$a;
import nsd.u;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class TvcFeedData implements Serializable	// class@0017ec
{
    public final List feeds;
    public final List liveStreamIdWhiteNames;
    public final List userIdWhiteNames;
    public static final TvcFeedData$a Companion;
    public static final long serialVersionUID;

    static {
       TvcFeedData.Companion = new TvcFeedData$a(null);
    }
    public void TvcFeedData(List p0,List p1,List p2){
       super();
       this.liveStreamIdWhiteNames = p0;
       this.userIdWhiteNames = p1;
       this.feeds = p2;
    }
    public static TvcFeedData copy$default(TvcFeedData p0,List p1,List p2,List p3,int p4,Object p5){
       TvcFeedData liveStreamId;
       TvcFeedData userIdWhiteN;
       TvcFeedData tvcFeedData;
       if (p4 & 0x01) {
          liveStreamId = p0.liveStreamIdWhiteNames;
       }
       if (p4 & 0x02) {
          userIdWhiteN = p0.userIdWhiteNames;
       }
       if (p4 & 0x04) {
          tvcFeedData = p0.feeds;
       }
       return p0.copy(liveStreamId, userIdWhiteN, tvcFeedData);
    }
    public final List component1(){
       return this.liveStreamIdWhiteNames;
    }
    public final List component2(){
       return this.userIdWhiteNames;
    }
    public final List component3(){
       return this.feeds;
    }
    public final TvcFeedData copy(List p0,List p1,List p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, TvcFeedData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TvcFeedData(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TvcFeedData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TvcFeedData && (a.g(this.liveStreamIdWhiteNames, p0.liveStreamIdWhiteNames) && (a.g(this.userIdWhiteNames, p0.userIdWhiteNames) && a.g(this.feeds, p0.feeds))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       TvcFeedData obj = PatchProxy.apply(null, this, TvcFeedData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.liveStreamIdWhiteNames;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       TvcFeedData tuserIdWhite = this.userIdWhiteNames;
       int i2 = (tuserIdWhite != null)? tuserIdWhite.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuserIdWhite = this.feeds;
       if (tuserIdWhite != null) {
          i = tuserIdWhite.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TvcFeedData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TvcFeedData\(liveStreamIdWhiteNames="+this.liveStreamIdWhiteNames+", userIdWhiteNames="+this.userIdWhiteNames+", feeds="+this.feeds+"\)";
    }
}
