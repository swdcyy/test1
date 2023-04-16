package com.yxcorp.gifshow.reminder.friend.kcube.e;
import zr6.e;
import crd.a;
import xq6.a;
import android.graphics.Bitmap;
import sn5.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import wq6.h;
import wq6.d;
import zcc.l;
import com.yxcorp.gifshow.reminder.friend.heartbeat.RedDotRepository;
import j9c.b;
import brd.t;
import jdc.f;
import mdc.h;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import lec.q;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import mdc.j;
import eda.l;
import mdc.i;
import yq6.e;
import qn5.a;
import com.yxcorp.gifshow.reminder.friend.kcube.c;
import yq6.a;
import xq6.b;
import mdc.c;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.reminder.friend.kcube.d;
import lnc.b9;
import mdc.b;
import wkd.b;
import sdc.b;
import zq6.r;
import rn5.a;
import zq6.p;
import java.lang.Integer;
import lec.u;
import k9c.e;
import java.util.Map;
import lec.f;
import com.google.gson.JsonObject;
import android.graphics.drawable.Drawable;
import java.util.List;
import java.lang.IllegalArgumentException;
import com.yxcorp.gifshow.reminder.friend.heartbeat.FriendTabNotify$Common;
import com.kwai.sdk.switchconfig.a;
import qvb.r;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import qvb.i;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import kp.r1;
import com.kuaishou.android.model.mix.FeedFriendInfo;
import dub.z;
import com.yxcorp.gifshow.reminder.friend.heartbeat.FriendTabNotify$RedDotUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.reminder.friend.kcube.e$a;
import mdc.e;
import io.reactivex.g;
import com.yxcorp.gifshow.reminder.friend.kcube.b;
import erd.r;
import com.yxcorp.gifshow.reminder.friend.kcube.a;
import erd.o;
import mdc.f;
import com.yxcorp.gifshow.reminder.friend.kcube.e$b;
import mdc.g;

public class e extends e	// class@001aba
{
    public final a e;
    public final a f;

    public void e(){
       super();
       this.e = new a();
       this.f = new a();
    }
    public static void o(e p0,int p1){
       p0.v(p1);
    }
    public static boolean p(Bitmap p0){
       return e.t(p0);
    }
    public static boolean s(e p0,int p1){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p1 == 10 || p1 == 9) {
          p0 = p0.a;
          if (p0 != 10 && p0 != 9) {
             b = true;
          }
          return b;
       }else {
          p0 = p0.a;
          if (p0 == 10 || p0 == 9) {
             b = true;
          }
          return b;
       }
    }
    public static boolean t(Bitmap p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && !p0.isRecycled())? true: false;
       return b;
    }
    public void f(Fragment p0){
    }
    public void g(Fragment p0){
    }
    public void h(h p0){
       int i;
       RxBus f;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else if(l.a()){
          i = RedDotRepository.d(1);
       }else {
          i = b.b(-7);
       }
       if (i > 0) {
          this.v(i);
       }
       if (l.a()) {
          this.e.c(f.d().subscribe(new h(this), Functions.e));
       }else {
          this.e.c(q.c().subscribe(new h(this), Functions.e));
       }
       f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.e.c(f.g(n.class, mAIN).subscribe(new j(this)));
       this.e.c(f.g(l.class, mAIN).subscribe(new i(this)));
       this.f.a(p0.c0().a(a.a, new c(this)));
       this.f.a(p0.c0().a(a.b, new c(this)));
       this.e.c(t.just(Boolean.TRUE).delay(0x2710, TimeUnit.MILLISECONDS, d.c).observeOn(d.a).subscribe(d.b, Functions.d()));
       return;
    }
    public void i(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "11")) {
       }else {
          b9.a(this.e);
          this.f.c();
       }
       return;
    }
    public final b q(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e() instanceof b) {
          objArray = this.e();
       }
       return objArray;
    }
    public final void r(e p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoe, "10")) {
          return;
       }
       if (!p1) {
          p1.a = null;
       }
       e uoe1 = e.d();
       if (e.s(p0, 0)) {
          uoe1.l();
          this.d().e0().a(a.i, uoe1);
       }else {
          this.d().e0().a(a.i, uoe1);
       }
       return;
    }
    public void u(int p0,int p1,Bitmap p2,String p3){
       Map map;
       JsonObject jsonObject;
       e uoe1;
       e uoe2;
       e uoe3;
       int i = p0;
       int i1 = p1;
       String str = p3;
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, p3, this, e.class, "9")) {
          return;
       }
       p i2 = a.i;
       e uoe = this.c().d(i2);
       boolean b = false;
       if (i > 0) {
          int i3 = (uoe != null && uoe.a != null)? 0: 1;
          String str1 = 2;
          b uob = (u.b())? 2: 1;
          if (uoe == null || uoe.a != uob) {
             b.a(-599798995).a = e.b("FRIENDS");
          }
          if (e.t(p2)) {
             str1 = "99+";
             if (u.b()) {
                if (b.a(-599798995).c != null && b.a(-599798995).b != null) {
                   b = true;
                }
                map = f.h(i, i1, b, str);
                jsonObject = f.j(i3);
                if (PatchProxy.isSupport(e.class)) {
                   uoe1 = PatchProxy.applyFourRefs(Integer.valueOf(p0), map, jsonObject, p2, null, e.class, "16");
                   if (uoe1 != PatchProxyResult.class) {
                   label_00d2 :
                      if (e.s(uoe, 9)) {
                         uoe1.l();
                      }
                      this.d().e0().a(i2, uoe1);
                   }
                }
                if (i > 0) {
                   if (i <= 99) {
                      str1 = String.valueOf(p0);
                   }
                   uoe2 = new e(9, str1, 0, null, map, null, null, jsonObject, p2);
                   goto label_00d2 ;
                }else {
                   throw new IllegalArgumentException("number <= 0");
                }
             }else if(b.a(-599798995).c != null && b.a(-599798995).b != null){
                b = true;
             }
             map = f.h(i, i1, b, str);
             jsonObject = f.j(i3);
             if (PatchProxy.isSupport(e.class)) {
                uoe1 = PatchProxy.applyFourRefs(Integer.valueOf(p0), map, jsonObject, p2, null, e.class, "17");
                if (uoe1 != PatchProxyResult.class) {
                label_014d :
                   if (e.s(uoe, 10)) {
                      uoe1.l();
                   }
                   this.d().e0().a(i2, uoe1);
                }
             }
             if (i > 0) {
                if (i <= 99) {
                   str1 = String.valueOf(p0);
                }
                uoe2 = new e(10, str1, 0, null, map, null, null, jsonObject, p2);
                goto label_014d ;
             }else {
                throw new IllegalArgumentException("number <= 0");
             }
          }else if(u.b()){
             if (b.a(-599798995).c != null && b.a(-599798995).b != null) {
                b = true;
             }
             uoe3 = e.i(i, f.i(i, i1, b, str), f.j(i3));
             if (e.s(uoe, str1)) {
                uoe3.l();
             }
             this.d().e0().a(i2, uoe3);
          }else if(b.a(-599798995).c != null && b.a(-599798995).b != null){
             b = true;
          }
          uoe3 = e.c(f.h(i, i1, b, str), f.j(i3));
          if (e.s(uoe, 1)) {
             uoe3.l();
          }
          this.d().e0().a(i2, uoe3);
          i = this;
       }else {
          this.r(uoe, b);
       }
       return;
    }
    public final void v(int p0){
       boolean b;
       boolean b1;
       FriendTabNotify$RedDotUser mUserId;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "3")) {
          return;
       }
       int i = -7;
       int i1 = 1;
       FriendTabNotify$Common uCommon = (l.a())? RedDotRepository.c(i1): b.c(i, FriendTabNotify$Common.class);
       int i2 = 0;
       if (uCommon != null) {
          Fragment obj = PatchProxy.apply(null, null, l.class, "12");
          b = (obj != patchProxyRe)? obj.booleanValue(): a.t().d("enableFriendsRedDotOptimize", i2);
          if (b) {
             obj = this.e();
             Object obj1 = PatchProxy.applyOneRefs(obj, null, uoe, "4");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else if(obj instanceof r && (obj instanceof BaseFragment && obj.Vg().c())){
                List items = obj.q().getItems();
                if (!q.f(items)) {
                   int i3 = items.size() - i1;
                   if (items.get(i3) instanceof QPhoto) {
                      CommonMeta mFeedFriendI = r1.w0(items.get(i3).mEntity).mFeedFriendInfo;
                      if (mFeedFriendI != null && mFeedFriendI.mHasRead == null) {
                         b = true;
                      }
                   }
                }
             }
             b = false;
             if (b) {
                if (l.a()) {
                   RedDotRepository.a(i1);
                }else {
                   Integer[] integerArray = new Integer[]{Integer.valueOf(i),Integer.valueOf(-9)};
                   z.a("FriendsTab", integerArray);
                }
                p0.a = null;
                return;
             }
          }
       }
    label_00d8 :
       if (uCommon != null) {
          Fragment uFragment = this.e();
          Object obj2 = PatchProxy.applyOneRefs(uFragment, this, uoe, "2");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else if(uFragment instanceof BaseFragment){
             b1 = uFragment.Vg().c();
          }else {
             b1 = false;
          }
          if (b1) {
             uCommon.mRedDotUser = null;
          }
          if (!q.f(uCommon.mFeedItems)) {
             i2 = uCommon.mFeedItems.size();
          }
          FriendTabNotify$Common mRedDotUser = uCommon.mRedDotUser;
          if (mRedDotUser != null) {
             mUserId = mRedDotUser.mUserId;
          label_0117 :
             if (l.b() && uCommon != null) {
                FriendTabNotify$Common mRedDotUser1 = uCommon.mRedDotUser;
                if (mRedDotUser1 != null && !TextUtils.x(mRedDotUser1.mHeadUrl)) {
                   FriendTabNotify$RedDotUser mHeadUrl = uCommon.mRedDotUser.mHeadUrl;
                   e$a uoa = new e$a(this, p0, i2, mUserId);
                   if (!PatchProxy.applyVoidTwoRefs(mHeadUrl, uoa, null, uoe, "5")) {
                      t.create(new e(mHeadUrl)).observeOn(d.c).filter(b.b).map(a.b).filter(b.b).observeOn(d.a).subscribe(new f(uoa), new g(uoa));
                   }
                }else {
                label_0172 :
                   this.u(p0, i2, null, null);
                }
             }else {
                goto label_0172 ;
             }
             return;
          }
       }
       mUserId = null;
       goto label_0117 ;
    }
}
