package d5.g;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import com.airbnb.lottie.ex.model.content.Mask;
import d5.a;
import h5.h;
import h5.d;

public class g	// class@001e04
{
    public final List a;
    public final List b;
    public final List c;

    public void g(List p0){
       super();
       this.c = p0;
       this.a = new ArrayList(p0.size());
       this.b = new ArrayList(p0.size());
       for (int i = 0; i < p0.size(); i = i + 1) {
          this.a.add(p0.get(i).b.a());
          this.b.add(p0.get(i).c.a());
       }
       return;
    }
    public List a(){
       return this.a;
    }
    public List b(){
       return this.c;
    }
    public List c(){
       return this.b;
    }
}
