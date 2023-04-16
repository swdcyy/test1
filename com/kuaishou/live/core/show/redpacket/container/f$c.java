package com.kuaishou.live.core.show.redpacket.container.f$c;
import uw1.m;
import com.kuaishou.live.core.show.redpacket.container.f;
import java.lang.Object;
import uw1.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import uw1.l;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerDialogFragment;
import androidx.fragment.app.DialogFragment;
import z12.x;
import android.view.ViewPropertyAnimator;
import android.view.View;
import rg2.h;
import java.lang.Runnable;
import rg2.i;
import xp5.i;
import lp3.c;
import lp3.i;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import kotlin.jvm.internal.a;
import msd.a;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import com.kuaishou.android.live.log.b;
import z1.k;
import java.lang.Number;
import bi2.e;
import uw1.f;
import java.util.Map;
import yh2.d;
import java.lang.Long;
import bi2.c;
import ci2.b;
import ci2.b$a;
import brd.t;
import java.util.concurrent.TimeUnit;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import bi2.a;
import bi2.b;
import erd.g;
import crd.b;
import uw1.j;
import java.lang.Integer;
import com.kuaishou.live.core.show.redpacket.richcard.handler.RichCardEffectHandler;
import com.kuaishou.live.core.show.redpacket.container.e;
import z1.a;
import com.kuaishou.live.core.show.redpacket.container.g;
import lnc.c3$a;
import lnc.c3;
import android.content.DialogInterface$OnShowListener;
import java.util.Set;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.CharSequence;
import android.text.TextUtils;
import androidx.viewpager.widget.ViewPager;
import java.util.Iterator;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerPagerAdapter;
import va1.j;
import java.lang.Math;
import com.kuaishou.live.core.basic.widget.LiveSafeViewPager;
import java.util.ArrayList;
import rg2.h0;
import java.util.Comparator;
import java.util.Collections;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.Fragment;

public class f$c implements m	// class@000e75
{
    public final f a;

    public void f$c(f p0){
       this.a = p0;
       super();
    }
    public void A2(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "1")) {
          return;
       }
       this.a.q.add(p0);
       return;
    }
    public void D0(){
       l.a(this);
    }
    public void I2(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "2")) {
          return;
       }
       this.a.q.remove(p0);
       return;
    }
    public void V3(){
       if (PatchProxy.applyVoid(null, this, f$c.class, "15")) {
          return;
       }
       this.a.p.onNext(Boolean.TRUE);
       return;
    }
    public boolean V4(boolean p0){
       f obj;
       f$c uoc = f$c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoc, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.a.S8()) {
          return false;
       }else {
          obj = this.a.v;
          Objects.requireNonNull(obj);
          if (PatchProxy.isSupport(LiveRedPacketContainerDialogFragment.class) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), obj, LiveRedPacketContainerDialogFragment.class, "8") && x.s(obj))) {
             long l = 100;
             if (p0) {
                obj.u.animate().withLayer().alpha(0x3f800000).setDuration(l).withStartAction(new h(obj)).start();
             }else {
                obj.u.animate().withLayer().alpha(0).setDuration(l).withEndAction(new i(obj)).start();
             }
          }
          return true;
       }
    }
    public i a(){
       Object obj = PatchProxy.apply(null, this, f$c.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.y.a(i.class);
    }
    public void b(LiveTreasureBoxMessage$LiveTreasureBoxShow p0){
       c uoc1;
       long l1;
       long l2;
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "17")) {
          return;
       }
       f k = this.a.K;
       if (k != null) {
          Objects.requireNonNull(k);
          if (!PatchProxy.applyVoidOneRefs(p0, k, LiveRichCardCoreManager.class, "11")) {
             a.p(p0, "showMessage");
             if (!k.c0.invoke().booleanValue()) {
                b.P(LiveRichCardStateManager.h.f().appendTag(k.a), "[onNewActivityRedPacketReceived] 当前直播间不展示 isCurrentFragmentOnScreen = false");
             }else {
                c obj = k.W.get();
                a.o(obj, "curServerTime.get\(\)");
                if (p0.showDeadline - obj.longValue() < 0 || k.v != null) {
                   c uoc = LiveRichCardStateManager.h.f();
                   uoc.appendTag(k.a);
                   obj = uoc;
                   b.U(obj, "[onNewActivityRedPacketReceived] 红包过期", "isInAutoGrabing", Boolean.valueOf(k.v), "showDeadline", Long.valueOf(p0.showDeadline), "curServerTime", k.W.get());
                }else if(k.g == null && k.o.g()){
                   k.f("onNewActivityRedPacketReceived");
                   k.C();
                }
                String str = null;
                if (k.u != null) {
                   uoc1 = LiveRichCardStateManager.h.f();
                   uoc1.appendTag(k.a);
                   obj = uoc1;
                   Boolean uBoolean = Boolean.valueOf(k.u);
                   LiveRichCardCoreManager g = k.g;
                   if (g != null) {
                      str = g.a();
                   }
                   b.T(obj, "[onNewActivityRedPacketReceived] 红包过期", "hasRequestQueryInterface", uBoolean, "holder_Id", str);
                }else {
                   LiveTreasureBoxMessage$LiveTreasureBoxShow extraMessage = p0.extraMessage;
                   if (extraMessage != null) {
                      if (k.p(extraMessage)) {
                         d.a("收到可抢红包，查询暴富卡接口");
                         obj = LiveRichCardStateManager.h.f();
                         obj.appendTag(k.a);
                         b.T(obj, "[onNewActivityRedPacketReceived] 查询接口", "extraMessage", p0.extraMessage, "liveStream", k.U);
                         String str1 = p0.extraMessage.get("isBigRoom");
                         if (str1 != null) {
                            str = Boolean.valueOf(Boolean.parseBoolean(str1));
                         }
                         LiveTreasureBoxMessage$LiveTreasureBoxShow startShowTim = p0.startShowTime;
                         Long longx = (k.W.get().longValue() - startShowTim > 0)? k.W.get(): Long.valueOf(startShowTim);
                         long l = 0;
                         if (a.g(str, Boolean.TRUE)) {
                            a.o(longx, "startTime");
                            l1 = p0.grabTime - longx.longValue();
                            LiveRichCardCoreManager g1 = k.g;
                            if (g1 != null) {
                               Map map = g1.i();
                               if (map != null) {
                                  str = map.get("getAutoGrabCardInfoBeforeGrabTime");
                                  if (str != null) {
                                     l2 = Long.parseLong(str);
                                  }
                               }
                            }
                            l2 = l;
                         }else {
                            l1 = p0.autoShowTime;
                            a.o(longx, "startTime");
                            l2 = longx.longValue();
                         }
                         l1 = l1 - l2;
                         if (l1 - l >= 0) {
                            l = l1;
                         }
                         k.u = true;
                         k.w = p0;
                         uoc1 = LiveRichCardStateManager.d;
                         String str2 = extraMessage.get("activity_biz");
                         if (str2 == null) {
                            str2 = "";
                         }
                         LiveRichCardCoreManager u = k.U;
                         Objects.requireNonNull(uoc1);
                         if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidThreeRefs(str2, u, Long.valueOf(l), uoc1, c.class, "1")) {
                            a.p(str2, "activityBiz");
                            a.p(u, "liveStreamId");
                            b.a.a().e(str2, u).delaySubscription(x.B(l), TimeUnit.MILLISECONDS).map(new e()).observeOn(d.a).subscribe(new a(uoc1), b.b);
                         }
                      }else {
                         b.S(LiveRichCardStateManager.h.f().appendTag(k.a), "[onNewActivityRedPacketReceived]", "extraMessage", extraMessage);
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public t c(){
       return this.a.p;
    }
    public void d(int p0,j p1){
       f$c uoc = f$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "3")) {
          return;
       }
       this.a.s.put(Integer.valueOf(p0), p1);
       return;
    }
    public boolean e(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       f obj = PatchProxy.apply(objArray, this, f$c.class, "21");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a.K;
       boolean b = false;
       if (obj == null) {
          return b;
       }
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, LiveRichCardCoreManager.class, "13");
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          List list = LiveRichCardStateManager.h.f().appendTag(obj.a);
          boolean b2 = (!obj.k.b() && !obj.o.g())? true: false;
          b.S(list, "[shouldInterceptAutoShow]", "canAutoShow", Boolean.valueOf(b2));
          if (obj.k.b() || obj.o.g()) {
             b = 1;
          }
          b1 = b;
       }
       return b1;
    }
    public void f(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "19")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.a.O.D0();
       f$c ta = this.a;
       Objects.requireNonNull(ta);
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.TRUE, ta, uof, "6")) {
          ta.P8(new e(ta, p0, true));
       }
       c3.c(this.a.v, g.a);
       return;
    }
    public void g(DialogInterface$OnShowListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "14")) {
          return;
       }
       this.a.u.remove(p0);
       return;
    }
    public boolean h(String p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f obj = PatchProxy.applyOneRefs(p0, this, f$c.class, "20");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a.K;
       boolean b = false;
       if (obj == null) {
          return b;
       }
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, LiveRichCardCoreManager.class, "12");
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          c uoc = LiveRichCardStateManager.h.f();
          uoc.appendTag(obj.a);
          c uoc1 = uoc;
          LiveRichCardCoreManager g = obj.g;
          String str = (g != null)? g.a(): null;
          b.T(uoc1, "[canAutoGrab]", "redPacketId", p0, "holder_Id", str);
          if (p0 != null) {
             g = obj.g;
             if (g != null && (a.g(p0, g.a()) && obj.o.g())) {
                b = 1;
             }
          }
          b1 = b;
       }
       return b1;
    }
    public void i(String p0,boolean p1){
       f$c uoc = f$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "7")) {
          return;
       }
       if (this.a.S8()) {
          return;
       }
       this.a.v.Hh(p0, p1);
       return;
    }
    public void j(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$c.class, "5")) {
          return;
       }
       this.a.Z8(p0, p1);
       return;
    }
    public void k(String p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "9")) {
          return;
       }
       f k = this.a.K;
       if (k != null) {
          Objects.requireNonNull(k);
          Object obj = PatchProxy.applyOneRefs(p0, k, LiveRichCardCoreManager.class, "34");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(LiveRichCardStateManager.h.d() && (a.g("dismiss_from_condition", p0) && k.v != null)){
             b = true;
          }else {
             b = false;
          }
          if (b) {
          label_0047 :
             return;
          }
       }
       x.E(this.a.v);
       goto label_0047 ;
    }
    public void k4(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "6")) {
          return;
       }
       if (this.a.S8()) {
          return;
       }
       f v = this.a.v;
       Objects.requireNonNull(v);
       if (!PatchProxy.applyVoidOneRefs(p0, v, LiveRedPacketContainerDialogFragment.class, "9") && !TextUtils.isEmpty(p0)) {
          int currentItem = v.s.getCurrentItem();
          String str = v.y.get(currentItem).a();
          Iterator iterator = v.y.iterator();
          while (iterator.hasNext()) {
             f uof = iterator.next();
             if (TextUtils.equals(p0, uof.a())) {
                v.H.remove(Integer.valueOf(uof.g()));
                iterator.remove();
                if (q.f(v.y)) {
                   v.dismissAllowingStateLoss();
                   break ;
                }else {
                   v.w.A(v.y);
                   int i = v.Eh(str);
                   LiveRedPacketContainerDialogFragment s = v.s;
                   if (i < 0) {
                      i = Math.min(currentItem, (j.a(v.y) - 1));
                   }
                   s.setCurrentItem(i);
                   break ;
                }
             }
          }
       }
       return;
    }
    public void l(int p0){
       f$c uoc = f$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "4")) {
          return;
       }
       this.a.s.remove(Integer.valueOf(p0));
       return;
    }
    public List m(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       f$c obj = PatchProxy.apply(objArray, this, f$c.class, "18");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       ArrayList uArrayList = PatchProxy.apply(objArray, obj, f.class, "14");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          Iterator iterator = obj.q.iterator();
          while (iterator.hasNext()) {
             g og = iterator.next();
             if (!q.f(og.a())) {
                uArrayList.addAll(og.a());
             }
          }
          Collections.sort(uArrayList, new h0());
       }
       return uArrayList;
    }
    public void m5(DialogInterface$OnDismissListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "12")) {
          return;
       }
       this.a.t.remove(p0);
       return;
    }
    public void n(DialogInterface$OnShowListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "13")) {
          return;
       }
       this.a.u.add(p0);
       return;
    }
    public boolean p5(){
       f obj = PatchProxy.apply(null, this, f$c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.v;
       boolean b = (obj != null && obj.isAdded())? true: false;
       return b;
    }
    public void s3(DialogInterface$OnDismissListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "11")) {
          return;
       }
       this.a.t.add(p0);
       return;
    }
}
