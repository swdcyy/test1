package hn1.e0$d;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotPhotoViewData;
import java.lang.CharSequence;
import java.lang.Boolean;

public final class e0$d implements a	// class@002722
{

    public void e0$d(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e0$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.mPhotoLabel;
       int i = (p0 == null || !p0.length())? 1: 0;
       return Boolean.valueOf((i ^ 1));
    }
}
