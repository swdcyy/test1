package eha.c;
import vga.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import org.greenrobot.eventbus.a;

public class c implements b	// class@002680
{
    public final BaseFragment a;
    public final PublishSubject b;
    public c$a c;

    public void c(BaseFragment p0){
       super();
       this.a = p0;
       this.b = PublishSubject.g();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       if (this.c != null) {
          a.d().t(this.c);
       }
       return;
    }
}
