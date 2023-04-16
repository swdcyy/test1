package dl9.m1;
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
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.event.CommentsEvent;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.event.CommentsEvent$Operation;

public final class m1 implements g	// class@001f84
{
    public final u1 b;
    public final QPhoto c;

    public void m1(u1 p0,QPhoto p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       m1 tb = this.b;
       tb.s.setSelected(false);
       tb.u.setSelected(false);
       tb.x.put(tb.v.getId(), Boolean.FALSE);
       a.d().k(new CommentsEvent(tb.getActivity().hashCode(), this.c, tb.v, CommentsEvent$Operation.UNLIKE));
    }
}
