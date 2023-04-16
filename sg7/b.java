package sg7.b;
import sg7.a;
import java.lang.Object;
import java.lang.String;
import sg7.d;

public abstract class b implements a	// class@00241e
{
    public int a;
    public int b;
    public String c;

    public void b(){
       super();
       this.a = 0;
       this.b = Integer.MAX_VALUE;
    }
    public b a(String p0){
       this.c = p0;
       return this;
    }
    public b b(int p0,int p1){
       this.a = p0;
       this.b = p1;
       return this;
    }
    public abstract d build();
}
