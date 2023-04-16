package df2.b;
import android.content.DialogInterface$OnClickListener;
import df2.m0;
import java.util.ArrayList;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import mz6.b$d;
import db1.a;
import eb1.a;
import bb1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import wj2.r;
import com.kuaishou.live.core.show.profilecard.LiveProfileMode;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import k2b.u1;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import hs5.a;
import df2.i;
import hs5.a$a;

public final class b implements DialogInterface$OnClickListener	// class@0024e7
{
    public final m0 b;
    public final ArrayList c;

    public void b(m0 p0,ArrayList p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(DialogInterface p0,int p1){
       String str;
       int i4;
       String voicePartyId;
       String theaterId;
       ClientContent$LiveStreamPackage liveStreamPa;
       ClientEvent$ElementPackage uElementPack;
       JsonObject jsonObject;
       ClientContent$ContentPackage uContentPack;
       ClientContentWrapper$ContentWrapper uContentWrap;
       ClientEvent$ElementPackage uElementPack1;
       JsonObject jsonObject1;
       b uob = this;
       int i = p1;
       b b = uob.b;
       b c = uob.c;
       Objects.requireNonNull(b);
       if (i >= 0 && i < c.size()) {
          if (c.get(i).b() instanceof a) {
             a uoa = c.get(i).b();
             uoa.c().run();
             f uof = f.class;
             m0 om0 = m0.class;
             if (!PatchProxy.isSupport(om0) || !PatchProxy.applyVoidTwoRefs(uoa, Integer.valueOf(p1), b, om0, "51")) {
                int i1 = 0;
                int i2 = 6;
                int i3 = 1;
                if (b.v.m == LiveProfileMode.ANCHOR_VIEW_AUDIENCE) {
                   str = uoa.a();
                   i4 = uoa.b();
                   voicePartyId = b.x.getVoicePartyId();
                   theaterId = b.x.getTheaterId();
                   liveStreamPa = b.m9();
                   if (PatchProxy.isSupport(uof)) {
                      Object[] objArray = new Object[i2];
                      objArray[i1] = str;
                      objArray[i3] = Integer.valueOf(p1);
                      objArray[2] = Integer.valueOf(i4);
                      objArray[3] = voicePartyId;
                      objArray[4] = theaterId;
                      objArray[5] = liveStreamPa;
                      if (!PatchProxy.applyVoid(objArray, null, uof, "9")) {
                      }
                   }else {
                   }
                }else {
                   str = uoa.a();
                   i4 = uoa.b();
                   voicePartyId = b.x.getVoicePartyId();
                   theaterId = b.x.getTheaterId();
                   String str1 = b.h9();
                   UserProfile mProfile = b.x.getUserProfile().mProfile;
                   liveStreamPa = b.m9();
                   if (PatchProxy.isSupport(uof)) {
                      Object[] objArray1 = new Object[]{str,Integer.valueOf(p1),Integer.valueOf(i4),voicePartyId,theaterId,str1,mProfile,liveStreamPa};
                      if (!PatchProxy.applyVoid(objArray1, null, uof, "15")) {
                      }
                   }else {
                   }
                }
             }
          }else {
             int i5 = i;
             if (c.get(i5).b() instanceof a) {
                c.get(i5).b().a(new i(b));
             }
          }
       }else if(i == 0x7f104a8e){
          b.U9();
       }
       return;
    }
}
