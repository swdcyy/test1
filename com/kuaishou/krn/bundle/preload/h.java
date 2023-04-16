package com.kuaishou.krn.bundle.preload.h;
import erd.r;
import java.lang.Object;
import gj0.d;
import com.kuaishou.krn.bundle.preload.KrnReactRootPreloadManager;
import com.kuaishou.krn.bundle.preload.PreloadType;
import java.lang.Enum;

public final class h implements r	// class@000848
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0.preloadType >= PreloadType.GENERATE_CODE_CACHE.ordinal())? true: false;
       return b;
    }
}
