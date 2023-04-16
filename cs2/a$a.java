package cs2.a$a;
import java.lang.Object;
import nsd.u;
import ry1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse$LiveVoicePartyConfig;
import pm8.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class a$a	// class@0023d1
{

    public void a$a(){
       super();
    }
    public void a$a(u p0){
       super();
    }
    public final boolean a(b p0){
       LiveTimeConsumingUserStatusResponse$LiveVoicePartyConfig isGuestInvit;
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          LiveTimeConsumingUserStatusResponse liveTimeCons = p0.d0();
          if (liveTimeCons != null) {
             liveTimeCons = liveTimeCons.mLiveVoicePartyConfig;
             if (liveTimeCons != null) {
                isGuestInvit = liveTimeCons.isGuestInvitingFriendsEnabled;
             label_0023 :
                return isGuestInvit;
             }
          }
       }
       isGuestInvit = false;
       goto label_0023 ;
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a.getBoolean(b.d("user")+"isVoicePartyGuestInvitationPanelShown", false);
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       if (this.b()) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean(b.d("user")+"isVoicePartyGuestInvitationPanelShown", true);
       g.a(uEditor);
       return;
    }
}
