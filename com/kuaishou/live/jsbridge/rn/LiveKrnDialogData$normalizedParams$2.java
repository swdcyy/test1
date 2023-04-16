package com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$normalizedParams$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.util.Map;

public final class LiveKrnDialogData$normalizedParams$2 extends Lambda implements a	// class@001d38
{
    public final LiveKrnDialogData this$0;

    public void LiveKrnDialogData$normalizedParams$2(LiveKrnDialogData p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final HashMap invoke(){
       Set obj = PatchProxy.apply(null, this, LiveKrnDialogData$normalizedParams$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.k();
       HashMap hashMap = new HashMap();
       if (obj != null) {
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             String str1 = this.this$0.l(str);
             if (str1 != null) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                str = str.toLowerCase();
                a.o(str, "\(this as java.lang.String\).toLowerCase\(\)");
                hashMap.put(str, str1);
             }
          }
       }
       return hashMap;
    }
}
