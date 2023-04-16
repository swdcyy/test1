package boc.m;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.util.resource.f;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.util.resource.f$c;

public final class m implements View$OnClickListener	// class@000448
{
    public final f b;

    public void m(f p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       m tb = this.b;
       f l = tb.l;
       if (l != null) {
          l.b();
       }
       tb.dismiss();
       return;
    }
}
