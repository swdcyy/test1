package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement$b;
import qp7.y0;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement;
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
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import uy6.f;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import qrd.p;
import pp7.b;

public final class AdMusicWheelElement$b extends y0	// class@001728
{
    public final AdMusicWheelElement a;

    public void AdMusicWheelElement$b(AdMusicWheelElement p0){
       this.a = p0;
       super();
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, AdMusicWheelElement$b.class, "2")) {
          return;
       }
       AdMusicWheelElement$b ta = this.a;
       if (ta.C != null) {
          AdMusicWheelElement.n0(ta).getPlayer().O(this.a.D);
          this.a.E().g();
       }
       ta = this.a;
       ta.C = false;
       String[] stringArray = new String[false];
       ta.E().k(stringArray);
       return;
    }
    public void h(){
       boolean b;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, AdMusicWheelElement$b.class, str)) {
          return;
       }
       AdMusicWheelElement$b ta = this.a;
       Objects.requireNonNull(ta);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(objArray, ta, AdMusicWheelElement.class, "11");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(SlidePerformanceExp.d().b()){
          b = false;
       }else {
          Boolean uBoolean = PatchProxy.apply(objArray, ta, AdMusicWheelElement.class, str);
          if (uBoolean == patchProxyRe) {
             uBoolean = ta.B.getValue();
          }
          b = uBoolean.booleanValue() ^ 0x01;
       }
       ta.C = b;
       this.a.s0();
       ta = this.a;
       if (ta.C != null) {
          AdMusicWheelElement.n0(ta).getPlayer().w(this.a.D);
          this.a.E().l();
       }else {
          r or = ta.E();
          Objects.requireNonNull(or);
          if (!PatchProxy.applyVoid(objArray, or, r.class, "13")) {
             or.g.f(Boolean.TRUE);
          }
       }
       return;
    }
}
