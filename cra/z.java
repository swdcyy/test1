package cra.z;
import cra.z$a;
import nsd.u;
import android.app.Activity;
import com.yxcorp.gifshow.model.response.dialog.KemDialog9Response;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class z	// class@00239a
{
    public final Activity a;
    public final KemDialog9Response b;
    public static final z$a c;

    static {
       z.c = new z$a(null);
    }
    public void z(Activity p0,KemDialog9Response p1){
       a.p(p0, "activity");
       a.p(p1, "response");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Activity a(){
       return this.a;
    }
    public final KemDialog9Response b(){
       return this.b;
    }
}
