package com.gifshow.tuna.player.component.a;
import nj.a;
import nj.m;
import nj.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nj.g;
import com.gifshow.tuna.player.component.IVideoModel;
import nj.e;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.player.core.b;
import wc6.d;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.util.CacheKeyUtil;
import com.kwai.framework.player.core.c;
import com.kwai.feed.player.ui.KwaiXfPlayerView;
import android.app.Activity;
import nj.b;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.RelativeLayout$LayoutParams;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.feed.player.ui.KwaiXfControlPanel;
import java.util.Objects;
import java.util.Set;
import com.kwai.feed.player.ui.GestureView;
import nj.l;
import com.kwai.feed.player.ui.GestureView$f;
import ai7.e;

public class a extends a	// class@0015e7
{
    public b c;
    public boolean d;
    public y e;
    public IMediaPlayer$OnPreparedListener f;

    public void a(){
       super();
       this.e = new m(this);
       this.f = new n(this);
    }
    public void A(){
       b uob;
       g a;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       a ta = this.a;
       if (ta != null) {
          g c = ta.c;
          if (c != null && ta.b != null) {
             try{
                String uri = c.getUri();
                d obj = PatchProxy.applyOneRefs(uri, objArray, e.class, "1");
                if (obj != PatchProxyResult.class) {
                   uob = obj;
                }else {
                   obj = new d("Tuna");
                   int i = 1;
                   obj.setNormalUrl(uri, i);
                   obj.setBizFt(":ks-features:ft-x:tuna-poi-player");
                   obj.setCacheKey(CacheKeyUtil.getCacheKey(uri, i));
                   uob = c.a(obj);
                }
             label_0047 :
                this.c = uob;
                this.a.b.setPlayer(uob);
                a ta1 = this.a;
                g c1 = ta1.c;
                g b = ta1.b;
                if (!PatchProxy.applyVoidTwoRefs(c1, b, this, uoa, "7")) {
                   uoa = this.a;
                   if (uoa != null) {
                      a = uoa.a;
                      if (a != null) {
                         Activity activity = a.getActivity();
                         if (activity != null) {
                            float f = (float)n.j(activity);
                            float f1 = (float)n.k(activity);
                            float f2 = f / f1;
                            float f3 = (float)c1.getHeight() / (float)c1.getWidth();
                            ViewGroup$LayoutParams layoutParams = b.getLayoutParams();
                            if (layoutParams == null) {
                               layoutParams = new RelativeLayout$LayoutParams(-2, -2);
                            }
                            if (f2 - f3 > 0) {
                               layoutParams.height = (int)(f3 * f1);
                            }else if(f2 - f3 < 0){
                               layoutParams.width = (int)(f / f3);
                            }
                            b.setLayoutParams(layoutParams);
                         }
                      }
                   }
                }
                this.c.setDataSource(this.a.c.getUri());
                this.c.addOnPreparedListener(this.f);
                this.c.prepareAsync();
             }catch(java.io.IOException e0){
             }catch(java.lang.IllegalArgumentException e0){
             }catch(java.lang.SecurityException e0){
             }catch(java.lang.IllegalStateException e0){
             }
          }
       }
    }
    public void I(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       a tc = this.c;
       if (tc != null && tc.isPlaying()) {
          this.c.pause();
          this.d = true;
       }
       return;
    }
    public void a(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.a(p0);
       a ta = this.a;
       if (ta != null && ta.b != null) {
          KwaiXfControlPanel controlPanel = p0.b.getControlPanel();
          a te = this.e;
          Objects.requireNonNull(controlPanel);
          if (!PatchProxy.applyVoidOneRefs(te, controlPanel, KwaiXfControlPanel.class, "41")) {
             controlPanel.S.add(te);
          }
          GestureView touchHandleV = p0.b.getControlPanel().getTouchHandleView();
          if (touchHandleV != null) {
             touchHandleV.a(new l(this));
          }
       }
    label_0045 :
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       if (this.d != null) {
          a tc = this.c;
          if (tc != null && tc.isPaused()) {
             this.c.start();
             this.d = false;
          }
       }
       return;
    }
    public void m0(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a tc = this.c;
       if (tc != null) {
          tc.releaseAsync(null);
       }
       return;
    }
    public void onRelease(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a tc = this.c;
       if (tc != null) {
          tc.release();
          this.c.removeOnPreparedListener(this.f);
       }
       tc = this.a;
       if (tc != null) {
          g b = tc.b;
          if (b != null) {
             KwaiXfControlPanel controlPanel = b.getControlPanel();
             a te = this.e;
             Objects.requireNonNull(controlPanel);
             if (!PatchProxy.applyVoidOneRefs(te, controlPanel, KwaiXfControlPanel.class, "42")) {
                controlPanel.S.remove(te);
             }
          }
       }
       super.onRelease();
       return;
    }
}
