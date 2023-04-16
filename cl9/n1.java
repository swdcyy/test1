package cl9.n1;
import android.view.View$OnLongClickListener;
import cl9.r1;
import java.lang.Object;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.QComment;
import wnc.a;
import java.lang.System;
import java.util.concurrent.TimeUnit;
import brd.t;
import com.kwai.framework.model.user.QCurrentUser;
import gk9.c;
import gk9.b;
import brd.w;
import t45.d;
import brd.z;
import java.lang.Integer;
import brd.a0;
import cl9.o1;
import erd.b;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class n1 implements View$OnLongClickListener	// class@00064c
{
    public final r1 b;

    public void n1(r1 p0){
       this.b = p0;
    }
    public final boolean onLongClick(View p0){
       boolean b;
       n1 tb = this.b;
       r1 s = tb.s;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t obj = PatchProxy.applyOneRefs(s, tb, r1.class, "6");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(tb.s.mIsDislikeHideComment != null){
          if (a.a() && (s.mIsGodComment == null && tb.S8(s))) {
             System.currentTimeMillis();
             obj = t.timer(300, TimeUnit.MILLISECONDS);
             QComment mId = s.mId;
             String id = QCurrentUser.me().getId();
             t ot = PatchProxy.applyTwoRefs(mId, id, null, c.class, "23");
             if (ot != patchProxyRe) {
             }else {
                ot = c.f().p(mId, id);
             }
             tb.X7(t.merge(obj, ot).observeOn(d.a).first(Integer.valueOf(-1)).P(new o1(tb, s)));
          }else {
             tb.V8(s, false, false);
          }
       }
       b = true;
       return b;
    }
}
