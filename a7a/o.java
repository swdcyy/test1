package a7a.o;
import erd.g;
import a7a.p;
import java.lang.Object;
import d0a.o;
import java.util.Objects;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;

public final class o implements g	// class@000070
{
    public final p b;

    public void o(p p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.a != 2) {
          tb.P8(tb.v.getCurrentPosition());
       }
       return;
    }
}
