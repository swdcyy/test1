package f11.m;
import im8.g;
import a51.c;
import f11.m$a;
import f11.m$b;
import f11.m$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.base.service.scenetype.LiveSceneType;
import p91.m;
import ry1.b;
import lp3.c;
import lp3.i;
import brd.t;
import f11.j;
import f11.k;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.common.core.component.like.count.i;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import hf3.a;
import ds5.a;
import android.widget.TextView;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import yq5.b;
import yq5.c;
import e93.f;
import android.content.Context;
import com.kuaishou.live.core.basic.widget.LiveTextView;
import lnc.a1;
import d61.f0;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import f11.q;
import java.util.Map;
import java.util.HashMap;
import ds5.e;

public class m extends c implements g	// class@00227c
{
    public m A;
    public TextView B;
    public i C;
    public boolean D;
    public j E;
    public b F;
    public final b G;
    public a v;
    public LiveStreamFeedWrapper w;
    public e x;
    public c y;
    public i z;
    public static String sLivePresenterClassName = "LiveAudienceLikeCountPresenter";

    public void m(){
       super();
       this.D = false;
       this.E = new m$a(this);
       this.F = new m$b(this);
       this.G = new m$c(this);
    }
    public void E8(){
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "3")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, om, "4") && this.A.u5() == LiveSceneType.Audience) {
          this.X7(this.z.a(b.class).T3().subscribe(new j(this), k.b));
       }
       i oi = new i(this.w, this.v, this.x, true);
       this.C = oi;
       oi.f();
       this.C.a(this.B);
       if (this.D != null) {
          return;
       }else {
          b.Z(LiveLogTag.LIVE_LIKE, "show like pendant");
          this.y.b(this.G);
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, m.class, "7")) {
          return;
       }
       super.J8();
       m tC = this.C;
       if (tC != null) {
          tC.g();
       }
       this.D = false;
       f.g(this);
       return;
    }
    public void S8(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "5")) {
          return;
       }
       if (this.B == null) {
          LiveTextView liveTextView = new LiveTextView(p0);
          this.B = liveTextView;
          liveTextView.setTextColor(a1.a(R.color.arg_RES_7f060649));
          this.B.setMaxLines(1);
          this.B.setTextSize(1, 9.00f);
          this.B.setGravity(16);
          f0.f(this.B, "sans-serif-medium");
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       this.S8(this.getContext());
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, m.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(m.class, new q());
       }else {
          obj.put(m.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.v = this.r8("LIVE_LONG_CONNECTION");
       this.w = this.r8("LIVE_PHOTO");
       this.x = this.r8("LIVE_PLAY_CONFIG_SERVICE");
       this.y = this.r8("LIVE_TOP_BAR_HEAD_PENDANT_SERVICE");
       this.z = this.r8("LIVE_SERVICE_MANAGER");
       this.A = this.r8("LIVE_BASIC_CONTEXT");
       return;
    }
}
