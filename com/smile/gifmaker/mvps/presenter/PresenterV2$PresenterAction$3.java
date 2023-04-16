package com.smile.gifmaker.mvps.presenter.PresenterV2$PresenterAction$3;
import com.smile.gifmaker.mvps.presenter.PresenterV2$PresenterAction;
import java.lang.String;
import com.smile.gifmaker.mvps.presenter.PresenterV2$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.smile.gifmaker.mvps.presenter.PresenterStateMachine$PresenterState;

public final class PresenterV2$PresenterAction$3 extends PresenterV2$PresenterAction	// class@000c1e
{

    public void PresenterV2$PresenterAction$3(String p0,int p1){
       super(p0, p1, null);
    }
    public void performCallState(PresenterV2 p0){
       p0.E8();
       p0.g = PresenterStateMachine$PresenterState.BIND;
    }
    public void performEntryAction(PresenterV2 p0){
       PresenterV2.S7(p0);
    }
}
