package b06.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import oe6.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import kp.r1;

public class e	// class@0003e6
{

    public void e(){
       super();
    }
    public static int a(){
       Object obj = PatchProxy.apply(null, null, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (b.g()) {
          return 0x7f080c1f;
       }
       return 0x7f080c1a;
    }
    public static int b(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(new QPhoto(p0));
    }
    public static int c(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0.isChorus()) {
          return e.a();
       }
       if (p0.isKtv()) {
          return 0x7f080c1f;
       }
       if (p0.isAtlasPhotos()) {
          return 0x7f080c17;
       }
       if (p0.isLongPhotos()) {
          return 0x7f080c21;
       }
       return 0x7f080c29;
    }
    public static int d(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0.isKtv()) {
          return 0x7f080a20;
       }
       if (p0.isChorus()) {
          if (b.g()) {
             return 0x7f080a20;
          }
          return 0x7f0809fc;
       }else if(p0.isImageType()){
          if (p0.isAtlasPhotos()) {
             return 0x7f0809fa;
          }
          if (p0.isLongPhotos()) {
             return 0x7f080a0c;
          }
          return 0x7f080a1e;
       }else if(p0.isVideoType() && r1.l3(p0.mEntity)){
          return 0x7f0809f8;
       }else {
          return 0;
       }
    }
}
