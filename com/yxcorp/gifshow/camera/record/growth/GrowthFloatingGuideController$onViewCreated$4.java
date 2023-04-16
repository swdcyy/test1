package com.yxcorp.gifshow.camera.record.growth.GrowthFloatingGuideController$onViewCreated$4;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.camera.record.growth.GrowthFloatingGuideController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import v4b.n;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camerasdk.q;
import android.widget.FrameLayout;

public final class GrowthFloatingGuideController$onViewCreated$4 extends FunctionReferenceImpl implements l	// class@000df6
{

    public void GrowthFloatingGuideController$onViewCreated$4(GrowthFloatingGuideController p0){
       super(1, p0, GrowthFloatingGuideController.class, "handleMagicDeletePanelShowEvent", "handleMagicDeletePanelShowEvent\(Lcom/yxcorp/gifshow/magic/ui/magicemoji/mydelete/MyMagicDeletePanelShowEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(n p0){
       GrowthFloatingGuideController o;
       boolean b1;
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthFloatingGuideController$onViewCreated$4.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       GrowthFloatingGuideController growthFloati = GrowthFloatingGuideController.class;
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, growthFloati, "5")) {
          treceiver.t = p0.a;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          Object obj = PatchProxy.apply(null, treceiver, growthFloati, "6");
          boolean b = true;
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(treceiver.k2() && !treceiver.a2()){
             Object obj1 = PatchProxy.apply(null, treceiver, growthFloati, "7");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                d h = treceiver.h;
                if (h != null) {
                   a.o(h, "mCameraHelper");
                   if (h.isRecording()) {
                      b1 = true;
                   }
                }
                b1 = false;
             }
             if (b1 || treceiver.t != null) {
             label_006e :
                b = false;
             }
          }else {
             goto label_006e ;
          }
          String str = "floatContainer";
          if (b) {
             o = treceiver.o;
             if (o == null) {
                a.S(str);
             }
             o.setVisibility(0);
          }else {
             o = treceiver.o;
             if (o == null) {
                a.S(str);
             }
             o.setVisibility(4);
          }
       }
       return;
    }
}
