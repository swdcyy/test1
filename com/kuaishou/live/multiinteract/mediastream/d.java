package com.kuaishou.live.multiinteract.mediastream.d;
import hh3.d;
import oh3.a;
import hf3.a;
import lh3.b;
import crd.a;
import com.kuaishou.live.multiinteract.mediastream.d$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatInfoUpdate;
import com.kwai.robust.PatchProxyResult;
import lf3.g;
import hh3.i;
import com.kuaishou.live.multiinteract.rtc.b;
import lh3.i0;
import java.lang.Integer;
import hh3.a;
import brd.t;
import hh3.a$a;
import oh3.i;
import cjd.e;
import erd.o;
import com.kuaishou.live.multiinteract.mediastream.b;
import com.kuaishou.live.multiinteract.mediastream.c;
import erd.g;
import crd.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;
import java.util.Map;
import java.lang.Boolean;
import java.lang.Long;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import java.util.Set;
import java.util.Iterator;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserCommonInfo;
import java.lang.StringBuilder;
import hh3.f;
import z1.a;
import hh3.c;
import java.util.List;
import zk.d;
import com.google.gson.Gson;
import hh3.j;
import com.kuaishou.live.multiinteract.mediastream.a;

public class d extends a implements d	// class@000cfb
{
    public final a b;
    public final a c;
    public final b d;
    public long e;
    public SCInteractiveChatInfoUpdate f;
    public g g;
    public final i0 h;
    public static final boolean i;

    public void d(a p0,b p1){
       super();
       this.b = new a();
       this.e = -1;
       d$a uoa = new d$a(this);
       this.h = uoa;
       this.c = p0;
       this.d = p1;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "1")) {
       }else {
          i oi = PatchProxy.apply(objArray, this, uod, "4");
          if (oi != PatchProxyResult.class) {
          }else {
             oi = new i(this);
             this.g = oi;
          }
          p0.u0(873, SCInteractiveChatInfoUpdate.class, oi);
       }
       p1.m(uoa);
       return;
    }
    public void D(int p0,String p1,int p2){
       t ot;
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), this, d.class, "9")) {
          return;
       }
       d tb = this.b;
       String str = this.d.f();
       if (PatchProxy.isSupport(a.class)) {
          ot = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), str, null, a.class, "3");
          if (ot != PatchProxyResult.class) {
          label_0059 :
             tb.c(ot.map(new e()).subscribe(new b(this), new c(this)));
             return;
          }
       }
       ot = a.a().b(i.a("n/live/interactiveChat/switchMediaType", p0), p0, p1, p2, str);
       goto label_0059 ;
    }
    public final void S(SCInteractiveChatInfoUpdate p0){
       InteractiveChatBizIdentity chatId;
       boolean b;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "7")) {
          return;
       }
       LiveLogTag lIVE_MULTI_I = LiveLogTag.LIVE_MULTI_INTERACT;
       String str = "ChatInfoUpdate";
       b.c0(lIVE_MULTI_I, str, "ChatInfoUpdate pb", p0);
       SCInteractiveChatInfoUpdate bizIdentity = p0.bizIdentity;
       if (bizIdentity != null) {
          chatId = bizIdentity.chatId;
          if (chatId != null && chatId.equals(this.d.f())) {
             bizIdentity = p0.userCommonInfos;
             if (bizIdentity != null && bizIdentity.size()) {
                Iterator obj = PatchProxy.applyOneRefs(p0, this, uod, "8");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else {
                   bizIdentity = p0.version;
                   if (bizIdentity - this.e < 0) {
                      b.a0(lIVE_MULTI_I, str, c.k("pbVersion", Long.valueOf(bizIdentity), "currentVersion", Long.valueOf(this.e)));
                      b = true;
                   }else {
                      this.e = bizIdentity;
                      b = false;
                   }
                }
                if (b) {
                   return;
                }else {
                   obj = p0.userCommonInfos.keySet().iterator();
                   while (obj.hasNext()) {
                      String str1 = obj.next();
                      InteractiveChatUserCommonInfo interactiveC = p0.userCommonInfos.get(str1);
                      if (interactiveC != null) {
                         b.Z(LiveLogTag.LIVE_MULTI_INTERACT, "mute media user id = "+str1+"mute media state = "+interactiveC.muteState);
                         this.d.l(str1, interactiveC.muteState);
                      }
                   }
                   this.f = p0;
                   this.Q(new f(p0));
                   return;
                }
             }
          }
       }
       b.Z(lIVE_MULTI_I, "mute signal current chatId = "+this.d.f());
       return;
    }
    public void g(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       this.R(p0);
       return;
    }
    public SCInteractiveChatInfoUpdate q(){
       return this.f;
    }
    public t v(String p0,int p1,String p2,List p3){
       d obj;
       t ot;
       if (PatchProxy.isSupport(d.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, this, d.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new d();
       obj.c();
       String str = obj.b().q(p3);
       b.Z(LiveLogTag.LIVE_MULTI_INTERACT, "LiveInteractMediaProcessor:"+str);
       String str1 = this.d.f();
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,str,str1};
          ot = PatchProxy.apply(objArray, null, uoa, "2");
          if (ot != PatchProxyResult.class) {
          label_0086 :
             return ot.map(new e()).doOnNext(new j(this)).doOnError(new a(this));
          }
       }
       ot = a.a().a(i.a("n/live/interactiveChat/muteOrUnmute", p1), p0, p1, p2, str, str1);
       goto label_0086 ;
    }
    public void z(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.O(p0);
       return;
    }
}
