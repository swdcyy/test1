package aac.f;
import java.lang.Runnable;
import com.yxcorp.gifshow.relation.explore.activity.ContactsListActivity;
import java.lang.Object;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import oe6.e;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class f implements Runnable	// class@0000bd
{
    public final ContactsListActivity b;

    public void f(ContactsListActivity p0){
       this.b = p0;
    }
    public final void run(){
       f tb = this.b;
       if (tb.J.c()) {
          if (tb.D != null) {
             SharedPreferences$Editor uEditor = e.a.edit();
             uEditor.putBoolean("finish_contacts_friends_guide", true);
             g.a(uEditor);
             tb.b2(true);
          }
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 1;
          uElementPack.name = "allow_read_contacts";
          u1.u(true, uElementPack, null);
          tb.y3();
       }
       return;
    }
}
