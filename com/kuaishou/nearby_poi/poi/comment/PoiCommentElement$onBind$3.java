package com.kuaishou.nearby_poi.poi.comment.PoiCommentElement$onBind$3;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.nearby_poi.poi.comment.PoiCommentElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import sw5.d;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Boolean;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;

public final class PoiCommentElement$onBind$3 extends FunctionReferenceImpl implements l	// class@000a1a
{

    public void PoiCommentElement$onBind$3(PoiCommentElement p0){
       super(1, p0, PoiCommentElement.class, "processHideEvent", "processHideEvent\(Lcom/kwai/feature/api/social/nearby/event/PoiCommentElementHideEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(d p0){
       PoiCommentElement a;
       if (PatchProxy.applyVoidOneRefs(p0, this, PoiCommentElement$onBind$3.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, PoiCommentElement.class, "7")) {
          d b = p0.b;
          a = treceiver.A;
          String photoId = (a != null)? a.getPhotoId(): null;
          if (b.equals(photoId) && (p0.c != null && (p0.a).equals(treceiver.y))) {
             treceiver.r0();
             PoiCommentElement a1 = treceiver.A;
             if (a1 != null) {
                BaseFeed entity = a1.getEntity();
                if (entity != null) {
                   entity.setPartData("BUTTON_CLOSED", Boolean.TRUE);
                }
             }
          }
       }
    label_0056 :
       return;
    }
}
