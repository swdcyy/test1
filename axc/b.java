package axc.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.widget.EditPreviewPlayControlView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.widget.Button;
import com.yxcorp.gifshow.v3.widget.EditPreviewPlayControlView$b;
import lwc.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import android.util.Pair;
import lnc.v6;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class b implements View$OnClickListener	// class@0002e0
{
    public final EditPreviewPlayControlView b;

    public void b(EditPreviewPlayControlView p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       int i = tb.g ^ 1;
       String str = "2";
       if (!PatchProxy.isSupport(EditPreviewPlayControlView.class) || (!PatchProxy.applyVoidTwoRefs(Boolean.valueOf(i), Boolean.TRUE, tb, EditPreviewPlayControlView.class, str) && tb.g != i)) {
          tb.g = i;
          if (i) {
             tb.f.setBackgroundResource(R.drawable.arg_RES_7f081c85);
          }else {
             tb.f.setBackgroundResource(R.drawable.arg_RES_7f08086a);
          }
          EditPreviewPlayControlView n = tb.n;
          if (n != null) {
             n.b(tb.g);
          }
          EditPreviewPlayControlView g = tb.g;
          b uob = b.class;
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(g), Boolean.TRUE, null, uob, str)) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             Pair[] pairArray = new Pair[]{new Pair("is_play", Boolean.valueOf(g)),new Pair("full_screen", Boolean.TRUE)};
             uElementPack.params = this.a(pairArray);
             uElementPack.action2 = "PLAY_PHOTO";
             u1.u(1, uElementPack, new ClientContent$ContentPackage());
          }
       }
    label_008d :
       return;
    }
}
