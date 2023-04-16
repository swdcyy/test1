package a63.u;
import kb.b;
import com.yxcorp.image.fresco.wrapper.a$g;
import kb.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.facebook.common.references.a;
import com.facebook.common.memory.PooledByteBuffer;
import eb.f;
import java.io.InputStream;
import com.facebook.imageformat.a;
import com.facebook.imageformat.b;
import com.facebook.animated.webp.WebPImage;
import com.kuaishou.live.gzone.v2.imagepreview.n;

public class u extends b	// class@000065
{
    public final a$g a;
    public final c b;
    public final boolean c;
    public final String d;

    public void u(a$g p0,c p1,boolean p2,String p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onFailureImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "2")) {
          return;
       }
       this.a.onResult(false);
       this.b.close();
       return;
    }
    public void onNewResultImpl(c p0){
       InputStream inputStream;
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "1")) {
          return;
       }
       if (!p0.a()) {
          return;
       }
       if (!p0.hasResult()) {
          this.a.onResult(false);
          return;
       }else {
          a result = p0.getResult();
          if (result == null || !result.k()) {
             this.a.onResult(false);
             this.b.close();
             return;
          }else {
             PooledByteBuffer pooledByteBu = result.j();
             try{
                f uof = new f(pooledByteBu);
                String str = b.a(uof).a();
                if (this.c != null && ("webp").equals(str)) {
                   WebPImage webPImage = WebPImage.a(pooledByteBu.B(), pooledByteBu.size());
                   if (webPImage != null && webPImage.getFrameCount() > 1) {
                      inputStream = n.S8(webPImage);
                      str = "gif";
                      webPImage.dispose();
                   }
                }
                this.a.onResult(n.c9(inputStream, this.d, str));
             }catch(java.io.IOException e0){
                this.a.onResult(false);
             }
             a.f(result);
             this.b.close();
             return;
          }
       }
    }
}
