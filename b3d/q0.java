package b3d.q0;
import java.lang.Runnable;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import v0d.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import da6.f;
import android.content.SharedPreferences;
import mw4.a;
import java.lang.System;
import h3b.a;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.HashMap;
import wkd.b;
import m1d.a;
import java.util.Map;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import com.yxcorp.login.util.u;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class q0 implements Runnable	// class@00033f
{
    public final RequestTiming b;

    public void q0(RequestTiming p0){
       this.b = p0;
    }
    public final void run(){
       q0 tb = this.b;
       HashMap obj = PatchProxy.apply(null, null, j.class, "4");
       long l = 0;
       long l1 = (obj != PatchProxyResult.class)? obj.longValue(): f.a.getLong("TokenRefreshInterval", l);
       if (!l1 - l) {
          l1 = a.a.getLong("RefreshServiceTokenIntervalMs", 0x9a7ec800);
       }
       if ((System.currentTimeMillis() - a.d()) - l1 >= 0 && !TextUtils.x(QCurrentUser.me().getPassToken())) {
          obj = new HashMap();
          obj.put("userId", QCurrentUser.me().getId());
          obj.put("passToken", TextUtils.I(QCurrentUser.me().getPassToken()));
          t ot = b.a(0x5cfaafff).L(obj, tb);
          ot.map(new e()).observeOn(d.c).subscribe(u.b, Functions.d());
       }
       return;
    }
}
