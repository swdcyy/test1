package pvb.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import pvb.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import rkd.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.b;
import android.content.res.Configuration;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public abstract class a extends PresenterV2	// class@003bdb
{
    public final b p;

    public void a(){
       super();
       this.p = new a$a(this);
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       Activity activity = this.getActivity();
       if (b.g() && activity instanceof GifshowActivity) {
          activity.i3(this.p);
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       Activity activity = this.getActivity();
       if (b.g() && activity instanceof GifshowActivity) {
          activity.s3(this.p);
       }
       return;
    }
    public final boolean P8(Configuration p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "config");
       boolean b = (p0.orientation == 2)? true: false;
       return b;
    }
    public abstract void R8(Configuration p0);
}
