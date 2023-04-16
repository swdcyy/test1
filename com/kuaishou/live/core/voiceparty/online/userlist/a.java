package com.kuaishou.live.core.voiceparty.online.userlist.a;
import com.kuaishou.live.core.voiceparty.online.userlist.b;
import du2.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import com.kwai.framework.model.user.UserInfo;
import co2.k1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.util.Arrays;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.view.View;
import du2.a;
import android.view.View$OnClickListener;

public class a extends b	// class@001808
{
    public ClientContent$LiveVoicePartyPackageV2 F;
    public ClientContent$LiveStreamPackage G;
    public e0 H;
    public boolean I;
    public static String sLivePresenterClassName = "AnchorAndAdminOnlineUserItemPresenter";

    public void a(boolean p0,g p1,ClientContent$LiveStreamPackage p2,ClientContent$LiveVoicePartyPackageV2 p3,e0 p4){
       super(p0, p1);
       this.G = p2;
       this.F = p3;
       this.H = p4;
    }
    public void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
          return;
       }
       if (this.I == null) {
          a tH = this.H;
          a tG = this.G;
          a tF = this.F;
          int i = this.q.get().intValue();
          UserInfo mId = this.p.mApplyUserInfo.mId;
          String[] stringArray = this.V8();
          k1 ok1 = k1.class;
          if (PatchProxy.isSupport(ok1)) {
             Object[] objArray1 = new Object[]{tH,tG,tF,Integer.valueOf(i),mId,stringArray};
             if (PatchProxy.applyVoid(objArray1, objArray, ok1, "15")) {
             label_008c :
                this.I = true;
             }
          }
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "MIC_MODEL_PANEL_ACCEPT_BUTTON";
          i3 oi3 = i3.f();
          oi3.d("label", Arrays.toString(stringArray));
          uElementPack.params = oi3.e();
          ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
          userPackage.identity = mId;
          userPackage.index = i + 1;
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveVoicePartyPackage = tF;
          uContentPack.liveStreamPackage = tG;
          uContentPack.userPackage = userPackage;
          u1.C0("", tH, 6, uElementPack, uContentPack);
          goto label_008c ;
       }
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       if (this.I == null) {
          a tF = this.F;
          boolean b = (tF != null && tF.role != true)? true: false;
          a tH = this.H;
          a tG = this.G;
          int i = this.q.get().intValue();
          b tp = this.p;
          String str = (tp.mIsUserNotInLivingRoom != null)? "INVITE_FRIEND": "INVITE_AUDIENCE";
          k1.f(tH, tG, tF, i, str, tp.mApplyUserInfo.mId, this.V8(), b);
          this.I = true;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.doBindView(p0);
       p0.setOnClickListener(new a(this));
       return;
    }
}
