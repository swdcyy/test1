package com.vivo.push.d.b;
import com.vivo.push.l;
import com.vivo.push.o;
import com.vivo.push.b.d;
import android.content.Context;
import com.vivo.push.model.b;
import com.vivo.push.util.t;
import com.vivo.push.d.f;
import java.lang.String;
import java.lang.Object;
import com.vivo.push.b.y;
import com.vivo.push.a.a;
import com.vivo.push.b.f;
import java.lang.Exception;

public final class b extends l	// class@001061
{

    public void b(o p0){
       super(p0);
    }
    public final void a(o p0){
       try{
          b uob = t.a(this.a);
          boolean b = (p0.d())? f.a(this.a): f.b(this.a);
          if (b) {
             b uob1 = t.a(this.a);
             if (uob != null && (uob1 != null && (uob1.a() != null && (uob1.a()).equals(uob.a())))) {
                return;
             }else if(uob != null && uob.a() != null){
                a.a(this.a, uob.a(), new y(uob.a()));
             }
             if (uob1 != null && uob1.a() != null) {
                a.a(this.a, uob1.a(), new f());
             }
          }
          return;
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
          return;
       }
    }
}
