package bm.l;
import androidx.lifecycle.Observer;
import java.lang.Object;

public class l implements Observer	// class@000290
{
    public final Observer b;
    public boolean c;

    public void l(Observer p0){
       super();
       this.b = p0;
    }
    public void onChanged(Object p0){
       if (this.c != null) {
          this.c = false;
          return;
       }else {
          this.b.onChanged(p0);
          return;
       }
    }
}
