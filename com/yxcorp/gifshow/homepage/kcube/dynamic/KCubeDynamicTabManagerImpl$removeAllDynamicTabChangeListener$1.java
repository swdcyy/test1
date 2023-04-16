package com.yxcorp.gifshow.homepage.kcube.dynamic.KCubeDynamicTabManagerImpl$removeAllDynamicTabChangeListener$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import cta.a;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KCubeDynamicTabManagerImpl$removeAllDynamicTabChangeListener$1 extends Lambda implements l	// class@00172b
{
    public final a $listener;

    public void KCubeDynamicTabManagerImpl$removeAllDynamicTabChangeListener$1(a p0){
       this.$listener = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(WeakReference p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KCubeDynamicTabManagerImpl$removeAllDynamicTabChangeListener$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "ref");
       return a.g(p0.get(), this.$listener);
    }
}
