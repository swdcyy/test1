package kgd.d2;
import wgc.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import xgc.b;
import java.lang.String;
import android.app.Activity;
import java.lang.StringBuilder;
import o56.a;
import wgc.b;
import wgc.a;
import wgc.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o56.c;
import ml8.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ghc.a;
import kgd.d2$a;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.kwai.component.upgrade.b;

public class d2 implements c	// class@001786
{
    public b a;
    public c b;
    public d c;
    public GifshowActivity d;

    public void d2(GifshowActivity p0){
       super();
       this.d = p0;
       b uob = new b();
       this.a = uob;
       uob.c = p0.getString(0x7f10052e);
       p0.d = "V"+a.m;
    }
    public void a(){
       b.a(this);
    }
    public a getModel(){
       return this.a;
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, d2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          this.c = new d();
       }
       return this.c;
    }
    public boolean isAvailable(){
       Object obj = PatchProxy.apply(null, this, d2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (a.a().b() ^ 0x01);
    }
    public c q(){
       PresenterV2 obj = PatchProxy.apply(null, this, d2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          obj = new PresenterV2();
          this.b = obj;
          obj.add(new a());
          this.b.add(new d2$a(this));
       }
       return this.b;
    }
    public void r(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d2.class, "4")) {
          return;
       }
       d2 td = this.d;
       if (td != null && !td.isFinishing()) {
          b.a(this.d, p0.findViewById(R.id.entry_text));
       }
       return;
    }
    public int y0(){
       return 0x7f0d14cc;
    }
}
