package com.kuaishou.live.core.show.increasefans.b;
import k51.c;
import com.kuaishou.live.core.show.increasefans.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import mq5.h;
import mq5.b;
import com.kuaishou.live.core.show.increasefans.c;
import java.util.Objects;
import androidx.lifecycle.MutableLiveData;
import x61.c;
import lp3.c;
import lp3.e;
import brd.t;
import ry1.b;
import ha2.b;
import s91.d;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.increasefans.a;
import android.view.View$OnClickListener;
import nl8.o;
import nl8.n;

public class b extends c	// class@000c62
{
    public a0 p;
    public KwaiDialogFragment q;
    public c r;
    public final h s;
    public static String sLivePresenterClassName = "LiveAudienceIncreaseFansSettingPresenter";

    public void b(){
       super();
       this.s = new b$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "3")) {
          return;
       }
       this.p.D2.Km(this.s);
       c uoc = this.P8();
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoid(objArray, uoc, c.class, "2")) {
          uoc.c.setValue(uoc.b);
          uoc.a.a(c.class).v1(uoc.c);
       }
       this.X7(this.p.b3.W().subscribe(new b(this), new d()));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "5")) {
          return;
       }
       this.p.D2.le(this.s);
       x.E(this.q);
       c uoc = this.P8();
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoid(objArray, uoc, c.class, "3")) {
          uoc.a.a(c.class).O0(1034);
       }
       return;
    }
    public final c P8(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.r == null) {
          this.r = new c(new a(this));
       }
       return this.r;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.P8().i(n.a(this));
       return;
    }
}
