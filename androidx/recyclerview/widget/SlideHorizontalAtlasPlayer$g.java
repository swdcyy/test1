package androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$g;
import erd.g;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class SlideHorizontalAtlasPlayer$g implements g	// class@0008ba
{
    public final SlideHorizontalAtlasPlayer b;

    public void SlideHorizontalAtlasPlayer$g(SlideHorizontalAtlasPlayer p0){
       this.b = p0;
       super();
    }
    public final void a(Long p0){
       if (p0.longValue() <= 0) {
          this.b.B();
          p0.y = 0;
       }else {
          a.o(p0, "it");
          this.b.y = p0.longValue();
       }
       return;
    }
    public void accept(Object p0){
       this.a(p0);
    }
}
