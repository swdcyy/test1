package androidx.appcompat.widget.ActionMenuPresenter$e;
import androidx.appcompat.view.menu.j$a;
import androidx.appcompat.widget.ActionMenuPresenter;
import java.lang.Object;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.a;
import android.view.MenuItem;
import androidx.appcompat.view.menu.h;

public class ActionMenuPresenter$e implements j$a	// class@0005ce
{
    public final ActionMenuPresenter b;

    public void ActionMenuPresenter$e(ActionMenuPresenter p0){
       this.b = p0;
       super();
    }
    public void b(e p0,boolean p1){
       if (p0 instanceof m) {
          p0.F().e(false);
       }
       j$a uoa = this.b.q();
       if (uoa != null) {
          uoa.b(p0, p1);
       }
       return;
    }
    public boolean c(e p0){
       ActionMenuPresenter$e tb = this.b;
       boolean b = false;
       if (p0 == tb.d) {
          return b;
       }
       tb.E = p0.getItem().getItemId();
       j$a uoa = this.b.q();
       if (uoa != null) {
          b = uoa.c(p0);
       }
       return b;
    }
}
