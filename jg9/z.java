package jg9.z;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.base.b;

public final class z implements Callable	// class@002ac4
{
    public final MultiTakePictureController b;

    public void z(MultiTakePictureController p0){
       this.b = p0;
       super();
    }
    public Object call(){
       BeautifyConfig[] uBeautifyCon = PatchProxy.apply(null, this, z.class, "1");
       if (uBeautifyCon != PatchProxyResult.class) {
       }else {
          uBeautifyCon = new BeautifyConfig[]{this.b.d.c(BeautifyConfig.class)};
       }
       return uBeautifyCon;
    }
}
