package com.yxcorp.gifshow.listcomponent.module.KsModuleStateMachine;
import com.google.common.collect.ImmutableTable$a;
import com.google.common.collect.ImmutableTable;
import com.yxcorp.gifshow.listcomponent.module.KsModuleStateMachine$State;
import java.lang.Object;
import com.google.common.collect.ImmutableList;

public class KsModuleStateMachine	// class@001a86
{
    public static final ImmutableTable a;

    static {
       ImmutableTable$a uoa = ImmutableTable.builder();
       KsModuleStateMachine$State iNIT = KsModuleStateMachine$State.INIT;
       KsModuleStateMachine$State cREATE = KsModuleStateMachine$State.CREATE;
       uoa.b(iNIT, cREATE, ImmutableList.of(cREATE));
       KsModuleStateMachine$State bIND = KsModuleStateMachine$State.BIND;
       uoa.b(cREATE, bIND, ImmutableList.of(bIND));
       KsModuleStateMachine$State uNBIND = KsModuleStateMachine$State.UNBIND;
       uoa.b(bIND, bIND, ImmutableList.of(uNBIND, bIND));
       uoa.b(uNBIND, bIND, ImmutableList.of(bIND));
       uoa.b(bIND, uNBIND, ImmutableList.of(uNBIND));
       KsModuleStateMachine$State dESTROY = KsModuleStateMachine$State.DESTROY;
       uoa.b(iNIT, dESTROY, ImmutableList.of());
       uoa.b(cREATE, dESTROY, ImmutableList.of(dESTROY));
       uoa.b(bIND, dESTROY, ImmutableList.of(uNBIND, dESTROY));
       uoa.b(uNBIND, dESTROY, ImmutableList.of(dESTROY));
       KsModuleStateMachine.a = uoa.a();
    }
    public void KsModuleStateMachine(){
       super();
    }
}
