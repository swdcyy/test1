package m41.a$b;
import lf3.d;
import m41.a;
import java.lang.Object;
import lf3.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import android.util.Base64;
import m41.a$a;
import java.util.Objects;
import java.util.HashSet;
import kotlin.jvm.internal.a;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel;

public final class a$b implements d	// class@00311c
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return c.a(this);
    }
    public final void b(int p0,byte[] p1){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "1")) {
          return;
       }
       if (p1 != null) {
          if (this.a.j.get(Integer.valueOf(p0)) == null) {
             return;
          }else {
             a$a uoa = new a$a(Integer.valueOf(p0), Base64.encodeToString(p1, 0));
             a$b ta = this.a;
             Objects.requireNonNull(ta);
             a uoa1 = a.class;
             if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), uoa, ta, uoa1, "5")) {
                HashSet hashSet = ta.j.get(Integer.valueOf(p0));
                if (hashSet != null) {
                   a.o(hashSet, "it");
                   ta.c(hashSet, uoa);
                }
             }
          }
       }
       return;
    }
}
