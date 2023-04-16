package kod.a$d;
import java.lang.Runnable;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$d implements Runnable	// class@0017fb
{
    public final TextView b;

    public void a$d(TextView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$d.class, "1")) {
          return;
       }
       this.b.setVisibility(0);
       return;
    }
}
