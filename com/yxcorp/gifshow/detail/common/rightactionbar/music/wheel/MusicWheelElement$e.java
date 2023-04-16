package com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement$e;
import erd.g;
import com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.music.Music;
import lnc.d6;
import py9.w;
import android.app.Activity;

public final class MusicWheelElement$e implements g	// class@0014b9
{
    public final MusicWheelElement b;

    public void MusicWheelElement$e(MusicWheelElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicWheelElement$e.class, "1")) {
       }else {
          a.o(p0, "photo");
          this.b.t = p0;
          p0 = this.b;
          p0.D = d6.c(MusicWheelElement.p0(p0));
          p0 = this.b;
          QPhoto qPhoto = MusicWheelElement.p0(p0);
          MusicWheelElement$e tb = this.b;
          MusicWheelElement d = tb.D;
          MusicWheelElement v = tb.v;
          if (v == null) {
             a.S("mActivity");
          }
          p0.E = new w(qPhoto, d, v);
          this.b.z0();
       }
       return;
    }
}
