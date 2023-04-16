package com.yxcorp.plugin.search.utils.SearchLiveDanmakuHelper;
import lnc.a1;
import android.view.ViewStub;
import android.view.View;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uy5.a;
import q87.c;
import android.view.ViewParent;
import com.yxcorp.plugin.search.widget.SearchDanmakuView;
import com.yxcorp.plugin.search.widget.SearchDanmakuView$d;
import crd.b;
import lnc.b9;
import com.yxcorp.plugin.search.result.danmu.SearchLiveCommentBulletsResponse$Comment;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.plugin.search.entity.result.SpecialDanmuku;
import nfd.t0;
import com.yxcorp.plugin.search.utils.SearchLiveDanmakuHelper$DanmakuStyle;
import com.yxcorp.plugin.search.utils.SearchLiveDanmakuHelper$b;
import ufd.i;
import com.yxcorp.plugin.search.utils.t;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.plugin.search.utils.SearchLiveDanmakuHelper$a;
import java.util.Collection;
import android.widget.FrameLayout;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import rdd.b;
import ok.x;
import lnc.o5;
import nfd.c2;
import erd.g;
import cjd.e;
import erd.o;
import nfd.d2;
import nfd.a2;
import nfd.y1;
import com.yxcorp.plugin.search.utils.u;
import erd.r;
import java.lang.Boolean;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import nfd.f2;
import t45.d;
import brd.z;
import nfd.z1;
import nfd.b2;

public class SearchLiveDanmakuHelper	// class@00078a
{
    public SearchDanmakuView a;
    public ViewStub b;
    public View c;
    public SearchLiveDanmakuHelper$b d;
    public QPhoto e;
    public boolean f;
    public boolean g;
    public b h;
    public long i;
    public int j;
    public String k;
    public long l;
    public boolean m;
    public int n;
    public boolean o;
    public boolean p;
    public SearchLiveDanmakuHelper$DanmakuStyle q;
    public SpecialDanmuku r;
    public SearchLiveDanmakuHelper$a s;
    public boolean t;
    public static final int u;
    public static final int v;
    public static final int w;

    static {
       SearchLiveDanmakuHelper.u = a1.e(5.00f);
       SearchLiveDanmakuHelper.v = a1.e(12.00f);
       SearchLiveDanmakuHelper.w = a1.e(213.00f);
    }
    public void SearchLiveDanmakuHelper(ViewStub p0,View p1){
       super();
       this.r = null;
       this.b = p0;
       this.c = p1;
    }
    public static void a(SearchLiveDanmakuHelper p0,List p1){
       SearchLiveDanmakuHelper b1;
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, SearchLiveDanmakuHelper.class, "5")) {
       }else {
          int i = 0;
          if (p0.t == null) {
             Object[] objArray = new Object[i];
             a.C().t("SearchLiveDanmakuHelper", "setDanmakuData failed cause mCanPlayDanmaku is false, check player state", objArray);
          }
          boolean b = true;
          if (p0.a == null) {
             b1 = p0.b;
             if (b1 != null && b1.getParent() != null) {
                p0.a = p0.b.inflate();
             }else {
                b1 = p0.b;
                if (b1 == null || b1.getParent() == null) {
                   SearchDanmakuView searchDanmak = p0.c.findViewById(R.id.search_danmu_view);
                   p0.a = searchDanmak;
                   SearchDanmakuView$d uod = null;
                   searchDanmak.setOnItemShowListener(uod);
                   b9.a(p0.h);
                   p0.c = uod;
                }
             }
             if (p0.r != null) {
                SearchLiveCommentBulletsResponse$Comment uComment = new SearchLiveCommentBulletsResponse$Comment();
                UserInfo userInfo = new UserInfo();
                SearchLiveDanmakuHelper r = p0.r;
                userInfo.mHeadUrls = r.mCDNUrls;
                uComment.mUserInfo = userInfo;
                uComment.mContent = r.mText;
                uComment.isRedBackground = b;
                p0.a.setSpecialDanmuku(uComment);
             }
             b1 = p0.a;
             int b2 = (p0.p != null)? t0.b: SearchLiveDanmakuHelper.v;
             b1.setSpan(b2);
             b1 = p0.a;
             long l = (p0.p != null)? 2000: 2800;
             b1.setAnimationDuration(l);
             p0.a.setDanmakuStyle(p0.q);
             p0.a.setLoopPlay(b);
          }
          if (p0.f != null) {
             p0.f = i;
             p0.o = b;
             SearchLiveDanmakuHelper$b uob = new SearchLiveDanmakuHelper$b(p0, p1);
             p0.d = uob;
             p0.a.setAdapter(uob);
             p0.a.setAutoStop(i);
             p0.a.setOnItemShowListener(new t(p0));
             b1 = p0.s;
             if (b1 != null) {
                b1.a(p0.e, p1.size());
             }
          }else {
             b1 = p0.d;
             Objects.requireNonNull(b1);
             if (!PatchProxy.applyVoidOneRefs(p1, b1, SearchLiveDanmakuHelper$b.class, "1")) {
                b1.b.addAll(p1);
             }
             if (!p0.a.getChildCount() && p0.o != null) {
                p0.a.e();
             }
          }
       }
    label_00fd :
       return;
    }
    public final t b(){
       Object obj = PatchProxy.apply(null, this, SearchLiveDanmakuHelper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.m = true;
       return b.a.get().a(this.e.getLiveStreamId(), o5.c(this.e.getUserId()), 200, this.k, 0).doOnSubscribe(new c2(this)).map(new e()).doOnNext(new d2(this)).doOnError(new a2(this)).map(new y1(this)).filter(u.b);
    }
    public void c(QPhoto p0,boolean p1,SearchLiveDanmakuHelper$DanmakuStyle p2){
       if (PatchProxy.isSupport(SearchLiveDanmakuHelper.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, SearchLiveDanmakuHelper.class, "2")) {
          return;
       }
       this.e = p0;
       this.g = p1;
       this.q = p2;
       boolean b = (p2 != SearchLiveDanmakuHelper$DanmakuStyle.HORIZONTAL_FRAME_MOVE)? true: false;
       this.p = b;
       this.e();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, SearchLiveDanmakuHelper.class, "10")) {
          return;
       }
       this.t = false;
       b9.a(this.h);
       SearchLiveDanmakuHelper ta = this.a;
       if (ta != null) {
          ta.d();
          this.o = false;
       }
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, SearchLiveDanmakuHelper.class, "3")) {
          return;
       }
       this.f = true;
       this.o = false;
       b9.a(this.h);
       this.n = 0;
       this.k = null;
       this.c = null;
       SearchLiveDanmakuHelper ta = this.a;
       if (ta != null) {
          ta.setOnItemShowListener(null);
       }
       this.a = null;
       this.t = false;
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, SearchLiveDanmakuHelper.class, "8")) {
          return;
       }
       SearchLiveDanmakuHelper tn = this.n;
       int i = 1;
       if (tn >= (this.j - i)) {
          tn = this.a;
          if (tn != null) {
             tn.setAutoStop(i);
          }
          return;
       }else {
          this.n = tn + i;
          b9.a(this.h);
          this.m = i;
          this.h = t.timer(((this.l + this.i) - SystemClock.elapsedRealtime()), TimeUnit.MILLISECONDS).flatMap(new f2(this)).observeOn(d.a).subscribe(new z1(this), new b2(this));
          return;
       }
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, SearchLiveDanmakuHelper.class, "12")) {
          return;
       }
       b9.a(this.h);
       SearchLiveDanmakuHelper ta = this.a;
       if (ta != null) {
          ta.g();
       }
       this.e();
       return;
    }
}
