package eha.f;
import vga.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;

public class f implements b	// class@002685
{
    public final BaseFragment a;
    public final PublishSubject b;
    public b c;

    public void f(BaseFragment p0){
       super();
       this.a = p0;
       this.b = PublishSubject.g();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       f tc = this.c;
       if (tc != null) {
          b9.a(tc);
       }
       return;
    }
}
