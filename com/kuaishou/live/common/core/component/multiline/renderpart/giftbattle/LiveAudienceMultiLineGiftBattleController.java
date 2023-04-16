package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleController;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.String;
import nq1.a;
import xp5.g;
import lq1.c;
import hf3.a;
import oq1.e;
import oq1.b;
import sq1.a;
import sz1.e;
import xp5.i;
import jk1.f;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleController$giftBattleModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleController$multiLineCountdownModel$2;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleController$b;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleController$c;
import androidx.lifecycle.ViewModelProvider;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleController$a;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ir1.c;
import androidx.lifecycle.ViewModel;
import or1.d;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleDataBinding;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel;
import hr1.a;
import androidx.lifecycle.LifecycleOwner;
import or1.b;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import or1.c;
import qrd.l1;
import android.view.ViewGroup;
import jq1.d;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleController$onCreate$2;
import or1.a;
import n91.f;
import qr1.b;
import is1.c;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.toptag.LiveAudienceMultiLineGiftBattleTopTagDataBinding$bindViewModel$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import androidx.lifecycle.Transformations;
import qr1.a;
import com.kuaishou.live.common.core.component.gift.gift.righttopbanner.panel.ILiveDefaultSelectGiftIdInterceptor;
import is1.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a;
import com.kwai.robust.PatchProxyResult;

public final class LiveAudienceMultiLineGiftBattleController extends ViewController	// class@001566
{
    public final ViewModelProvider j;
    public LiveAudienceMultiLineGiftBattleDataBinding k;
    public final p l;
    public final p m;
    public final LiveAudienceMultiLineGiftBattleController$b n;
    public final LiveAudienceMultiLineGiftBattleController$c o;
    public final String p;
    public final a q;
    public final g r;
    public final c s;
    public final a t;
    public final e u;
    public final b v;
    public final a w;
    public final e x;
    public final i y;
    public final f z;

    public void LiveAudienceMultiLineGiftBattleController(String p0,a p1,g p2,c p3,a p4,e p5,b p6,a p7,e p8,i p9,f p10){
       a.p(p1, "lineBasicModel");
       a.p(p2, "liveInfoManager");
       a.p(p3, "multiLineCoreModel");
       a.p(p4, "liveLongConnection");
       a.p(p6, "lineLogParamsProvider");
       a.p(p7, "roomDelegate");
       a.p(p8, "liveMultiInteractManager");
       a.p(p9, "liveLogPackageProvider");
       a.p(p10, "liveAudienceGiftBoxService");
       super();
       this.p = p0;
       this.q = p1;
       this.r = p2;
       this.s = p3;
       this.t = p4;
       this.u = p5;
       this.v = p6;
       this.w = p7;
       this.x = p8;
       this.y = p9;
       this.z = p10;
       this.l = s.c(new LiveAudienceMultiLineGiftBattleController$giftBattleModel$2(this));
       this.m = s.c(new LiveAudienceMultiLineGiftBattleController$multiLineCountdownModel$2(this));
       this.n = new LiveAudienceMultiLineGiftBattleController$b(this);
       this.o = new LiveAudienceMultiLineGiftBattleController$c(this);
       this.j = new ViewModelProvider(this, new LiveAudienceMultiLineGiftBattleController$a(this));
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiLineGiftBattleController.class, "3")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0a27);
       ViewModel viewModel = this.j.get(c.class);
       a.o(viewModel, "viewModelProvider.get\(Li¡­sicViewModel::class.java\)");
       ViewModel viewModel1 = this.j.get(d.class);
       a.o(viewModel1, "viewModelProvider.get\(Li¡­tleViewModel::class.java\)");
       LiveAudienceMultiLineGiftBattleDataBinding liveAudience = new LiveAudienceMultiLineGiftBattleDataBinding(this.u, this.v, this.w, this.n, viewModel, this.V2(), this.r, this.x, this.y, this.z);
       String str = "1";
       if (!PatchProxy.applyVoidOneRefs(viewModel1, v13, LiveAudienceMultiLineGiftBattleDataBinding.class, str)) {
          a.p(viewModel1, "giftBattleViewModel");
          viewModel1.a.observe(v13.n.j(), new b(v13));
          viewModel1.b.observe(v13.n.j(), new c(v13));
       }
       this.k = v13;
       this.y2(this.n.a(), new d(this.r, this.V2(), new a(new LiveAudienceMultiLineGiftBattleController$onCreate$2(this.w))));
       b uob = new b(this.V2(), this.n, this.W2());
       if (!PatchProxy.applyVoidTwoRefs(viewModel, viewModel1, uob, b.class, str)) {
          a.p(viewModel, "basicLineViewModel");
          a.p(viewModel1, "giftBattleViewModel");
          LiveData liveData = Transformations.distinctUntilChanged(LiveDataOperators.b(viewModel.u0(), viewModel1.c, LiveAudienceMultiLineGiftBattleTopTagDataBinding$bindViewModel$1.INSTANCE));
          a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
          liveData.observe(uob.c.j(), new a(uob));
       }
       this.z.Yc(this.o);
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiLineGiftBattleController.class, "4")) {
          return;
       }
       this.V2().S();
       this.W2().c();
       LiveAudienceMultiLineGiftBattleController tk = this.k;
       if (tk == null) {
          a.S("giftBattleDataBinding");
       }
       tk.d();
       this.z.ie(this.o);
       return;
    }
    public final LiveMultiLineGiftBattleModel V2(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLineGiftBattleController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l.getValue();
    }
    public final c W2(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLineGiftBattleController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.getValue();
    }
}
