package i5.i;
import i5.b;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import a5.f;
import com.airbnb.lottie.ex.model.layer.a;
import c5.c;
import c5.d;
import java.lang.StringBuilder;
import java.util.Arrays;

public class i implements b	// class@002180
{
    public final String a;
    public final List b;
    public final boolean c;

    public void i(String p0,List p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public c a(f p0,a p1){
       return new d(p0, p1, this);
    }
    public List b(){
       return this.b;
    }
    public String toString(){
       return "ShapeGroup{name=\'"+this.a+"\' Shapes: "+Arrays.toString(this.b.toArray())+'}';
    }
}
