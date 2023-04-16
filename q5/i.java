package q5.i;
import q5.m;
import q5.b;
import java.lang.Object;
import z4.a;
import z4.m;
import java.util.List;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import q5.n;

public class i implements m	// class@002969
{
    public final b a;
    public final b b;

    public void i(b p0,b p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public a a(){
       return new m(this.a.a(), this.b.a());
    }
    public List b(){
       throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
    public boolean c(){
       boolean b = (this.a.c() && this.b.c())? true: false;
       return b;
    }
}
