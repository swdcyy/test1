package h09.e$a;
import erd.g;
import h09.e;
import java.lang.Object;
import h09.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import yx.j0;
import kotlin.jvm.internal.a;
import n49.o;
import nx8.l;
import com.yxcorp.gifshow.ad.AdProcess;
import com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wkd.b;
import my.a;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.commercial.model.AdDownloaderType;
import msd.l;
import my.a$a;

public final class e$a implements g	// class@00252e
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, e.class, "3")) {
             Object[] objArray = new Object[0];
             j0.f("PopARLogger", "handlePopARConvertEvent", objArray);
             e q = p0.q;
             if (q == null) {
                a.S("mPhotoAdActionBarClickProcessor");
             }
             o d = q.d;
             if (d != null) {
                l ol = d.h();
                if (ol != null) {
                   ol.c();
                }
             }
             q = p0.p;
             if (q == null) {
                a.S("mPhoto");
             }
             PhotoAdDataWrapper photoAdDataW = new PhotoAdDataWrapper(q.mEntity);
             Activity activity = p0.getActivity();
             if (activity != null) {
                a.o(activity, "it");
                a$a.a(b.a(0x1f7421d5), activity, photoAdDataW, null, null, null, 28, null);
             }
          }
       }
       return;
    }
}
