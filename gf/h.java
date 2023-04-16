package gf.h;
import java.lang.Object;
import android.graphics.Rect;

public class h	// class@0020a9
{
    public int a;
    public int b;
    public int c;
    public int d;

    public void h(){
       super();
    }
    public void b(Rect p0){
       Rect left = p0.left;
       this.a = left;
       Rect top = p0.top;
       this.b = top;
       this.c = p0.right - left;
       this.d = p0.bottom - top;
    }
}
