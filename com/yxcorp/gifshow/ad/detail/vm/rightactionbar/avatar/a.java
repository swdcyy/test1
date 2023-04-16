package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement;

public final class a implements Runnable	// class@001722
{
    public final AdAvatarElement$k b;

    public void a(AdAvatarElement$k p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.b.b.y0();
       return;
    }
}
