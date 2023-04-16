package f69.a;
import android.view.View$OnClickListener;
import f69.c;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import qa9.s;

public final class a implements View$OnClickListener	// class@0022ae
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, c.class, "8")) {
       }else {
          s.b(tb.p);
       }
       return;
    }
}
