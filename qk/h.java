package qk.h;
import qk.h$a;
import qk.h$b;
import java.lang.Object;
import java.lang.Comparable;
import java.util.Comparator;

public abstract class h	// class@0029ff
{
    public static final h a;
    public static final h b;
    public static final h c;

    static {
       h.a = new h$a();
       h.b = new h$b(-1);
       h.c = new h$b(1);
    }
    public void h(){
       super();
    }
    public void h(h$a p0){
       super();
    }
    public static h j(){
       return h.a;
    }
    public abstract h a(double p0,double p1);
    public abstract h b(float p0,float p1);
    public abstract h c(int p0,int p1);
    public abstract h d(long p0,long p1);
    public abstract h e(Comparable p0,Comparable p1);
    public abstract h f(Object p0,Object p1,Comparator p2);
    public abstract h g(boolean p0,boolean p1);
    public abstract h h(boolean p0,boolean p1);
    public abstract int i();
}
