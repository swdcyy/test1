package com.kwai.statechart.StateChart$sendEventInner$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kwai.statechart.StateChart;
import ut7.e;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public final class StateChart$sendEventInner$1 extends Lambda implements a	// class@0018f0
{
    public final e $event;
    public final Ref$ObjectRef $handled;
    public final boolean $isRoot;
    public final StateChart this$0;

    public void StateChart$sendEventInner$1(Ref$ObjectRef p0,StateChart p1,e p2,boolean p3){
       this.$handled = p0;
       this.this$0 = p1;
       this.$event = p2;
       this.$isRoot = p3;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, StateChart$sendEventInner$1.class, "1")) {
          return;
       }
       this.$handled.element = Boolean.valueOf(this.this$0.o(this.$event, this.$isRoot));
       return;
    }
}
