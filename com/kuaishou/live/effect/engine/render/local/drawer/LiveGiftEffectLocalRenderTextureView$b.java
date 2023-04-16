package com.kuaishou.live.effect.engine.render.local.drawer.LiveGiftEffectLocalRenderTextureView$b;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$o;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGiftEffectLocalRenderTextureView;
import java.lang.Object;
import javax.microedition.khronos.opengles.GL10;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import com.kuaishou.live.effect.engine.render.local.drawer.a;
import com.kuaishou.live.effect.engine.render.local.drawer.a$a;
import android.opengl.GLES20;
import java.lang.Integer;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import pkd.a;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGiftEffectLocalRenderTextureView$a;
import java.lang.System;
import pp.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Math;
import javax.microedition.khronos.egl.EGLConfig;

public class LiveGiftEffectLocalRenderTextureView$b implements LiveGLTextureView$o	// class@001b16
{
    public final LiveGiftEffectLocalRenderTextureView a;

    public void LiveGiftEffectLocalRenderTextureView$b(LiveGiftEffectLocalRenderTextureView p0){
       this.a = p0;
       super();
    }
    public void a(GL10 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftEffectLocalRenderTextureView$b.class, "3")) {
          return;
       }
       if (this.a.t != null) {
          b.Z(LiveLogTag.MAGIC_GIFT, "LiveGiftEffectLocalRenderTextureView.onSurfaceDestroyed");
          LiveGiftEffectLocalRenderTextureView t = this.a.t;
          Objects.requireNonNull(t);
          if (!PatchProxy.applyVoid(null, t, a.class, "4")) {
             a c = t.c;
             if (c != null) {
                c.b();
             }
          }
       }
       return;
    }
    public void onDrawFrame(GL10 p0){
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftEffectLocalRenderTextureView$b.class, str)) {
          return;
       }
       float f = 0;
       if (LiveGiftEffectLocalRenderTextureView.v) {
          GLES20.glClearColor(f, f, f, f);
       }
       int i = 0x4000;
       GLES20.glClear(i);
       LiveGiftEffectLocalRenderTextureView$b ta = this.a;
       LiveGiftEffectLocalRenderTextureView t = ta.t;
       LiveGiftEffectLocalRenderTextureView r = ta.r;
       LiveGiftEffectLocalRenderTextureView s = ta.s;
       Objects.requireNonNull(t);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(r), Integer.valueOf(s), t, a.class, str)) {
          a c = t.c;
          if (c != null) {
             MagicEmoji$MagicFace magicFace = c.d();
             if (magicFace != null) {
                t.c.i(magicFace, r, s);
                if (t.d != null) {
                   t.d = 0;
                }
             }else {
                t.c.h();
                if (t.d <= 120) {
                   GLES20.glBindFramebuffer(0x8d40, 0);
                   GLES20.glClearColor(f, f, f, f);
                   GLES20.glClear(i);
                   t.d = t.d + 1;
                }
             }
          }
       }
       if (a.a) {
          LiveGiftEffectLocalRenderTextureView u = this.a.u;
          Objects.requireNonNull(u);
          if (!PatchProxy.applyVoid(null, u, LiveGiftEffectLocalRenderTextureView$a.class, "1")) {
             long l = System.nanoTime();
             if (((float)(l - u.a) / 1000000000.00f) - 0x3f800000 >= 0) {
                u.a = l;
                Object[] objArray = new Object[0];
                a.C().s("fps", "live effect fps >> "+u.b, objArray);
                u.b = 0;
             }
             u.b = u.b + 1;
          }
       }
       return;
    }
    public void onSurfaceChanged(GL10 p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveGiftEffectLocalRenderTextureView$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveGiftEffectLocalRenderTextureView$b.class, "4")) {
          return;
       }
       GLES20.glViewport(0, 0, p1, p2);
       LiveGiftEffectLocalRenderTextureView$b ta = this.a;
       ta.r = p1;
       ta.s = p2;
       LiveGiftEffectLocalRenderTextureView t = ta.t;
       Objects.requireNonNull(t);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), Integer.valueOf(p2), t, uoa, "3")) {
          float f = (float)p1;
          float f1 = (float)p2;
          float f2 = Math.min((1280.00f / f), (1280.00f / f1));
          f = (int)(f * f2) & 0xfe;
          t.a = f;
          f1 = (int)(f1 * f2) & 0xfe;
          t.b = f1;
          a c = t.c;
          if (c != null) {
             c.g(f, f1);
          }
       }
       return;
    }
    public void onSurfaceCreated(GL10 p0,EGLConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftEffectLocalRenderTextureView$b.class, "1")) {
          return;
       }
       GLES20.glClearColor(0, 0, 0, 0);
       LiveGiftEffectLocalRenderTextureView t = this.a.t;
       Objects.requireNonNull(t);
       if (!PatchProxy.applyVoid(null, t, a.class, "1")) {
          a c = t.c;
          if (c != null) {
             c.a();
          }
       }
       return;
    }
}
