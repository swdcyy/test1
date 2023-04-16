package lk9.l;
import n3d.a;
import com.yxcorp.gifshow.comment.emotion.detail.e;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;

public final class l implements a	// class@002e00
{
    public final e b;

    public void l(e p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined()) {
          tb.S8();
       }
       return;
    }
}
