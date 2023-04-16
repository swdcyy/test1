package o1a.a;
import android.view.View$OnClickListener;
import o1a.f;
import java.lang.Object;
import android.view.View;
import y8c.d;
import k1a.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import k2b.e0;
import a27.c;
import kzc.d;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import u07.t$a;
import o1a.c;
import u07.u;
import o1a.b;
import o1a.e;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;

public final class a implements View$OnClickListener	// class@00326a
{
    public final f b;

    public void a(f p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       f t = tb.t;
       f p = tb.p;
       int i = tb.q.get();
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidFourRefs(t, "DELETE", p, Integer.valueOf(i), null, b.class, "6")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "BLOCKED_KEYWORDS_LIST";
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("button_name", "DELETE");
          jsonObject.G("list_text", a.a.x(p));
          uElementPack.params = jsonObject.toString();
          b.a(t, uElementPack);
       }
       c.d(p0);
       d uod = new d(tb.getActivity());
       uod.W0(R.string.arg_RES_7f100226);
       uod.S0(R.string.arg_RES_7f104efd);
       uod.Q0(R.string.cancel);
       uod.u0(new c(tb));
       uod.t0(new b(tb));
       uod.M(new e(tb));
       j.d(uod);
       return;
    }
}
