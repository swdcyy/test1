package bh8.e;
import android.view.View$OnClickListener;
import bh8.m;
import com.mini.plcmanager.PlcModel;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.String;
import java.lang.ref.WeakReference;
import android.app.Activity;

public final class e implements View$OnClickListener	// class@000363
{
    public final m b;
    public final PlcModel c;

    public void e(m p0,PlcModel p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       tb.e(tc.j, false, false, tc.d);
       m d = tb.d;
       if (d != null && d.get() != null) {
          tb.d.get().finish();
       }
       return;
    }
}
