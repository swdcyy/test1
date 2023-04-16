package com.kwai.sdk.eve.internal.statistics.inference.ProcessorInfo;
import com.kwai.sdk.eve.internal.statistics.inference.ProcessorInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import com.kwai.sdk.eve.internal.statistics.inference.ProcessorInfo$id$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ProcessorInfo	// class@0015bb
{
    public final p a;
    public final String b;
    public final String c;
    public static final ProcessorInfo$a d;

    static {
       ProcessorInfo.d = new ProcessorInfo$a(null);
    }
    public void ProcessorInfo(){
       super(null, null, 3, null);
    }
    public void ProcessorInfo(String p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
       this.a = s.c(new ProcessorInfo$id$2(this));
    }
    public void ProcessorInfo(String p0,String p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = null;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public final String a(){
       return this.c;
    }
    public final String b(){
       Object obj = PatchProxy.apply(null, this, ProcessorInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final String c(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProcessorInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ProcessorInfo && (a.g(this.b, p0.b) && a.g(this.c, p0.c)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       ProcessorInfo obj = PatchProxy.apply(null, this, ProcessorInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       ProcessorInfo tc = this.c;
       if (tc != null) {
          i = tc.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ProcessorInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ProcessorInfo\(resourceId="+this.b+", entry="+this.c+"\)";
    }
}
