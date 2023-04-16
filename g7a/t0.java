package g7a.t0;
import gp5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import g7a.t0$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.a;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter;

public class t0 implements a	// class@0023fb
{

    public void t0(){
       super();
    }
    public Object a(){
       Object obj = PatchProxy.apply(null, this, t0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new t0$a();
    }
    public PresenterV2 b(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, t0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new a());
       obj.U7(new NasaCommentExternalEditorPresenter());
       PatchProxy.onMethodExit(t0.class, "1");
       return obj;
    }
}
