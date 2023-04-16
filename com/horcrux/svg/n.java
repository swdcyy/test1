package com.horcrux.svg.n;
import javax.inject.Provider;
import java.lang.Object;
import com.horcrux.svg.RenderableViewManager$CircleViewManager;

public final class n implements Provider	// class@000628
{
    public static final n a;

    static {
       n.a = new n();
    }
    public void n(){
       super();
    }
    public final Object get(){
       return new RenderableViewManager$CircleViewManager();
    }
}
