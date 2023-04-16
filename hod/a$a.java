package hod.a$a;
import android.view.View$OnClickListener;
import hod.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import iod.a;
import java.lang.Boolean;
import god.b;

public final class a$a implements View$OnClickListener	// class@000f9d
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.b.d.o0().setValue(Boolean.TRUE);
       b.a.a(true);
       return;
    }
}
