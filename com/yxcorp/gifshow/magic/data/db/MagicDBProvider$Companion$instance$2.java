package com.yxcorp.gifshow.magic.data.db.MagicDBProvider$Companion$instance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.magic.data.db.MagicDBProvider;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nsd.u;

public final class MagicDBProvider$Companion$instance$2 extends Lambda implements a	// class@001b83
{
    public static final MagicDBProvider$Companion$instance$2 INSTANCE;

    static {
       MagicDBProvider$Companion$instance$2.INSTANCE = new MagicDBProvider$Companion$instance$2();
    }
    public void MagicDBProvider$Companion$instance$2(){
       super(0);
    }
    public final MagicDBProvider invoke(){
       Object obj = PatchProxy.apply(null, this, MagicDBProvider$Companion$instance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MagicDBProvider(null);
    }
    public Object invoke(){
       return this.invoke();
    }
}
