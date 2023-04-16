package dta.p0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.homepage.kcube.presenter.e;
import java.lang.Object;
import android.view.View;
import wq6.f;
import com.kwai.kcube.decorator.IContainerDecorator;
import wq6.h;
import wq6.g;

public final class p0 implements View$OnClickListener	// class@002547
{
    public final e b;

    public void p0(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       p0 tb = this.b;
       tb.V8(tb.s.c().U(tb.t.getCurrentPosition()), p0);
    }
}
