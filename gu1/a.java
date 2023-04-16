package gu1.a;
import java.lang.String;
import st1.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import msd.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import gu1.a$a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import pu1.g;
import gu1.a$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.livestream.message.nano.LivePkMessages$PkPlayerState;
import java.lang.Long;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import java.util.ArrayList;
import com.kuaishou.protobuf.livestream.nano.ChatWishList;
import ekd.j;
import com.kuaishou.protobuf.livestream.nano.ChatWishListEntry;
import java.util.Arrays;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Integer;
import java.lang.Boolean;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import ekd.q;
import lnc.i3;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import st1.e;
import java.util.List;
import java.lang.Iterable;
import java.util.Collection;
import java.util.HashMap;

public final class a	// class@00257f
{

    public static final void a(String p0,String p1,c p2,ClientContent$LiveStreamPackage p3,e0 p4,p p5){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, uoa, "22")) {
             return;
          }
       }
       a$a uoa1 = new a$a(p0, p2, p3, p1, p5, p4);
       g.a(uoa);
       return;
    }
    public static void b(String p0,String p1,c p2,ClientContent$LiveStreamPackage p3,e0 p4,p p5,int p6,Object p7){
       a.a(p0, p1, p2, p3, p4, null);
    }
    public static final void c(String p0,String p1,c p2,ClientContent$LiveStreamPackage p3,e0 p4,p p5){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, uoa, "23")) {
             return;
          }
       }
       a$b uob = new a$b(p0, p2, p3, p1, p5, p4);
       g.a(uoa);
       return;
    }
    public static final ClientContent$ContentPackage d(ClientContent$LiveStreamPackage p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, null, a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.liveStreamPackage = p0;
       return obj;
    }
    public static final ClientContent$ContentPackage e(LivePkMessages$PkPlayerState[] p0,ClientContent$LiveStreamPackage p1,long p2){
       ClientContent$ContentPackage obj;
       ClientContent$BatchUserPackage uBatchUserPa;
       Object[] objArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Long.valueOf(p2), null, a.class, "4");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = new ClientContent$ContentPackage();
       obj.liveStreamPackage = p1;
       Object obj1 = null;
       if (PatchProxy.isSupport(uoa)) {
          uBatchUserPa = PatchProxy.applyTwoRefs(p0, Long.valueOf(p2), obj1, uoa, "6");
          if (uBatchUserPa != patchProxyRe) {
          label_00c3 :
             obj.batchUserPackage = uBatchUserPa;
             return obj;
          }
       }
       uBatchUserPa = new ClientContent$BatchUserPackage();
       if (PatchProxy.isSupport(uoa)) {
          objArray = PatchProxy.applyTwoRefs(p0, Long.valueOf(p2), obj1, uoa, "7");
          if (objArray != patchProxyRe) {
          label_00c1 :
             uBatchUserPa.userPackage = objArray;
             goto label_00c3 ;
          }
       }
       ArrayList uArrayList = new ArrayList();
       int len = p0.length;
       int i = 0;
       while (i < len) {
          ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
          userPackage.identity = String.valueOf(p0[i].playerId);
          LivePkMessages$PkPlayerState chatWishList = p0[i].chatWishList;
          if (chatWishList == null || j.h(chatWishList.entryList)) {
             if (!p2 - p0[i].playerId) {
                uArrayList.add(userPackage);
             }
          }else {
             object oobject = chatWishList.entryList[0];
             long[] olongArray = new long[]{oobject.currentCount,oobject.expectCount};
             String str = Arrays.toString(olongArray);
             a.o(str, "java.util.Arrays.toString\(this\)");
             userPackage.params = str;
             userPackage.avatarStatus = String.valueOf(oobject.giftId);
             uArrayList.add(userPackage);
          }
          i = i + 1;
       }
       ClientContent$UserPackage[] userPackageA = new ClientContent$UserPackage[0];
       Object[] objArray1 = uArrayList.toArray(userPackageA);
       Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
       objArray = objArray1;
       goto label_00c1 ;
    }
    public static final ClientEvent$ElementPackage f(int p0,boolean p1,c p2,int p3){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, Integer.valueOf(p3), null, a.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ImmutableMap$b uob = ImmutableMap.builder().c("rank", String.valueOf(p0));
       String str = (p1)? "CURRENT_AUTHOR": "PK_AUTHOR";
       ImmutableMap immutableMap = uob.c("type", str).c("play_type", String.valueOf(p3)).c("biz_session_id", TextUtils.k(p2.a())).c("biz_type", TextUtils.k(p2.b())).c("chat_id", TextUtils.k(p2.c())).c("session_id", TextUtils.k(p2.d())).a();
       a.o(immutableMap, "elementParamMap");
       return a.g("PK_WINNING_ICON", immutableMap);
    }
    public static final ClientEvent$ElementPackage g(String p0,ImmutableMap p1){
       ClientEvent$ElementPackage obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = p0;
       if (q.h(p1)) {
          return obj;
       }
       i3 oi3 = i3.f();
       Iterator iterator = p1.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          oi3.d(key, uEntry.getValue());
       }
       obj.params = oi3.e();
       return obj;
    }
    public static final ClientEvent$ElementPackage h(c p0,Map p1){
       ClientEvent$ElementPackage obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = "MULTI_WISH_LIST_TAG_BUTTON";
       obj.params = e.i(p0, p1);
       return obj;
    }
    public static final ClientContent$BatchUserPackage i(List p0){
       ClientContent$BatchUserPackage obj = PatchProxy.applyOneRefs(p0, null, a.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$BatchUserPackage();
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
          userPackage.identity = iterator.next();
          uArrayList.add(userPackage);
       }
       ClientContent$UserPackage[] userPackageA = new ClientContent$UserPackage[0];
       Object[] objArray = uArrayList.toArray(userPackageA);
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
       obj.userPackage = objArray;
       return obj;
    }
    public static final String j(int p0){
       String str = (p0 == 1)? "SOLO": "TEAM";
       return str;
    }
    public static final Map k(boolean p0,boolean p1){
       HashMap obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), null, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new HashMap();
       if (p0) {
          if (p1) {
             obj.put("if_set", "TRUE");
          }else {
             obj.put("if_set", "FALSE");
          }
       }
       return obj;
    }
}
