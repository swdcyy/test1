package dj9.a;
import java.lang.Object;
import com.kwai.camerasdk.models.VideoSourceLayout;
import android.graphics.RectF;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.camerasdk.models.SubLayoutIndex;
import java.lang.Integer;
import com.kwai.camerasdk.models.DisplayLayout;
import com.kwai.camerasdk.models.VideoSourceSubLayout;

public class a	// class@001f3f
{

    public void a(){
       super();
    }
    public static RectF a(VideoSourceLayout p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.c(p0, SubLayoutIndex.kLayoutIndexCamera.getNumber());
    }
    public static RectF b(VideoSourceLayout p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.c(p0, SubLayoutIndex.kLayoutIndex1.getNumber());
    }
    public static RectF c(VideoSourceLayout p0,int p1){
       float f1;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       float width = p0.getWidth();
       float height = p0.getHeight();
       float f = 0;
       if (p0.getDisplayLayoutOverride() == DisplayLayout.CENTER) {
          f1 = (0x3f800000 - height) / 2.00f;
          f = (0x3f800000 - width) / 2.00f;
       }else {
          f1 = 0;
       }
       VideoSourceSubLayout subLayouts = p0.getSubLayouts(p1);
       f = f + (subLayouts.getViewportX() * width);
       f1 = f1 + (subLayouts.getViewportY() * height);
       return new RectF(f, f1, ((width * subLayouts.getViewportWidth()) + f), ((height * subLayouts.getViewportHeight()) + f1));
    }
}
