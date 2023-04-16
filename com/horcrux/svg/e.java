package com.horcrux.svg.e;
import javax.inject.Provider;
import java.lang.Object;
import com.horcrux.svg.RenderableViewManager$PatternManager;

public final class e implements Provider	// class@00061f
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final Object get(){
       return new RenderableViewManager$PatternManager();
    }
}
