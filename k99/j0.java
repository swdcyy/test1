package k99.j0;
import com.yxcorp.gifshow.growth.pad.CoverPadAdaptationPresenter;
import android.view.View;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import kp.r1;
import im8.f;
import com.yxcorp.gifshow.util.rx.RxBus;
import nna.b;
import nsd.u;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class j0 extends CoverPadAdaptationPresenter	// class@002b83
{
    public View s;
    public f t;

    public void j0(){
       super();
    }
    public View V8(){
       return this.s;
    }
    public void X8(View p0,BaseFeed p1,int p2){
       if (PatchProxy.isSupport(j0.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, j0.class, "3")) {
          return;
       }
       a.p(p0, "view");
       a.p(p1, "baseFeed");
       if (p0.getLayoutParams() == null) {
          return;
       }
       p2 = n.z(a.b());
       int i = n.v(a.b());
       ImageMeta$AtlasCoverSize[] uAtlasCoverS = r1.n0(p1);
       if (uAtlasCoverS != null) {
          ImageMeta$AtlasCoverSize uAtlasCoverS1 = (!uAtlasCoverS.length)? 1: null;
          if (!uAtlasCoverS1) {
             object oobject = uAtlasCoverS[0];
             int i1 = (int)((float)p2 / (oobject.mWidth / oobject.mHeight));
             float f = (float)i * 0x3f4ccccd;
             if ((float)i1 - f >= 0) {
                i1 = (int)f;
             }
             f.height = i1;
             j0 tt = this.t;
             if (tt != null) {
                tt.set(Integer.valueOf(i1));
             }
             p0.requestLayout();
             RxBus.f.b(new b(0, i1, 1, null));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a4452);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "1")) {
          return;
       }
       super.j8();
       this.t = this.x8("DETAIL_PHOTO_HEIGHT");
       return;
    }
}
