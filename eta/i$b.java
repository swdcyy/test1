package eta.i$b;
import vn5.d;
import eta.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import tra.b;
import java.lang.StringBuilder;
import q87.c;
import crd.b;
import lnc.b9;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import k9c.e;
import java.lang.Integer;
import java.lang.Number;
import wq6.h;
import zr6.e;
import wq6.f;
import zq6.r;
import rn5.a;
import zq6.p;
import sn5.e;
import java.util.Map;
import ekd.q;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import tkd.b;
import tkd.d;
import lv5.c;
import lha.b;
import lv5.b;
import sua.o;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import ko5.d;
import ko5.c;
import ao5.c;
import ao5.b;
import on5.b;
import xr6.c$a;
import xr6.c;
import com.kwai.kcube.TabIdentifier;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.model.FollowTabNotify;

public class i$b implements d	// class@0027e2
{
    public final i a;

    public void i$b(i p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(i$b.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), this, i$b.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       b.C().w("HomeTabLifecycleAwareness", "onBottomTabSelected: "+p0, objArray);
       b9.a(this.a.i);
       Object[] objArray1 = null;
       if (p0 && p2) {
          i$b ta = this.a;
          Objects.requireNonNull(ta);
          i oi = i.class;
          if (!PatchProxy.applyVoid(objArray1, ta, oi, "11")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "NAVIGATION_RED_POINT";
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("red_point_id", e.b("HOME"));
             jsonObject.c0("name", "HOME");
             jsonObject.a0("type", Integer.valueOf(true));
             e uoe = ta.n().e0().d(a.i);
             if (uoe != null) {
                uoe = uoe.e;
                if (!PatchProxy.applyVoidTwoRefs(jsonObject, uoe, ta, oi, "12") && !q.h(uoe)) {
                   Iterator iterator = uoe.entrySet().iterator();
                   while (iterator.hasNext()) {
                      Map$Entry oi2 = iterator.next();
                      if (!TextUtils.x(oi2.getKey()) && !TextUtils.x(oi2.getValue())) {
                         jsonObject.c0(oi2.getKey(), oi2.getValue());
                      }
                   }
                }
             }
             uElementPack.params = jsonObject.toString();
             u1.u(true, uElementPack, objArray1);
          }
       }
       b oi1 = d.a(-242212848).o5();
       d.a(-242212848).jH(objArray1);
       if (p1 || (p2 && (!o.a() && this.a.b() instanceof FragmentActivity))) {
          b uob = c.a(this.a.b()).j().e();
          if (uob != null && (uob.j() && uob.l())) {
             uob.m(i);
             if (this.a.n().V(b.e, c.a("ForceSwitchActivityTab").a())) {
                if (p0 && (this.c() && oi1 != null)) {
                   oi1.d(true);
                   d.a(-242212848).EZ(oi1);
                   RxBus.f.b(oi1);
                }
             label_0170 :
                return;
             }
          }
       }
    label_0171 :
       if (p0 && (p1 || (p2 && this.c()))) {
          FollowTabNotify uFollowTabNo = d.a(-242212848).YB();
          if (uFollowTabNo != null) {
             uFollowTabNo.mClickType = 2;
          }
          this.a.n().V(b.c, c.a("FollowRedPoint").a());
       }
    label_01a3 :
       return;
    }
    public void b(boolean p0,boolean p1){
    }
    public final boolean c(){
       boolean b = (this.a.g == 3)? true: false;
       return b;
    }
}
