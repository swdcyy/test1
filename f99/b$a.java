package f99.b$a;
import joc.o;
import f99.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import rf5.e;
import android.content.Context;
import com.yxcorp.gifshow.entity.QPhoto;
import uw9.m3;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public class b$a extends o	// class@0022e1
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "2")) {
          return;
       }
       Activity activity = this.a.getActivity();
       if (this.f(activity)) {
          i.h(activity, 0, 0);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       Activity activity = this.a.getActivity();
       if (this.f(activity)) {
          i.h(activity, 0, true);
       }
       return;
    }
    public final boolean f(Activity p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!m3.d(p0, this.a.u)) {
          b$a ta = this.a;
          if (ta.R == null || ta.t.getDetailCommonParam().isFromProfile()) {
             b = false;
          label_0033 :
             return b;
          }
       }
       b = true;
       goto label_0033 ;
    }
}
