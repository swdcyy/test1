package fyd.a$a;
import fyd.a$c;
import java.lang.String;
import java.lang.Object;
import fyd.a;
import java.lang.Throwable;
import java.lang.AssertionError;

public final class a$a extends a$c	// class@000ef4
{

    public void a$a(){
       super();
    }
    public void b(String p0,Object[] p1){
       a$c[] c = a.c;
       int len = c.length;
       for (int i = 0; i < len; i = i + 1) {
          c[i].b(p0, p1);
       }
       return;
    }
    public void c(int p0,String p1,String p2,Throwable p3){
       throw new AssertionError("Missing override for log method.");
    }
}
