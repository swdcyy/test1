package com.kuaishou.live.core.voiceparty.y;
import c12.f;
import mrd.c;
import com.kuaishou.live.core.voiceparty.y$a;
import com.kuaishou.live.core.voiceparty.y$b;
import co2.r1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import zo2.m0;
import brd.y;
import t02.a0;
import mq5.h;
import mq5.b;
import o56.a;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import kq5.b;
import androidx.fragment.app.c$b;
import crd.b;
import lnc.b9;
import z12.e;
import co2.f2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.voiceparty.a;
import lm6.a;
import co2.s1;
import erd.g;
import eoc.f;

public class y extends f	// class@001ae5
{
    public final c K;
    public f2 L;
    public a M;
    public a0 N;
    public b O;
    public Application$ActivityLifecycleCallbacks P;
    public c$b Q;
    public final h R;
    public static String sLivePresenterClassName = "LiveVoicePartyOfflinePresenter";

    public void y(c p0){
       super();
       this.P = new y$a(this);
       this.Q = new y$b(this);
       this.R = new r1(this);
       this.K = p0;
    }
    public void Q(boolean p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oy, "4")) {
          return;
       }
       this.K.onNext(new m0(true, false));
       this.N.D2.le(this.R);
       a.B.unregisterActivityLifecycleCallbacks(this.P);
       this.N.P().a(this.Q);
       b9.a(this.O);
       this.a9(false);
       return;
    }
    public void a9(boolean p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oy, "2")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveVoicePartyOfflinePresenter", "goOffline 8", stringArray);
       this.K.onNext(new m0(true, p0));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y.class, "1")) {
          return;
       }
       super.j8();
       this.L = this.q8(f2.class);
       this.M = this.q8(a.class);
       this.N = this.q8(a0.class);
       return;
    }
    public void x(boolean p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oy, "5")) {
          return;
       }
       this.K.onNext(new m0(false, false));
       this.N.D2.Km(this.R);
       a.B.registerActivityLifecycleCallbacks(this.P);
       this.N.P().c(this.Q);
       this.X7(f.a(a.class, new s1(this)));
       return;
    }
}
