package a42.e;
import android.view.View$OnClickListener;
import a42.f;
import java.lang.Object;
import android.view.View;
import a42.b;
import com.yxcorp.gifshow.entity.QPhoto;
import a42.a;

public final class e implements View$OnClickListener	// class@000037
{
    public final f b;

    public void e(f p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e tb = this.b;
       b y = tb.p.y;
       if (y != null) {
          y.a(tb.v);
       }
       return;
    }
}
