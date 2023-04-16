package up1.b;
import hf3.a;
import sz1.e;
import wp1.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lh3.b;
import uz1.b;
import hh3.d;
import java.util.concurrent.CopyOnWriteArrayList;
import xp1.b;
import up1.b$a;
import up1.b$b;
import java.util.List;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import nh3.b;
import e02.a;
import java.lang.Iterable;
import trd.u;
import trd.s0;
import usd.q;
import java.util.LinkedHashMap;
import java.util.Iterator;
import nh3.c;
import com.kwai.framework.model.user.UserInfo;
import java.util.Map;
import ee3.j0;
import fe3.d;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import up1.e;
import com.kwai.robust.PatchProxyResult;
import xp1.a;
import android.util.Base64;
import com.kuaishou.protobuf.livestream.nano.LiveMultiChatRoomInfoExtraInfo;
import kotlin.collections.ArraysKt___ArraysKt;
import java.lang.Throwable;
import com.kuaishou.protobuf.livestream.nano.LiveMultiChatUserLabel;
import kotlin.Pair;
import qrd.r0;
import lh3.i0;
import uz1.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatGuestGiftInfo;
import lf3.g;
import com.kuaishou.live.common.core.component.multichat.core.statemachine.MultiChatState;
import up1.a;
import java.lang.Enum;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.nano.LiveMultiChatStart;
import kotlin.collections.CollectionsKt__CollectionsKt;
import trd.t0;
import vp1.b;
import w12.a;
import brd.t;
import java.lang.Boolean;
import java.util.ArrayList;
import com.kuaishou.live.multiinteract.mediastream.LiveInteractMuteInfo;

public abstract class b	// class@004173
{
    public final b b;
    public final b c;
    public final d d;
    public final CopyOnWriteArrayList e;
    public final b f;
    public LiveMultiChatStart g;
    public boolean h;
    public final b i;
    public final g j;
    public final a k;
    public final e l;
    public final c m;

    public void b(a p0,e p1,c p2){
       a.p(p0, "longConnection");
       a.p(p1, "multiInteractManager");
       a.p(p2, "chatInfoDelegate");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       b uob = p1.gc();
       a.o(uob, "multiInteractManager.liveInteractRtcManager");
       this.b = uob;
       uob = p1.Wi();
       a.o(uob, "multiInteractManager.liv¡­teractBizAdapterProcessor");
       this.c = uob;
       d uod = p1.Sj();
       a.o(uod, "multiInteractManager.liveInteractMediaProcessor");
       this.d = uod;
       this.e = new CopyOnWriteArrayList();
       this.f = new b();
       this.i = new b$a(this);
       this.j = new b$b(this);
    }
    public void A(List p0,LayoutConfig p1){
       j0 b;
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "10")) {
          return;
       }
       a.p(p0, "mediaState");
       a.p(p1, "layoutConfig");
       int i = a.g(this.f.c().getValue(), p1) ^ 0x01;
       SCInteractiveChatRoomInfo sCInteractiv = this.b.b();
       if (sCInteractiv != null) {
          a.o(sCInteractiv, "this");
          b uob = a.a(sCInteractiv);
          this.f.e().setValue(uob.f());
          MutableLiveData mutableLiveD = this.f.f();
          List list = uob.f();
          a.o(list, "roomInfo.userInfos");
          int i1 = 10;
          int i2 = 16;
          LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(u.Y(list, i1)), i2));
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             UserInfo obj1 = obj;
             a.o(obj1, "it");
             obj1 = obj1.c().mId;
             a.o(obj1, "it.userInfo.mId");
             linkedHashMa.put(obj1, obj);
          }
          mutableLiveD.setValue(linkedHashMa);
          this.C(sCInteractiv);
          MutableLiveData mutableLiveD1 = this.f.d();
          LinkedHashMap linkedHashMa1 = new LinkedHashMap(q.n(s0.j(u.Y(p0, i1)), i2));
          Iterator iterator1 = p0.iterator();
          while (iterator1.hasNext()) {
             Object obj2 = iterator1.next();
             b = obj2.b;
             if (b != null) {
                str = b.b();
                if (str != null) {
                label_00c9 :
                   linkedHashMa1.put(str, obj2);
                }
             }
             str = "";
             goto label_00c9 ;
          }
          mutableLiveD1.setValue(linkedHashMa1);
       }
       if (i) {
          b.d0(LiveCommonLogTag.NEW_MULTI_CHAT, "InteractiveSdk updateLayoutConfig", "newLayoutConfig", p1, "commonLog", this.l());
          this.f.c().setValue(p1);
       }
       return;
    }
    public final void C(SCInteractiveChatRoomInfo p0){
       List list;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "11")) {
          return;
       }
       a.p(p0, "roomInfo");
       if (this.h != null) {
          LinkedHashMap linkedHashMa = null;
          a uoa = PatchProxy.applyOneRefs(p0, linkedHashMa, e.class, "1");
          if (uoa != PatchProxyResult.class) {
          }else {
             a.p(p0, "scRoomInfo");
             b uob = a.a(p0);
             try{
                String str = uob.d();
                if (str != null) {
                   LiveMultiChatRoomInfoExtraInfo userLabel = LiveMultiChatRoomInfoExtraInfo.parseFrom(Base64.decode(str, 0)).userLabel;
                   if (userLabel != null) {
                      list = ArraysKt___ArraysKt.uy(userLabel);
                   label_0054 :
                      if (list != null) {
                         linkedHashMa = new LinkedHashMap(q.n(s0.j(u.Y(list, 10)), 16));
                         Iterator iterator = list.iterator();
                         while (iterator.hasNext()) {
                            LiveMultiChatUserLabel liveMultiCha = iterator.next();
                            Pair pair = r0.a(String.valueOf(liveMultiCha.userId), liveMultiCha);
                            Object first = pair.getFirst();
                            linkedHashMa.put(first, pair.getSecond());
                         }
                      }
                      uoa = new a(linkedHashMa);
                   }
                }
             }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e0){
                b.H(LiveCommonLogTag.NEW_MULTI_CHAT, "parseUserLabelList, failed parse extraInfo", "extraInfo", uob.d(), e0);
             }
             list = linkedHashMa;
             goto label_0054 ;
          }
          this.f.a().setValue(uoa);
       }
       return;
    }
    public final void a(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "8")) {
          this.b.m(this.i());
          this.c.M(this.h());
          this.k.u0(812, LiveStreamMessages$SCLiveChatGuestGiftInfo.class, this.j);
       }
       return;
    }
    public void b(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "9")) {
          this.b.h(this.i());
          this.c.i(this.h());
          this.k.o(812, this.j);
       }
       this.n().clear();
       return;
    }
    public abstract void c();
    public void d(MultiChatState p0,MultiChatState p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "3")) {
          return;
       }
       a.p(p0, "oldState");
       a.p(p1, "newState");
       if (a.a[p1.ordinal()] == 1 && !PatchProxy.applyVoid(null, this, b.class, "4")) {
          b tf = this.f;
          Objects.requireNonNull(tf);
          if (!PatchProxy.applyVoid(null, tf, b.class, "3")) {
             tf.a.setValue(null);
             tf.b.setValue(null);
             tf.c.setValue(null);
             tf.d.setValue(null);
             tf.e.setValue(null);
             tf.f.setValue(null);
          }
       }
       return;
    }
    public final boolean e(){
       b tg = this.g;
       LiveMultiChatStart enableGuestG = (tg != null)? tg.enableGuestGift: false;
       return enableGuestG;
    }
    public final List f(){
       List obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f.e().getValue();
       if (obj == null) {
          obj = CollectionsKt__CollectionsKt.E();
       }
       return obj;
    }
    public final Map g(){
       Map obj = PatchProxy.apply(null, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f.f().getValue();
       if (obj == null) {
          obj = t0.z();
       }
       return obj;
    }
    public abstract a h();
    public abstract i0 i();
    public final LiveMultiChatStart j(){
       return this.g;
    }
    public abstract String l();
    public final b m(){
       return this.f;
    }
    public CopyOnWriteArrayList n(){
       return this.e;
    }
    public final b o(){
       return this.i;
    }
    public final e p(){
       return this.l;
    }
    public final b q(){
       return this.b;
    }
    public abstract a r();
    public abstract boolean t();
    public final boolean u(){
       return this.h;
    }
    public final t w(String p0,boolean p1){
       ArrayList obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uob, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "userId");
       b.d0(LiveCommonLogTag.NEW_MULTI_CHAT, "CoreModel muteOrUnMute", "userId", p0, "isMute", Boolean.valueOf(p1));
       obj = new ArrayList();
       LiveInteractMuteInfo liveInteract = new LiveInteractMuteInfo();
       liveInteract.mUserId = p0;
       liveInteract.mIsMuteState = p1;
       obj.add(liveInteract);
       t ot = this.d.v(this.m.getLiveStreamId(), 1, null, obj);
       a.o(ot, "mediaProcessor.updateMut¡­ll,\n      muteInfos\n    \)");
       return ot;
    }
    public final void x(LiveMultiChatStart p0){
       this.g = p0;
    }
    public final void z(boolean p0){
       this.h = p0;
    }
}
