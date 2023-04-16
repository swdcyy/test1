package com.horcrux.svg.l;
import javax.inject.Provider;
import java.lang.Object;
import com.horcrux.svg.RenderableViewManager$UseViewManager;

public final class l implements Provider	// class@000626
{
    public static final l a;

    static {
       l.a = new l();
    }
    public void l(){
       super();
    }
    public final Object get(){
       return new RenderableViewManager$UseViewManager();
    }
}
