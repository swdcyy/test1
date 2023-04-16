package com.yxcorp.gifshow.follow.stagger.header.a$h;
import erd.r;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class a$h implements r	// class@0011b3
{
    public static final a$h b;

    static {
       a$h.b = new a$h();
    }
    public void a$h(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, a$h.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "event");
          b = (p0.d == null && p0.c == null)? true: false;
       }
       return b;
    }
}
