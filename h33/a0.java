package h33.a0;
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
import ghc.b;
import h33.a0$a;
import android.view.View;

public class a0 implements c	// class@002c18
{
    public b a;
    public c b;
    public d c;

    public void a0(GifshowActivity p0){
       super();
       b uob = new b();
       this.a = uob;
       uob.c = p0.getString(0x7f103e64);
       p0.f = 0x7f081084;
    }
    public void a(){
       b.a(this);
    }
    public a getModel(){
       return this.a;
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, a0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          this.c = new d();
       }
       return this.c;
    }
    public boolean isAvailable(){
       return true;
    }
    public c q(){
       PresenterV2 obj = PatchProxy.apply(null, this, a0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          obj = new PresenterV2();
          this.b = obj;
          obj.add(new b());
          this.b.add(new a0$a(this));
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
