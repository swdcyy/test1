package com.kwai.sharelib.a$j;
import erd.r;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class a$j implements r	// class@0016ad
{
    public static final a$j b;

    static {
       a$j.b = new a$j();
    }
    public void a$j(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, a$j.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = p0.booleanValue();
       }
       return b;
    }
}
