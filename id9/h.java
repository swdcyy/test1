package id9.h;
import java.lang.Runnable;
import id9.t;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.specific.lyrics.LyricsView;
import pi9.j;
import com.yxcorp.gifshow.camera.record.base.d;
import hd9.n;
import com.yxcorp.gifshow.camera.record.base.b;

public final class h implements Runnable	// class@0027ee
{
    public final t b;

    public void h(t p0){
       this.b = p0;
    }
    public final void run(){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, t.class, "15")) {
       }else if(tb.l2()){
          tb.t.b().h(tb.d.d(n.j).f, true);
       }
       return;
    }
}
