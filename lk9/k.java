package lk9.k;
import n3d.a;
import com.yxcorp.gifshow.comment.emotion.detail.e;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;

public final class k implements a	// class@002dff
{
    public final e b;

    public void k(e p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined()) {
          tb.R8();
       }
       return;
    }
}
