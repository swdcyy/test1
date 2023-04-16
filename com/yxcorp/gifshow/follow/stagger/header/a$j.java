package com.yxcorp.gifshow.follow.stagger.header.a$j;
import erd.o;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class a$j implements o	// class@0011b5
{
    public static final a$j b;

    static {
       a$j.b = new a$j();
    }
    public void a$j(){
       super();
    }
    public Object apply(Object p0){
       n on = PatchProxy.applyOneRefs(p0, this, a$j.class, "1");
       if (on != PatchProxyResult.class) {
       }else {
          a.p(p0, "event");
          on = p0.b;
       }
       return on;
    }
}
