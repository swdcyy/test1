package com.yxcorp.gifshow.activity.share.topic.ShareTopicExtra$Proxy;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicExtra;
import vsd.n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import java.util.Map;

public final class ShareTopicExtra$Proxy implements Serializable	// class@00146b
{
    public final String name;

    public void ShareTopicExtra$Proxy(String p0){
       a.p(p0, "name");
       super();
       this.name = p0;
    }
    public final String getName(){
       return this.name;
    }
    public final Object getValue(ShareTopicExtra p0,n p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ShareTopicExtra$Proxy.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "extra");
       a.p(p1, "property");
       p0 = p0.data.get(this.name);
       if (!p0 instanceof Object) {
          p0 = null;
       }
       return p0;
    }
    public final void setValue(ShareTopicExtra p0,n p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ShareTopicExtra$Proxy.class, "2")) {
          return;
       }
       a.p(p0, "extra");
       a.p(p1, "property");
       p0.data.put(this.name, p2);
       return;
    }
}
