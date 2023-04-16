package com.kuaishou.android.live.doublelist.danmaku.b;
import android.view.ViewStub;
import java.lang.Object;
import java.lang.Long;
import brd.w;
import java.util.List;
import crd.b;
import java.lang.Throwable;
import com.kuaishou.android.live.doublelist.danmaku.LiveCommentBulletsResponse;
import android.os.SystemClock;
import java.lang.String;
import la6.a;
import java.util.Collection;
import ekd.q;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kuaishou.android.live.doublelist.danmaku.LiveSimpleDanmakuView;
import lnc.a1;
import com.kuaishou.android.live.doublelist.danmaku.b$b;
import op.j;
import op.a;
import com.kuaishou.android.live.doublelist.danmaku.LiveSimpleDanmakuView$b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.live.doublelist.danmaku.b$a;
import android.widget.FrameLayout;
import lnc.b9;
import t45.d;
import brd.z;
import op.f;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Iterator;
import com.kuaishou.android.live.doublelist.danmaku.LiveCommentBulletsResponse$Comment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.UserInfo;
import ekd.j;
import op.l;
import op.k;
import lnc.o5;
import op.c;
import cjd.e;
import erd.o;
import op.b;
import op.e;
import op.g;
import com.kuaishou.android.live.doublelist.danmaku.a;
import erd.r;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.concurrent.TimeUnit;
import op.h;
import java.lang.Float;
import op.i;
import op.d;

public class b	// class@0007cb
{
    public final ViewStub a;
    public LiveSimpleDanmakuView b;
    public b$b c;
    public QPhoto d;
    public boolean e;
    public boolean f;
    public int g;
    public b h;
    public float i;
    public long j;
    public int k;
    public String l;
    public long m;
    public boolean n;
    public int o;
    public boolean p;
    public b$a q;

    public void b(ViewStub p0){
       super();
       this.a = p0;
    }
    public static w a(b p0,Long p1){
       return p0.s(p1);
    }
    public static void b(b p0,List p1){
       p0.A(p1);
    }
    public static boolean c(List p0){
       return b.r(p0);
    }
    public static void d(b p0,b p1){
       p0.n(p1);
    }
    public static void e(b p0,Throwable p1){
       p0.u(p1);
    }
    public static w f(b p0,Long p1){
       return p0.t(p1);
    }
    public static void g(b p0,Throwable p1){
       p0.p(p1);
    }
    public static void h(b p0,LiveCommentBulletsResponse p1){
       p0.o(p1);
    }
    public static void i(b p0,int p1){
       p0.v(p1);
    }
    public static List j(b p0,LiveCommentBulletsResponse p1){
       return p0.q(p1);
    }
    private void n(b p0){
       this.m = SystemClock.elapsedRealtime();
    }
    private void o(LiveCommentBulletsResponse p0){
       this.n = false;
       this.j = p0.mMinRequestIntervalMillis;
       this.k = p0.mMaxContinuousRequestTimes;
       if (a.a(p0.getCursor())) {
          this.l = p0.getCursor();
       }
       if (!q.f(p0.mComments)) {
          this.o = 0;
       }else {
          this.z();
       }
       return;
    }
    private void p(Throwable p0){
       this.n = false;
    }
    private List q(LiveCommentBulletsResponse p0){
       return this.k(p0.mComments);
    }
    public static boolean r(List p0){
       return (q.f(p0) ^ 0x01);
    }
    private w s(Long p0){
       return this.l();
    }
    private w t(Long p0){
       return this.l();
    }
    private void u(Throwable p0){
       this.z();
    }
    public final void A(List p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       b = false;
       if (this.b == null) {
          LiveSimpleDanmakuView liveSimpleDa = this.a.inflate();
          this.b = liveSimpleDa;
          liveSimpleDa.setSpanSize(a1.e(12.00f));
          this.b.setAnimationDuration(2800);
          this.b.setEnableLoopPlay(b);
       }
       if (this.e != null) {
          this.e = b;
          this.p = true;
          b$b uob = new b$b(p0);
          this.c = uob;
          this.b.setAdapter(uob);
          this.b.setEnableAutoStop(b);
          this.b.setOnItemShowListener(new a(this));
          b tq = this.q;
          if (tq != null) {
             tq.a(this.d, p0.size());
          }
       }else {
          this.c.g(p0);
          if (!this.b.getChildCount() && this.p != null) {
             this.b.h();
          }
       }
       return;
    }
    public void B(float p0){
       this.i = p0;
    }
    public final void C(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b9.a(this.h);
       this.h = this.l().observeOn(d.a).subscribe(new f(this), e.b);
       return;
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       b9.a(this.h);
       b tb = this.b;
       if (tb != null) {
          tb.j();
       }
       this.x();
       return;
    }
    public final List k(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return Lists.b();
       }
       obj = Lists.b();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          LiveCommentBulletsResponse$Comment uComment = iterator.next();
          if (uComment != null && !TextUtils.x(uComment.mContent)) {
             LiveCommentBulletsResponse$Comment mUserInfo = uComment.mUserInfo;
             if (mUserInfo != null && !j.h(mUserInfo.mHeadUrls)) {
                obj.add(uComment);
             }
          }
       }
       return obj;
    }
    public final t l(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.n = true;
       return k.b().a(this.d.getLiveStreamId(), o5.c(this.d.getUserId()), 200, this.l, this.g).doOnSubscribe(new c(this)).map(new e()).doOnNext(new b(this)).doOnError(new e(this)).map(new g(this)).filter(a.b);
    }
    public void m(QPhoto p0,boolean p1,int p2,b$a p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), p3, this, b.class, "1")) {
          return;
       }
       this.d = p0;
       this.f = p1;
       this.g = p2;
       this.q = p3;
       this.x();
       return;
    }
    public final void v(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "5")) {
          return;
       }
       if (this.n != null || (this.o < (this.k - 1) && (this.c.d() - p0) <= 10)) {
          b9.a(this.h);
          this.n = true;
          this.h = t.timer(((this.m + this.j) - SystemClock.elapsedRealtime()), TimeUnit.MILLISECONDS).flatMap(new h(this)).observeOn(d.a).subscribe(new f(this), e.b);
       }
    label_0060 :
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       b tb = this.b;
       if (tb != null) {
          tb.g();
          this.p = false;
       }
       return;
    }
    public final void x(){
       this.e = true;
       this.p = false;
       this.o = 0;
       this.l = null;
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       if (this.f != null && Float.compare(this.i, 0x3fe38e39) <= 0) {
          if (this.e != null) {
             this.C();
             return;
          }else {
             b tb = this.b;
             if (tb != null) {
                this.p = true;
                tb.h();
             }
          }
       }
       return;
    }
    public final void z(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       b to = this.o;
       int i = 1;
       if (to >= (this.k - i)) {
          to = this.b;
          if (to != null) {
             to.setEnableAutoStop(i);
          }
          return;
       }else {
          this.o = to + i;
          b9.a(this.h);
          this.n = i;
          this.h = t.timer(((this.m + this.j) - SystemClock.elapsedRealtime()), TimeUnit.MILLISECONDS).flatMap(new i(this)).observeOn(d.a).subscribe(new f(this), new d(this));
          return;
       }
    }
}
