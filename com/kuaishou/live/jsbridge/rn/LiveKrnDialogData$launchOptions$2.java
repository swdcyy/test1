package com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$launchOptions$2;
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
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kuaishou.live.jsbridge.rn.LiveKrnContainerParams;
import java.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.a;
import java.util.Map;

public final class LiveKrnDialogData$launchOptions$2 extends Lambda implements a	// class@001d35
{
    public final LiveKrnDialogData this$0;

    public void LiveKrnDialogData$launchOptions$2(LiveKrnDialogData p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final HashMap invoke(){
       Object[] objArray = null;
       Set obj = PatchProxy.apply(objArray, this, LiveKrnDialogData$launchOptions$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.k();
       if (obj != null) {
          objArray = CollectionsKt___CollectionsKt.K5(obj);
       }
       HashMap hashMap = new HashMap();
       if (objArray != null) {
          Objects.requireNonNull(LiveKrnContainerParams.Companion);
          Set allParamName = LiveKrnContainerParams.allParamNames;
          Objects.requireNonNull(allParamName, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
          objArray.removeAll(allParamName);
          Iterator iterator = objArray.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
             String str1 = str.toLowerCase();
             a.o(str1, "\(this as java.lang.String\).toLowerCase\(\)");
             if (allParamName.contains(str1)) {
                continue ;
             }else {
                str1 = this.this$0.l(str);
                if (str1 != null) {
                   hashMap.put(str, str1);
                }
             }
          }
       }
       return hashMap;
    }
}
