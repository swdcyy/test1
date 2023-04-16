package dha.d;
import vga.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import xl8.b;
import java.lang.Integer;
import vga.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;

public class d implements b	// class@0024a3
{
    public final b a;
    public final BaseFragment b;

    public void d(BaseFragment p0){
       super();
       this.b = p0;
       this.a = new b(Integer.valueOf(0));
    }
    public void a(){
       a.a(this);
    }
    public void b(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "2")) {
          return;
       }
       this.a.d(Integer.valueOf(p0));
       return;
    }
}
