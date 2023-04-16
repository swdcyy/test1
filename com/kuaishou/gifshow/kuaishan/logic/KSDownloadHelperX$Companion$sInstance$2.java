package com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$Companion$sInstance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nsd.u;

public final class KSDownloadHelperX$Companion$sInstance$2 extends Lambda implements a	// class@0019ee
{
    public static final KSDownloadHelperX$Companion$sInstance$2 INSTANCE;

    static {
       KSDownloadHelperX$Companion$sInstance$2.INSTANCE = new KSDownloadHelperX$Companion$sInstance$2();
    }
    public void KSDownloadHelperX$Companion$sInstance$2(){
       super(0);
    }
    public final KSDownloadHelperX invoke(){
       Object obj = PatchProxy.apply(null, this, KSDownloadHelperX$Companion$sInstance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KSDownloadHelperX(null);
    }
    public Object invoke(){
       return this.invoke();
    }
}
