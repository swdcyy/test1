package tac.b;
import rac.i;
import rac.h;
import rac.d;
import rac.f;
import rac.j;
import rac.e;
import rac.g;
import nsd.u;
import tac.i;
import tac.f;
import com.yxcorp.gifshow.relation.friend.manage.delegate.a;
import com.yxcorp.gifshow.relation.friend.manage.delegate.b;
import tac.n;
import com.yxcorp.gifshow.relation.friend.manage.delegate.FriendRemovedUserListEventDelegate;
import com.yxcorp.gifshow.relation.friend.manage.delegate.FriendReverseRemovedUserListEventDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;
import tac.a;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.feed.BaseFeed;
import z1.a;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import ok.o;
import android.content.Context;

public abstract class b implements i, h, d, f, j, e, g	// class@00428f
{
    public final i a;
    public final h b;
    public final d c;
    public final f d;
    public final j e;
    public final e f;
    public final g g;

    public void b(){
       super(null, null, null, null, null, null, null, 127, null);
    }
    public void b(i p0,h p1,d p2,f p3,j p4,e p5,g p6,int p7,u p8){
       String str1;
       String str = null;
       p0 = (p7 & 0x01)? new i(): str;
       f uof = (p7 & 0x02)? new f(): str;
       a uoa = (p7 & 0x04)? new a(): str;
       b uob = (p7 & 0x08)? new b(): str;
       n on = (p7 & 0x10)? new n(): str;
       FriendRemovedUserListEventDelegate uFriendRemov = (p7 & 0x20)? new FriendRemovedUserListEventDelegate(): str;
       FriendReverseRemovedUserListEventDelegate uFriendRever = (p7 & 0x40)? new FriendReverseRemovedUserListEventDelegate(): str;
       a.p(p0, "friendUserFollow");
       a.p(uof, "friendUserBlock");
       a.p(uoa, "removedUserList");
       a.p(uob, "reverseRemovedUserList");
       a.p(on, "settingsUserList");
       a.p(uFriendRemov, "removedUserListEvent");
       a.p(uFriendRever, "reverseRemovedUserListEvent");
       super();
       this.a = p0;
       this.b = uof;
       this.c = uoa;
       this.d = uob;
       this.e = on;
       this.f = uFriendRemov;
       this.g = uFriendRever;
       FriendManager uFriendManag = this.E();
       if (!p0 instanceof i) {
          str1 = str;
       }
       if (str1 != null) {
          str1.a = uFriendManag;
       }
       if (!uof instanceof f) {
          uof = str;
       }
       if (uof != null) {
          uof.a = uFriendManag;
       }
       if (!uoa instanceof a) {
          uoa = str;
       }
       if (uoa != null) {
          uoa.a = uFriendManag;
       }
       if (!uob instanceof b) {
          uob = str;
       }
       if (uob != null) {
          uob.a = uFriendManag;
       }
       if (!on instanceof n) {
          on = str;
       }
       if (on != null) {
          on.a = uFriendManag;
       }
       if (!uFriendRemov instanceof FriendRemovedUserListEventDelegate) {
          uFriendRemov = str;
       }
       if (uFriendRemov != null) {
          uFriendRemov.a = uFriendManag;
       }
       if (uFriendRever instanceof FriendReverseRemovedUserListEventDelegate) {
          str = uFriendRever;
       }
       if (str != null) {
          str.a = uFriendManag;
       }
       e.d(new a(this, uFriendManag), "FriendManager");
       return;
    }
    public b A(GifshowActivity p0,User p1,BaseFeed p2,boolean p3,boolean p4,boolean p5,a p6){
       b uob = this;
       object oobject = p0;
       object oobject1 = p1;
       if (PatchProxy.isSupport2(b.class, "19")) {
          Object[] objArray = new Object[]{oobject,oobject1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4),Boolean.valueOf(p5),p6};
          Object obj = PatchProxy.apply(objArray, this, b.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "activity");
       a.p(p1, "user");
       PatchProxy.onMethodExit(b.class, "19");
       return uob.d.A(p0, p1, p2, p3, p4, p5, p6);
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.a.B();
       return;
    }
    public void C(GifshowActivity p0,User p1,BaseFeed p2,boolean p3,boolean p4,a p5){
       b uob = this;
       object oobject = p0;
       object oobject1 = p1;
       if (PatchProxy.isSupport2(b.class, "20")) {
          Object[] objArray = new Object[]{oobject,oobject1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, b.class, "20")) {
             return;
          }
       }
       a.p(p0, "activity");
       a.p(p1, "user");
       uob.d.C(p0, p1, p2, p3, p4, p5);
       PatchProxy.onMethodExit(b.class, "20");
       return;
    }
    public void D(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "29")) {
          return;
       }
       a.p(p0, "user");
       this.g.D(p0);
       return;
    }
    public abstract FriendManager E();
    public t a(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "user");
       return this.c.a(p0);
    }
    public b b(GifshowActivity p0,User p1,BaseFeed p2,boolean p3,boolean p4,boolean p5,boolean p6,a p7){
       b uob = this;
       object oobject = p0;
       object oobject1 = p1;
       if (PatchProxy.isSupport2(b.class, "13")) {
          Object[] objArray = new Object[]{oobject,oobject1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4),Boolean.valueOf(p5),Boolean.valueOf(p6),p7};
          Object obj = PatchProxy.apply(objArray, this, b.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "activity");
       a.p(p1, "user");
       PatchProxy.onMethodExit(b.class, "13");
       return uob.c.b(p0, p1, p2, p3, p4, p5, p6, p7);
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, b.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.e.c();
    }
    public boolean d(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "user");
       return this.d.d(p0);
    }
    public void e(GifshowActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "23")) {
          return;
       }
       a.p(p0, "activity");
       this.e.e(p0);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.a.f();
       return;
    }
    public void g(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "25")) {
          return;
       }
       a.p(p0, "user");
       this.f.g(p0);
       return;
    }
    public void h(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       a.p(p0, "predicate");
       this.b.h(p0);
       return;
    }
    public void i(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "26")) {
          return;
       }
       a.p(p0, "user");
       this.f.i(p0);
       return;
    }
    public void j(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       a.p(p0, "predicate");
       this.a.j(p0);
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, b.class, "30")) {
          return;
       }
       this.g.k();
       return;
    }
    public void l(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "15")) {
          return;
       }
       a.p(p0, "context");
       this.c.l(p0);
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       this.b.m();
       return;
    }
    public t n(User p0,BaseFeed p1,boolean p2,boolean p3,boolean p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uob, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "user");
       return this.c.n(p0, p1, p2, p3, p4);
    }
    public void o(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       a.p(p0, "predicate");
       this.b.o(p0);
       return;
    }
    public t p(User p0,BaseFeed p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, b.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "user");
       return this.d.p(p0, p1, p2, p3);
    }
    public void q(GifshowActivity p0,User p1,BaseFeed p2,boolean p3,boolean p4,a p5){
       b uob = this;
       object oobject = p0;
       object oobject1 = p1;
       if (PatchProxy.isSupport2(b.class, "14")) {
          Object[] objArray = new Object[]{oobject,oobject1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, b.class, "14")) {
             return;
          }
       }
       a.p(p0, "activity");
       a.p(p1, "user");
       uob.c.q(p0, p1, p2, p3, p4, p5);
       PatchProxy.onMethodExit(b.class, "14");
       return;
    }
    public boolean r(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "feed");
       return this.c.r(p0);
    }
    public boolean s(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "user");
       return this.c.s(p0);
    }
    public void t(GifshowActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "24")) {
          return;
       }
       a.p(p0, "activity");
       this.e.t(p0);
       return;
    }
    public t u(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "user");
       return this.d.u(p0);
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       this.b.v();
       return;
    }
    public void w(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "28")) {
          return;
       }
       a.p(p0, "user");
       this.g.w(p0);
       return;
    }
    public boolean x(){
       Object obj = PatchProxy.apply(null, this, b.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.e.x();
    }
    public void y(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "predicate");
       this.a.y(p0);
       return;
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, b.class, "27")) {
          return;
       }
       this.f.z();
       return;
    }
}
