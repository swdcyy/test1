package com.kwai.sdk.eve.internal.common.utils.TimeRange$elapsed$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.common.utils.TimeRange;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Long;

public final class TimeRange$elapsed$2 extends Lambda implements a	// class@0014ad
{
    public final TimeRange this$0;

    public void TimeRange$elapsed$2(TimeRange p0){
       this.this$0 = p0;
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, TimeRange$elapsed$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (this.this$0.d() - this.this$0.e());
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
