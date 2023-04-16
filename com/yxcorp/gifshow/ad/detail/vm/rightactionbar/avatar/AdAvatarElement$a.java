package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$a;
import n3d.a;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;

public final class AdAvatarElement$a implements a	// class@00170d
{
    public final AdAvatarElement b;

    public void AdAvatarElement$a(AdAvatarElement p0){
       this.b = p0;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(AdAvatarElement$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, AdAvatarElement$a.class, "1")) {
          return;
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       if (qCurrentUser.isLogined()) {
          this.b.q0();
       }
       return;
    }
}
