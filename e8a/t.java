package e8a.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e8a.t$a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import iic.e;
import com.kwai.framework.model.feed.BaseFeed;
import exb.b;
import zic.p0;

public abstract class t extends PresenterV2	// class@0020d9
{
    public QPhoto p;
    public static final t$a q;

    static {
       t.q = new t$a(null);
    }
    public void t(){
       super();
    }
    public final void P8(int p0){
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ot, "4")) {
          return;
       }
       Activity activity = this.getActivity();
       if (!activity instanceof GifshowActivity) {
          activity = null;
       }
       if (activity != null && (!PatchProxy.isSupport(ot) || !PatchProxy.applyVoidTwoRefs(activity, Integer.valueOf(p0), this, ot, "6"))) {
          ot = this.p;
          if (ot == null) {
             a.S("mPhoto");
          }
          p0.b(activity, ot.mEntity, new StatModel("SAVE_ORIGINAL"), p0, new e());
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       return;
    }
}
