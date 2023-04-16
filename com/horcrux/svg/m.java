package com.horcrux.svg.m;
import javax.inject.Provider;
import java.lang.Object;
import com.horcrux.svg.SvgViewManager;

public final class m implements Provider	// class@000627
{
    public static final m a;

    static {
       m.a = new m();
    }
    public void m(){
       super();
    }
    public final Object get(){
       return new SvgViewManager();
    }
}
