package com.yxcorp.gifshow.edit.previewer.loaderv2.util.AESubtitleHelper$Companion$instance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.edit.previewer.loaderv2.util.AESubtitleHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nsd.u;

public final class AESubtitleHelper$Companion$instance$2 extends Lambda implements a	// class@001b4e
{
    public static final AESubtitleHelper$Companion$instance$2 INSTANCE;

    static {
       AESubtitleHelper$Companion$instance$2.INSTANCE = new AESubtitleHelper$Companion$instance$2();
    }
    public void AESubtitleHelper$Companion$instance$2(){
       super(0);
    }
    public final AESubtitleHelper invoke(){
       Object obj = PatchProxy.apply(null, this, AESubtitleHelper$Companion$instance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new AESubtitleHelper(null);
    }
    public Object invoke(){
       return this.invoke();
    }
}
