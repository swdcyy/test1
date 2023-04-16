package com.horcrux.svg.c;
import javax.inject.Provider;
import java.lang.Object;
import com.horcrux.svg.RenderableViewManager$MaskManager;

public final class c implements Provider	// class@00061d
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final Object get(){
       return new RenderableViewManager$MaskManager();
    }
}
