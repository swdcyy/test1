package com.horcrux.svg.b;
import javax.inject.Provider;
import java.lang.Object;
import com.horcrux.svg.RenderableViewManager$MarkerManager;

public final class b implements Provider	// class@00061c
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final Object get(){
       return new RenderableViewManager$MarkerManager();
    }
}
