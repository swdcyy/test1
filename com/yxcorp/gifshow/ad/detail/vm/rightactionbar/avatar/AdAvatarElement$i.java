package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$i;
import erd.g;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import java.lang.Runnable;

public final class AdAvatarElement$i implements g	// class@001715
{
    public final AdAvatarElement b;

    public void AdAvatarElement$i(AdAvatarElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdAvatarElement$i.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (PatchProxy.applyVoid(null, p0, AdAvatarElement.class, "17") || (!VisitorModeManager.g(2) && p0.G == null)) {
             p0 = p0.I;
             if (p0 != null) {
                p0.run();
             }
          }
       }
       return;
    }
}
