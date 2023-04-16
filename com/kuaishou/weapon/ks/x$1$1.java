package com.kuaishou.weapon.ks.x$1$1;
import java.lang.Runnable;
import com.kuaishou.weapon.ks.x$1;
import java.lang.Object;
import com.kuaishou.weapon.ks.x;
import java.util.Map;
import com.kuaishou.weapon.ks.d;
import java.lang.String;
import org.json.JSONArray;

public class x$1$1 implements Runnable	// class@00122e
{
    public final x$1 a;

    public void x$1$1(x$1 p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (this.a.a.i.size() > 0) {
          x.a(this.a.a).a("c_n_t", this.a.a.i.toString(), false);
       }
       if (this.a.a.j.length() > 0) {
          x.a(this.a.a).a("m_n_t", this.a.a.j.toString(), false);
       }
       return;
    }
}
