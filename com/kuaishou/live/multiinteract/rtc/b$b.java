package com.kuaishou.live.multiinteract.rtc.b$b;
import lh3.a;
import com.kuaishou.live.multiinteract.rtc.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import oh3.f;
import com.kuaishou.live.multiinteract.rtc.a;
import com.kuaishou.live.multiinteract.rtc.RtcLeaveReason;
import java.util.ArrayList;
import java.util.Collection;
import lh3.g0;
import java.lang.Iterable;
import z1.a;
import oh3.b;
import java.util.Objects;
import kh3.b;
import kotlin.jvm.internal.a;
import lnc.i3;
import java.lang.Number;
import ih3.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatSwitchBiz;
import oh3.i;
import java.lang.Throwable;
import mh3.d$a;
import mh3.d;
import lh3.f0;
import android.os.SystemClock;

public class b$b implements a	// class@000d01
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1,String p2){
       RtcLeaveReason aRYA_STOP;
       String str;
       if (PatchProxy.isSupport(b$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, b$b.class, "3")) {
          return;
       }
       this.a.b.b("onEnterInteractRoomFailed", c.k(Integer.valueOf(p0), "biz", Integer.valueOf(p1), "reason"));
       b$b ta = this.a;
       b o = ta.o;
       if (o == null) {
          return;
       }
       ta.h = false;
       o.c();
       ta = this.a;
       if (p1 != 1) {
          aRYA_STOP = (p1 != 2)? RtcLeaveReason.ARYA_STOP: RtcLeaveReason.READY_FAIL;
       }else {
          aRYA_STOP = RtcLeaveReason.ARYA_STOP;
       }
       ta.y(aRYA_STOP);
       b.a(new ArrayList(this.a.c), new g0(p0, p1));
       b p = this.a.p;
       Objects.requireNonNull(p);
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p2, Integer.valueOf(p1), p, b.class, "2")) {
          a.p(p2, "chatId");
          i3 oi3 = i3.f();
          oi3.d("chatId", p2);
          oi3.c("biz", Integer.valueOf(p0));
          oi3.d("status", "FAIL");
          if (p1 != 1) {
             str = (p1 != 2)? "unknown": "ready_api_failed";
          }else {
             str = "arya_stop";
          }
          oi3.d("failReason", str);
          a.o(oi3, "builder");
          p.c.d(oi3);
       }
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "2")) {
          return;
       }
       this.a.b.a("onEnterInteractRoomSuccess");
       b$b ta = this.a;
       ta.h = false;
       b o = ta.o;
       if (o != null) {
          o.c();
       }
       if (TextUtils.x(p0)) {
          this.a.b.a("onEnterInteractRoomSuccess, switchPb is empty");
          return;
       }else {
          try{
             this.a.u(i.c(p0), "readyRequest");
          }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e3){
             this.a.b.d("parseToSwitchPb error", e3);
          }
          return;
       }
    }
    public void c(int p0){
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.a.b.c("onEnterMediaRoomSuccess", "biz", Integer.valueOf(p0));
       uob = this.a;
       uob.i = true;
       uob.n.f(uob.t);
       b.a(new ArrayList(this.a.c), new f0(p0));
       b p = this.a.p;
       Objects.requireNonNull(p);
       if (!PatchProxy.applyVoid(null, p, b.class, "3")) {
          p.b = SystemClock.elapsedRealtime();
       }
       return;
    }
}
