package com.horcrux.svg.t;
import javax.inject.Provider;
import java.lang.Object;
import com.horcrux.svg.RenderableViewManager$GroupViewManager;

public final class t implements Provider	// class@00062d
{
    public static final t a;

    static {
       t.a = new t();
    }
    public void t(){
       super();
    }
    public final Object get(){
       return new RenderableViewManager$GroupViewManager();
    }
}
