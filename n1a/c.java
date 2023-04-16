package n1a.c;
import android.view.View$OnClickListener;
import n1a.g;
import java.lang.Object;
import android.view.View;
import a27.c;
import android.widget.EditText;
import android.text.Editable;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import k1a.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import e17.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import n1a.d;
import java.lang.Iterable;
import ok.o;
import qk.y;
import android.widget.TextView;
import psb.c;
import psb.a;
import brd.t;
import cjd.e;
import erd.o;
import n1a.e;
import n1a.h;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class c implements View$OnClickListener	// class@0030b4
{
    public final g b;

    public void c(g p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       boolean b;
       c tb = this.b;
       c.d(tb.r);
       String str = TextUtils.G(tb.r).toString();
       g v = tb.v;
       if (PatchProxy.applyVoidTwoRefs(v, str, null, b.class, "4")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "ADD_BUTTON";
          i3 oi3 = i3.f();
          oi3.d("input_text", str);
          uElementPack.params = oi3.e();
          b.a(v, uElementPack);
       }
       if (tb.v.q().getCount() >= 30) {
          i.a(R.style.arg_RES_7f11066a, 0x7f1017fb);
          tb.R8();
       }else {
          Object obj = PatchProxy.applyOneRefs(str, tb, g.class, "6");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(y.i(tb.v.q().getItems(), new d(str), null) != null){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             i.a(R.style.arg_RES_7f11066a, 0x7f1017f7);
             tb.R8();
          }else {
             tb.s.setEnabled(false);
             tb.r.setEnabled(false);
             tb.X7(a.a().j(str).map(new e()).subscribe(new e(tb, str), new h(tb)));
          }
       }
       return;
    }
}
