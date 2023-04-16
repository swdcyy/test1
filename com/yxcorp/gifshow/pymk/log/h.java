package com.yxcorp.gifshow.pymk.log.h;
import g7c.b;
import java.util.ArrayList;
import h7c.a;
import g7c.g;
import brd.t;
import java.lang.Object;
import com.yxcorp.gifshow.pymk.log.h$a;
import wkd.b;
import com.yxcorp.gifshow.pymk.c;
import com.yxcorp.gifshow.pymk.log.g;
import erd.r;
import g7c.n;
import com.yxcorp.gifshow.pymk.log.f;
import erd.g;
import crd.b;
import java.lang.ref.WeakReference;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Iterator;
import java.util.List;
import h7c.b;
import java.lang.Integer;
import g7c.a;
import com.yxcorp.gifshow.pymk.log.PymkLogSender;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.StringBuilder;
import g7c.e;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import java.lang.Boolean;
import org.json.JSONObject;
import g7c.i;
import com.kwai.framework.model.user.User$FollowStatus;
import cg5.d;
import com.kwai.framework.model.user.QCurrentUser;
import k2b.k2;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.pymk.log.e;
import java.util.Collection;
import ekd.q$b;
import ekd.q;

public class h implements b	// class@0016cd
{
    public a b;
    public boolean c;
    public t d;
    public g e;
    public List f;
    public List g;
    public a h;
    public static ArrayList i;

    static {
       h.i = new ArrayList();
    }
    public void h(a p0,g p1,boolean p2,t p3){
       super();
       this.c = true;
       this.e = new g();
       this.f = new ArrayList();
       this.g = new ArrayList();
       this.h = new h$a(this);
       if (p1 != null) {
          this.e = p1;
       }
       this.d = p3;
       this.c = p2;
       b.a(0x7f4e4530).a(this);
       h td = this.d;
       if (td != null) {
          td.takeUntil(g.b).subscribe(new n(this), f.b);
       }
       this.b = p0;
       h.i.add(new WeakReference(this));
       return;
    }
    public int P5(User p0){
       b uob;
       User mPosition;
       b obj = PatchProxy.applyOneRefs(p0, this, h.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = h.i.size() - 1;
       while (true) {
          if (i >= 0) {
             WeakReference weakReferenc = h.i.get(i);
             if (weakReferenc != null && weakReferenc.get() != null) {
                h oh = weakReferenc.get();
                Iterator iterator = oh.f.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      uob = iterator.next();
                      if ((uob.a.mId).equals(p0.mId)) {
                      }
                   }else {
                      Iterator iterator1 = oh.g.iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            b uob1 = iterator1.next();
                            if ((uob1.a.mId).equals(p0.mId)) {
                               obj = uob1.a;
                               mPosition = obj.mPosition;
                               p0.mPosition = mPosition;
                               p0.mIsNewFriend = obj.mIsNewFriend;
                               return mPosition;
                            }else {
                               continue ;
                            }
                         }
                      }
                      obj = uob.a;
                      mPosition = obj.mPosition;
                      p0.mPosition = mPosition;
                      p0.mIsNewFriend = obj.mIsNewFriend;
                      return mPosition;
                   }
                }
                return -1;
             }
             i = i - 1;
          }else {
             goto label_0088 ;
          }
       }
    }
    public void Sf(User p0,int p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oh, "26")) {
          return;
       }
       p1 = h.i.size() - 1;
       while (true) {
          if (p1 >= 0) {
             WeakReference weakReferenc = h.i.get(p1);
             if (weakReferenc != null && weakReferenc.get() != null) {
                oh = weakReferenc.get();
                Iterator iterator = oh.f.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      if ((iterator.next().a.mId).equals(p0.mId)) {
                      }
                   }else {
                      iterator = oh.g.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            if ((iterator.next().a.mId).equals(p0.mId)) {
                               PymkLogSender.reportClickFollow(oh.b.b(p0.mIsNewFriend), oh.b.c(p0.mIsNewFriend), p0, oh.h);
                               return;
                            }else {
                               continue ;
                            }
                         }
                      }
                      PymkLogSender.reportClickFollow(oh.b.b(p0.mIsNewFriend), oh.b.c(p0.mIsNewFriend), p0, oh.h);
                      return;
                   }
                }
                return;
             }
             p1--;
          }else {
             goto label_00a1 ;
          }
       }
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "21")) {
          return;
       }
       if (this.c != null && !this.f.contains(p0)) {
          b a = p0.a;
          if (a.mShowed == null) {
             a.mShowed = true;
             this.f.add(p0);
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(p0);
             this.o(uArrayList);
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, h.class, "22")) {
          return;
       }
       this.f.clear();
       this.g.clear();
       return;
    }
    public final boolean c(b p0){
       if (p0 == null || p0.a == null) {
          return true;
       }
       return false;
    }
    public final WeakReference d(){
       WeakReference weakReferenc;
       Iterator obj = PatchProxy.apply(null, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = h.i.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          weakReferenc = obj.next();
          if (weakReferenc.get() != null && weakReferenc.get() == this) {
             break ;
          }
       }
       return weakReferenc;
    }
    public int e(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0.size() > 0 && p0.get(0).a != null) {
          return this.b.b(p0.get(0).a.mIsNewFriend);
       }
       return this.b.a;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       WeakReference weakReferenc = this.d();
       if (weakReferenc != null) {
          h.i.remove(weakReferenc);
          h.i.add(weakReferenc);
       }
       return;
    }
    public final void g(BaseFeed p0,b p1,int p2){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, h.class, "14")) {
          return;
       }
       h te = this.e;
       b a = p1.a;
       te.a = p0;
       te.b = a;
       te.c = p2;
       te.d = this.b.b(a.mIsNewFriend);
       te.e = this.b.c(p1.a.mIsNewFriend);
       e.a("PymkStatManager", "onPhotoClick - position is "+p2+" , userName is "+p1.a.getName());
       QPhoto qPhoto = new QPhoto(p0);
       PymkLogSender.reportClickPhoto(this.b.b(p1.a.mIsNewFriend), this.b.c(p1.a.mIsNewFriend), qPhoto, p1.a, p2, this.h);
       if (!PatchProxy.applyVoidOneRefs(qPhoto, null, oh, "20")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.name = "search_photo_click";
          uElementPack.type = 1;
          uElementPack.action = 805;
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.g(qPhoto.mEntity, qPhoto.getCurrentPosition());
          u1.u(1, uElementPack, uContentPack);
       }
       this.a(p1);
       this.f();
       return;
    }
    public void h(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "8")) {
          return;
       }
       this.i(p0, true);
       return;
    }
    public void i(b p0,boolean p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oh, "9")) {
          return;
       }
       if (this.c(p0)) {
          return;
       }
       e.a("PymkStatManager", "onAvatarClick - userName is "+p0.a.mName);
       PymkLogSender.reportClickUser(this.b.b(p0.a.mIsNewFriend), this.b.c(p0.a.mIsNewFriend), p0.a, this.h);
       if (p1) {
          b a = p0.a;
          i.b(a, this.b.b(a.mIsNewFriend), this.b.a(), "to_profile");
       }
       this.a(p0);
       this.f();
       return;
    }
    public void j(BaseFeed p0,b p1,int p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, h.class, "13")) {
          return;
       }
       if (this.c(p1)) {
          return;
       }
       this.g(p0, p1, p2);
       b a = p1.a;
       i.c(a, p0, this.b.b(a.mIsNewFriend), this.b.a(), "photo_background", p2);
       return;
    }
    public void k(b p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "6")) {
          return;
       }
       if (this.c(p0)) {
          return;
       }
       e.a("PymkStatManager", "onCloseClick - position is "+p0.a.mPosition+" , recoUser is "+p0.a.getName());
       b a = p0.a;
       PymkLogSender.reportPymkRemove(a, this.b.b(a.mIsNewFriend), this.b.c(p0.a.mIsNewFriend));
       PymkLogSender.reportUserRemove(this.b.b(p0.a.mIsNewFriend), this.b.c(p0.a.mIsNewFriend), p0.a, this.h);
       a = p0.a;
       i.b(a, this.b.b(a.mIsNewFriend), this.b.a(), p1);
       this.a(p0);
       return;
    }
    public void l(b p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "11")) {
          return;
       }
       if (this.c(p0)) {
          return;
       }
       e.a("PymkStatManager", "onFollowClick - userName is "+p0.a.mName);
       b a = p0.a;
       User mFollowStatu = a.mFollowStatus;
       if (mFollowStatu == User$FollowStatus.FOLLOWING || mFollowStatu == User$FollowStatus.FOLLOW_REQUESTING) {
          str = "unfollow";
       }else if(a.mVisitorBeFollowed != null || a.mFollowed != null){
          str = "return_follow";
       }else {
          str = "follow";
       }
       i.b(a, this.b.b(a.mIsNewFriend), this.b.a(), str);
       this.a(p0);
       return;
    }
    public void m(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "10")) {
          return;
       }
       if (p0 != null && (p0.mFollowStatus == User$FollowStatus.UNFOLLOW && (p0.mVisitorBeFollowed == null && p0.mFollowed == null))) {
          i.d(p0, null, this.b.b(p0.mIsNewFriend), this.b.a(), "follow", "USER_FOLLOW", -1);
       }
    label_0033 :
       return;
    }
    public void n(){
       Object[] objArray2;
       Object obj = this;
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, oh, "30")) {
          return;
       }
       Object[] objArray1 = (obj.b.a() == null)? objArray: obj.b.a().toString();
       Object obj1 = b.a(-621758545);
       a a = obj.b.a;
       String id = QCurrentUser.me().getId();
       Object obj2 = PatchProxy.apply(objArray, objArray, oh, "31");
       if (obj2 != PatchProxyResult.class) {
          objArray2 = obj2;
       }else if(u1.j() != null){
          objArray = u1.j().d;
       }
       objArray2 = objArray;
       obj1.b(6, a, "PYMK", "0", 0, "", null, null, null, "", "", id, "", objArray2, objArray1, null).subscribe(Functions.d());
       oh = obj.b;
       PymkLogSender.reportRemoveAll(oh.a, oh.c(false));
       return;
    }
    public void o(List p0){
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh, "18")) {
          return;
       }
       q.c(p0, e.a);
       e.a("PymkStatManager", "onItemShown - list size is "+p0.size());
       int i = this.e(p0);
       String str = PatchProxy.applyOneRefs(p0, this, oh, "17");
       if (str != PatchProxyResult.class) {
       }else if(p0.size() > 0){
          int i1 = 0;
          if (p0.get(i1).a != null) {
             str = this.b.c(p0.get(i1).a.mIsNewFriend);
          }
       }
       str = this.b.f;
       PymkLogSender.reportShowRecoUsers(i, str, p0, this.h);
       i.e(p0, this.e(p0), this.b.a());
       this.f.addAll(p0);
       return;
    }
    public void p(BaseFeed p0,b p1,int p2){
       h oh = this;
       b uob = p1;
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, h.class, "15")) {
          return;
       }
       if (this.c(uob)) {
          return;
       }
       e.a("PymkStatManager", "onLiveClick - position is "+p2+" , userName is "+uob.a.getName());
       PymkLogSender.reportClickLive(oh.b.b(uob.a.mIsNewFriend), oh.b.c(uob.a.mIsNewFriend), new QPhoto(p0), uob.a, p2, oh.h);
       b a = uob.a;
       i.c(a, p0, oh.b.b(a.mIsNewFriend), oh.b.a(), "photo", p2);
       this.a(uob);
       this.f();
       return;
    }
    public void q(BaseFeed p0,b p1,int p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, h.class, "12")) {
          return;
       }
       if (this.c(p1)) {
          return;
       }
       this.g(p0, p1, p2);
       b a = p1.a;
       i.c(a, p0, this.b.b(a.mIsNewFriend), this.b.a(), "photo", p2);
       return;
    }
    public void r(int p0){
       this.b.a = p0;
    }
    public void s(String p0,String p1){
       h tb = this.b;
       tb.f = p0;
       tb.g = p1;
    }
}
