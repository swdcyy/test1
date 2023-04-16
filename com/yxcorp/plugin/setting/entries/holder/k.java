package com.yxcorp.plugin.setting.entries.holder.k;
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
import com.yxcorp.plugin.setting.entries.holder.k$a;
import android.view.View;

public class k implements c	// class@00086f
{
    public GifshowActivity a;
    public b b;
    public c c;
    public d d;
    public j e;

    public void k(GifshowActivity p0){
       super();
       this.a = p0;
       b uob = new b();
       this.b = uob;
       uob.c = p0.getString(0x7f1031b4);
       k tb = this.b;
       tb.b = 0x7f080bf4;
       tb.h = "https://app.m.kuaishou.com/public#/personalise-reco?showtype=ns";
       this.e = new j(this.a);
    }
    public void a(){
       b.a(this);
    }
    public a getModel(){
       return this.b;
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.d = new d();
       }
       return this.d;
    }
    public boolean isAvailable(){
       return true;
    }
    public c q(){
       PresenterV2 obj = PatchProxy.apply(null, this, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          obj = new PresenterV2();
          this.c = obj;
          obj.add(new a());
          this.c.add(new k$a(this));
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
