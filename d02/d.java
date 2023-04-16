package d02.d;
import je3.i;
import lh3.b;
import hh3.d;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import mrd.a;
import je3.o;
import com.kwai.framework.model.user.QCurrentUser;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import d02.d$c;
import d02.d$b;
import lh3.i0;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import nh3.b;
import e02.a;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatRoomInfo;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;
import hh3.c;
import d02.d$a;
import erd.g;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fe3.a;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatLayoutConfig;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatCanvasSize;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatWindow;
import java.util.Iterator;
import java.lang.Iterable;
import nh3.c;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Long;
import fe3.e;
import fe3.f;
import fe3.c;
import fe3.c$d;
import fe3.c$a;
import fe3.g;
import fe3.d;
import com.kuaishou.live.livestage.VideoScaleMode;
import fe3.b;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;
import asd.c;
import je3.i$a;
import com.kuaishou.live.livestage.CloseCameraReason;
import oh3.j;

public final class d implements i	// class@001eeb
{
    public final a a;
    public int b;
    public b c;
    public final a d;
    public final a e;
    public final t f;
    public final List g;
    public final d$c h;
    public final d$b i;
    public final b j;
    public final d k;
    public final t l;

    public void d(b p0,d p1,t p2){
       a.p(p0, "liveInteractRtcManager");
       a.p(p1, "liveInteractMediaProcessor");
       a.p(p2, "bizDispatchObservable");
       super();
       this.j = p0;
       this.k = p1;
       this.l = p2;
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<LayoutConfig>\(\)");
       this.a = uoa;
       this.b = -1;
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       a uoa1 = a.h(new o(p0.a(qCurrentUser.getId())));
       a.o(uoa1, "BehaviorSubject.createDe¡­CurrentUser.me\(\).id\)\)\n  \)");
       this.d = uoa1;
       uoa1 = a.g();
       a.o(uoa1, "BehaviorSubject.create<Set<User>>\(\)");
       this.e = uoa1;
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.f = publishSubje;
       this.g = new ArrayList();
       d$c uoc = new d$c(this);
       this.h = uoc;
       d$b uob = new d$b(this);
       this.i = uob;
       p0.m(uob);
       SCInteractiveChatRoomInfo sCInteractiv = p0.b();
       if (sCInteractiv != null) {
          a.o(sCInteractiv, "roomInfo");
          uoa.onNext(this.a(a.a(sCInteractiv)));
       }
       SCInteractiveChatRoomInfo sCInteractiv1 = p0.b();
       if (sCInteractiv1 != null) {
          b.r(LiveLogTag.LIVE_MULTI_INTERACT.appendTag("LiveSimpleRtcClient"), "register media observer success");
          this.b = sCInteractiv1.roomInfo.bizIdentity.bizType;
          p1.z(uoc);
       }
       this.c = p2.subscribe(new d$a(this));
       return;
    }
    public final LayoutConfig a(b p0){
       f obj1;
       c$a uoa;
       VideoScaleMode nONE;
       a obj = PatchProxy.applyOneRefs(p0, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a(p0.e().canvasSize.width, p0.e().canvasSize.height);
       ArrayList uArrayList = new ArrayList();
       InteractiveChatLayoutConfig windowInfo = p0.e().windowInfo;
       a.o(windowInfo, "roomInfo.interactiveChatLayoutConfig.windowInfo");
       int len = windowInfo.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = windowInfo[i];
          InteractiveChatWindow interactiveC = 2;
          if (oobject.userId - null > 0) {
             List list = p0.f();
             a.o(list, "roomInfo.userInfos");
             Iterator iterator = list.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   obj1 = iterator.next();
                   UserInfo obj2 = obj1;
                   a.o(obj2, "it");
                   obj2 = obj2.c().mId;
                   a.o(obj2, "it.userInfo.mId");
                   int i1 = (!Long.parseLong(obj2) - oobject.userId)? 1: 0;
                   if (i1) {
                   label_0086 :
                      if (obj1 != null && obj1.a() == interactiveC) {
                         uoa = 1;
                      label_0093 :
                         obj1 = new f(oobject.windowId);
                         c$d uod = (uoa)? c.a.a(String.valueOf(oobject.userId)): null;
                         g og = new g(oobject.x, oobject.y, oobject.width, oobject.height);
                         interactiveC = oobject.userId;
                         d uod1 = (interactiveC > 0)? new d(String.valueOf(interactiveC)): null;
                         InteractiveChatWindow cropMode = oobject.cropMode;
                         if (cropMode != 1) {
                            nONE = (cropMode != 2)? VideoScaleMode.NONE: VideoScaleMode.CENTER_CROP;
                         }else {
                            nONE = VideoScaleMode.CENTER_INSIDE;
                         }
                         e uoe = new e(obj1, uod, og, uod1, nONE);
                         uArrayList.add(iterator);
                      }
                   }else {
                      InteractiveChatWindow interactiveC1 = null;
                   }
                }else {
                   obj1 = null;
                   goto label_0086 ;
                }
             }
          }
       label_0092 :
          uoa = null;
          goto label_0093 ;
       }
       return new LayoutConfig(new b(p0.b(), p0.a()), obj, uArrayList, p0.e().layoutType);
    }
    public final b b(SCInteractiveChatRoomInfo p0){
       ArrayList uArrayList;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       SCInteractiveChatRoomInfo obj = PatchProxy.applyOneRefs(p0, this, uod, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p0.roomInfo;
       a.o(obj, "scInteractiveChatRoomInfo.roomInfo");
       SCInteractiveChatRoomInfo extraInfoPb = p0.extraInfoPb;
       InteractiveChatRoomInfo bizIdentity = obj.bizIdentity;
       InteractiveChatBizIdentity bizId = bizIdentity.bizId;
       InteractiveChatBizIdentity chatId = bizIdentity.chatId;
       InteractiveChatBizIdentity bizType = bizIdentity.bizType;
       bizIdentity = obj.userInfo;
       a.o(bizIdentity, "chatRoomInfo.userInfo");
       Object obj1 = PatchProxy.applyOneRefs(bizIdentity, this, uod, "7");
       if (obj1 != patchProxyRe) {
          uArrayList = obj1;
       }else {
          ArrayList uArrayList1 = new ArrayList();
          int len = bizIdentity.length;
          for (int i = 0; i < len; i = i + 1) {
             uArrayList1.add(new c(bizIdentity[i]));
          }
          uArrayList = uArrayList1;
       }
       b uob = new b(bizId, chatId, bizType, uArrayList, obj.layoutConfig, obj.version, extraInfoPb);
       return p0;
    }
    public t f(){
       return this.a;
    }
    public t g(){
       return this.f;
    }
    public Object h(c p0){
       i$a.a(this, p0);
       throw null;
    }
    public void i(CloseCameraReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       a.p(p0, "reason");
       return;
    }
    public LayoutConfig j(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.i();
    }
    public t k(){
       return this.d;
    }
    public t l(){
       return this.e;
    }
    public d m(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       String id = qCurrentUser.getId();
       a.o(id, "QCurrentUser.me\(\).id");
       return new d(id);
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       this.j.h(this.i);
       this.k.g(this.h);
       this.g.clear();
       j.a(this.c);
       return;
    }
}
