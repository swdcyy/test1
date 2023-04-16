package p90.d;
import android.view.View$OnClickListener;
import com.kuaishou.gifshow.kuaishan.ui.edit.videoedit.KuaishanVideoClipFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u80.e;
import q87.c;
import crd.b;
import t90.j;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class d implements View$OnClickListener	// class@0028f1
{
    public final KuaishanVideoClipFragment b;

    public void d(KuaishanVideoClipFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       d tb = this.b;
       boolean b = false;
       tb.v = b;
       if (PatchProxy.applyVoid(null, tb, KuaishanVideoClipFragment.class, "8")) {
       }else {
          tb.eh();
          Object[] objArray = new Object[b];
          e.D().s("KuaishanVideoClipFragment", "disposeProcess\(\) called", objArray);
          KuaishanVideoClipFragment l = tb.l;
          if (l != null && !l.isDisposed()) {
             tb.l.dispose();
          }
          String str = "PRODUCE_CANCEL";
          if (!PatchProxy.applyVoidOneRefs(str, null, j.class, "27")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = str;
             u1.u(1, uElementPack, null);
          }
          tb.l = null;
       }
       return;
    }
}
