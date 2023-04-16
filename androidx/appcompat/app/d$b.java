package androidx.appcompat.app.d$b;
import androidx.appcompat.widget.Toolbar$e;
import androidx.appcompat.app.d;
import java.lang.Object;
import android.view.MenuItem;
import android.view.Window$Callback;

public class d$b implements Toolbar$e	// class@00058a
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public boolean onMenuItemClick(MenuItem p0){
       return this.a.f.onMenuItemSelected(0, p0);
    }
}
