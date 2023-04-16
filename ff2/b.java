package ff2.b;
import bf2.a;
import wj2.r;
import android.app.Activity;
import vq5.d;
import com.kwai.framework.model.user.UserInfo;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.profilecard.http.LiveUserProfileExtraInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import cf2.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ff2.c;
import java.util.Objects;
import ff2.c$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import ff2.b$a;
import com.kuaishou.live.core.show.profilecard.http.LiveProfileNobleEntranceInfo;
import android.view.View$OnClickListener;
import androidx.fragment.app.KwaiDialogFragment;

public final class b implements a	// class@00294b
{
    public KwaiImageView a;
    public KwaiDialogFragment b;
    public r c;
    public Activity d;
    public d e;
    public UserInfo f;

    public void b(r p0,Activity p1,d p2,UserInfo p3,View p4){
       a.p(p0, "liveProfileCallerContext");
       a.p(p4, "rootView");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       View view = p4.findViewById(R.id.live_profile_noble_entrance);
       a.o(view, "rootView.findViewById\(R.¡­e_profile_noble_entrance\)");
       this.a = view;
    }
    public void a(LiveUserProfileExtraInfo p0){
       c$a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       a.p(p0, "liveUserProfileExtraInfo");
       p0 = p0.mLiveProfileNobleEntranceInfo;
       a.o(p0, "liveUserProfileExtraInfo¡­eProfileNobleEntranceInfo");
       this.a.setVisibility(0);
       c uoc = this.c.c();
       a.o(uoc, "liveProfileCallerContext.logInfoSupplier");
       ClientContent$LiveStreamPackage liveStreamPa = uoc.a();
       if (liveStreamPa != null) {
          a = c.a;
          a.o(liveStreamPa, "it");
          b tf = this.f;
          UserInfo mId = (tf != null)? tf.mId: null;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, mId, a, c$a.class, "1")) {
             a.p(liveStreamPa, "liveStreamPackage");
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
             uContentPack.userPackage = userPackage;
             userPackage.identity = mId;
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PERSONEL_PROFILE_NOBLE_ENTRANCE";
             u1.u0(9, uElementPack, uContentPack);
          }
       }
       this.a.setOnClickListener(new b$a(this, p0));
       return;
    }
    public final r b(){
       return this.c;
    }
    public void hide(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.a.setVisibility(8);
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       b tb = this.b;
       if (tb != null) {
          tb.dismiss();
       }
       this.b = null;
       this.d = null;
       return;
    }
    public void resume(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.a.setVisibility(0);
       return;
    }
}
