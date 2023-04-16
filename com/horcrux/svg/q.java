package com.horcrux.svg.q;
import javax.inject.Provider;
import java.lang.Object;
import com.horcrux.svg.RenderableViewManager$EllipseViewManager;

public final class q implements Provider	// class@00062b
{
    public static final q a;

    static {
       q.a = new q();
    }
    public void q(){
       super();
    }
    public final Object get(){
       return new RenderableViewManager$EllipseViewManager();
    }
}
