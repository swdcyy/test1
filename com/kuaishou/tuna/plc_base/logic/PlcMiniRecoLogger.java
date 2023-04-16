package com.kuaishou.tuna.plc_base.logic.PlcMiniRecoLogger;
import com.kuaishou.tuna.plc_base.logic.PlcMiniRecoLogger$a;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import com.kuaishou.tuna.plc_base.logic.PlcMiniRecoLogger$mLifecycleObserver$1;
import com.kuaishou.tuna.plc_base.logic.PlcMiniRecoLogger$b;

public final class PlcMiniRecoLogger	// class@001070
{
    public final PlcMiniRecoLogger$mLifecycleObserver$1 a;
    public PlcMiniRecoLogger$b b;
    public final LifecycleOwner c;
    public final QPhoto d;
    public static final PlcMiniRecoLogger$a e;

    static {
       PlcMiniRecoLogger.e = new PlcMiniRecoLogger$a(null);
    }
    public void PlcMiniRecoLogger(LifecycleOwner p0,QPhoto p1){
       super();
       this.c = p0;
       this.d = p1;
       this.a = new PlcMiniRecoLogger$mLifecycleObserver$1(this);
       this.b = new PlcMiniRecoLogger$b();
    }
}
