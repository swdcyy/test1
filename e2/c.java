package e2.c;
import android.content.Context;
import java.lang.Object;
import android.widget.EdgeEffect;
import android.graphics.Canvas;

public final class c	// class@001ed2
{
    public EdgeEffect a;

    public void c(Context p0){
       super();
       this.a = new EdgeEffect(p0);
    }
    public static void e(EdgeEffect p0,float p1,float p2){
       p0.onPull(p1, p2);
    }
    public boolean a(Canvas p0){
       return this.a.draw(p0);
    }
    public void b(){
       this.a.finish();
    }
    public boolean c(){
       return this.a.isFinished();
    }
    public boolean d(int p0){
       this.a.onAbsorb(p0);
       return true;
    }
    public boolean f(float p0){
       this.a.onPull(p0);
       return true;
    }
    public boolean g(float p0,float p1){
       c.e(this.a, p0, p1);
       return true;
    }
    public boolean h(){
       this.a.onRelease();
       return this.a.isFinished();
    }
    public void i(int p0,int p1){
       this.a.setSize(p0, p1);
    }
}
