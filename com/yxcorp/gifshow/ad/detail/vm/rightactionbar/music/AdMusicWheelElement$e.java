package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement$e;
import erd.g;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.music.Music;
import lnc.d6;

public final class AdMusicWheelElement$e implements g	// class@00172b
{
    public final AdMusicWheelElement b;

    public void AdMusicWheelElement$e(AdMusicWheelElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdMusicWheelElement$e.class, "1")) {
       }else {
          a.o(p0, "photo");
          this.b.t = p0;
          p0 = this.b;
          p0.A = d6.c(AdMusicWheelElement.p0(p0));
          this.b.s0();
       }
       return;
    }
}
