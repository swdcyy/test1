package com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$e;
import erd.o;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import brd.t;

public final class EnhanceFilterViewModel$e implements o	// class@000f7a
{
    public static final EnhanceFilterViewModel$e b;

    static {
       EnhanceFilterViewModel$e.b = new EnhanceFilterViewModel$e();
    }
    public void EnhanceFilterViewModel$e(){
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, EnhanceFilterViewModel$e.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "list");
          ot = t.fromIterable(p0);
       }
       return ot;
    }
}
