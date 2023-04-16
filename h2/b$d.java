package h2.b$d;
import h2.b$s;
import java.lang.String;
import h2.b$g;
import java.lang.Object;
import android.view.View;

public final class b$d extends b$s	// class@0020d3
{

    public void b$d(String p0){
       super(p0, null);
    }
    public float a(Object p0){
       return this.c(p0);
    }
    public void b(Object p0,float p1){
       this.d(p0, p1);
    }
    public float c(View p0){
       return (float)p0.getScrollX();
    }
    public void d(View p0,float p1){
       p0.setScrollX((int)p1);
    }
}
