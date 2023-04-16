package id9.i;
import java.lang.Runnable;
import id9.t;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import yh9.j;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.specific.lyrics.LyricsView;
import pi9.j;

public final class i implements Runnable	// class@0027ef
{
    public final t b;

    public void i(t p0){
       this.b = p0;
    }
    public final void run(){
       i tb = this.b;
       if (tb.d.d(j.i).b() || (!PatchProxy.applyVoid(null, tb, t.class, "16") && tb.l2())) {
          tb.t.b().h(0, true);
       }
    label_0032 :
       return;
    }
}
