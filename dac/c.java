package dac.c;
import n3d.a;
import dac.b;
import r4d.a;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import hcc.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import androidx.fragment.app.Fragment;
import dac.e;

public final class c implements a	// class@002138
{
    public final b b;
    public final a c;

    public void c(b p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, c.class, "1")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, objArray, g.class, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.name = "relate_qq_friends";
          int i = 1;
          uElementPack.type = i;
          uElementPack.action = 919;
          u1.u(i, uElementPack, objArray);
       }
       if (this.c.isLogined()) {
          b d = this.b.d;
          if (!d instanceof TabHostFragment) {
             d = objArray;
          }
          if (d != null) {
             List list = d.nh();
             if (list != null) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   Fragment uFragment = iterator.next();
                   if (!uFragment instanceof e) {
                      uFragment = objArray;
                   }
                   if (uFragment != null) {
                      uFragment.O8();
                   }
                }
             }
          }
          d = this.b.d;
          if (d instanceof e) {
             objArray = d;
          }
          if (objArray != null) {
             objArray.O8();
          }
       }
       return;
    }
}
