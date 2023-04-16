package nmd.v$c;
import java.lang.Runnable;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class v$c implements Runnable	// class@001e7a
{
    public final TextView b;

    public void v$c(TextView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, v$c.class, "1")) {
          return;
       }
       this.b.setVisibility(0);
       return;
    }
}
