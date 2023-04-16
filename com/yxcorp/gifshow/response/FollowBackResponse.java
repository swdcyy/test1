package com.yxcorp.gifshow.response.FollowBackResponse;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class FollowBackResponse implements Serializable	// class@001b0c
{
    public int timesLeftToday;
    public String tipDetail;

    public void FollowBackResponse(int p0,String p1){
       a.p(p1, "tipDetail");
       super();
       this.timesLeftToday = p0;
       this.tipDetail = p1;
    }
    public static FollowBackResponse copy$default(FollowBackResponse p0,int p1,String p2,int p3,Object p4){
       FollowBackResponse timesLeftTod;
       FollowBackResponse tipDetail;
       if (p3 & 0x01) {
          timesLeftTod = p0.timesLeftToday;
       }
       if (p3 & 0x02) {
          tipDetail = p0.tipDetail;
       }
       return p0.copy(timesLeftTod, tipDetail);
    }
    public final int component1(){
       return this.timesLeftToday;
    }
    public final String component2(){
       return this.tipDetail;
    }
    public final FollowBackResponse copy(int p0,String p1){
       if (PatchProxy.isSupport(FollowBackResponse.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, FollowBackResponse.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "tipDetail");
       return new FollowBackResponse(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowBackResponse.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof FollowBackResponse && (this.timesLeftToday == p0.timesLeftToday && a.g(this.tipDetail, p0.tipDetail)))) {
          return true;
       }
       return false;
    }
    public final int getTimesLeftToday(){
       return this.timesLeftToday;
    }
    public final String getTipDetail(){
       return this.tipDetail;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, FollowBackResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.timesLeftToday * 31;
       FollowBackResponse ttipDetail = this.tipDetail;
       int i1 = (ttipDetail != null)? ttipDetail.hashCode(): 0;
       return (i + i1);
    }
    public final void setTimesLeftToday(int p0){
       this.timesLeftToday = p0;
    }
    public final void setTipDetail(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowBackResponse.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.tipDetail = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FollowBackResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FollowBackResponse\(timesLeftToday="+this.timesLeftToday+", tipDetail="+this.tipDetail+"\)";
    }
}
