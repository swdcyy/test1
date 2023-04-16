package com.yxcorp.gifshow.aicutv2.n;
import erd.o;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class n implements o	// class@0019b3
{
    public final VideoTemplate b;

    public void n(VideoTemplate p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       n on = PatchProxy.applyOneRefs(p0, this, n.class, "1");
       if (on != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          on = this.b;
       }
       return on;
    }
}
