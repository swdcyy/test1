package com.kuaishou.live.core.show.test.y0;
import erd.g;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.video.waynelive.LivePlayerParam$Builder;

public final class y0 implements g	// class@0011cc
{
    public static final y0 b;

    static {
       y0.b = new y0();
    }
    public void y0(){
       super();
    }
    public final void accept(Object p0){
       LivePlayerParam$Builder.USE_SURFACE_VIEW_STATUS = p0.booleanValue();
    }
}
