package oe.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class b extends ImageRequest	// class@002780
{
    public final ReadableMap x;

    public void b(ImageRequestBuilder p0,ReadableMap p1){
       super(p0);
       this.x = p1;
    }
    public static b x(ImageRequestBuilder p0,ReadableMap p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(p0, p1);
    }
}
