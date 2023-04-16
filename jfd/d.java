package jfd.d;
import jfd.b;
import java.lang.String;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import java.lang.CharSequence;
import com.yxcorp.gifshow.model.CDNUrl;
import com.facebook.imagepipeline.request.ImageRequest;
import com.kuaishou.android.model.feed.PhotoType;
import com.kuaishou.android.model.mix.CommonMeta;

public interface abstract d implements b	// class@0016d8
{

    String a();
    boolean b();
    FeedLogCtx c0();
    String d();
    boolean e();
    boolean f();
    float g();
    float getCoverAspectRatio();
    String getExpTag();
    int getMediaType();
    float getRatio();
    String getUserId();
    CharSequence getUserName();
    int getVideoType();
    boolean h();
    boolean isLongVideo();
    boolean isVideoType();
    CDNUrl[] j(int p0,int p1);
    int k();
    ImageRequest[] l();
    PhotoType m();
    CDNUrl[] n();
    CommonMeta o();
    boolean p();
    boolean q();
}
