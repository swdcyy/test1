package hx0.b;
import vb1.b;
import vb1.e;
import java.util.HashSet;
import hx0.b$c;
import hx0.b$b;
import hx0.b$a;
import vb1.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import o63.d;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import p63.a;
import p63.a$a;
import p63.a$b;
import oa1.a;
import nsd.u;
import oa1.b;
import lp3.e;
import lp3.a;
import o63.a;
import lp3.c;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import msd.l;
import java.lang.Boolean;
import java.util.Iterator;
import java.lang.Iterable;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateOpen;
import lf3.g;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateClose;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd;
import com.kwai.framework.model.user.QCurrentUser;
import vb1.c;
import lnc.a1;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart;
import java.util.ArrayList;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser;
import java.util.Collection;
import e17.i;

public final class b extends e implements b	// class@00279d
{
    public final HashSet h;
    public boolean i;
    public d j;
    public final g k;
    public final g l;
    public final g m;

    public void b(){
       super();
       this.h = new HashSet();
       this.k = new b$c(this);
       this.l = new b$b(this);
       this.m = new b$a(this);
    }
    public void Eo(b$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       a.p(p0, "observer");
       this.h.remove(p0);
       return;
    }
    public d Je(int p0,String p1){
       a obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uob, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "source");
       obj = new a(0, 0, 0, 0, 0, 0, null, false, 0, 511, null);
       p1.b(0x3f1e353f);
       p1.g(0x3f800000);
       p1.f(true);
       p1.c(true);
       p1.d(16);
       c uoc = this.Po().a(a.class);
       a.o(uoc, "serviceManager.getServic¡­ridgeService::class.java\)");
       return b.d(b.a, uoc, LiveKrnPageKey.LiveBlindDateGiftGuide, a.b.a().a("scene", String.valueOf(p0)).a("source", p1).b(), p1, null, 16, null);
    }
    public boolean M4(){
       return this.i;
    }
    public void Pe(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       this.i = p0;
       Iterator iterator = this.h.iterator();
       while (iterator.hasNext()) {
          iterator.next().S2(p0);
       }
       return;
    }
    public void Qo(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.Qo();
       a uoa = this.u();
       if (uoa != null) {
          uoa.u0(976, LiveBlindDateSignalMessages$SCLiveBlindDateOpen.class, this.k);
          uoa.u0(978, LiveBlindDateSignalMessages$SCLiveBlindDateClose.class, this.l);
          uoa.u0(993, LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall.class, this.m);
       }
       return;
    }
    public void Ro(){
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       super.Ro();
       a uoa = this.u();
       if (uoa != null) {
          uoa.o(976, this.k);
          uoa.o(978, this.l);
          uoa.o(993, this.m);
       }
       return;
    }
    public void So(LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd p0){
       Object obj = this;
       LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, b.class, "7")) {
          return;
       }
       a.p(obj1, "chatServiceEnd");
       super.So(p0);
       if (obj1.showReview != null) {
          LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd paidServingU = obj1.paidServingUserId;
          if (paidServingU != null) {
             QCurrentUser mE = QCurrentUser.ME;
             a.o(mE, "QCurrentUser.ME");
             String id = mE.getId();
             int len = paidServingU.length;
             int i = 0;
             while (i < len) {
                if (a.g(String.valueOf(paidServingU[i]), id)) {
                   e uoe = this.Po();
                   if (uoe != null) {
                      b j = obj.j;
                      if (j != null) {
                         j.L();
                      }
                      obj1 = obj1.sessionId;
                      a.o(obj1, "chatServiceEnd.sessionId");
                      d uod = PatchProxy.applyTwoRefs(uoe, obj1, null, c.class, "4");
                      if (uod != PatchProxyResult.class) {
                      }else {
                         a.p(uoe, "liveServiceManager");
                         a.p(obj1, "sessionId");
                         obj1.e(String.valueOf(a1.a(R.color.arg_RES_7f06060e)));
                         obj1.b(0.32f);
                         c uoc = uoe.a(a.class);
                         a.o(uoc, "liveServiceManager.getSe¡­ridgeService::class.java\)");
                         uod = b.d(b.a, uoc, LiveKrnPageKey.LiveBlindDateAudienceAppraiseService, a.b.a().a("sessionId", obj1).b(), new a(0, 0, 0, 0, 0, 0, null, false, 0, 511, null), null, 16, null);
                      }
                      obj.j = uod;
                      break ;
                   }
                }
                i = i + 1;
             }
          }
       }
       return;
    }
    public void To(LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart p0){
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       a.p(p0, "chatServiceStart");
       super.To(p0);
       p0 = p0.servingUser;
       int i = 0;
       ArrayList uArrayList = 1;
       if (p0 != null) {
          i1 = (!p0.length)? 1: 0;
          if (!i1) {
             uArrayList = null;
          }
       }
       if (!uArrayList) {
          uArrayList = new ArrayList();
          i1 = p0.length;
          while (i < i1) {
             object oobject = p0[i];
             if (oobject.paidServing != null) {
                uArrayList.add(oobject);
             }
             i = i + 1;
          }
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             QCurrentUser mE = QCurrentUser.ME;
             a.o(mE, "QCurrentUser.ME");
             if (a.g(String.valueOf(iterator.next().userId), mE.getId())) {
                i.a(R.style.arg_RES_7f11066a, 0x7f102062);
                break ;
             }
          }
       }
       return;
    }
    public void mh(b$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       a.p(p0, "observer");
       this.h.add(p0);
       return;
    }
}
