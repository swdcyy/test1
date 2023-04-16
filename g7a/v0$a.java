package g7a.v0$a;
import erd.g;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import rkd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import zg5.a;

public final class v0$a implements g	// class@0023ff
{
    public final PhotoDetailLogger b;

    public void v0$a(PhotoDetailLogger p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v0$a.class, "1")) {
       }else {
          a.o(p0, "visible");
          if (p0.booleanValue()) {
             this.b.enterStayForCommentEditor();
          }else {
             this.b.exitStayForCommentEditor();
             if (b.b()) {
                RxBus.f.b(new a(false));
             }
          }
       }
       return;
    }
}
