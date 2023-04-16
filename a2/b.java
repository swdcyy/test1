package a2.b;
import android.content.Context;
import java.lang.Object;
import androidx.appcompat.widget.f;
import android.view.View;
import android.view.MenuItem;
import android.view.SubMenu;
import a2.b$a;
import a2.b$b;

public abstract class b	// class@00004e
{
    public final Context a;
    public b$a b;
    public b$b c;

    public void b(Context p0){
       super();
       this.a = p0;
    }
    public boolean a(){
       return this instanceof f;
    }
    public boolean b(){
       return true;
    }
    public abstract View c();
    public View d(MenuItem p0){
       return this.c();
    }
    public boolean e(){
       return false;
    }
    public void f(SubMenu p0){
    }
    public boolean g(){
       return false;
    }
    public void h(){
       this.c = null;
       this.b = null;
    }
    public void i(b$a p0){
       this.b = p0;
    }
    public void j(b$b p0){
       this.c = p0;
    }
    public void k(boolean p0){
       b tb = this.b;
       if (tb != null) {
          tb.d(p0);
       }
       return;
    }
}
