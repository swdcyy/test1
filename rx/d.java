package rx.d;
import rx.d$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import msd.l;
import java.lang.Integer;
import erd.g;
import kotlin.Pair;
import erd.o;
import android.app.Activity;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import android.view.View;
import rx.b;
import mxb.j;

public interface abstract d	// class@002ded
{
    public static final d$a L0;

    static {
       d.L0 = d$a.a;
    }
    PresenterV2 D1(int p0);
    void F1(BaseFeed p0,String p1,l p2,Integer p3,g p4);
    d H0(int p0,BaseFeed p1,String p2,Pair p3,o p4);
    d L0(BaseFeed p0,String p1,Pair p2,g p3);
    int S(Activity p0,AdDataWrapper p1,String p2,boolean p3,Integer p4,g p5);
    b T0(BaseFeed p0,String p1,View p2,boolean p3);
    d X0(BaseFeed p0,String p1,g p2,int p3,int p4);
    d g0(BaseFeed p0,String p1,Pair p2,g p3);
    d n(int p0,j p1,String p2,Pair p3,o p4);
    d q0(BaseFeed p0,String p1,g p2);
    d z0(int p0,BaseFeed p1,String p2,Pair p3,g p4);
}
