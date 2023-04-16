package ga.a$d;
import android.view.View$OnKeyListener;
import ga.a;
import java.lang.Object;
import android.view.View;
import android.view.KeyEvent;

public class a$d implements View$OnKeyListener	// class@002053
{
    public final a b;

    public void a$d(a p0){
       this.b = p0;
       super();
    }
    public boolean onKey(View p0,int p1,KeyEvent p2){
       if (p1 != 4 || (p2.getAction() || !this.b.g())) {
          return false;
       }
       this.b.a();
       return true;
    }
}
