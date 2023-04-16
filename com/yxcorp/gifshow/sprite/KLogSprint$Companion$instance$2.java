package com.yxcorp.gifshow.sprite.KLogSprint$Companion$instance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.sprite.KLogSprint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;

public final class KLogSprint$Companion$instance$2 extends Lambda implements a	// class@001d7a
{
    public static final KLogSprint$Companion$instance$2 INSTANCE;

    static {
       KLogSprint$Companion$instance$2.INSTANCE = new KLogSprint$Companion$instance$2();
    }
    public void KLogSprint$Companion$instance$2(){
       super(0);
    }
    public final KLogSprint invoke(){
       Object obj = PatchProxy.apply(null, this, KLogSprint$Companion$instance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(KLogSprint.e);
       return new KLogSprint(KLogSprint.c);
    }
    public Object invoke(){
       return this.invoke();
    }
}
