package ey2.d;
import com.kuaishou.live.viewcontroller.ViewController;
import lnc.a1;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import qu2.a;
import co2.f2;
import hf3.a;
import n91.e;
import zq5.b;
import io.reactivex.subjects.PublishSubject;
import crd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.SCVoicePartyEnterRoomNotice;
import ey2.a;
import lf3.g;
import java.util.concurrent.TimeUnit;
import brd.t;
import ey2.b;
import erd.g;
import com.kuaishou.live.core.voiceparty.d0;
import crd.b;
import com.kuaishou.live.core.show.enterroom.floatingscreen.biz.voiceparty.LiveVoicePartyEnterRoomData;
import ey2.d$b;
import gr5.a;
import kr5.a;
import android.animation.ObjectAnimator;

public class d extends ViewController	// class@002815
{
    public final PublishSubject j;
    public final f2 k;
    public final a l;
    public final a m;
    public final e n;
    public b o;
    public ObjectAnimator p;
    public final a q;
    public static final int r;
    public static final int s;
    public static final int t;

    static {
       d.r = - a1.e(40.00f);
       d.s = a.a().a().getResources().getColor(0x7f060726);
       d.t = a.a().a().getResources().getColor(0x7f0603ed);
    }
    public void d(a p0,f2 p1,a p2,e p3,b p4){
       super();
       this.j = PublishSubject.g();
       this.q = new a();
       this.l = p0;
       this.k = p1;
       this.m = p2;
       this.o = p4;
       this.n = p3;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.m.u0(438, SCVoicePartyEnterRoomNotice.class, new a(this));
       this.q.c(this.j.throttleFirst(5, TimeUnit.SECONDS).subscribe(new b(this), d0.s("LiveVoicePartyEnterRoomEffectPresenter", "showWelcomeTip")));
       d to = this.o;
       if (to != null) {
          to.v9(2, LiveVoicePartyEnterRoomData.class, null, new d$b(this));
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.q.dispose();
       return;
    }
    public void V2(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       d tp = this.p;
       if (tp != null && tp.isRunning()) {
          this.p.cancel();
       }
       return;
    }
}
