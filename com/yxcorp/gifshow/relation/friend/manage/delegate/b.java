package com.yxcorp.gifshow.relation.friend.manage.delegate.b;
import rac.f;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.feed.BaseFeed;
import z1.a;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import brd.t;
import com.yxcorp.gifshow.relation.friend.manage.delegate.b$e;
import com.yxcorp.gifshow.relation.friend.manage.delegate.b$f;
import erd.g;
import mp.b;
import com.yxcorp.gifshow.relation.friend.manage.delegate.b$g;
import com.yxcorp.gifshow.relation.friend.manage.delegate.b$h;
import android.app.Activity;
import qa9.q;
import com.yxcorp.gifshow.relation.friend.reduce.FriendReduceFragment;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;
import tac.c;
import com.yxcorp.gifshow.relation.friend.manage.delegate.b$b;
import com.yxcorp.gifshow.relation.friend.manage.delegate.b$c;
import wkd.b;
import sac.a;
import com.yxcorp.gifshow.relation.friend.manage.delegate.b$a;
import erd.o;
import com.yxcorp.gifshow.relation.friend.manage.delegate.b$d;

public final class b implements f	// class@0018cc
{
    public FriendManager a;

    public void b(){
       super();
    }
    public b A(GifshowActivity p0,User p1,BaseFeed p2,boolean p3,boolean p4,boolean p5,a p6){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p6;
       int i = 1;
       if (PatchProxy.isSupport2(b.class, "5")) {
          Object[] objArray = new Object[]{oobject,oobject1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4),Boolean.valueOf(p5),oobject2};
          Object obj = PatchProxy.apply(objArray, this, b.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "activity");
       a.p(p1, "user");
       b uob = null;
       if (p3) {
          uob = this.u(p1).subscribe(new b$e(oobject2), new b$f(oobject2));
       }else if(!b.b()){
          b.e(i);
          this.C(p0, p1, p2, p4, p5, p6);
       }else {
          uob = this.p(p1, uob, p4, p5).subscribe(new b$g(oobject2), new b$h(oobject2));
       }
       PatchProxy.onMethodExit(b.class, "5");
       return uob;
    }
    public void C(GifshowActivity p0,User p1,BaseFeed p2,boolean p3,boolean p4,a p5){
       object oobject = p0;
       object oobject1 = p1;
       if (PatchProxy.isSupport2(b.class, "2")) {
          Object[] objArray = new Object[]{oobject,oobject1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, b.class, "2")) {
             return;
          }
       }else {
          int i = this;
       }
       a.p(p0, "activity");
       a.p(p1, "user");
       FriendReduceFragment.ch(p0, p1, p2, p3, p4, true, p5);
       PatchProxy.onMethodExit(b.class, "2");
       return;
    }
    public boolean d(User p0){
       boolean b;
       b obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "user");
       obj = this.a;
       b = true;
       if (obj == null || (obj.F() != b || (p0.mHasReverseRemoved != null || (!p0.isFollowingOrFollowRequesting() && p0.mVisitorBeFollowed == null)))) {
          b = false;
       }
    label_0033 :
       return b;
    }
    public t p(User p0,BaseFeed p1,boolean p2,boolean p3){
       b$b obj;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, b.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "user");
       c.b(p1, p3, "reverse_removed");
       obj = new b$b(p2, p1, p3);
       b$c uoc = new b$c(this, p1, p3, p2, p0);
       t ot = b.a(0x555499dc).f(p0.mId).doOnError(obj).map(new b$a(obj, v7));
       a.o(ot, "Singleton.get\(FriendMana¡­   true\n        }\n      }");
       return ot;
    }
    public t u(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "user");
       t ot = b.a(0x555499dc).a(p0.mId).map(new b$d(this, p0));
       a.o(ot, "Singleton.get\(FriendMana¡­   true\n        }\n      }");
       return ot;
    }
}
