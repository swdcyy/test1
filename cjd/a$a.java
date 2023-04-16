package cjd.a$a;
import java.lang.Runnable;
import cjd.a;
import java.lang.Object;
import erd.g;
import java.lang.Exception;

public class a$a implements Runnable	// class@00032e
{
    public final Object b;
    public final a c;

    public void a$a(a p0,Object p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       try{
          this.c.b.accept(this.b);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
}
