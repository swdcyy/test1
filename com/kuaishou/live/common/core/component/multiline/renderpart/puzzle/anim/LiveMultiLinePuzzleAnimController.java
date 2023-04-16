package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnimController;
import com.kuaishou.live.viewcontroller.ViewController;
import as1.a;
import ls1.d;
import gs1.h;
import nq1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnimController$animModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnimController$viewModel$2;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnimController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import yr1.e;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnimController$$special$$inlined$viewModels$2;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnimController$c;
import java.util.HashMap;
import nsd.u;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.Boolean;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import com.yxcorp.gifshow.image.KwaiImageView;
import as1.j;
import brd.t;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnimController$b;
import erd.g;
import crd.b;
import qrd.l1;
import yr1.d;
import trd.j;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnimController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import as1.d;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleUserInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import yr1.c;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnswerAnimKt;

public final class LiveMultiLinePuzzleAnimController extends ViewController	// class@0015a0
{
    public ViewGroup j;
    public KwaiImageView k;
    public boolean l;
    public final p m;
    public final p n;
    public final LiveMultiLinePuzzleAnimController$c o;
    public final HashMap p;
    public final a q;
    public final d r;
    public final h s;
    public final a t;

    public void LiveMultiLinePuzzleAnimController(a p0,d p1,h p2,a p3){
       a.p(p0, "puzzleModel");
       a.p(p1, "resourceManager");
       a.p(p2, "puzzleSelfWidgetModel");
       super();
       this.q = p0;
       this.r = p1;
       this.s = p2;
       this.t = p3;
       this.m = s.c(LiveMultiLinePuzzleAnimController$animModel$2.INSTANCE);
       this.n = new ViewModelLazy(m0.d(e.class), new LiveMultiLinePuzzleAnimController$$special$$inlined$viewModels$2(new LiveMultiLinePuzzleAnimController$$special$$inlined$viewModels$1(this)), new LiveMultiLinePuzzleAnimController$viewModel$2(this));
       this.o = new LiveMultiLinePuzzleAnimController$c(this);
       this.p = new HashMap();
    }
    public void LiveMultiLinePuzzleAnimController(a p0,d p1,h p2,a p3,int p4,u p5){
       super(p0, p1, p2, null);
    }
    public void F2(){
       View view;
       LiveMultiLinePuzzleAnimController liveMultiLin = LiveMultiLinePuzzleAnimController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveMultiLin, "3")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0cb3);
       String str = "null cannot be cast to non-null type android.view.ViewGroup";
       if (!PatchProxy.applyVoid(objArray, this, liveMultiLin, "8")) {
          view = this.P2();
          Objects.requireNonNull(view, str);
          while (view.getParent() instanceof ViewGroup) {
             ViewParent parent = view.getParent();
             Objects.requireNonNull(parent, str);
             this.p.put(parent, r0.a(Boolean.valueOf(parent.getClipChildren()), Boolean.valueOf(parent.getClipToPadding())));
             parent.setClipChildren(false);
             parent.setClipToPadding(false);
             if (parent.getId() != 0x7f0a21ae) {
             }
          }
       }
       view = this.P2();
       Objects.requireNonNull(view, str);
       this.j = view;
       this.k = this.A2(0x7f0a21ba);
       this.q.l(this.o);
       liveMultiLin = this.t;
       if (liveMultiLin != null) {
          t ot = liveMultiLin.c();
          if (ot != null && ot.subscribe(new LiveMultiLinePuzzleAnimController$b(this)) != null) {
          label_0098 :
             return;
          }
       }
       this.V2();
       l1 a = l1.a;
       goto label_0098 ;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMultiLinePuzzleAnimController.class, "4")) {
          return;
       }
       this.q.p(this.o);
       d uod = this.W2();
       Objects.requireNonNull(uod);
       if (!PatchProxy.applyVoid(objArray, uod, d.class, "3")) {
          uod.a.clear();
       }
       this.l = false;
       Set set = this.p.entrySet();
       a.o(set, "parentViewClipMap.entries");
       Iterator iterator = set.iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          a.o(key, "it.key");
          key.setClipChildren(uEntry.getValue().getFirst().booleanValue());
          key = uEntry.getKey();
          a.o(key, "it.key");
          key.setClipToPadding(uEntry.getValue().getSecond().booleanValue());
       }
       this.p.clear();
       return;
    }
    public final void V2(){
       if (PatchProxy.applyVoid(null, this, LiveMultiLinePuzzleAnimController.class, "5")) {
          return;
       }
       this.X2().a.observe(this, new LiveMultiLinePuzzleAnimController$a(this));
       return;
    }
    public final d W2(){
       Object obj = PatchProxy.apply(null, this, LiveMultiLinePuzzleAnimController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.getValue();
    }
    public final e X2(){
       Object obj = PatchProxy.apply(null, this, LiveMultiLinePuzzleAnimController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n.getValue();
    }
    public final List Y2(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, LiveMultiLinePuzzleAnimController.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       boolean b = (p0 == null || p0.isEmpty())? true: false;
       if (!b) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             UserInfo userInfo = this.q.r().e(iterator.next());
             if (userInfo != null) {
                obj.add(userInfo);
             }
          }
       }
       b.c0(LiveLogTag.LIVE_LINE_PUZZLE, "getWinUserList", "size", Integer.valueOf(obj.size()));
       return obj;
    }
    public final void Z2(int p0,JsonObject p1){
       LiveMultiLinePuzzleAnimController liveMultiLin = LiveMultiLinePuzzleAnimController.class;
       if (PatchProxy.isSupport(liveMultiLin) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, liveMultiLin, "6")) {
          return;
       }
       a.p(p1, "animParam");
       if (p0 == 1) {
          JsonElement jsonElement = p1.e0("answerId");
          jsonElement = (jsonElement != null)? jsonElement.p(): 0;
          JsonElement jsonElement1 = p1.e0("thisTimeBeWonAuthorIds");
          ArrayList uArrayList = new ArrayList();
          if (jsonElement1 instanceof JsonArray) {
             Iterator iterator = jsonElement1.iterator();
             while (iterator.hasNext()) {
                JsonElement jsonElement2 = iterator.next();
                a.o(jsonElement2, "it");
                uArrayList.add(String.valueOf(jsonElement2.t()));
             }
          }
          b.d0(LiveLogTag.LIVE_LINE_PUZZLE, "puzzleShowAnim from js", "winAuthorIds", uArrayList, "answerId", Integer.valueOf(jsonElement));
          String str = this.q.r().a();
          String str1 = "";
          if (str == null) {
             str = str1;
          }
          LivePuzzleUserInfo livePuzzleUs = this.q.r().c(str);
          if (livePuzzleUs != null) {
             livePuzzleUs = livePuzzleUs.player;
             if (livePuzzleUs != null) {
                UserInfos$UserInfo userName = livePuzzleUs.userName;
                if (userName != null) {
                   str1 = userName;
                }
             }
          }
          LiveMultiLinePuzzleAnimController tj = this.j;
          if (tj == null) {
             a.S("container");
          }
          c uoc = LiveMultiLinePuzzleAnswerAnimKt.a(tj, str1, String.valueOf(jsonElement), this.r, this.Y2(uArrayList));
          if (uoc != null) {
             this.W2().b(uoc);
          }
       }
       return;
    }
}
