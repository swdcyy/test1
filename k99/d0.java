package k99.d0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import joc.z;
import joc.c;
import android.view.View;
import joc.a0;
import java.util.List;
import java.util.Iterator;
import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import k99.d0$b;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;
import xtd.g;
import xtd.a;
import ytd.d;
import ytd.b;
import k99.d0$a;
import xtd.e;
import ekd.m1;
import com.yxcorp.gifshow.widget.viewpager.PhotosViewPager;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import im8.f;
import io.reactivex.subjects.PublishSubject;
import yy6.c;

public final class d0 extends PresenterV2	// class@002b70
{
    public a p;
    public QPhoto q;
    public f r;
    public PublishSubject s;
    public f t;
    public c u;
    public PhotoDetailParam v;
    public PhotosViewPager w;
    public final int x;
    public SwipeLayout y;
    public boolean z;

    public void d0(){
       super();
       this.x = 100;
    }
    public void E8(){
       z oz;
       Object[] objArray1;
       d0 uod0 = d0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod0, "3")) {
          return;
       }
       if (this.y == null) {
          this.y = w9.c(this.getActivity());
       }
       if (!PatchProxy.applyVoid(objArray, this, uod0, "7")) {
          uod0 = this.y;
          z touchDetecto = (uod0 != null)? uod0.getTouchDetector(): objArray;
          if (!touchDetecto instanceof c) {
             touchDetecto = objArray;
          }
          if (touchDetecto != null) {
             touchDetecto.y(this.w);
          }
          uod0 = this.y;
          touchDetecto = (uod0 != null)? uod0.getTouchDetector(): objArray;
          if (touchDetecto instanceof a0) {
             oz = touchDetecto;
          }
          if (objArray != null) {
             List list = objArray.l();
             if (list != null) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   oz = iterator.next();
                   if (oz instanceof c) {
                      oz.y(this.w);
                   }
                }
             }
          }
       }
       uod0 = this.y;
       boolean b = true;
       if (uod0 != null) {
          uod0.e(b);
       }
       uod0 = this.w;
       if (uod0 != null) {
          int currentItem = uod0.getCurrentItem();
          d0 tq = this.q;
          if (tq == null) {
             a.S("mPhoto");
          }
          if (currentItem == (tq.getAtlasListSize() - b)) {
             this.P8();
          }
       }
       uod0 = this.w;
       if (uod0 != null) {
          uod0.addOnPageChangeListener(new d0$b(this));
       }
       return;
    }
    public void J8(){
       z oz;
       Object[] objArray1;
       d0 uod0 = d0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod0, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uod0, "8")) {
          uod0 = this.y;
          z touchDetecto = (uod0 != null)? uod0.getTouchDetector(): objArray;
          if (!touchDetecto instanceof c) {
             touchDetecto = objArray;
          }
          if (touchDetecto != null) {
             touchDetecto.o();
          }
          uod0 = this.y;
          touchDetecto = (uod0 != null)? uod0.getTouchDetector(): objArray;
          if (touchDetecto instanceof a0) {
             oz = touchDetecto;
          }
          if (objArray != null) {
             List list = objArray.l();
             if (list != null) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   oz = iterator.next();
                   if (oz instanceof c) {
                      oz.o();
                   }
                }
             }
          }
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "4")) {
          return;
       }
       d0 tp = this.p;
       if (tp != null && tp != null) {
          tp.detach();
       }
       a uoa = new a(new d(this.w), 0x3f800000, 0x3f800000, -2.00f);
       this.p = uoa;
       uoa.a(new d0$a(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a4452);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "1")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.v = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       obj = this.x8("DETAIL_LOGGER");
       a.o(obj, "injectRef\(AccessIds.DETAIL_LOGGER\)");
       this.r = obj;
       Object obj1 = this.r8("SLIDE_PLAY_PROFILE_PUBLISHER");
       a.o(obj1, "inject\(AccessIds.SLIDE_PLAY_PROFILE_PUBLISHER\)");
       this.s = obj1;
       obj = this.x8("LOG_LISTENER");
       a.o(obj, "injectRef\(AccessIds.LOG_LISTENER\)");
       this.t = obj;
       obj1 = this.q8(c.class);
       a.o(obj1, "inject\(PhotoDetailStatLogger::class.java\)");
       this.u = obj1;
       return;
    }
}
