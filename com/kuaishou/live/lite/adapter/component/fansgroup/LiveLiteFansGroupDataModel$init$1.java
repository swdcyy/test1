package com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel$init$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kuaishou.live.lite.userstatus.LiveLiteUserStatusResponse;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel$updateUserStatusInfo$1;
import msd.a;
import tb7.b;

public final class LiveLiteFansGroupDataModel$init$1 extends FunctionReferenceImpl implements l	// class@001d89
{

    public void LiveLiteFansGroupDataModel$init$1(LiveLiteFansGroupDataModel p0){
       super(1, p0, LiveLiteFansGroupDataModel.class, "updateUserStatusInfo", "updateUserStatusInfo\(Lcom/kuaishou/live/lite/userstatus/LiveLiteUserStatusResponse;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveLiteUserStatusResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFansGroupDataModel$init$1.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, LiveLiteFansGroupDataModel.class, "15")) {
          b.j(new LiveLiteFansGroupDataModel$updateUserStatusInfo$1(treceiver, p0));
       }
       return;
    }
}
