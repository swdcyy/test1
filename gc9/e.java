package gc9.e;
import java.lang.Runnable;
import gc9.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;

public final class e implements Runnable	// class@002475
{
    public final a b;
    public final boolean c;

    public void e(a p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("RecordAudioController", "onMusicModeChanged, sidebar is not shown, run after show, anim:"+this.c, objArray);
       this.b.k2(this.c);
       this.b.t = true;
       return;
    }
}
