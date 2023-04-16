package e1a.j;
import n3d.a;
import com.yxcorp.gifshow.detail.helper.c;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;

public final class j implements a	// class@00204b
{
    public final c b;

    public void j(c p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined()) {
          tb.a();
       }
       return;
    }
}
