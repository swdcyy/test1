package com.horcrux.svg.k;
import javax.inject.Provider;
import java.lang.Object;
import com.horcrux.svg.RenderableViewManager$TextViewManager;

public final class k implements Provider	// class@000625
{
    public static final k a;

    static {
       k.a = new k();
    }
    public void k(){
       super();
    }
    public final Object get(){
       return new RenderableViewManager$TextViewManager();
    }
}
