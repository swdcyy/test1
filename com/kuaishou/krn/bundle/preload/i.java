package com.kuaishou.krn.bundle.preload.i;
import erd.r;
import java.lang.Object;
import gj0.d;
import com.kuaishou.krn.bundle.preload.KrnReactRootPreloadManager;
import com.kuaishou.krn.bundle.preload.PreloadType;
import java.lang.Enum;

public final class i implements r	// class@000849
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0.preloadType >= PreloadType.RUN_APPLICATION.ordinal())? true: false;
       return b;
    }
}
