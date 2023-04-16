package c11.b$b$a;
import java.lang.Runnable;
import c11.b$b;
import vq5.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c11.b;
import kotlin.jvm.internal.a;
import android.content.Context;

public final class b$b$a implements Runnable	// class@00044c
{
    public final b$b b;
    public final d c;

    public void b$b$a(b$b p0,d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b$b$a.class, "1")) {
          return;
       }
       b n = this.b.b.N;
       a.m(n);
       this.c.r4(n, null);
       return;
    }
}
