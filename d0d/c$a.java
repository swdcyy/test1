package d0d.c$a;
import okhttp3.EventListener$Factory;
import d0d.c;
import java.lang.Object;
import okhttp3.Call;
import okhttp3.EventListener;
import d0d.d;
import d0d.g$b;
import java.util.Iterator;
import java.util.List;
import d0d.d$a;
import d0d.b;
import java.util.LinkedList;
import java.lang.String;
import com.yxcorp.utility.Log;

public class c$a implements EventListener$Factory	// class@001458
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public EventListener create(Call p0){
       d uod = new d(this.a.a);
       Iterator iterator = this.a.c.iterator();
       while (iterator.hasNext()) {
          d$a uoa = iterator.next();
          if (uoa != null) {
             b uob = uoa.create(p0);
             if (uob != null) {
                uod.a.add(uob);
             }
          }else {
             Log.g("FactoryBuilder", "Factory为null，可能造成http event listener factory注册失败，请留意！");
          }
       }
       return uod;
    }
}
