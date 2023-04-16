package com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement$b;
import erd.g;
import com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement;
import java.lang.Object;
import java.lang.Number;

public final class CoronaPlayPayPauseElement$b implements g	// class@0013ad
{
    public final CoronaPlayPayPauseElement b;

    public void CoronaPlayPayPauseElement$b(CoronaPlayPayPauseElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       CoronaPlayPayPauseElement$b tb = this.b;
       boolean b = (p0.floatValue() - 0x3f800000)? true: false;
       tb.u = b;
       return;
    }
}
