package com.kwai.sdk.eve.internal.statistics.inference.ProcessorInfo$id$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.statistics.inference.ProcessorInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class ProcessorInfo$id$2 extends Lambda implements a	// class@0015ba
{
    public final ProcessorInfo this$0;

    public void ProcessorInfo$id$2(ProcessorInfo p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       String obj = PatchProxy.apply(null, this, ProcessorInfo$id$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.this$0.c() != null && this.this$0.a() != null) {
          obj = this.this$0.a()+'@'+this.this$0.c();
       }else {
          obj = this.this$0.c();
          if (obj == null) {
             obj = this.this$0.a();
          }
          if (obj == null) {
             obj = "";
          }
       }
       return obj;
    }
}
