package e72.p;
import java.lang.Object;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import yp.x;
import lo2.d;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyTeamPkPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Integer;
import lnc.i3;
import java.lang.Number;
import com.google.gson.JsonObject;
import java.util.Map;
import ekd.q;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class p	// class@002690
{

    public void p(){
       super();
    }
    public static ClientContent$LiveStreamPackage a(LiveStreamFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ClientContent$LiveStreamPackage liveStreamPa = x.e(p0, 2);
       liveStreamPa.sourceTypeNew = 52;
       liveStreamPa.contentType = 12;
       return liveStreamPa;
    }
    public static ClientContent$ContentPackage b(d p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, null, p.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       if (p0 != null) {
          d h = p0.h;
          if (h != null) {
             obj.liveStreamPackage = h;
          }
          ClientContent$LiveVoicePartyPackageV2 liveVoicePar = new ClientContent$LiveVoicePartyPackageV2();
          liveVoicePar.voicePartyId = p0.e;
          liveVoicePar.theaterId = p0.f;
          liveVoicePar.ktvId = p0.g;
          obj.liveVoicePartyPackage = liveVoicePar;
          ClientContent$LiveVoicePartyTeamPkPackage liveVoicePar1 = new ClientContent$LiveVoicePartyTeamPkPackage();
          liveVoicePar1.teamPkRoomId = p0.d;
          obj.liveVoicePartyTeampkPackage = liveVoicePar1;
       }
       return obj;
    }
    public static ClientEvent$ElementPackage c(String p0,int p1){
       ClientEvent$ElementPackage obj;
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, op, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = "VOICE_PARTY_CLICK_MATCH";
       i3 oi3 = i3.f();
       oi3.d("card_type", p0);
       oi3.c("index", Integer.valueOf(p1));
       obj.params = oi3.e();
       return obj;
    }
    public static void d(JsonObject p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, p.class, "5")) {
          return;
       }
       if (q.h(p1)) {
          return;
       }
       Iterator iterator = p1.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          String value = uEntry.getValue();
          if (!TextUtils.x(key) && !TextUtils.x(value)) {
             p0.c0(key, value);
          }
       }
       return;
    }
}
