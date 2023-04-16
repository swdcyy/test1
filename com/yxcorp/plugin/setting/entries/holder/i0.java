package com.yxcorp.plugin.setting.entries.holder.i0;
import wgc.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import xgc.b;
import java.lang.String;
import android.app.Activity;
import wgc.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import oe6.a;
import wgc.a;
import wgc.d;
import com.yxcorp.plugin.setting.utils.SettingPageExperiment;
import qrd.p;
import ml8.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ghc.a;
import com.yxcorp.plugin.setting.entries.holder.i0$a;
import android.view.View;

public class i0 implements c	// class@000864
{
    public GifshowActivity a;
    public b b;
    public c c;
    public d d;
    public TextView e;

    public void i0(GifshowActivity p0){
       super();
       this.a = p0;
       b uob = new b();
       this.b = uob;
       uob.c = p0.getString(0x7f1046c7);
       p0.b = 0x7f080be5;
    }
    public void a(){
       b.a(this);
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, i0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (a.i() ^ 0x01);
    }
    public a getModel(){
       return this.b;
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, i0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.d = new d();
       }
       return this.d;
    }
    public boolean isAvailable(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Boolean obj = PatchProxy.apply(null, this, i0.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, null, SettingPageExperiment.class, "2");
       if (obj == patchProxyRe) {
          obj = SettingPageExperiment.b.getValue();
       }
       return obj.booleanValue();
    }
    public c q(){
       PresenterV2 obj = PatchProxy.apply(null, this, i0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          obj = new PresenterV2();
          this.c = obj;
          obj.add(new a());
          this.c.add(new i0$a(this));
       }
       return this.c;
    }
    public void r(View p0){
       b.b(this, p0);
    }
    public int y0(){
       return 0x7f0d11ae;
    }
}
