package id.c0;
import com.facebook.imagepipeline.request.ImageRequest;
import vc.h;
import java.lang.String;
import java.lang.Object;
import com.facebook.imagepipeline.image.EncodedImageOrigin;
import java.util.Map;
import com.facebook.imagepipeline.common.Priority;
import id.d0;
import id.e0;
import com.facebook.imagepipeline.request.ImageRequest$RequestLevel;

public interface abstract c0	// class@00219d
{

    ImageRequest b();
    h c();
    Object d(String p0,Object p1);
    EncodedImageOrigin e();
    void f(Map p0);
    String g();
    Object getExtra(String p0);
    Map getExtras();
    String getId();
    Priority getPriority();
    Object h();
    boolean i();
    void j(EncodedImageOrigin p0);
    void k(d0 p0);
    e0 l();
    void m(String p0,Object p1);
    void n(String p0,String p1);
    void o(String p0);
    boolean p();
    ImageRequest$RequestLevel q();
}
