package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.LiveAudienceMultiLineArenaLineController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened;
import lq1.c;
import nq1.a;
import xp5.g;
import hf3.a;
import sq1.a;
import oq1.e;
import xp5.i;
import oq1.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModelProvider;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.LiveAudienceMultiLineArenaLineController$a;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.LiveAudienceMultiLineArenaLineController$containerVcDelegate$2;
import msd.a;
import qrd.p;
import qrd.s;
import dr1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.LiveAudienceMultiLineArenaLineDataBinding;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.LiveAudienceMultiLineArenaLineController$containerVcDelegate$2$a;
import ir1.c;
import androidx.lifecycle.ViewModel;
import hr1.a;
import com.kuaishou.live.common.core.component.multiline.anim.LiveMultiLineAnimationViewController;
import uq1.b;
import iq1.d;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.header.LiveMultiLineArenaLineHeaderViewController;
import vq1.a;
import androidx.lifecycle.LifecycleOwner;
import ar1.a;
import androidx.fragment.app.KwaiDialogFragment;

public final class LiveAudienceMultiLineArenaLineController extends ViewController	// class@001504
{
    public KwaiDialogFragment j;
    public final ViewModelProvider k;
    public final p l;
    public final f m;
    public LiveAudienceMultiLineArenaLineDataBinding n;
    public final a o;
    public final g p;
    public final a q;
    public final e r;
    public final i s;
    public final b t;

    public void LiveAudienceMultiLineArenaLineController(SCLiveMultiLineChatOpened p0,c p1,a p2,g p3,a p4,a p5,e p6,i p7,b p8){
       a.p(p0, "scLineOpened");
       a.p(p1, "multiLineCoreModel");
       a.p(p2, "lineBasicModel");
       a.p(p3, "liveInfoManager");
       a.p(p4, "liveLongConnection");
       a.p(p5, "roomDelegate");
       a.p(p7, "liveLogPackageProvider");
       a.p(p8, "lineLogParamsProvider");
       super();
       this.o = p2;
       this.p = p3;
       this.q = p5;
       this.r = p6;
       this.s = p7;
       this.t = p8;
       this.k = new ViewModelProvider(this, new LiveAudienceMultiLineArenaLineController$a(this));
       this.l = s.c(new LiveAudienceMultiLineArenaLineController$containerVcDelegate$2(this));
       this.m = new f(p1, p2, p0, p4);
    }
    public void F2(){
       View view;
       LiveAudienceMultiLineArenaLineController liveAudience = LiveAudienceMultiLineArenaLineController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveAudience, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0a21);
       if (!PatchProxy.applyVoid(objArray, this, liveAudience, "3") && !PatchProxy.applyVoid(objArray, this, liveAudience, "4")) {
          LiveAudienceMultiLineArenaLineController tp = this.p;
          LiveAudienceMultiLineArenaLineController tm = this.m;
          LiveAudienceMultiLineArenaLineController tr = this.r;
          LiveAudienceMultiLineArenaLineController tt = this.t;
          LiveAudienceMultiLineArenaLineController ts = this.s;
          LiveAudienceMultiLineArenaLineController tq = this.q;
          ViewModel obj = PatchProxy.apply(objArray, this, liveAudience, "1");
          if (obj == PatchProxyResult.class) {
             obj = this.l.getValue();
          }
          obj = this.k.get(c.class);
          a.o(obj, "viewModelProvider.get\(Li¡­sicViewModel::class.java\)");
          ViewModel viewModel = obj;
          LiveAudienceMultiLineArenaLineDataBinding liveAudience1 = new LiveAudienceMultiLineArenaLineDataBinding(tp, tm, tr, tt, ts, tq, obj, viewModel);
          this.n = v2;
       }
       if (!PatchProxy.applyVoid(objArray, this, liveAudience, "7")) {
          LiveMultiLineAnimationViewController liveMultiLin = new LiveMultiLineAnimationViewController();
          View view1 = this.P2();
          Objects.requireNonNull(view1, "null cannot be cast to non-null type android.view.ViewGroup");
          this.y2(view1, liveMultiLin);
          View view2 = this.P2();
          Objects.requireNonNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
          this.y2(view2, new b(this.m, liveMultiLin.V2()));
       }
       if (!PatchProxy.applyVoid(objArray, this, liveAudience, "6")) {
          view = this.P2();
          Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
          this.y2(view, new LiveMultiLineArenaLineHeaderViewController(this, false, this.m, new a(this)));
       }
       this.m.l();
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiLineArenaLineController.class, "5")) {
          return;
       }
       this.m.a();
       LiveAudienceMultiLineArenaLineController tj = this.j;
       if (tj != null) {
          tj.dismiss();
       }
       return;
    }
}
