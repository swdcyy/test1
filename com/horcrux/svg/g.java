package com.horcrux.svg.g;
import javax.inject.Provider;
import java.lang.Object;
import com.horcrux.svg.RenderableViewManager$RectViewManager;

public final class g implements Provider	// class@000621
{
    public static final g a;

    static {
       g.a = new g();
    }
    public void g(){
       super();
    }
    public final Object get(){
       return new RenderableViewManager$RectViewManager();
    }
}
