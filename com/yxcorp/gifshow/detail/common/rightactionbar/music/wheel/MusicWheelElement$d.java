package com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement$d;
import com.kwai.framework.player.core.b$b;
import com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public final class MusicWheelElement$d implements b$b	// class@0014b8
{
    public final MusicWheelElement b;

    public void MusicWheelElement$d(MusicWheelElement p0){
       this.b = p0;
       super();
    }
    public final void d(int p0){
       MusicWheelElement$d uod = MusicWheelElement$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "1")) {
          return;
       }
       this.b.x0(p0);
       return;
    }
}
