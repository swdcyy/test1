package do1.a;
import android.view.View$OnClickListener;
import do1.d;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a implements View$OnClickListener	// class@001fd8
{
    public final d b;

    public void a(d p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, d.class, "10")) {
       }else {
          tb.S8();
          tb.V8(false);
       }
       return;
    }
}
