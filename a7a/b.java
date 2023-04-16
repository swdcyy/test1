package a7a.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import bf5.q;
import a7a.a;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import le5.f;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import java.lang.Float;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;

public class b extends PresenterV2	// class@000041
{
    public SlideHorizontalAtlasPlayer p;
    public NasaBizParam q;
    public q r;
    public int s;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoidWithListener(null, this, b.class, "3")) {
          return;
       }
       if (this.P8()) {
          this.s = a1.d(0x7f070bf1);
          this.R8(this.r.h);
          this.X7(this.r.G.subscribe(new a(this), Functions.e));
       }
       PatchProxy.onMethodExit(b.class, "3");
       return;
    }
    public final boolean P8(){
       boolean b;
       b uob = b.class;
       b obj = PatchProxy.applyWithListener(null, this, uob, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (f.r()) {
          obj = this.q;
          if (obj != null && (obj.getNasaSlideParam() != null && (!this.q.getNasaSlideParam().isTrendingPage() && (!this.q.getNasaSlideParam().isHomePage() || !f.b())))) {
             b = true;
          label_0045 :
             PatchProxy.onMethodExit(uob, "5");
             return b;
          }
       }
    label_0044 :
       b = false;
       goto label_0045 ;
    }
    public final void R8(float p0){
       if (PatchProxy.isSupport2(b.class, "4") && PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(p0), this, b.class, "4")) {
          return;
       }
       if (this.P8()) {
          b tp = this.p;
          if (tp != null) {
             ViewGroup$MarginLayoutParams layoutParams = tp.getLayoutParams();
             layoutParams.bottomMargin = (int)((float)this.s * p0);
             this.p.setLayoutParams(layoutParams);
          }
       }
       PatchProxy.onMethodExit(b.class, "4");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a032f);
       PatchProxy.onMethodExit(b.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, b.class, "1")) {
          return;
       }
       this.q = this.q8(NasaBizParam.class);
       this.r = this.q8(q.class);
       PatchProxy.onMethodExit(b.class, "1");
       return;
    }
}
