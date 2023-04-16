package com.yxcorp.plugin.setting.entries.holder.y;
import wgc.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.kwai.framework.model.user.QCurrentUser;
import xgc.b;
import java.lang.String;
import android.app.Activity;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.plugin.setting.entries.holder.w;
import wgc.b;
import wgc.a;
import wgc.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ml8.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ghc.a;
import com.yxcorp.plugin.setting.entries.holder.y$a;
import android.view.View;

public class y implements c	// class@0008a0
{
    public GifshowActivity a;
    public b b;
    public c c;
    public d d;
    public ImageView e;
    public int f;
    public PublishSubject g;
    public g h;

    public void y(GifshowActivity p0){
       super();
       this.f = QCurrentUser.ME.getOnlineStatusSetting();
       this.a = p0;
       b uob = new b();
       this.b = uob;
       uob.c = p0.getString(0x7f103aa7);
       p0.b = 0x7f082295;
       this.g = PublishSubject.g();
       this.h = w.b;
    }
    public void a(){
       b.a(this);
    }
    public a getModel(){
       return this.b;
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, y.class, "2");
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
       PresenterV2 obj = PatchProxy.apply(null, this, y.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          obj = new PresenterV2();
          this.c = obj;
          obj.add(new a());
          this.c.add(new y$a(this));
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
