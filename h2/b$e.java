package h2.b$e;
import h2.b$s;
import java.lang.String;
import h2.b$g;
import java.lang.Object;
import android.view.View;

public final class b$e extends b$s	// class@0020d4
{

    public void b$e(String p0){
       super(p0, null);
    }
    public float a(Object p0){
       return this.c(p0);
    }
    public void b(Object p0,float p1){
       this.d(p0, p1);
    }
    public float c(View p0){
       return (float)p0.getScrollY();
    }
    public void d(View p0,float p1){
       p0.setScrollY((int)p1);
    }
}
