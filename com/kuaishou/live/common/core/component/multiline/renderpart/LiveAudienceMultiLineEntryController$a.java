package com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController$a;
import mq1.b;
import com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.LiveAudienceMultiLinePuzzleController;
import com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController$createPuzzleViewController$1;
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
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.LiveAudienceMultiLineArenaLineController;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleController;
import jk1.f;
import hs1.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController$createPkWarmupViewController$1;
import sq1.e;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView;
import android.view.ViewGroup;
import rq1.a;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import lh3.b;
import mq1.a;
import mq1.c$a;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import nh3.b;
import java.lang.System;
import java.util.Iterator;
import nh3.c;
import com.kwai.framework.model.user.UserInfo;
import qrd.l1;

public final class LiveAudienceMultiLineEntryController$a implements b	// class@0014f2
{
    public final LiveAudienceMultiLineEntryController a;

    public void LiveAudienceMultiLineEntryController$a(LiveAudienceMultiLineEntryController p0){
       this.a = p0;
       super();
    }
    public void a(int p0,SCLiveMultiLineChatOpened p1){
       LiveAudienceMultiLineEntryController$a a;
       String str1;
       ViewController viewControll;
       LiveAudienceMultiLineEntryController obj2;
       Object obj3;
       LiveAudienceMultiLineEntryController k;
       LiveAudienceMultiLineEntryController e;
       Object obj = this;
       int i = p0;
       SCLiveMultiLineChatOpened obj1 = p1;
       LiveAudienceMultiLineEntryController liveAudience = LiveAudienceMultiLineEntryController.class;
       LiveAudienceMultiLineEntryController$a uoa = LiveAudienceMultiLineEntryController$a.class;
       String str = "1";
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), obj1, obj, uoa, str)) {
          return;
       }
       a.p(obj1, "scLineOpened");
       a = obj.a;
       Objects.requireNonNull(a);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveAudienceMultiLineEntryController liveAudience1 = 1;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), obj1, a, liveAudience, "10")) {
          str1 = str;
       }else {
          a.a3();
          if (i != liveAudience1) {
             String str3 = "multiLineBasicModel";
             if (i != 2) {
                if (i != 3) {
                   if (i != 5) {
                      if (i != 6) {
                         viewControll = a.X2();
                      }else {
                         obj2 = PatchProxy.applyOneRefs(obj1, a, liveAudience, "16");
                         if (obj2 != patchProxyRe) {
                            viewControll = obj2;
                         }else {
                            obj1 = obj1.chatModeStartExtra;
                            obj2 = a.k;
                            if (obj2 == null) {
                               a.S(str3);
                            }
                            str1 = str;
                            LiveAudienceMultiLinePuzzleController liveAudience2 = new LiveAudienceMultiLinePuzzleController(obj1, obj2, a.C, a.j, a.m, a.z, a.E, a.A, a.B, a.F, new LiveAudienceMultiLineEntryController$createPuzzleViewController$1(a));
                         }
                      }
                      str1 = str;
                   }else {
                      str1 = str;
                      obj3 = PatchProxy.applyOneRefs(obj1, a, liveAudience, "15");
                      if (obj3 != patchProxyRe) {
                      }else {
                         obj2 = a.j;
                         k = a.k;
                         if (k == null) {
                            a.S(str3);
                         }
                         viewControll = new LiveAudienceMultiLineArenaLineController(p1, obj2, k, a.A, a.C, a.E, a.m, a.F, a.z);
                      }
                   }
                }else {
                   str1 = str;
                   obj3 = PatchProxy.applyOneRefs(obj1, a, liveAudience, "14");
                   if (obj3 != patchProxyRe) {
                   }else {
                      obj1 = obj1.chatModeStartExtra;
                      obj2 = a.k;
                      if (obj2 == null) {
                         a.S(str3);
                      }
                      LiveAudienceMultiLineGiftBattleController liveAudience3 = new LiveAudienceMultiLineGiftBattleController(obj1, obj2, a.A, a.j, a.C, a.m, a.z, a.E, a.B, a.F, a.G);
                   }
                }
             }else {
                str1 = str;
                obj3 = PatchProxy.applyOneRefs(obj1, a, liveAudience, "13");
                if (obj3 != patchProxyRe) {
                }else {
                   obj2 = a.m;
                   k = a.z;
                   e = a.E;
                   LiveAudienceMultiLineEntryController k1 = a.k;
                   if (k1 == null) {
                      a.S(str3);
                   }
                   a uoa2 = new a(obj2, k, e, k1, a.B, a.F, obj1.chatModeStartExtra, new LiveAudienceMultiLineEntryController$createPkWarmupViewController$1(a));
                }
             }
             viewControll = obj3;
          }else {
             str1 = str;
             viewControll = a.X2();
          }
          b.P(e.a, "enter sub chat mode:"+i+", vc "+viewControll+", render:"+a.r);
          LiveAudienceMultiLineEntryController r = a.r;
          if (r != null && viewControll != null) {
             a.s = viewControll;
             a.m(r);
             a.y2(r.getOverlayContainer(), viewControll);
          }
       }
       LiveAudienceMultiLineEntryController$a a1 = obj.a;
       Objects.requireNonNull(a1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, a1, liveAudience, "17") && a1.t == null) {
          e0 page = a1.F.getPage();
          String str2 = a1.A.d();
          ClientContent$LiveStreamPackage liveStreamPa = a1.F.a();
          a.o(liveStreamPa, "logPackageProvider.liveStreamPackage");
          b uob = a1.B.gc();
          a.o(uob, "multiInteractManager.liveInteractRtcManager");
          LiveAudienceMultiLineEntryController j = a1.j;
          LiveAudienceMultiLineEntryController l = a1.l;
          if (l == null) {
             a.S("mLineChatModeManager");
          }
          a uoa1 = new a(page, str2, liveStreamPa, uob, j, l);
          if (!PatchProxy.applyVoid(objArray, obj1, a.class, str1)) {
             obj1.p.h(obj1.j);
             obj1.i = new c$a(obj1.a(obj1.o), obj1.o.Y());
             obj1.a = true;
             SCInteractiveChatRoomInfo sCInteractiv = obj1.n.b();
             if (sCInteractiv != null) {
                a.m(sCInteractiv);
                b uob1 = obj1.e(sCInteractiv);
                obj1.c = System.currentTimeMillis();
                List list = uob1.f();
                a.m(list);
                Iterator iterator = list.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      c uoc = iterator.next();
                      a.o(uoc, "userInfo");
                      if (a.g(uoc.c().mId, obj1.l)) {
                         objArray = uoc.b();
                      }
                   }
                   b uob2 = uob1;
                   obj1.b(1, "MULTI_LIVE_CHAT_MODE_PLAY", objArray, uob1.a(), "", Integer.valueOf(uob1.b()), uob1.c(), obj1.a(obj1.o), obj1.o.Y(), System.currentTimeMillis(), 0, uob1.f(), null, null);
                   obj1.b = System.currentTimeMillis();
                   List list1 = uob2.f();
                   a.o(list1, "roomInfo.userInfos");
                   obj1.f = list1;
                   obj1.g = uob2;
                }
             }
          }
          a1.t = obj1;
       }
       return;
    }
}
