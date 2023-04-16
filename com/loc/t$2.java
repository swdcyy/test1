package com.loc.t$2;
import com.loc.ck;
import android.content.Context;
import org.json.JSONObject;
import java.lang.String;
import com.loc.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Object;
import java.io.File;

public final class t$2 extends ck	// class@001466
{
    public final boolean a;
    public final Context b;
    public final long c;
    public final JSONObject d;

    public void t$2(boolean p0,Context p1,long p2,JSONObject p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public final void a(){
       if (this.a != null) {
          Iterator iterator = t.a(t.a(this.b)).iterator();
          while (iterator.hasNext()) {
             t.a(this.b, iterator.next().getName());
          }
       }
       t.c(this.b);
       t.a(this.b, this.d, this.c);
       boolean b = t.a(this.b, this.d);
       if (b == true) {
          t.b(this.b, t.a(this.c));
       }
       if (this.a != null) {
          t.b(this.b);
       }
       if (!b) {
          t.a(this.b, t.a(this.c));
       }
       return;
    }
}
