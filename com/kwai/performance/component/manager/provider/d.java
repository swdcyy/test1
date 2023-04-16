package com.kwai.performance.component.manager.provider.d;
import java.util.concurrent.Callable;
import java.lang.Object;
import com.k.p.MMProviderT;

public final class d implements Callable	// class@00104a
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object call(){
       return new MMProviderT();
    }
}
