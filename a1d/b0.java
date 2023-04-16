package a1d.b0;
import android.view.View$OnClickListener;
import a1d.h0;
import java.lang.Object;
import android.view.View;
import android.widget.ImageView;

public final class b0 implements View$OnClickListener	// class@000016
{
    public final h0 b;

    public void b0(h0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b0 tb = this.b;
       if (!tb.r.getVisibility()) {
          tb.R8();
       }
       return;
    }
}
