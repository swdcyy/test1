package com.horcrux.svg.p;
import javax.inject.Provider;
import java.lang.Object;
import com.horcrux.svg.RenderableViewManager$DefsViewManager;

public final class p implements Provider	// class@00062a
{
    public static final p a;

    static {
       p.a = new p();
    }
    public void p(){
       super();
    }
    public final Object get(){
       return new RenderableViewManager$DefsViewManager();
    }
}
