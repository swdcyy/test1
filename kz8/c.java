package kz8.c;
import java.lang.Object;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverMediaInfo;
import tw.j;
import java.util.List;

public final class c	// class@002c58
{

    public void c(){
       super();
    }
    public static boolean a(PhotoAdvertisement p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (j.m(p0) == null) {
          return b;
       }
       if (j.m(p0).mCoverUrls == null || (j.m(p0).mCoverUrls.size() && 1 == j.m(p0).mediaType)) {
          b = true;
       }
    label_003b :
       return b;
    }
}
