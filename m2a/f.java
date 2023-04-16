package m2a.f;
import mf5.w0;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import d6a.e;
import java.lang.String;
import m2a.e;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import kf5.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import mhc.l2;
import brd.a0;
import m2a.d;
import erd.r;
import brd.m;
import m2a.c;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class f extends w0	// class@002f05
{
    public final Activity C;
    public BaseFragment D;
    public final QPhoto E;
    public final e F;

    public void f(Activity p0,BaseFragment p1,PhotoDetailParam p2,e p3){
       super("download");
       this.C = p0;
       this.D = p1;
       this.E = p2.mPhoto;
       this.F = p3;
       this.L(R.drawable.arg_RES_7f08052e);
       this.T(R.string.arg_RES_7f100f19);
       this.O(new e(p2));
       this.V(R.drawable.arg_RES_7f080aeb);
    }
    public boolean E(){
       Object obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.E.canDownload();
    }
    public void d(w0 p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "2")) {
          return;
       }
       if (!this.C instanceof GifshowActivity) {
          return;
       }
       this.e(l2.a.a().t(d.b).y(new c(this, p1), Functions.d()));
       return;
    }
}
