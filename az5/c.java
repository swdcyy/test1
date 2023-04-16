package az5.c;
import erd.g;
import az5.i;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.System;
import java.lang.Long;
import androidx.collection.LruCache;
import az5.f;
import java.lang.Runnable;
import android.os.Handler;

public final class c implements g	// class@0003d0
{
    public final i b;
    public final String c;

    public void c(i p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, i.class, "6")) {
       }else if(tb.b == null || TextUtils.x(tc)){
          tb.b.put(tc, Long.valueOf(System.currentTimeMillis()));
          tb.c.post(new f(tb));
       }
       return;
    }
}
