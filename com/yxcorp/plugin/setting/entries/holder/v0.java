package com.yxcorp.plugin.setting.entries.holder.v0;
import wgc.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import xgc.b;
import java.lang.String;
import android.app.Activity;
import com.yxcorp.plugin.setting.helper.j;
import wgc.b;
import wgc.a;
import wgc.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ml8.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ghc.a;
import com.yxcorp.plugin.setting.entries.holder.v0$a;
import android.view.View;

public class v0 implements c	// class@00089a
{
    public GifshowActivity a;
    public b b;
    public c c;
    public d d;
    public j e;
    public h f;

    public void v0(GifshowActivity p0){
       super();
       this.a = p0;
       b uob = new b();
       this.b = uob;
       uob.c = p0.getString(0x7f105094);
       this.b.b = 0x7f080522;
       this.e = new j(p0);
    }
    public void a(){
       b.a(this);
    }
    public a getModel(){
       return this.b;
    }
    public d h(){
       v0 obj = PatchProxy.apply(null, this, v0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          d uod = new d();
          this.d = uod;
       }
       return this.d;
    }
    public boolean isAvailable(){
       return true;
    }
    public c q(){
       v0 obj = PatchProxy.apply(null, this, v0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.c = presenterV2;
          presenterV2.add(new a());
          obj = this.c;
          obj.add(new v0$a(this));
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
