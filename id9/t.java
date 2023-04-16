package id9.t;
import ui9.b;
import in6.b;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import ekd.y0;
import id9.h;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.base.d;
import id9.l;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.kwai.framework.model.feed.BaseFeed;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;
import com.kuaishou.android.model.mix.FollowShootModel;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import ekd.a0;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.android.model.feed.VideoFeed;
import hd9.o;
import hd9.n;
import android.view.ViewGroup;
import pi9.j;
import android.view.View;
import com.kwai.library.widget.specific.lyrics.LyricsView;
import in6.a;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import java.lang.Boolean;
import vf9.y1;
import q16.a$a;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import com.kuaishou.android.model.music.MusicType;
import com.yxcorp.gifshow.model.Lyrics;
import vf9.f0;
import com.yxcorp.gifshow.camera.record.sidebar.a;
import id9.e;
import android.view.View$OnClickListener;
import pi9.k;
import lnc.a1;
import znc.a;
import id9.m;
import pi9.j$a;
import android.widget.TextView;
import android.widget.ImageView;
import id9.q;
import ekd.k1;
import id9.n;
import erd.g;
import crd.b;
import oc9.b0;
import oc9.a0;
import id9.i;
import android.content.Intent;
import mc9.a;
import id9.p;
import java.io.Serializable;
import ekd.j0;
import id9.f;
import t45.c;
import vf9.g0;
import id9.o;
import id9.j;

public class t extends d0 implements b, b	// class@0027fa
{
    public View o;
    public BaseFeed p;
    public Music q;
    public Lyrics r;
    public final y0 s;
    public j t;
    public boolean u;

    public void t(CameraPageType p0,b p1){
       super(p0, p1);
       this.s = new y0(100, new h(this));
       this.d.n(b.class, new l(this));
    }
    public static File i2(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, t.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || p0.a(PhotoMeta.class).mFollowShootModel == null) {
          return null;
       }
       if (q.f(p0.a(PhotoMeta.class).mFollowShootModel.mLrcUrls)) {
          return null;
       }
       return b.a(0x5f2ddeb4).get(a0.c(p0.a(PhotoMeta.class).mFollowShootModel.mLrcUrls.get(0).getUrl()));
    }
    public static Music k2(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, t.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return o.a(p0.a(VideoFeed.class));
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, t.class, "5")) {
          return;
       }
       if (this.r != null) {
          this.s.e();
       }
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, t.class, "4")) {
          return;
       }
       if (this.d.d(n.j).g == null) {
          return;
       }
       if (this.l2()) {
          this.s.d();
          ViewGroup viewGroup = this.t.a();
          int i = (this.o.isSelected())? 0: 8;
          viewGroup.setVisibility(i);
          this.t.b().setEnableHighlight(true);
       }
       return;
    }
    public int O0(){
       return a.c(this);
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, t.class, "3")) {
          return;
       }
       if (this.l2() && this.d.d(n.j).g != null) {
          ViewGroup viewGroup = this.t.a();
          int i = (this.o.isSelected())? 0: 8;
          viewGroup.setVisibility(i);
          this.t.b().h(0, false);
          this.t.b().setEnableHighlight(false);
       }
       return;
    }
    public int R(){
       return 0x7f0d0175;
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public int T(){
       return a.a(this);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(t.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, t.class, "10")) {
          return;
       }
       if (this.d.d(y1.c).b == null) {
          this.h2();
       }
       return;
    }
    public int Y0(){
       return 200;
    }
    public int a1(){
       return a.b(this);
    }
    public void de(a$a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, t.class, "11")) {
          return;
       }
       if (this.u == null) {
          if (this.r != null) {
             t tq = this.q;
             if (tq == null || (tq.mType == MusicType.LIP || this.d.d(n.j).h != null)) {
                p0.I(this.r);
             }
          }
       }else if(this.d.d(n.j).h == null && this.d.d(f0.k).g != null){
          p0.I(this.r);
       }
       return;
    }
    public final void g2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, t.class, "13")) {
          return;
       }
       View view = a.d(this.d);
       this.o = view;
       if (view != null) {
          view.setOnClickListener(new e(this));
       }
       LyricsView lyricsView = this.t.b();
       t tr = this.r;
       t to = this.o;
       if (!PatchProxy.applyVoidThreeRefs(lyricsView, tr, to, null, k.class, "1")) {
          if (!PatchProxy.applyVoidOneRefs(lyricsView, objArray, k.class, "2")) {
             lyricsView.setEnableKara(false);
             lyricsView.setMaxLine(4);
             lyricsView.setLayoutType(false);
             lyricsView.setLrcTextSize(a1.d(R.dimen.arg_RES_7f070f72));
             lyricsView.setTopPaddingLine(false);
             lyricsView.setHighlightSameTimeLine(true);
             lyricsView.setEnableGradient(false);
             lyricsView.setEnableFadingEdge(false);
             lyricsView.setEnableHighlight(true);
             lyricsView.setLrcPadding(a1.d(R.dimen.arg_RES_7f070c23));
          }
          lyricsView.setLyrics(a.a(tr));
          lyricsView.h(0, true);
          lyricsView.setVisibility(false);
          if (to != null) {
             to.setSelected(true);
             to.setEnabled(true);
             to.setVisibility(false);
          }
       }
       this.t.b().setHighlightSameTimeLine(true);
       this.t.b().setEnableHighlight(false);
       return;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       a.a(this, p0, p1);
    }
    public final void h2(){
       if (PatchProxy.applyVoid(null, this, t.class, "19")) {
          return;
       }
       if (this.l2()) {
          this.t.a().setVisibility(8);
          this.o.setVisibility(8);
       }
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "2")) {
          return;
       }
       super.k(p0);
       j oj = new j();
       this.t = oj;
       oj.h(p0);
       this.t.i(new m(this));
       if (this.q == null) {
          return;
       }
       t tr = this.r;
       if (tr != null && !q.f(tr.mLines)) {
          a.a(this.t.d(), this.t.e(), this.t.c(), this.q, true);
          k1.r(new q(this), 100);
       }
       this.d.l(f0.class, new n(this));
       return;
    }
    public final boolean l2(){
       Object obj = PatchProxy.apply(null, this, t.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.r != null && (this.t.a() != null && (this.t.b() != null && this.o != null)))? true: false;
       return b;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, t.class, "8")) {
          return;
       }
       super.onDestroy();
       if (this.r != null) {
          this.s.e();
       }
       k1.n(this);
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, t.class, "7")) {
          return;
       }
       super.onPause();
       if (this.t.b() != null) {
          this.t.b().h(0, false);
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, t.class, "6")) {
          return;
       }
       super.onResume();
       if (this.l2() && this.d.d(n.j).g != null) {
          ViewGroup viewGroup = this.t.a();
          int i = (this.o.isSelected())? 0: 8;
          viewGroup.setVisibility(i);
          this.t.b().h(0, false);
       }
       return;
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, t.class, "9")) {
          return;
       }
       a0.m(this);
       k1.s(new i(this), this, 0);
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       super.w1(p0);
       this.d.l(a.class, new p(this));
       BaseFeed uBaseFeed = j0.e(p0, "source_photo_origin_photo");
       this.p = uBaseFeed;
       if (uBaseFeed != null && t.k2(uBaseFeed) != null) {
          this.q = t.k2(this.p);
          c.a(new f(this));
          this.d.l(g0.class, new o(this));
          this.b2(new j(this, p0));
       }
       return;
    }
}
