package wc.c;
import kb.b;
import android.graphics.Bitmap;
import kb.c;
import java.lang.Object;
import com.facebook.common.references.a;
import bd.b;

public abstract class c extends b	// class@002f45
{

    public void c(){
       super();
    }
    public abstract void onNewResultImpl(Bitmap p0);
    public void onNewResultImpl(c p0){
       if (!p0.a()) {
          return;
       }
       a result = p0.getResult();
       b uob = null;
       if (result != null && result.j() instanceof b) {
          uob = result.j().g();
       }
       this.onNewResultImpl(uob);
       a.f(result);
       return;
    }
}
