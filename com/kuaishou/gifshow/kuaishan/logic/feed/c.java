package com.kuaishou.gifshow.kuaishan.logic.feed.c;
import t36.f$a;
import java.util.List;
import java.lang.Object;
import y80.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class c implements f$a	// class@001a41
{
    public final List a;

    public void c(List p0){
       this.a = p0;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else if(p0 != null){
          c ta = this.a;
          a.o(ta, "it");
          p0.H0(ta);
       }
       return;
    }
}
