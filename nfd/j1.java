package nfd.j1;
import dd.b;
import java.lang.String;
import io.reactivex.subjects.PublishSubject;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;

public class j1 extends b	// class@001dbe
{
    public final String a;
    public final PublishSubject b;

    public void j1(String p0,PublishSubject p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onRequestFailure(ImageRequest p0,String p1,Throwable p2,boolean p3){
       if (PatchProxy.isSupport(j1.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, j1.class, "2")) {
          return;
       }
       this.b.onError(p2);
       return;
    }
    public void onRequestSuccess(ImageRequest p0,String p1,boolean p2){
       if (PatchProxy.isSupport(j1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, j1.class, "1")) {
          return;
       }
       this.b.onNext(this.a);
       return;
    }
}
