package com.yxcorp.gifshow.share.operation.ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import brd.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Throwable;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import brd.g;

public final class ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1$1 extends FunctionReferenceImpl implements l	// class@001bf0
{

    public void ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1$1(v p0){
       super(1, p0, v.class, "onError", "onError\(Ljava/lang/Throwable;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       this.receiver.onError(p0);
       PatchProxy.onMethodExit(ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1$1.class, "1");
       return;
    }
}
