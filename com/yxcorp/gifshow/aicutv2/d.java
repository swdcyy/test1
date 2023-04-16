package com.yxcorp.gifshow.aicutv2.d;
import erd.o;
import o69.a;
import java.lang.Object;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import kotlin.jvm.internal.a;

public final class d implements o	// class@0019a5
{
    public final a b;

    public void d(a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Integer integer = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          integer = Integer.valueOf(this.b.p());
       }
       return integer;
    }
}
