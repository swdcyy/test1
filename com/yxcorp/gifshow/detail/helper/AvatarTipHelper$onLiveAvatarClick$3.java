package com.yxcorp.gifshow.detail.helper.AvatarTipHelper$onLiveAvatarClick$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import q76.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o76.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;

public final class AvatarTipHelper$onLiveAvatarClick$3 extends Lambda implements a	// class@001561
{
    public final QPhoto $photo;

    public void AvatarTipHelper$onLiveAvatarClick$3(QPhoto p0){
       this.$photo = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, AvatarTipHelper$onLiveAvatarClick$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b uob = new b(this.$photo.getPhotoId(), null, null, -1, 810, null);
       return obj;
    }
}
