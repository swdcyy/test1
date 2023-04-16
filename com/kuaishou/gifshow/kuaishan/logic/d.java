package com.kuaishou.gifshow.kuaishan.logic.d;
import erd.o;
import java.lang.Object;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.a;

public final class d implements o	// class@001a08
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public Object apply(Object p0){
       List list = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (list != PatchProxyResult.class) {
       }else {
          a.p(p0, "result");
          list = p0.a();
       }
       return list;
    }
}
