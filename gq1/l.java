package gq1.l;
import lp3.c;
import androidx.lifecycle.LiveData;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig;
import java.lang.String;
import gq1.h;
import java.util.List;
import hq1.c;
import com.kuaishou.live.common.core.component.multiline.endline.EndLineSource;
import ks1.b;
import mq1.b;
import brd.t;
import com.kuaishou.protobuf.livestream.nano.LiveRevenueDeliverySellingChatInfo;
import hq1.a;
import com.kuaishou.protobuf.livestream.nano.LiveMultiLineChatLastPkInfo;
import gq1.l$a;
import gq1.k;
import hq1.b;
import gq1.q;
import ix1.c;

public interface abstract l implements c	// class@002556
{

    LiveData Ak();
    SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig B2();
    String D2();
    void Dm(h p0);
    String I1(String p0);
    long I5();
    void Jf();
    List La();
    c O8();
    void Ob(EndLineSource p0);
    b Ph();
    int Q();
    void V(b p0);
    LiveData V6();
    void b6();
    boolean c3();
    t cf(boolean p0,String p1,List p2);
    String f();
    LiveRevenueDeliverySellingChatInfo f2();
    void fd();
    String getBizId();
    int getBizType();
    a hb();
    LiveMultiLineChatLastPkInfo kc();
    void kn();
    void l5(int p0,String p1,String p2,String p3,l$a p4);
    List lk();
    void mn(String p0,l$a p1);
    void mo(k p0);
    boolean o0();
    String p0();
    void qh(h p0);
    b uf();
    void x0(b p0);
    q xo();
    c z1();
}