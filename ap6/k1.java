package ap6.k1;
import java.lang.Runnable;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import hp6.b;
import xp6.x;
import lh0.a$l0;
import lh0.a$h0;
import java.util.List;
import yp6.c;
import java.util.ArrayList;
import mp6.d;
import com.kwai.imsdk.internal.entity.KwaiGroupMemberDao;
import java.lang.Iterable;
import org.greenrobot.greendao.AbstractDao;

public final class k1 implements Runnable	// class@000346
{
    public final b b;
    public final String c;

    public void k1(b p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       k1 tb = this.b;
       k1 tc = this.c;
       b uob = b.i(tb.b).j(tc);
       if (uob.b() != null && x.b(uob)) {
          List list = c.e(uob.b().a, tc);
          if (list.size() > 0) {
             d.a(tb.b).f().insertOrReplaceInTx(list);
          }
       }
       return;
    }
}
