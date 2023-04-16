package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement$h;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.i3;
import p1a.a$a;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement$h$a;
import tl8.g;
import p1a.a;

public final class AdMusicWheelElement$h implements Runnable	// class@00172f
{
    public final AdMusicWheelElement b;

    public void AdMusicWheelElement$h(AdMusicWheelElement p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, AdMusicWheelElement$h.class, "1")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("button_type", this.b.q0("button_type"));
       oi3.d("is_turn", this.b.q0("is_turn"));
       a$a uoa = a$a.t("MUSIC_TURNTABLE_BUTTON", "");
       uoa.h(new AdMusicWheelElement$h$a(this));
       uoa.m(oi3.e());
       uoa.r(true);
       AdMusicWheelElement.o0(this.b).b(uoa);
       return;
    }
}
