package eha.e;
import vga.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import l66.a;

public class e implements b	// class@002684
{
    public final BaseFragment a;
    public final PublishSubject b;
    public e$a c;

    public void e(BaseFragment p0){
       super();
       this.a = p0;
       this.b = PublishSubject.g();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       if (this.c != null) {
          b.a(0x6d2a4fdd).c(this.c);
       }
       return;
    }
}
