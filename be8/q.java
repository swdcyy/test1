package be8.q;
import wc.c;
import brd.v;
import kb.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import brd.g;
import android.graphics.Bitmap;

public final class q extends c	// class@00033e
{
    public final v a;

    public void q(v p0){
       this.a = p0;
       super();
    }
    public void onFailureImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       this.a.onError(p0.e());
       return;
    }
    public void onNewResultImpl(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       this.a.onNext(p0);
       this.a.onComplete();
       return;
    }
}
