package b8a.x1$a;
import d6a.a;
import b8a.x1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;

public class x1$a extends a	// class@000415
{
    public final x1 b;

    public void x1$a(x1 p0){
       this.b = p0;
       super();
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, x1$a.class, "1")) {
          return;
       }
       int i = this.b.q.c();
       int i1 = 3;
       if (i == 1) {
          this.b.p.get().setEnterAction(i1);
       }else if(i == 2){
          this.b.p.get().setEnterAction(2);
       }else if(i == i1){
          this.b.p.get().setEnterAction(5);
       }else {
          this.b.p.get().setEnterAction(1);
       }
       return;
    }
}
