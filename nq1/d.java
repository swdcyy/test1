package nq1.d;
import ee3.d0;
import l02.f;
import nq1.a;
import sz1.e;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import mrd.a;
import java.util.HashMap;
import ee3.b0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lh3.b;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import com.kwai.robust.PatchProxyResult;
import nh3.b;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatLayoutConfig;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatRoomInfo;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;
import java.util.List;
import java.util.ArrayList;
import nh3.c;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;
import f02.a;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.util.Iterator;
import fe3.e;
import fe3.g;
import fe3.d;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatWindow;
import fe3.f;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Iterable;
import qk.m;
import nq1.b;
import ok.o;
import nq1.c;
import ok.h;
import com.google.common.collect.ImmutableList;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Boolean;
import brd.t;
import java.util.Map;

public final class d implements d0, f, a	// class@0033aa
{
    public final a a;
    public final t b;
    public final a c;
    public final t d;
    public final a e;
    public final t f;
    public final a g;
    public final t h;
    public final HashMap i;
    public final e j;
    public final l k;
    public final d0 l;

    public void d(e p0,l p1,d0 p2){
       a.p(p0, "multiInteractManager");
       a.p(p1, "userTagService");
       super();
       this.j = p0;
       this.k = p1;
       this.l = p2;
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create\(\)");
       this.a = uoa;
       this.b = uoa;
       uoa = a.h(new HashMap());
       a.o(uoa, "BehaviorSubject.createDefault\(HashMap\(\)\)");
       this.c = uoa;
       this.d = uoa;
       uoa = a.h(new HashMap());
       a.o(uoa, "BehaviorSubject.createDefault\(HashMap\(\)\)");
       this.e = uoa;
       this.f = uoa;
       uoa = a.h(new HashMap());
       a.o(uoa, "BehaviorSubject.createDefault\(HashMap\(\)\)");
       this.g = uoa;
       this.h = uoa;
       this.i = new HashMap();
    }
    public void a(b0 p0){
       Iterator iterator;
       SCInteractiveChatRoomInfo roomInfo;
       InteractiveChatRoomInfo userInfo;
       e a;
       Iterator iterator1;
       d uod3;
       int i2;
       Object obj = this;
       Iterator obj1 = p0;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, uod, "1")) {
          return;
       }
       a.p(obj1, "stageStatus");
       d l = obj.l;
       if (l != null) {
          l.a(obj1);
       }
       if (!PatchProxy.applyVoidOneRefs(obj1, obj, uod, "4")) {
          b uob = obj.j.gc();
          a.o(uob, "multiInteractManager.liveInteractRtcManager");
          SCInteractiveChatRoomInfo sCInteractiv = uob.b();
          if (sCInteractiv != null) {
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             b uob1 = PatchProxy.applyTwoRefs(obj1, sCInteractiv, obj, uod, "5");
             if (uob1 != patchProxyRe) {
             }else {
                InteractiveChatLayoutConfig interactiveC = new InteractiveChatLayoutConfig();
                roomInfo = sCInteractiv.roomInfo;
                InteractiveChatRoomInfo layoutConfig = roomInfo.layoutConfig;
                interactiveC.windowInfo = layoutConfig.windowInfo;
                interactiveC.canvasSize = layoutConfig.canvasSize;
                layoutConfig = roomInfo.bizIdentity;
                InteractiveChatBizIdentity bizId = layoutConfig.bizId;
                InteractiveChatBizIdentity chatId = layoutConfig.chatId;
                InteractiveChatBizIdentity bizType = layoutConfig.bizType;
                userInfo = roomInfo.userInfo;
                a.o(userInfo, "scRoomInfo.roomInfo.userInfo");
                ArrayList uArrayList = PatchProxy.applyOneRefs(userInfo, obj, uod, "6");
                if (uArrayList != patchProxyRe) {
                }else {
                   uArrayList = new ArrayList();
                   int len1 = userInfo.length;
                   for (i2 = 0; i2 < len1; i2 = i2 + 1) {
                      uArrayList.add(new c(userInfo[i2]));
                   }
                }
                Object obj2 = uArrayList;
                b uob2 = new b(bizId, chatId, bizType, obj2, interactiveC, sCInteractiv.roomInfo.version, sCInteractiv.extraInfoPb);
                b uob3 = a.j(sCInteractiv);
                ArrayList uArrayList1 = new ArrayList();
                iterator = obj1.a.e().iterator();
                while (iterator.hasNext()) {
                   e uoe1 = iterator.next();
                   a = uoe1.a;
                   g og = uoe1.a();
                   d uod2 = uoe1.b();
                   a.o(uob3, "roomInfo");
                   InteractiveChatLayoutConfig windowInfo = uob3.e().windowInfo;
                   int len = windowInfo.length;
                   int i = 0;
                   while (i < len) {
                      object oobject = windowInfo[i];
                      if (uod2 != null && a.g(String.valueOf(oobject.userId), uod2.b())) {
                         InteractiveChatWindow interactiveC1 = new InteractiveChatWindow();
                         interactiveC1.x = og.c();
                         interactiveC1.y = og.d();
                         interactiveC1.width = og.b();
                         interactiveC1.height = og.a();
                         iterator1 = iterator;
                         uod3 = uod2;
                         interactiveC1.userId = oobject.userId;
                         interactiveC1.windowId = a.a();
                         uArrayList1.add(interactiveC1);
                      }else {
                         iterator1 = iterator;
                         uod3 = uod2;
                      }
                      i = i + 1;
                      iterator = iterator1;
                      uod2 = uod3;
                   }
                }
                InteractiveChatWindow[] interactiveC2 = new InteractiveChatWindow[uArrayList1.size()];
                int i1 = uArrayList1.size();
                for (i2 = 0; i2 < i1; i2 = i2 + 1) {
                   interactiveC2[i2] = uArrayList1.get(i2);
                }
                v15.e().windowInfo = interactiveC2;
                uob1 = v15;
             }
             b.Z(LiveLogTag.LIVE_MULTI_LINE, "audience avStatus callback: "+obj1+" ;scRoomInfo = "+sCInteractiv+";roomInfo = "+uob1);
             obj.a.onNext(uob1);
             ImmutableList immutableLis = m.s(obj1.b).p(b.b).F(c.b).B();
             a.o(immutableLis, "FluentIterable.from\(avSt¡­      }\n        .toList\(\)");
             HashMap hashMap = new HashMap();
             HashMap hashMap1 = new HashMap();
             iterator = uob1.f().iterator();
             while (iterator.hasNext()) {
                c uoc = iterator.next();
                a.o(uoc, "info");
                UserInfo mId = uoc.c().mId;
                a.o(mId, "info.userInfo.mId");
                hashMap.put(mId, Boolean.valueOf(immutableLis.contains(uoc.c().mId)));
                mId = uoc.c().mId;
                a.o(mId, "info.userInfo.mId");
                UserInfo mId1 = uoc.c().mId;
                a.o(mId1, "info.userInfo.mId");
                hashMap1.put(mId, obj.k.invoke(mId1));
             }
             obj.c.onNext(hashMap);
             obj.e.onNext(hashMap1);
             HashMap hashMap2 = new HashMap();
             obj1 = obj1.a.e().iterator();
             while (obj1.hasNext()) {
                e uoe = obj1.next();
                if (uoe.h() != null) {
                   d uod1 = uoe.h();
                   a.m(uod1);
                   hashMap2.put(uod1.b(), Boolean.valueOf(uoe.c()));
                }
             }
             obj.g.onNext(hashMap2);
          }
       }
       return;
    }
    public t b(){
       return this.d;
    }
    public t c(){
       return this.b;
    }
    public t d(){
       return this.f;
    }
    public t f(){
       return this.h;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       b uob = this.a.i();
       if (uob != null) {
          HashMap hashMap = new HashMap();
          a.o(uob, "roomInfo");
          Iterator iterator = uob.f().iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next();
             a.o(uoc, "info");
             UserInfo mId = uoc.c().mId;
             a.o(mId, "info.userInfo.mId");
             UserInfo mId1 = uoc.c().mId;
             a.o(mId1, "info.userInfo.mId");
             hashMap.put(mId, this.k.invoke(mId1));
          }
          this.e.onNext(hashMap);
       }
       return;
    }
    public Map h(){
       return this.j();
    }
    public final b i(){
       Object obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.i();
    }
    public HashMap j(){
       return this.i;
    }
}
