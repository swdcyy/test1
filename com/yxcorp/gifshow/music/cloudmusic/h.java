package com.yxcorp.gifshow.music.cloudmusic.h;
import java.lang.Object;
import java.util.ArrayList;
import com.yxcorp.gifshow.music.cloudmusic.h$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.player.core.b;
import java.util.Iterator;
import androidx.fragment.app.Fragment;
import ekd.y0;
import java.lang.Long;
import wc6.d;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.framework.player.core.c;
import lob.r0;
import java.lang.Runnable;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.framework.player.core.a;
import lob.q0;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import lob.o0;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import lob.p0;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.android.model.music.Music;
import a46.b;
import lnc.x6;
import lnc.y6;
import pm6.m;
import java.lang.Integer;
import com.yxcorp.gifshow.music.utils.g;
import java.io.File;
import kqb.b0;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.music.cloudmusic.h$a;
import qkd.b;
import wkd.b;
import com.yxcorp.gifshow.music.utils.a;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.music.utils.a$a;

public class h	// class@00201a
{
    public b a;
    public final List b;
    public BaseFragment c;
    public y0 d;
    public long e;
    public long f;

    public void h(){
       super();
       this.b = new ArrayList();
    }
    public void a(h$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       this.b.add(p0);
       return;
    }
    public boolean b(){
       h obj = PatchProxy.apply(null, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       if (obj != null) {
          return obj.isPlaying();
       }
       return false;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, h.class, "14")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, h.class, "7")) {
          return;
       }
       h tc = this.c;
       if (tc != null && tc.isAdded()) {
          this.a.release();
          this.a = null;
          this.c();
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, h.class, "10")) {
          return;
       }
       h ta = this.a;
       if (ta != null) {
          ta.pause();
       }
       ta = this.d;
       if (ta != null) {
          ta.e();
       }
       return;
    }
    public void f(String p0,long p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, oh, "6")) {
          return;
       }
       oh = this.a;
       if (oh != null) {
          oh.release();
          this.a = null;
       }
       try{
          d uod = new d("MusicPlayController");
          uod.setBizFt(":ks-components:music:kwai-music-core").setNormalUrl(p0, 1);
          this.a = c.a(uod);
          y0 oy0 = new y0(1000, new r0(this));
          this.d = oy0;
          oy0.d();
          a.a(this.a.getIKwaiMediaPlayer());
          this.a.addOnPreparedListener(new q0(this, p1));
          this.a.addOnCompletionListener(new o0(this, p1));
          this.a.addOnErrorListener(new p0(this));
          this.a.prepareAsync();
          return;
       }catch(java.io.IOException e0){
       label_0074 :
          this.d();
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }catch(java.lang.SecurityException e0){
       }catch(java.lang.IllegalStateException e0){
       }
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, h.class, "11")) {
          return;
       }
       this.b.clear();
       h ta = this.a;
       if (ta != null) {
          ta.release();
          this.a = null;
       }
       ta = this.d;
       if (ta != null) {
          ta.e();
       }
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, h.class, "9")) {
          return;
       }
       h ta = this.a;
       if (ta != null) {
          ta.start();
       }
       ta = this.d;
       if (ta != null) {
          ta.d();
       }
       return;
    }
    public void i(BaseFragment p0){
       this.c = p0;
    }
    public void j(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "3")) {
          return;
       }
       b uob = y6.r(b.class);
       int i = (uob != null)? uob.xa(): m.b(0);
       this.k(p0, i, true);
       return;
    }
    public void k(Music p0,int p1,boolean p2){
       a uoa1;
       Music mSnippetUrls;
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, h.class, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, oh, "12")) {
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             iterator.next().onLoading();
          }
       }
       boolean b = g.c(p0, p1, 0);
       File uFile = (b)? b0.j(p0): b0.h(p0);
       long l = (b)? 0: g.a(p0);
       this.e = l;
       this.f = TimeUnit.SECONDS.toMillis((long)p0.mCopyrightTimeLimitInSecond);
       h$a uoa = new h$a(this, l);
       if (b.S(uFile)) {
          this.f(uFile.getPath(), l);
       }else {
          String str = "";
          if (p2) {
             uoa1 = b.a(-905856758);
             if (!b) {
                str = p0.mUrl;
             }
             mSnippetUrls = (b)? p0.mSnippetUrls: p0.mUrls;
             uoa1.d(p0, str, mSnippetUrls, uoa);
          }else {
             uoa1 = b.a(-905856758);
             if (!b) {
                str = p0.mUrl;
             }
             mSnippetUrls = (b)? p0.mSnippetUrls: p0.mUrls;
             uoa1.g(p0, str, mSnippetUrls, uoa);
          }
       }
       return;
    }
    public void l(Music p0,boolean p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oh, "4")) {
          return;
       }
       b uob = y6.r(b.class);
       int i = (uob != null)? uob.xa(): m.b(0);
       this.k(p0, i, p1);
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, h.class, "8")) {
          return;
       }
       h ta = this.a;
       if (ta != null) {
          ta.stop();
       }
       ta = this.d;
       if (ta != null) {
          ta.e();
       }
       this.c();
       return;
    }
}
