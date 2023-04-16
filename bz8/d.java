package bz8.d;
import erd.g;
import bz8.e;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingData;
import o35.b;
import java.lang.StringBuilder;

public final class d implements g	// class@000497
{
    public final e b;

    public void d(e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          this.b.P8();
          this.b.R8();
          this.b.S8(null);
          this.b.V8();
          Object[] objArray = new Object[0];
          b.g().d("HalfLandingPagePresenter", "getHalfLandingDataFromNet network error : "+p0, objArray);
       }
       return;
    }
}
