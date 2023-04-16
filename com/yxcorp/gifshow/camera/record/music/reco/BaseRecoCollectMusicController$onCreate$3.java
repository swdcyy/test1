package com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController$onCreate$3;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;

public final class BaseRecoCollectMusicController$onCreate$3 extends FunctionReferenceImpl implements l	// class@000e93
{

    public void BaseRecoCollectMusicController$onCreate$3(BaseRecoCollectMusicController p0){
       super(1, p0, BaseRecoCollectMusicController.class, "handlePanelShowEvent", "handlePanelShowEvent\(Lcom/kwai/gifshow/post/api/core/event/PanelShowEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(PanelShowEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseRecoCollectMusicController$onCreate$3.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       this.receiver.m2(p0);
       return;
    }
}
