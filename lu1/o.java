package lu1.o;
import androidx.lifecycle.Observer;
import lu1.q;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import java.lang.CharSequence;
import android.widget.TextView;

public final class o implements Observer	// class@003047
{
    public final q b;

    public void o(q p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
       }else {
          q.e3(this.b).setText(p0);
       }
       return;
    }
}
