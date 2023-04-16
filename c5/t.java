package c5.t;
import c5.c;
import d5.a$a;
import com.airbnb.lottie.ex.model.layer.a;
import com.airbnb.lottie.ex.model.content.ShapeTrimPath;
import java.lang.Object;
import java.util.ArrayList;
import d5.a;
import h5.b;
import java.util.List;
import java.lang.String;
import com.airbnb.lottie.ex.model.content.ShapeTrimPath$Type;

public class t implements c, a$a	// class@000ce0
{
    public final String a;
    public final boolean b;
    public final List c;
    public final ShapeTrimPath$Type d;
    public final a e;
    public final a f;
    public final a g;

    public void t(a p0,ShapeTrimPath p1){
       super();
       this.c = new ArrayList();
       this.a = p1.a;
       this.b = p1.f;
       this.d = p1.b;
       a uoa = p1.c.a();
       this.e = uoa;
       a uoa1 = p1.d.a();
       this.f = uoa1;
       a uoa2 = p1.e.a();
       this.g = uoa2;
       p0.d(uoa);
       p0.d(uoa1);
       p0.d(uoa2);
       uoa.a(this);
       uoa1.a(this);
       uoa2.a(this);
    }
    public void b(List p0,List p1){
    }
    public void d(a$a p0){
       this.c.add(p0);
    }
    public void e(){
       for (int i = 0; i < this.c.size(); i = i + 1) {
          this.c.get(i).e();
       }
       return;
    }
    public a f(){
       return this.f;
    }
    public a g(){
       return this.g;
    }
    public String getName(){
       return this.a;
    }
    public a h(){
       return this.e;
    }
    public ShapeTrimPath$Type i(){
       return this.d;
    }
}
