package ai8.a;
import android.content.Intent;
import java.lang.Object;

public class a	// class@0000a3
{
    public final int a;
    public final int b;
    public final Intent c;

    public void a(int p0,int p1,Intent p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof a) {
          return false;
       }
       if (p0.a != this.a) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return this.a;
    }
}
