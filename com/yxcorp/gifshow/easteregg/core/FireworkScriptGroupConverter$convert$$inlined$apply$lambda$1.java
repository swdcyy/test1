package com.yxcorp.gifshow.easteregg.core.FireworkScriptGroupConverter$convert$$inlined$apply$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import daa.j;
import android.content.Context;
import rfa.a;
import java.lang.Object;
import daa.i;
import vfa.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import baa.h;
import java.util.Objects;
import baa.h$a;
import baa.f;

public final class FireworkScriptGroupConverter$convert$$inlined$apply$lambda$1 extends Lambda implements l	// class@001acb
{
    public final Context $context$inlined;
    public final a $factory$inlined;
    public final j $pokeGroup$inlined;

    public void FireworkScriptGroupConverter$convert$$inlined$apply$lambda$1(j p0,Context p1,a p2){
       this.$pokeGroup$inlined = p0;
       this.$context$inlined = p1;
       this.$factory$inlined = p2;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final a invoke(i p0){
       h$a a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FireworkScriptGroupConverter$convert$$inlined$apply$lambda$1 obj = PatchProxy.applyOneRefsWithListener(p0, this, FireworkScriptGroupConverter$convert$$inlined$apply$lambda$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "it");
       a = h.a;
       obj = this.$context$inlined;
       FireworkScriptGroupConverter$convert$$inlined$apply$lambda$1 t$factory$in = this.$factory$inlined;
       Objects.requireNonNull(a);
       a uoa = PatchProxy.applyThreeRefs(obj, t$factory$in, p0, a, h$a.class, "1");
       if (uoa != patchProxyRe) {
       }else {
          a.p(obj, "context");
          a.p(t$factory$in, "factory");
          a.p(p0, "poke");
          a uoa1 = (p0 instanceof i)? f.b.b(obj, t$factory$in, p0): null;
          uoa = uoa1;
       }
       PatchProxy.onMethodExit(FireworkScriptGroupConverter$convert$$inlined$apply$lambda$1.class, "1");
       return uoa;
    }
}
