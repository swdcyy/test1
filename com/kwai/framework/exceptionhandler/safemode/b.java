package com.kwai.framework.exceptionhandler.safemode.b;
import ok.x;
import java.lang.Object;
import com.kwai.framework.exceptionhandler.safemode.e;
import q66.a;
import java.util.Random;
import java.util.List;
import java.lang.String;

public final class b implements x	// class@00154b
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object get(){
       List d = a.d;
       return d.get(new Random().nextInt(d.size()));
    }
}
