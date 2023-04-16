package ao2.b;
import f55.c;
import android.app.Activity;
import com.kuaishou.live.core.show.yoda.model.JsOpenLiveQuizLiveParams;
import com.kuaishou.live.core.show.yoda.model.DeleteSubscribeParams;
import f55.g;
import com.kuaishou.live.core.show.yoda.model.SubscribeLiveParams;
import java.lang.String;
import com.kuaishou.live.core.show.yoda.model.CreateSubscribeParams;
import com.kuaishou.live.core.show.yoda.model.RelatePhotoParams;

public interface abstract b implements c	// class@000299
{

    void D5();
    void U(Activity p0,JsOpenLiveQuizLiveParams p1);
    void Z9(Activity p0,DeleteSubscribeParams p1,g p2);
    void c5(Activity p0,SubscribeLiveParams p1,g p2);
    int g2(Activity p0);
    String getNameSpace();
    void q7(Activity p0,CreateSubscribeParams p1,g p2);
    void x2(Activity p0,RelatePhotoParams p1,g p2);
    void y();
    void za(Activity p0,SubscribeLiveParams p1,g p2);
}
