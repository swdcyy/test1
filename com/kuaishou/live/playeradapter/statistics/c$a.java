package com.kuaishou.live.playeradapter.statistics.c$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class c$a	// class@000d64
{
    public long a;
    public long b;
    public long c;

    public void c$a(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveMemoryInfo{mTotalMemoryKb="+this.a+", mJavaHeapLimitKb="+this.b+", mJavaHeapKb="+this.c+'}';
    }
}
