package f3a.m;
import java.lang.Runnable;
import f3a.l$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import f3a.l;

public final class m implements Runnable	// class@002291
{
    public final l$c b;

    public void m(l$c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("OcrUiPresenter", "goToPost go home", objArray);
       this.b.b.y = true;
       return;
    }
}
