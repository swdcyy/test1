package ly9.l;
import ly9.g;
import com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeConfig;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import de5.a;
import com.yxcorp.gifshow.comment.e;
import io.reactivex.subjects.PublishSubject;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class l extends g	// class@002ec1
{
    public final PublishSubject h;
    public final PublishSubject i;

    public void l(MarqueeConfig p0,QPhoto p1,BaseFragment p2,a p3,e p4,int p5,PublishSubject p6,PublishSubject p7,t p8){
       int i = this;
       Object obj = p6;
       Object obj1 = p7;
       a.p(p0, "mMarqueeConfig");
       a.p(p1, "mPhoto");
       a.p(p2, "mFragment");
       a.p(p3, "mPlayModule");
       Object obj2 = p4;
       a.p(obj2, "mCommentHelper");
       a.p(obj, "mCommentQuickReplySuccess");
       a.p(obj1, "mShowCommentDialogEvent");
       Object obj3 = p8;
       a.p(obj3, "mPlayPauseShowObservable");
       super(p0, p1, p2, p3, obj2, p5, obj3);
       i.h = obj;
       i.i = obj1;
    }
}
