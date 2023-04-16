package com.yxcorp.gifshow.photo.download.task.i;
import erd.o;
import com.yxcorp.gifshow.photo.download.task.f$b;
import com.yxcorp.gifshow.video.d$b;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.util.Objects;
import com.yxcorp.gifshow.photo.download.task.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import ixb.d;
import io.reactivex.g;

public final class i implements o	// class@000f01
{
    public final f$b b;
    public final d$b c;
    public final float d;

    public void i(f$b p0,d$b p1,float p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       t ot;
       i tc = this.c;
       i td = this.d;
       f$b c = this.b.c;
       Objects.requireNonNull(c);
       if (PatchProxy.isSupport(f.class)) {
          ot = PatchProxy.applyThreeRefs(tc, Float.valueOf(td), p0, c, f.class, "10");
          if (ot != PatchProxyResult.class) {
          label_0034 :
             return ot;
          }
       }
       ot = t.create(new d(c, tc, p0, td));
       goto label_0034 ;
    }
}
