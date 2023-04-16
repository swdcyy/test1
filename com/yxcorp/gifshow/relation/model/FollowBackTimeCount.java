package com.yxcorp.gifshow.relation.model.FollowBackTimeCount;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class FollowBackTimeCount implements Serializable	// class@001934
{
    public final int count;
    public final long lastTime;

    public void FollowBackTimeCount(long p0,int p1){
       super();
       this.lastTime = p0;
       this.count = p1;
    }
    public static FollowBackTimeCount copy$default(FollowBackTimeCount p0,long p1,int p2,int p3,Object p4){
       FollowBackTimeCount lastTime;
       FollowBackTimeCount count;
       if (p3 & 0x01) {
          lastTime = p0.lastTime;
       }
       if (p3 & 0x02) {
          count = p0.count;
       }
       return p0.copy(lastTime, count);
    }
    public final long component1(){
       return this.lastTime;
    }
    public final int component2(){
       return this.count;
    }
    public final FollowBackTimeCount copy(long p0,int p1){
       if (PatchProxy.isSupport(FollowBackTimeCount.class)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Integer.valueOf(p1), this, FollowBackTimeCount.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new FollowBackTimeCount(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof FollowBackTimeCount && (!this.lastTime - p0.lastTime && this.count == p0.count))) {
          return true;
       }
       return false;
    }
    public final int getCount(){
       return this.count;
    }
    public final long getLastTime(){
       return this.lastTime;
    }
    public int hashCode(){
       FollowBackTimeCount obj = PatchProxy.apply(null, this, FollowBackTimeCount.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.lastTime;
       return (((int)(obj ^ (obj >> 32)) * 31) + this.count);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FollowBackTimeCount.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FollowBackTimeCount\(lastTime="+this.lastTime+", count="+this.count+"\)";
    }
}
