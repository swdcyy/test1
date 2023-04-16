package nz0.d;
import android.view.View$OnClickListener;
import nz0.f;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import android.app.Activity;
import com.yxcorp.utility.n;
import d61.y;

public final class d implements View$OnClickListener	// class@003435
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (y.d(n.d(p0))) {
          tb.P8();
       }
       return;
    }
}
