package b8a.p0;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.l;
import java.lang.Object;
import java.lang.Boolean;
import android.widget.RelativeLayout;

public final class p0 implements g	// class@0003d7
{
    public final l b;

    public void p0(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l p = this.b.p;
       int i = (p0.booleanValue())? 8: 0;
       p.setVisibility(i);
       return;
    }
}
