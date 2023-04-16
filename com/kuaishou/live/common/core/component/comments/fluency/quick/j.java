package com.kuaishou.live.common.core.component.comments.fluency.quick.j;
import te1.c;
import com.yxcorp.utility.SystemUtil;
import android.content.Context;
import lp3.e;
import hf3.a;
import g81.c;
import ft5.b;
import java.lang.Object;
import gf1.q;
import gf1.o;
import gf1.p;
import com.kuaishou.live.common.core.component.comments.fluency.quick.i;
import gf1.h;
import gf1.i;
import com.kuaishou.live.common.core.component.comments.fluency.quick.e;
import gf1.j;
import ok.x;
import com.kuaishou.live.common.core.component.comments.fluency.quick.a;
import java.lang.Class;
import lp3.c;
import vf1.a;
import bq5.h;
import i81.g;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gf1.l;
import com.kuaishou.live.common.core.component.comments.fluency.quick.a$a;
import vf1.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.livestream.message.nano.LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.google.common.base.Optional;
import v91.n;
import com.kuaishou.live.common.core.component.comments.fluency.quick.g;
import ok.h;
import java.lang.Long;
import te1.c$a;
import te1.d;
import java.util.Objects;
import v91.b;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Boolean;
import android.os.SystemClock;
import n91.f;
import java.util.Arrays;
import j21.b;
import com.kuaishou.live.common.core.component.comments.fluency.quick.f;
import gf1.m;
import gf1.n;
import com.kuaishou.live.common.core.component.comments.fluency.LiveCommentBottomMessageType;
import te1.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import bq5.f;
import lf3.g;

public class j implements c	// class@001093
{
    public final a a;
    public final e b;
    public final c c;
    public final b d;
    public final Context e;
    public final a f;
    public final a g;
    public final h h;
    public final g i;
    public c$a j;
    public final e k;
    public final q l;
    public boolean m;
    public final g n;
    public final g o;
    public final b p;
    public final Runnable q;
    public final Runnable r;
    public static final boolean s;

    static {
       j.s = SystemUtil.I();
    }
    public void j(Context p0,e p1,a p2,c p3,b p4,boolean p5){
       super();
       this.l = new q();
       this.n = new o(this);
       this.o = new p(this);
       i oi = new i(this);
       this.p = oi;
       this.q = new h(this);
       this.r = new i(this);
       this.e = p0;
       this.b = p1;
       this.a = p2;
       this.c = p3;
       this.d = p4;
       this.m = p5;
       this.k = new e(new j(this, p1));
       a uoa = p1.a(a.class);
       this.f = uoa;
       p2 = p1.a(a.class);
       this.g = p2;
       this.h = p1.a(h.class);
       this.i = p1.a(g.class);
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
       }else {
          uoa.Eg(new l(this));
          p2.Z9(oi);
       }
       return;
    }
    public static void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, j.class, "21")) {
          return;
       }
       if (j.s) {
          b.Z(LiveLogTag.LIVE_QUICK_COMMENT, p0);
       }
       return;
    }
    public static long i(LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return n.d(p0.bizId).transform(g.b).or(Long.valueOf(0x2710)).longValue();
    }
    public void a(c$a p0){
       this.j = null;
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "20")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_QUICK_COMMENT, "LiveQuickCommentMessagePool.breakCurrentShowingMessage", "reason", p0);
       j tl = this.l;
       q d = tl.d;
       tl.b();
       if (d == null || (!PatchProxy.applyVoidOneRefs(d, this, j.class, "17") && this.j != null)) {
          b.d0(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "onMessageRemoved#", "reason", "notifyMessageRemove", "message", d.toString());
          this.j.b(d);
       }
    label_0040 :
       return;
    }
    public void c(d p0){
       j oj = j.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oj, "14")) {
          return;
       }
       p0 = p0.d;
       if (p0 instanceof LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened) {
          b.c0(LiveLogTag.LIVE_QUICK_COMMENT, "LiveQuickCommentMessagePool.onConsumed", "msg", p0.bizId);
          j tk = this.k;
          LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened bizId = p0.bizId;
          Objects.requireNonNull(tk);
          if (!PatchProxy.applyVoidOneRefs(bizId, tk, e.class, "3")) {
             Optional optional = tk.a(bizId);
             if (optional.isPresent()) {
                optional.get().a();
             }
          }
          if (!PatchProxy.applyVoidOneRefs(p0, this, oj, "15")) {
             k1.m(this.r);
             k1.s(this.r, this, j.i(p0));
          }
       }
       return;
    }
    public d d(){
       boolean b1;
       Object obj = this;
       q oq = q.class;
       j oj = j.class;
       Object[] objArray = null;
       LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened obj1 = PatchProxy.apply(objArray, obj, oj, "8");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (obj.l.e()) {
          j.g("LiveQuickCommentMessagePool.pollOne, false - hasShowingComment");
          return objArray;
       }else {
          obj1 = obj.l.c();
          if (obj1 == null) {
             j.g("LiveQuickCommentMessagePool.pollOne, false - pendingMessage = null");
             return objArray;
          }else {
             j l = obj.l;
             Objects.requireNonNull(l);
             String str = "1";
             LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened obj2 = PatchProxy.apply(objArray, l, oq, str);
             boolean b = true;
             if (obj2 != PatchProxyResult.class) {
                b1 = obj2.booleanValue();
             }else if(l.a != null && SystemClock.elapsedRealtime() - l.b >= 0){
                b1 = true;
             }else {
                b1 = false;
             }
             if (!b1) {
                j.g("LiveQuickCommentMessagePool.pollOne, failed - pendingMessage not ready in time");
                return objArray;
             }else {
                Object obj3 = PatchProxy.applyOneRefs(obj1, obj, oj, "13");
                if (obj3 != PatchProxyResult.class) {
                   b = obj3.booleanValue();
                }else {
                   long l2 = obj.b.a(f.class).s();
                   LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened displayExpir = obj1.displayExpireTimestamp;
                   if (displayExpir - null > 0 && l2 - displayExpir >= 0) {
                      b.Z(LiveLogTag.LIVE_QUICK_COMMENT, "LiveQuickCommentMessagePool.isMessageInvalid, drop because expired");
                   }else if(!obj.f.Bc(obj1.triggerCondition)){
                      b.c0(LiveLogTag.LIVE_QUICK_COMMENT, "LiveQuickCommentMessagePool.isMessageInvalid, drop because condition not satisfied", "condition", Arrays.toString(obj1.triggerCondition));
                   }else {
                      l = obj.k;
                      obj2 = obj1.bizId;
                      Objects.requireNonNull(l);
                      Object obj5 = PatchProxy.applyOneRefs(obj2, l, e.class, str);
                      b1 = (obj5 != PatchProxyResult.class)? obj5.booleanValue(): l.a(obj2).transform(b.b).or(Boolean.FALSE).booleanValue();
                      if (!b1) {
                         b.Z(LiveLogTag.LIVE_QUICK_COMMENT, "LiveQuickCommentMessagePool.isMessageInvalid, drop because frequency limit");
                      }else {
                         b = false;
                      }
                   }
                }
                if (b) {
                   j.g("LiveQuickCommentMessagePool.pollOne, false - pendingMessageInvalid");
                   obj.l.a();
                   return objArray;
                }else {
                   b.c0(LiveLogTag.LIVE_QUICK_COMMENT, "LiveQuickCommentMessagePool.pollOne prepareToShow", "message", obj1);
                   l = obj.l;
                   long l1 = j.i(obj1);
                   f uof = PatchProxy.apply(objArray, obj, oj, "9");
                   if (uof != PatchProxyResult.class) {
                   }else {
                      f uof1 = new f(obj.e, obj.c, obj.d, obj.i, obj.m);
                      uof.b = new m(obj);
                      uof.c = new n(obj);
                   }
                   Objects.requireNonNull(l);
                   if (PatchProxy.isSupport(oq)) {
                      Object obj4 = PatchProxy.applyTwoRefs(Long.valueOf(l1), uof, l, oq, "3");
                      if (obj4 != PatchProxyResult.class) {
                         objArray = obj4;
                      }else {
                      label_0142 :
                         oq = l.a;
                         if (oq != null) {
                            l.c = oq;
                            l.a = objArray;
                            objArray = new d();
                            objArray.a = LiveCommentBottomMessageType.QuickMessage;
                            objArray.d = l.c;
                            objArray.c = false;
                            objArray.b = l1;
                            objArray.b(uof);
                            l.d = objArray;
                         }
                      }
                   }else {
                      goto label_0142 ;
                   }
                   return objArray;
                }
             }
          }
       }
    }
    public void e(c$a p0){
       this.j = p0;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       this.b("CLEAR_BY_BOTTOM_BUBBLE");
       this.l.a();
       k1.m(this.q);
       return;
    }
    public int getPriority(){
       return 1;
    }
    public final ClientContent$LiveStreamPackage h(){
       Object obj = PatchProxy.apply(null, this, j.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.a(i.class).a();
    }
    public final void j(LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "18")) {
          return;
       }
       LiveLogTag lIVE_QUICK_C = LiveLogTag.LIVE_QUICK_COMMENT;
       b.d0(lIVE_QUICK_C, "LiveQuickCommentMessagePool.handleQuickCommentOpened", "message", p0.bizId, "delayDurationMs", Long.valueOf(p0.delayDisplayMs));
       LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened sCLiveQuickC = this.l.d();
       if (sCLiveQuickC != null) {
          if (p0.priority - sCLiveQuickC.priority > 0) {
             this.b("BreakByHighPriorityMessage: "+p0.bizId);
          }
          if (TextUtils.n(p0.bizId, sCLiveQuickC.bizId)) {
             this.b("ReplaceBySameBiz: "+p0.bizId);
          }
       }
       sCLiveQuickC = this.l.c();
       if (sCLiveQuickC != null) {
          LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened priority = sCLiveQuickC.priority;
          if (p0.priority - priority >= 0) {
          label_008b :
             b.Z(lIVE_QUICK_C, "LiveQuickCommentMessagePool.handleQuickCommentOpened, update pending message");
             j tl = this.l;
             Objects.requireNonNull(tl);
             if (!PatchProxy.applyVoidOneRefs(p0, tl, q.class, "2")) {
                tl.a = p0;
                tl.b = SystemClock.elapsedRealtime() + p0.delayDisplayMs;
             }
             LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened delayDisplay = p0.delayDisplayMs;
             if (delayDisplay > 0) {
                k1.s(this.q, this, delayDisplay);
             }else {
                this.k();
             }
          }else {
             b.d0(lIVE_QUICK_C, "LiveQuickCommentMessagePool.handleQuickCommentOpened drop message, because low priority", "pendingMsg.priority", Long.valueOf(priority), "newMsg.priority", Long.valueOf(p0.priority));
          }
       }else {
          goto label_008b ;
       }
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, j.class, "16")) {
          return;
       }
       if (this.h.t3() != null) {
          this.f();
          return;
       }else {
          j tj = this.j;
          if (tj != null) {
             tj.a();
          }
          return;
       }
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "4")) {
          return;
       }
       this.a.o(954, this.n);
       this.a.o(955, this.o);
       k1.n(this);
       this.l.b();
       this.l.a();
       this.f.Eg(objArray);
       this.g.uh(this.p);
       return;
    }
}
