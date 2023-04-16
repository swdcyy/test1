package m2a.h;
import mf5.w0;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import d6a.e;
import java.lang.String;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.util.o;
import lnc.e2;
import kf5.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.entity.QPreInfo;

public class h extends w0	// class@002f08
{
    public final Activity C;
    public BaseFragment D;
    public final QPhoto E;
    public final e F;
    public final QPreInfo G;

    public void h(Activity p0,BaseFragment p1,PhotoDetailParam p2,e p3){
       super("recreation");
       this.C = p0;
       this.D = p1;
       this.E = p2.mPhoto;
       this.F = p3;
       this.G = p2.mDetailCommonParam.mPreInfo;
       this.L(R.drawable.arg_RES_7f080b0d);
       this.T(R.string.arg_RES_7f10404d);
       this.H(true);
    }
    public boolean E(){
       Object obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (QCurrentUser.ME.isLogined() && (o.k(this.E) && e2.d()))? true: false;
       return b;
    }
    public void d(w0 p0,g p1){
       h oh = h.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oh, "2")) {
          return;
       }
       if (!this.C instanceof GifshowActivity) {
          return;
       }
       p1.a();
       if (!PatchProxy.applyVoid(null, this, oh, "3")) {
          Log.g("FeedbackRecreationPresenter", "startVideoRecreation");
          o.n(this.D, this.E, false);
          o.o(this.C, this.E, this.G);
       }
       return;
    }
}
