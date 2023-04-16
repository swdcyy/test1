package com.kuaishou.protobuf.photo.funnel.Performance$b;
import pr4.i;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.Performance;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.Performance$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.ByteString;

public final class Performance$b extends GeneratedMessageLite$Builder implements i	// class@000e32
{

    public void Performance$b(){
       super(Performance.DEFAULT_INSTANCE);
    }
    public void Performance$b(Performance$a p0){
       super(Performance.DEFAULT_INSTANCE);
    }
    public String getDiskMemory(){
       Object obj = PatchProxy.apply(null, this, Performance$b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getDiskMemory();
    }
    public ByteString getDiskMemoryBytes(){
       Object obj = PatchProxy.apply(null, this, Performance$b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getDiskMemoryBytes();
    }
    public String getMemory(){
       Object obj = PatchProxy.apply(null, this, Performance$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getMemory();
    }
    public ByteString getMemoryBytes(){
       Object obj = PatchProxy.apply(null, this, Performance$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getMemoryBytes();
    }
    public String getThreadCnt(){
       Object obj = PatchProxy.apply(null, this, Performance$b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getThreadCnt();
    }
    public ByteString getThreadCntBytes(){
       Object obj = PatchProxy.apply(null, this, Performance$b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getThreadCntBytes();
    }
    public String getTime(){
       Object obj = PatchProxy.apply(null, this, Performance$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getTime();
    }
    public ByteString getTimeBytes(){
       Object obj = PatchProxy.apply(null, this, Performance$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getTimeBytes();
    }
}
