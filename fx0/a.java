package fx0.a;
import lf3.g;
import c12.f;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCAuthorBirthday;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import p91.m;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.util.List;
import ekd.q;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import java.lang.Boolean;
import v51.a;
import lp3.c;
import lp3.e;
import hf3.a;
import lf3.f;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class a extends f implements g	// class@0023c7
{
    public e K;
    public a0 L;
    public KwaiImageView M;
    public LiveStreamMessages$SCAuthorBirthday N;
    public static String sLivePresenterClassName = "LiveBirthdayPartyAudiencePresenter";

    public void a(){
       super();
    }
    public void H4(MessageNano p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "5")) {
       }else {
          this.N = p0;
          if (!PatchProxy.applyVoid(null, this, uoa, "6")) {
             a tN = this.N;
             LiveStreamFeedWrapper liveStreamFe = this.L.Z2.r5();
             uoa = (liveStreamFe != null && liveStreamFe.isGRPRCustomizedLive())? 1: null;
             if (tN == null || uoa) {
                this.M.setVisibility(8);
             }else {
                this.M.P(q.a(e0.i(tN.hatUrl)));
                this.M.setVisibility(0);
             }
          }
       }
       return;
    }
    public void Q(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       this.K.a(a.class).u().o(561, this);
       this.N = null;
       return;
    }
    public boolean V(){
       return f.a(this);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.M = m1.f(p0, 0x7f0a18a1);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.r8("LIVE_SERVICE_MANAGER");
       this.L = this.q8(a0.class);
       return;
    }
    public void x(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       this.K.a(a.class).u().u0(561, LiveStreamMessages$SCAuthorBirthday.class, this);
       return;
    }
}
