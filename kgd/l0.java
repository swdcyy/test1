package kgd.l0;
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
import android.content.SharedPreferences;
import ml8.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ghc.a;
import kgd.l0$a;
import android.view.View;

public class l0 implements c	// class@0017a0
{
    public GifshowActivity a;
    public b b;
    public c c;
    public d d;
    public String e;

    public void l0(GifshowActivity p0){
       super();
       this.e = "BE_AT_LIST";
       this.a = p0;
       b uob = new b();
       this.b = uob;
       uob.c = p0.getString(0x7f100247);
       p0.b = 0x7f080517;
    }
    public void a(){
       b.a(this);
    }
    public a getModel(){
       return this.b;
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, l0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.d = new d();
       }
       return this.d;
    }
    public boolean isAvailable(){
       Object obj = PatchProxy.apply(null, this, l0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a.getBoolean("show_at_me_tab_settings", false);
    }
    public c q(){
       PresenterV2 obj = PatchProxy.apply(null, this, l0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          obj = new PresenterV2();
          this.c = obj;
          obj.add(new a());
          this.c.add(new l0$a(this));
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
