package com.kwai.live.gzone.follow.fullscreen.c;
import com.smile.gifmaker.mvps.presenter.a;
import com.kwai.live.gzone.follow.fullscreen.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g57.n;
import g57.g;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;

public class c extends a	// class@000cfb
{
    public n r;

    public void c(){
       super();
       this.U7(new b());
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.X7(this.r.a.subscribe(new g(this), Functions.e));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.r = this.q8(n.class);
       return;
    }
}
