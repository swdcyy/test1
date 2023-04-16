package com.yxcorp.gifshow.follow.stagger.presenter.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eja.e;
import im8.f;
import brd.t;
import xl8.b;
import eja.f;
import kga.c;
import erd.g;
import crd.b;

public class a extends PresenterV2	// class@001208
{
    public f p;
    public b q;
    public int r;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.p.set(new e(this));
       this.X7(this.q.observable().subscribe(new f(this), c.a));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.x8("FOLLOW_LIVE_AUTO_PLAYING_SUPPLIER");
       this.q = this.r8("HOME_LIVE_AUTO_PLAYING");
       return;
    }
}
