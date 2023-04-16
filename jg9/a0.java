package jg9.a0;
import erd.o;
import java.util.List;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$e;
import kotlin.jvm.internal.a;
import lnc.p7;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.models.QMedia;
import java.io.File;
import com.kwai.gifshow.post.api.core.camerasdk.model.ExifInfo;

public final class a0 implements o	// class@002a7f
{
    public final List b;

    public void a0(List p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       MultiTakePictureController$e uoe = PatchProxy.applyOneRefs(p0, this, a0.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          p0 = p7.a(p0[0]);
          if (p0 == null) {
             p0 = "";
          }
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             ExifInfo uExifInfo = ExifInfo.parseFromFile(new File(iterator.next().path));
             if (uExifInfo != null) {
                uArrayList.add(uExifInfo);
             }
          }
          uoe = new MultiTakePictureController$e(p0, uArrayList);
       }
       return uoe;
    }
}
