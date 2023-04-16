package com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$isValid$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;

public final class LiveKrnDialogData$isValid$2 extends Lambda implements a	// class@001d34
{
    public final LiveKrnDialogData this$0;

    public void LiveKrnDialogData$isValid$2(LiveKrnDialogData p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       LiveKrnDialogData$isValid$2 obj = PatchProxy.apply(null, this, LiveKrnDialogData$isValid$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       obj = (this.this$0.e().length() > 0)? 1: null;
       if (obj) {
          obj = (this.this$0.f().length() > 0)? 1: 0;
          if (obj) {
          label_003a :
             return b;
          }
       }
       b = false;
       goto label_003a ;
    }
}
