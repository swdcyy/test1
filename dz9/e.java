package dz9.e;
import dz9.a;
import v6a.m0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.ImageMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import com.kuaishou.android.model.mix.ImageMetaExt;

public final class e extends a	// class@002010
{

    public void e(m0 p0){
       a.p(p0, "callerContext");
       super();
       this.C = p0.c.mPhoto;
       this.D = p0.a;
       this.E = p0.m0;
    }
    public boolean E(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.C;
       if (obj != null) {
          objArray = obj.getImageMeta();
       }
       boolean b = (objArray != null && (NasaExperimentUtils.z() && (this.W() && (!ImageMetaExt.isLongPhotos(objArray) || NasaExperimentUtils.b()))))? true: false;
       return b;
    }
}
