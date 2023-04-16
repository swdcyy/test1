package ga.l$d;
import android.view.View$OnKeyListener;
import ga.l;
import java.lang.Object;
import android.view.View;
import android.view.KeyEvent;

public class l$d implements View$OnKeyListener	// class@002072
{
    public final l b;

    public void l$d(l p0){
       this.b = p0;
       super();
    }
    public boolean onKey(View p0,int p1,KeyEvent p2){
       if (p1 != 4 || (p2.getAction() || !this.b.k())) {
          return false;
       }
       this.b.a();
       return true;
    }
}
