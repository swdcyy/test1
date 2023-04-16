package a2.l$i;
import a2.l$h;
import a2.l;
import android.view.WindowInsets;
import a2.l$g;
import java.lang.Object;
import java.util.Objects;
import a2.d;
import android.view.DisplayCutout;

public class l$i extends l$h	// class@000082
{

    public void l$i(l p0,l$i p1){
       super(p0, p1);
    }
    public void l$i(l p0,WindowInsets p1){
       super(p0, p1);
    }
    public l a(){
       return l.n(this.c.consumeDisplayCutout());
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof l$i) {
          return false;
       }
       if (!Objects.equals(this.c, p0.c) || !Objects.equals(this.g, p0.g)) {
          b = false;
       }
       return b;
    }
    public d f(){
       return d.e(this.c.getDisplayCutout());
    }
    public int hashCode(){
       return this.c.hashCode();
    }
}
