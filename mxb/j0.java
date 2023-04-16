package mxb.j0;
import mxb.j;
import erd.g;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import java.util.List;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public interface abstract j0	// class@003635
{
    public static final int[] a;

    static {
       j0.a = new int[4]{3000,0x36b0,0xea60,0x30d40};
    }
    void a();
    void b(j p0,int p1);
    void c(j p0);
    j0 d(g p0);
    j0 e(int p0,BaseFeed p1);
    j0 f(AdDataWrapper$AdLogParamAppender p0);
    j g(BaseFeed p0);
    void h(j p0,ClientStat$VideoStatEvent p1);
    void i(j p0,int p1);
    j0 j(int p0,BaseFeed p1,PlcEntryStyleInfo p2);
    void k(int p0,List p1);
    void l(j p0);
    void m(String p0,List p1);
    void n(j p0);
    j0 o(Map p0);
    j0 p(int p0,j p1);
    j0 q(String p0,Object p1);
    void r(j p0);
    j0 s(boolean p0);
    void t(int p0,BaseFeed p1);
    void u(j p0,int p1);
    void v(j p0,int p1,int p2,Map p3);
    void w(j p0);
    j x(BaseFeed p0,PlcEntryStyleInfo p1);
    void y(j p0,int p1,int p2);
}
