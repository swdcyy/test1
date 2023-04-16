package l21.b;
import k51.c;
import l21.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import aq5.d;
import fq5.b;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.rank.LiveRankResourcePathConstant;
import l12.d;
import va1.f0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import p91.m;

public class b extends c	// class@002e63
{
    public m p;
    public View q;
    public KwaiImageView r;
    public final b s;
    public static String sLivePresenterClassName = "LiveAudienceLeftTopPendantHorizontalBarPresenter";

    public void b(){
       super();
       this.s = new a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.GUEST_ACTIVITY};
       this.p.A0().u5(this.s, uoaArray);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.GUEST_ACTIVITY};
       this.p.A0().G5(this.s, uoaArray);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a1da3);
       this.q = m1.f(p0, 0x7f0a208e);
       f0.a(this.r, LiveRankResourcePathConstant.LIVE_GUEST_ACTIVITY_TOP_LIST_PENDANT);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       return;
    }
}
