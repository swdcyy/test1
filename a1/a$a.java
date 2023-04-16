package a1.a$a;
import android.os.Handler$Callback;
import a1.a;
import java.lang.Object;
import android.os.Message;
import a1.a$c;
import java.lang.String;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import java.lang.StackTraceElement;
import java.lang.RuntimeException;
import a1.a$e;
import a1.a$d;

public class a$a implements Handler$Callback	// class@00003a
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public boolean handleMessage(Message p0){
       p0 = p0.obj;
       String str = p0.toString();
       if (p0.d == null) {
          String str1 = "Async failed fallback to normal: "+str;
          try{
             Log.n("AsyncLayoutInflater", str1);
             p0.d = a.c(this.b.a, p0.c, p0.b, false);
          }catch(java.lang.RuntimeException e0){
             a$c f = p0.f;
             if (f != null && f.length > 0) {
                e0.setStackTrace(f);
             }
             throw e0;
          }
       }else {
          Log.g("AsyncLayoutInflater", "Async infalte success: "+str);
       }
       p0.e.onInflateFinished(p0.d, p0.c, p0.b);
       Log.g("AsyncLayoutInflater", "Release inflate request: "+str);
       this.b.c.e(p0);
       return true;
    }
}
