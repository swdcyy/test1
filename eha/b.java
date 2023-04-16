package eha.b;
import vga.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;

public class b implements b	// class@00267e
{
    public final BaseFragment a;
    public final PublishSubject b;
    public b c;

    public void b(BaseFragment p0){
       super();
       this.a = p0;
       this.b = PublishSubject.g();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b9.a(this.c);
       this.c = null;
       return;
    }
}
