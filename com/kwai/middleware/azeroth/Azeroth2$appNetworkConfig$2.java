package com.kwai.middleware.azeroth.Azeroth2$appNetworkConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import t97.c;
import com.kwai.middleware.azeroth.Azeroth2;
import java.lang.String;
import kotlin.jvm.internal.a;
import ub7.f;

public final class Azeroth2$appNetworkConfig$2 extends Lambda implements a	// class@000d3d
{
    public static final Azeroth2$appNetworkConfig$2 INSTANCE;

    static {
       Azeroth2$appNetworkConfig$2.INSTANCE = new Azeroth2$appNetworkConfig$2();
    }
    public void Azeroth2$appNetworkConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final c invoke(){
       f e = Azeroth2.e;
       if (e == null) {
          a.S("appNetworkConfigSupplier");
       }
       return e.get();
    }
}
