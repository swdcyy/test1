package com.horcrux.svg.h;
import javax.inject.Provider;
import java.lang.Object;
import com.horcrux.svg.RenderableViewManager$SymbolManager;

public final class h implements Provider	// class@000622
{
    public static final h a;

    static {
       h.a = new h();
    }
    public void h(){
       super();
    }
    public final Object get(){
       return new RenderableViewManager$SymbolManager();
    }
}
