package com.kuaishou.live.multiinteract.rtc.b;
import lh3.b;
import lh3.c;
import hf3.a;
import mh3.d;
import gh3.a;
import ih3.b;
import yg3.a;
import java.lang.Object;
import crd.a;
import oh3.f;
import java.lang.String;
import java.util.ArrayList;
import lh3.d;
import lh3.n;
import com.kuaishou.live.multiinteract.rtc.b$a;
import com.kuaishou.live.multiinteract.rtc.b$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import lf3.g;
import lh3.l;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatSwitchBiz;
import lh3.d0;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatUserLeaveInfo;
import lh3.e0;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatClosed;
import lh3.m;
import kh3.b;
import java.lang.Throwable;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.Collection;
import lh3.v;
import java.lang.Iterable;
import z1.a;
import oh3.b;
import lh3.c0;
import nh3.a;
import lh3.y;
import nh3.b;
import lh3.x;
import java.util.List;
import java.util.Iterator;
import nh3.c;
import com.kwai.framework.model.user.UserInfo;
import lh3.z;
import com.kuaishou.live.multiinteract.rtc.RtcLeaveReason;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import ekd.j;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import oh3.i;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatRoomInfo;
import lh3.h;
import brd.t;
import lh3.h$a;
import cjd.e;
import erd.o;
import lh3.o;
import lh3.p;
import erd.g;
import crd.b;
import androidx.lifecycle.LiveData;
import lh3.t;
import lh3.r;
import android.text.TextUtils;
import lh3.i0;
import lh3.g;
import gh3.c;
import mh3.d$a;
import com.kuaishou.live.multiinteract.rtc.a;
import lh3.s;
import lh3.q;
import lh3.a;
import yg3.a$c;
import gh3.a$a;
import lh3.k;
import android.os.SystemClock;
import java.lang.StringBuilder;
import com.kuaishou.live.multiinteract.rtc.RtcCloseReason;
import java.lang.Number;
import com.google.common.base.Optional;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatSwitchBizExtraInfo;
import lh3.b0;
import lh3.a0;
import kotlin.jvm.internal.a;
import lnc.i3;
import kh3.a;
import java.lang.Enum;
import ok.k;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatLayoutConfig;
import lh3.w;
import lh3.u;

public class b implements b, c	// class@000d02
{
    public final a a;
    public final f b;
    public final List c;
    public g d;
    public g e;
    public g f;
    public g g;
    public boolean h;
    public boolean i;
    public final d j;
    public int k;
    public final a l;
    public final a m;
    public final d n;
    public a o;
    public final b p;
    public final a q;
    public g r;
    public final c s;
    public final d$a t;
    public final a u;
    public static final boolean v;

    public void b(a p0,d p1,a p2,b p3,a p4){
       super();
       this.a = new a();
       this.b = new f("LiveInteractRtcManager");
       this.c = new ArrayList();
       this.h = false;
       this.i = false;
       this.j = new d();
       this.s = new n(this);
       this.t = new b$a(this);
       this.u = new b$b(this);
       this.m = p0;
       this.n = p1;
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, uob, "1")) {
       }else {
          int i = 943;
          SCInteractiveChatRoomInfo sCInteractiv = SCInteractiveChatRoomInfo.class;
          l ol = PatchProxy.apply(null, this, uob, "3");
          if (ol != PatchProxyResult.class) {
          }else {
             ol = new l(this);
             this.d = ol;
          }
          p0.u0(i, sCInteractiv, ol);
          i = 944;
          SCInteractiveChatSwitchBiz sCInteractiv1 = SCInteractiveChatSwitchBiz.class;
          d0 uod0 = PatchProxy.apply(null, this, uob, "4");
          if (uod0 != PatchProxyResult.class) {
          }else {
             uod0 = new d0(this);
             this.e = uod0;
          }
          p0.u0(i, sCInteractiv1, uod0);
          i = 775;
          SCInteractiveChatUserLeaveInfo sCInteractiv2 = SCInteractiveChatUserLeaveInfo.class;
          e0 uoe0 = PatchProxy.apply(null, this, uob, "5");
          if (uoe0 != PatchProxyResult.class) {
          }else {
             uoe0 = new e0(this);
             this.f = uoe0;
          }
          p0.u0(i, sCInteractiv2, uoe0);
          m om = PatchProxy.apply(null, this, uob, "6");
          if (om != PatchProxyResult.class) {
          }else {
             om = new m(this);
             this.g = om;
          }
          p0.u0(776, SCInteractiveChatClosed.class, om);
       }
       this.l = p2;
       this.p = new b(p3);
       this.q = p4;
       return;
    }
    public final void A(int p0,boolean p1,Throwable p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, this, b.class, "19")) {
          return;
       }
       b.a(new ArrayList(this.c), new v(p0, p1, p2));
       return;
    }
    public final void B(boolean p0,Throwable p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "16")) {
          return;
       }
       b.a(new ArrayList(this.c), new c0(p0, p1));
       return;
    }
    public final void C(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "42")) {
          return;
       }
       this.b.c("notifyLeave", "leaveInfo", p0);
       b.a(new ArrayList(this.c), new y(p0));
       return;
    }
    public final void D(b p0,b p1){
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "23")) {
          return;
       }
       SCInteractiveChatRoomInfo sCInteractiv = this.j.f();
       if (!PatchProxy.applyVoidOneRefs(sCInteractiv, this, uob, "40")) {
          this.b.c("notifyRoomInfo", "roomInfo", sCInteractiv);
          b.a(new ArrayList(this.c), new x(this, sCInteractiv));
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "27")) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p1.f().iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next();
             if (p0 == null || !p0.f().contains(uoc)) {
                uArrayList.add(uoc);
             }
          }
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             c uoc1 = iterator1.next();
             this.b.c("onEnterRoom", "userId", uoc1.c().mId);
             b.a(new ArrayList(this.c), new z(uoc1));
          }
       }
       return;
    }
    public final void E(SCInteractiveChatUserLeaveInfo p0,RtcLeaveReason p1){
       int i;
       SCInteractiveChatUserLeaveInfo roomInfo;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "28")) {
          return;
       }
       this.b.b("onReceiveLeaveInfo", c.k("localLeaveSourceReason", p1.getDescription(), "leaveInfoPb", p0));
       if (j.h(p0.userInfo)) {
          return;
       }
       if (p0.bizIdentity == null || !TextUtils.n(this.f(), p0.bizIdentity.chatId)) {
          this.b.a("onReceiveLeaveInfo roomInfo is null");
          return;
       }else if(this.j.d() != null){
          SCInteractiveChatUserLeaveInfo leaveInfoVer = p0.leaveInfoVersion;
          if (this.j.d().a() - leaveInfoVer >= 0) {
             this.b.b("onReceiveLeaveInfo, version invalid", c.k("version", Long.valueOf(leaveInfoVer), "curVersion", Long.valueOf(this.j.d().a())));
             return;
          }
       }
       SCInteractiveChatUserLeaveInfo userInfo = p0.userInfo;
       Object obj = null;
       d obj1 = PatchProxy.applyOneRefs(userInfo, obj, i.class, "2");
       i = 0;
       if (obj1 != PatchProxyResult.class) {
       }else {
          int len = userInfo.length;
          InteractiveChatUserInfoIdentity interactiveC = obj;
          int i1 = 0;
          while (i1 < len) {
             object oobject = userInfo[i1];
             if ((QCurrentUser.me().getId()).equals(String.valueOf(oobject.userInfo.userId))) {
                interactiveC = oobject.sessionId;
             }
             i1 = i1 + 1;
          }
          obj1 = interactiveC;
       }
       if (!TextUtils.x(obj1) && !TextUtils.n(obj1, this.I1(QCurrentUser.me().getId()))) {
          this.b.b("onReceiveLeaveInfo, session invalid", c.k("roomInfoSelfSession", this.I1(QCurrentUser.me().getId()), "leaveInfoSelfSession", obj1));
          return;
       }else {
          b tj = this.j;
          SCInteractiveChatUserLeaveInfo leaveInfoVer1 = p0.leaveInfoVersion;
          SCInteractiveChatUserLeaveInfo leaveReason = p0.leaveReason;
          SCInteractiveChatUserLeaveInfo userInfo1 = p0.userInfo;
          SCInteractiveChatUserLeaveInfo extraInfo = p0.extraInfo;
          Objects.requireNonNull(tj);
          obj1 = d.class;
          if (PatchProxy.isSupport(obj1)) {
             Object[] objArray = new Object[]{Long.valueOf(leaveInfoVer1),p1,Integer.valueOf(leaveReason),userInfo1,extraInfo};
             if (PatchProxy.applyVoid(objArray, tj, obj1, "3")) {
             label_011f :
                roomInfo = p0.roomInfo;
                if (roomInfo != null) {
                   InteractiveChatRoomInfo bizIdentity = roomInfo.bizIdentity;
                   if (bizIdentity != null && !TextUtils.x(bizIdentity.chatId)) {
                      p0 = p0.roomInfo;
                   label_0133 :
                      this.t(p0, obj, "leaveInfo");
                      this.C(this.j.d());
                      return;
                   }
                }
                p0 = obj;
                goto label_0133 ;
             }
          }
          a uoa = new a(leaveInfoVer1, p1, leaveReason, userInfo1, extraInfo);
          tj.c = obj1;
          goto label_011f ;
       }
    }
    public String I1(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.g(p0);
    }
    public void K(List p0){
       t ot;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "15")) {
          return;
       }
       this.b.c("forceLeaveAction", "userIdList", p0);
       int i = this.j.c();
       String str = this.f();
       if (PatchProxy.isSupport(h.class)) {
          ot = PatchProxy.applyFourRefs(Integer.valueOf(i), str, p0, null, null, h.class, "4");
          if (ot != PatchProxyResult.class) {
          label_004e :
             this.a.c(this.b.f(ot.map(new e()), "forceLeave").subscribe(new o(this), new p(this)));
             return;
          }
       }
       ot = h.a().c(i.a("n/live/interactiveChat/forceLeave", i), i, str, p0, null);
       goto label_004e ;
    }
    public boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.n.a(p0);
    }
    public SCInteractiveChatRoomInfo b(){
       Object obj = PatchProxy.apply(null, this, b.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.f();
    }
    public LiveData c(){
       Object obj = PatchProxy.apply(null, this, b.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.a;
    }
    public void d(int p0,String p1,String p2){
       t ot;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, b.class, "18")) {
          return;
       }
       this.b.b("switchBizAction v2", c.l("currentBiz", Integer.valueOf(this.j.c()), "targetBiz", Integer.valueOf(p0), "chatId", this.f()));
       b ta = this.a;
       b tb = this.b;
       int i = this.j.c();
       String str = this.f();
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{Integer.valueOf(i),Integer.valueOf(p0),str,p1,p2};
          ot = PatchProxy.apply(objArray, null, oh, "6");
          if (ot != PatchProxyResult.class) {
          label_008c :
             ta.c(tb.f(ot.map(new e()), "switchBiz").subscribe(new t(this, p0), new r(this, p0)));
             return;
          }
       }
       ot = h.a().b(i.a("n/live/interactiveChat/switchBiz", i), i, p0, str, p1, p2);
       goto label_008c ;
    }
    public void destroy(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "46")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "2")) {
          this.m.o(943, this.d);
          this.m.o(944, this.e);
          this.m.o(775, this.f);
          this.m.o(776, this.g);
       }
       this.k();
       this.c.clear();
       this.k = -1;
       this.h = false;
       uob = this.p;
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoid(objArray, uob, b.class, "9")) {
          uob.d();
       }
       return;
    }
    public boolean e(String p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyOneRefs(p0, this, b.class, "30");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.j;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, d.class, "4");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(!TextUtils.isEmpty(p0)){
          d b1 = obj.b;
          if (b1 != null) {
             Iterator iterator = b1.f().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if (p0.equals(iterator.next().c().mId)) {
                      b = true;
                      break ;
                   }
                }
             }
          }
       }
       b = false;
       return b;
    }
    public String f(){
       Object obj = PatchProxy.apply(null, this, b.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.b();
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "12")) {
          return;
       }
       this.z(RtcLeaveReason.INITIATIVE_LEAVE, p0);
       return;
    }
    public String getBizId(){
       Object obj = PatchProxy.apply(null, this, b.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.a();
    }
    public void h(i0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       this.c.remove(p0);
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, b.class, "47")) {
          return;
       }
       this.j.h();
       return;
    }
    public void j(g p0){
       this.r = p0;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, b.class, "43")) {
          return;
       }
       this.b.a("leaveMediaRoom");
       this.l.d(this.k);
       this.l.c(this.s);
       this.n.e(this.t);
       b to = this.o;
       if (to != null) {
          to.d();
          this.o.c();
          to = this.o;
          Objects.requireNonNull(to);
          if (!PatchProxy.applyVoid(null, to, a.class, "2")) {
             to.b.d(to.f);
          }
          this.o = null;
       }
       this.i = false;
       this.a.d();
       return;
    }
    public void l(String p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "29")) {
          return;
       }
       this.n.h(p0, p1);
       return;
    }
    public void m(i0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       this.c.remove(p0);
       this.c.add(p0);
       return;
    }
    public void n(int p0,String p1){
       t ot;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "17")) {
          return;
       }
       this.b.b("switchBizAction", c.l("currentBiz", Integer.valueOf(this.j.c()), "targetBiz", Integer.valueOf(p0), "chatId", this.f()));
       uob = this.a;
       b tb = this.b;
       int i = this.j.c();
       String str = this.f();
       if (PatchProxy.isSupport(h.class)) {
          ot = PatchProxy.applyFourRefs(Integer.valueOf(i), Integer.valueOf(p0), str, p1, null, h.class, "5");
          if (ot != PatchProxyResult.class) {
          label_0079 :
             uob.c(tb.f(ot.map(new e()), "switchBiz").subscribe(new s(this, p0), new q(this, p0)));
             return;
          }
       }
       ot = h.a().a(i.a("n/live/interactiveChat/switchBiz", i), i, p0, str, p1);
       goto label_0079 ;
    }
    public void o(String p0,int p1,String p2,String p3){
       a$a uoa;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, b.class, "9")) {
          return;
       }
       this.b.b("enterRoomAction", c.l(Integer.valueOf(p1), "biz", p2, "chatId", "sessionId", p3));
       if (this.h != null || this.i != null) {
          this.b.a("enterRoomAction fail, processing enter room = "+this.h+" or in media room = "+this.i);
          return;
       }else {
          this.h = true;
          this.o = new a(this.n, this.u, this.p, this.q.b);
          this.l.b(this.s);
          b tl = this.l;
          if (PatchProxy.isSupport(uob)) {
             uoa = PatchProxy.applyThreeRefs(p2, p3, Integer.valueOf(p1), this, b.class, "10");
             if (uoa != PatchProxyResult.class) {
             label_0080 :
                tl.a(uoa);
                this.k = p1;
                b.a(new ArrayList(this.c), new k(p1));
                uob = this.o;
                Objects.requireNonNull(uob);
                if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, uob, a.class, "1")) {
                   uob.g = p1;
                   uob.h = p2;
                   uob.i = p3;
                   p2 = i.d(p1);
                   uob.f = p2;
                   uob.b.c(p0, p2, p1);
                }
                b tp = this.p;
                Objects.requireNonNull(tp);
                if (!PatchProxy.applyVoid(null, tp, b.class, "4")) {
                   tp.a = SystemClock.elapsedRealtime();
                }
                return;
             }
          }
          uoa = new a$a();
          uoa.a = p1;
          uoa.d = p3;
          uoa.c = p2;
          goto label_0080 ;
       }
    }
    public void p(RtcCloseReason p0){
       SCInteractiveChatClosed sCInteractiv;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "44")) {
          return;
       }
       int i = this.r();
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          sCInteractiv = PatchProxy.applyOneRefs(Integer.valueOf(i), null, oi, "5");
          if (sCInteractiv != PatchProxyResult.class) {
          label_0037 :
             this.v(sCInteractiv, p0);
             return;
          }
       }
       sCInteractiv = new SCInteractiveChatClosed();
       InteractiveChatBizIdentity interactiveC = new InteractiveChatBizIdentity();
       sCInteractiv.bizIdentity = interactiveC;
       interactiveC.bizType = i;
       goto label_0037 ;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, b.class, "11")) {
          return;
       }
       this.y(RtcLeaveReason.INITIATIVE_LEAVE);
       return;
    }
    public final int r(){
       b obj = PatchProxy.apply(null, this, b.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.j.c();
       if (i) {
          return i;
       }
       obj = this.o;
       i = (obj == null)? 0: obj.a();
       return i;
    }
    public final String s(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, b.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j.g(QCurrentUser.me().getId());
       if (!TextUtils.x(obj)) {
          return obj;
       }
       b to = this.o;
       if (to != null) {
          objArray = to.i;
       }
       return objArray;
    }
    public final void t(InteractiveChatRoomInfo p0,String p1,String p2){
       boolean b;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "22")) {
          return;
       }
       this.b.b("handle room info start", c.k("source", p2, "roomInfo", p0));
       p2 = PatchProxy.applyOneRefs(p0, this, b.class, "25");
       if (p2 != PatchProxyResult.class) {
          b = p2.booleanValue();
       }else {
          b = this.x(p0);
          if (p0 != null && (!b || !TextUtils.n(this.f(), p0.bizIdentity.chatId))) {
             InteractiveChatBizIdentity interactiveC = (p0 == null)? null: p0.bizIdentity.chatId;
             this.b.b("handle room info fail", c.k("failedReason", interactiveC, "isRoomLayoutConfigValid", Boolean.valueOf(b)));
             b = false;
          }else {
             b = this.w(p0);
          }
       }
       if (!b) {
          return;
       }else {
          this.j.i(p0, p1);
          this.D(this.j.e(), this.j.e());
          return;
       }
    }
    public void u(SCInteractiveChatSwitchBiz p0,String p1){
       boolean b;
       b obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "21")) {
          return;
       }
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, uob, "20");
       b = (obj != patchProxyRe)? obj.booleanValue(): this.q.a;
       String str = "";
       String str1 = Optional.fromNullable(this.j.b()).or(str);
       this.b.c("handleSwitchBiz", str, "source:"+p1+"\nswitchBizPb:"+p0+"\ncurrentBiz:"+this.j.c()+"\ncurrentChatId:"+str1+"\ncurrentSwitchBizVersion:"+this.j.f+"\nenableVersion:"+b+"\n");
       if (b != null && str1.equals(p0.roomInfo.bizIdentity.chatId)) {
          p1 = (p0.version - this.j.f > 0)? 1: null;
          if (!p1) {
             this.b.a("handle switch biz fail, version invalid");
             return;
          }
       }
    label_00a7 :
       SCInteractiveChatSwitchBiz roomInfo = p0.roomInfo;
       if (roomInfo != null) {
          obj = this.r;
          if (obj != null && obj.a(roomInfo)) {
             this.b.a("handle switch biz fail, BizInterceptor intercepted");
             return;
          }
       }
       if (this.j.e() != null) {
          InteractiveChatSwitchBizExtraInfo bizId = p0.startExtraInfo.bizId;
          String str2 = this.j.a();
          obj1 = PatchProxy.applyTwoRefs(bizId, str2, objArray, i.class, "1");
          boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): bizId.equals(str2);
          if (b1) {
             this.b.b("handle switch biz fail, biz illegal", c.k("current bizId", this.j.a(), "start bizId", p0.startExtraInfo.bizId));
             this.t(p0.roomInfo, objArray, "switchBizIllegal");
             return;
          }
       }
       b uob1 = this.j.e();
       boolean b2 = this.w(p0.roomInfo);
       b = this.x(p0.roomInfo);
       if (b2 && b) {
          obj1 = this.j;
          obj1.e = objArray;
          obj1.i(p0.roomInfo, objArray);
       }
       this.j.f = p0.version;
       if (!PatchProxy.applyVoidOneRefs(p0, this, uob, "41")) {
          this.b.a("notifyBizChanged");
          b.a(new ArrayList(this.c), new b0(p0));
       }
       if (b2 && b) {
          this.D(uob1, this.j.e());
       }
       return;
    }
    public void v(SCInteractiveChatClosed p0,RtcCloseReason p1){
       boolean b;
       b tb;
       String description;
       int i;
       b tp;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "45")) {
          return;
       }
       b = true;
       if (this.i == null && this.j.e() == null) {
          tb = this.b;
          description = p1.getDescription();
          Boolean uBoolean = Boolean.valueOf(this.i);
          if (this.j.e() == null) {
             b = false;
          }
          tb.b("interactRoomDestroy fail", c.l("reason", description, "isInMediaRoom", uBoolean, "hasRoomInfo", Boolean.valueOf(b)));
          return;
       }else {
          description = "reason";
          this.b.b("onRTCRoomClosed", c.k(description, p1.getDescription(), "closeMsg", p0));
          b.a(new ArrayList(this.c), new a0(p0, p1));
          if (this.j.c()) {
             i = this.j.c();
          }else {
             tb = this.o;
             i = (tb != null)? tb.a(): 0;
          }
          String str = null;
          if (!TextUtils.x(this.f())) {
             str = this.f();
          }else {
             tp = this.o;
             if (tp != null) {
                str = tp.b();
             }
          }
          tp = this.p;
          boolean b1 = this.a(QCurrentUser.me().getId());
          String bizId = this.getBizId();
          boolean b2 = (this.j.f() != null)? true: false;
          Objects.requireNonNull(tp);
          if (PatchProxy.isSupport(b.class)) {
             Object[] objArray = new Object[]{Boolean.valueOf(b1),Integer.valueOf(i),bizId,str,p1,Boolean.valueOf(b2)};
             if (PatchProxy.applyVoid(objArray, tp, b.class, "5")) {
             label_015e :
                this.k();
                this.j.h();
                this.h = false;
                this.k = -1;
                return;
             }
          }
          a.p(p1, description);
          if (b1) {
             i3 oi3 = i3.f();
             oi3.d("chatId", str);
             oi3.d("bizId", bizId);
             oi3.c("biz", Integer.valueOf(i));
             String str1 = PatchProxy.applyOneRefs(p1, tp, b.class, "10");
             if (str1 != PatchProxyResult.class) {
             }else {
                switch (a.a[p1.ordinal()]){
                    case 1:
                      str1 = "clean_up";
                      break;
                    case 2:
                    case 3:
                      str1 = "initiative_leave";
                      break;
                    case 4:
                      str1 = "arya_stop";
                      break;
                    case 5:
                      str1 = "force_leave";
                      break;
                    case 6:
                      str1 = "room_closed";
                      break;
                    case 7:
                      str1 = "ready_api_failed";
                      break;
                    case 8:
                      str1 = "room_closed_heartbeat_error";
                      break;
                    default:
                      str1 = "unknown";
                }
             }
             oi3.d("leaveReason", str1);
             oi3.c("hasRoomInfo", Integer.valueOf(b2));
             tb = tp.c;
             String str2 = "builder";
             a.o(oi3, str2);
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidOneRefs(oi3, tb, b.class, "5")) {
                a.p(oi3, str2);
                tb.a("LIVE_INTERACT_LEAVE_ROOM", oi3);
             }
          }
          tp.d();
          goto label_015e ;
       }
    }
    public final boolean w(InteractiveChatRoomInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.j.e() != null && (p0 != null && k.a(this.j.e().c(), p0.bizIdentity.chatId))) {
          InteractiveChatRoomInfo version = p0.version;
          if (this.j.e().g() - version > 0) {
             this.b.b("handle room info fail, version invalid", c.k("version", Long.valueOf(version), "curVersion", Long.valueOf(this.j.e().g())));
             return false;
          }
       }
       return true;
    }
    public final boolean x(InteractiveChatRoomInfo p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          p0 = p0.layoutConfig;
          if (p0 != null && !j.h(p0.windowInfo)) {
             b = true;
          label_0024 :
             this.b.b("isRoomLayoutConfigValid", c.j("isRoomLayoutConfigValid", Boolean.valueOf(b)));
             return b;
          }
       }
       b = false;
       goto label_0024 ;
    }
    public void y(RtcLeaveReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "13")) {
          return;
       }
       this.z(p0, null);
       return;
    }
    public final void z(RtcLeaveReason p0,String p1){
       t ot;
       b uob = this;
       Object obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob1 = b.class;
       if (PatchProxy.applyVoidTwoRefs(obj, p1, this, uob1, "14")) {
          return;
       }
       uob.b.c("leaveRoomAction", "localLeaveSourceReason", p0.getDescription());
       String str = this.s();
       int i = this.r();
       Object[] objArray = null;
       String str1 = PatchProxy.apply(objArray, this, uob1, "33");
       if (str1 != patchProxyRe) {
       }else if(!TextUtils.x(this.f())){
          str1 = this.f();
       }else {
          uob1 = uob.o;
          if (uob1 != null) {
             objArray = uob1.b();
          }
          str1 = objArray;
       }
       String str2 = this.s();
       if (PatchProxy.isSupport(h.class)) {
          ot = PatchProxy.applyFourRefs(Integer.valueOf(i), str1, str2, p1, null, h.class, "3");
          if (ot != patchProxyRe) {
          label_0081 :
             uob.a.c(uob.b.f(ot.map(new e()), "leaveRoom").subscribe(new w(this, str, obj), new u(this, str, obj)));
             return;
          }
       }
       ot = h.a().d(i.a("n/live/interactiveChat/leave", i), i, str1, str2, p1);
       goto label_0081 ;
    }
}
