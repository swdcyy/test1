package ab0.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;

public class a0 extends PresenterV2	// class@000036
{
    public KwaiEmptyStateView p;

    public void a0(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0d0d);
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.k(R.drawable.arg_RES_7f080603);
       uoa.h(R.string.arg_RES_7f10489d);
       uoa.a(this.p);
       return;
    }
}
