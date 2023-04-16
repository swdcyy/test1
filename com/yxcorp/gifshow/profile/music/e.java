package com.yxcorp.gifshow.profile.music.e;
import com.yxcorp.gifshow.music.utils.kottor.KPresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import y3c.s0;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kob.r;
import y3c.t0;
import com.gifshow.tuna.player.poi.e;
import y3c.u0;
import y3c.r0;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import g9c.a;
import tkd.b;
import tkd.d;
import y8c.g;
import com.yxcorp.gifshow.profile.music.ProfileMusicFragment;
import qvb.i;

public class e extends KPresenterV2	// class@001404
{
    public c q;
    public r r;
    public i s;
    public ProfileMusicFragment t;
    public boolean u;
    public g v;

    public void e(){
       super();
    }
    public void E8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "3")) {
          return;
       }
       this.X7(this.t.m().subscribe(new s0(this)));
       if (!PatchProxy.applyVoid(objArray, this, uoe, "5")) {
          this.P8(this.X8().rx().subscribe(new t0(this), e.b));
          this.P8(this.X8().Lk().subscribe(new u0(this), e.b));
          this.P8(this.X8().Ri().subscribe(new r0(this)));
       }
       return;
    }
    public final List W8(){
       Object obj = PatchProxy.apply(null, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.Q0();
    }
    public final r X8(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.r == null) {
          this.r = d.a(-1687636538);
       }
       return this.r;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.v = this.r8("ADAPTER");
       this.t = this.r8("FRAGMENT");
       this.s = this.r8("PAGE_LIST");
       return;
    }
}
