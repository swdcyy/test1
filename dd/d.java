package dd.d;
import id.f0;
import java.lang.String;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Throwable;
import java.lang.Object;

public interface abstract d implements f0	// class@0014b5
{

    void onRequestCancellation(String p0);
    void onRequestFailure(ImageRequest p0,String p1,Throwable p2,boolean p3);
    void onRequestStart(ImageRequest p0,Object p1,String p2,boolean p3);
    void onRequestSuccess(ImageRequest p0,String p1,boolean p2);
}
