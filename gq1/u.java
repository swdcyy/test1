package gq1.u;
import android.view.MotionEvent;
import com.kuaishou.live.common.core.component.multiline.model.a;
import hf3.a;
import ee3.b0;
import com.kwai.framework.model.user.User;
import java.lang.String;
import com.kuaishou.live.common.core.component.multiline.endline.EndLineSource;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import l02.f;
import com.kuaishou.live.common.core.component.pk.model.LiveLineInviteItem;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.multiline.log.LiveMultiLineLogger$PanelSource;

public interface abstract u	// class@002561
{

    void A(MotionEvent p0);
    void A4(a p0,int p1);
    a B4();
    void C4(a p0);
    void D4();
    void E4();
    void F4(b0 p0);
    void G4(User p0);
    void H4();
    int I4(String p0,int p1,int p2,int p3,int p4,boolean p5);
    void J4(String p0);
    void O(EndLineSource p0);
    String R(String p0);
    boolean S();
    ClientContent$LiveStreamPackage a();
    void a1();
    e0 c();
    String d();
    void d1(f p0);
    void e();
    void g1(f p0);
    String getLiveStreamId();
    long j();
    void u1(String p0,LiveLineInviteItem p1);
    void v1(a p0);
    LiveData w1();
    void z4(LiveMultiLineLogger$PanelSource p0);
}
