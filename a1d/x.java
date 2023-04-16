package a1d.x;
import android.view.View$OnClickListener;
import a1d.a0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.CheckBox;
import java.lang.Boolean;
import im8.f;

public final class x implements View$OnClickListener	// class@00005e
{
    public final a0 b;

    public void x(a0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       x tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, a0.class, "5")) {
       }else {
          int i = tb.v.isChecked() ^ 0x01;
          tb.v.setChecked(i);
          tb.r.set(Boolean.valueOf(i));
       }
       return;
    }
}
