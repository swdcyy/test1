package com.kwai.edge.reco.ctr.CTRPredictor$handler$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.edge.reco.ctr.CTRPredictor$handler$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.HandlerThread;
import android.os.Looper;

public final class CTRPredictor$handler$2 extends Lambda implements a	// class@000d39
{
    public static final CTRPredictor$handler$2 INSTANCE;

    static {
       CTRPredictor$handler$2.INSTANCE = new CTRPredictor$handler$2();
    }
    public void CTRPredictor$handler$2(){
       super(0);
    }
    public final CTRPredictor$handler$2$a invoke(){
       HandlerThread obj = PatchProxy.apply(null, this, CTRPredictor$handler$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HandlerThread("eve-ctr-predictor");
       obj.start();
       return new CTRPredictor$handler$2$a(obj, obj.getLooper());
    }
    public Object invoke(){
       return this.invoke();
    }
}
