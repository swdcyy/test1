package com.kwai.sdk.eve.EveManager$activate$2;
import msd.p;
import kotlin.jvm.internal.Lambda;
import sm7.i;
import ml5.a;
import com.kwai.sdk.eve.internal.inference.DataBundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class EveManager$activate$2 extends Lambda implements p	// class@001436
{
    public static final EveManager$activate$2 INSTANCE;

    static {
       EveManager$activate$2.INSTANCE = new EveManager$activate$2();
    }
    public void EveManager$activate$2(){
       super(2);
    }
    public final DataBundle invoke(i p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EveManager$activate$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "<anonymous parameter 1>");
       return new DataBundle();
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
