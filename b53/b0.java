package b53.b0;
import android.view.View$OnClickListener;
import com.kuaishou.live.gzone.barrage.l;
import android.widget.TextView;
import java.lang.Object;
import android.view.View;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import t02.a0;
import v37.a;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import kg1.g;
import java.lang.CharSequence;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import b53.u0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class b0 implements View$OnClickListener	// class@000301
{
    public final l b;
    public final TextView c;

    public void b0(l p0,TextView p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       b0 tb = this.b;
       b0 tc = this.c;
       tb.s.dismiss();
       tb.x.X2.b(200);
       LiveFansGroupIntimacyInfo mStatus = tb.x.r1.Qi().mStatus;
       String str = (tc.getText() == null)? "": tc.getText().toString();
       ClientContent$LiveStreamPackage liveStreamPa = tb.x.Z2.a();
       if (!PatchProxy.isSupport(u0.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(mStatus), str, liveStreamPa, null, u0.class, "7")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "BOTTOM_JOIN_FANS_GROUP_BUTTON";
          uElementPack.params = u0.c(mStatus, str);
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u(1, uElementPack, uContentPack);
       }
       return;
    }
}
