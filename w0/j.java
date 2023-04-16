package w0.j;
import android.view.Menu;
import androidx.appcompat.view.menu.j$a;
import java.lang.CharSequence;
import android.util.SparseArray;
import android.graphics.drawable.Drawable;
import android.view.Window$Callback;

public interface abstract j	// class@002ea6
{

    boolean a();
    void b(Menu p0,j$a p1);
    boolean c();
    boolean d();
    boolean f();
    boolean g();
    CharSequence getTitle();
    boolean h();
    void i();
    boolean j();
    void k(SparseArray p0);
    void l(SparseArray p0);
    void m(int p0);
    void n();
    void setIcon(int p0);
    void setIcon(Drawable p0);
    void setLogo(int p0);
    void setUiOptions(int p0);
    void setWindowCallback(Window$Callback p0);
    void setWindowTitle(CharSequence p0);
}
