package i5.j;
import i5.b;
import java.lang.String;
import h5.h;
import java.lang.Object;
import a5.f;
import com.airbnb.lottie.ex.model.layer.a;
import c5.c;
import c5.r;
import java.lang.StringBuilder;

public class j implements b	// class@002181
{
    public final String a;
    public final int b;
    public final h c;
    public final boolean d;

    public void j(String p0,int p1,h p2,boolean p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public c a(f p0,a p1){
       return new r(p0, p1, this);
    }
    public String toString(){
       return "ShapePath{name="+this.a+", index="+this.b+'}';
    }
}
