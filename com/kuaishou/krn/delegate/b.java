package com.kuaishou.krn.delegate.b;
import java.util.concurrent.Callable;
import java.lang.Object;
import com.kuaishou.krn.delegate.KrnDelegate;
import com.kuaishou.krn.KrnInternalManager;
import kj0.f;
import xj0.e;
import com.kuaishou.krn.library.KdsPluginLibraryType;

public final class b implements Callable	// class@00085a
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object call(){
       KdsPluginLibraryType rEADY;
       e uoe = KrnInternalManager.c.a().d();
       if (uoe.c()) {
          rEADY = KdsPluginLibraryType.READY;
       }else if(uoe.a()){
          rEADY = KdsPluginLibraryType.DOWNLOADED;
       }else {
          rEADY = KdsPluginLibraryType.DEFAULT;
       }
       return rEADY;
    }
}
