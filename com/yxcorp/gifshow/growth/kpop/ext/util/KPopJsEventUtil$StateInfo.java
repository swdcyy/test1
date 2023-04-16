package com.yxcorp.gifshow.growth.kpop.ext.util.KPopJsEventUtil$StateInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KPopJsEventUtil$StateInfo implements Serializable	// class@001416
{
    public final int state;

    public void KPopJsEventUtil$StateInfo(int p0){
       super();
       this.state = p0;
    }
    public static KPopJsEventUtil$StateInfo copy$default(KPopJsEventUtil$StateInfo p0,int p1,int p2,Object p3){
       KPopJsEventUtil$StateInfo state;
       if (p2 & 0x01) {
          state = p0.state;
       }
       return p0.copy(state);
    }
    public final int component1(){
       return this.state;
    }
    public final KPopJsEventUtil$StateInfo copy(int p0){
       if (PatchProxy.isSupport(KPopJsEventUtil$StateInfo.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, KPopJsEventUtil$StateInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new KPopJsEventUtil$StateInfo(p0);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof KPopJsEventUtil$StateInfo && this.state == p0.state)) {
          return true;
       }
       return false;
    }
    public final int getState(){
       return this.state;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, KPopJsEventUtil$StateInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.state;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KPopJsEventUtil$StateInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StateInfo\(state="+this.state+"\)";
    }
}
