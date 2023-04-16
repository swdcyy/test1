package com.kwai.sdk.eve.EveManager$a;
import msd.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.EveManager;
import com.kwai.sdk.eve.internal.task.EveTaskManager;
import zn7.a;
import ao7.a;
import tn7.b;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.statistics.ExecuteState;
import com.kwai.sdk.eve.internal.statistics.CoverageStats;
import qrd.l1;

public final class EveManager$a implements a	// class@001434
{
    public final String b;
    public final a c;

    public void EveManager$a(String p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EveManager$a.class, "1")) {
       }else {
          a uoa = EveManager.a(EveManager.p).b(this.b);
          if (uoa != null) {
             uoa = uoa.h();
             if (uoa != null) {
                b uob = uoa.R3();
                if (uob != null) {
                   objArray = uob.version;
                }
             }
          }
          if (objArray != null) {
             CoverageStats j = EveManager.j;
             if (j == null) {
                a.S("coverageStats");
             }
             j.b(this.b, objArray, ExecuteState.EVER_ACTIVATED);
          }
          this.c.invoke();
       }
       return l1.a;
    }
}
