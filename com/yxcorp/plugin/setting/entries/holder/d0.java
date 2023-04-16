package com.yxcorp.plugin.setting.entries.holder.d0;
import wgc.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import xgc.b;
import java.lang.String;
import android.app.Activity;
import wgc.b;
import wgc.a;
import wgc.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import oe6.b;
import ml8.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.entries.holder.d0$a;
import ghc.a;
import android.view.View;
import k2b.e0;
import nc5.i;
import vgc.b;
import tkd.b;
import tkd.d;
import nl9.d;
import com.yxcorp.gifshow.commercial.model.AdDownloadCenterSource;
import android.content.Context;

public class d0 implements c	// class@00084b
{
    public b a;
    public c b;
    public GifshowActivity c;
    public d d;

    public void d0(GifshowActivity p0){
       super();
       this.c = p0;
       b uob = new b();
       this.a = uob;
       uob.c = p0.getString(0x7f103c0b);
       p0.f = 0x7f081084;
    }
    public void a(){
       b.a(this);
    }
    public a getModel(){
       return this.a;
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, d0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.d = new d();
       }
       return this.d;
    }
    public boolean isAvailable(){
       Object obj = PatchProxy.apply(null, this, d0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (b.f() ^ 0x01);
    }
    public c q(){
       PresenterV2 obj = PatchProxy.apply(null, this, d0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          obj = new PresenterV2();
          this.b = obj;
          obj.add(new d0$a(this));
          this.b.add(new a());
       }
       return this.b;
    }
    public void r(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "4")) {
          return;
       }
       d0 tc = this.c;
       if (tc != null && !tc.isFinishing()) {
          i.b(1022, this.c);
          b.b("enter_download_page", 1032);
          d.a(0x4bd38ddd).W10(this.c, AdDownloadCenterSource.FROM_SETTING);
       }
       return;
    }
    public int y0(){
       return 0x7f0d14ca;
    }
}
