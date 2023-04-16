package e1a.i;
import n3d.a;
import com.yxcorp.gifshow.detail.helper.c;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;

public final class i implements a	// class@00204a
{
    public final c b;

    public void i(c p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined()) {
          tb.a();
       }
       return;
    }
}
