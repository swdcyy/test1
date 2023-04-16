package androidx.appcompat.app.d$d;
import androidx.appcompat.view.menu.e$a;
import androidx.appcompat.app.d;
import java.lang.Object;
import androidx.appcompat.view.menu.e;
import w0.k;
import android.view.Menu;
import android.view.Window$Callback;
import android.view.View;
import android.view.MenuItem;

public final class d$d implements e$a	// class@00058c
{
    public final d b;

    public void d$d(d p0){
       this.b = p0;
       super();
    }
    public void a(e p0){
       d$d tb = this.b;
       if (tb.f != null) {
          if (tb.d.g()) {
             this.b.f.onPanelClosed(108, p0);
          }else if(this.b.f.onPreparePanel(0, null, p0)){
             this.b.f.onMenuOpened(108, p0);
          }
       }
       return;
    }
    public boolean b(e p0,MenuItem p1){
       return false;
    }
}
