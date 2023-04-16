package f4a.c0;
import java.lang.Object;

public final class c0	// class@00229d
{
    public int a;

    public void c0(){
       super();
    }
    public static boolean d(int p0){
       boolean b = ((p0 & 5) == 5)? true: false;
       return b;
    }
    public void a(int p0){
       this.a = p0 | this.a;
    }
    public void b(int p0){
       this.a = (~ p0) & this.a;
    }
    public int c(){
       return this.a;
    }
}
