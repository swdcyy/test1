package com.kwai.sdk.eve.internal.task.EveTaskManager$deactivate$2;
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

public final class EveTaskManager$deactivate$2 extends Lambda implements p	// class@0015c8
{
    public static final EveTaskManager$deactivate$2 INSTANCE;

    static {
       EveTaskManager$deactivate$2.INSTANCE = new EveTaskManager$deactivate$2();
    }
    public void EveTaskManager$deactivate$2(){
       super(2);
    }
    public final DataBundle invoke(i p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EveTaskManager$deactivate$2.class, "1");
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
