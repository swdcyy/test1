package ey1.b;
import brd.t;
import com.kwai.framework.model.user.UserInfo;
import java.lang.String;
import com.kuaishou.live.common.core.component.topbar.topuserlist.online.LiveOnlineTopUserLayoutInfo;
import java.lang.Object;
import com.kuaishou.live.common.core.component.topbar.topuserlist.online.LiveOnlineTopUserResponse;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.common.core.component.topbar.topuserlist.online.LiveOnlineTopUserRoleInfo;
import java.util.List;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;

public interface abstract b	// class@002225
{

    boolean G1();
    t H1();
    void I1();
    boolean J1();
    int K1();
    void L1();
    void M1(UserInfo p0,int p1,boolean p2,int p3);
    String N1();
    LiveOnlineTopUserLayoutInfo O1(String p0);
    boolean P1();
    int Q1();
    void R1(Object p0);
    LiveOnlineTopUserResponse S1();
    CDNUrl[] T1();
    void U1(LiveOnlineTopUserResponse p0);
    LiveOnlineTopUserRoleInfo V1();
    t W1();
    List X1();
    void Y1(int p0);
    String Z1();
    ClientContent$LiveStreamPackage a();
    long a2();
    m b();
    int b2();
    boolean c2();
    String d();
    void d2(String p0);
    boolean e();
    CDNUrl[] e2();
    String getLiveStreamId();
    void l(UserInfo p0,int p1);
}
