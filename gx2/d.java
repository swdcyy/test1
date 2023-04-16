package gx2.d;
import bk2.e$a;
import com.kuaishou.live.core.voiceparty.theater.tube.playlist.VoicePartyTheaterPlayListFragment;
import java.lang.Object;
import bk2.d;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem;
import qu2.a;
import dx2.p;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import co2.f2;
import mw2.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyTheaterPackage;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode$VoicePartyTheaterEpisodeInfo;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchSeriesPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import yx2.n;
import k2b.u1;

public final class d implements e$a	// class@002bb3
{
    public final VoicePartyTheaterPlayListFragment a;

    public void d(VoicePartyTheaterPlayListFragment p0){
       this.a = p0;
    }
    public void a(int p0){
       d.a(this, p0);
    }
    public final void b(int p0,Object p1){
       d ta = this.a;
       ClientContent$LiveStreamPackage liveStreamPa = ta.F.d().a();
       f2 uof2 = ta.F.g();
       VoicePartyTheaterPlayListFragment g = ta.G;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{liveStreamPa,uof2,p1,g,Integer.valueOf(p0)};
          if (PatchProxy.applyVoid(objArray, null, uoe, "9")) {
          label_0087 :
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SHOW_SERIES";
       i3 oi3 = i3.f();
       oi3.d("first_tab", g);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       ClientContent$LiveVoicePartyTheaterPackage liveVoicePar = e.b(uof2);
       uContentPack.liveVoicePartyTheaterPackage = liveVoicePar;
       if (p1 != null) {
          VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem mVoicePartyT = p1.mVoicePartyTheaterPhotoWithEpisode;
          if (mVoicePartyT != null) {
             liveVoicePar.dramaType = mVoicePartyT.mVoicePartyTheaterEpisodeInfo.mType;
             uContentPack.batchSeriesPackage = e.c(mVoicePartyT, p1.mAuthor, p0);
          }
       }
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       uContentWrap.liveVoicePartyPackage = n.g(uof2);
       u1.v0(9, uElementPack, uContentPack, uContentWrap);
       goto label_0087 ;
    }
}
