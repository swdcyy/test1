package fsb.b;
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
import jsb.w;
import jsb.s;
import com.kwai.component.feedstaggercard.widget.HomeFeedCornerCardBackgroundView;
import ml8.c;

public class b implements a$b	// class@0029e6
{

    public void b(){
       super();
    }
    public f a(PhotoItemViewParam p0,ViewGroup p1,CardStyle p2){
       PresenterV2 obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new w());
       obj.U7(new s(p0.mPage));
       return new f(HomeFeedCornerCardBackgroundView.a(a.i(p1, 0x7f0d0905), p2), obj);
    }
}
