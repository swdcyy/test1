package y80.c;
import y80.e;
import java.lang.String;
import com.kuaishou.gifshow.kuaishan.network.feed.KSTemplateFeedListResponse;
import y80.b;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import crd.b;
import java.util.List;
import brd.t;

public interface abstract c implements e	// class@0030ee
{

    void D(String p0);
    void K(String p0);
    int O();
    KSTemplateFeedListResponse P(String p0);
    void W(String p0,boolean p1,boolean p2);
    void a();
    void disconnect();
    void f(b p0);
    b f0(KSTemplateDetailInfo p0);
    void h0(String p0,String p1,boolean p2);
    boolean i0();
    void j0();
    KSTemplateDetailInfo l0();
    List m(String p0,String p1);
    String p();
    void r(List p0);
    void t(String p0,int p1);
    b u(KSTemplateDetailInfo p0);
    t v(String p0,boolean p1);
    void y(String p0,String p1);
}
