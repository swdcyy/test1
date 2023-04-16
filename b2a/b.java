package b2a.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import android.view.View;

public final class b implements View$OnClickListener	// class@000355
{
    public final ProgressFragment b;

    public void b(ProgressFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       this.b.dismiss();
    }
}
