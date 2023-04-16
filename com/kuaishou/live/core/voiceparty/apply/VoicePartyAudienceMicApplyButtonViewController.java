package com.kuaishou.live.core.voiceparty.apply.VoicePartyAudienceMicApplyButtonViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import m91.b;
import com.kuaishou.live.core.voiceparty.b;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import co2.f2;
import qs2.a;
import x61.c;
import vq5.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.apply.VoicePartyAudienceMicApplyButtonViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.apply.VoicePartyAudienceMicApplyButtonViewController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import eo2.h;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.apply.VoicePartyAudienceMicApplyButtonViewController$$special$$inlined$viewModels$2;
import msd.a;
import com.kwai.robust.PatchProxy;
import eo2.g;
import androidx.lifecycle.LifecycleOwner;
import z61.b;
import eo2.d;
import eo2.f;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import androidx.lifecycle.MutableLiveData;
import eo2.e;
import java.lang.Runnable;
import ekd.k1;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import eo2.a;
import androidx.lifecycle.Observer;
import eo2.b;
import eo2.c;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.core.voiceparty.apply.VoicePartyAudienceMicApplyButtonDataBinding$bindViewModel$4;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public class VoicePartyAudienceMicApplyButtonViewController extends ViewController	// class@001325
{
    public final p j;
    public final b k;
    public final b l;
    public final MicSeatsDataManager m;
    public final f2 n;
    public final a o;
    public final c p;
    public final d q;

    public void VoicePartyAudienceMicApplyButtonViewController(b p0,b p1,MicSeatsDataManager p2,f2 p3,a p4,c p5,d p6){
       a.p(p0, "bizRelationService");
       a.p(p1, "micSeatDispatcher");
       a.p(p2, "micSeatsDataManager");
       a.p(p3, "voicePartyContext");
       a.p(p4, "micManageService");
       a.p(p5, "liveBottomBarService");
       a.p(p6, "liveRouterManager");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.p = p5;
       this.q = p6;
       this.j = new ViewModelLazy(m0.d(h.class), new VoicePartyAudienceMicApplyButtonViewController$$special$$inlined$viewModels$2(new VoicePartyAudienceMicApplyButtonViewController$$special$$inlined$viewModels$1(this)), new VoicePartyAudienceMicApplyButtonViewController$viewModel$2(this));
    }
    public void F2(){
       g a;
       String str = "2";
       if (PatchProxy.applyVoid(null, this, VoicePartyAudienceMicApplyButtonViewController.class, str)) {
          return;
       }
       g og = new g(this, this.p);
       h oh = this.V2();
       g og1 = g.class;
       if (!PatchProxy.applyVoidOneRefs(oh, og, og1, "1")) {
          a.p(oh, "viewModel");
          if (!PatchProxy.applyVoidOneRefs(oh, og, og1, str)) {
             a = og.a;
             a.mFeatureId = 2001;
             a.mClickCallback = new d(oh);
             f uof = new f(oh);
             og1 = og.a;
             og1.mClickLogParamsSupplier = uof;
             og1.mShowLogParamsSupplier = uof;
             og1.mIconRes = 0x7f081124;
             og.b.setValue(og1);
             k1.p(new e(og), og);
          }
          LiveDataOperators.c(oh.z0(), oh.x0()).observe(og.c, new a(og));
          oh.C0().observe(og.c, new b(og));
          oh.y0().observe(og.c, new c(og));
          og.c.getLifecycle().addObserver(new VoicePartyAudienceMicApplyButtonDataBinding$bindViewModel$4(og));
       }
       return;
    }
    public h V2(){
       Object obj = PatchProxy.apply(null, this, VoicePartyAudienceMicApplyButtonViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
