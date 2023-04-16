package e2.g;
import android.content.Context;
import android.view.animation.Interpolator;
import java.lang.Object;
import android.widget.OverScroller;

public final class g	// class@001ed6
{
    public OverScroller a;

    public void g(Context p0,Interpolator p1){
       super();
       OverScroller overScroller = (p1 != null)? new OverScroller(p0, p1): new OverScroller(p0);
       this.a = overScroller;
       return;
    }
    public static g c(Context p0){
       return g.d(p0, null);
    }
    public static g d(Context p0,Interpolator p1){
       return new g(p0, p1);
    }
    public void a(){
       this.a.abortAnimation();
    }
    public boolean b(){
       return this.a.computeScrollOffset();
    }
    public void e(int p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8,int p9){
       this.a.fling(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }
    public int f(){
       return this.a.getCurrX();
    }
    public int g(){
       return this.a.getCurrY();
    }
    public int h(){
       return this.a.getFinalX();
    }
    public int i(){
       return this.a.getFinalY();
    }
    public boolean j(){
       return this.a.isFinished();
    }
    public void k(int p0,int p1,int p2,int p3,int p4){
       this.a.startScroll(p0, p1, p2, p3, p4);
    }
}
