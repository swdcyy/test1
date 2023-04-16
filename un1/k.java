package un1.k;
import fn1.b;
import java.lang.String;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import androidx.lifecycle.MutableLiveData;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.List;
import android.view.View;
import android.app.Activity;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;

public interface abstract k	// class@00415a
{

    boolean D1();
    b E0();
    boolean H1();
    void I(String p0,int p1);
    String L0();
    boolean M0();
    boolean M1();
    void N(String p0,int p1,FollowHelper$a p2);
    void O();
    int R1();
    void Y1();
    ClientContent$LiveStreamPackage a();
    e0 c();
    void d0(String p0,int p1);
    String getLiveStreamId();
    boolean i0();
    void k0(String p0,int p1);
    boolean l2();
    void m2();
    MutableLiveData o0();
    boolean s1(BaseFeed p0,List p1,View p2,Activity p3);
    void w2(UserProfile p0,LiveStreamClickType p1,int p2,boolean p3,int p4);
    void y1(String p0,int p1);
}
