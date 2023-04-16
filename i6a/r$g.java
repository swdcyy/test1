package i6a.r$g;
import erd.g;
import i6a.r;
import java.lang.Object;
import ujc.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo;

public final class r$g implements g	// class@0027b2
{
    public final r b;

    public void r$g(r p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, r$g.class, "1")) {
       }else {
          r$g tb = this.b;
          if (tb.A != null && p0.a == 4) {
             tb.A = false;
             p0 = r.P8(tb).getPhotoMeta();
             if (p0 != null) {
                p0 = p0.mInterestManageSnackBarInfo;
                if (p0 != null) {
                   this.b.X8(p0);
                }
             }
          }
          PatchProxy.onMethodExit(r$g.class, "1");
       }
       return;
    }
}
