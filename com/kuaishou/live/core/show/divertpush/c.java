package com.kuaishou.live.core.show.divertpush.c;
import im8.g;
import c12.f;
import com.kuaishou.live.core.show.divertpush.c$a;
import a72.b;
import com.kuaishou.live.core.show.divertpush.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import lf3.g;
import hf3.a;
import oq5.c;
import jv1.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import f12.d;
import va1.i0;
import android.widget.LinearLayout;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import m91.b;
import ekd.k1;
import ekd.m1;
import com.kwai.robust.PatchProxyResult;
import a72.f;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.core.basic.activity.x;
import p91.m;
import com.kuaishou.android.live.model.QLivePlayConfig;
import f12.c;
import gb2.a;
import com.kuaishou.live.core.show.push.LiveDivertPushV2Config;
import wg3.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import com.kuaishou.livestream.message.nano.SCLiveActivityPushV2;

public class c extends f implements g	// class@000afa
{
    public BaseFragment K;
    public LiveStreamFeedWrapper L;
    public a M;
    public x N;
    public m O;
    public QLivePlayConfig P;
    public b Q;
    public b R;
    public a S;
    public d T;
    public long U;
    public final c U0;
    public List V;
    public final g V0;
    public LiveDivertPushView W;
    public View X;
    public LiveDivertPushV2Config Y;
    public a Z;
    public static String sLivePresenterClassName = "LiveAudienceTopDivertPushPresenter";

    public void c(){
       super();
       this.Z = new c$a(this);
       this.U0 = new b(this);
       this.V0 = new b(this);
    }
    public void Q(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uoc, "6")) {
          this.M.o(683, this.V0);
          this.Q.Q0(this.U0);
          if (this.W != null) {
             this.T.z(this.getActivity(), this.W);
             i0.e(this.getActivity(), this.W);
             this.W.setVisibility(8);
          }
          this.R.yj(AudienceBizRelation.TOP_DIVERT_PUSH);
          k1.n(this);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.X = m1.f(p0, 0x7f0a3fd0);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new f());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.r8("LIVE_FRAGMENT");
       this.L = this.r8("LIVE_PHOTO");
       this.M = this.r8("LIVE_LONG_CONNECTION");
       this.N = this.r8("LIVE_FRAGMENT_SERVICE");
       this.O = this.r8("LIVE_BASIC_CONTEXT");
       this.P = this.r8("LIVE_PLAY_CONFIG");
       this.Q = this.q8(b.class);
       this.R = this.r8("LIVE_BIZ_RELATION_SERVICE");
       this.T = c.b(this.getActivity());
       this.S = this.t8("LIVE_SQUARE_SIDE_BAR_ENTRANCE_NOTICE_SERVICE");
       return;
    }
    public void x(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "3")) {
          return;
       }
       LiveDivertPushV2Config liveDivertPu = LiveDivertPushV2Config.class;
       String str = a.a.getString("liveActivityPushConfig", "{}");
       liveDivertPu = (str == null || str == "")? null: b.a(str, liveDivertPu);
       this.Y = liveDivertPu;
       if (liveDivertPu == null) {
          return;
       }else {
          this.Q.H6(this.U0);
          this.M.u0(683, SCLiveActivityPushV2.class, this.V0);
          return;
       }
    }
}
