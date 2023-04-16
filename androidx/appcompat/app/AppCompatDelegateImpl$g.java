package androidx.appcompat.app.AppCompatDelegateImpl$g;
import androidx.appcompat.view.menu.j$a;
import androidx.appcompat.app.AppCompatDelegateImpl;
import java.lang.Object;
import androidx.appcompat.view.menu.e;
import android.view.Window$Callback;
import android.view.Menu;

public final class AppCompatDelegateImpl$g implements j$a	// class@000577
{
    public final AppCompatDelegateImpl b;

    public void AppCompatDelegateImpl$g(AppCompatDelegateImpl p0){
       this.b = p0;
       super();
    }
    public void b(e p0,boolean p1){
       this.b.V(p0);
    }
    public boolean c(e p0){
       Window$Callback uCallback = this.b.o0();
       if (uCallback != null) {
          uCallback.onMenuOpened(108, p0);
       }
       return true;
    }
}
