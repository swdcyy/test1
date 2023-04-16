package gz8.b$c;
import gc6.k;
import gz8.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import p5a.c;

public final class b$c implements k	// class@002524
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "1")) {
          return;
       }
       b$c tb = this.b;
       b e = tb.e;
       Objects.requireNonNull(e, "null cannot be cast to non-null type com.yxcorp.gifshow.detail.qphotoplayer.QPhotoMediaPlayer");
       tb.a(e.i());
       return;
    }
}
