package boc.l;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.util.resource.f;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.util.resource.f$c;

public final class l implements View$OnClickListener	// class@000447
{
    public final f b;

    public void l(f p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       l tb = this.b;
       f l = tb.l;
       if (l != null) {
          l.a();
       }
       tb.e();
       return;
    }
}
