package gz2.h$b;
import com.kuaishou.live.effect.engine.render.local.drawer.a$a;
import gz2.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import my2.a$a;
import ez2.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFaceTransDataMessage;
import java.lang.Integer;
import ly2.i$a;
import bz2.a;
import java.lang.StringBuilder;
import java.io.File;
import sz2.g;
import com.kuaishou.live.effect.resource.download.common.e;
import vz2.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.util.Objects;
import pz2.c;
import pz2.a;
import java.util.Map;
import dz2.c;
import java.lang.Long;
import cz2.d;
import ly2.i;
import hz2.c;
import java.lang.System;
import android.view.MotionEvent;

public class h$b implements a$a	// class@002bdc
{
    public final h a;

    public void h$b(h p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "6")) {
          return;
       }
       this.a.i();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "5")) {
          return;
       }
       if (this.a.e != null) {
          b.P(LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectLocalRenderer"), "onSurfaceDestroyed");
          this.a.e.destroy();
          this.a.e = null;
       }
       return;
    }
    public void c(String p0){
       a.c(this, p0);
    }
    public MagicEmoji$MagicFace d(){
       Object obj = PatchProxy.apply(null, this, h$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a.b == null) {
          this.a.k("getTargetMagicFace");
       }
       return this.a.b;
    }
    public void e(LiveFlvStream$LiveFaceTransDataMessage p0,boolean p1){
       a.b(this, p0, p1);
    }
    public void f(int p0,int p1,int p2,int p3){
       a.d(this, p0, p1, p2, p3);
    }
    public void g(int p0,int p1){
       h$b uob = h$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "3")) {
          return;
       }
       this.a.i();
       h e = this.a.e;
       if (e != null) {
          e.b(p0, p1);
          p0.g = true;
       }
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "2")) {
          return;
       }
       this.a.k("onMagicFaceInvalidated");
       return;
    }
    public void i(MagicEmoji$MagicFace p0,int p1,int p2){
       boolean b;
       h$b ta1;
       h d;
       h c;
       SimpleMagicFace mId;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(h$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, h$b.class, "1")) {
          return;
       }
       if (p0 == null) {
          this.a.k("onGLDraw, targetMagicFace is null");
          return;
       }else if(!a.b()){
          b.P(LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectLocalRenderer"), "[onGLDraw]effect plugin not load"+this.a.k);
          return;
       }else {
          h$b ta = this.a;
          if (ta.e == null) {
             ta.i();
          }
          ta = this.a;
          if (ta.g == null) {
             LiveLogTag lIVE_EFFECT = LiveLogTag.LIVE_EFFECT;
             lIVE_EFFECT.appendTag("LiveEffectLocalRenderer");
             b.T(lIVE_EFFECT, "onGLDraw !mHasSetupDrawerSize", "width", Integer.valueOf(p1), "height", Integer.valueOf(p2));
             this.g(p1, p2);
             return;
          }else {
             b = false;
             if (ta.h == null) {
                File uFile = g.d(p0);
                if (uFile == null || !e.b().he().a(p0)) {
                   b.S(LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectLocalRenderer"), "checkResourceMd5Valid failed", "targetMagicFaceId", p0.mId);
                   e.b().qn(p0);
                   this.a.k("onGLDraw, checkResourceMd5Valid failed");
                   _monitor_enter(this);
                   ta1 = this.a;
                   d = ta1.d;
                   if (d != null) {
                      c = ta1.c;
                      if (c != null) {
                         d.g(c, b, "RESOURCE_MD5_INVALID", ta1.l);
                         ta1.c = null;
                      }
                   }
                   _monitor_exit(this);
                   return;
                }else {
                   String absolutePath = uFile.getAbsolutePath();
                   LiveLogTag lIVE_EFFECT1 = LiveLogTag.LIVE_EFFECT;
                   lIVE_EFFECT1.appendTag("LiveEffectLocalRenderer");
                   b.S(lIVE_EFFECT1, "setupCurrentMagicFace", "dir", absolutePath);
                   this.a.j = b;
                   i$a uoa1 = new i$a();
                   Object obj = PatchProxy.applyOneRefs(absolutePath, uoa1, uoa, "4");
                   if (obj != patchProxyRe) {
                      uoa1 = obj;
                   }else {
                      a.p(absolutePath, "effectPath");
                      uoa1.a = absolutePath;
                   }
                   mId = p0.mId;
                   Objects.requireNonNull(uoa1);
                   obj = PatchProxy.applyOneRefs(mId, uoa1, uoa, "5");
                   if (obj != patchProxyRe) {
                      uoa1 = obj;
                   }else {
                      a.p(mId, "magicFaceId");
                      uoa1.b = mId;
                   }
                   h c1 = this.a.c;
                   c uoc = (c1 == null)? null: c1.u();
                   uoa1.c = uoc;
                   uoa1.d = 1;
                   c1 = this.a.c;
                   if (c1 != null) {
                      uoa1.e = c1.getTrackId();
                   }
                   c1 = this.a.m;
                   if (c1 != null) {
                      Map map = c1.a();
                      if (PatchProxy.applyOneRefs(map, uoa1, uoa, "6") != patchProxyRe) {
                      }else {
                         a.p(map, "renderContext");
                         uoa1.f = map;
                      }
                   }
                   lIVE_EFFECT1.appendTag("LiveEffectLocalRenderer");
                   b.T(lIVE_EFFECT1, "[LocalEffectLog-live-set]setupCurrentMagicFace", "trackId", Long.valueOf(uoa1.a()), "dir", absolutePath);
                   ta1 = this.a;
                   d = ta1.c;
                   if (d != null) {
                      ta1.d.a(d);
                   }
                   c1 = this.a.e;
                   i oi = PatchProxy.apply(null, uoa1, uoa, "7");
                   if (oi != patchProxyRe) {
                   }else {
                      oi = new i(uoa1);
                   }
                   c1.h(oi);
                   c1.h = true;
                   return;
                }
             }else if(!(ta.f % 100)){
                b.Z(LiveLogTag.LIVE_EFFECT, "LiveEffectLocalRenderer onDrawWithFBO");
             }
             h$b ta2 = this.a;
             ta2.f = ta2.f + 1;
             ta2.j();
             this.a.e.d(b, p1, p2);
             h$b ta3 = this.a;
             Objects.requireNonNull(ta3);
             if (!PatchProxy.applyVoidOneRefs(p0, ta3, h.class, "15")) {
                d = ta3.l;
                mId = p0.mId;
                Objects.requireNonNull(d);
                if (!PatchProxy.applyVoidOneRefs(mId, d, c.class, "4")) {
                   a.p(mId, "magicFaceId");
                   if (!(a.g(d.g, mId) ^ 1) && (d.h == null || d.e - (long)30 <= 0)) {
                      long l = System.currentTimeMillis() - d.c;
                      d.e = d.e + 1;
                      if (l - (long)16 > 0) {
                         d.f = d.f + 1;
                      }
                      d.d = d.d + l;
                   }
                }
             }
             return;
          }
       }
    }
    public void onTouch(MotionEvent p0){
       a.a(this, p0);
    }
}
