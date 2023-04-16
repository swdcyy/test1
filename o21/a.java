package o21.a;
import k51.c;
import lnc.a1;
import o21.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m91.b;
import t02.a0;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import android.view.View;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class a extends c	// class@00345c
{
    public View p;
    public a0 q;
    public b r;
    public static final int s = 0;
    public static String sLivePresenterClassName = "LiveRightTopPendantContainerPresenter";
    public static final int t;

    static {
       a.s = a1.e(8.00f);
       a.t = a1.e(12.00f);
    }
    public void a(){
       super();
       this.r = new a$a(this);
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "5")) {
          a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY,AudienceBizRelation.PK,AudienceBizRelation.LIVE_LINE,AudienceBizRelation.LIVE_MULTI_LINE,AudienceBizRelation.LIVE_MULTI_PK};
          this.q.N().u5(this.r, uoaArray);
       }
       return;
    }
    public void J8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY,AudienceBizRelation.PK,AudienceBizRelation.LIVE_LINE,AudienceBizRelation.LIVE_MULTI_LINE,AudienceBizRelation.LIVE_MULTI_PK};
          this.q.N().G5(this.r, uoaArray);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2525);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.q = this.q8(a0.class);
       return;
    }
}
