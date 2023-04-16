package cy9.o;
import com.yxcorp.gifshow.detail.common.information.cocreate.panel.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.CoCreateInfo$CoCreateMember;
import android.view.View;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import ekd.p0;
import e17.i;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.User;
import com.kwai.emotionsdk.util.ActivityContext;
import xh7.b;
import qh7.b;
import qh7.a;
import pe5.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;

public class o extends a	// class@001e41
{

    public void o(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       if (this.p.mRoleType == null) {
          this.v.setVisibility(8);
       }else {
          this.v.setVisibility(0);
       }
       super.E8();
       return;
    }
    public void P8(View p0){
    }
    public void S8(){
    }
    public void V8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o.class, "2")) {
          return;
       }
       if (!p0.C(this.getActivity())) {
          i.a(R.style.arg_RES_7f110669, 0x7f1038e7);
          return;
       }else {
          a.b(b.j(ActivityContext.d().c(), "kwai://chat/session?sessionId="+this.q.mId+"&sessionType=0&pageStyle=1"), objArray);
          a tq = this.q;
          if (!PatchProxy.applyVoidOneRefs(tq, objArray, c.class, "4")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CLICK_MESSAGE";
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("area_source", "description_Co-creation");
             uElementPack.params = jsonObject.toString();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
             uContentPack.userPackage = userPackage;
             userPackage.identity = tq.mId;
             u1.B(new ClickMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack));
          }
          return;
       }
    }
}
