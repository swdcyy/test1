package com.kwai.framework.exceptionhandler.safemode.c;
import ok.x;
import java.lang.Object;
import com.kwai.framework.exceptionhandler.safemode.e;
import q66.a;
import java.util.Random;
import java.util.List;
import java.lang.String;

public final class c implements x	// class@00154c
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object get(){
       List c = a.c;
       return c.get(new Random().nextInt(c.size()));
    }
}
