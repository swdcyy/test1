package l5.g;
import l5.s;
import java.lang.Object;
import android.util.JsonReader;
import l5.j;
import java.lang.Float;

public class g implements s	// class@00251d
{
    public static final g a;

    static {
       g.a = new g();
    }
    public void g(){
       super();
    }
    public Object a(JsonReader p0,float p1){
       return Float.valueOf((j.d(p0) * p1));
    }
}
