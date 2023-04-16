package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.LiveAudienceMultiLinePuzzleController;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.String;
import nq1.a;
import hf3.a;
import lq1.c;
import oq1.e;
import oq1.b;
import sq1.a;
import xp5.g;
import sz1.e;
import xp5.i;
import msd.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.LiveAudienceMultiLinePuzzleController$basicViewModel$2;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.LiveAudienceMultiLinePuzzleController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import ir1.c;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.LiveAudienceMultiLinePuzzleController$$special$$inlined$viewModels$2;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.LiveAudienceMultiLinePuzzleController$puzzleViewModel$2;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.LiveAudienceMultiLinePuzzleController$$special$$inlined$viewModels$3;
import xr1.c;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.LiveAudienceMultiLinePuzzleController$$special$$inlined$viewModels$4;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.LiveAudienceMultiLinePuzzleController$a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleLineChatStartInfo;
import xr1.f;
import xr1.a;
import xr1.e;
import as1.c;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleLineChatResourceInfo;
import ls1.d;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import gs1.h;
import qrd.p;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.LiveAudienceMultiLinePuzzleDataBinding;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.LiveAudienceMultiLinePuzzleController$initDataBinding$1;
import hr1.a;
import gs1.a;
import androidx.lifecycle.LifecycleOwner;
import xr1.b;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import bs1.b;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.toptag.LiveAudienceMultiLinePuzzleTagDataBinding$bindViewModel$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import androidx.lifecycle.Transformations;
import bs1.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnimController;
import as1.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a;

public final class LiveAudienceMultiLinePuzzleController extends ViewController	// class@001590
{
    public LiveAudienceMultiLinePuzzleDataBinding j;
    public LiveMultiLinePuzzleModel k;
    public final p l;
    public final p m;
    public final LiveAudienceMultiLinePuzzleController$a n;
    public final String o;
    public final a p;
    public final a q;
    public final c r;
    public final e s;
    public final b t;
    public final a u;
    public final g v;
    public final e w;
    public final i x;
    public final a y;

    public void LiveAudienceMultiLinePuzzleController(String p0,a p1,a p2,c p3,e p4,b p5,a p6,g p7,e p8,i p9,a p10){
       a.p(p1, "lineBasicModel");
       a.p(p2, "liveLongConnection");
       a.p(p3, "multiLineCoreModel");
       a.p(p5, "lineLogParamsProvider");
       a.p(p6, "roomDelegate");
       a.p(p7, "liveInfoManager");
       a.p(p8, "liveMultiInteractManager");
       a.p(p9, "liveLogPackageProvider");
       a.p(p10, "serverTimeProvider");
       super();
       this.o = p0;
       this.p = p1;
       this.q = p2;
       this.r = p3;
       this.s = p4;
       this.t = p5;
       this.u = p6;
       this.v = p7;
       this.w = p8;
       this.x = p9;
       this.y = p10;
       this.l = new ViewModelLazy(m0.d(c.class), new LiveAudienceMultiLinePuzzleController$$special$$inlined$viewModels$2(new LiveAudienceMultiLinePuzzleController$$special$$inlined$viewModels$1(this)), new LiveAudienceMultiLinePuzzleController$basicViewModel$2(this));
       this.m = new ViewModelLazy(m0.d(c.class), new LiveAudienceMultiLinePuzzleController$$special$$inlined$viewModels$4(new LiveAudienceMultiLinePuzzleController$$special$$inlined$viewModels$3(this)), new LiveAudienceMultiLinePuzzleController$puzzleViewModel$2(this));
       this.n = new LiveAudienceMultiLinePuzzleController$a(this);
    }
    public void F2(){
       LiveMultiLinePuzzleModel liveMultiLin1;
       h oh1;
       d uod1;
       LiveMultiLinePuzzleModel liveMultiLin = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveAudienceMultiLinePuzzleController liveAudience = LiveAudienceMultiLinePuzzleController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, liveMultiLin, liveAudience, "3")) {
          return;
       }
       liveMultiLin.Q2(R.layout.arg_RES_7f0d0a2f);
       LiveAudienceMultiLinePuzzleController o = liveMultiLin.o;
       c obj = PatchProxy.applyOneRefs(o, liveMultiLin, liveAudience, "7");
       if (obj != patchProxyRe) {
          liveMultiLin1 = obj;
       }else {
          LivePuzzleLineChatStartInfo livePuzzleLi = f.b(o);
          liveMultiLin1 = (livePuzzleLi != null)? new LiveMultiLinePuzzleModel(livePuzzleLi, liveMultiLin.q, liveMultiLin.w, liveMultiLin.p, false, new a(liveMultiLin)): objArray;
       }
       liveMultiLin.k = liveMultiLin1;
       if (liveMultiLin1 != null) {
          if (!PatchProxy.applyVoidOneRefs(liveMultiLin1, liveMultiLin, liveAudience, "5")) {
             LivePuzzleLineChatResourceInfo versionResou = liveMultiLin1.m().g().versionResourcePath;
             a.o(versionResou, "versionResourcePath");
             d uod = new d(LiveResourceFileUtil$LiveResourceFileType.Live_MULTI_LINE_PUZZLE_IMAGE_RESOURCE, versionResou);
             h oh = new h();
             if (PatchProxy.applyVoidThreeRefs(liveMultiLin1, uod, oh, this, LiveAudienceMultiLinePuzzleController.class, "6")) {
                oh1 = oh;
                uod1 = uod;
             }else {
                String str = "1";
                obj = PatchProxy.apply(objArray, liveMultiLin, liveAudience, str);
                if (obj == patchProxyRe) {
                   obj = liveMultiLin.l.getValue();
                }
                c uoc = PatchProxy.apply(objArray, liveMultiLin, liveAudience, "2");
                if (uoc == patchProxyRe) {
                   uoc = liveMultiLin.m.getValue();
                }
                oh1 = oh;
                uod1 = uod;
                super(liveMultiLin.s, liveMultiLin.t, liveMultiLin.n, obj, liveMultiLin.w, liveMultiLin.x, liveMultiLin.u, uod1, oh1, new LiveAudienceMultiLinePuzzleController$initDataBinding$1(liveMultiLin));
                liveMultiLin.j = this;
                if (!PatchProxy.applyVoidOneRefs(uoc, this, LiveAudienceMultiLinePuzzleDataBinding.class, str)) {
                   a.p(uoc, "puzzleViewModel");
                   uoc.b.observe(this.l.j(), new b(this));
                }
                super(liveMultiLin.n, liveMultiLin1.m(), liveMultiLin.u);
                if (!PatchProxy.applyVoidTwoRefs(obj, uoc, this, b.class, str)) {
                   a.p(obj, "basicLineViewModel");
                   a.p(uoc, "puzzleViewModel");
                   LiveData liveData = Transformations.distinctUntilChanged(LiveDataOperators.b(obj.u0(), uoc.d, LiveAudienceMultiLinePuzzleTagDataBinding$bindViewModel$1.INSTANCE));
                   a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
                   liveData.observe(this.b.j(), new a(this));
                }
                b.Z(LiveLogTag.LIVE_LINE_PUZZLE, "LiveAudienceMultiLinePuzzleController.initDataBinding");
             }
             liveMultiLin.x2(R.id.live_multi_line_puzzle_anim_container, new LiveMultiLinePuzzleAnimController(liveMultiLin1, uod1, oh1, liveMultiLin.p));
          }
          liveMultiLin1.c();
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiLinePuzzleController.class, "4")) {
          return;
       }
       LiveAudienceMultiLinePuzzleController tj = this.j;
       if (tj != null) {
          tj.d();
       }
       tj = this.k;
       if (tj != null) {
          tj.d();
       }
       return;
    }
}
