package a5a.c;
import fe5.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a5a.b;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import android.content.Context;
import uw9.m3;
import com.yxcorp.gifshow.entity.QPhoto;

public class c extends j	// class@000036
{
    public t u;

    public void c(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       super.E8();
       this.X7(this.u.subscribe(new b(this)));
       return;
    }
    public boolean S8(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.V8();
    }
    public final boolean V8(){
       j obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.r.enableSlidePlay()) {
          return false;
       }
       obj = this.r;
       if (obj.mPhoto != null && obj.getBizType() == 2) {
          return m3.c(this.getContext());
       }
       return m3.d(this.getContext(), this.r.mPhoto);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       super.j8();
       this.u = this.r8("DETAIL_ON_CONFIGURATION_CHANGED_EVENT");
       return;
    }
}
