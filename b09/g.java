package b09.g;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.tachikoma.AdPlayEndTKPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yx.j0;
import im8.f;
import io.reactivex.subjects.PublishSubject;
import java.lang.Integer;
import com.yxcorp.gifshow.ad.tachikoma.view.AdPlayEndTKBaseView;
import android.widget.FrameLayout;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import cm9.a;

public final class g implements g	// class@00034f
{
    public final AdPlayEndTKPresenter b;

    public void g(AdPlayEndTKPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, str)) {
       }else {
          a.o(p0, "renderSuccess");
          if (p0.booleanValue()) {
             int i = 0;
             Object[] objArray = new Object[i];
             j0.f("TachikomaPlayEnd", "showPlayEnd\(\)", objArray);
             AdPlayEndTKPresenter x = this.b.x;
             if (x == null) {
                a.S("mIsPlayEndScreenVisible");
             }
             Boolean tRUE = Boolean.TRUE;
             x.set(tRUE);
             x = this.b.v;
             if (x == null) {
                a.S("mAdPlayEndViewState");
             }
             x.onNext(tRUE);
             x = this.b.u;
             if (x == null) {
                a.S("mPlayEndVisibilityPublish");
             }
             x.onNext(Integer.valueOf(i));
             x = this.b.F;
             Object[] objArray1 = null;
             if (x != null && !PatchProxy.applyVoid(objArray1, x, AdPlayEndTKBaseView.class, str)) {
                x.setVisibility(i);
             }
             i = this.b;
             x = i.J;
             if (x != null) {
                i = i.getContext();
                if (i instanceof GifshowActivity) {
                   objArray1 = i;
                }
                if (objArray1 != null) {
                   objArray1.F2(x);
                }
             }
             o.z().e(531, AdPlayEndTKPresenter.P8(this.b).mEntity).a();
             i = this.b.O;
             if (i != null) {
                i.start();
             }
          }else {
             this.b.W8();
          }
       }
       return;
    }
}
