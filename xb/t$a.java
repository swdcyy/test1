package xb.t$a;
import xb.t$b;
import java.lang.Object;
import android.graphics.Matrix;
import android.graphics.Rect;

public abstract class t$a implements t$b	// class@003050
{

    public void t$a(){
       super();
    }
    public Matrix a(Matrix p0,Rect p1,int p2,int p3,float p4,float p5){
       int i = p2;
       int i1 = p3;
       this.b(p0, p1, i, i1, p4, p5, ((float)p1.width() / (float)i), ((float)p1.height() / (float)i1));
       return p0;
    }
    public abstract void b(Matrix p0,Rect p1,int p2,int p3,float p4,float p5,float p6,float p7);
}
