package com.horcrux.svg.u;
import javax.inject.Provider;
import java.lang.Object;
import com.horcrux.svg.RenderableViewManager$ImageViewManager;

public final class u implements Provider	// class@00062e
{
    public static final u a;

    static {
       u.a = new u();
    }
    public void u(){
       super();
    }
    public final Object get(){
       return new RenderableViewManager$ImageViewManager();
    }
}
