package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement$g;
import erd.g;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e17.i$b;
import e17.i;
import lnc.i3;
import p1a.a$a;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.a;
import tl8.g;
import p1a.a;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class AdMusicWheelElement$g implements g	// class@00172d
{
    public final AdMusicWheelElement b;

    public void AdMusicWheelElement$g(AdMusicWheelElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdMusicWheelElement$g.class, "1")) {
       }else {
          p0 = new i$b();
          p0.x(R.string.arg_RES_7f104a4b);
          p0.l(true);
          i.z(p0);
          p0 = i3.f();
          p0.d("button_type", this.b.q0("button_type"));
          p0.d("is_turn", this.b.q0("is_turn"));
          p0.d("is_unfold", this.b.q0("is_unfold"));
          a$a uoa = a$a.c("MUSIC_TURNTABLE_BUTTON", "");
          uoa.h(new a(this));
          uoa.m(p0.e());
          uoa.r(true);
          AdMusicWheelElement.o0(this.b).a(uoa);
       }
       return;
    }
}
