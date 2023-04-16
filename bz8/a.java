package bz8.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import bz8.a$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mxb.c;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingPageInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingData;
import bz8.a$b;
import erd.g;
import crd.b;
import brd.t;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.subjects.PublishSubject;
import t29.d;
import bz8.f;

public final class a extends PresenterV2	// class@000494
{
    public d p;
    public QPhoto q;
    public PublishSubject r;
    public f s;
    public RecyclerView t;
    public static final a$a u;

    static {
       a.u = new a$a(null);
    }
    public void a(){
       super();
    }
    public void E8(){
       c a;
       boolean b;
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a = c.a;
       a tq = this.q;
       if (tq == null) {
          a.S("mPhoto");
       }
       Objects.requireNonNull(a);
       a obj = PatchProxy.applyOneRefs(tq, a, c.class, "52");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(tq, "photo");
          PhotoAdvertisement photoAdverti = k.B(tq);
          String str = 1;
          if (photoAdverti != null) {
             PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
             if (adData != null) {
                adData = adData.mHalfLandingPageInfo;
                if (adData != null) {
                   PhotoAdvertisement$HalfLandingPageInfo mHalfLanding = adData.mHalfLandingData;
                   if (mHalfLanding != null && mHalfLanding.mDisallowExpanded == str) {
                      b = true;
                   }
                }
             }
          }
          b = false;
       }
       if (b) {
          return;
       }else {
          obj = this.r;
          if (obj == null) {
             a.S("mPageRenderSuccessPublisher");
          }
          this.X7(obj.subscribe(new a$b(this)));
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a34da);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       obj = this.r8("HALF_LANDING_PAGE_RENDER_SUCCESS");
       a.o(obj, "inject\(AccessIds.HALF_LANDING_PAGE_RENDER_SUCCESS\)");
       this.r = obj;
       this.p = this.s8(d.class);
       this.s = this.s8(f.class);
       return;
    }
}
