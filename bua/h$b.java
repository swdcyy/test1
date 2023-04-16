package bua.h$b;
import dd.d;
import bua.h;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.resource.ResourceDownloadController;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Boolean;

public class h$b implements d	// class@000479
{
    public final h a;

    public void h$b(h p0){
       this.a = p0;
       super();
    }
    public void onProducerEvent(String p0,String p1,String p2){
    }
    public void onProducerFinishWithCancellation(String p0,String p1,Map p2){
    }
    public void onProducerFinishWithFailure(String p0,String p1,Throwable p2,Map p3){
    }
    public void onProducerFinishWithSuccess(String p0,String p1,Map p2){
    }
    public void onProducerStart(String p0,String p1){
    }
    public void onRequestCancellation(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b.class, "4")) {
          return;
       }
       ResourceDownloadController.e().f(p0);
       return;
    }
    public void onRequestFailure(ImageRequest p0,String p1,Throwable p2,boolean p3){
       if (PatchProxy.isSupport(h$b.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, h$b.class, "3")) {
          return;
       }
       ResourceDownloadController.e().f(p1);
       return;
    }
    public void onRequestStart(ImageRequest p0,Object p1,String p2,boolean p3){
       if (PatchProxy.isSupport(h$b.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, h$b.class, "1")) {
          return;
       }
       ResourceDownloadController.e().g(p2);
       return;
    }
    public void onRequestSuccess(ImageRequest p0,String p1,boolean p2){
       if (PatchProxy.isSupport(h$b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, h$b.class, "2")) {
          return;
       }
       ResourceDownloadController.e().f(p1);
       return;
    }
    public void onUltimateProducerReached(String p0,String p1,boolean p2){
    }
    public boolean requiresExtraMap(String p0){
       return false;
    }
}
