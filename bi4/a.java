package bi4.a;
import androidx.lifecycle.Observer;
import bi4.b;
import java.lang.Object;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailResponse;
import java.util.Objects;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailSearchBoxInfo;
import xh4.c;
import android.view.View;

public final class a implements Observer	// class@000381
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.mSearchBoxInfo;
       int i = (p0 == null)? 1: 0;
       if (p0 == null) {
          p0 = new DetailSearchBoxInfo();
       }
       tb.S8(p0);
       if (i) {
          tb.X8(false);
          tb.Y8(tb.w, false);
       }
       return;
    }
}
