package com.horcrux.svg.v;
import javax.inject.Provider;
import java.lang.Object;
import com.horcrux.svg.RenderableViewManager$LineViewManager;

public final class v implements Provider	// class@00062f
{
    public static final v a;

    static {
       v.a = new v();
    }
    public void v(){
       super();
    }
    public final Object get(){
       return new RenderableViewManager$LineViewManager();
    }
}
