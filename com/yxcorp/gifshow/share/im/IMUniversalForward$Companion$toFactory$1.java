package com.yxcorp.gifshow.share.im.IMUniversalForward$Companion$toFactory$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import gic.a;
import mhc.p1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.im.c;

public final class IMUniversalForward$Companion$toFactory$1 extends Lambda implements l	// class@001bba
{
    public final int $action;

    public void IMUniversalForward$Companion$toFactory$1(int p0){
       this.$action = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final p1 invoke(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IMUniversalForward$Companion$toFactory$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new c(p0, this.$action);
    }
}
