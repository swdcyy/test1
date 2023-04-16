package com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.b;
import erd.r;
import java.lang.Object;
import com.kwai.feature.api.social.nearby.model.roampanel.RoamPanelAction;

public final class b implements r	// class@001ac9
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0 == RoamPanelAction.SMOOTH_COLLAPSE || p0 == RoamPanelAction.IMMEDIATE_COLLAPSE)? true: false;
       return b;
    }
}
