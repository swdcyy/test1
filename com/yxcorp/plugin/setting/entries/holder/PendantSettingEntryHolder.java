package com.yxcorp.plugin.setting.entries.holder.PendantSettingEntryHolder;
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
import ml8.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ghc.a;
import com.yxcorp.plugin.setting.entries.holder.PendantSettingEntryHolder$PendantSettingPresenter;
import android.view.View;
import vgc.b;
import tkd.b;
import tkd.d;
import vt5.c;

public class PendantSettingEntryHolder implements c	// class@000843
{
    public GifshowActivity a;
    public b b;
    public c c;
    public d d;

    public void PendantSettingEntryHolder(GifshowActivity p0){
       super();
       this.a = p0;
       b uob = new b();
       this.b = uob;
       uob.c = p0.getString(0x7f1031fd);
       p0.f = 0x7f081084;
    }
    public void a(){
       b.a(this);
    }
    public a getModel(){
       return this.b;
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, PendantSettingEntryHolder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.d = new d();
       }
       return this.d;
    }
    public boolean isAvailable(){
       return false;
    }
    public c q(){
       PresenterV2 obj = PatchProxy.apply(null, this, PendantSettingEntryHolder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          obj = new PresenterV2();
          this.c = obj;
          obj.add(new a());
          this.c.add(new PendantSettingEntryHolder$PendantSettingPresenter());
       }
       return this.c;
    }
    public void r(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PendantSettingEntryHolder.class, "3")) {
          return;
       }
       PendantSettingEntryHolder ta = this.a;
       if (ta != null && !ta.isFinishing()) {
          b.c("PENDANT", 0);
          d.a(0x2e5315fc).mb(this.a);
       }
       return;
    }
    public int y0(){
       return 0x7f0d14ca;
    }
}
