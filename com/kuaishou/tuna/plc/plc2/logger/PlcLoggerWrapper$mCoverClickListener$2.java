package com.kuaishou.tuna.plc.plc2.logger.PlcLoggerWrapper$mCoverClickListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.tuna.plc.plc2.logger.PlcLoggerWrapper;
import java.lang.Object;
import x06.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.tuna.plc.plc2.logger.PlcLoggerWrapper$a;
import com.kuaishou.tuna.plc.plc2.logger.PlcLoggerWrapper$mCoverClickListener$2$a;
import erd.g;

public final class PlcLoggerWrapper$mCoverClickListener$2 extends Lambda implements a	// class@001055
{
    public final PlcLoggerWrapper this$0;

    public void PlcLoggerWrapper$mCoverClickListener$2(PlcLoggerWrapper p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       Object obj = PatchProxy.apply(null, this, PlcLoggerWrapper$mCoverClickListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(PlcLoggerWrapper.h.a(), new PlcLoggerWrapper$mCoverClickListener$2$a(this));
    }
}