package a2.u0$i;
import a2.u0$h;
import a2.u0;
import android.view.WindowInsets;
import a2.u0$g;
import java.lang.Object;
import java.util.Objects;
import a2.d;
import android.view.DisplayCutout;

public class u0$i extends u0$h	// class@0000b3
{

    public void u0$i(u0 p0,u0$i p1){
       super(p0, p1);
    }
    public void u0$i(u0 p0,WindowInsets p1){
       super(p0, p1);
    }
    public u0 a(){
       return u0.w(this.c.consumeDisplayCutout());
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof u0$i) {
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
