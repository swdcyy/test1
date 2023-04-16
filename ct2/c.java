package ct2.c;
import com.kuaishou.live.common.core.component.topbar.topuser.l$a;
import ct2.c$a;
import nsd.u;
import android.content.Context;
import qu2.a;
import co2.f2;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import com.kuaishou.live.common.core.component.topbar.topuser.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import crd.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.LinkedList;
import java.util.LinkedHashSet;
import ct2.a;
import ct2.c$d;
import ct2.c$e;
import ct2.c$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import java.util.Iterator;
import ct2.b;
import at2.c$b;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.micseats.guide.MicSeatGuideState;
import android.content.res.Resources;
import at2.b;
import at2.c;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig$FollowGuestGuide;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig;
import java.lang.reflect.Type;
import wg3.a;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Iterable;
import ct2.c$b;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import pt2.b;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.component.follow.cache.c;
import bs2.a;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import brd.t;
import ct2.g;
import ct2.h;
import erd.g;
import crd.b;

public final class c implements l$a	// class@0023e0
{
    public long a;
    public int b;
    public final HashMap c;
    public final HashMap d;
    public final a e;
    public List f;
    public c g;
    public final LinkedList h;
    public final Set i;
    public final a j;
    public final c$d k;
    public final c$e l;
    public final c$c m;
    public final Context n;
    public final a o;
    public final f2 p;
    public final a q;
    public final MicSeatsDataManager r;
    public final l s;
    public static final c$a t;

    static {
       c.t = new c$a(null);
    }
    public void c(Context p0,a p1,f2 p2,a p3,MicSeatsDataManager p4,l p5){
       a.p(p1, "liveBasicContext");
       a.p(p2, "voicePartyContext");
       a.p(p3, "audienceManager");
       a.p(p4, "micSeatsDataManager");
       a.p(p5, "liveTopUserService");
       super();
       this.n = p0;
       this.o = p1;
       this.p = p2;
       this.q = p3;
       this.r = p4;
       this.s = p5;
       this.b = -1;
       this.c = new HashMap(6);
       this.d = new HashMap(6);
       this.e = new a();
       this.f = CollectionsKt__CollectionsKt.E();
       this.h = new LinkedList();
       this.i = new LinkedHashSet();
       this.j = new a(p2, p1);
       this.k = new c$d(this);
       this.l = new c$e(this);
       this.m = new c$c(this);
    }
    public void a(long p0){
       this.a = p0;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       Iterator iterator = this.c.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       this.c.clear();
       this.g = null;
       this.h.clear();
       return;
    }
    public final c$b c(String p0,boolean p1){
       String obj1;
       MicSeatGuideState rEADY;
       c n;
       Resources resources;
       String str;
       c$b uob;
       Object obj = this;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj1 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), obj, uoc, "19");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }else {
          int i = p0;
       }
       uoc = null;
       if (p1) {
          rEADY = MicSeatGuideState.READY;
          n = obj.n;
          if (n != null) {
             resources = n.getResources();
             if (resources != null) {
                str = resources.getString(0x7f102e1a);
             label_003a :
                n = obj.n;
                if (n != null) {
                   resources = n.getResources();
                   if (resources != null) {
                      obj1 = resources.getString(R.string.arg_RES_7f102e17);
                   }
                }
                uob = new c$b(p0, rEADY, p1, str, 0x2710, obj1, true, 0, 128, null);
             }
          }
          str = uoc;
          goto label_003a ;
       }else {
          rEADY = MicSeatGuideState.READY;
          n = obj.n;
          if (n != null) {
             resources = n.getResources();
             if (resources != null) {
                str = resources.getString(0x7f102e18);
             label_0074 :
                n = obj.n;
                if (n != null) {
                   resources = n.getResources();
                   if (resources != null) {
                      obj1 = resources.getString(R.string.arg_RES_7f102e19);
                   }
                }
                uob = new c$b(p0, rEADY, p1, str, 0x2710, obj1, true, 0, 128, null);
             }
          }
          c uoc1 = uoc;
          goto label_0074 ;
       }
       v2.a(obj.m);
       return v2;
    }
    public final LiveVoicePartyCommonConfig$FollowGuestGuide d(){
       Object[] objArray = null;
       LiveVoicePartyCommonConfig obj = PatchProxy.apply(objArray, this, c.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.M(LiveVoicePartyCommonConfig.class);
       if (obj != null) {
          objArray = obj.mFollowGuestGuide;
       }
       return objArray;
    }
    public final a e(){
       return this.j;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, c.class, "21")) {
          return;
       }
       this.g = null;
       this.h();
       return;
    }
    public final void g(c$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "18")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.OTHER, "showMicSeatGuide "+p0);
       Iterator iterator = this.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
    public final void h(){
       boolean b;
       Object[] objArray1;
       UserInfo mId;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "14")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       c$b uob = this.h.poll();
       while (uob != null) {
          LiveVoicePartyCommonConfig$FollowGuestGuide obj = PatchProxy.applyOneRefs(uob, this, uoc, "15");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             b.Z(LiveVoicePartyLogTag.OTHER, "isFollowGuideCanShow t:"+this.b+" c:"+this.a);
             obj = this.d();
             if (obj != null && (this.b < obj.mMaxDisplayTimes && this.a - (long)obj.mMaxOnlineUser <= 0)) {
                Iterator iterator = this.f.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      objArray1 = iterator.next();
                      VoicePartyMicSeatData mMicUser = objArray1.mMicUser;
                      if (mMicUser != null) {
                         b a = mMicUser.a;
                         if (a != null) {
                            mId = a.mId;
                         label_0083 :
                            if (!a.g(mId, uob.g())) {
                               continue ;
                            }
                         }
                      }
                      mId = objArray;
                      goto label_0083 ;
                   }else {
                      objArray1 = objArray;
                   }
                   if (objArray1 != null) {
                      String userId = objArray1.getUserId();
                      if (userId != null && !c.b().c(userId)) {
                         b = true;
                      }
                   }
                }
             label_00e6 :
                return;
             }
          label_00a5 :
             b = false;
          }
          if (b) {
             this.g = uob;
             if (PatchProxy.applyVoidOneRefs(uob, this, uoc, "16") || PatchProxy.applyVoidOneRefs(uob, this, uoc, "17")) {
                goto label_00e6 ;
             }else {
                this.e.c(LiveVoicePartyApi.b().f(uob.g()).subscribe(new g(this, uob), new h(this)));
                goto label_00e6 ;
             }
          }
          uob = this.h.poll();
       }
    }
}
