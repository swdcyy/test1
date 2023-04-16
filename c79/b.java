package c79.b;
import ub.a;
import com.yxcorp.gifshow.album.imageloader.CompatZoomImageView;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Animatable;
import bd.f;

public class b extends a	// class@0004f4
{
    public final CompatZoomImageView b;

    public void b(CompatZoomImageView p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       p0.A = false;
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "2")) {
       }else {
          b tb = this.b;
          tb.A = true;
          if (p1 != null) {
             tb.d(p1.getWidth(), p1.getHeight());
          }
       }
       return;
    }
    public void onIntermediateImageFailed(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "3")) {
          return;
       }
       p0.A = false;
       return;
    }
    public void onIntermediateImageSet(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "4")) {
       }else {
          b tb = this.b;
          tb.A = true;
          if (p1 != null) {
             tb.d(p1.getWidth(), p1.getHeight());
          }
       }
       return;
    }
}
