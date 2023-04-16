package com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement$j;
import erd.g;
import com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ss7.s;
import java.util.Objects;
import qp7.x0;
import qp7.b;
import ss7.r;

public final class MusicWheelElement$j implements g	// class@0014be
{
    public final MusicWheelElement b;

    public void MusicWheelElement$j(MusicWheelElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicWheelElement$j.class, "1")) {
       }else if(this.b.G != null){
          a.o(p0, "showPause");
          if (p0.booleanValue()) {
             Objects.requireNonNull(s.e);
             this.b.E().i();
          }else {
             this.b.E().l();
          }
       }
       return;
    }
}
