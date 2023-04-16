package androidx.work.b$a;
import androidx.work.e$a;
import java.lang.Class;
import androidx.work.OverwritingInputMerger;
import java.lang.String;
import u3.r;
import androidx.work.e;
import androidx.work.b;
import android.os.Build$VERSION;
import k3.b;
import java.lang.IllegalArgumentException;

public final class b$a extends e$a	// class@000a5a
{

    public void b$a(Class p0){
       super(p0);
       p0.d = OverwritingInputMerger.class.getName();
    }
    public e c(){
       return this.h();
    }
    public e$a d(){
       return this;
    }
    public b h(){
       String str = 23;
       if (this.a == null || (Build$VERSION.SDK_INT >= str && this.c.j.h())) {
          throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
       }
       e$a tc = this.c;
       if (tc.q != null && (Build$VERSION.SDK_INT < str || !tc.j.h())) {
          return new b(this);
       }
       throw new IllegalArgumentException("Cannot run in foreground with an idle mode constraint");
    }
    public b$a i(Class p0){
       this.c.d = p0.getName();
       return this;
    }
}
