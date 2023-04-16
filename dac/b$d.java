package dac.b$d;
import java.lang.Runnable;
import dac.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import k2b.l;
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
import com.kwai.feature.api.social.relation.model.ExploreFriendParams;
import android.content.Context;
import tkd.b;
import tkd.d;
import wu5.a;

public final class b$d implements Runnable	// class@002134
{
    public final b b;
    public final boolean c;

    public void b$d(b p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$d.class, "1")) {
          return;
       }
       boolean b = this.b.e();
       l.b("connectContact\(\) runnable execute ,"+"userDeviceGranted is "+b);
       if (b) {
          if (!PatchProxy.applyVoid(objArray, objArray, g.class, "3")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.name = "relate_contacts";
             int i = 1;
             uElementPack.type = i;
             uElementPack.action = 920;
             u1.u(i, uElementPack, objArray);
          }
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
                      uFragment.Td(this.c);
                   }
                }
             }
          }
          d = this.b.d;
          if (!d instanceof e) {
             objArray1 = objArray;
          }
          if (objArray1 != null) {
             objArray1.Td(this.c);
          }
          b$d tb = this.b;
          b b1 = tb.b;
          if (b1 != null) {
             if (b1.enableStartContactsListActivity != null) {
                objArray = b1;
             }
             if (objArray != null) {
                Context context = tb.d.getContext();
                if (context != null) {
                   d.a(0x6de3c81e).Eo(context, false, 100);
                }
             }
          }
       }
    label_00b3 :
       return;
    }
}
