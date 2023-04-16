package ly9.g;
import com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeConfig;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import de5.a;
import com.yxcorp.gifshow.comment.e;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public class g	// class@002eba
{
    public final MarqueeConfig a;
    public final QPhoto b;
    public final BaseFragment c;
    public final a d;
    public final e e;
    public final int f;
    public final t g;

    public void g(MarqueeConfig p0,QPhoto p1,BaseFragment p2,a p3,e p4,int p5,t p6){
       a.p(p0, "mMarqueeConfig");
       a.p(p1, "mPhoto");
       a.p(p2, "mFragment");
       a.p(p3, "mPlayModule");
       a.p(p4, "mCommentHelper");
       a.p(p6, "mPlayPauseShowObservable");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
}
