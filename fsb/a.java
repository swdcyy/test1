package fsb.a;
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
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import i2b.a;
import jsb.b;
import jsb.a;
import ja5.j;
import jsb.s;
import com.kwai.component.feedstaggercard.presenter.d;
import com.kwai.component.feedstaggercard.widget.HomeFeedCornerCardBackgroundView;
import ml8.c;

public class a implements a$b	// class@0029e5
{

    public void a(){
       super();
    }
    public f a(PhotoItemViewParam p0,ViewGroup p1,CardStyle p2){
       View view;
       PresenterV2 obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       if (CardStyle.isV4Bottom(p2.mBottomType)) {
          view = a.i(p1, R.layout.arg_RES_7f0d08ed);
          obj.U7(new b());
       }else {
          view = a.i(p1, R.layout.arg_RES_7f0d08eb);
          obj.U7(new a());
       }
       obj.U7(new j());
       obj.U7(new s(p0.mPage));
       if (p0.mEnablePlayCoverGif != null) {
          obj.U7(new d());
       }
       return new f(HomeFeedCornerCardBackgroundView.a(view, p2), obj);
    }
}
