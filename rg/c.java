package rg.c;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import rg.c$a;
import rg.c$b;
import rg.c$c;
import java.util.List;

public class c	// class@00237d
{
    public List a;

    public void c(){
       super();
       this.a = new CopyOnWriteArrayList();
    }
    public void c(c$a p0){
       super();
       this.a = new CopyOnWriteArrayList();
    }
    public static c a(){
       return c$b.a;
    }
    public void b(c$c p0){
       this.a.add(0, p0);
    }
}
