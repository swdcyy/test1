package ce1.a;
import yd1.t;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import ce1.a$a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import ae1.a;
import com.kuaishou.live.core.show.chat.model.LiveMultiChatGuestWidgetConfig;
import ae1.c;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatGuestGiftInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Number;
import kotlin.Pair;
import yd1.b;
import xd1.g;
import java.lang.Integer;
import yd1.o;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.component.chat.multi.window.LiveMultiChatWindowContainer;
import android.view.View;
import dp3.g;
import java.util.LinkedHashMap;
import android.widget.FrameLayout;
import yd1.m;
import ce1.c;
import ok.x;
import kotlin.collections.ArraysKt___ArraysKt;
import yd1.s;
import java.util.HashMap;
import java.nio.ByteBuffer;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import java.lang.Math;
import qsd.d;
import rd1.c0;
import ekd.q;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import com.airbnb.lottie.LottieAnimationView;
import yd1.r;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import yd1.j;
import zsd.t;
import lp3.e;
import xp5.g;
import xp5.i;
import android.content.Context;
import lp3.i;
import lp3.c;
import java.util.Collection;
import java.lang.Iterable;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo;
import java.util.Objects;

public abstract class a implements t	// class@0004a4
{
    public LiveStreamMessages$SCLiveChatGuestGiftInfo a;
    public boolean b;
    public x c;
    public e d;
    public g e;
    public i f;
    public boolean g;
    public ConcurrentHashMap h;
    public LiveMultiChatWindowContainer i;
    public c j;
    public LayoutInflater k;
    public final o l;
    public List m;

    public void a(){
       super();
       this.h = new ConcurrentHashMap();
       this.l = new a$a(this);
       this.m = CollectionsKt__CollectionsKt.E();
    }
    public static void C(a p0,int p1,a p2,LiveMultiChatGuestWidgetConfig p3,c p4,int p5,Object p6){
       p0.B(p1, p2, p3, null);
    }
    public final void A(LiveStreamMessages$SCLiveChatGuestGiftInfo p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "13")) {
          return;
       }
       a.p(p0, "giftInfo");
       this.a = p0;
       if (this.h.isEmpty()) {
          return;
       }
       p0 = p0.userId2ReceiveGift;
       if (p0 != null) {
          Iterator iterator = p0.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             Pair pair = this.h.get(String.valueOf(uEntry.getKey().longValue()));
             b first = (pair != null)? pair.getFirst(): null;
             if (first != null) {
                Object value = uEntry.getValue();
                a.o(value, "it.value");
                first.j(g.a.e(value));
                first.l(p1);
             }
          }
       }
       return;
    }
    public final void B(int p0,a p1,LiveMultiChatGuestWidgetConfig p2,c p3){
       boolean b;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, a.class, "21")) {
          return;
       }
       a.p(p1, "chatUserInfo");
       a.p(p2, "widgetConfig");
       b uob = this.m(p1, p2);
       if (uob != null) {
          uob.o(this.l);
       }
       if (uob != null) {
          if (p3 != null) {
             b.S(LiveLogTag.MULTI_CHAT.appendTag(this.s()), " showGuestChattingWindow position is not null ,update widget position", "positionInfo", p3);
             uob.n(p3);
          }
          b = p1.b();
          if (!b || (b && (!uob.x() && (p0 == 3 || p0 == 1)))) {
             this.D(p0, p1, uob, p3);
             b.Z(LiveLogTag.MULTI_CHAT, this.s()+" showGuestChattingWindow:"+p1.c);
          }else {
             b.Z(LiveLogTag.MULTI_CHAT, this.s()+" showGuestChattingWindow not Rendering:"+p1.c);
          }
       }
       return;
    }
    public final void D(int p0,a p1,b p2,c p3){
       boolean b;
       a j;
       a uoa = this;
       a uoa1 = p1;
       b uob = p2;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, a.class, "19")) {
          return;
       }
       LiveLogTag mULTI_CHAT = LiveLogTag.MULTI_CHAT;
       mULTI_CHAT.appendTag(this.s());
       b.T(mULTI_CHAT, " startChattingInternal", "type: ", Integer.valueOf(p0), "chatUserInfo,", p1);
       b = p1.b();
       a i = uoa.i;
       if (i == null) {
          a.S("multiChatWindowContainer");
       }
       int widCount = i.getWidgetCount();
       i = uoa.i;
       if (i == null) {
          a.S("multiChatWindowContainer");
       }
       boolean b1 = (p3 != null)? true: false;
       View view = p2.getView();
       a c = uoa1.c;
       a.o(c, "chatUserInfo.mGuestId");
       _monitor_enter(i);
       if (PatchProxy.isSupport(LiveMultiChatWindowContainer.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(b1), view, c, Boolean.valueOf(b), i, LiveMultiChatWindowContainer.class, "3")) {
          _monitor_exit(i);
       }else {
          a.p(c, "userId");
          if (view == null || i.b.containsKey(c)) {
             _monitor_exit(i);
          }else {
             mULTI_CHAT.appendTag("LiveMultiChatWindowContainer");
             b.U(mULTI_CHAT, "addSmallWindowView", " hasPositionInfo: ", Boolean.valueOf(b1), "isVideoChat: ", Boolean.valueOf(b), " userId : ", c);
             i.b.put(c, new Pair(view, Boolean.valueOf(b)));
             if (b1) {
                i.addView(view);
             }else {
                i.a(b, view);
             }
             _monitor_exit(i);
          }
       }
       p2.g(uoa.g, b, p0, p1, 0);
       i = uoa.i;
       if (i == null) {
          a.S("multiChatWindowContainer");
       }
       int widCount1 = i.getWidgetCount();
       if (!widCount && widCount1 == 1) {
          b.Z(mULTI_CHAT, this.s()+" onFirstWidgetAdded");
          j = uoa.j;
          if (j != null) {
             j.F4(uoa1, uob);
          }
       }
       j = uoa.j;
       if (j != null) {
          j.i5(true, widCount1, uoa1, uob);
       }
       return;
    }
    public final void E(Map p0,LiveMultiChatGuestWidgetConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "24")) {
          return;
       }
       a.p(p0, "newChatUserInfoMap");
       a.p(p1, "widgetConfig");
       Iterator iterator = this.h.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object obj = uEntry.getKey();
          Pair value = uEntry.getValue();
          if (p0.containsKey(obj)) {
             a tc = this.c;
             if (tc == null) {
                a.S("maxChatWindowHeightSupplier");
             }
             Integer integer = tc.get();
             b.T(LiveLogTag.MULTI_CHAT.appendTag(this.s()), " clearAndUpdateExistChatWidget update widget size ", "update user id : ", obj, "max height : ", integer);
             a.o(integer, "maxHeight");
             value.getFirst().n(this.i(p1, integer.intValue()));
          }
       }
       return;
    }
    public final void F(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "14")) {
          return;
       }
       this.b = p0;
       Iterator iterator = this.h.entrySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().getValue().getFirst().l(p0);
       }
       return;
    }
    public final void G(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "17")) {
          return;
       }
       Iterator iterator = this.h.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          uEntry.getValue().getFirst().f(false);
          if (uEntry.getValue().getFirst().k() && p0 != null) {
             boolean b = true;
             if (ArraysKt___ArraysKt.P7(p0, uEntry.getKey()) == b) {
                uEntry.getValue().getFirst().f(b);
             }
          }
       }
       return;
    }
    public void b(a p0,int p1){
       s.a(this, p0, p1);
    }
    public void d(a p0){
       s.b(this, p0);
    }
    public final boolean e(){
       return this.b;
    }
    public final void f(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "22")) {
          return;
       }
       a.p(p0, "newChatUserInfoMap");
       Iterator iterator = this.h.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          Pair value = uEntry.getValue();
          String str = " clearInvalid ";
          if (!p0.containsKey(key)) {
             b.Z(LiveLogTag.MULTI_CHAT, this.s()+str+"remove from old:"+key);
             this.h(value.getSecond());
          }else if(value.getFirst().P2()){
             b.Z(LiveLogTag.MULTI_CHAT, this.s()+str+"remove from new:"+key);
             p0.remove(key);
          }
       }
       return;
    }
    public final void g(int p0,a p1,ByteBuffer p2,int p3,int p4,int p5){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "15")) {
             return;
          }
       }
       a.p(p1, "chatUserInfo");
       b uob = this.l(p1);
       if (uob != null) {
          uob.q(p2, p3, p4, p5);
          if (!uob.P2() && p1.d == 4) {
             b.S(LiveLogTag.MULTI_CHAT.appendTag(this.s()), " dispatchFeedI420Data ", "startChatting: ", p1.c);
             this.D(p0, p1, uob, null);
          }
       }
       return;
    }
    public final void h(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "25")) {
          return;
       }
       a.p(p0, "chatUserInfo");
       Pair pair = this.h.remove(p0.c);
       if (pair != null) {
          b first = pair.getFirst();
          if (first != null) {
             first.s();
          }
       }
       a ti = this.i;
       String str = "multiChatWindowContainer";
       if (ti == null) {
          a.S(str);
       }
       a c = p0.c;
       a.o(c, "chatUserInfo.mGuestId");
       ti.c(c);
       ti = this.i;
       if (ti == null) {
          a.S(str);
       }
       int widCount = ti.getWidgetCount();
       a tj = this.j;
       if (tj != null) {
          b first1 = (pair != null)? pair.getFirst(): null;
          tj.i5(false, widCount, p0, first1);
       }
       if (!widCount) {
          b.P(LiveLogTag.MULTI_CHAT.appendTag(this.s()), " onWidgetCleared");
          p0 = this.j;
          if (p0 != null) {
             p0.s6();
          }
       }
       return;
    }
    public final c i(LiveMultiChatGuestWidgetConfig p0,int p1){
       LiveMultiChatGuestWidgetConfig obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "30");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 <= 0) {
          return null;
       }else {
          obj = p0.mSupportMultiChatCount;
          int i = 1;
          if (obj > i) {
             p1 = p1 - ((obj - i) * a1.d(0x7f0709e6));
          }
          p1 = Math.min(a1.d(R.dimen.arg_RES_7f0709e7), (p1 / p0.mSupportMultiChatCount));
          return new c(a1.d(0x7f07025d), 0, d.H0(((float)p1 * p0.mWidgetAspectRatio)), p1);
       }
    }
    public final String j(String p0){
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "26");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       a ta = this.a;
       if (PatchProxy.isSupport(c0.class)) {
          str = PatchProxy.applyThreeRefs(Boolean.valueOf(obj), p0, ta, null, c0.class, "19");
          if (str != patchProxyRe) {
          }else if(obj == null){
             str = "";
          }else if(ta != null && (q.h(ta.userId2ReceiveGift) || TextUtils.x(p0))){
             str = "0";
          }else {
             str = TextUtils.i(ta.userId2ReceiveGift.get(Long.valueOf(Long.parseLong(p0))), "0");
          }
       }else {
          goto label_002f ;
       }
       a.o(str, "LiveChatLogger.getGiftCo¡­rId,\n      guestGiftInfo\)");
       return str;
    }
    public final LottieAnimationView k(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b uob = this.l(p0);
       LottieAnimationView lottieAnimat = (uob != null)? uob.m(): null;
       return lottieAnimat;
    }
    public final b l(a p0){
       b obj = PatchProxy.applyOneRefs(p0, this, a.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 != null) {
          p0 = p0.c;
          if (this.h.containsKey(p0)) {
             Pair pair = this.h.get(p0);
             if (pair != null) {
                obj = pair.getFirst();
             }
          }
       }
       return obj;
    }
    public final b m(a p0,LiveMultiChatGuestWidgetConfig p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       b obj = PatchProxy.applyTwoRefs(p0, p1, this, uoa, "28");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = this.l(p0);
       if (obj == null) {
          LiveLogTag obj1 = PatchProxy.applyTwoRefs(p0, p1, this, uoa, "29");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             String str = "maxChatGuest:"+p1.mSupportMultiChatCount+",aspectRatio:"+p1.mWidgetAspectRatio;
             a tc = this.c;
             if (tc == null) {
                a.S("maxChatWindowHeightSupplier");
             }
             Integer integer = tc.get();
             obj1 = LiveLogTag.MULTI_CHAT;
             obj1.appendTag(this.s());
             b.U(obj1, " createLiveChatWidget", "chatUserInfo: ", p0, "maxChatWindowHeight: ", integer, "widgetConfig: ", str);
             a.o(integer, "maxChatWindowHeight");
             c uoc = this.i(p1, integer.intValue());
             r or = new r();
             uoa = this.k;
             if (uoa == null) {
                a.S("layoutInflater");
             }
             a ti = this.i;
             if (ti == null) {
                a.S("multiChatWindowContainer");
             }
             or.i(uoa, ti);
             or.v(false);
             if (uoc != null) {
                or.n(uoc);
             }
             or.p(this);
             a ta = this.a;
             String str1 = "chatUserInfo.mGuestId";
             if (ta != null) {
                LiveStreamMessages$SCLiveChatGuestGiftInfo userId2Recei = ta.userId2ReceiveGift;
                if (userId2Recei != null) {
                   ti = p0.c;
                   a.o(ti, str1);
                   String str2 = userId2Recei.get(t.Z0(ti));
                   if (str2 != null) {
                      or.j(g.a.e(str2));
                   }
                }
             }
             or.l(this.b);
             ti = p0.c;
             a.o(ti, str1);
             this.h.put(ti, new Pair(or, p0));
             r or1 = or;
          }
       }
       return obj;
    }
    public final e n(){
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          a.S("liveServiceManager");
       }
       return obj;
    }
    public final g o(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj == null) {
          a.S("mLiveInfoManager");
       }
       return obj;
    }
    public final i p(){
       a obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj == null) {
          a.S("mLiveLogPackageProvider");
       }
       return obj;
    }
    public final LiveMultiChatWindowContainer q(){
       a obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       if (obj == null) {
          a.S("multiChatWindowContainer");
       }
       return obj;
    }
    public final ConcurrentHashMap r(){
       return this.h;
    }
    public abstract String s();
    public final void t(x p0,LiveMultiChatWindowContainer p1,e p2,c p3,boolean p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "10")) {
             return;
          }
       }
       a.p(p0, "maxChatWindowHeightSupplier");
       a.p(p1, "windowContainer");
       a.p(p2, "liveServiceManager");
       b.P(LiveLogTag.MULTI_CHAT.appendTag(this.s()), "initMultiChatWindowProcessor");
       this.c = p0;
       this.i = p1;
       LayoutInflater layoutInflat = LayoutInflater.from(p1.getContext());
       a.o(layoutInflat, "LayoutInflater.from\(windowContainer.context\)");
       this.k = layoutInflat;
       this.d = p2;
       this.j = p3;
       c uoc = p2.a(g.class);
       a.o(uoc, "liveServiceManager.getSe¡­eInfoManager::class.java\)");
       this.e = uoc;
       uoc = p2.a(i.class);
       a.o(uoc, "liveServiceManager.getSe¡­kageProvider::class.java\)");
       this.f = uoc;
       this.g = p4;
       return;
    }
    public final void u(){
       Iterator iterator;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "31")) {
          return;
       }
       int i = 1;
       if (this.m.isEmpty() ^ i) {
          iterator = this.m.iterator();
          while (iterator.hasNext()) {
             LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser sCLiveBlindD = iterator.next();
             String str = String.valueOf(sCLiveBlindD.userId);
             if (this.h.containsKey(str)) {
                Pair pair = this.h.get(str);
                if (pair != null) {
                   b first = pair.getFirst();
                   if (first != null) {
                      first.w(i, sCLiveBlindD.gender);
                   }
                }
             }
          }
       }else {
          iterator = this.h.entrySet().iterator();
          while (iterator.hasNext()) {
             iterator.next().getValue().getFirst().w(false, objArray);
          }
       }
       return;
    }
    public final void v(){
       if (PatchProxy.applyVoid(null, this, a.class, "23")) {
          return;
       }
       Iterator iterator = this.h.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          Pair value = uEntry.getValue();
          if (value.getFirst().P2()) {
             a tj = this.j;
             if (tj != null) {
                tj.l5(value.getSecond(), value.getFirst());
                break ;
             }else {
                break ;
             }
          }
       }
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, a.class, "16")) {
          return;
       }
       b.Z(LiveLogTag.MULTI_CHAT, this.s()+" onChatEnd");
       Iterator iterator = this.h.entrySet().iterator();
       while (iterator.hasNext()) {
          this.h(iterator.next().getValue().getSecond());
       }
       this.h.clear();
       return;
    }
    public abstract void x(ChatInfo p0);
    public final void y(){
       if (PatchProxy.applyVoid(null, this, a.class, "18")) {
          return;
       }
       b.Z(LiveLogTag.MULTI_CHAT, this.s()+" unBind");
       this.w();
       a ti = this.i;
       if (ti == null) {
          a.S("multiChatWindowContainer");
       }
       Objects.requireNonNull(ti);
       if (!PatchProxy.applyVoid(null, ti, LiveMultiChatWindowContainer.class, "7")) {
          if (ti.getChildCount() > 0) {
             ti.removeAllViews();
          }
          ti.b.clear();
       }
       this.j = null;
       this.g = false;
       return;
    }
    public final void z(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "32")) {
          return;
       }
       a.p(p0, "servingUserList");
       this.m = p0;
       this.u();
       return;
    }
}
