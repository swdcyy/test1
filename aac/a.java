package aac.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.explore.activity.ContactsListActivity;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class a implements View$OnClickListener	// class@0000b8
{
    public final ContactsListActivity b;

    public void a(ContactsListActivity p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, ContactsListActivity.class, "17")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 1;
          uElementPack.name = "empty_contacts_friends_next";
          u1.u(1, uElementPack, null);
          tb.finish();
       }
       return;
    }
}
