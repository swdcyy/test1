package com.smile.gifmaker.mvps.presenter.PresenterV2$PresenterAction;
import com.smile.gifmaker.mvps.presenter.PresenterV2$d;
import java.lang.Enum;
import com.smile.gifmaker.mvps.presenter.PresenterV2$PresenterAction$1;
import java.lang.String;
import com.smile.gifmaker.mvps.presenter.PresenterV2$PresenterAction$2;
import com.smile.gifmaker.mvps.presenter.PresenterV2$PresenterAction$3;
import com.smile.gifmaker.mvps.presenter.PresenterV2$PresenterAction$4;
import com.smile.gifmaker.mvps.presenter.PresenterV2$PresenterAction$5;
import com.smile.gifmaker.mvps.presenter.PresenterV2$a;
import com.smile.gifmaker.mvps.presenter.PresenterStateMachine$PresenterState;
import java.lang.Class;
import java.lang.Object;

public abstract class PresenterV2$PresenterAction extends Enum implements PresenterV2$d	// class@000c21
{
    public static final PresenterV2$PresenterAction[] $VALUES;
    public static final PresenterV2$PresenterAction ACTION_BIND;
    public static final PresenterV2$PresenterAction ACTION_CREATE;
    public static final PresenterV2$PresenterAction ACTION_DESTROY;
    public static final PresenterV2$PresenterAction ACTION_INIT;
    public static final PresenterV2$PresenterAction ACTION_UNBIND;

    static {
       PresenterV2$PresenterAction$1 presenterAct = new PresenterV2$PresenterAction$1("ACTION_INIT", 0);
       PresenterV2$PresenterAction.ACTION_INIT = presenterAct;
       PresenterV2$PresenterAction$2 presenterAct1 = new PresenterV2$PresenterAction$2("ACTION_CREATE", 1);
       PresenterV2$PresenterAction.ACTION_CREATE = presenterAct1;
       PresenterV2$PresenterAction$3 presenterAct2 = new PresenterV2$PresenterAction$3("ACTION_BIND", 2);
       PresenterV2$PresenterAction.ACTION_BIND = presenterAct2;
       PresenterV2$PresenterAction$4 presenterAct3 = new PresenterV2$PresenterAction$4("ACTION_UNBIND", 3);
       PresenterV2$PresenterAction.ACTION_UNBIND = presenterAct3;
       PresenterV2$PresenterAction$5 presenterAct4 = new PresenterV2$PresenterAction$5("ACTION_DESTROY", 4);
       PresenterV2$PresenterAction.ACTION_DESTROY = presenterAct4;
       PresenterV2$PresenterAction[] presenterAct5 = new PresenterV2$PresenterAction[]{presenterAct,presenterAct1,presenterAct2,presenterAct3,presenterAct4};
       PresenterV2$PresenterAction.$VALUES = presenterAct5;
    }
    public void PresenterV2$PresenterAction(String p0,int p1){
       super(p0, p1);
    }
    public void PresenterV2$PresenterAction(String p0,int p1,PresenterV2$a p2){
       super(p0, p1);
    }
    public static PresenterV2$PresenterAction fromState(PresenterStateMachine$PresenterState p0){
       int i = PresenterV2$a.a[p0.ordinal()];
       if (i == 1) {
          return PresenterV2$PresenterAction.ACTION_INIT;
       }
       if (i == 2) {
          return PresenterV2$PresenterAction.ACTION_CREATE;
       }
       if (i == 3) {
          return PresenterV2$PresenterAction.ACTION_BIND;
       }
       if (i == 4) {
          return PresenterV2$PresenterAction.ACTION_UNBIND;
       }
       if (i != 5) {
          return null;
       }
       return PresenterV2$PresenterAction.ACTION_DESTROY;
    }
    public static PresenterV2$PresenterAction valueOf(String p0){
       return Enum.valueOf(PresenterV2$PresenterAction.class, p0);
    }
    public static PresenterV2$PresenterAction[] values(){
       return PresenterV2$PresenterAction.$VALUES.clone();
    }
}
