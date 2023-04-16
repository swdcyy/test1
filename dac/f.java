package dac.f;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment;
import java.lang.Object;
import android.view.View;
import dac.b;
import java.util.Objects;
import xwb.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;

public final class f implements View$OnClickListener	// class@00213e
{
    public final ExploreFriendContactFragment b;

    public void f(ExploreFriendContactFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       f tb = this.b;
       tb.I.b(false);
       b a = tb.I.a;
       Objects.requireNonNull(a);
       if (PatchProxy.applyVoid(null, a, c.class, "16")) {
       }else {
          a.e(a.c(1, 0x753d), null);
       }
       return;
    }
}
