package com.horcrux.svg.d;
import javax.inject.Provider;
import java.lang.Object;
import com.horcrux.svg.RenderableViewManager$PathViewManager;

public final class d implements Provider	// class@00061e
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final Object get(){
       return new RenderableViewManager$PathViewManager();
    }
}
