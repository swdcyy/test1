package dlc.h1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dlc.h1$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tf5.a;
import com.kwai.component.photo.detail.slide.widget.SlidePlayTrendingBottomLayout$a;
import com.kwai.component.photo.detail.slide.widget.SlidePlayTrendingBottomLayout;
import im8.f;
import tf5.b;
import com.kwai.component.photo.detail.slide.widget.SlidePlayTrendingTopLayout$a;
import com.kwai.component.photo.detail.slide.widget.SlidePlayTrendingTopLayout;
import df5.b;
import hf5.b;
import android.view.View;
import ekd.m1;

public class h1 extends PresenterV2	// class@00224e
{
    public SlidePlayTrendingBottomLayout p;
    public SlidePlayTrendingTopLayout q;
    public View r;
    public b s;
    public final b t;
    public f u;
    public String v;

    public void h1(){
       super();
       this.t = new h1$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h1.class, "3")) {
          return;
       }
       this.p.setAdapter(new a());
       boolean b = (this.u.get() != null && (this.u.get()).equals("nearby"))? true: false;
       this.q.setAdapter(new b(b, (this.v).equals("true")));
       this.s.De(this.t);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h1.class, "4")) {
          return;
       }
       this.s.c3(this.t);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h1.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a4067);
       this.q = m1.f(p0, 0x7f0a407c);
       this.r = m1.f(p0, 0x7f0a3023);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h1.class, "1")) {
          return;
       }
       this.u = this.x8("TRENDING_REQUEST_SOURCE");
       this.v = this.r8("TRENDING_REQUEST_IS_RISING_TRENDING");
       this.s = this.q8(b.class);
       return;
    }
}
