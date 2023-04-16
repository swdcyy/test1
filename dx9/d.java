package dx9.d;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.comment.limitcomment.i;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class d implements Runnable	// class@001fea
{
    public final i b;

    public void d(i p0){
       this.b = p0;
    }
    public final void run(){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, i.class, "4")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "ONLY_FRIENDS_COMMENT_MYTALK_BUTTON";
          JsonObject jsonObject = new JsonObject();
          String str = (tb.r.getSwitch())? "CHECKED": "UNCHECKED";
          jsonObject.c0("status", str);
          uElementPack.params = jsonObject.toString();
          u1.u0(3, uElementPack, null);
       }
       return;
    }
}
