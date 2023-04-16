package kgd.c;
import wgc.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import xgc.b;
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
import kgd.d;
import android.view.View;

public final class c implements c	// class@00177f
{
    public final b a;
    public PresenterV2 b;
    public d c;

    public void c(GifshowActivity p0){
       a.p(p0, "activity");
       super();
       b uob = new b();
       this.a = uob;
       uob.c = p0.getString(0x7f1046bf);
       uob.b = 0x7f080bdf;
    }
    public void a(){
       b.a(this);
    }
    public a getModel(){
       return this.a;
    }
    public d h(){
       c obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          this.c = new d();
       }
       obj = this.c;
       if (obj == null) {
          a.S("callerContext");
       }
       return obj;
    }
    public boolean isAvailable(){
       return true;
    }
    public c q(){
       c uoc = PatchProxy.applyWithListener(null, this, c.class, "1");
       if (uoc != PatchProxyResult.class) {
       }else if(this.b == null){
          PresenterV2 presenterV2 = new PresenterV2();
          this.b = presenterV2;
          presenterV2.U7(new a());
          uoc = this.b;
          if (uoc == null) {
             a.S("presenter");
          }
          uoc.U7(new d());
       }
       uoc = this.b;
       if (uoc == null) {
          a.S("presenter");
       }
       PatchProxy.onMethodExit(c.class, "1");
       return uoc;
    }
    public void r(View p0){
       b.b(this, p0);
    }
    public int y0(){
       return 0x7f0d11ae;
    }
}
