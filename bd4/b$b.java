package bd4.b$b;
import com.yxcorp.gifshow.widget.m;
import bd4.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import bd4.a;
import androidx.fragment.app.FragmentActivity;
import rk0.b;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.MerchantRecommendInfoModel;
import android.app.Activity;
import com.kuaishou.merchant.router.b;

public final class b$b extends m	// class@000386
{
    public final b c;

    public void b$b(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       b$b tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, b.class, "3")) {
          a s = tc.s;
          if (s != null) {
             b.k(tc.P8(), s.mJumpUrl);
             tc.V8();
          }
       }
       return;
    }
}
