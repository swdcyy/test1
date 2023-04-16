package i19.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import i19.c$a;
import nsd.u;
import i19.c$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AutoConversionInfo;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import ekd.k1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import n49.o;

public final class c extends PresenterV2	// class@002607
{
    public QPhoto p;
    public BaseFragment q;
    public o r;
    public SlidePlayViewModel s;
    public final c$b t;
    public static final c$a u;

    static {
       c.u = new c$a(null);
    }
    public void c(){
       super();
       this.t = new c$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       c tp = this.p;
       if (tp == null) {
          a.S("mPhoto");
       }
       PhotoAdvertisement photoAdverti = k.B(tp);
       if (photoAdverti != null) {
          a.o(photoAdverti, "CommercialFeedExt.getPhotoAd\(mPhoto\) ?: return");
          photoAdverti = photoAdverti.mAutoConversionInfo;
          PhotoAdvertisement$AutoConversionInfo mAutoConvers = (photoAdverti != null)? photoAdverti.mAutoConversionType: null;
          if (mAutoConvers > null) {
             tp = this.q;
             String str = "mFragment";
             if (tp == null) {
                a.S(str);
             }
             SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tp.getParentFragment());
             this.s = slidePlayVie;
             if (slidePlayVie != null) {
                c tq = this.q;
                if (tq == null) {
                   a.S(str);
                }
                slidePlayVie.P(tq, this.t);
             }
          }
       }
    label_004b :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       k1.n("AdUnionAutoProcessPresenter");
       c ts = this.s;
       if (ts != null) {
          c tq = this.q;
          if (tq == null) {
             a.S("mFragment");
          }
          ts.D(tq, this.t);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       obj = this.q8(o.class);
       a.o(obj, "inject\(PhotoAdActionBarClickProcessor::class.java\)");
       this.r = obj;
       return;
    }
}
