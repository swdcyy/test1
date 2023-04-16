package com.kwai.lib.interfacies.SpAdapter$INSTANCE$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import gv6.e;
import com.kwai.lib.interfacies.SpAdapter;
import kotlin.Result;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.Throwable;
import qrd.j0;

public final class SpAdapter$INSTANCE$2 extends Lambda implements a	// class@000d03
{
    public static final SpAdapter$INSTANCE$2 INSTANCE;

    static {
       SpAdapter$INSTANCE$2.INSTANCE = new SpAdapter$INSTANCE$2();
    }
    public void SpAdapter$INSTANCE$2(){
       super(0);
    }
    public final e invoke(){
       Object obj = Result.constructor-impl(Class.forName("com.kwai.lib.adapter.SpAdapterImpl").newInstance());
       Result.exceptionOrNull-impl(obj);
       j0.n(obj);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
