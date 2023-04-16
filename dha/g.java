package dha.g;
import vga.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import l66.a;

public class g implements b	// class@0024a7
{
    public final PublishSubject a;
    public final BaseFragment b;
    public g$a c;

    public void g(BaseFragment p0){
       super();
       this.b = p0;
       this.a = PublishSubject.g();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       if (this.c != null) {
          b.a(0x6d2a4fdd).c(this.c);
       }
       return;
    }
}
