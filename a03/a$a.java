package a03.a$a;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import android.content.Context;
import java.lang.CharSequence;
import android.widget.Toast;

public class a$a implements Runnable	// class@000006
{
    public final String b;

    public void a$a(String p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       Toast.makeText(a.b(), this.b, 0).show();
       return;
    }
}
