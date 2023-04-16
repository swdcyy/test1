package qj.b;
import java.lang.Object;
import java.util.ArrayList;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.google.android.flexbox.FlexItem;
import java.lang.Math;

public class b	// class@0029eb
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float k;
    public int l;
    public int m;
    public List n;
    public int o;
    public int p;
    public boolean q;
    public boolean r;

    public void b(){
       super();
       this.a = Integer.MAX_VALUE;
       this.b = Integer.MAX_VALUE;
       this.c = Integer.MIN_VALUE;
       this.d = Integer.MIN_VALUE;
       this.n = new ArrayList();
    }
    public int a(){
       return this.g;
    }
    public int b(){
       return this.h;
    }
    public int c(){
       return (this.h - this.i);
    }
    public void d(View p0,int p1,int p2,int p3,int p4){
       FlexItem layoutParams = p0.getLayoutParams();
       this.a = Math.min(this.a, ((p0.getLeft() - layoutParams.Y1()) - p1));
       this.b = Math.min(this.b, ((p0.getTop() - layoutParams.w0()) - p2));
       this.c = Math.max(this.c, ((p0.getRight() + layoutParams.l2()) + p3));
       this.d = Math.max(this.d, ((p0.getBottom() + layoutParams.X0()) + p4));
    }
}
