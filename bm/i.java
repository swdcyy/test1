package bm.i;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import bm.k;
import java.lang.String;
import android.os.Message;
import java.util.Map;
import com.hhh.liveeventbus.a;

public class i	// class@00028d
{
    public final Map a;
    public static i b;

    public void i(){
       super();
       this.a = new ConcurrentHashMap();
    }
    public k a(Class p0){
       return this.c(p0.getName(), p0);
    }
    public k b(String p0){
       return this.c(p0, Message.class);
    }
    public k c(String p0,Class p1){
       if (!this.a.containsKey(p0)) {
          this.a.put(p0, new a());
       }
       return this.a.get(p0);
    }
}
