package androidx.recyclerview.widget.SlideVerticalAtlasPlayer$e;
import erd.g;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class SlideVerticalAtlasPlayer$e implements g	// class@0008cd
{
    public final SlideVerticalAtlasPlayer b;

    public void SlideVerticalAtlasPlayer$e(SlideVerticalAtlasPlayer p0){
       this.b = p0;
       super();
    }
    public final void a(Long p0){
       if (p0.longValue() <= 0) {
          this.b.z();
          p0.m = 0;
       }else {
          a.o(p0, "it");
          this.b.m = p0.longValue();
       }
       return;
    }
    public void accept(Object p0){
       this.a(p0);
    }
}
