package com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement$b;
import qp7.y0;
import com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import de5.a;
import p5a.e;
import com.kwai.framework.player.core.b$b;
import com.kwai.framework.player.core.b;
import qp7.x0;
import qp7.b;
import ss7.r;
import java.util.Objects;
import pp7.b;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import uy6.d;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import s0d.e;

public final class MusicWheelElement$b extends y0	// class@0014b6
{
    public final MusicWheelElement a;

    public void MusicWheelElement$b(MusicWheelElement p0){
       this.a = p0;
       super();
    }
    public void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MusicWheelElement$b.class, "2")) {
          return;
       }
       MusicWheelElement$b ta = this.a;
       if (ta.G != null) {
          MusicWheelElement.n0(ta).getPlayer().O(this.a.H);
          this.a.E().g();
       }
       ta = this.a;
       ta.G = false;
       if (ta.E().h()) {
          r or = this.a.E();
          Objects.requireNonNull(or);
          if (!PatchProxy.applyVoid(objArray, or, r.class, "11")) {
             Boolean fALSE = Boolean.FALSE;
             if (a.g(or.f.a(), fALSE) ^ 0x01) {
                or.f.f(fALSE);
             }
          }
       }
       if (SlidePerformanceExp.a().b()) {
          e[] uoeArray = new e[false];
          this.a.E().j(uoeArray);
       }else {
          String[] stringArray = new String[false];
          this.a.E().k(stringArray);
       }
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, MusicWheelElement$b.class, "1")) {
          return;
       }
       MusicWheelElement$b ta = this.a;
       ta.G = ta.r0();
       this.a.z0();
       ta = this.a;
       if (ta.G != null) {
          e player = MusicWheelElement.n0(ta).getPlayer();
          a.o(player, "mDetailPlayModule.player");
          ta.x0(player.b());
          MusicWheelElement.n0(this.a).getPlayer().w(this.a.H);
       }
       return;
    }
}
