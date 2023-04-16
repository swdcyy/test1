package cx0.i;
import cx0.b;
import cx0.g;
import com.kuaishou.live.authentication.LiveAudienceAuthorAuthenticationTopPendantInfo;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xp5.i;
import cx0.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import k2b.u1;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.jvm.internal.a;
import vq5.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class i extends b	// class@001e97
{
    public final g m;
    public final LiveAudienceAuthorAuthenticationTopPendantInfo n;
    public final int o;
    public final Context p;

    public void i(g p0,LiveAudienceAuthorAuthenticationTopPendantInfo p1,int p2,Context p3,Context p4,LiveAudienceAuthorAuthenticationTopPendantInfo p5){
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.p = p3;
       super(p4, p5);
    }
    public void u(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "2")) {
          return;
       }
       i to = this.o;
       i oi = this.m.a9();
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(to), oi, objArray, uoa, "1")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_AUTH_MARK";
          uElementPack.params = a.a(to);
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = oi.Bb();
          uContentPack.liveVoicePartyPackage = oi.b4();
          u1.C0("", oi.getPage(), 0, uElementPack, uContentPack);
       }
       return;
    }
    public void v(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "1")) {
          return;
       }
       i tm = this.m;
       LiveAudienceAuthorAuthenticationTopPendantInfo mJumpUrl = this.n.mJumpUrl;
       i to = this.o;
       Objects.requireNonNull(tm);
       g og = g.class;
       if (PatchProxy.isSupport(og) && (PatchProxy.applyVoidTwoRefs(mJumpUrl, Integer.valueOf(to), tm, og, "10") || (mJumpUrl != null && !TextUtils.x(mJumpUrl)))) {
          og = tm.K;
          String str = "liveRouterManager";
          if (og == null) {
             a.S(str);
          }
          if (og.P0(mJumpUrl)) {
             og = tm.K;
             if (og == null) {
                a.S(str);
             }
             og.r4(mJumpUrl, tm.getContext());
             tm = tm.a9();
             a uoa = a.class;
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(to), tm, objArray, uoa, "2")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "LIVE_AUTH_MARK";
                uElementPack.params = a.a(to);
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = tm.Bb();
                uContentPack.liveVoicePartyPackage = tm.b4();
                u1.L("", tm.getPage(), 1, uElementPack, uContentPack);
             }
          }
       }
    label_0095 :
       return;
    }
}
