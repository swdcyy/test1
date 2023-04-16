package b86.h;
import android.os.Handler;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class h	// class@00043f
{
    public final Handler a;
    public final Handler b;
    public final Handler c;

    public void h(Handler p0,Handler p1,Handler p2){
       a.p(p0, "featureHandler");
       a.p(p1, "controlHandler");
       a.p(p2, "engineHandler");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final Handler a(){
       return this.c;
    }
    public final Handler b(){
       return this.a;
    }
}
