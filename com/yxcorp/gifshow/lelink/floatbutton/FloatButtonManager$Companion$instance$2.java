package com.yxcorp.gifshow.lelink.floatbutton.FloatButtonManager$Companion$instance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.lelink.floatbutton.FloatButtonManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nsd.u;

public final class FloatButtonManager$Companion$instance$2 extends Lambda implements a	// class@001a3d
{
    public static final FloatButtonManager$Companion$instance$2 INSTANCE;

    static {
       FloatButtonManager$Companion$instance$2.INSTANCE = new FloatButtonManager$Companion$instance$2();
    }
    public void FloatButtonManager$Companion$instance$2(){
       super(0);
    }
    public final FloatButtonManager invoke(){
       Object obj = PatchProxy.apply(null, this, FloatButtonManager$Companion$instance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FloatButtonManager(null);
    }
    public Object invoke(){
       return this.invoke();
    }
}
