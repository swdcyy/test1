package com.kwai.performance.component.manager.provider.c;
import java.util.concurrent.Callable;
import java.lang.Object;
import com.k.p.MMProviderS;

public final class c implements Callable	// class@001049
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object call(){
       return new MMProviderS();
    }
}
