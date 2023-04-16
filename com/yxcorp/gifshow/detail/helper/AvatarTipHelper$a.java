package com.yxcorp.gifshow.detail.helper.AvatarTipHelper$a;
import erd.g;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import vq4.d;

public final class AvatarTipHelper$a implements g	// class@001560
{
    public final QPhoto b;

    public void AvatarTipHelper$a(QPhoto p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarTipHelper$a.class, "1")) {
       }else {
          a.p(p0, "clientAdLog");
          QPhoto mEntity = this.b.mEntity;
          a.o(mEntity, "liveInfo.mEntity");
          p0.F.o = mEntity.getId();
          p0.o0 = 1;
       }
       return;
    }
}
