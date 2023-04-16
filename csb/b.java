package csb.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.nearby.common.view.TipRefreshView;
import java.lang.Object;
import android.view.View;
import android.widget.TextView;
import com.kwai.library.widget.refresh.RefreshLayout;
import lsb.a;

public final class b implements View$OnClickListener	// class@0023a7
{
    public final TipRefreshView b;

    public void b(TipRefreshView p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       tb.b.setTargetOrRefreshViewOffsetY((- tb.f.getHeight()));
       tb.e();
       tb.p.invoke();
    }
}
