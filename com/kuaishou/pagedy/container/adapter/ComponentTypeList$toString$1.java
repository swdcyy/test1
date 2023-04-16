package com.kuaishou.pagedy.container.adapter.ComponentTypeList$toString$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import do4.a;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class ComponentTypeList$toString$1 extends Lambda implements l	// class@000a48
{
    public static final ComponentTypeList$toString$1 INSTANCE;

    static {
       ComponentTypeList$toString$1.INSTANCE = new ComponentTypeList$toString$1();
    }
    public void ComponentTypeList$toString$1(){
       super(1);
    }
    public final CharSequence invoke(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ComponentTypeList$toString$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return p0.c();
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
