package eha.d;
import vga.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import l66.a;

public class d implements b	// class@002682
{
    public final BaseFragment a;
    public final PublishSubject b;
    public d$a c;

    public void d(BaseFragment p0){
       super();
       this.a = p0;
       this.b = PublishSubject.g();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       if (this.c != null) {
          b.a(0x6d2a4fdd).c(this.c);
       }
       return;
    }
}
