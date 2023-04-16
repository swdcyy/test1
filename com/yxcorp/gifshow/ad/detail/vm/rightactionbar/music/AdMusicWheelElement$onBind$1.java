package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.trello.rxlifecycle3.android.FragmentEvent;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;

public final class AdMusicWheelElement$onBind$1 extends FunctionReferenceImpl implements l	// class@001731
{

    public void AdMusicWheelElement$onBind$1(AdMusicWheelElement p0){
       super(1, p0, AdMusicWheelElement.class, "onFragmentStateChanged", "onFragmentStateChanged\(Lcom/trello/rxlifecycle3/android/FragmentEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(FragmentEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdMusicWheelElement$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, AdMusicWheelElement.class, "7") && p0 == FragmentEvent.DESTROY_VIEW) {
          treceiver.r0();
       }
       return;
    }
}
