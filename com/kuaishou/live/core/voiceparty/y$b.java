package com.kuaishou.live.core.voiceparty.y$b;
import androidx.fragment.app.c$b;
import com.kuaishou.live.core.voiceparty.y;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import co2.f2;
import crd.b;
import lnc.b9;
import oe6.e;
import java.lang.StringBuilder;
import z12.e;
import w51.a;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import co2.t1;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import zo2.m0;
import brd.y;

public class y$b extends c$b	// class@001ae4
{
    public final y a;

    public void y$b(y p0){
       this.a = p0;
       super();
    }
    public void f(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, y$b.class, "2")) {
          return;
       }
       y$b ta = this.a;
       p1.l = true;
       b9.a(ta.O);
       long l = e.F();
       int i = 0;
       String[] stringArray = new String[i];
       e.c("LiveVoicePartyOfflinePresenter", "onFragmentPaused: 后台排麦计时开始 "+l+"M", stringArray);
       if (l > 0) {
          TimeUnit sECONDS = (a.Q())? TimeUnit.SECONDS: TimeUnit.MINUTES;
          this.a.O = t.timer(l, sECONDS).observeOn(d.a).subscribe(new t1(this), e.b);
       }else {
          this.a.a9(i);
       }
       return;
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, y$b.class, "1")) {
          return;
       }
       y$b ta = this.a;
       p1.l = false;
       b9.a(ta.O);
       this.a.K.onNext(new m0(false, false));
       return;
    }
}
