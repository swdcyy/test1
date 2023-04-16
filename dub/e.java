package dub.e;
import erd.g;
import dub.k;
import java.lang.Object;
import eda.l;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import ekd.q;

public final class e implements g	// class@00256f
{
    public final k b;

    public void e(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, k.class, "13")) {
       }else if(TextUtils.n(tb.d, QCurrentUser.me().getId())){
          if (!q.h(tb.b)) {
             tb.b.clear();
          }
          tb.d = QCurrentUser.me().getId();
       }
       return;
    }
}
