package ej2.g;
import im8.g;
import ej2.v;
import java.util.BitSet;
import ej2.g$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m91.b;
import t02.a0;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import hf3.a;
import p91.m;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import lf3.g;
import ej2.g$b;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import brd.t;
import ry1.b;
import ej2.f;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import ej2.j;
import java.util.Map;
import java.util.HashMap;

public class g extends v implements g	// class@00272d
{
    public a0 v;
    public c w;
    public BitSet x;
    public k y;
    public static String sLivePresenterClassName = "LiveScoreRankAudienceAvatarRingPresenter";

    public void g(){
       super();
       this.x = new BitSet();
       this.y = new g$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.NATURE_LOOK};
       this.v.N().u5(this.u, uoaArray);
       this.v.Z2.u().u0(510, SCActionSignal.class, this.t);
       if (this.v.h != null) {
          g$b uob = new g$b(this);
          this.w = uob;
          this.v.y2.P4(uob);
       }else {
          this.S8();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.NATURE_LOOK};
       this.v.N().G5(this.u, uoaArray);
       this.v.Z2.u().o(510, this.t);
       return;
    }
    public boolean P8(){
       Object obj = PatchProxy.apply(null, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.x.cardinality() > 0) {
          return b;
       }
       boolean b1 = this.v.Y0.r2(AudienceBizRelation.NATURE_LOOK);
       LiveStreamFeedWrapper liveStreamFe = this.v.Z2.r5();
       liveStreamFe = (liveStreamFe != null && liveStreamFe.isGRPRCustomizedLive())? 1: 0;
       if (!b1 && !liveStreamFe) {
          b = true;
       }
       return b;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, g.class, "6")) {
          return;
       }
       this.X7(this.v.b3.T3().subscribe(new f(this), Functions.d()));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2537);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(g.class, new j());
       }else {
          obj.put(g.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.v = this.q8(a0.class);
       return;
    }
}
