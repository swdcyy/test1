package com.stage.LiveStageLoader$initTaskDispatch$1;
import msd.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import en8.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import qrd.l1;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.HashMap;
import en8.c$c;
import com.stage.LiveLoadingStage;
import en8.b;

public final class LiveStageLoader$initTaskDispatch$1 extends FunctionReferenceImpl implements a	// class@000c7e
{

    public void LiveStageLoader$initTaskDispatch$1(c p0){
       super(0, p0, c.class, "dispatcherDoneCallback", "dispatcherDoneCallback\(\)V", 0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       c c;
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       b.Z(c.f, "dispatcherDoneCallback\(\): "+treceiver.c);
       c = treceiver.c;
       if (c != null) {
          c$c uoc = treceiver.b.get(c);
          if (uoc != null) {
             uoc.c = true;
          }
          c$c uoc1 = treceiver.b.get(c);
          if (uoc1 != null) {
             uoc1 = uoc1.b;
             if (uoc1 != null) {
                l1 ol1 = uoc1.invoke();
             }
          }
          c = treceiver.c;
          LiveLoadingStage liveLoadingS = (c != null)? b.a(c): null;
          while (liveLoadingS != null && treceiver.b.get(liveLoadingS) == null) {
             liveLoadingS = b.a(liveLoadingS);
          }
          if (liveLoadingS != null) {
             treceiver.j(liveLoadingS);
          }
       }
       return;
    }
}
