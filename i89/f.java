package i89.f;
import java.lang.String;
import brd.t;
import java.lang.Boolean;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.util.Map;

public interface abstract f	// class@00264e
{

    t a(boolean p0,String p1,boolean p2,String p3,int p4,String p5,String p6,String p7,int p8);
    t b(String p0);
    t c(boolean p0,String p1,boolean p2,String p3,int p4,String p5,String p6,String p7,int p8,int p9);
    t d(boolean p0,String p1,String p2,boolean p3,String p4,int p5,String p6,String p7,int p8);
    t dialogReport(String p0);
    t e(boolean p0,String p1,boolean p2,String p3,int p4,String p5,String p6,String p7,int p8,int p9,int p10);
    t f(String p0);
    t g(String p0,String p1,String p2,boolean p3,int p4,int p5,boolean p6,int p7,boolean p8,long p9,int p10,String p11,int p12,String p13,boolean p14,String p15,String p16,float p17,boolean p18,int p19,String p20,String p21,boolean p22,long p23,String p24,String p25,Boolean p26,String p27,long p28,String p29,String p30,String p31,String p32,String p33,String p34,int p35,boolean p36,String p37,int p38);
    t h(String p0,RequestTiming p1);
    t i(boolean p0,int p1,int p2,int p3,int p4,String p5,String p6,int p7,RequestTiming p8);
    t j(boolean p0,int p1,int p2,int p3,String p4,int p5,RequestTiming p6);
    t postFeedStat(int p0,String p1,String p2);
    t requestAction(String p0,Map p1);
}
