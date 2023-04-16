package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement$d;
import com.kwai.framework.player.core.b$b;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import ss7.s;
import java.util.Objects;
import qp7.x0;
import qp7.b;
import ss7.r;

public final class AdMusicWheelElement$d implements b$b	// class@00172a
{
    public final AdMusicWheelElement b;

    public void AdMusicWheelElement$d(AdMusicWheelElement p0){
       this.b = p0;
       super();
    }
    public final void d(int p0){
       AdMusicWheelElement$d uod = AdMusicWheelElement$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "1")) {
          return;
       }
       if (p0 != 3) {
          if (p0 == 4) {
             Objects.requireNonNull(s.e);
             this.b.E().i();
          }
       }else {
          this.b.E().l();
       }
       return;
    }
}
