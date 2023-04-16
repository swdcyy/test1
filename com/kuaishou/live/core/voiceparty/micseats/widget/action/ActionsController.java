package com.kuaishou.live.core.voiceparty.micseats.widget.action.ActionsController;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.live.core.voiceparty.micseats.widget.action.LiveVoicePartyActionsView;
import com.kuaishou.live.core.voiceparty.micseats.widget.action.ActionsController$a;
import qu2.a;
import co2.f2;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import qs2.r;
import com.kuaishou.live.core.voiceparty.micseats.widget.action.ActionsController$b;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.micseats.widget.LiveVoicePartyPanelLoadingMaskView;
import bs2.a;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import pt2.b;
import com.kwai.framework.model.user.UserInfo;
import brd.t;
import ot2.b;
import erd.a;
import ot2.d;
import ot2.c;
import erd.g;
import crd.b;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class ActionsController implements LifecycleObserver	// class@001782
{
    public final String b;
    public final int c;
    public final int d;
    public final LiveVoicePartyActionsView e;
    public final a f;
    public final f2 g;
    public final int h;
    public final int i;
    public final VoicePartyMicSeatData j;
    public b k;
    public ActionsController$b l;

    public void ActionsController(LiveVoicePartyActionsView p0,ActionsController$a p1,a p2,f2 p3,Lifecycle p4,int p5,int p6,VoicePartyMicSeatData p7){
       super();
       this.b = "ActionsViewController";
       this.c = -76352628;
       this.d = 33;
       this.e = p0;
       p0.setActionCallBack(p1);
       this.f = p2;
       this.g = p3;
       this.h = p5;
       this.i = p6;
       this.j = p7;
       p4.addObserver(this);
    }
    public final boolean a(){
       ActionsController obj = PatchProxy.apply(null, this, ActionsController.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j;
       boolean b = (obj != null && (obj.mIsVideoOpened != null && r.g(obj)))? true: false;
       return b;
    }
    public final int b(){
       ActionsController ti = this.i;
       int i = 1;
       if (ti == i || ti == 7) {
          return i;
       }
       if (ti != 11 && ti != 12) {
          return 2;
       }
       return 3;
    }
    public void c(ActionsController$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActionsController.class, "1")) {
          return;
       }
       this.l = p0;
       List list = null;
       this.e.c(list, list);
       ActionsController te = this.e;
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoid(list, te, LiveVoicePartyActionsView.class, "2")) {
          te.n.b((((te.e * 2) + (te.g * 3)) + (te.f * 2)));
       }
       te = this.e;
       te.r = this.g;
       te.q = this.f;
       te.s = this.b();
       a uoa = LiveVoicePartyApi.b();
       String liveStreamId = this.f.getLiveStreamId();
       String str = this.g.y();
       ActionsController th = this.h;
       ActionsController ti = this.i;
       te = this.j;
       if (te != null) {
          VoicePartyMicSeatData mMicUser = te.mMicUser;
          if (mMicUser != null) {
             b a = mMicUser.a;
             if (a != null) {
                list = a.mId;
             }
          }
       }
       ActionsController te1 = this.e;
       Objects.requireNonNull(te1);
       this.k = uoa.Q(liveStreamId, str, th, ti, list).doOnDispose(new b(te1)).subscribe(new d(this), new c(this));
       return;
    }
    public final void onLifecycleOwnerDestroy(){
       if (PatchProxy.applyVoid(null, this, ActionsController.class, "2")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.OTHER, "ActionsViewController onLifecycleOwnerDestroy");
       ActionsController tk = this.k;
       if (tk != null) {
          tk.dispose();
       }
       return;
    }
}
