package h33.b0;
import wgc.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import xgc.b;
import java.lang.String;
import android.app.Activity;
import h33.y;
import wgc.b;
import wgc.a;
import wgc.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import oe6.b;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import ml8.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ghc.b;
import h33.b0$a;
import android.view.View;

public class b0 implements c	// class@002c1c
{
    public b a;
    public c b;
    public y c;
    public d d;

    public void b0(GifshowActivity p0){
       super();
       b uob = new b();
       this.a = uob;
       uob.c = p0.getString(0x7f103e30);
       this.a.e = p0.getString(0x7f103e31);
       this.c = new y(p0);
    }
    public void a(){
       b.a(this);
    }
    public a getModel(){
       return this.a;
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, b0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.d = new d();
       }
       return this.d;
    }
    public boolean isAvailable(){
       Object obj = PatchProxy.apply(null, this, b0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a.getBoolean(b.d("user")+"not_share_live_stream_fragment_option", false);
    }
    public c q(){
       PresenterV2 obj = PatchProxy.apply(null, this, b0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          obj = new PresenterV2();
          this.b = obj;
          obj.add(new b());
          this.b.add(new b0$a(this));
       }
       return this.b;
    }
    public void r(View p0){
       b.b(this, p0);
    }
    public int y0(){
       return 0x7f0d14c9;
    }
}
