package com.kuaishou.bowl.core.util.ComponentStateMachine;
import com.google.common.collect.ImmutableTable$a;
import com.google.common.collect.ImmutableTable;
import com.kuaishou.bowl.core.util.ComponentStateMachine$ComponentState;
import java.lang.Object;
import com.google.common.collect.ImmutableList;

public class ComponentStateMachine	// class@0011b8
{
    public static final ImmutableTable a;

    static {
       ImmutableTable$a uoa = ImmutableTable.builder();
       ComponentStateMachine$ComponentState iNIT = ComponentStateMachine$ComponentState.INIT;
       ComponentStateMachine$ComponentState cREATE = ComponentStateMachine$ComponentState.CREATE;
       uoa.b(iNIT, cREATE, ImmutableList.of(cREATE));
       ComponentStateMachine$ComponentState bIND = ComponentStateMachine$ComponentState.BIND;
       uoa.b(iNIT, bIND, ImmutableList.of(cREATE, bIND));
       uoa.b(cREATE, bIND, ImmutableList.of(bIND));
       uoa.b(bIND, bIND, ImmutableList.of(bIND));
       ComponentStateMachine$ComponentState uNBIND = ComponentStateMachine$ComponentState.UNBIND;
       uoa.b(uNBIND, bIND, ImmutableList.of(bIND));
       uoa.b(bIND, uNBIND, ImmutableList.of(uNBIND));
       ComponentStateMachine$ComponentState dESTROY = ComponentStateMachine$ComponentState.DESTROY;
       uoa.b(iNIT, dESTROY, ImmutableList.of());
       uoa.b(cREATE, dESTROY, ImmutableList.of(dESTROY));
       uoa.b(cREATE, uNBIND, ImmutableList.of(bIND, uNBIND));
       uoa.b(bIND, dESTROY, ImmutableList.of(uNBIND, dESTROY));
       uoa.b(uNBIND, dESTROY, ImmutableList.of(dESTROY));
       ComponentStateMachine.a = uoa.a();
    }
    public void ComponentStateMachine(){
       super();
    }
}
