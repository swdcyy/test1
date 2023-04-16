package ik.f$a;
import android.os.Handler$Callback;
import ik.f;
import java.lang.Object;
import android.os.Message;
import ik.f$c;

public class f$a implements Handler$Callback	// class@0021f6
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public boolean handleMessage(Message p0){
       if (p0.what != null) {
          return false;
       }
       this.b.c(p0.obj);
       return true;
    }
}
