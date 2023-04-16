package i5.g;
import java.lang.Object;
import java.util.ArrayList;
import android.graphics.PointF;
import java.util.List;
import java.util.Collection;
import java.lang.String;
import java.lang.StringBuilder;

public class g	// class@00217e
{
    public final List a;
    public PointF b;
    public boolean c;

    public void g(){
       super();
       this.a = new ArrayList();
    }
    public void g(PointF p0,boolean p1,List p2){
       super();
       this.b = p0;
       this.c = p1;
       this.a = new ArrayList(p2);
    }
    public List a(){
       return this.a;
    }
    public PointF b(){
       return this.b;
    }
    public boolean c(){
       return this.c;
    }
    public String toString(){
       return "ShapeData{numCurves="+this.a.size()+"closed="+this.c+'}';
    }
}
