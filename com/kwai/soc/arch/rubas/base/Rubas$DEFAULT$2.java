package com.kwai.soc.arch.rubas.base.Rubas$DEFAULT$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import dt7.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.soc.arch.rubas.base.internal.BusImpl;

public final class Rubas$DEFAULT$2 extends Lambda implements a	// class@001892
{
    public static final Rubas$DEFAULT$2 INSTANCE;

    static {
       Rubas$DEFAULT$2.INSTANCE = new Rubas$DEFAULT$2();
    }
    public void Rubas$DEFAULT$2(){
       super(0);
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, Rubas$DEFAULT$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BusImpl();
    }
    public Object invoke(){
       return this.invoke();
    }
}
