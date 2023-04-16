package m5a.d$b;
import android.database.DataSetObserver;
import m5a.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class d$b extends DataSetObserver	// class@002f3c
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public void onChanged(){
       if (PatchProxy.applyVoid(null, this, d$b.class, "1")) {
          return;
       }
       super.onChanged();
       this.a.P8();
       return;
    }
}
