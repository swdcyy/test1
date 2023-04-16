package com.vivo.push.d.g;
import com.vivo.push.d.z;
import com.vivo.push.o;
import java.lang.StringBuilder;
import java.lang.String;
import com.vivo.push.l;
import android.content.Context;
import com.vivo.push.util.p;
import com.vivo.push.util.y;

public final class g extends z	// class@001066
{

    public void g(o p0){
       super(p0);
    }
    public final void a(o p0){
       p.d("OnClearCacheTask", "delete push info "+this.a.getPackageName());
       y.b(this.a).a();
    }
}
