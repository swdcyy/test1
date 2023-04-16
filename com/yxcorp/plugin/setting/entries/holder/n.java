package com.yxcorp.plugin.setting.entries.holder.n;
import wgc.c;
import com.kwai.framework.model.user.QCurrentUser;
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
import lt7.b;
import ml8.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ghc.a;
import com.yxcorp.plugin.setting.entries.holder.n$a;
import android.view.View;

public class n implements c	// class@00087b
{
    public GifshowActivity a;
    public b b;
    public c c;
    public d d;
    public TextView e;
    public static final boolean f;

    static {
       n.f = QCurrentUser.ME.isAllowKnockU() ^ 0x01;
    }
    public void n(GifshowActivity p0){
       super();
       this.a = p0;
       b uob = new b();
       this.b = uob;
       uob.c = p0.getString(0x7f1046e5);
       p0.b = 0x7f080f6f;
    }
    public void a(){
       b.a(this);
    }
    public a getModel(){
       return this.b;
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, n.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.d = new d();
       }
       return this.d;
    }
    public boolean isAvailable(){
       Object obj = PatchProxy.apply(null, this, n.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a();
    }
    public c q(){
       PresenterV2 obj = PatchProxy.apply(null, this, n.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          obj = new PresenterV2();
          this.c = obj;
          obj.add(new a());
          this.c.add(new n$a(this));
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
