package i19.d;
import java.lang.Runnable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AutoConversionInfo;
import i19.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import n49.d;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import n49.o;

public final class d implements Runnable	// class@002608
{
    public final PhotoAdvertisement$AutoConversionInfo b;
    public final c c;

    public void d(PhotoAdvertisement$AutoConversionInfo p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, d.class, "1")) {
          return;
       }
       if (this.b.mAutoConversionType == 1) {
          c r = this.c.r;
          if (r == null) {
             a.S("mPhotoAdActionBarClickProcessor");
          }
          c p = this.c.p;
          if (p == null) {
             a.S("mPhoto");
          }
          c q = this.c.q;
          if (q == null) {
             a.S("mFragment");
          }
          d uod = d.a();
          uod.b(1);
          r.c(p, q.getActivity(), uod);
       }
       PatchProxy.onMethodExit(d.class, "1");
       return;
    }
}
