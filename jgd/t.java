package jgd.t;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import sgd.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.plugin.setting.helper.j;

public class t implements SlipSwitchButton$b	// class@0016f0
{
    public j a;

    public void t(){
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       t ot = t.class;
       String str = "1";
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ot, str)) {
          return;
       }
       if (p1 != QCurrentUser.ME.isAllowOthersRewardMe()) {
          c uoc = c.class;
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), null, uoc, str)) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "ALLOW_TIP";
             JsonObject jsonObject = new JsonObject();
             str = (p1)? "CHECKED": "UNCHECKED";
             jsonObject.c0("status", str);
             uElementPack.params = jsonObject.toString();
             u1.u(1, uElementPack, null);
          }
          this.a.k(p0, "allow_others_reward_me", p1);
       }
       return;
    }
}
