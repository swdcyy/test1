package bq1.i$a;
import androidx.lifecycle.Observer;
import bq1.i;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import kotlin.jvm.internal.a;

public final class i$a implements Observer	// class@0003e9
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
       }else {
          ImageView imageView = i.O3(this.b);
          a.o(p0, "isSelfGuest");
          i = (p0.booleanValue())? 0: 8;
          imageView.setVisibility(i);
       }
       return;
    }
}
