package com.yxcorp.gifshow.detail.trigger.a$a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.yxcorp.gifshow.detail.trigger.a;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Long;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.g;

public class a$a implements IMediaPlayer$OnInfoListener	// class@001a1b
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(a$a.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a$a.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 0x2775 && (this.b.p.isVideoType() && (this.b.p.getVideoDuration() - a.z.longValue() > 0 && this.b.p.getVideoDuration() - a.A.longValue() <= 0))) {
          RxBus.f.b(new g(this.b.p.getPhotoId(), this.b.p.getUserId()));
       }
    label_0071 :
       return false;
    }
}
