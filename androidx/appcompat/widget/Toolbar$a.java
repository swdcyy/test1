package androidx.appcompat.widget.Toolbar$a;
import androidx.appcompat.widget.ActionMenuView$d;
import androidx.appcompat.widget.Toolbar;
import java.lang.Object;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar$e;

public class Toolbar$a implements ActionMenuView$d	// class@00062e
{
    public final Toolbar a;

    public void Toolbar$a(Toolbar p0){
       this.a = p0;
       super();
    }
    public boolean onMenuItemClick(MenuItem p0){
       Toolbar h = this.a.H;
       if (h != null) {
          return h.onMenuItemClick(p0);
       }
       return false;
    }
}
