package a7a.m;
import erd.g;
import a7a.n;
import java.lang.Object;
import d0a.o;
import java.util.Objects;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;

public final class m implements g	// class@00006c
{
    public final n b;

    public void m(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.a != 2) {
          tb.P8(tb.r.getCurrentPosition());
       }
       return;
    }
}
