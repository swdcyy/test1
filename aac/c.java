package aac.c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.explore.activity.ContactsListActivity;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xwb.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class c implements View$OnClickListener	// class@0000ba
{
    public final ContactsListActivity b;

    public void c(ContactsListActivity p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, ContactsListActivity.class, "18")) {
       }else {
          ContactsListActivity i = tb.I;
          Objects.requireNonNull(i);
          if (!PatchProxy.applyVoid(null, i, c.class, "19")) {
             i.e(i.c(1, 0x75b2), new ClientContent$ContentPackage());
          }
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 1;
          uElementPack.name = "finish";
          u1.u(1, uElementPack, null);
          tb.finish();
       }
       return;
    }
}
