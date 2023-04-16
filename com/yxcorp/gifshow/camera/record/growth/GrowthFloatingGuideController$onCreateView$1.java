package com.yxcorp.gifshow.camera.record.growth.GrowthFloatingGuideController$onCreateView$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.camera.record.growth.GrowthFloatingGuideController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.gifshow.post.api.feature.ktv.KtvMode;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import android.widget.FrameLayout;

public final class GrowthFloatingGuideController$onCreateView$1 extends FunctionReferenceImpl implements l	// class@000df5
{

    public void GrowthFloatingGuideController$onCreateView$1(GrowthFloatingGuideController p0){
       super(1, p0, GrowthFloatingGuideController.class, "handleKtvMockChange", "handleKtvMockChange\(Lcom/kwai/gifshow/post/api/feature/ktv/KtvMode;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(KtvMode p0){
       GrowthFloatingGuideController o;
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthFloatingGuideController$onCreateView$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, GrowthFloatingGuideController.class, "8")) {
          if (p0 == KtvMode.MV) {
             o = treceiver.o;
             if (o == null) {
                a.S("floatContainer");
             }
             o.setVisibility(0);
          }else {
             o = treceiver.o;
             if (o == null) {
                a.S("floatContainer");
             }
             o.setVisibility(4);
          }
       }
       return;
    }
}
