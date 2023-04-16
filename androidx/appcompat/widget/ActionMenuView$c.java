package androidx.appcompat.widget.ActionMenuView$c;
import androidx.appcompat.view.menu.e$a;
import androidx.appcompat.widget.ActionMenuView;
import java.lang.Object;
import androidx.appcompat.view.menu.e;
import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView$d;

public class ActionMenuView$c implements e$a	// class@0005d3
{
    public final ActionMenuView b;

    public void ActionMenuView$c(ActionMenuView p0){
       this.b = p0;
       super();
    }
    public void a(e p0){
       ActionMenuView w = this.b.w;
       if (w != null) {
          w.a(p0);
       }
       return;
    }
    public boolean b(e p0,MenuItem p1){
       ActionMenuView b = this.b.B;
       boolean b1 = (b != null && b.onMenuItemClick(p1))? true: false;
       return b1;
    }
}
