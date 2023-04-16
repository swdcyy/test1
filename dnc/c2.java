package dnc.c2;
import tkd.b;
import java.lang.String;
import brd.t;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import java.io.File;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest;
import com.kwai.feature.post.api.feature.upload.interfaces.a;

public interface abstract c2 implements b	// class@002290
{

    t A0(String p0);
    t CD(UploadInfo p0);
    void Cc(IUploadInfo p0);
    t KD(IUploadInfo p0,File p1,File p2);
    void Ph(IUploadInfo p0);
    boolean X(String p0);
    String YD(IUploadRequest p0);
    IUploadInfo b3(String p0);
    boolean cancel(String p0);
    void kf(a p0);
    void mL(a p0);
    void yl(IUploadInfo p0);
}
