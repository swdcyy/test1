package h8a.c;
import com.yxcorp.gifshow.detail.slidev2.presenter.e;
import android.graphics.RectF;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import java.lang.Math;
import h8a.b;
import msd.r;
import java.lang.Number;
import ekd.m1;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;

public class c extends e	// class@0025e1
{
    public View G;
    public View H;
    public View I;
    public static final RectF J;

    static {
       c.J = new RectF();
    }
    public void c(){
       super();
    }
    public static RectF e9(c p0,RectF p1,float p2,float p3,float p4){
       RectF rectF;
       Objects.requireNonNull(p0);
       if (PatchProxy.isSupport(c.class)) {
          rectF = PatchProxy.applyFourRefs(p1, Float.valueOf(p2), Float.valueOf(p3), Float.valueOf(p4), p0, c.class, "4");
          if (rectF != PatchProxyResult.class) {
          label_0085 :
             return rectF;
          }
       }
       rectF = c.J;
       rectF.setEmpty();
       RectF rectF1 = p0.X8(p0.H);
       p3 = Math.min((p2 / rectF1.width()), (p3 / rectF1.height()));
       rectF1.width();
       float f = rectF1.height() * p3;
       float f1 = p1.width() * p3;
       p3 = p3 * p1.height();
       RectF top = p1.top;
       float f2 = top - ((top - ((- (p3 - f)) / 2.00f)) * p4);
       p2 = ((p2 - f1) / 2.00f) * p4;
       rectF.set(p2, f2, ((p1.width() - ((p1.width() - f1) * p4)) + p2), ((p1.height() - ((p1.height() - p3) * p4)) + f2));
       goto label_0085 ;
    }
    public void R8(float p0,float p1,float p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, c.class, "5")) {
          return;
       }
       c tI = this.I;
       e uoe = this;
       float f = p0;
       uoe.V8(tI, tI, this.E, this.F, f, new b(this), true);
       tI = this.G;
       uoe.V8(tI, tI, this.E, this.F, f, new b(this), true);
       this.G.setAlpha((0x3f800000 - p0));
       return;
    }
    public int W8(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 0;
    }
    public int Y8(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 0;
    }
    public boolean Z8(){
       return false;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.G = m1.f(p0, 0x7f0a3a43);
       this.I = m1.f(p0, 0x7f0a09e1);
       this.H = (NasaExperimentUtils.b())? this.I: m1.f(p0, 0x7f0a43e1);
       return;
    }
}
