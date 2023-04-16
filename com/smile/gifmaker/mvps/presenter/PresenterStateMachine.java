package com.smile.gifmaker.mvps.presenter.PresenterStateMachine;
import com.google.common.collect.ImmutableTable$a;
import com.google.common.collect.ImmutableTable;
import com.smile.gifmaker.mvps.presenter.PresenterStateMachine$PresenterState;
import java.lang.Object;
import com.google.common.collect.ImmutableList;

public class PresenterStateMachine	// class@000c1b
{
    public static final ImmutableTable a;

    static {
       ImmutableTable$a uoa = ImmutableTable.builder();
       PresenterStateMachine$PresenterState iNIT = PresenterStateMachine$PresenterState.INIT;
       PresenterStateMachine$PresenterState cREATE = PresenterStateMachine$PresenterState.CREATE;
       uoa.b(iNIT, cREATE, ImmutableList.of(cREATE));
       PresenterStateMachine$PresenterState bIND = PresenterStateMachine$PresenterState.BIND;
       uoa.b(cREATE, bIND, ImmutableList.of(bIND));
       PresenterStateMachine$PresenterState uNBIND = PresenterStateMachine$PresenterState.UNBIND;
       uoa.b(bIND, bIND, ImmutableList.of(uNBIND, bIND));
       uoa.b(uNBIND, bIND, ImmutableList.of(bIND));
       uoa.b(bIND, uNBIND, ImmutableList.of(uNBIND));
       PresenterStateMachine$PresenterState dESTROY = PresenterStateMachine$PresenterState.DESTROY;
       uoa.b(iNIT, dESTROY, ImmutableList.of());
       uoa.b(cREATE, dESTROY, ImmutableList.of(dESTROY));
       uoa.b(bIND, dESTROY, ImmutableList.of(uNBIND, dESTROY));
       uoa.b(uNBIND, dESTROY, ImmutableList.of(dESTROY));
       PresenterStateMachine.a = uoa.a();
    }
}
