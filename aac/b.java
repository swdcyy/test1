package aac.b;
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
import xwb.c;

public final class b implements View$OnClickListener	// class@0000b9
{
    public final ContactsListActivity b;

    public void b(ContactsListActivity p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, ContactsListActivity.class, "16")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 1;
          uElementPack.name = "finish";
          u1.u(1, uElementPack, null);
          tb.finish();
          ContactsListActivity h = tb.H;
          Objects.requireNonNull(h);
          if (!PatchProxy.applyVoid(null, h, c.class, "9")) {
             h.e(h.c(1, 0x7803), null);
          }
       }
       return;
    }
}
