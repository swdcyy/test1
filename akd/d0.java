package akd.d0;
import java.lang.Object;
import bkd.a;
import zjd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import akd.d0$a;
import java.lang.Void;
import android.os.AsyncTask;

public class d0	// class@00004e
{

    public void d0(){
       super();
    }
    public static void a(a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d0.class, "1")) {
          return;
       }
       Void[] voidArray = new Void[0];
       new d0$a(p0, p1).execute(voidArray);
       return;
    }
}
