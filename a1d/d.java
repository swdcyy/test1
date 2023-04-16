package a1d.d;
import android.view.View$OnClickListener;
import a1d.k;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.EditText;

public final class d implements View$OnClickListener	// class@00001e
{
    public final k b;

    public void d(k p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, k.class, "11")) {
       }else {
          tb.z.setText("");
       }
       return;
    }
}
