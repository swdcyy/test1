package b03.a;
import com.kwai.framework.cache.a$a;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.live.effect.resource.download.track.LiveEffectResCleanManager;
import java.lang.Integer;
import com.kuaishou.live.effect.resource.download.track.LiveEffectResCleanManager$cleanDiskUsage$1;
import msd.p;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import tz2.b;
import com.kuaishou.live.effect.resource.download.common.e;
import kotlin.jvm.internal.a;
import vz2.a;
import com.kuaishou.live.effect.resource.download.common.a;
import java.util.Objects;
import vz2.i;
import java.io.File;
import com.kuaishou.gifshow.files.a;
import java.lang.Number;
import b03.c;
import java.lang.Long;
import qkd.b;
import java.util.List;
import v56.f;
import java.lang.System;
import b03.b;

public final class a implements a$a	// class@0002e1
{

    public void a(){
       super();
    }
    public boolean a(boolean p0,boolean p1){
       File obj;
       int i;
       String obj1;
       i e;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "3";
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, str);
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = null;
       boolean b = true;
       if (p1) {
          i = this.l();
          LiveEffectResCleanManager liveEffectRe = LiveEffectResCleanManager.class;
          if (PatchProxy.isSupport(liveEffectRe)) {
             obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i), obj, liveEffectRe, "7");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }
          }
          liveEffectRe = LiveEffectResCleanManager.e;
          liveEffectRe.e(i, LiveEffectResCleanManager$cleanDiskUsage$1.INSTANCE);
          liveEffectRe.i();
          b.c0(LiveLogTag.LIVE_EFFECT_RESOURCE_CLEAN, "cleanDiskUsage", "type", Integer.valueOf(i));
       }else if(p0 && b.c.a()){
          e uoe = e.b();
          obj1 = "LiveEffectResourceLoader.getInstance\(\)";
          a.o(uoe, obj1);
          a uoa1 = uoe.he();
          String str1 = "LiveEffectResourceLoader¡­gicGiftDownloadController";
          a.o(uoa1, str1);
          uoa1 = uoa1.m();
          a.o(uoa1, "LiveEffectResourceLoader¡­oller.magicGiftLruCleaner");
          if (uoa1.a()) {
             uoe = e.b();
             a.o(uoe, obj1);
             uoa1 = uoe.he();
             a.o(uoa1, str1);
             uoa1 = uoa1.m();
             Objects.requireNonNull(uoa1);
             if (!PatchProxy.applyVoid(obj, uoa1, a.class, str)) {
                e = i.e;
                a.a(e.a());
                obj = PatchProxy.apply(obj, e, i.class, "5");
                if (obj != patchProxyRe) {
                }else {
                   obj = new File(e.b(), ".nomedia");
                }
                uoa1.b(obj);
             }
          }
       }
       b.Z(LiveLogTag.LIVE_EFFECT_RESOURCE_CLEAN, "customClean");
       return b;
    }
    public long b(boolean p0){
       File[] obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       long l = 0;
       if (LiveEffectResCleanManager.e.b().d != null) {
          l = LiveEffectResCleanManager.c(this.l());
       }
       obj = new File[]{i.e.a()};
       b.d0(LiveLogTag.LIVE_EFFECT_RESOURCE_CLEAN, "manualCleanableSize", "ret", Long.valueOf(l), "total", Long.valueOf(b.p0(obj)));
       return l;
    }
    public List c(boolean p0){
       return f.b(this, p0);
    }
    public long d(){
       File[] obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = new File[]{i.e.a()};
       long l = b.p0(obj);
       b.c0(LiveLogTag.LIVE_EFFECT_RESOURCE_CLEAN, "updateCacheSize", "ret", Long.valueOf(l));
       return l;
    }
    public long e(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       long l = LiveEffectResCleanManager.c(2);
       b.c0(LiveLogTag.LIVE_EFFECT_RESOURCE_CLEAN, "manualPreDownloadSize", "ret", Long.valueOf(l));
       return l;
    }
    public List f(boolean p0){
       return f.f(this, p0);
    }
    public void g(boolean p0){
       f.a(this, p0);
    }
    public void h(boolean p0){
       b a;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "6")) {
          return;
       }
       a = LiveEffectResCleanManager.a;
       long l = (p0)? System.currentTimeMillis(): 0;
       a.d = l;
       LiveEffectResCleanManager.e.i();
       b.c0(LiveLogTag.LIVE_EFFECT_RESOURCE_CLEAN, "setPreDownloadClearStatus", "status", Boolean.valueOf(p0));
       return;
    }
    public List i(boolean p0){
       return f.c(this, p0);
    }
    public int j(boolean p0){
       Object obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = -1;
       if (LiveEffectResCleanManager.e.b().a()) {
          obj = LiveEffectResCleanManager.d();
       }
       b.c0(LiveLogTag.LIVE_EFFECT_RESOURCE_CLEAN, "getPreDownloadClearStatus", "ret", Integer.valueOf(obj));
       return obj;
    }
    public List k(boolean p0){
       return f.i(this, p0);
    }
    public final int l(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 1;
       if (this.j(false) == i) {
          i = 3;
       }
       return i;
    }
    public String name(){
       return "giftResource";
    }
}
