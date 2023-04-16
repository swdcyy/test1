package af5.a$a;
import d6a.a;
import af5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.yxcorp.gifshow.entity.QPhoto;

public class a$a extends a	// class@00008d
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       PhotoDetailLogger photoDetailL = this.b.t.get();
       if (photoDetailL != null) {
          photoDetailL.putBizParam("click_photo_index", String.valueOf((this.b.r.getPosition() + 1)));
       }
       return;
    }
}
