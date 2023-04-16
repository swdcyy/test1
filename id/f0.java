package id.f0;
import java.lang.String;
import java.util.Map;
import java.lang.Throwable;

public interface abstract f0	// class@0017d5
{

    void onProducerEvent(String p0,String p1,String p2);
    void onProducerFinishWithCancellation(String p0,String p1,Map p2);
    void onProducerFinishWithFailure(String p0,String p1,Throwable p2,Map p3);
    void onProducerFinishWithSuccess(String p0,String p1,Map p2);
    void onProducerStart(String p0,String p1);
    void onUltimateProducerReached(String p0,String p1,boolean p2);
    boolean requiresExtraMap(String p0);
}
