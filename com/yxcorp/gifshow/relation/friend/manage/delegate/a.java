package com.yxcorp.gifshow.relation.friend.manage.delegate.a;
import rac.d;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import wkd.b;
import sac.a;
import com.yxcorp.gifshow.relation.friend.manage.delegate.a$d;
import erd.o;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import z1.a;
import crd.b;
import java.lang.Boolean;
import com.yxcorp.gifshow.relation.friend.manage.delegate.a$e;
import com.yxcorp.gifshow.relation.friend.manage.delegate.a$f;
import erd.g;
import mp.b;
import com.yxcorp.gifshow.relation.friend.manage.delegate.a$g;
import com.yxcorp.gifshow.relation.friend.manage.delegate.a$h;
import android.content.Context;
import android.net.Uri$Builder;
import xh7.b;
import com.yxcorp.gifshow.relation.friend.manage.delegate.a$i;
import qh7.b;
import qh7.a;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;
import tac.c;
import com.yxcorp.gifshow.relation.friend.manage.delegate.a$b;
import com.yxcorp.gifshow.relation.friend.manage.delegate.a$c;
import com.yxcorp.gifshow.relation.friend.manage.delegate.a$a;
import android.app.Activity;
import qa9.q;
import com.yxcorp.gifshow.relation.friend.reduce.FriendReduceFragment;
import kp.r1;

public final class a implements d	// class@0018c3
{
    public FriendManager a;

    public void a(){
       super();
    }
    public t a(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "user");
       t ot = b.a(0x555499dc).e(p0.mId).map(new a$d(this, p0));
       a.o(ot, "Singleton.get\(FriendMana¡­   true\n        }\n      }");
       return ot;
    }
    public b b(GifshowActivity p0,User p1,BaseFeed p2,boolean p3,boolean p4,boolean p5,boolean p6,a p7){
       b obj;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p7;
       int i = 1;
       if (PatchProxy.isSupport2(a.class, "7")) {
          Object[] objArray = new Object[]{oobject,oobject1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4),Boolean.valueOf(p5),Boolean.valueOf(p6),oobject2};
          obj = PatchProxy.apply(objArray, this, a.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "activity");
       a.p(p1, "user");
       if (p3) {
          obj = this.a(p1).subscribe(new a$e(oobject2), new a$f(oobject2));
       }else if(!b.a()){
          b.d(i);
          this.q(p0, p1, p2, p4, p5, p7);
          obj = null;
       }else {
          obj = this.n(p1, p2, p4, p5, p6).subscribe(new a$g(oobject2), new a$h(oobject2));
       }
       PatchProxy.onMethodExit(a.class, "7");
       return obj;
    }
    public void l(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "context");
       a.b(b.j(p0, new Uri$Builder().scheme("kwai").authority("krn").appendQueryParameter("themeStyle", "1").appendQueryParameter("minBundleVersion", String.valueOf(23)).appendQueryParameter("bundleId", "SocialShiftOutFriends").appendQueryParameter("componentName", "DidShiftOutFriendsPage").toString()), new a$i(this));
       return;
    }
    public t n(User p0,BaseFeed p1,boolean p2,boolean p3,boolean p4){
       String obj;
       a uoa = a.class;
       int i = 1;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "user");
       uoa = this.a;
       obj = (uoa != null && uoa.F() == i)? "removed": null;
       c.b(p1, p3, obj);
       a$b uob = new a$b(this, p2, p1, p3);
       a$c uoc = new a$c(this, p1, p3, p2, p0);
       t ot = b.a(0x555499dc).b(p0.mId, p4).doOnError(uob).map(new a$a(uob, v7));
       a.o(ot, "Singleton.get\(FriendMana¡­   true\n        }\n      }");
       return ot;
    }
    public void q(GifshowActivity p0,User p1,BaseFeed p2,boolean p3,boolean p4,a p5){
       object oobject = p0;
       object oobject1 = p1;
       if (PatchProxy.isSupport2(a.class, "4")) {
          Object[] objArray = new Object[]{oobject,oobject1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, a.class, "4")) {
             return;
          }
       }else {
          int i = this;
       }
       a.p(p0, "activity");
       a.p(p1, "user");
       FriendReduceFragment.ch(p0, p1, p2, p3, p4, false, p5);
       PatchProxy.onMethodExit(a.class, "4");
       return;
    }
    public boolean r(BaseFeed p0){
       User obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "feed");
       obj = r1.T1(p0);
       boolean b = true;
       if (obj == null || (obj.isFollowingOrFollowRequesting() != b || (r1.b3(p0) || r1.S2(p0)))) {
          b = false;
       }
       return b;
    }
    public boolean s(User p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "user");
       obj = this.a;
       boolean b = true;
       if (obj == null || (obj.F() != b || (p0.mHasRemoved == null && (!p0.isFollowingOrFollowRequesting() || p0.mVisitorBeFollowed == null)))) {
          b = false;
       }
       return b;
    }
}
