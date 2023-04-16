package androidx.recyclerview.widget.h$c;
import java.lang.Object;

public class h$c	// class@00090b
{
    public final int[] a;
    public final int b;

    public void h$c(int p0){
       super();
       int[] ointArray = new int[p0];
       this.a = ointArray;
       this.b = ointArray.length / 2;
    }
    public int[] a(){
       return this.a;
    }
    public int b(int p0){
       return this.a[(p0 + this.b)];
    }
    public void c(int p0,int p1){
       this.a[(p0 + this.b)] = p1;
    }
}
