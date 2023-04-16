package fsb.c;
import com.kwai.component.feedstaggercard.a$b;
import java.lang.Object;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import android.view.ViewGroup;
import com.kwai.component.feedstaggercard.model.CardStyle;
import y8c.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ja5.j;
import com.kwai.component.feedstaggercard.presenter.d;
import jsb.e0;
import jsb.z;
import jsb.s;
import jsb.b0;
import com.kwai.component.feedstaggercard.widget.HomeFeedCornerCardBackgroundView;
import ml8.c;

public class c implements a$b	// class@0029e7
{

    public void c(){
       super();
    }
    public f a(PhotoItemViewParam p0,ViewGroup p1,CardStyle p2){
       PhotoItemViewParam obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.mPage;
       s os = (obj == 8 || obj == 288)? 1: null;
       View view = (os || CardStyle.isV4Bottom(p2.mBottomType))? a.i(p1, R.layout.arg_RES_7f0d092a): a.i(p1, R.layout.arg_RES_7f0d0929);
       PresenterV2 presenterV2 = new PresenterV2();
       presenterV2.U7(new j());
       presenterV2.U7(new d());
       presenterV2.U7(new e0(p2.mBottomType, p0.mPage));
       presenterV2.U7(new z());
       if (!os) {
          presenterV2.U7(new s(p0.mPage));
       }
       if (p0.mPage == 9) {
          presenterV2.U7(new b0());
       }
       return new f(HomeFeedCornerCardBackgroundView.a(view, p2), presenterV2);
    }
}
