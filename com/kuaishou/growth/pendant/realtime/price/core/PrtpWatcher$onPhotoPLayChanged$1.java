package com.kuaishou.growth.pendant.realtime.price.core.PrtpWatcher$onPhotoPLayChanged$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import we0.q;
import kotlin.jvm.internal.a;
import ye0.a$a;
import ye0.b;
import java.util.Objects;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedManager;

public final class PrtpWatcher$onPhotoPLayChanged$1 extends Lambda implements a	// class@0006ba
{
    public final QPhoto $photo;

    public void PrtpWatcher$onPhotoPLayChanged$1(QPhoto p0){
       this.$photo = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PrtpWatcher$onPhotoPLayChanged$1.class, "1")) {
          return;
       }
       PrtpWatcher$onPhotoPLayChanged$1 t$photo = this.$photo;
       String photoId = (t$photo != null)? t$photo.getPhotoId(): objArray;
       q b = q.b;
       QPhoto qPhoto = b.a();
       if (qPhoto != null) {
          objArray = qPhoto.getPhotoId();
       }
       if (a.g(photoId, objArray)) {
          a$a.g(b.a(), "PrtpSpeedInfer#onPhotoPLayChanged : same photo === !!!", false, false, 6, null);
          return;
       }else {
          Objects.requireNonNull(b);
          q.a = this.$photo;
          PrtpSpeedManager.s.g("play");
          return;
       }
    }
}
