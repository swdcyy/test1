package nd.b;
import android.graphics.ColorSpace;
import java.lang.Object;
import android.util.Pair;
import java.lang.Integer;

public class b	// class@0026ef
{
    public final Pair a;
    public final ColorSpace b;

    public void b(int p0,int p1,ColorSpace p2){
       super();
       int i = -1;
       Pair pair = (p0 == i || p1 == i)? null: new Pair(Integer.valueOf(p0), Integer.valueOf(p1));
       this.a = pair;
       this.b = p2;
       return;
    }
    public Pair a(){
       return this.a;
    }
}
