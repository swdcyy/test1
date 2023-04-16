package bw1.b;
import n3d.a;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.msghandler.b;
import java.lang.String;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;

public final class b implements a	// class@00041e
{
    public final b b;
    public final int c;
    public final String d;

    public void b(b p0,int p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       b tb = this.b;
       b tc = this.c;
       b td = this.d;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined()) {
          tb.a(tc, td);
       }
       return;
    }
}
