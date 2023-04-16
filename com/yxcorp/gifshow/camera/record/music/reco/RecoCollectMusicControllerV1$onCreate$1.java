package com.yxcorp.gifshow.camera.record.music.reco.RecoCollectMusicControllerV1$onCreate$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.camera.record.music.reco.RecoCollectMusicControllerV1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import ad9.a;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import java.lang.Boolean;

public final class RecoCollectMusicControllerV1$onCreate$1 extends FunctionReferenceImpl implements l	// class@000e99
{

    public void RecoCollectMusicControllerV1$onCreate$1(RecoCollectMusicControllerV1 p0){
       super(1, p0, RecoCollectMusicControllerV1.class, "handleDownloadBarShowEvent", "handleDownloadBarShowEvent\(Lcom/yxcorp/gifshow/camera/record/downloadbar/AutoDownloadBarShowEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecoCollectMusicControllerV1$onCreate$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, RecoCollectMusicControllerV1.class, "6")) {
          p0 = p0.a;
          if (p0 != null && p0.booleanValue()) {
             treceiver.u2();
          }
       }
       return;
    }
}
