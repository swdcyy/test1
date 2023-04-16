package com.kwai.feature.component.signal.real.a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.String;
import uy5.b;

public final class a implements g	// class@0012a8
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       b.o("intercept error "+p0.getMessage());
    }
}
