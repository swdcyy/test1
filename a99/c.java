package a99.c;
import android.view.View$OnClickListener;
import a99.g;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class c implements View$OnClickListener	// class@00005c
{
    public final g b;

    public void c(g p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       g og = g.class;
       if (PatchProxy.applyVoid(null, tb, og, "15")) {
       }else {
          tb.a9();
          tb.R8();
          tb.r.setVisibility(8);
       }
       p0.setVisibility(8);
       if (!PatchProxy.applyVoid(null, tb, og, "21")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 1;
          uElementPack.name = "long_photo_scroll_to_comment";
          u1.u(1, uElementPack, null);
       }
       return;
    }
}
