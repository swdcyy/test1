package i5.h;
import i5.b;
import java.lang.String;
import android.graphics.Path$FillType;
import h5.a;
import h5.d;
import java.lang.Object;
import a5.f;
import com.airbnb.lottie.ex.model.layer.a;
import c5.c;
import c5.g;
import java.lang.StringBuilder;

public class h implements b	// class@00217f
{
    public final boolean a;
    public final Path$FillType b;
    public final String c;
    public final a d;
    public final d e;
    public final boolean f;

    public void h(String p0,boolean p1,Path$FillType p2,a p3,d p4,boolean p5){
       super();
       this.c = p0;
       this.a = p1;
       this.b = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public c a(f p0,a p1){
       return new g(p0, p1, this);
    }
    public a b(){
       return this.d;
    }
    public d c(){
       return this.e;
    }
    public String toString(){
       return "ShapeFill{color=, fillEnabled="+this.a+'}';
    }
}
