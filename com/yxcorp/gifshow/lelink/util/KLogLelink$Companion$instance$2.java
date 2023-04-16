package com.yxcorp.gifshow.lelink.util.KLogLelink$Companion$instance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.lelink.util.KLogLelink;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;

public final class KLogLelink$Companion$instance$2 extends Lambda implements a	// class@001a51
{
    public static final KLogLelink$Companion$instance$2 INSTANCE;

    static {
       KLogLelink$Companion$instance$2.INSTANCE = new KLogLelink$Companion$instance$2();
    }
    public void KLogLelink$Companion$instance$2(){
       super(0);
    }
    public final KLogLelink invoke(){
       Object obj = PatchProxy.apply(null, this, KLogLelink$Companion$instance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(KLogLelink.e);
       return new KLogLelink(KLogLelink.c);
    }
    public Object invoke(){
       return this.invoke();
    }
}
