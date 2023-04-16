package com.kuaishou.pagedy.container.adapter.ComponentTypeList$unRegisterComponent$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import do4.a;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class ComponentTypeList$unRegisterComponent$1 extends Lambda implements l	// class@000a49
{
    public final String $typeName;

    public void ComponentTypeList$unRegisterComponent$1(String p0){
       this.$typeName = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ComponentTypeList$unRegisterComponent$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       return a.g(p0.c(), this.$typeName);
    }
}
