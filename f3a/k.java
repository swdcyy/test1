package f3a.k;
import java.lang.Runnable;
import f3a.l$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import f3a.l;

public final class k implements Runnable	// class@002288
{
    public final l$a b;

    public void k(l$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("OcrUiPresenter", "goToPost mood go home", objArray);
       this.b.b.y = true;
       return;
    }
}
