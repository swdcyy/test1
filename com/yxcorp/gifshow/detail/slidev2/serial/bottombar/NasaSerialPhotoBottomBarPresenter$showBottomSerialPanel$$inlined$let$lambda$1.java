package com.yxcorp.gifshow.detail.slidev2.serial.bottombar.NasaSerialPhotoBottomBarPresenter$showBottomSerialPanel$$inlined$let$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.slidev2.serial.bottombar.NasaSerialPhotoBottomBarPresenter;
import u8a.b;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o8a.c;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import xl8.b;

public final class NasaSerialPhotoBottomBarPresenter$showBottomSerialPanel$$inlined$let$lambda$1 extends Lambda implements a	// class@0019dc
{
    public final b $callback$inlined;
    public final NasaSerialPhotoBottomBarPresenter this$0;

    public void NasaSerialPhotoBottomBarPresenter$showBottomSerialPanel$$inlined$let$lambda$1(NasaSerialPhotoBottomBarPresenter p0,b p1){
       this.this$0 = p0;
       this.$callback$inlined = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaSerialPhotoBottomBarPresenter$showBottomSerialPanel$$inlined$let$lambda$1.class, "1")) {
          return;
       }
       this.this$0.c9(true);
       MilanoContainerEventBus k = this.this$0.V8().k;
       a.o(k, "mMilanoContainerEventBus¡­otifyClearItemContentView");
       k.d(Boolean.TRUE);
       PatchProxy.onMethodExit(NasaSerialPhotoBottomBarPresenter$showBottomSerialPanel$$inlined$let$lambda$1.class, "1");
       return;
    }
}
