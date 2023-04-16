package com.kwai.lib.interfacies.AzerothCodeAdapter$INSTANCE$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import gv6.b;
import com.kwai.lib.interfacies.AzerothCodeAdapter;
import kotlin.Result;
import com.kwai.lib.adapter.AzerothCodeAdapterImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.Throwable;
import qrd.j0;
import gv6.a;

public final class AzerothCodeAdapter$INSTANCE$2 extends Lambda implements a	// class@000cff
{
    public static final AzerothCodeAdapter$INSTANCE$2 INSTANCE;

    static {
       AzerothCodeAdapter$INSTANCE$2.INSTANCE = new AzerothCodeAdapter$INSTANCE$2();
    }
    public void AzerothCodeAdapter$INSTANCE$2(){
       super(0);
    }
    public final b invoke(){
       a uoa = Result.constructor-impl(AzerothCodeAdapterImpl.class.newInstance());
       Result.exceptionOrNull-impl(uoa);
       a uoa1 = new a();
       if (Result.isFailure-impl(uoa)) {
          uoa = uoa1;
       }
       return uoa;
    }
    public Object invoke(){
       return this.invoke();
    }
}
