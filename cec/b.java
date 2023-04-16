package cec.b;
import oj0.a;
import cec.d;
import java.lang.Object;
import java.util.Map;
import java.util.Objects;
import fg6.a;
import java.lang.String;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import com.google.gson.Gson;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.p0;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import wkd.b;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;
import brd.t;
import tac.b;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class b implements a	// class@000585
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void W(Map p0){
       b tb = this.b;
       try{
          Objects.requireNonNull(tb);
          User user = a.a.h(p0.get("user"), User.class);
          if (user != null) {
             if (!p0.C(tb.getContext())) {
                i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1038e7));
             }else {
                tb.X7(b.a(-1578665399).a(user).subscribe(Functions.d(), Functions.d()));
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
