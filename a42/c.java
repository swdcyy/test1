package a42.c;
import android.view.View$OnClickListener;
import a42.d;
import java.lang.Object;
import android.view.View;
import a42.b;
import com.yxcorp.gifshow.entity.QPhoto;
import a42.a;

public final class c implements View$OnClickListener	// class@000035
{
    public final d b;

    public void c(d p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       b y = tb.p.y;
       if (y != null) {
          y.a(tb.u);
       }
       return;
    }
}
