package com.yxcorp.gifshow.follow.stagger.header.a$l;
import erd.r;
import java.lang.Object;
import dha.l$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class a$l implements r	// class@0011b7
{
    public static final a$l b;

    static {
       a$l.b = new a$l();
    }
    public void a$l(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, a$l.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = p0.b();
       }
       return b;
    }
}
