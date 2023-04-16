package dw2.g;
import androidx.lifecycle.Observer;
import android.widget.TextView;
import java.lang.Object;
import dw2.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dw2.i$b;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;

public final class g implements Observer	// class@0025b4
{
    public final TextView b;

    public void g(TextView p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else if(a.g(p0, i$b.d)){
          this.b.setText("");
          this.b.setVisibility(8);
       }else {
          this.b.setText(p0.toString());
          this.b.setVisibility(0);
       }
       return;
    }
}
