package fja.m;
import f7c.d;
import xl8.b;
import qvb.i;
import k2b.e0;
import aja.a;
import java.lang.ref.WeakReference;
import java.lang.Object;
import com.kwai.framework.model.user.RecoUser;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.pymk.b;
import java.lang.Throwable;
import java.lang.Boolean;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import java.util.Objects;
import android.os.SystemClock;
import lb5.b;
import aja.k;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.framework.model.user.QCurrentUser;

public class m extends d	// class@002958
{
    public final a f;
    public final b g;
    public final i h;
    public final WeakReference i;

    public void m(b p0,i p1,e0 p2){
       super();
       this.f = new a();
       this.g = p0;
       this.h = p1;
       this.i = new WeakReference(p2);
    }
    public void Ad(RecoUser p0,User p1,int p2){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, m.class, "10")) {
          return;
       }
       if (b.a()) {
          this.c(p0, p1, p2);
       }else {
          super.Ad(p0, p1, p2);
       }
       return;
    }
    public void M1(boolean p0,Throwable p1){
       a a;
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, om, "3")) {
          return;
       }
       c.f(KsLogFollowTag.FOLLOW_PYMK.appendTag(d.e), "onError", p1, "firstPage", String.valueOf(p0));
       m tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(null, tf, a.class, "3")) {
          a = tf.a;
          if (a != null) {
             a.f = SystemClock.elapsedRealtime();
             tf.a.a(8);
          }
       }
       return;
    }
    public void Nc(){
       if (PatchProxy.applyVoid(null, this, m.class, "8")) {
          return;
       }
       super.Nc();
       c.i(KsLogFollowTag.FOLLOW_PYMK.appendTag(d.e), "onScrolledBottom");
       k.g(this.i.get());
       return;
    }
    public void P2(){
       if (PatchProxy.applyVoid(null, this, m.class, "9")) {
          return;
       }
       c.i(KsLogFollowTag.FOLLOW_PYMK.appendTag(d.e), "onPymkAreaShown");
       int i = (this.h.isEmpty())? 0: this.h.getCount() - 1;
       k.h(i, this.i.get());
       return;
    }
    public void Qe(BaseFeed p0,RecoUser p1,User p2,int p3){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, m.class, "5")) {
          return;
       }
       super.Qe(p0, p1, p2, p3);
       this.g.d(Boolean.TRUE);
       return;
    }
    public int W2(){
       int i;
       m obj = PatchProxy.apply(null, this, m.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = null;
       if (!QCurrentUser.me().isLogined()) {
          i = 31;
       }else if(QCurrentUser.me().isLogined()){
          i = (this.h.isEmpty())? 3: 29;
       }
       c.j(KsLogFollowTag.FOLLOW_PYMK.appendTag(d.e), "changePortalWhenRefresh", "portal", String.valueOf(i));
       return i;
    }
    public void W9(RecoUser p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "6")) {
          return;
       }
       super.W9(p0, p1);
       this.g.d(Boolean.TRUE);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, om, "1")) {
          return;
       }
       c.i(KsLogFollowTag.FOLLOW_PYMK.appendTag(d.e), "onStartLoading");
       m tf = this.f;
       Objects.requireNonNull(tf);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), tf, uoa, "1")) {
          b uob = new b(2);
          tf.a = uob;
          uob.d = SystemClock.elapsedRealtime();
          tf.b = p0;
       }
       return;
    }
    public void a5(RecoUser p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "4")) {
          return;
       }
       super.a5(p0, p1);
       this.g.d(Boolean.TRUE);
       return;
    }
    public void v2(boolean p0,boolean p1){
       a a;
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, om, "2")) {
          return;
       }
       super.v2(p0, p1);
       c.i(KsLogFollowTag.FOLLOW_PYMK.appendTag(d.e), "onFinishLoading");
       m tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoidOneRefs(null, tf, a.class, "2")) {
          a = tf.a;
          if (a != null) {
             a.c = null;
             a.f = SystemClock.elapsedRealtime();
          }
       }
       return;
    }
}
