package com.smile.gifmaker.mvps.presenter.PresenterV2$PresenterAction$4;
import com.smile.gifmaker.mvps.presenter.PresenterV2$PresenterAction;
import java.lang.String;
import com.smile.gifmaker.mvps.presenter.PresenterV2$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.smile.gifmaker.mvps.presenter.PresenterStateMachine$PresenterState;

public final class PresenterV2$PresenterAction$4 extends PresenterV2$PresenterAction	// class@000c1f
{

    public void PresenterV2$PresenterAction$4(String p0,int p1){
       super(p0, p1, null);
    }
    public void performCallState(PresenterV2 p0){
       p0.J8();
       p0.g = PresenterStateMachine$PresenterState.UNBIND;
    }
    public void performEntryAction(PresenterV2 p0){
       p0.L8();
    }
}
