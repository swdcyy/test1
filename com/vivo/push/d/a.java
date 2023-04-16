package com.vivo.push.d.a;
import com.vivo.push.l;
import com.vivo.push.o;
import com.vivo.push.b.c;
import android.content.Context;
import com.vivo.push.model.b;
import com.vivo.push.util.t;
import com.vivo.push.e;
import java.lang.String;
import java.lang.Object;
import com.vivo.push.b.e;
import com.vivo.push.util.s;
import com.vivo.push.a.a;

public final class a extends l	// class@001057
{

    public void a(o p0){
       super(p0);
    }
    public final void a(o p0){
       Object[] objArray;
       e uoe;
       c uoc = p0;
       b uob = t.a(this.a);
       int i = 0;
       if (uob == null) {
          objArray = new Object[i];
          e.a().a(uoc.h(), 1005, objArray);
          return;
       }else {
          String str = uob.a();
          if (uob.c()) {
             objArray = new Object[i];
             e.a().a(uoc.h(), 1004, objArray);
             uoe = new e();
          }else {
             int i1 = s.a(uoc);
             if (i1) {
                objArray = new Object[i];
                e.a().a(uoc.h(), i1, objArray);
                return;
             }
          }
          a.a(this.a, str, uoe);
          return;
       }
    }
}
