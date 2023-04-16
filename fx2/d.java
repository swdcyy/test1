package fx2.d;
import com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView$f;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig$TheaterTab;
import com.kuaishou.live.core.voiceparty.theater.tube.search.VoicePartyTheaterTubeSearchFragment;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import dx2.p;
import qu2.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import co2.f2;
import mw2.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyTheaterPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import yx2.n;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$SeriesPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MoreInfoPackage;
import k2b.u1;
import java.util.List;

public final class d implements SearchView$f	// class@0029ff
{
    public final VoicePartyTheaterTubeListTabFragment a;

    public void d(VoicePartyTheaterTubeListTabFragment p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       e uoe;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, str)) {
          return;
       }
       d ta = this.a;
       VoicePartyTheaterTubeListTabFragment x = ta.x;
       if (x == null) {
          VoicePartyTheaterTubeListTabFragment r = ta.r;
          if (r == null) {
             a.S("mTabConfig");
          }
          LiveVoicePartyTheaterCommonConfig$TheaterTab mTabId = r.mTabId;
          VoicePartyTheaterTubeSearchFragment voicePartyTh = PatchProxy.applyTwoRefs(mTabId, p0, null, VoicePartyTheaterTubeSearchFragment.class, str);
          if (voicePartyTh != PatchProxyResult.class) {
          }else {
             Bundle uBundle = new Bundle();
             uBundle.putString(VoicePartyTheaterTubeSearchFragment.L, mTabId);
             uBundle.putString(VoicePartyTheaterTubeSearchFragment.M, p0);
             VoicePartyTheaterTubeSearchFragment voicePartyTh1 = new VoicePartyTheaterTubeSearchFragment();
             voicePartyTh1.setArguments(uBundle);
             voicePartyTh = voicePartyTh1;
          }
          d ta1 = this.a;
          voicePartyTh.I = ta1.w;
          c fragmentMana = ta1.getFragmentManager();
          if (fragmentMana != null) {
             uoe = fragmentMana.beginTransaction();
             if (uoe != null) {
                a.m(voicePartyTh);
                uoe.f(R.id.main_container, voicePartyTh);
                uoe.m();
             }
          }
          uoe.x = voicePartyTh;
       }else {
          a.m(x);
          Objects.requireNonNull(x);
          if (!PatchProxy.applyVoidOneRefs(p0, x, VoicePartyTheaterTubeSearchFragment.class, "7")) {
             x.G = p0;
             x.a();
          }
       }
       VoicePartyTheaterTubeListTabFragment.mh(this.a).setVisibility(8);
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "3")) {
          return;
       }
       p op = this.a.rh();
       a.o(op, "mContext");
       ClientContent$LiveStreamPackage liveStreamPa = op.d().a();
       p op1 = this.a.rh();
       a.o(op1, "mContext");
       f2 uof2 = op1.g();
       if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, uof2, objArray, e.class, "10")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_FOCUS_SEARCH_BOX";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          uContentPack.liveVoicePartyTheaterPackage = e.b(uof2);
          ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
          uContentWrap.liveVoicePartyPackage = n.g(uof2);
          ClientContentWrapper$SeriesPackage seriesPackag = e.a(uof2);
          if (seriesPackag != null) {
             uContentWrap.seriesPackage = seriesPackag;
          }
          ClientContentWrapper$MoreInfoPackage moreInfoPack = new ClientContentWrapper$MoreInfoPackage();
          moreInfoPack.type = "VOICE_PARTY_THEATER_LIST";
          uContentWrap.moreInfoPackage = moreInfoPack;
          u1.H("", 1, uElementPack, uContentPack, uContentWrap);
       }
       return;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "2")) {
          return;
       }
       d ta = this.a;
       if (ta.x == null) {
          return;
       }
       c fragmentMana = ta.getFragmentManager();
       if (fragmentMana != null) {
          e uoe = fragmentMana.beginTransaction();
          if (uoe != null) {
             VoicePartyTheaterTubeListTabFragment x = this.a.x;
             a.m(x);
             uoe = uoe.u(x);
             if (uoe != null) {
                uoe.m();
             }
          }
       }
       ta = this.a;
       ta.x = objArray;
       if (VoicePartyTheaterTubeListTabFragment.nh(ta).isEmpty()) {
          VoicePartyTheaterTubeListTabFragment.mh(this.a).setVisibility(8);
       }else {
          VoicePartyTheaterTubeListTabFragment.mh(this.a).setVisibility(0);
       }
       return;
    }
}
