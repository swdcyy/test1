package a2.v0$d;
import a2.v0$e;
import android.view.Window;
import a2.v0;
import android.view.WindowInsetsController;
import androidx.collection.SimpleArrayMap;

public class v0$d extends v0$e	// class@0000be
{
    public final v0 a;
    public final WindowInsetsController b;
    public final SimpleArrayMap c;

    public void v0$d(Window p0,v0 p1){
       super(p0.getInsetsController(), p1);
    }
    public void v0$d(WindowInsetsController p0,v0 p1){
       super();
       this.c = new SimpleArrayMap();
       this.b = p0;
       this.a = p1;
    }
    public int a(){
       return this.b.getSystemBarsBehavior();
    }
    public void b(int p0){
       this.b.hide(p0);
    }
}
