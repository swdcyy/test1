package d82.a;
import android.view.View$OnClickListener;
import d82.f;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;

public final class a implements View$OnClickListener	// class@002489
{
    public final f b;

    public void a(f p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, f.class, "6")) {
       }else {
          tb.dismiss();
       }
       return;
    }
}
