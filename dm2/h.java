package dm2.h;
import n3d.a;
import com.kuaishou.live.core.show.vote.presenter.c;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;

public final class h implements a	// class@002546
{
    public final c b;

    public void h(c p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (!QCurrentUser.ME.isLogined()) {
       }else {
          tb.j9();
       }
       return;
    }
}
