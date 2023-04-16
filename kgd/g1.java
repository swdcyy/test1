package kgd.g1;
import wgc.c;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wgc.a;
import wgc.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ml8.c;
import ghc.a;
import android.view.View;
import android.view.View$OnClickListener;

public class g1 implements c	// class@001790
{
    public View$OnClickListener a;
    public b b;
    public d c;
    public n d;
    public boolean e;
    public boolean f;
    public c g;

    public void g1(){
       super();
       this.e = true;
       this.g = new PresenterV2();
    }
    public void a(){
    }
    public a getModel(){
       return this.b;
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, g1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          this.c = new d();
       }
       return this.c;
    }
    public boolean isAvailable(){
       return this.e;
    }
    public c q(){
       Object obj = PatchProxy.apply(null, this, g1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f == null) {
          this.f = true;
          this.g.add(new a());
       }
       return this.g;
    }
    public void r(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g1.class, "3")) {
          return;
       }
       g1 ta = this.a;
       if (ta != null) {
          ta.onClick(p0);
       }
       return;
    }
    public int y0(){
       return 0x7f0d11ae;
    }
}
