package com.horcrux.svg.i;
import javax.inject.Provider;
import java.lang.Object;
import com.horcrux.svg.RenderableViewManager$TSpanViewManager;

public final class i implements Provider	// class@000623
{
    public static final i a;

    static {
       i.a = new i();
    }
    public void i(){
       super();
    }
    public final Object get(){
       return new RenderableViewManager$TSpanViewManager();
    }
}
