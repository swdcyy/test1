package com.kwai.roampanel.panel.d;
import brd.w;
import java.lang.Object;
import brd.y;
import com.kwai.feature.api.social.nearby.model.roampanel.RoamPanelAction;

public final class d implements w	// class@0013dc
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void subscribe(y p0){
       p0.onNext(RoamPanelAction.SMOOTH_COLLAPSE);
    }
}
