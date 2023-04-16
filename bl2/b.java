package bl2.b;
import androidx.lifecycle.Observer;
import bl2.j;
import java.lang.Object;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wk2.s;
import lnc.a1;
import vk2.b;
import crd.b;
import lnc.b9;
import bl2.j$a;
import j26.a;
import j26.c;

public final class b implements Observer	// class@00040a
{
    public final j b;

    public void b(j p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       j oj = j.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, oj, "3")) {
       }else if(PatchProxy.applyVoidOneRefs(p0, tb, oj, "4") || p0 == null){
          if (!TextUtils.x(tb.C) && !TextUtils.n(tb.C, p0.mSubscribeId)) {
             s.l(1);
             b.e(a1.p(R.string.arg_RES_7f102cb8));
          }else {
             s.l(0);
             b.e(a1.p(R.string.arg_RES_7f102cae));
          }
       }
       String str = (p0 == null)? a1.p(R.string.arg_RES_7f102ce2): p0.mSubscribeTimeDesc;
       if (tb.B != null) {
          b9.a(tb.E);
          tb.B.a(str);
       }
       p0 = (p0 == null)? "": p0.mSubscribeId;
       tb.C = p0;
       tb.z.c(new a(str, p0));
       return;
    }
}
