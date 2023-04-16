package com.kuaishou.krn.bundle.preload.g;
import erd.r;
import java.lang.Object;
import gj0.d;
import com.kuaishou.krn.bundle.preload.KrnReactRootPreloadManager;
import com.kuaishou.krn.bundle.preload.PreloadType;
import java.lang.Enum;

public final class g implements r	// class@000847
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0.preloadType >= PreloadType.BUNDLE.ordinal())? true: false;
       return b;
    }
}
