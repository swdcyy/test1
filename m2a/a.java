package m2a.a;
import dz9.a;
import android.app.Activity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import d6a.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;

public class a extends a	// class@002f00
{

    public void a(Activity p0,PhotoDetailParam p1,e p2){
       super();
       this.C = p1.mPhoto;
       this.E = p2.a();
       this.D = p0;
       this.N = -1;
    }
    public boolean E(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (NasaExperimentUtils.z() && this.W())? true: false;
       return b;
    }
}
