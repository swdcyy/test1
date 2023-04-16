package f99.h$a;
import d6a.a;
import f99.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import tkd.b;
import tkd.d;
import vu5.b;
import android.view.View;
import vu5.a;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPreInfo;
import j1b.b;
import j1b.a;
import j1b.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k2b.j0;
import ge5.d;
import ge5.b;
import f99.i;
import f99.j;
import joc.i;
import joc.o;
import joc.p;
import joc.l;
import joc.q;

public class h$a extends a	// class@0022e8
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "2")) {
          return;
       }
       this.b.R8();
       return;
    }
    public void i2(){
       BaseFragment uBaseFragmen;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, h$a.class, str)) {
          return;
       }
       h$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, h.class, "5")) {
          tb.H = false;
          if (tb.d9()) {
             boolean b = (QCurrentUser.ME.getId()).equals(tb.w.getUserId());
             if (PatchProxy.isSupport(h.class)) {
                uBaseFragmen = PatchProxy.applyOneRefs(Boolean.valueOf(b), tb, h.class, "14");
                if (uBaseFragmen != PatchProxyResult.class) {
                }else {
                label_004e :
                   b uob = d.a(-1718536792);
                   BaseFragment uBaseFragmen1 = (b)? uob.My(true, tb.A, tb.N): uob.ix(tb.w.getUser(), tb.w.mEntity, tb.x, true, tb.A, tb.N);
                   uBaseFragmen = uBaseFragmen1;
                   BaseFragment uBaseFragmen2 = PatchProxy.applyOneRefs(uBaseFragmen, objArray, b.class, str);
                   if (uBaseFragmen2 != PatchProxyResult.class) {
                   }else if(uBaseFragmen instanceof a){
                      uBaseFragmen2 = uBaseFragmen;
                   }else if(uBaseFragmen instanceof c){
                      uBaseFragmen2 = uBaseFragmen.C9();
                   }else {
                      uBaseFragmen2 = objArray;
                   }
                   tb.C = uBaseFragmen2;
                   Activity activity = tb.getActivity();
                   if (activity instanceof j0) {
                      uBaseFragmen.ah(activity);
                   }
                }
             }else {
                goto label_004e ;
             }
             tb.B = uBaseFragmen;
             if (!PatchProxy.applyVoid(objArray, tb, h.class, "7")) {
                tb.I = tb.q.Rc().g;
                d f = tb.q.Rc().f;
                tb.J = f;
                if (tb.I != null && f != null) {
                   tb.K = new i(tb);
                   tb.L = new j(tb);
                   tb.I.j(tb.A);
                   tb.I.h.a(tb.K);
                   tb.J.g(tb.L);
                   tb.J.n(tb.A);
                   tb.J.f(true);
                }
             }
          }
       }
    label_00ff :
       return;
    }
}
