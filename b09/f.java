package b09.f;
import x49.q;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.tachikoma.AdPlayEndTKPresenter;
import erd.g;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yx.j0;
import java.lang.Boolean;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import a09.g;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.View;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import java.lang.StringBuilder;
import java.lang.System;

public final class f implements q	// class@00034e
{
    public final long a;
    public final AdPlayEndTKPresenter b;
    public final g c;

    public void f(long p0,AdPlayEndTKPresenter p1,g p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(Exception p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f.class, "2")) {
          return;
       }
       a.p(p0, "e");
       Object[] objArray = new Object[0];
       j0.a("TachikomaPlayEnd", "template render failed", objArray);
       f tc = this.c;
       if (tc != null) {
          tc.accept(Boolean.FALSE);
       }
       PatchProxy.onMethodExit(f.class, "2");
       return;
    }
    public void b(){
       g a;
       AdPlayEndTKPresenter f;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, f.class, "1")) {
          return;
       }
       f tc = this.c;
       if (tc != null) {
          tc.accept(Boolean.TRUE);
       }
       AdPlayEndTKPresenter r = this.b.r;
       if (r == null) {
          a.S("mPhotoDetailParam");
       }
       if (r.enableSlidePlay()) {
          a = g.a;
          QPhoto qPhoto = AdPlayEndTKPresenter.P8(this.b);
          f = this.b.F;
          if (f != null) {
             objArray = f.findViewById(R.id.ad_tk_play_end_container);
          }
          a.a(qPhoto, objArray);
       }
       Object[] objArray1 = new Object[0];
       j0.a("TachikomaPlayEnd", "template render success render cost "+(System.currentTimeMillis() - this.a)+" ms", objArray1);
       PatchProxy.onMethodExit(f.class, "1");
       return;
    }
}
