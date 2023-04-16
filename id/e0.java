package id.e0;
import id.c0;
import java.lang.String;
import java.util.Map;
import java.lang.Throwable;

public interface abstract e0	// class@0017d4
{

    void onProducerEvent(c0 p0,String p1,String p2);
    void onProducerFinishWithCancellation(c0 p0,String p1,Map p2);
    void onProducerFinishWithFailure(c0 p0,String p1,Throwable p2,Map p3);
    void onProducerFinishWithSuccess(c0 p0,String p1,Map p2);
    void onProducerStart(c0 p0,String p1);
    void onUltimateProducerReached(c0 p0,String p1,boolean p2);
    boolean requiresExtraMap(c0 p0,String p1);
}
