package chd.a;
import n3d.a;
import androidx.fragment.app.FragmentActivity;
import java.lang.String;
import java.lang.Object;
import android.content.Intent;
import tkd.b;
import tkd.d;
import pv5.c;
import java.util.List;
import android.app.Activity;
import oe6.a;
import java.util.Collection;
import ekd.q;
import com.kwai.feature.api.social.login.model.SwitchAccountModel;
import sgd.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import q2b.h$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import k2b.u1;

public final class a implements a	// class@000329
{
    public final FragmentActivity b;
    public final String c;
    public final String d;

    public void a(FragmentActivity p0,String p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       ClientEvent$UrlPackage urlPackage;
       h$b uob;
       ClientContent$ContentPackage uContentPack;
       ClientContent$UserPackage userPackage;
       ClientEvent$ResultPackage resultPackag;
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       List list = d.a(0x6154d94e).k6();
       int i = 1;
       if (list != null && list.size() > i) {
          tb.finish();
       }else {
          a.U(tc);
          a.T(td);
       }
       if (p1 == -1) {
          tb = 7;
          tc = null;
          object oobject = (q.f(list))? tc: list.get(0);
          String str = "";
          if (PatchProxy.isSupport(c.class)) {
             Object[] objArray = new Object[]{Integer.valueOf(5),Integer.valueOf(tb),oobject,Boolean.TRUE,str,Integer.valueOf(0)};
             if (!PatchProxy.applyVoid(objArray, tc, c.class, "6")) {
             }
          }else {
          }
       }
    label_00a0 :
       return;
    }
}
