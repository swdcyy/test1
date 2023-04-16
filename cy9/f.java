package cy9.f;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.common.information.cocreate.panel.b;
import java.lang.Object;
import android.view.View;
import androidx.fragment.app.KwaiDialogFragment;

public final class f implements View$OnClickListener	// class@001e36
{
    public final b b;

    public void f(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       this.b.q.dismissAllowingStateLoss();
    }
}
