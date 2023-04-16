package f69.b;
import android.view.View$OnClickListener;
import f69.c;
import java.lang.Object;
import android.view.View;
import e69.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.JsonObject;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import k2b.u1;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import xh7.b;
import qh7.b;
import qh7.a;

public final class b implements View$OnClickListener	// class@0022b0
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       String str;
       b tb = this.b;
       c p = tb.p;
       c t = tb.t;
       if (PatchProxy.applyVoidTwoRefs(p, t, null, a.class, "13")) {
       }else {
          int i = 1;
          if (TextUtils.n(String.valueOf(i), t)) {
             str = "MAGIC";
          }else if(TextUtils.n(String.valueOf(2), t)){
             str = "KUAISHAN";
          }else if(TextUtils.n(String.valueOf(3), t)){
             str = "KUAIYING";
          }else {
             str = "";
          }
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("tag_type", str);
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.params = jsonObject.toString();
          uElementPack.action2 = "CLICK_TAG";
          u1.B(new ClickMetaData().setType(i).setLogPage(p).setElementPackage(uElementPack));
       }
       Context context = tb.getContext();
       if (context != null) {
          a.b(b.j(context, tb.v), null);
       }
       return;
    }
}
