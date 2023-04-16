package fia.c$a;
import java.lang.Runnable;
import fia.c;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c$a implements Runnable	// class@0028f1
{
    public final c b;
    public final SlidePlayViewModel c;

    public void c$a(c p0,SlidePlayViewModel p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       this.c.k(this.b.v, false);
       return;
    }
}
