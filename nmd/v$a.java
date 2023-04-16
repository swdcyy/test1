package nmd.v$a;
import java.lang.Runnable;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class v$a implements Runnable	// class@001e78
{
    public final TextView b;

    public void v$a(TextView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, v$a.class, "1")) {
          return;
       }
       this.b.setVisibility(8);
       return;
    }
}
