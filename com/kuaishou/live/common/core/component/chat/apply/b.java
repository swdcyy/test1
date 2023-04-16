package com.kuaishou.live.common.core.component.chat.apply.b;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService;
import lp3.a;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$c;
import crd.a;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.common.core.component.chat.apply.a;
import java.util.Map;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$State;
import mq5.b;
import lp3.c;
import lp3.e;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import rd1.z;
import xd1.e;
import xp5.g;
import brd.t;
import cjd.e;
import erd.o;
import sd1.c;
import sfc.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$b;
import java.util.Set;
import v51.a;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatUserApplyOpened;
import sd1.h;
import lf3.g;
import sd1.j;
import sd1.i;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatUserApplyClosed;
import sd1.g;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService$a;
import fa1.d;
import fa1.d$a;
import java.util.Iterator;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$a;
import java.lang.Integer;
import nw1.b;
import xp5.i;
import sd1.b;
import op1.d;
import kotlin.jvm.internal.a;
import d61.l0;
import kotlin.Pair;
import qrd.r0;
import trd.s0;
import op1.b;
import z1.a;

public abstract class b extends a implements LiveAudienceApplyChatService	// class@001035
{
    public final LiveAudienceApplyChatService$c d;
    public final a e;
    public boolean f;
    public g g;
    public LiveAudienceChatStatConfig h;
    public Throwable i;
    public boolean j;
    public a k;

    public void b(LiveAudienceApplyChatService$c p0){
       super();
       this.e = new a();
       this.d = p0;
    }
    public String G3(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyOneRefs(p0, this, b.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.k;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, a.class, "3");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = obj.f.get(p0);
       }
       return obj1;
    }
    public void Jb(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "8")) {
          return;
       }
       uob = this.k;
       Objects.requireNonNull(uob);
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uob, uoa, "7") && (p0 || (uob.b == LiveAudienceApplyChatService$State.APPLYING && !uob.g.a(b.class).U0())))) {
          b.Z(LiveLogTag.CHAT, "cancelApply");
          t ot = e.a().n(uob.d.getLiveStreamId()).map(new e());
          c uoc = new c(uob);
          a uoa1 = (p0)? new a(): Functions.d();
          ot.subscribe(uoc, uoa1);
       }
    label_0079 :
       return;
    }
    public void Od(LiveAudienceApplyChatService$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       b tk = this.k;
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoidOneRefs(p0, tk, a.class, "1")) {
          tk.c.add(p0);
       }
       return;
    }
    public void Qo(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.g = this.Po().a(g.class);
       this.k = new a(this.Po(), this.g);
       this.Po().a(uoa).u().u0(328, LiveStreamMessages$SCLiveChatUserApplyOpened.class, new h(this));
       this.e.c(this.d.a().subscribe(new j(this), new i(this)));
       this.Po().a(uoa).u().u0(329, LiveStreamMessages$SCLiveChatUserApplyClosed.class, new g(this));
       return;
    }
    public void Ro(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.e.dispose();
       b tk = this.k;
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoid(null, tk, a.class, "11")) {
          tk.e.dispose();
          tk.g.a(LiveAudienceChatService.class).Yg(tk);
          tk.g.a(d.class).tk(tk);
          tk.c.clear();
       }
       this.Jb(false);
       this.i = null;
       this.h = null;
       this.j = false;
       return;
    }
    public final void So(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "11")) {
          return;
       }
       b.c0(LiveLogTag.CHAT, "applySwitchChanged", "enable", Boolean.valueOf(p0));
       this.j = false;
       if (this.f != p0) {
          this.f = p0;
          Iterator iterator = this.k.c.iterator();
          while (iterator.hasNext()) {
             iterator.next().b6(p0);
          }
       }
       return;
    }
    public void ai(LiveAudienceApplyChatService$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       this.k.h = p0;
       return;
    }
    public void eb(LiveAudienceApplyChatService$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       b tk = this.k;
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoidOneRefs(p0, tk, a.class, "2")) {
          tk.c.remove(p0);
       }
       return;
    }
    public void gk(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "10")) {
          return;
       }
       b tk = this.k;
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, tk, a.class, "4")) {
          tk.f.put(p0, p1);
       }
       return;
    }
    public boolean isEnabled(){
       return this.f;
    }
    public LiveAudienceApplyChatService$State jh(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.b;
    }
    public void t8(int p0,String p1){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "6")) {
          return;
       }
       LiveLogTag cHAT = LiveLogTag.CHAT;
       String str = "applyChat";
       String str1 = "chatMediaType";
       b.c0(cHAT, str, str1, Integer.valueOf(p0));
       b tk = this.k;
       b = this.isEnabled();
       Objects.requireNonNull(tk);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(b), tk, a.class, "5")) {
          b.c0(cHAT, str, str1, Integer.valueOf(p0));
          if (p0 == 2) {
             uob = tk.g.a(b.class);
             c uoc = tk.g.a(i.class);
             b uob1 = new b(tk, p0, p1, b);
             if (!PatchProxy.applyVoidThreeRefs(uob, uoc, uob1, null, d.class, "1")) {
                a.p(uob, "guestPrettifyService");
                a.p(uoc, "logPackageService");
                a.p(uob1, "consumer");
                Object obj = PatchProxy.apply(null, null, d.class, "5");
                if (obj == PatchProxyResult.class) {
                   obj = l0.d("LiveMultiChatPrettifyDialogShowed").b(Boolean.FALSE);
                   a.o(obj, "SpVariable.ofBool\(SP_KEY¡­FIRM_PRETTIFY\).get\(false\)");
                }
                if (obj.booleanValue()) {
                   uob1.accept(Boolean.FALSE);
                }else {
                   d.c(uob, uoc, null, s0.k(r0.a("biz_type", String.valueOf(1))), uob1, null);
                }
             }
          }else {
             tk.b(p0, p1, b);
          }
       }
       return;
    }
}
