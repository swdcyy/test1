package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$Companion$sInstance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nsd.u;

public final class KSDataManager$Companion$sInstance$2 extends Lambda implements a	// class@001a0f
{
    public static final KSDataManager$Companion$sInstance$2 INSTANCE;

    static {
       KSDataManager$Companion$sInstance$2.INSTANCE = new KSDataManager$Companion$sInstance$2();
    }
    public void KSDataManager$Companion$sInstance$2(){
       super(0);
    }
    public final KSDataManager invoke(){
       Object obj = PatchProxy.apply(null, this, KSDataManager$Companion$sInstance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KSDataManager(null);
    }
    public Object invoke(){
       return this.invoke();
    }
}
