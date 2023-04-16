package com.kuaishou.bowl.core.live.ComponentDataSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ComponentDataSource extends Enum	// class@0011a4
{
    public static final ComponentDataSource[] $VALUES;
    public static final ComponentDataSource AFTER_SIGNAL_MATERIAL;
    public static final ComponentDataSource PAGE_INIT_MATERIAL;
    public static final ComponentDataSource SIGNAL;

    static {
       ComponentDataSource uComponentDa = new ComponentDataSource("PAGE_INIT_MATERIAL", 0);
       ComponentDataSource.PAGE_INIT_MATERIAL = uComponentDa;
       ComponentDataSource uComponentDa1 = new ComponentDataSource("SIGNAL", 1);
       ComponentDataSource.SIGNAL = uComponentDa1;
       ComponentDataSource uComponentDa2 = new ComponentDataSource("AFTER_SIGNAL_MATERIAL", 2);
       ComponentDataSource.AFTER_SIGNAL_MATERIAL = uComponentDa2;
       ComponentDataSource[] uComponentDa3 = new ComponentDataSource[]{uComponentDa,uComponentDa1,uComponentDa2};
       ComponentDataSource.$VALUES = uComponentDa3;
    }
    public void ComponentDataSource(String p0,int p1){
       super(p0, p1);
    }
    public static ComponentDataSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ComponentDataSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ComponentDataSource.class, p0);
    }
    public static ComponentDataSource[] values(){
       Object obj = PatchProxy.apply(null, null, ComponentDataSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ComponentDataSource.$VALUES.clone();
    }
}
