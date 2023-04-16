package id.t;
import id.e0;
import id.f0;
import java.lang.Object;
import id.c0;
import java.lang.String;
import java.util.Map;
import java.lang.Throwable;

public class t implements e0	// class@0021cb
{
    public final f0 a;
    public final e0 b;

    public void t(f0 p0,e0 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void onProducerEvent(c0 p0,String p1,String p2){
       t ta = this.a;
       if (ta != null) {
          ta.onProducerEvent(p0.getId(), p1, p2);
       }
       ta = this.b;
       if (ta != null) {
          ta.onProducerEvent(p0, p1, p2);
       }
       return;
    }
    public void onProducerFinishWithCancellation(c0 p0,String p1,Map p2){
       t ta = this.a;
       if (ta != null) {
          ta.onProducerFinishWithCancellation(p0.getId(), p1, p2);
       }
       ta = this.b;
       if (ta != null) {
          ta.onProducerFinishWithCancellation(p0, p1, p2);
       }
       return;
    }
    public void onProducerFinishWithFailure(c0 p0,String p1,Throwable p2,Map p3){
       t ta = this.a;
       if (ta != null) {
          ta.onProducerFinishWithFailure(p0.getId(), p1, p2, p3);
       }
       ta = this.b;
       if (ta != null) {
          ta.onProducerFinishWithFailure(p0, p1, p2, p3);
       }
       return;
    }
    public void onProducerFinishWithSuccess(c0 p0,String p1,Map p2){
       t ta = this.a;
       if (ta != null) {
          ta.onProducerFinishWithSuccess(p0.getId(), p1, p2);
       }
       ta = this.b;
       if (ta != null) {
          ta.onProducerFinishWithSuccess(p0, p1, p2);
       }
       return;
    }
    public void onProducerStart(c0 p0,String p1){
       t ta = this.a;
       if (ta != null) {
          ta.onProducerStart(p0.getId(), p1);
       }
       ta = this.b;
       if (ta != null) {
          ta.onProducerStart(p0, p1);
       }
       return;
    }
    public void onUltimateProducerReached(c0 p0,String p1,boolean p2){
       t ta = this.a;
       if (ta != null) {
          ta.onUltimateProducerReached(p0.getId(), p1, p2);
       }
       ta = this.b;
       if (ta != null) {
          ta.onUltimateProducerReached(p0, p1, p2);
       }
       return;
    }
    public boolean requiresExtraMap(c0 p0,String p1){
       t ta = this.a;
       boolean b = (ta != null)? ta.requiresExtraMap(p0.getId()): false;
       if (!b) {
          t tb = this.b;
          if (tb != null) {
             b = tb.requiresExtraMap(p0, p1);
          }
       }
       return b;
    }
}
