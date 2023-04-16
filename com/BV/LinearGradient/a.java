package com.BV.LinearGradient.a;
import javax.inject.Provider;
import java.lang.Object;
import com.BV.LinearGradient.LinearGradientManager;

public final class a implements Provider	// class@000d49
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       return new LinearGradientManager();
    }
}
