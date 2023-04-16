package com.yxcorp.gifshow.profile.music.b;
import com.yxcorp.gifshow.music.utils.kottor.KPresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import y3c.q;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kob.r;
import y3c.r;
import com.gifshow.tuna.player.poi.e;
import y3c.s;
import y3c.p;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import java.util.List;
import g9c.a;
import y8c.g;
import com.yxcorp.gifshow.profile.music.CollectionMusicFragment;
import qvb.i;

public class b extends KPresenterV2	// class@001401
{
    public c q;
    public r r;
    public CollectionMusicFragment s;
    public i t;
    public boolean u;
    public g v;

    public void b(){
       super();
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       this.X7(this.s.m().subscribe(new q(this)));
       if (!PatchProxy.applyVoid(objArray, this, uob, "5")) {
          this.P8(this.W8().rx().subscribe(new r(this), e.b));
          this.P8(this.W8().Lk().subscribe(new s(this), e.b));
          this.P8(this.W8().Ri().subscribe(new p(this)));
       }
       return;
    }
    public final r W8(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.r == null) {
          this.r = d.a(-1687636538);
       }
       return this.r;
    }
    public final List X8(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.Q0();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.v = this.r8("ADAPTER");
       this.s = this.r8("FRAGMENT");
       this.t = this.r8("PAGE_LIST");
       return;
    }
}
