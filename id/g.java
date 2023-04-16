package id.g;
import id.b0;
import tc.v;
import tc.g;
import tc.h;
import tc.d;
import java.lang.Object;
import id.i;
import id.c0;
import kd.b;
import java.lang.String;
import id.e0;
import id.g$a;
import java.util.Map;

public class g implements b0	// class@0021aa
{
    public final v a;
    public final g b;
    public final g c;
    public final h d;
    public final b0 e;
    public final d f;
    public final d g;

    public void g(v p0,g p1,g p2,h p3,d p4,d p5,b0 p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.f = p4;
       this.g = p5;
       this.e = p6;
    }
    public void produceResults(i p0,c0 p1){
       if (b.d()) {
          b.a("BitmapProbeProducer#produceResults");
       }
       e0 uoe0 = p1.l();
       uoe0.onProducerStart(p1, "BitmapProbeProducer");
       g$a uoa = new g$a(p0, p1, this.a, this.b, this.c, this.d, this.f, this.g);
       uoe0.onProducerFinishWithSuccess(p1, "BitmapProbeProducer", null);
       if (b.d()) {
          b.a("mInputProducer.produceResult");
       }
       this.e.produceResults(v11, p1);
       if (b.d()) {
          b.b();
       }
       if (b.d()) {
          b.b();
       }
       return;
    }
}
