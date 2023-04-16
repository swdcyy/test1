package com.horcrux.svg.s;
import javax.inject.Provider;
import java.lang.Object;
import com.horcrux.svg.RenderableViewManager$ForeignObjectManager;

public final class s implements Provider	// class@00062c
{
    public static final s a;

    static {
       s.a = new s();
    }
    public void s(){
       super();
    }
    public final Object get(){
       return new RenderableViewManager$ForeignObjectManager();
    }
}
