package bq1.h$a;
import androidx.lifecycle.Observer;
import bq1.h;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import kotlin.jvm.internal.a;

public final class h$a implements Observer	// class@0003e5
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "1")) {
       }else {
          ImageView imageView = h.Q3(this.b);
          a.o(p0, "isSelfGuest");
          int i = (p0.booleanValue())? 0: 8;
          imageView.setVisibility(i);
       }
       return;
    }
}
