package com.yxcorp.gifshow.v3.framework.post.TimeUpdateConfig;
import com.yxcorp.gifshow.v3.framework.post.TimeUpdateConfig$Companion;
import nsd.u;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class TimeUpdateConfig	// class@00153a
{
    public final int a;
    public final a b;
    public static final TimeUpdateConfig$Companion c;

    static {
       TimeUpdateConfig.c = new TimeUpdateConfig$Companion(null);
    }
    public void TimeUpdateConfig(int p0,a p1){
       a.p(p1, "funcOnTimeUpdate");
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeUpdateConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TimeUpdateConfig && (this.a == p0.a && a.g(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, TimeUpdateConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.a * 31;
       TimeUpdateConfig tb = this.b;
       int i1 = (tb != null)? tb.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TimeUpdateConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TimeUpdateConfig\(interval="+this.a+", funcOnTimeUpdate="+this.b+"\)";
    }
}
