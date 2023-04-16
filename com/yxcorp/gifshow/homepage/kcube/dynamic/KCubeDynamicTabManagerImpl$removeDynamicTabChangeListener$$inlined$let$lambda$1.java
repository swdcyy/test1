package com.yxcorp.gifshow.homepage.kcube.dynamic.KCubeDynamicTabManagerImpl$removeDynamicTabChangeListener$$inlined$let$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import cta.c;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KCubeDynamicTabManagerImpl$removeDynamicTabChangeListener$$inlined$let$lambda$1 extends Lambda implements l	// class@00172c
{
    public final c $listener$inlined;

    public void KCubeDynamicTabManagerImpl$removeDynamicTabChangeListener$$inlined$let$lambda$1(c p0){
       this.$listener$inlined = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(WeakReference p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, KCubeDynamicTabManagerImpl$removeDynamicTabChangeListener$$inlined$let$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "ref");
       PatchProxy.onMethodExit(KCubeDynamicTabManagerImpl$removeDynamicTabChangeListener$$inlined$let$lambda$1.class, "1");
       return a.g(p0.get(), this.$listener$inlined);
    }
}
