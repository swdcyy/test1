package dl9.n1;
import erd.g;
import dl9.u1;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import android.widget.ImageView;
import android.view.View;
import java.lang.String;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Boolean;
import java.util.Map;
import brd.y;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.event.CommentsEvent;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.event.CommentsEvent$Operation;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.action.c;

public final class n1 implements g	// class@001f88
{
    public final u1 b;
    public final QPhoto c;

    public void n1(u1 p0,QPhoto p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       n1 tb = this.b;
       n1 tc = this.c;
       tb.s.setSelected(true);
       tb.u.setSelected(true);
       tb.x.put(tb.v.getId(), Boolean.FALSE);
       if (tb.I == null) {
          p0 = tb.v;
          if (p0 != null && (p0.mDisliked != null && tb.V8())) {
             tb.E.onNext(Boolean.TRUE);
          }
       }
       a.d().k(new CommentsEvent(tb.getActivity().hashCode(), tc, tb.v, CommentsEvent$Operation.LIKE));
       if (!PatchProxy.applyVoid(null, tb, u1.class, "16")) {
          c.a(11, tb.z.mEntity);
       }
       return;
    }
}
