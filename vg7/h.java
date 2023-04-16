package vg7.h;
import vg7.h$a;
import java.lang.Object;
import vg7.h$b;
import java.lang.StringBuilder;
import java.lang.ThreadLocal;

public class h	// class@0026aa
{
    public ThreadLocal a;
    public int b;
    public static ThreadLocal c;

    static {
       h.c = new h$a();
    }
    public void h(){
       super(512);
    }
    public void h(int p0){
       super();
       this.a = new h$b(this);
       this.b = p0;
    }
    public static StringBuilder b(){
       StringBuilder str = h.c.get();
       str.setLength(0);
       return str;
    }
    public StringBuilder a(){
       StringBuilder str = this.a.get();
       str.setLength(0);
       return str;
    }
}
