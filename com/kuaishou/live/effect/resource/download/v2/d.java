package com.kuaishou.live.effect.resource.download.v2.d;
import c03.b;
import com.kuaishou.live.effect.engine.log.LiveEffectLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.util.Map;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kuaishou.live.effect.resource.download.v2.d$a;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.effect.resource.download.v2.e;
import com.kuaishou.live.effect.resource.download.v2.g;
import com.kuaishou.live.effect.resource.download.v2.f;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.effect.resource.download.v2.a;
import wz2.a;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$a;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$Type;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$Status;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.kuaishou.live.effect.resource.download.common.LiveMagicGiftDownloadVersion;
import vz2.a0;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.Number;
import com.kuaishou.live.effect.resource.download.v2.a$a;
import java.lang.Throwable;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.effect.resource.download.v2.c;
import ok.h;

public class d implements b	// class@001b5d
{
    public final Map a;
    public final List b;
    public final IMagicGiftResourceLoader$a c;
    public static final List d;

    static {
       d.d = LiveEffectLogTag.LIVE_EFFECT_DOWNLOAD.appendTag("LiveMagicGiftDownloadManager");
    }
    public void d(Map p0){
       super();
       this.a = new ConcurrentHashMap();
       CopyOnWriteArrayList uCopyOnWrite = new CopyOnWriteArrayList();
       this.b = uCopyOnWrite;
       this.c = new d$a(this);
       b.P(d.d, "[LiveMagicGiftDownloadManager][init]blacklist:"+p0);
       uCopyOnWrite.add(new e());
       uCopyOnWrite.add(new g(p0));
       uCopyOnWrite.add(new f(p0));
    }
    public void a(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "5")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
    public void b(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "8")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       return;
    }
    public void c(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "6")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0);
       }
       return;
    }
    public boolean d(MagicEmoji$MagicFace p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a uoa = this.a.get(p0);
       boolean b = (uoa != null && !uoa.b())? true: false;
       return b;
    }
    public void e(MagicEmoji$MagicFace p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "1")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          IMagicGiftResourceLoader iMagicGiftRe = iterator.next();
          if (iMagicGiftRe.d(p0)) {
             iMagicGiftRe.e(p1, p0, this.c);
          }else {
             this.i(p0).c(iMagicGiftRe.getType(), IMagicGiftResourceLoader$Status.NO_NEED_DOWNLOAD);
          }
       }
       b.P(d.d, "[download]"+p0.mName+","+this.a.get(p0)+","+p1);
       this.h(p0, p1);
       return;
    }
    public LiveMagicGiftDownloadVersion f(){
       return LiveMagicGiftDownloadVersion.V2;
    }
    public boolean g(MagicEmoji$MagicFace p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return true;
          }
          if (obj.next().d(p0)) {
             break ;
          }
       }
       return false;
    }
    public void h(MagicEmoji$MagicFace p0,a p1){
       List d;
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "3")) {
          return;
       }
       a uoa1 = this.i(p0);
       d = d.d;
       b.P(d, "[checkDownloadCompleted]"+p0.mName+",status:"+uoa1);
       a0 uoa0 = p1.e();
       if (uoa0 == null) {
          b.P(d, "[checkDownloadCompleted]listener is null");
          return;
       }else if(!uoa1.b()){
          return;
       }else {
          _monitor_enter(uoa1);
          Object[] objArray = null;
          a$a obj = PatchProxy.apply(objArray, uoa1, uoa, "4");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
             _monitor_exit(uoa1);
          }else {
             Iterator iterator = uoa1.a.entrySet().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if (!IMagicGiftResourceLoader$Status.isDownloadSuccess(iterator.next().getValue())) {
                      b = false;
                      _monitor_exit(uoa1);
                   }
                }else {
                   b = true;
                   _monitor_exit(uoa1);
                }
             }
          }
          if (b) {
             uoa0.c(p0, p1);
          }else {
             _monitor_enter(uoa1);
             obj = PatchProxy.apply(objArray, uoa1, uoa, "6");
             if (obj != patchProxyRe) {
                b = obj.intValue();
                _monitor_exit(uoa1);
             }else {
                obj = uoa1.a();
                obj = (obj != null)? obj.a: 0x2711;
                _monitor_exit(uoa1);
             }
             _monitor_enter(uoa1);
             Object[] objArray1 = PatchProxy.apply(objArray, uoa1, uoa, "5");
             if (objArray1 != patchProxyRe) {
                _monitor_exit(uoa1);
             }else {
                a$a uoa2 = uoa1.a();
                if (uoa2 != null) {
                   objArray = uoa2.b;
                }
                _monitor_exit(uoa1);
                objArray1 = objArray;
             }
             uoa0.a(p0, p1, b, objArray1);
          }
          this.a.remove(p0);
          return;
       }
    }
    public a i(MagicEmoji$MagicFace p0){
       a obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.get(p0);
       if (obj == null) {
          obj = new a(m.s(this.b).F(c.b).w(IMagicGiftResourceLoader$Type.class));
          this.a.put(p0, obj);
       }
       return obj;
    }
}
