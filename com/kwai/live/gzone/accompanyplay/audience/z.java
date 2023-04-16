package com.kwai.live.gzone.accompanyplay.audience.z;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import k37.p;
import erd.g;
import crd.b;
import mrd.c;
import com.kwai.live.gzone.accompanyplay.audience.z$a;
import j37.d;
import j37.c;
import cjd.e;
import erd.o;
import com.kwai.live.gzone.accompanyplay.audience.z$b;
import o37.a;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameDownloadConfig;
import android.view.View;
import ekd.m1;
import com.kwai.live.gzone.accompanyplay.audience.d0$e;

public class z extends PresenterV2	// class@000bcc
{
    public k0$g p;
    public boolean q;
    public View r;
    public boolean s;
    public a t;
    public d0$e u;

    public void z(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, z.class, "3")) {
          return;
       }
       this.q = true;
       this.s = false;
       this.X7(this.p.n().subscribe(new p(this)));
       this.X7(this.p.f().subscribe(new z$a(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, z.class, "7")) {
          return;
       }
       this.t = null;
       return;
    }
    public void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "4")) {
          return;
       }
       if (this.q == null) {
          return;
       }
       this.q = false;
       this.X7(c.b().j(p0).map(new e()).subscribe(new z$b(this)));
       return;
    }
    public void R8(){
       z tt;
       if (PatchProxy.applyVoid(null, this, z.class, "5")) {
          return;
       }
       int i = 0;
       if (this.s != null) {
          tt = this.t;
          if (tt != null && tt.mGameChannelLimit != null) {
             LiveGzoneAccompanyGameInfo mGameDownloa = tt.mGameInfo.mGameDownloadConfig;
             if (mGameDownloa != null && mGameDownloa.mGameCenterUrl != null) {
                tt = 1;
             label_0026 :
                if (tt) {
                   this.r.setVisibility(i);
                }else {
                   this.r.setVisibility(8);
                }
                return;
             }
          }
       }
       tt = null;
       goto label_0026 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "1")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a11ff);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, z.class, "2")) {
          return;
       }
       this.p = this.r8("LIVE_GZONE_AUDIENCE_ACCOMPANY_INNER_SERVICE");
       this.u = this.q8(d0$e.class);
       return;
    }
}
