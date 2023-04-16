package bw4.b$a;
import android.os.Handler;
import bw4.b;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b$a extends Handler	// class@0003dd
{
    public final b a;

    public void b$a(b p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       this.a.c(p0, false);
       return;
    }
}
