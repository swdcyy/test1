package e8a.h0;
import n3d.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.h;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;

public final class h0 implements a	// class@0020ab
{
    public final h b;

    public void h0(h p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       h0 tb = this.b;
       Objects.requireNonNull(tb);
       if (!QCurrentUser.ME.isLogined()) {
       }else {
          tb.P8();
       }
       return;
    }
}
