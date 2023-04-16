package com.yxcorp.gifshow.log.timemachine.FeedOpType$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.log.timemachine.FeedOpType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class FeedOpType$a	// class@001b44
{

    public void FeedOpType$a(){
       super();
    }
    public void FeedOpType$a(u p0){
       super();
    }
    public final FeedOpType a(String p0){
       object oobject;
       FeedOpType[] obj = PatchProxy.applyOneRefs(p0, this, FeedOpType$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "filterType");
       obj = FeedOpType.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return null;
          }
          oobject = obj[i];
          if (a.g(oobject.getFilterType(), p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
}
