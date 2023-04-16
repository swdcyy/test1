package ak1.a;
import java.lang.Object;

public class a	// class@0000bc
{
    public final int a;
    public final int b;
    public int c;

    public void a(int p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public int a(){
       return this.c;
    }
    public void b(int p0){
       int i = this.c - p0;
       this.c = i;
       if (i < 0) {
          this.c = 0;
       }
       return;
    }
    public void c(int p0){
       this.c = this.c + p0;
    }
}
