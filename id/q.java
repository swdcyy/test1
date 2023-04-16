package id.q;
import id.b0;
import tc.g;
import tc.h;
import tc.d;
import java.lang.Object;
import id.i;
import id.c0;
import kd.b;
import java.lang.String;
import id.e0;
import id.q$a;
import java.util.Map;

public class q implements b0	// class@0021c8
{
    public final g a;
    public final g b;
    public final h c;
    public final b0 d;
    public final d e;
    public final d f;

    public void q(g p0,g p1,h p2,d p3,d p4,b0 p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.e = p3;
       this.f = p4;
       this.d = p5;
    }
    public void produceResults(i p0,c0 p1){
       if (b.d()) {
          b.a("EncodedProbeProducer#produceResults");
       }
       e0 uoe0 = p1.l();
       uoe0.onProducerStart(p1, "EncodedProbeProducer");
       q$a uoa = new q$a(p0, p1, this.a, this.b, this.c, this.e, this.f);
       uoe0.onProducerFinishWithSuccess(p1, "EncodedProbeProducer", null);
       if (b.d()) {
          b.a("mInputProducer.produceResult");
       }
       this.d.produceResults(v10, p1);
       if (b.d()) {
          b.b();
       }
       if (b.d()) {
          b.b();
       }
       return;
    }
}
