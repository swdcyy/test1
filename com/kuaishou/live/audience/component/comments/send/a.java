package com.kuaishou.live.audience.component.comments.send.a;
import c12.f;
import android.os.Handler;
import android.os.Looper;
import gy0.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import m91.b;
import t02.a0;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import hf3.a;
import ne1.a;
import ne1.b;

public class a extends f	// class@000ab6
{
    public long K;
    public a L;
    public a0 M;
    public final Handler N;
    public a O;
    public final b P;
    public static String sLivePresenterClassName = "LiveAudienceCommentPlaceholderPresenter";

    public void a(){
       super();
       this.K = 0;
       this.N = new Handler(Looper.getMainLooper());
       this.P = new a(this);
    }
    public void Q(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       this.N.removeCallbacksAndMessages(null);
       a[] uoaArray = new a[]{AudienceBizRelation.SPECIAL_ROLE};
       this.M.N().G5(this.P, uoaArray);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.j8();
       this.L = this.r8("LIVE_LONG_CONNECTION");
       this.M = this.q8(a0.class);
       return;
    }
    public void x(boolean p0){
       AudienceBizRelation sPECIAL_ROLE;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       this.O = new a(this.M.X0);
       a[] uoaArray = new a[]{sPECIAL_ROLE};
       sPECIAL_ROLE = AudienceBizRelation.SPECIAL_ROLE;
       this.M.N().u5(this.P, uoaArray);
       a tO = this.O;
       int i = (this.M.Y0.r2(sPECIAL_ROLE))? 0x7f10381f: 0x7f101e5d;
       tO.b(i);
       return;
    }
}
