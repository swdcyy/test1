package com.horcrux.svg.j;
import javax.inject.Provider;
import java.lang.Object;
import com.horcrux.svg.RenderableViewManager$TextPathViewManager;

public final class j implements Provider	// class@000624
{
    public static final j a;

    static {
       j.a = new j();
    }
    public void j(){
       super();
    }
    public final Object get(){
       return new RenderableViewManager$TextPathViewManager();
    }
}
