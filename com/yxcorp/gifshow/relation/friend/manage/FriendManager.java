package com.yxcorp.gifshow.relation.friend.manage.FriendManager;
import tac.b;
import rac.i;
import rac.h;
import rac.d;
import rac.f;
import rac.j;
import rac.e;
import rac.g;
import nsd.u;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager$isManageFriendsEnabled$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.Log;
import rac.a;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import ok.o;
import brd.t;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager$a;
import java.lang.StringBuilder;
import rac.b;
import erd.a;
import rac.c;
import erd.r;
import com.kwai.framework.model.user.User;
import java.lang.Integer;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager$b;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager$c;
import erd.g;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager$d;
import erd.o;

public class FriendManager extends b	// class@0018b5
{
    public PublishSubject h;
    public final p i;

    public void FriendManager(){
       super(null, null, null, null, null, null, null, 127, null);
       this.i = s.c(FriendManager$isManageFriendsEnabled$2.INSTANCE);
    }
    public FriendManager E(){
       return this;
    }
    public final boolean F(){
       Object obj = PatchProxy.apply(null, this, FriendManager.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.i.getValue();
       }
       return obj.booleanValue();
    }
    public final void G(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendManager.class, "8")) {
          return;
       }
       a.p(p0, "msg");
       Log.b("FriendManager", p0);
       return;
    }
    public final void H(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendManager.class, "2")) {
          return;
       }
       a.p(p0, "actionEvent");
       FriendManager th = this.h;
       if (th != null) {
          th.onNext(p0);
       }
       return;
    }
    public final t I(String p0,List p1,o p2,o p3){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FriendManager$a obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, FriendManager.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new FriendManager$a(p1);
       t ot = PatchProxy.applyFourRefs(p0, obj, p2, p3, this, FriendManager.class, "6");
       if (ot != patchProxyRe) {
       }else {
          this.G('['+p0+"] observeFriendAction start.");
          if (this.h == null) {
             this.h = PublishSubject.g();
             this.f();
             this.m();
          }
          if (p2 != null) {
             this.h(p2);
          }
          if (p3 != null) {
             this.y(p3);
          }
          FriendManager th = this.h;
          a.m(th);
          t ot1 = th.hide().doFinally(new b(this, p0, p2, p3));
          if (ot1 != null) {
             ot1 = ot1.filter(new c(obj));
             if (ot1 != null) {
             label_0087 :
                ot = ot1;
             }
          }
          ot1 = t.empty();
          a.o(ot1, "Observable.empty\(\)");
          goto label_0087 ;
       }
       return ot;
    }
    public final t J(String p0,User p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, FriendManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tag");
       a.p(p1, "user");
       Integer[] integerArray = new Integer[]{Integer.valueOf(5),Integer.valueOf(4),Integer.valueOf(7),Integer.valueOf(6)};
       t ot = this.I(p0, CollectionsKt__CollectionsKt.L(integerArray), null, null).filter(new FriendManager$b(p1)).doOnNext(new FriendManager$c(p1)).distinctUntilChanged(FriendManager$d.b);
       a.o(ot, "observeFriendActionInter¡­eRemoved\) 2 else 0\)\n    }");
       return ot;
    }
}
