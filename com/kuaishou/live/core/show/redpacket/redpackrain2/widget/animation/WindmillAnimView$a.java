package com.kuaishou.live.core.show.redpacket.redpackrain2.widget.animation.WindmillAnimView$a;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m0d.l;
import com.kuaishou.live.common.core.component.redpacket.LiveNewRedPacketLogTag;
import java.lang.Boolean;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import com.google.common.base.Optional;

public final class WindmillAnimView$a implements ImageCallback	// class@000f38
{
    public final PublishSubject b;

    public void WindmillAnimView$a(PublishSubject p0){
       this.b = p0;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WindmillAnimView$a.class, "1")) {
          return;
       }
       l.a(this, p0);
       LiveNewRedPacketLogTag lIVE_NORMAL_ = LiveNewRedPacketLogTag.LIVE_NORMAL_RED_PACKET;
       boolean b = (p0 != null)? true: false;
       b.c0(lIVE_NORMAL_, "[WindmillAnimView]DownloadImageComplete:", "success", Boolean.valueOf(b));
       if (p0 != null && p0 instanceof BitmapDrawable) {
          this.b.onNext(Optional.fromNullable(p0.getBitmap()));
       }else {
          this.b.onNext(Optional.fromNullable(null));
       }
       return;
    }
    public void onCompletedBitmap(Bitmap p0){
       l.b(this, p0);
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
