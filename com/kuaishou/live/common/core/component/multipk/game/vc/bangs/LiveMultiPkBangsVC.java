package com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkBangsVC;
import com.kuaishou.live.viewcontroller.ViewController;
import ut1.d;
import zs1.b;
import ft1.b;
import ws1.c;
import ps1.e;
import st1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import ut1.f;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkSmallTalkBangsVC;
import du1.d;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkBangsVC$onCreate$1;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkTimeLine;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkBangsVC$onCreate$2;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkBangsVC$onCreate$3;
import msd.a;
import pu1.m;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.cohesion.LiveMultiPkCohesionVoteBangsVC;
import com.kuaishou.protobuf.livestream.nano.CohesionPkInfo;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkBangsVC$onCreate$4;
import lt1.g;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkBangsVC$onCreate$5;
import lt1.l;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkBangsVC$onCreate$6;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkBangsVC$onCreate$7;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkVoteBangsVC;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkBangsVC$onCreate$8;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkPunishBangsVC;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkBangsVC$onCreate$9;

public final class LiveMultiPkBangsVC extends ViewController	// class@001602
{
    public final d j;
    public final b k;
    public final b l;
    public final c m;
    public final e n;
    public final a o;

    public void LiveMultiPkBangsVC(d p0,b p1,b p2,c p3,e p4,a p5){
       a.p(p0, "countDownModel");
       a.p(p1, "coreModel");
       a.p(p2, "gameModel");
       a.p(p3, "pkContainerLayout");
       a.p(p4, "pkDelegate");
       a.p(p5, "logDelegate");
       super();
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.m = p3;
       this.n = p4;
       this.o = p5;
    }
    public void F2(){
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, LiveMultiPkBangsVC.class, "1")) {
          return;
       }
       f value = obj.k.l().getValue();
       if (value != null && value.g() == 2) {
          LiveMultiPkSmallTalkBangsVC liveMultiPkS = new LiveMultiPkSmallTalkBangsVC(obj.m, obj.n.e(), new LiveMultiPkBangsVC$onCreate$1(obj), value.m(), new LiveMultiPkBangsVC$onCreate$2(obj), obj.o, new LiveMultiPkBangsVC$onCreate$3(obj));
          obj.z2(objArray);
       }else if(m.a.i(obj.k)){
          LiveMultiPkBangsVC j = obj.j;
          LiveMultiPkBangsVC k = obj.k;
          LiveMultiPkBangsVC l = obj.l;
          if (value != null) {
             objArray = value.c();
          }
          LiveMultiPkCohesionVoteBangsVC liveMultiPkC = new LiveMultiPkCohesionVoteBangsVC(j, k, l, objArray, obj.m, new LiveMultiPkBangsVC$onCreate$4(obj), obj.o);
          obj.z2(v3);
          g og = new g(obj.j, obj.k, obj.l, obj.m, new LiveMultiPkBangsVC$onCreate$5(obj), obj.o);
          obj.z2(value);
       }else if(m.m(obj.k)){
          l ol = new l(obj.j, obj.k, obj.l, obj.m, new LiveMultiPkBangsVC$onCreate$6(obj), obj.o);
          obj.z2(value);
          g og1 = new g(obj.j, obj.k, obj.l, obj.m, new LiveMultiPkBangsVC$onCreate$7(obj), obj.o);
          obj.z2(value);
       }else {
          LiveMultiPkVoteBangsVC liveMultiPkV = new LiveMultiPkVoteBangsVC(obj.j, obj.k, obj.l, obj.m, obj.o, new LiveMultiPkBangsVC$onCreate$8(obj));
          obj.z2(value);
          LiveMultiPkPunishBangsVC liveMultiPkP = new LiveMultiPkPunishBangsVC(obj.j, obj.k, obj.l, obj.m, new LiveMultiPkBangsVC$onCreate$9(obj), obj.o);
          obj.z2(value);
       }
       return;
    }
}
