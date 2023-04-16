package e8a.g0;
import y8c.g;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import com.kwai.framework.model.user.User;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import com.yxcorp.utility.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e8a.p0;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.h;
import ml8.c;

public class g0 extends g	// class@0020a8
{
    public String w;

    public void g0(String p0){
       super();
       this.w = p0;
       this.n1("NEBULA_PYMK_LOG_PARAMS", p0);
    }
    public int f0(int p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og0, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.N0(p0) != null) {
          return 0;
       }else {
          return -1;
       }
    }
    public f h1(ViewGroup p0,int p1){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, og0, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View view = n.H(p0, R.layout.arg_RES_7f0d1067);
       if (!p1) {
          PresenterV2 presenterV2 = new PresenterV2();
          presenterV2.U7(new p0());
          presenterV2.U7(new h());
          return new f(view, presenterV2);
       }else {
          return null;
       }
    }
}
