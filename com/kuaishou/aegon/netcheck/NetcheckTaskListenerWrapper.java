package com.kuaishou.aegon.netcheck.NetcheckTaskListenerWrapper;
import com.kuaishou.aegon.netcheck.NetcheckTaskController$a;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kuaishou.aegon.netcheck.NetcheckTaskController$ErrorCode;
import java.util.EnumSet;
import eo.d;
import java.lang.Runnable;
import java.lang.Integer;
import eo.c;

public class NetcheckTaskListenerWrapper	// class@0007b6
{
    public NetcheckTaskController$a a;
    public Executor b;

    public void NetcheckTaskListenerWrapper(NetcheckTaskController$a p0,Executor p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void OnFinish(long p0,String p1){
       NetcheckTaskListenerWrapper netcheckTask = NetcheckTaskListenerWrapper.class;
       if (PatchProxy.isSupport(netcheckTask) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, netcheckTask, "2")) {
          return;
       }
       EnumSet uEnumSet = EnumSet.noneOf(NetcheckTaskController$ErrorCode.class);
       NetcheckTaskController$ErrorCode[] uErrorCodeAr = NetcheckTaskController$ErrorCode.values();
       int len = uErrorCodeAr.length;
       int i = 0;
       while (i < len) {
          object oobject = uErrorCodeAr[i];
          long l = 1 << oobject.getInternalValue();
          l = l & p0;
          if (l) {
             uEnumSet.add(oobject);
          }
          i = i + 1;
       }
       this.b.execute(new d(this, uEnumSet, p1));
       return;
    }
    public void OnProgress(int p0){
       NetcheckTaskListenerWrapper netcheckTask = NetcheckTaskListenerWrapper.class;
       if (PatchProxy.isSupport(netcheckTask) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, netcheckTask, "1")) {
          return;
       }
       this.b.execute(new c(this, p0));
       return;
    }
}
