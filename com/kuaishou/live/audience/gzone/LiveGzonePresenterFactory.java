package com.kuaishou.live.audience.gzone.LiveGzonePresenterFactory;
import aa1.a;
import java.lang.Object;
import java.util.List;
import xs5.a;
import com.kwai.live.gzone.common.keyswitch.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.audience.gzone.LiveGzonePresenterFactory$a;
import xp5.a;
import com.kuaishou.live.audience.gzone.LiveGzonePresenterFactory$Scene;
import com.kuaishou.live.audience.gzone.q;
import wj3.b;
import java.lang.Boolean;
import com.kwai.live.gzone.common.keyswitch.b;
import com.kwai.live.gzone.common.keyswitch.LiveGzoneKeys;
import com.kwai.live.gzone.common.keyswitch.b$d;
import com.kuaishou.live.audience.gzone.r;
import com.kuaishou.live.audience.gzone.s;
import com.kuaishou.live.audience.gzone.t;
import tkd.b;
import tkd.d;
import f37.y;
import java.util.Iterator;
import com.kuaishou.android.live.model.QLivePlayConfig;
import z12.w;
import com.kuaishou.live.audience.gzone.u;
import com.kuaishou.live.audience.gzone.v;
import u31.a;
import com.kuaishou.live.audience.gzone.w;
import com.kuaishou.live.audience.gzone.x;
import com.kuaishou.live.audience.gzone.a;
import com.kuaishou.live.audience.gzone.b;
import com.kuaishou.live.audience.gzone.c;
import com.kuaishou.live.audience.gzone.d;
import com.kuaishou.live.audience.gzone.e;
import com.kuaishou.live.audience.gzone.f;
import com.kuaishou.live.audience.gzone.g;
import com.kuaishou.live.audience.gzone.h;
import com.kuaishou.live.audience.gzone.i;
import android.os.Build$VERSION;
import com.kuaishou.live.audience.gzone.j;
import com.kuaishou.live.audience.gzone.l;
import com.kuaishou.live.audience.gzone.m;
import com.kuaishou.live.audience.gzone.n;
import com.kuaishou.live.audience.gzone.o;
import com.kuaishou.live.audience.gzone.p;
import com.kuaishou.live.audience.gzone.k;

public class LiveGzonePresenterFactory implements a	// class@000c13
{

    public void LiveGzonePresenterFactory(){
       super();
    }
    public List a(Object p0){
       LiveGzonePresenterFactory$Scene gAME;
       boolean b;
       LiveGzonePresenterFactory$Scene[] sceneArray1;
       LiveGzonePresenterFactory$Scene[] sceneArray2;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveGzonePresenterFactory liveGzonePre = LiveGzonePresenterFactory.class;
       LiveGzonePresenterFactory$a uoa1 = PatchProxy.applyOneRefs(p0, this, liveGzonePre, "1");
       if (uoa1 != patchProxyRe) {
       }else {
          uoa1 = new LiveGzonePresenterFactory$a(p0);
          if (!PatchProxy.applyVoidOneRefs(uoa1, this, liveGzonePre, "2")) {
             if (uoa1.b.e.e()) {
                sceneArray2 = new LiveGzonePresenterFactory$Scene[]{LiveGzonePresenterFactory$Scene.GAME_NORMAL};
                uoa1.a(83, sceneArray2);
             }
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.b(q.a, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(77, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(17, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(44, sceneArray2);
             p0 = PatchProxy.apply(null, null, uoa, "32");
             b = (p0 != patchProxyRe)? p0.booleanValue(): b.b().a(LiveGzoneKeys.KEY_SWITCH_GZONE_HISTORY_COMMENTS).a();
             if (b) {
                sceneArray2 = new LiveGzonePresenterFactory$Scene[]{LiveGzonePresenterFactory$Scene.GAME};
                uoa1.a(82, sceneArray2);
             }
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(40, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.b(r.a, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(68, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(45, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(33, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(11, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(12, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.b(s.a, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.b(t.a, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(10, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(27, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(31, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(35, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(67, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(47, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(48, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(49, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(2, sceneArray2);
             b = d.a(0x6fa7b5d6).L7(uoa1.b);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             if (PatchProxy.applyTwoRefs(b, sceneArray2, uoa1, LiveGzonePresenterFactory$a.class, "4") != patchProxyRe) {
             }else {
                b = b.iterator();
                while (b.hasNext()) {
                   uoa1.b(b.next(), sceneArray2);
                }
             }
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(50, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(70, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(69, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(34, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(52, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(21, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(22, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(32, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(5, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(6, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(7, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(8, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(43, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(62, sceneArray2);
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(75, sceneArray2);
             if (b.b().a(LiveGzoneKeys.KEY_SWITCH_ENABLE_BOTTOM_NOTICE_ALERT).a()) {
                sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
                uoa1.a(76, sceneArray2);
             }
             sceneArray2 = new LiveGzonePresenterFactory$Scene[0];
             uoa1.a(28, sceneArray2);
          }
          p0 = new LiveGzonePresenterFactory$Scene[]{gAME};
          gAME = LiveGzonePresenterFactory$Scene.GAME;
          if (uoa1.d(p0) && !PatchProxy.applyVoidOneRefs(uoa1, this, liveGzonePre, "3")) {
             LiveGzonePresenterFactory$Scene[] sceneArray = new LiveGzonePresenterFactory$Scene[]{gAME};
             uoa1.a(88, sceneArray);
             sceneArray = new LiveGzonePresenterFactory$Scene[]{gAME};
             uoa1.a(36, sceneArray);
             if (!w.a(uoa1.b.k)) {
                sceneArray = new LiveGzonePresenterFactory$Scene[]{gAME};
                uoa1.a(37, sceneArray);
             }
             sceneArray = new LiveGzonePresenterFactory$Scene[]{gAME};
             uoa1.a(56, sceneArray);
             sceneArray = new LiveGzonePresenterFactory$Scene[]{gAME};
             uoa1.a(57, sceneArray);
             sceneArray = new LiveGzonePresenterFactory$Scene[]{gAME};
             uoa1.a(58, sceneArray);
             sceneArray = new LiveGzonePresenterFactory$Scene[]{gAME};
             uoa1.a(59, sceneArray);
             sceneArray = new LiveGzonePresenterFactory$Scene[]{gAME};
             uoa1.a(55, sceneArray);
             p0 = PatchProxy.apply(null, null, uoa, "17");
             b = (p0 != patchProxyRe)? p0.booleanValue(): b.b().a(LiveGzoneKeys.KEY_SWITCH_SPREAD_GOLD).a();
             if (b) {
                sceneArray = new LiveGzonePresenterFactory$Scene[]{gAME};
                uoa1.a(13, sceneArray);
                sceneArray = new LiveGzonePresenterFactory$Scene[]{gAME};
                uoa1.a(14, sceneArray);
                sceneArray = new LiveGzonePresenterFactory$Scene[]{gAME};
                uoa1.a(15, sceneArray);
                sceneArray = new LiveGzonePresenterFactory$Scene[]{gAME};
                uoa1.a(16, sceneArray);
             }
             if (b.b().a(LiveGzoneKeys.KEY_SWITCH_GZONE_VOTE).a()) {
                sceneArray = new LiveGzonePresenterFactory$Scene[]{gAME};
                uoa1.a(79, sceneArray);
             }
             sceneArray = new LiveGzonePresenterFactory$Scene[]{gAME};
             uoa1.b(u.a, sceneArray);
             sceneArray = new LiveGzonePresenterFactory$Scene[]{gAME};
             uoa1.a(81, sceneArray);
             sceneArray = new LiveGzonePresenterFactory$Scene[]{gAME};
             uoa1.a(86, sceneArray);
             b = PatchProxy.apply(null, null, uoa, "27");
             b = (b != patchProxyRe)? b.booleanValue(): b.b().a(LiveGzoneKeys.KEY_SWITCH_LIVE_GZONE_ENABLE_NEW_MULTI_PK).a();
             if (b) {
                sceneArray1 = new LiveGzonePresenterFactory$Scene[]{LiveGzonePresenterFactory$Scene.GAME_MULTI_TAB};
                uoa1.b(v.a, sceneArray1);
             }
             sceneArray1 = new LiveGzonePresenterFactory$Scene[]{gAME};
             uoa1.a(87, sceneArray1);
             if (LiveGzoneKeys.KEY_SWITCH_KRN_DIALOG.getter().a()) {
                sceneArray1 = new LiveGzonePresenterFactory$Scene[]{gAME};
                uoa1.a(89, sceneArray1);
             }
             if (LiveGzoneKeys.KEY_SWITCH_TOP_RIGHT_PENDANT.getter().a()) {
                sceneArray1 = new LiveGzonePresenterFactory$Scene[]{gAME};
                uoa1.a(90, sceneArray1);
             }
          }
       label_02f0 :
          this.b(uoa1);
          uoa1 = uoa1.d;
       }
       return uoa1;
    }
    public final void b(LiveGzonePresenterFactory$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzonePresenterFactory.class, "4")) {
          return;
       }
       int i = 1;
       LiveGzonePresenterFactory$Scene[] sceneArray = new LiveGzonePresenterFactory$Scene[i];
       LiveGzonePresenterFactory$Scene mULTI_TAB = LiveGzonePresenterFactory$Scene.MULTI_TAB;
       sceneArray[0] = mULTI_TAB;
       p0.b(new a(p0), sceneArray);
       sceneArray = new LiveGzonePresenterFactory$Scene[i];
       sceneArray[0] = mULTI_TAB;
       p0.a(38, sceneArray);
       sceneArray = new LiveGzonePresenterFactory$Scene[i];
       sceneArray[0] = mULTI_TAB;
       p0.b(w.a, sceneArray);
       sceneArray = new LiveGzonePresenterFactory$Scene[i];
       sceneArray[0] = mULTI_TAB;
       p0.b(x.a, sceneArray);
       sceneArray = new LiveGzonePresenterFactory$Scene[i];
       sceneArray[0] = mULTI_TAB;
       p0.a(65, sceneArray);
       sceneArray = new LiveGzonePresenterFactory$Scene[i];
       sceneArray[0] = mULTI_TAB;
       p0.a(64, sceneArray);
       sceneArray = new LiveGzonePresenterFactory$Scene[i];
       sceneArray[0] = mULTI_TAB;
       p0.b(a.a, sceneArray);
       sceneArray = new LiveGzonePresenterFactory$Scene[i];
       sceneArray[0] = mULTI_TAB;
       p0.a(30, sceneArray);
       sceneArray = new LiveGzonePresenterFactory$Scene[i];
       sceneArray[0] = mULTI_TAB;
       p0.b(b.a, sceneArray);
       sceneArray = new LiveGzonePresenterFactory$Scene[i];
       sceneArray[0] = mULTI_TAB;
       p0.b(c.a, sceneArray);
       sceneArray = new LiveGzonePresenterFactory$Scene[i];
       sceneArray[0] = mULTI_TAB;
       p0.b(d.a, sceneArray);
       sceneArray = new LiveGzonePresenterFactory$Scene[i];
       sceneArray[0] = mULTI_TAB;
       p0.b(e.a, sceneArray);
       sceneArray = new LiveGzonePresenterFactory$Scene[i];
       sceneArray[0] = mULTI_TAB;
       p0.b(f.a, sceneArray);
       sceneArray = new LiveGzonePresenterFactory$Scene[i];
       sceneArray[0] = mULTI_TAB;
       p0.b(g.a, sceneArray);
       sceneArray = new LiveGzonePresenterFactory$Scene[i];
       sceneArray[0] = mULTI_TAB;
       p0.b(h.a, sceneArray);
       sceneArray = new LiveGzonePresenterFactory$Scene[i];
       sceneArray[0] = mULTI_TAB;
       p0.b(i.a, sceneArray);
       sceneArray = new LiveGzonePresenterFactory$Scene[i];
       sceneArray[0] = mULTI_TAB;
       p0.a(29, sceneArray);
       sceneArray = new LiveGzonePresenterFactory$Scene[i];
       sceneArray[0] = mULTI_TAB;
       p0.a(39, sceneArray);
       sceneArray = new LiveGzonePresenterFactory$Scene[i];
       sceneArray[0] = mULTI_TAB;
       p0.a(51, sceneArray);
       sceneArray = new LiveGzonePresenterFactory$Scene[i];
       sceneArray[0] = mULTI_TAB;
       p0.a(26, sceneArray);
       int i1 = 23;
       if (b.b().a(LiveGzoneKeys.KEY_SYSTEM_BAR_LOG).a() && Build$VERSION.SDK_INT >= i1) {
          LiveGzonePresenterFactory$Scene[] sceneArray1 = new LiveGzonePresenterFactory$Scene[i];
          sceneArray1[0] = mULTI_TAB;
          p0.a(46, sceneArray1);
       }
       LiveGzonePresenterFactory$Scene[] sceneArray2 = new LiveGzonePresenterFactory$Scene[i];
       LiveGzonePresenterFactory$Scene sHOW_MULTI_T = LiveGzonePresenterFactory$Scene.SHOW_MULTI_TAB;
       sceneArray2[0] = sHOW_MULTI_T;
       p0.b(j.a, sceneArray2);
       sceneArray2 = new LiveGzonePresenterFactory$Scene[i];
       sceneArray2[0] = sHOW_MULTI_T;
       p0.b(l.a, sceneArray2);
       sceneArray2 = new LiveGzonePresenterFactory$Scene[i];
       sceneArray2[0] = sHOW_MULTI_T;
       p0.b(m.a, sceneArray2);
       sceneArray2 = new LiveGzonePresenterFactory$Scene[i];
       sceneArray2[0] = sHOW_MULTI_T;
       p0.b(n.a, sceneArray2);
       if (b.b().a(LiveGzoneKeys.KEY_SWITCH_GZONE_SPORT_BROADCAST).a()) {
          sceneArray2 = new LiveGzonePresenterFactory$Scene[i];
          sceneArray2[0] = sHOW_MULTI_T;
          p0.a(84, sceneArray2);
       }
       sceneArray2 = new LiveGzonePresenterFactory$Scene[i];
       sceneArray2[0] = sHOW_MULTI_T;
       p0.a(85, sceneArray2);
       int i2 = 2;
       sceneArray2 = new LiveGzonePresenterFactory$Scene[i2];
       sceneArray2[0] = sHOW_MULTI_T;
       LiveGzonePresenterFactory$Scene gAME = LiveGzonePresenterFactory$Scene.GAME;
       sceneArray2[i] = gAME;
       if (p0.d(sceneArray2)) {
          LiveGzonePresenterFactory$Scene[] sceneArray3 = new LiveGzonePresenterFactory$Scene[i2];
          sceneArray3[0] = sHOW_MULTI_T;
          sceneArray3[i] = gAME;
          p0.b(o.a, sceneArray3);
          sceneArray3 = new LiveGzonePresenterFactory$Scene[i2];
          sceneArray3[0] = sHOW_MULTI_T;
          sceneArray3[i] = gAME;
          p0.a(60, sceneArray3);
          sceneArray3 = new LiveGzonePresenterFactory$Scene[i2];
          sceneArray3[0] = sHOW_MULTI_T;
          sceneArray3[i] = gAME;
          p0.a(61, sceneArray3);
          sceneArray3 = new LiveGzonePresenterFactory$Scene[i2];
          sceneArray3[0] = sHOW_MULTI_T;
          sceneArray3[i] = gAME;
          p0.a(24, sceneArray3);
          sceneArray3 = new LiveGzonePresenterFactory$Scene[i2];
          sceneArray3[0] = sHOW_MULTI_T;
          sceneArray3[i] = gAME;
          p0.a(42, sceneArray3);
          sceneArray3 = new LiveGzonePresenterFactory$Scene[i2];
          sceneArray3[0] = sHOW_MULTI_T;
          sceneArray3[i] = gAME;
          p0.a(80, sceneArray3);
          sceneArray3 = new LiveGzonePresenterFactory$Scene[i2];
          sceneArray3[0] = sHOW_MULTI_T;
          sceneArray3[i] = gAME;
          p0.a(54, sceneArray3);
          sceneArray2 = new LiveGzonePresenterFactory$Scene[i2];
          sceneArray2[0] = sHOW_MULTI_T;
          sceneArray2[i] = gAME;
          p0.a(i1, sceneArray2);
          sceneArray2 = new LiveGzonePresenterFactory$Scene[i2];
          sceneArray2[0] = sHOW_MULTI_T;
          sceneArray2[i] = gAME;
          p0.a(74, sceneArray2);
          sceneArray2 = new LiveGzonePresenterFactory$Scene[i2];
          sceneArray2[0] = sHOW_MULTI_T;
          sceneArray2[i] = gAME;
          p0.a(73, sceneArray2);
          sceneArray2 = new LiveGzonePresenterFactory$Scene[i2];
          sceneArray2[0] = sHOW_MULTI_T;
          sceneArray2[i] = gAME;
          p0.a(66, sceneArray2);
          if (b.b().a(LiveGzoneKeys.KEY_SWITCH_PENDANT_SCALE).a()) {
             sceneArray2 = new LiveGzonePresenterFactory$Scene[i2];
             sceneArray2[0] = sHOW_MULTI_T;
             sceneArray2[i] = gAME;
             p0.a(63, sceneArray2);
          }
          sceneArray2 = new LiveGzonePresenterFactory$Scene[i2];
          sceneArray2[0] = sHOW_MULTI_T;
          sceneArray2[i] = gAME;
          p0.a(53, sceneArray2);
          sceneArray2 = new LiveGzonePresenterFactory$Scene[i2];
          sceneArray2[0] = sHOW_MULTI_T;
          sceneArray2[i] = gAME;
          p0.b(p.a, sceneArray2);
          LiveGzonePresenterFactory$Scene[] sceneArray4 = new LiveGzonePresenterFactory$Scene[i2];
          sceneArray4[0] = sHOW_MULTI_T;
          sceneArray4[i] = gAME;
          p0.a(20, sceneArray4);
          if (a.d()) {
             LiveGzonePresenterFactory$Scene[] sceneArray5 = new LiveGzonePresenterFactory$Scene[i];
             sceneArray5[0] = gAME;
             p0.b(k.a, sceneArray5);
          }
       }
       return;
    }
}
