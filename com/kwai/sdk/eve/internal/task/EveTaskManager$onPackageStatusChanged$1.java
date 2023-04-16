package com.kwai.sdk.eve.internal.task.EveTaskManager$onPackageStatusChanged$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Number;
import tn7.b;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;

public final class EveTaskManager$onPackageStatusChanged$1 extends Lambda implements q	// class@0015ca
{
    public static final EveTaskManager$onPackageStatusChanged$1 INSTANCE;

    static {
       EveTaskManager$onPackageStatusChanged$1.INSTANCE = new EveTaskManager$onPackageStatusChanged$1();
    }
    public void EveTaskManager$onPackageStatusChanged$1(){
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       this.invoke(p0, p1.intValue(), p2);
       return l1.a;
    }
    public final void invoke(String p0,int p1,b p2){
       if (PatchProxy.isSupport(EveTaskManager$onPackageStatusChanged$1.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, EveTaskManager$onPackageStatusChanged$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       return;
    }
}
