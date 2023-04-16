package l5.i;
import l5.s;
import java.lang.Object;
import android.util.JsonReader;
import l5.j;
import java.lang.Math;
import java.lang.Integer;

public class i implements s	// class@00251f
{
    public static final i a;

    static {
       i.a = new i();
    }
    public void i(){
       super();
    }
    public Object a(JsonReader p0,float p1){
       return Integer.valueOf(Math.round((j.d(p0) * p1)));
    }
}
