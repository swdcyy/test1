package com.horcrux.svg.o;
import javax.inject.Provider;
import java.lang.Object;
import com.horcrux.svg.RenderableViewManager$ClipPathViewManager;

public final class o implements Provider	// class@000629
{
    public static final o a;

    static {
       o.a = new o();
    }
    public void o(){
       super();
    }
    public final Object get(){
       return new RenderableViewManager$ClipPathViewManager();
    }
}
