package f21.f$b;
import java.lang.Runnable;
import f21.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import dt5.c;
import e17.i;

public final class f$b implements Runnable	// class@0022a5
{
    public final f b;

    public void f$b(f p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "1")) {
          return;
       }
       a0 i1 = this.b.k.i1;
       if (i1 != null && !i1.c()) {
          return;
       }
       i.a(R.style.arg_RES_7f11066a, 0x7f10126a);
       return;
    }
}
