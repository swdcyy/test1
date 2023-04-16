package jl8.a;
import jl8.d;
import java.lang.Object;
import java.util.HashMap;
import jl8.c;
import java.lang.Integer;
import java.util.Map;

public class a implements d	// class@00296d
{
    public final Map a;

    public void a(){
       super();
       this.a = new HashMap();
    }
    public c a(int p0){
       return this.a.get(Integer.valueOf(p0));
    }
    public void b(c p0){
       int i = p0.f();
       if (this.a.containsKey(Integer.valueOf(i))) {
          return;
       }
       this.a.put(Integer.valueOf(i), p0);
       return;
    }
}
