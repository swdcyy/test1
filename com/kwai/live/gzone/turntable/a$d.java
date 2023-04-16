package com.kwai.live.gzone.turntable.a$d;
import r67.a;
import com.kwai.live.gzone.turntable.a;
import java.lang.Object;
import lp3.e;
import lp3.c;
import lp3.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import lnc.a1;
import android.widget.ScrollView;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger;
import n77.c0;
import mrd.c;
import n77.e;
import com.kwai.library.widget.popup.common.c;
import java.lang.Integer;
import brd.y;

public class a$d implements a	// class@000e2d
{
    public int b;
    public final a c;

    public void a$d(a p0){
       this.c = p0;
       super();
       this.b = 0;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void j7(){
       if (PatchProxy.applyVoid(null, this, a$d.class, "3")) {
          return;
       }
       a$d tc = this.c;
       a q = tc.q;
       if (q != null) {
          q.smoothScrollTo(0, (tc.u.getTop() - a1.e(16.00f)));
       }
       return;
    }
    public int kd(){
       return this.b;
    }
    public void km(){
       a$d uod = a$d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "2")) {
          return;
       }
       if (a1.i(this.c.getActivity())) {
          a z = this.c.z;
          Objects.requireNonNull(z);
          if (!PatchProxy.applyVoid(objArray, z, LiveGzoneTurntableLogger.class, "15")) {
             z.j("LIVE_TURNTABLE_LACK_DIALOG");
          }
          if (!PatchProxy.applyVoid(objArray, this, uod, "4")) {
             c0 uoc0 = new c0(this.c.getActivity());
             uoc0.c(this.c.z);
             uoc0.b(this.c.A);
             uoc0.d = new e(this);
             uoc0.a();
          }
       }
       return;
    }
    public void setOpportunityCount(int p0){
       a$d uod = a$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "1")) {
          return;
       }
       this.b = p0;
       this.c.B.onNext(Integer.valueOf(p0));
       return;
    }
}
