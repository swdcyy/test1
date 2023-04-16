package a2.i0$g;
import java.lang.Class;
import java.lang.Object;
import android.os.Build$VERSION;
import android.view.View;

public abstract class i0$g	// class@000066
{
    public final int a;
    public final Class b;
    public final int c;
    public final int d;

    public void i0$g(int p0,Class p1,int p2){
       super(p0, p1, 0, p2);
    }
    public void i0$g(int p0,Class p1,int p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.c = p3;
    }
    public final boolean a(){
       boolean b = (Build$VERSION.SDK_INT >= this.c)? true: false;
       return b;
    }
    public abstract Object b(View p0);
    public abstract void c(View p0,Object p1);
    public Object d(View p0){
       if (this.a()) {
          return this.b(p0);
       }
       p0 = p0.getTag(this.a);
       if (this.b.isInstance(p0)) {
          return p0;
       }
       return null;
    }
}
