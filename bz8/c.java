package bz8.c;
import erd.g;
import bz8.e;
import java.lang.Object;
import com.yxcorp.gifshow.ad.response.HalfLandingPageResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingData;

public final class c implements g	// class@000496
{
    public final e b;

    public void c(e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          this.b.P8();
          this.b.R8();
          this.b.S8(p0.getHalfLandingData());
          this.b.V8();
       }
       return;
    }
}
