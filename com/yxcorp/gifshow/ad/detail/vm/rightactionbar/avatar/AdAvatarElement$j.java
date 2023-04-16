package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$j;
import erd.g;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public final class AdAvatarElement$j implements g	// class@001718
{
    public final AdAvatarElement b;

    public void AdAvatarElement$j(AdAvatarElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdAvatarElement$j.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, AdAvatarElement.class, "19")) {
             p0.s0();
          }
       }
       return;
    }
}
