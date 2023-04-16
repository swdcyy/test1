package dnc.x0;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import java.lang.String;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import com.kwai.video.editorsdk2.EncodedSegmentInfo;

public interface abstract x0	// class@0022e4
{

    void a(int p0);
    boolean b(PostEncodeInfo p0,UploadInfo p1);
    int c(UploadInfo p0);
    void d(PostWorkInfo p0);
    void e(PostWorkInfo p0);
    boolean f(PostWorkInfo p0);
    boolean g(PostWorkInfo p0);
    void h(PostWorkInfo p0);
    void i(String p0,boolean p1);
    void j(PostWorkInfo p0);
    float k(PostWorkInfo p0);
    x0 l();
    void m(int p0);
    boolean n(EncodeInfo p0,UploadInfo p1);
    void o(int p0);
    void p(int p0);
    boolean q(EncodeInfo p0,UploadInfo p1);
    void r(int p0);
    void s(int p0,int p1);
    void t(int p0);
    void u(String p0,String p1,int p2,boolean p3,PostWorkInfo p4,EncodedSegmentInfo p5);
    void v(int p0);
    void w(PostWorkInfo p0);
}
